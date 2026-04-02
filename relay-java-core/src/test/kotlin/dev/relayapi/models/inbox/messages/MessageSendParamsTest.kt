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
            .addAttachment(
                MessageSendParams.Attachment.builder()
                    .type("type")
                    .url("https://example.com")
                    .build()
            )
            .messageTag(MessageSendParams.MessageTag.HUMAN_AGENT)
            .addQuickReply(
                MessageSendParams.QuickReply.builder()
                    .contentType(MessageSendParams.QuickReply.ContentType.TEXT)
                    .imageUrl("https://example.com")
                    .payload("payload")
                    .title("title")
                    .build()
            )
            .replyTo("reply_to")
            .template(
                MessageSendParams.Template.builder()
                    .addElement(
                        MessageSendParams.Template.Element.builder()
                            .title("title")
                            .addButton(
                                MessageSendParams.Template.Element.Button.builder()
                                    .title("title")
                                    .type(MessageSendParams.Template.Element.Button.Type.WEB_URL)
                                    .payload("payload")
                                    .url("https://example.com")
                                    .build()
                            )
                            .imageUrl("https://example.com")
                            .subtitle("subtitle")
                            .build()
                    )
                    .type(MessageSendParams.Template.Type.GENERIC)
                    .build()
            )
            .text("x")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MessageSendParams.builder()
                .conversationId("conversation_id")
                .accountId("account_id")
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
                .addAttachment(
                    MessageSendParams.Attachment.builder()
                        .type("type")
                        .url("https://example.com")
                        .build()
                )
                .messageTag(MessageSendParams.MessageTag.HUMAN_AGENT)
                .addQuickReply(
                    MessageSendParams.QuickReply.builder()
                        .contentType(MessageSendParams.QuickReply.ContentType.TEXT)
                        .imageUrl("https://example.com")
                        .payload("payload")
                        .title("title")
                        .build()
                )
                .replyTo("reply_to")
                .template(
                    MessageSendParams.Template.builder()
                        .addElement(
                            MessageSendParams.Template.Element.builder()
                                .title("title")
                                .addButton(
                                    MessageSendParams.Template.Element.Button.builder()
                                        .title("title")
                                        .type(
                                            MessageSendParams.Template.Element.Button.Type.WEB_URL
                                        )
                                        .payload("payload")
                                        .url("https://example.com")
                                        .build()
                                )
                                .imageUrl("https://example.com")
                                .subtitle("subtitle")
                                .build()
                        )
                        .type(MessageSendParams.Template.Type.GENERIC)
                        .build()
                )
                .text("x")
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.attachments().getOrNull())
            .containsExactly(
                MessageSendParams.Attachment.builder()
                    .type("type")
                    .url("https://example.com")
                    .build()
            )
        assertThat(body.messageTag()).contains(MessageSendParams.MessageTag.HUMAN_AGENT)
        assertThat(body.quickReplies().getOrNull())
            .containsExactly(
                MessageSendParams.QuickReply.builder()
                    .contentType(MessageSendParams.QuickReply.ContentType.TEXT)
                    .imageUrl("https://example.com")
                    .payload("payload")
                    .title("title")
                    .build()
            )
        assertThat(body.replyTo()).contains("reply_to")
        assertThat(body.template())
            .contains(
                MessageSendParams.Template.builder()
                    .addElement(
                        MessageSendParams.Template.Element.builder()
                            .title("title")
                            .addButton(
                                MessageSendParams.Template.Element.Button.builder()
                                    .title("title")
                                    .type(MessageSendParams.Template.Element.Button.Type.WEB_URL)
                                    .payload("payload")
                                    .url("https://example.com")
                                    .build()
                            )
                            .imageUrl("https://example.com")
                            .subtitle("subtitle")
                            .build()
                    )
                    .type(MessageSendParams.Template.Type.GENERIC)
                    .build()
            )
        assertThat(body.text()).contains("x")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MessageSendParams.builder()
                .conversationId("conversation_id")
                .accountId("account_id")
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_id")
    }
}
