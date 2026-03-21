// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.accounts.redditflairs

import dev.relayapi.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RedditFlairRetrieveParamsTest {

    @Test
    fun create() {
        RedditFlairRetrieveParams.builder().id("id").subreddit("subreddit").build()
    }

    @Test
    fun pathParams() {
        val params = RedditFlairRetrieveParams.builder().id("id").subreddit("subreddit").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params = RedditFlairRetrieveParams.builder().id("id").subreddit("subreddit").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("subreddit", "subreddit").build())
    }
}
