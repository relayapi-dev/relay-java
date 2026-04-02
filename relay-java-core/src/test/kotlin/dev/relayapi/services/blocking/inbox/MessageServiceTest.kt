// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.inbox

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.models.inbox.messages.MessageEditParams
import dev.relayapi.models.inbox.messages.MessageListParams
import dev.relayapi.models.inbox.messages.MessageSendParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MessageServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val messageService = client.inbox().messages()

        val message = messageService.retrieve("conversation_id")

        message.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val messageService = client.inbox().messages()

        val messages =
            messageService.list(
                MessageListParams.builder()
                    .accountId("account_id")
                    .cursor("cursor")
                    .limit(1L)
                    .platform(MessageListParams.Platform.TWITTER)
                    .workspaceId("workspace_id")
                    .build()
            )

        messages.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun archive() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val messageService = client.inbox().messages()

        val response = messageService.archive("conversation_id")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun edit() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val messageService = client.inbox().messages()

        val response =
            messageService.edit(
                MessageEditParams.builder()
                    .conversationId("conversation_id")
                    .messageId("message_id")
                    .text("x")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun send() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val messageService = client.inbox().messages()

        val response =
            messageService.send(
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

        response.validate()
    }
}
