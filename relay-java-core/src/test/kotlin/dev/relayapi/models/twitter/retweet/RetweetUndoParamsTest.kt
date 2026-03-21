// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.twitter.retweet

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RetweetUndoParamsTest {

    @Test
    fun create() {
        RetweetUndoParams.builder().accountId("account_id").tweetId("tweet_id").build()
    }

    @Test
    fun body() {
        val params = RetweetUndoParams.builder().accountId("account_id").tweetId("tweet_id").build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.tweetId()).isEqualTo("tweet_id")
    }
}
