// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.analytics

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.models.analytics.youtube.YoutubeGetDailyViewsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class YoutubeServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getDailyViews() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val youtubeService = client.analytics().youtube()

        val response =
            youtubeService.getDailyViews(
                YoutubeGetDailyViewsParams.builder()
                    .accountId("account_id")
                    .fromDate("from_date")
                    .toDate("to_date")
                    .build()
            )

        response.validate()
    }
}
