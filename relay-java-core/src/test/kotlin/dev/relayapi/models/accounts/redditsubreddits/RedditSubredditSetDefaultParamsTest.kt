// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.accounts.redditsubreddits

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RedditSubredditSetDefaultParamsTest {

    @Test
    fun create() {
        RedditSubredditSetDefaultParams.builder().id("id").subreddit("subreddit").build()
    }

    @Test
    fun pathParams() {
        val params =
            RedditSubredditSetDefaultParams.builder().id("id").subreddit("subreddit").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            RedditSubredditSetDefaultParams.builder().id("id").subreddit("subreddit").build()

        val body = params._body()

        assertThat(body.subreddit()).isEqualTo("subreddit")
    }
}
