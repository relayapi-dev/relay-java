// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.accounts

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.models.accounts.redditflairs.RedditFlairRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RedditFlairServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val redditFlairServiceAsync = client.accounts().redditFlairs()

        val redditFlairFuture =
            redditFlairServiceAsync.retrieve(
                RedditFlairRetrieveParams.builder().id("id").subreddit("subreddit").build()
            )

        val redditFlair = redditFlairFuture.get()
        redditFlair.validate()
    }
}
