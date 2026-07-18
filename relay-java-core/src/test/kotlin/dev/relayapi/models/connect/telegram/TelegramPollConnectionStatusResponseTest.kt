// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.connect.telegram

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.JsonValue
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TelegramPollConnectionStatusResponseTest {

    @Test
    fun create() {
        val telegramPollConnectionStatusResponse =
            TelegramPollConnectionStatusResponse.builder()
                .status(TelegramPollConnectionStatusResponse.Status.PENDING)
                .account(
                    TelegramPollConnectionStatusResponse.Account.builder()
                        .id("id")
                        .avatarUrl("avatar_url")
                        .connectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .displayName("display_name")
                        .metadata(
                            TelegramPollConnectionStatusResponse.Account.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .platform(TelegramPollConnectionStatusResponse.Account.Platform.TWITTER)
                        .platformAccountId("platform_account_id")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .username("username")
                        .workspace(
                            TelegramPollConnectionStatusResponse.Account.Workspace.builder()
                                .id("id")
                                .name("name")
                                .build()
                        )
                        .build()
                )
                .chatId("chat_id")
                .chatTitle("chat_title")
                .chatType("chat_type")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(telegramPollConnectionStatusResponse.status())
            .isEqualTo(TelegramPollConnectionStatusResponse.Status.PENDING)
        assertThat(telegramPollConnectionStatusResponse.account())
            .contains(
                TelegramPollConnectionStatusResponse.Account.builder()
                    .id("id")
                    .avatarUrl("avatar_url")
                    .connectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .displayName("display_name")
                    .metadata(
                        TelegramPollConnectionStatusResponse.Account.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .platform(TelegramPollConnectionStatusResponse.Account.Platform.TWITTER)
                    .platformAccountId("platform_account_id")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .username("username")
                    .workspace(
                        TelegramPollConnectionStatusResponse.Account.Workspace.builder()
                            .id("id")
                            .name("name")
                            .build()
                    )
                    .build()
            )
        assertThat(telegramPollConnectionStatusResponse.chatId()).contains("chat_id")
        assertThat(telegramPollConnectionStatusResponse.chatTitle()).contains("chat_title")
        assertThat(telegramPollConnectionStatusResponse.chatType()).contains("chat_type")
        assertThat(telegramPollConnectionStatusResponse.expiresAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val telegramPollConnectionStatusResponse =
            TelegramPollConnectionStatusResponse.builder()
                .status(TelegramPollConnectionStatusResponse.Status.PENDING)
                .account(
                    TelegramPollConnectionStatusResponse.Account.builder()
                        .id("id")
                        .avatarUrl("avatar_url")
                        .connectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .displayName("display_name")
                        .metadata(
                            TelegramPollConnectionStatusResponse.Account.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .platform(TelegramPollConnectionStatusResponse.Account.Platform.TWITTER)
                        .platformAccountId("platform_account_id")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .username("username")
                        .workspace(
                            TelegramPollConnectionStatusResponse.Account.Workspace.builder()
                                .id("id")
                                .name("name")
                                .build()
                        )
                        .build()
                )
                .chatId("chat_id")
                .chatTitle("chat_title")
                .chatType("chat_type")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedTelegramPollConnectionStatusResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(telegramPollConnectionStatusResponse),
                jacksonTypeRef<TelegramPollConnectionStatusResponse>(),
            )

        assertThat(roundtrippedTelegramPollConnectionStatusResponse)
            .isEqualTo(telegramPollConnectionStatusResponse)
    }
}
