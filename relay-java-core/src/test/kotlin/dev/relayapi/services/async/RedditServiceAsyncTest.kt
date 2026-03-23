// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.models.reddit.RedditGetFeedParams
import dev.relayapi.models.reddit.RedditSearchParams
import java.time.OffsetDateTime
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
                    .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .limit(1L)
                    .sort(RedditGetFeedParams.Sort.HOT)
                    .time(RedditGetFeedParams.Time.HOUR)
                    .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                    .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .limit(1L)
                    .sort(RedditSearchParams.Sort.RELEVANCE)
                    .subreddit("subreddit")
                    .time(RedditSearchParams.Time.HOUR)
                    .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
