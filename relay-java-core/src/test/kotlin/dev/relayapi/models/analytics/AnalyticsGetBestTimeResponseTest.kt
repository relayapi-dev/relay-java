// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.analytics

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnalyticsGetBestTimeResponseTest {

    @Test
    fun create() {
        val analyticsGetBestTimeResponse =
            AnalyticsGetBestTimeResponse.builder()
                .addData(
                    AnalyticsGetBestTimeResponse.Data.builder()
                        .avgEngagement(0.0)
                        .dayOfWeek(0L)
                        .hourUtc(0L)
                        .postCount(0.0)
                        .build()
                )
                .build()

        assertThat(analyticsGetBestTimeResponse.data())
            .containsExactly(
                AnalyticsGetBestTimeResponse.Data.builder()
                    .avgEngagement(0.0)
                    .dayOfWeek(0L)
                    .hourUtc(0L)
                    .postCount(0.0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val analyticsGetBestTimeResponse =
            AnalyticsGetBestTimeResponse.builder()
                .addData(
                    AnalyticsGetBestTimeResponse.Data.builder()
                        .avgEngagement(0.0)
                        .dayOfWeek(0L)
                        .hourUtc(0L)
                        .postCount(0.0)
                        .build()
                )
                .build()

        val roundtrippedAnalyticsGetBestTimeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(analyticsGetBestTimeResponse),
                jacksonTypeRef<AnalyticsGetBestTimeResponse>(),
            )

        assertThat(roundtrippedAnalyticsGetBestTimeResponse).isEqualTo(analyticsGetBestTimeResponse)
    }
}
