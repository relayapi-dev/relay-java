// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.inbox.messages

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageEditParamsTest {

    @Test
    fun create() {
        MessageEditParams.builder()
            .conversationId("conversation_id")
            .messageId("message_id")
            .text("x")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MessageEditParams.builder()
                .conversationId("conversation_id")
                .messageId("message_id")
                .text("x")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("conversation_id")
        assertThat(params._pathParam(1)).isEqualTo("message_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            MessageEditParams.builder()
                .conversationId("conversation_id")
                .messageId("message_id")
                .text("x")
                .build()

        val body = params._body()

        assertThat(body.text()).isEqualTo("x")
    }
}
