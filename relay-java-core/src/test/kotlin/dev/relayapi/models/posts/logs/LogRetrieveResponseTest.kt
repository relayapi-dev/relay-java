// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.posts.logs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LogRetrieveResponseTest {

    @Test
    fun create() {
        val logRetrieveResponse =
            LogRetrieveResponse.builder()
                .addData(
                    LogRetrieveResponse.Data.builder()
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

        assertThat(logRetrieveResponse.data())
            .containsExactly(
                LogRetrieveResponse.Data.builder()
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
        assertThat(logRetrieveResponse.hasMore()).isEqualTo(true)
        assertThat(logRetrieveResponse.nextCursor()).contains("next_cursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val logRetrieveResponse =
            LogRetrieveResponse.builder()
                .addData(
                    LogRetrieveResponse.Data.builder()
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

        val roundtrippedLogRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(logRetrieveResponse),
                jacksonTypeRef<LogRetrieveResponse>(),
            )

        assertThat(roundtrippedLogRetrieveResponse).isEqualTo(logRetrieveResponse)
    }
}
