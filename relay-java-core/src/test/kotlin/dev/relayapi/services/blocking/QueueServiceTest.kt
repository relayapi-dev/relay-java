// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.models.queue.QueuePreviewParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class QueueServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getNextSlot() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val queueService = client.queue()

        val response = queueService.getNextSlot()

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun preview() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val queueService = client.queue()

        val response = queueService.preview(QueuePreviewParams.builder().count(1L).build())

        response.validate()
    }
}
