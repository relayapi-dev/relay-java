// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.inbox.comments

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.models.inbox.comments.like.LikeCreateParams
import dev.relayapi.models.inbox.comments.like.LikeDeleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class LikeServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val likeService = client.inbox().comments().like()

        val like =
            likeService.create(
                LikeCreateParams.builder().commentId("comment_id").accountId("account_id").build()
            )

        like.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val likeService = client.inbox().comments().like()

        val like =
            likeService.delete(
                LikeDeleteParams.builder().commentId("comment_id").accountId("account_id").build()
            )

        like.validate()
    }
}
