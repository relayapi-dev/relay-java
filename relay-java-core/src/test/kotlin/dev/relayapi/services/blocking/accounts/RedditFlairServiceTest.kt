// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.accounts

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.models.accounts.redditflairs.RedditFlairRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RedditFlairServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val redditFlairService = client.accounts().redditFlairs()

        val redditFlair =
            redditFlairService.retrieve(
                RedditFlairRetrieveParams.builder().id("id").subreddit("subreddit").build()
            )

        redditFlair.validate()
    }
}
