// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.inbox.messages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageRetrieveResponseTest {

    @Test
    fun create() {
        val messageRetrieveResponse =
            MessageRetrieveResponse.builder()
                .addData(
                    MessageRetrieveResponse.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .sender(MessageRetrieveResponse.Data.Sender.USER)
                        .text("text")
                        .addAttachment(
                            MessageRetrieveResponse.Data.Attachment.builder()
                                .type("type")
                                .url("url")
                                .build()
                        )
                        .build()
                )
                .hasMore(true)
                .nextCursor("next_cursor")
                .build()

        assertThat(messageRetrieveResponse.data())
            .containsExactly(
                MessageRetrieveResponse.Data.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .sender(MessageRetrieveResponse.Data.Sender.USER)
                    .text("text")
                    .addAttachment(
                        MessageRetrieveResponse.Data.Attachment.builder()
                            .type("type")
                            .url("url")
                            .build()
                    )
                    .build()
            )
        assertThat(messageRetrieveResponse.hasMore()).contains(true)
        assertThat(messageRetrieveResponse.nextCursor()).contains("next_cursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messageRetrieveResponse =
            MessageRetrieveResponse.builder()
                .addData(
                    MessageRetrieveResponse.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .sender(MessageRetrieveResponse.Data.Sender.USER)
                        .text("text")
                        .addAttachment(
                            MessageRetrieveResponse.Data.Attachment.builder()
                                .type("type")
                                .url("url")
                                .build()
                        )
                        .build()
                )
                .hasMore(true)
                .nextCursor("next_cursor")
                .build()

        val roundtrippedMessageRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageRetrieveResponse),
                jacksonTypeRef<MessageRetrieveResponse>(),
            )

        assertThat(roundtrippedMessageRetrieveResponse).isEqualTo(messageRetrieveResponse)
    }
}
