// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.inbox

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.models.inbox.messages.MessageEditParams
import dev.relayapi.models.inbox.messages.MessageListParams
import dev.relayapi.models.inbox.messages.MessageSendParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MessageServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageServiceAsync = client.inbox().messages()

        val messageFuture = messageServiceAsync.retrieve("conversation_id")

        val message = messageFuture.get()
        message.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageServiceAsync = client.inbox().messages()

        val messagesFuture =
            messageServiceAsync.list(
                MessageListParams.builder()
                    .accountId("account_id")
                    .cursor("cursor")
                    .limit(1L)
                    .platform(MessageListParams.Platform.TWITTER)
                    .workspaceId("workspace_id")
                    .build()
            )

        val messages = messagesFuture.get()
        messages.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun archive() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageServiceAsync = client.inbox().messages()

        val responseFuture = messageServiceAsync.archive("conversation_id")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun edit() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageServiceAsync = client.inbox().messages()

        val responseFuture =
            messageServiceAsync.edit(
                MessageEditParams.builder()
                    .conversationId("conversation_id")
                    .messageId("message_id")
                    .text("x")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun send() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageServiceAsync = client.inbox().messages()

        val responseFuture =
            messageServiceAsync.send(
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
                                                MessageSendParams.Template.Element.Button.Type
                                                    .WEB_URL
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
            )

        val response = responseFuture.get()
        response.validate()
    }
}
