// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.analytics

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnalyticsGetContentDecayResponseTest {

    @Test
    fun create() {
        val analyticsGetContentDecayResponse =
            AnalyticsGetContentDecayResponse.builder()
                .addData(
                    AnalyticsGetContentDecayResponse.Data.builder()
                        .cumulativeEngagement(0.0)
                        .cumulativeImpressions(0.0)
                        .day(0.0)
                        .engagement(0.0)
                        .impressions(0.0)
                        .build()
                )
                .halfLifeDays(0.0)
                .platform(AnalyticsGetContentDecayResponse.Platform.TWITTER)
                .postId("post_id")
                .build()

        assertThat(analyticsGetContentDecayResponse.data())
            .containsExactly(
                AnalyticsGetContentDecayResponse.Data.builder()
                    .cumulativeEngagement(0.0)
                    .cumulativeImpressions(0.0)
                    .day(0.0)
                    .engagement(0.0)
                    .impressions(0.0)
                    .build()
            )
        assertThat(analyticsGetContentDecayResponse.halfLifeDays()).contains(0.0)
        assertThat(analyticsGetContentDecayResponse.platform())
            .isEqualTo(AnalyticsGetContentDecayResponse.Platform.TWITTER)
        assertThat(analyticsGetContentDecayResponse.postId()).isEqualTo("post_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val analyticsGetContentDecayResponse =
            AnalyticsGetContentDecayResponse.builder()
                .addData(
                    AnalyticsGetContentDecayResponse.Data.builder()
                        .cumulativeEngagement(0.0)
                        .cumulativeImpressions(0.0)
                        .day(0.0)
                        .engagement(0.0)
                        .impressions(0.0)
                        .build()
                )
                .halfLifeDays(0.0)
                .platform(AnalyticsGetContentDecayResponse.Platform.TWITTER)
                .postId("post_id")
                .build()

        val roundtrippedAnalyticsGetContentDecayResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(analyticsGetContentDecayResponse),
                jacksonTypeRef<AnalyticsGetContentDecayResponse>(),
            )

        assertThat(roundtrippedAnalyticsGetContentDecayResponse)
            .isEqualTo(analyticsGetContentDecayResponse)
    }
}
