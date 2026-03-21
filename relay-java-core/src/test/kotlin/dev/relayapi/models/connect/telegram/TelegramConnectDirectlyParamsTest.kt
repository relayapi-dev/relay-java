// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.connect.telegram

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TelegramConnectDirectlyParamsTest {

    @Test
    fun create() {
        TelegramConnectDirectlyParams.builder().chatId("chat_id").build()
    }

    @Test
    fun body() {
        val params = TelegramConnectDirectlyParams.builder().chatId("chat_id").build()

        val body = params._body()

        assertThat(body.chatId()).isEqualTo("chat_id")
    }
}
