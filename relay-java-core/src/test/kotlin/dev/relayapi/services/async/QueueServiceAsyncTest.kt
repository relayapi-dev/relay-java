// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.models.queue.QueuePreviewParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class QueueServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getNextSlot() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val queueServiceAsync = client.queue()

        val responseFuture = queueServiceAsync.getNextSlot()

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun preview() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val queueServiceAsync = client.queue()

        val responseFuture =
            queueServiceAsync.preview(QueuePreviewParams.builder().count(1L).build())

        val response = responseFuture.get()
        response.validate()
    }
}
