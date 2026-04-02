// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.accounts.health

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HealthListResponseTest {

    @Test
    fun create() {
        val healthListResponse =
            HealthListResponse.builder()
                .addData(
                    HealthListResponse.Data.builder()
                        .id("id")
                        .healthy(true)
                        .platform(HealthListResponse.Data.Platform.TWITTER)
                        .tokenExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .username("username")
                        .error(
                            HealthListResponse.Data.Error.builder()
                                .code("code")
                                .message("message")
                                .build()
                        )
                        .build()
                )
                .hasMore(true)
                .nextCursor("next_cursor")
                .build()

        assertThat(healthListResponse.data())
            .containsExactly(
                HealthListResponse.Data.builder()
                    .id("id")
                    .healthy(true)
                    .platform(HealthListResponse.Data.Platform.TWITTER)
                    .tokenExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .username("username")
                    .error(
                        HealthListResponse.Data.Error.builder()
                            .code("code")
                            .message("message")
                            .build()
                    )
                    .build()
            )
        assertThat(healthListResponse.hasMore()).isEqualTo(true)
        assertThat(healthListResponse.nextCursor()).contains("next_cursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val healthListResponse =
            HealthListResponse.builder()
                .addData(
                    HealthListResponse.Data.builder()
                        .id("id")
                        .healthy(true)
                        .platform(HealthListResponse.Data.Platform.TWITTER)
                        .tokenExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .username("username")
                        .error(
                            HealthListResponse.Data.Error.builder()
                                .code("code")
                                .message("message")
                                .build()
                        )
                        .build()
                )
                .hasMore(true)
                .nextCursor("next_cursor")
                .build()

        val roundtrippedHealthListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(healthListResponse),
                jacksonTypeRef<HealthListResponse>(),
            )

        assertThat(roundtrippedHealthListResponse).isEqualTo(healthListResponse)
    }
}
