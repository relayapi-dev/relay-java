// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.accounts

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.models.accounts.redditsubreddits.RedditSubredditSetDefaultParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RedditSubredditServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val redditSubredditServiceAsync = client.accounts().redditSubreddits()

        val redditSubredditFuture = redditSubredditServiceAsync.retrieve("id")

        val redditSubreddit = redditSubredditFuture.get()
        redditSubreddit.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun setDefault() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val redditSubredditServiceAsync = client.accounts().redditSubreddits()

        val responseFuture =
            redditSubredditServiceAsync.setDefault(
                RedditSubredditSetDefaultParams.builder().id("id").subreddit("subreddit").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
