// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.inbox.comments

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommentReplyParamsTest {

    @Test
    fun create() {
        CommentReplyParams.builder()
            .postId("post_id")
            .accountId("account_id")
            .text("x")
            .commentId("comment_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CommentReplyParams.builder().postId("post_id").accountId("account_id").text("x").build()

        assertThat(params._pathParam(0)).isEqualTo("post_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CommentReplyParams.builder()
                .postId("post_id")
                .accountId("account_id")
                .text("x")
                .commentId("comment_id")
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.text()).isEqualTo("x")
        assertThat(body.commentId()).contains("comment_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CommentReplyParams.builder().postId("post_id").accountId("account_id").text("x").build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.text()).isEqualTo("x")
    }
}
