// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.models.reddit.RedditGetFeedParams
import dev.relayapi.models.reddit.RedditSearchParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RedditServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getFeed() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val redditService = client.reddit()

        val response =
            redditService.getFeed(
                RedditGetFeedParams.builder()
                    .accountId("account_id")
                    .subreddit("subreddit")
                    .cursor("cursor")
                    .limit(1L)
                    .sort(RedditGetFeedParams.Sort.HOT)
                    .time(RedditGetFeedParams.Time.HOUR)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun search() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val redditService = client.reddit()

        val response =
            redditService.search(
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

        response.validate()
    }
}
