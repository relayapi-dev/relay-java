// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.posts.logs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LogListResponseTest {

    @Test
    fun create() {
        val logListResponse =
            LogListResponse.builder()
                .addData(
                    LogListResponse.Data.builder()
                        .id("id")
                        .error("error")
                        .platform("platform")
                        .platformPostId("platform_post_id")
                        .platformUrl("platform_url")
                        .postId("post_id")
                        .publishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .socialAccountId("social_account_id")
                        .status("status")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .hasMore(true)
                .nextCursor("next_cursor")
                .build()

        assertThat(logListResponse.data())
            .containsExactly(
                LogListResponse.Data.builder()
                    .id("id")
                    .error("error")
                    .platform("platform")
                    .platformPostId("platform_post_id")
                    .platformUrl("platform_url")
                    .postId("post_id")
                    .publishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .socialAccountId("social_account_id")
                    .status("status")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(logListResponse.hasMore()).isEqualTo(true)
        assertThat(logListResponse.nextCursor()).contains("next_cursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val logListResponse =
            LogListResponse.builder()
                .addData(
                    LogListResponse.Data.builder()
                        .id("id")
                        .error("error")
                        .platform("platform")
                        .platformPostId("platform_post_id")
                        .platformUrl("platform_url")
                        .postId("post_id")
                        .publishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .socialAccountId("social_account_id")
                        .status("status")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .hasMore(true)
                .nextCursor("next_cursor")
                .build()

        val roundtrippedLogListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(logListResponse),
                jacksonTypeRef<LogListResponse>(),
            )

        assertThat(roundtrippedLogListResponse).isEqualTo(logListResponse)
    }
}
