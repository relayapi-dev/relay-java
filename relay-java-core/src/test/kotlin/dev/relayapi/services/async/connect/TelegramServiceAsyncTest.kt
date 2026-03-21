// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.connect

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.models.connect.telegram.TelegramConnectDirectlyParams
import dev.relayapi.models.connect.telegram.TelegramPollConnectionStatusParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TelegramServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun connectDirectly() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val telegramServiceAsync = client.connect().telegram()

        val responseFuture =
            telegramServiceAsync.connectDirectly(
                TelegramConnectDirectlyParams.builder().chatId("chat_id").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun initiateConnection() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val telegramServiceAsync = client.connect().telegram()

        val responseFuture = telegramServiceAsync.initiateConnection()

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun pollConnectionStatus() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val telegramServiceAsync = client.connect().telegram()

        val responseFuture =
            telegramServiceAsync.pollConnectionStatus(
                TelegramPollConnectionStatusParams.builder().code("code").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
