// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.connect.telegram

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.JsonValue
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TelegramConnectDirectlyResponseTest {

    @Test
    fun create() {
        val telegramConnectDirectlyResponse =
            TelegramConnectDirectlyResponse.builder()
                .account(
                    TelegramConnectDirectlyResponse.Account.builder()
                        .id("id")
                        .avatarUrl("avatar_url")
                        .connectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .displayName("display_name")
                        .metadata(
                            TelegramConnectDirectlyResponse.Account.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .platform(TelegramConnectDirectlyResponse.Account.Platform.TWITTER)
                        .platformAccountId("platform_account_id")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .username("username")
                        .workspace(
                            TelegramConnectDirectlyResponse.Account.Workspace.builder()
                                .id("id")
                                .name("name")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(telegramConnectDirectlyResponse.account())
            .isEqualTo(
                TelegramConnectDirectlyResponse.Account.builder()
                    .id("id")
                    .avatarUrl("avatar_url")
                    .connectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .displayName("display_name")
                    .metadata(
                        TelegramConnectDirectlyResponse.Account.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .platform(TelegramConnectDirectlyResponse.Account.Platform.TWITTER)
                    .platformAccountId("platform_account_id")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .username("username")
                    .workspace(
                        TelegramConnectDirectlyResponse.Account.Workspace.builder()
                            .id("id")
                            .name("name")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val telegramConnectDirectlyResponse =
            TelegramConnectDirectlyResponse.builder()
                .account(
                    TelegramConnectDirectlyResponse.Account.builder()
                        .id("id")
                        .avatarUrl("avatar_url")
                        .connectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .displayName("display_name")
                        .metadata(
                            TelegramConnectDirectlyResponse.Account.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .platform(TelegramConnectDirectlyResponse.Account.Platform.TWITTER)
                        .platformAccountId("platform_account_id")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .username("username")
                        .workspace(
                            TelegramConnectDirectlyResponse.Account.Workspace.builder()
                                .id("id")
                                .name("name")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedTelegramConnectDirectlyResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(telegramConnectDirectlyResponse),
                jacksonTypeRef<TelegramConnectDirectlyResponse>(),
            )

        assertThat(roundtrippedTelegramConnectDirectlyResponse)
            .isEqualTo(telegramConnectDirectlyResponse)
    }
}
