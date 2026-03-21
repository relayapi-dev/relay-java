// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.inbox.comments

import dev.relayapi.client.okhttp.RelayOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class LikeServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val likeService = client.inbox().comments().like()

        val like = likeService.create("comment_id")

        like.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val likeService = client.inbox().comments().like()

        val like = likeService.delete("comment_id")

        like.validate()
    }
}
