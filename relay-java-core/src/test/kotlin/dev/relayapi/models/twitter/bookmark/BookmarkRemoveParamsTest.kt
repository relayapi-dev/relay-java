// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.twitter.bookmark

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BookmarkRemoveParamsTest {

    @Test
    fun create() {
        BookmarkRemoveParams.builder().accountId("account_id").tweetId("tweet_id").build()
    }

    @Test
    fun body() {
        val params =
            BookmarkRemoveParams.builder().accountId("account_id").tweetId("tweet_id").build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.tweetId()).isEqualTo("tweet_id")
    }
}
