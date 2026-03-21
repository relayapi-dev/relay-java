// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.inbox

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.models.inbox.reviews.ReviewListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ReviewServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val reviewServiceAsync = client.inbox().reviews()

        val reviewsFuture =
            reviewServiceAsync.list(
                ReviewListParams.builder()
                    .accountId("account_id")
                    .cursor("cursor")
                    .limit(1L)
                    .maxRating(1L)
                    .minRating(1L)
                    .platform(ReviewListParams.Platform.TWITTER)
                    .build()
            )

        val reviews = reviewsFuture.get()
        reviews.validate()
    }
}
