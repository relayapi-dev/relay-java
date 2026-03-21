// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.inbox

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.models.inbox.reviews.ReviewListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ReviewServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val reviewService = client.inbox().reviews()

        val reviews =
            reviewService.list(
                ReviewListParams.builder()
                    .accountId("account_id")
                    .cursor("cursor")
                    .limit(1L)
                    .maxRating(1L)
                    .minRating(1L)
                    .platform(ReviewListParams.Platform.TWITTER)
                    .build()
            )

        reviews.validate()
    }
}
