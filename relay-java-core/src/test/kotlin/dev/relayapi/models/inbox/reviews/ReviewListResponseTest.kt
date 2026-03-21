// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.inbox.reviews

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReviewListResponseTest {

    @Test
    fun create() {
        val reviewListResponse =
            ReviewListResponse.builder()
                .addData(
                    ReviewListResponse.Data.builder()
                        .id("id")
                        .authorName("author_name")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .platform(ReviewListResponse.Data.Platform.TWITTER)
                        .rating(1.0)
                        .reply("reply")
                        .text("text")
                        .build()
                )
                .hasMore(true)
                .nextCursor("next_cursor")
                .build()

        assertThat(reviewListResponse.data())
            .containsExactly(
                ReviewListResponse.Data.builder()
                    .id("id")
                    .authorName("author_name")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .platform(ReviewListResponse.Data.Platform.TWITTER)
                    .rating(1.0)
                    .reply("reply")
                    .text("text")
                    .build()
            )
        assertThat(reviewListResponse.hasMore()).isEqualTo(true)
        assertThat(reviewListResponse.nextCursor()).contains("next_cursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reviewListResponse =
            ReviewListResponse.builder()
                .addData(
                    ReviewListResponse.Data.builder()
                        .id("id")
                        .authorName("author_name")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .platform(ReviewListResponse.Data.Platform.TWITTER)
                        .rating(1.0)
                        .reply("reply")
                        .text("text")
                        .build()
                )
                .hasMore(true)
                .nextCursor("next_cursor")
                .build()

        val roundtrippedReviewListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reviewListResponse),
                jacksonTypeRef<ReviewListResponse>(),
            )

        assertThat(roundtrippedReviewListResponse).isEqualTo(reviewListResponse)
    }
}
