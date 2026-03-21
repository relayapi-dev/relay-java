// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.analytics

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnalyticsGetPostingFrequencyResponseTest {

    @Test
    fun create() {
        val analyticsGetPostingFrequencyResponse =
            AnalyticsGetPostingFrequencyResponse.builder()
                .addData(
                    AnalyticsGetPostingFrequencyResponse.Data.builder()
                        .avgEngagement(0.0)
                        .avgImpressions(0.0)
                        .postsPerWeek(0.0)
                        .sampleWeeks(0.0)
                        .build()
                )
                .optimalFrequency(0.0)
                .build()

        assertThat(analyticsGetPostingFrequencyResponse.data())
            .containsExactly(
                AnalyticsGetPostingFrequencyResponse.Data.builder()
                    .avgEngagement(0.0)
                    .avgImpressions(0.0)
                    .postsPerWeek(0.0)
                    .sampleWeeks(0.0)
                    .build()
            )
        assertThat(analyticsGetPostingFrequencyResponse.optimalFrequency()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val analyticsGetPostingFrequencyResponse =
            AnalyticsGetPostingFrequencyResponse.builder()
                .addData(
                    AnalyticsGetPostingFrequencyResponse.Data.builder()
                        .avgEngagement(0.0)
                        .avgImpressions(0.0)
                        .postsPerWeek(0.0)
                        .sampleWeeks(0.0)
                        .build()
                )
                .optimalFrequency(0.0)
                .build()

        val roundtrippedAnalyticsGetPostingFrequencyResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(analyticsGetPostingFrequencyResponse),
                jacksonTypeRef<AnalyticsGetPostingFrequencyResponse>(),
            )

        assertThat(roundtrippedAnalyticsGetPostingFrequencyResponse)
            .isEqualTo(analyticsGetPostingFrequencyResponse)
    }
}
