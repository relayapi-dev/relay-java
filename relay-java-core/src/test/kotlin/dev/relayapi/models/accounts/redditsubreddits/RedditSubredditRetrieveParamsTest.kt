// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.accounts.redditsubreddits

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RedditSubredditRetrieveParamsTest {

    @Test
    fun create() {
        RedditSubredditRetrieveParams.builder().id("id").build()
    }

    @Test
    fun pathParams() {
        val params = RedditSubredditRetrieveParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
