// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.inbox.reviews.reply

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReplyCreateParamsTest {

    @Test
    fun create() {
        ReplyCreateParams.builder().reviewId("review_id").accountId("account_id").text("x").build()
    }

    @Test
    fun pathParams() {
        val params =
            ReplyCreateParams.builder()
                .reviewId("review_id")
                .accountId("account_id")
                .text("x")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("review_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ReplyCreateParams.builder()
                .reviewId("review_id")
                .accountId("account_id")
                .text("x")
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.text()).isEqualTo("x")
    }
}
