// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.inbox

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.models.inbox.comments.CommentListParams
import dev.relayapi.models.inbox.comments.CommentPrivateReplyParams
import dev.relayapi.models.inbox.comments.CommentReplyParams
import dev.relayapi.models.inbox.comments.CommentRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CommentServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val commentService = client.inbox().comments()

        val comment =
            commentService.retrieve(
                CommentRetrieveParams.builder()
                    .postId("post_id")
                    .accountId("account_id")
                    .cursor("cursor")
                    .limit(1L)
                    .platform(CommentRetrieveParams.Platform.TWITTER)
                    .build()
            )

        comment.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val commentService = client.inbox().comments()

        val comments =
            commentService.list(
                CommentListParams.builder()
                    .accountId("account_id")
                    .cursor("cursor")
                    .limit(1L)
                    .platform(CommentListParams.Platform.TWITTER)
                    .build()
            )

        comments.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val commentService = client.inbox().comments()

        val comment = commentService.delete("comment_id")

        comment.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun privateReply() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val commentService = client.inbox().comments()

        val response =
            commentService.privateReply(
                CommentPrivateReplyParams.builder()
                    .commentId("comment_id")
                    .accountId("account_id")
                    .text("x")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun reply() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val commentService = client.inbox().comments()

        val response =
            commentService.reply(
                CommentReplyParams.builder()
                    .postId("post_id")
                    .accountId("account_id")
                    .text("x")
                    .commentId("comment_id")
                    .build()
            )

        response.validate()
    }
}
