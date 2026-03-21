// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.inbox.messages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageSendResponseTest {

    @Test
    fun create() {
        val messageSendResponse =
            MessageSendResponse.builder().success(true).messageId("message_id").build()

        assertThat(messageSendResponse.success()).isEqualTo(true)
        assertThat(messageSendResponse.messageId()).contains("message_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messageSendResponse =
            MessageSendResponse.builder().success(true).messageId("message_id").build()

        val roundtrippedMessageSendResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageSendResponse),
                jacksonTypeRef<MessageSendResponse>(),
            )

        assertThat(roundtrippedMessageSendResponse).isEqualTo(messageSendResponse)
    }
}
