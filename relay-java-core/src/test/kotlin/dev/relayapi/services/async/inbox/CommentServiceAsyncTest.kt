// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.inbox

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.models.inbox.comments.CommentListParams
import dev.relayapi.models.inbox.comments.CommentPrivateReplyParams
import dev.relayapi.models.inbox.comments.CommentReplyParams
import dev.relayapi.models.inbox.comments.CommentRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CommentServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val commentServiceAsync = client.inbox().comments()

        val commentFuture =
            commentServiceAsync.retrieve(
                CommentRetrieveParams.builder()
                    .postId("post_id")
                    .accountId("account_id")
                    .cursor("cursor")
                    .limit(1L)
                    .platform(CommentRetrieveParams.Platform.TWITTER)
                    .build()
            )

        val comment = commentFuture.get()
        comment.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val commentServiceAsync = client.inbox().comments()

        val commentsFuture =
            commentServiceAsync.list(
                CommentListParams.builder()
                    .accountId("account_id")
                    .cursor("cursor")
                    .limit(1L)
                    .platform(CommentListParams.Platform.TWITTER)
                    .build()
            )

        val comments = commentsFuture.get()
        comments.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val commentServiceAsync = client.inbox().comments()

        val commentFuture = commentServiceAsync.delete("comment_id")

        val comment = commentFuture.get()
        comment.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun privateReply() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val commentServiceAsync = client.inbox().comments()

        val responseFuture =
            commentServiceAsync.privateReply(
                CommentPrivateReplyParams.builder()
                    .commentId("comment_id")
                    .accountId("account_id")
                    .text("x")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun reply() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val commentServiceAsync = client.inbox().comments()

        val responseFuture =
            commentServiceAsync.reply(
                CommentReplyParams.builder()
                    .postId("post_id")
                    .accountId("account_id")
                    .text("x")
                    .commentId("comment_id")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
