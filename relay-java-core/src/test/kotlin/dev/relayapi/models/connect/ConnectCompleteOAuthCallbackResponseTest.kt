// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.connect

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.JsonValue
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConnectCompleteOAuthCallbackResponseTest {

    @Test
    fun create() {
        val connectCompleteOAuthCallbackResponse =
            ConnectCompleteOAuthCallbackResponse.builder()
                .account(
                    ConnectCompleteOAuthCallbackResponse.Account.builder()
                        .id("id")
                        .avatarUrl("avatar_url")
                        .connectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .displayName("display_name")
                        .group(
                            ConnectCompleteOAuthCallbackResponse.Account.Group.builder()
                                .id("id")
                                .name("name")
                                .build()
                        )
                        .metadata(
                            ConnectCompleteOAuthCallbackResponse.Account.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .platform(ConnectCompleteOAuthCallbackResponse.Account.Platform.TWITTER)
                        .platformAccountId("platform_account_id")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .username("username")
                        .build()
                )
                .build()

        assertThat(connectCompleteOAuthCallbackResponse.account())
            .isEqualTo(
                ConnectCompleteOAuthCallbackResponse.Account.builder()
                    .id("id")
                    .avatarUrl("avatar_url")
                    .connectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .displayName("display_name")
                    .group(
                        ConnectCompleteOAuthCallbackResponse.Account.Group.builder()
                            .id("id")
                            .name("name")
                            .build()
                    )
                    .metadata(
                        ConnectCompleteOAuthCallbackResponse.Account.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .platform(ConnectCompleteOAuthCallbackResponse.Account.Platform.TWITTER)
                    .platformAccountId("platform_account_id")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .username("username")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val connectCompleteOAuthCallbackResponse =
            ConnectCompleteOAuthCallbackResponse.builder()
                .account(
                    ConnectCompleteOAuthCallbackResponse.Account.builder()
                        .id("id")
                        .avatarUrl("avatar_url")
                        .connectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .displayName("display_name")
                        .group(
                            ConnectCompleteOAuthCallbackResponse.Account.Group.builder()
                                .id("id")
                                .name("name")
                                .build()
                        )
                        .metadata(
                            ConnectCompleteOAuthCallbackResponse.Account.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .platform(ConnectCompleteOAuthCallbackResponse.Account.Platform.TWITTER)
                        .platformAccountId("platform_account_id")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .username("username")
                        .build()
                )
                .build()

        val roundtrippedConnectCompleteOAuthCallbackResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(connectCompleteOAuthCallbackResponse),
                jacksonTypeRef<ConnectCompleteOAuthCallbackResponse>(),
            )

        assertThat(roundtrippedConnectCompleteOAuthCallbackResponse)
            .isEqualTo(connectCompleteOAuthCallbackResponse)
    }
}
