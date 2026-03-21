// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.inbox.messages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageListResponseTest {

    @Test
    fun create() {
        val messageListResponse =
            MessageListResponse.builder()
                .addData(
                    MessageListResponse.Data.builder()
                        .id("id")
                        .accountId("account_id")
                        .participantName("participant_name")
                        .platform(MessageListResponse.Data.Platform.TWITTER)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastMessage("last_message")
                        .participantAvatar("participant_avatar")
                        .unreadCount(0.0)
                        .build()
                )
                .hasMore(true)
                .nextCursor("next_cursor")
                .build()

        assertThat(messageListResponse.data())
            .containsExactly(
                MessageListResponse.Data.builder()
                    .id("id")
                    .accountId("account_id")
                    .participantName("participant_name")
                    .platform(MessageListResponse.Data.Platform.TWITTER)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lastMessage("last_message")
                    .participantAvatar("participant_avatar")
                    .unreadCount(0.0)
                    .build()
            )
        assertThat(messageListResponse.hasMore()).isEqualTo(true)
        assertThat(messageListResponse.nextCursor()).contains("next_cursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messageListResponse =
            MessageListResponse.builder()
                .addData(
                    MessageListResponse.Data.builder()
                        .id("id")
                        .accountId("account_id")
                        .participantName("participant_name")
                        .platform(MessageListResponse.Data.Platform.TWITTER)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastMessage("last_message")
                        .participantAvatar("participant_avatar")
                        .unreadCount(0.0)
                        .build()
                )
                .hasMore(true)
                .nextCursor("next_cursor")
                .build()

        val roundtrippedMessageListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageListResponse),
                jacksonTypeRef<MessageListResponse>(),
            )

        assertThat(roundtrippedMessageListResponse).isEqualTo(messageListResponse)
    }
}
