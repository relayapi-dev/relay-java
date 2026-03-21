// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.models.analytics.AnalyticsGetBestTimeParams
import dev.relayapi.models.analytics.AnalyticsGetContentDecayParams
import dev.relayapi.models.analytics.AnalyticsGetPostTimelineParams
import dev.relayapi.models.analytics.AnalyticsGetPostingFrequencyParams
import dev.relayapi.models.analytics.AnalyticsListDailyMetricsParams
import dev.relayapi.models.analytics.AnalyticsRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AnalyticsServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val analyticsServiceAsync = client.analytics()

        val analyticsFuture =
            analyticsServiceAsync.retrieve(
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

        val analytics = analyticsFuture.get()
        analytics.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getBestTime() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val analyticsServiceAsync = client.analytics()

        val responseFuture =
            analyticsServiceAsync.getBestTime(
                AnalyticsGetBestTimeParams.builder()
                    .accountId("account_id")
                    .fromDate("from_date")
                    .platform(AnalyticsGetBestTimeParams.Platform.TWITTER)
                    .toDate("to_date")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getContentDecay() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val analyticsServiceAsync = client.analytics()

        val responseFuture =
            analyticsServiceAsync.getContentDecay(
                AnalyticsGetContentDecayParams.builder().postId("post_id").days(1L).build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getPostTimeline() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val analyticsServiceAsync = client.analytics()

        val responseFuture =
            analyticsServiceAsync.getPostTimeline(
                AnalyticsGetPostTimelineParams.builder()
                    .postId("post_id")
                    .fromDate("from_date")
                    .toDate("to_date")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getPostingFrequency() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val analyticsServiceAsync = client.analytics()

        val responseFuture =
            analyticsServiceAsync.getPostingFrequency(
                AnalyticsGetPostingFrequencyParams.builder()
                    .accountId("account_id")
                    .fromDate("from_date")
                    .platform(AnalyticsGetPostingFrequencyParams.Platform.TWITTER)
                    .toDate("to_date")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listDailyMetrics() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val analyticsServiceAsync = client.analytics()

        val responseFuture =
            analyticsServiceAsync.listDailyMetrics(
                AnalyticsListDailyMetricsParams.builder()
                    .accountId("account_id")
                    .fromDate("from_date")
                    .platform(AnalyticsListDailyMetricsParams.Platform.TWITTER)
                    .toDate("to_date")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
