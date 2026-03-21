// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.twitter

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.models.twitter.retweet.RetweetCreateParams
import dev.relayapi.models.twitter.retweet.RetweetUndoParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RetweetServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val retweetServiceAsync = client.twitter().retweet()

        val retweetFuture =
            retweetServiceAsync.create(
                RetweetCreateParams.builder().accountId("account_id").tweetId("tweet_id").build()
            )

        val retweet = retweetFuture.get()
        retweet.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun undo() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val retweetServiceAsync = client.twitter().retweet()

        val responseFuture =
            retweetServiceAsync.undo(
                RetweetUndoParams.builder().accountId("account_id").tweetId("tweet_id").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
