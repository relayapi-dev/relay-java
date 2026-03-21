// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.inbox.messages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageArchiveResponseTest {

    @Test
    fun create() {
        val messageArchiveResponse =
            MessageArchiveResponse.builder().success(true).messageId("message_id").build()

        assertThat(messageArchiveResponse.success()).isEqualTo(true)
        assertThat(messageArchiveResponse.messageId()).contains("message_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messageArchiveResponse =
            MessageArchiveResponse.builder().success(true).messageId("message_id").build()

        val roundtrippedMessageArchiveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageArchiveResponse),
                jacksonTypeRef<MessageArchiveResponse>(),
            )

        assertThat(roundtrippedMessageArchiveResponse).isEqualTo(messageArchiveResponse)
    }
}
