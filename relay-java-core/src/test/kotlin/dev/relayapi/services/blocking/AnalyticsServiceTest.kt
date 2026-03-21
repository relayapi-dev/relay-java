// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.models.analytics.AnalyticsGetBestTimeParams
import dev.relayapi.models.analytics.AnalyticsGetContentDecayParams
import dev.relayapi.models.analytics.AnalyticsGetPostTimelineParams
import dev.relayapi.models.analytics.AnalyticsGetPostingFrequencyParams
import dev.relayapi.models.analytics.AnalyticsListDailyMetricsParams
import dev.relayapi.models.analytics.AnalyticsRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AnalyticsServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val analyticsService = client.analytics()

        val analytics =
            analyticsService.retrieve(
                AnalyticsRetrieveParams.builder()
                    .accountId("account_id")
                    .fromDate("from_date")
                    .limit(1L)
                    .offset(0L)
                    .platform(AnalyticsRetrieveParams.Platform.TWITTER)
                    .postId("post_id")
                    .toDate("to_date")
                    .build()
            )

        analytics.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getBestTime() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val analyticsService = client.analytics()

        val response =
            analyticsService.getBestTime(
                AnalyticsGetBestTimeParams.builder()
                    .accountId("account_id")
                    .fromDate("from_date")
                    .platform(AnalyticsGetBestTimeParams.Platform.TWITTER)
                    .toDate("to_date")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getContentDecay() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val analyticsService = client.analytics()

        val response =
            analyticsService.getContentDecay(
                AnalyticsGetContentDecayParams.builder().postId("post_id").days(1L).build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getPostTimeline() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val analyticsService = client.analytics()

        val response =
            analyticsService.getPostTimeline(
                AnalyticsGetPostTimelineParams.builder()
                    .postId("post_id")
                    .fromDate("from_date")
                    .toDate("to_date")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getPostingFrequency() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val analyticsService = client.analytics()

        val response =
            analyticsService.getPostingFrequency(
                AnalyticsGetPostingFrequencyParams.builder()
                    .accountId("account_id")
                    .fromDate("from_date")
                    .platform(AnalyticsGetPostingFrequencyParams.Platform.TWITTER)
                    .toDate("to_date")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listDailyMetrics() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val analyticsService = client.analytics()

        val response =
            analyticsService.listDailyMetrics(
                AnalyticsListDailyMetricsParams.builder()
                    .accountId("account_id")
                    .fromDate("from_date")
                    .platform(AnalyticsListDailyMetricsParams.Platform.TWITTER)
                    .toDate("to_date")
                    .build()
            )

        response.validate()
    }
}
