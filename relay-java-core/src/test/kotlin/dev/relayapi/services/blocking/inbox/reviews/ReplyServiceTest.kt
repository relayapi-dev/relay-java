// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.inbox.reviews

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.models.inbox.reviews.reply.ReplyCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ReplyServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val replyService = client.inbox().reviews().reply()

        val reply =
            replyService.create(
                ReplyCreateParams.builder()
                    .reviewId("review_id")
                    .accountId("account_id")
                    .text("x")
                    .build()
            )

        reply.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val replyService = client.inbox().reviews().reply()

        val reply = replyService.delete("review_id")

        reply.validate()
    }
}
