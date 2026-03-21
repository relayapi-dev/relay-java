// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.inbox.messages

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageSendParamsTest {

    @Test
    fun create() {
        MessageSendParams.builder()
            .conversationId("conversation_id")
            .accountId("account_id")
            .text("x")
            .addAttachment(
                MessageSendParams.Attachment.builder()
                    .type("type")
                    .url("https://example.com")
                    .build()
            )
            .messageTag("message_tag")
            .replyTo("reply_to")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MessageSendParams.builder()
                .conversationId("conversation_id")
                .accountId("account_id")
                .text("x")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("conversation_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            MessageSendParams.builder()
                .conversationId("conversation_id")
                .accountId("account_id")
                .text("x")
                .addAttachment(
                    MessageSendParams.Attachment.builder()
                        .type("type")
                        .url("https://example.com")
                        .build()
                )
                .messageTag("message_tag")
                .replyTo("reply_to")
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.text()).isEqualTo("x")
        assertThat(body.attachments().getOrNull())
            .containsExactly(
                MessageSendParams.Attachment.builder()
                    .type("type")
                    .url("https://example.com")
                    .build()
            )
        assertThat(body.messageTag()).contains("message_tag")
        assertThat(body.replyTo()).contains("reply_to")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MessageSendParams.builder()
                .conversationId("conversation_id")
                .accountId("account_id")
                .text("x")
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.text()).isEqualTo("x")
    }
}
