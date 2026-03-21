// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.analytics

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.models.analytics.youtube.YoutubeGetDailyViewsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class YoutubeServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getDailyViews() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val youtubeServiceAsync = client.analytics().youtube()

        val responseFuture =
            youtubeServiceAsync.getDailyViews(
                YoutubeGetDailyViewsParams.builder()
                    .accountId("account_id")
                    .fromDate("from_date")
                    .toDate("to_date")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
