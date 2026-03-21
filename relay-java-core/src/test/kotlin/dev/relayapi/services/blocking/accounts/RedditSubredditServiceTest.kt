// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.accounts

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.models.accounts.redditsubreddits.RedditSubredditSetDefaultParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RedditSubredditServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val redditSubredditService = client.accounts().redditSubreddits()

        val redditSubreddit = redditSubredditService.retrieve("id")

        redditSubreddit.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun setDefault() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val redditSubredditService = client.accounts().redditSubreddits()

        val response =
            redditSubredditService.setDefault(
                RedditSubredditSetDefaultParams.builder().id("id").subreddit("subreddit").build()
            )

        response.validate()
    }
}
