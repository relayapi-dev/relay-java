// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.inbox.comments

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class LikeServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val likeServiceAsync = client.inbox().comments().like()

        val likeFuture = likeServiceAsync.create("comment_id")

        val like = likeFuture.get()
        like.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val likeServiceAsync = client.inbox().comments().like()

        val likeFuture = likeServiceAsync.delete("comment_id")

        val like = likeFuture.get()
        like.validate()
    }
}
