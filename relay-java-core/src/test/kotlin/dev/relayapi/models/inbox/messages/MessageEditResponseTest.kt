// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.inbox.messages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageEditResponseTest {

    @Test
    fun create() {
        val messageEditResponse =
            MessageEditResponse.builder()
                .success(true)
                .error("error")
                .messageId("message_id")
                .build()

        assertThat(messageEditResponse.success()).isEqualTo(true)
        assertThat(messageEditResponse.error()).contains("error")
        assertThat(messageEditResponse.messageId()).contains("message_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messageEditResponse =
            MessageEditResponse.builder()
                .success(true)
                .error("error")
                .messageId("message_id")
                .build()

        val roundtrippedMessageEditResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageEditResponse),
                jacksonTypeRef<MessageEditResponse>(),
            )

        assertThat(roundtrippedMessageEditResponse).isEqualTo(messageEditResponse)
    }
}
