// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.twitter

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.models.twitter.retweet.RetweetCreateParams
import dev.relayapi.models.twitter.retweet.RetweetUndoParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RetweetServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val retweetService = client.twitter().retweet()

        val retweet =
            retweetService.create(
                RetweetCreateParams.builder().accountId("account_id").tweetId("tweet_id").build()
            )

        retweet.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun undo() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val retweetService = client.twitter().retweet()

        val response =
            retweetService.undo(
                RetweetUndoParams.builder().accountId("account_id").tweetId("tweet_id").build()
            )

        response.validate()
    }
}
