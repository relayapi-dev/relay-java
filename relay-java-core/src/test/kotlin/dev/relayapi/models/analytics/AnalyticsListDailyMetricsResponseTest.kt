// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.analytics

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.JsonValue
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnalyticsListDailyMetricsResponseTest {

    @Test
    fun create() {
        val analyticsListDailyMetricsResponse =
            AnalyticsListDailyMetricsResponse.builder()
                .addData(
                    AnalyticsListDailyMetricsResponse.Data.builder()
                        .clicks(0.0)
                        .comments(0.0)
                        .date("date")
                        .impressions(0.0)
                        .likes(0.0)
                        .platforms(
                            AnalyticsListDailyMetricsResponse.Data.Platforms.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .postCount(0.0)
                        .shares(0.0)
                        .views(0.0)
                        .build()
                )
                .build()

        assertThat(analyticsListDailyMetricsResponse.data())
            .containsExactly(
                AnalyticsListDailyMetricsResponse.Data.builder()
                    .clicks(0.0)
                    .comments(0.0)
                    .date("date")
                    .impressions(0.0)
                    .likes(0.0)
                    .platforms(
                        AnalyticsListDailyMetricsResponse.Data.Platforms.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .postCount(0.0)
                    .shares(0.0)
                    .views(0.0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val analyticsListDailyMetricsResponse =
            AnalyticsListDailyMetricsResponse.builder()
                .addData(
                    AnalyticsListDailyMetricsResponse.Data.builder()
                        .clicks(0.0)
                        .comments(0.0)
                        .date("date")
                        .impressions(0.0)
                        .likes(0.0)
                        .platforms(
                            AnalyticsListDailyMetricsResponse.Data.Platforms.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .postCount(0.0)
                        .shares(0.0)
                        .views(0.0)
                        .build()
                )
                .build()

        val roundtrippedAnalyticsListDailyMetricsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(analyticsListDailyMetricsResponse),
                jacksonTypeRef<AnalyticsListDailyMetricsResponse>(),
            )

        assertThat(roundtrippedAnalyticsListDailyMetricsResponse)
            .isEqualTo(analyticsListDailyMetricsResponse)
    }
}
