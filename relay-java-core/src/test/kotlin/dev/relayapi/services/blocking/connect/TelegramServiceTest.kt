// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.connect

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.models.connect.telegram.TelegramConnectDirectlyParams
import dev.relayapi.models.connect.telegram.TelegramPollConnectionStatusParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TelegramServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun connectDirectly() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val telegramService = client.connect().telegram()

        val response =
            telegramService.connectDirectly(
                TelegramConnectDirectlyParams.builder().chatId("chat_id").build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun initiateConnection() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val telegramService = client.connect().telegram()

        val response = telegramService.initiateConnection()

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun pollConnectionStatus() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val telegramService = client.connect().telegram()

        val response =
            telegramService.pollConnectionStatus(
                TelegramPollConnectionStatusParams.builder().code("code").build()
            )

        response.validate()
    }
}
