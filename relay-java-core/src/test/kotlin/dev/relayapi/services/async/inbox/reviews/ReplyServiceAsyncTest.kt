// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.inbox.reviews

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.models.inbox.reviews.reply.ReplyCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ReplyServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val replyServiceAsync = client.inbox().reviews().reply()

        val replyFuture =
            replyServiceAsync.create(
                ReplyCreateParams.builder()
                    .reviewId("review_id")
                    .accountId("account_id")
                    .text("x")
                    .build()
            )

        val reply = replyFuture.get()
        reply.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val replyServiceAsync = client.inbox().reviews().reply()

        val replyFuture = replyServiceAsync.delete("review_id")

        val reply = replyFuture.get()
        reply.validate()
    }
}
