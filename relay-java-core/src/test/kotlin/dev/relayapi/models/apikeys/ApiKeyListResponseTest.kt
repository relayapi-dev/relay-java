// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.apikeys

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiKeyListResponseTest {

    @Test
    fun create() {
        val apiKeyListResponse =
            ApiKeyListResponse.builder()
                .addData(
                    ApiKeyListResponse.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .enabled(true)
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .prefix("prefix")
                        .start("start")
                        .build()
                )
                .hasMore(true)
                .nextCursor("next_cursor")
                .build()

        assertThat(apiKeyListResponse.data())
            .containsExactly(
                ApiKeyListResponse.Data.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .enabled(true)
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("name")
                    .prefix("prefix")
                    .start("start")
                    .build()
            )
        assertThat(apiKeyListResponse.hasMore()).isEqualTo(true)
        assertThat(apiKeyListResponse.nextCursor()).contains("next_cursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiKeyListResponse =
            ApiKeyListResponse.builder()
                .addData(
                    ApiKeyListResponse.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .enabled(true)
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .prefix("prefix")
                        .start("start")
                        .build()
                )
                .hasMore(true)
                .nextCursor("next_cursor")
                .build()

        val roundtrippedApiKeyListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiKeyListResponse),
                jacksonTypeRef<ApiKeyListResponse>(),
            )

        assertThat(roundtrippedApiKeyListResponse).isEqualTo(apiKeyListResponse)
    }
}
