// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.models.reddit.RedditGetFeedParams
import dev.relayapi.models.reddit.RedditSearchParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RedditServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getFeed() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val redditServiceAsync = client.reddit()

        val responseFuture =
            redditServiceAsync.getFeed(
                RedditGetFeedParams.builder()
                    .accountId("account_id")
                    .subreddit("subreddit")
                    .cursor("cursor")
                    .limit(1L)
                    .sort(RedditGetFeedParams.Sort.HOT)
                    .time(RedditGetFeedParams.Time.HOUR)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun search() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val redditServiceAsync = client.reddit()

        val responseFuture =
            redditServiceAsync.search(
                RedditSearchParams.builder()
                    .accountId("account_id")
                    .query("query")
                    .cursor("cursor")
                    .limit(1L)
                    .sort(RedditSearchParams.Sort.RELEVANCE)
                    .subreddit("subreddit")
                    .time(RedditSearchParams.Time.HOUR)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
