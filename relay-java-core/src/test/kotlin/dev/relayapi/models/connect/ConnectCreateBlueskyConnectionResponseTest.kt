// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.connect

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.JsonValue
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConnectCreateBlueskyConnectionResponseTest {

    @Test
    fun create() {
        val connectCreateBlueskyConnectionResponse =
            ConnectCreateBlueskyConnectionResponse.builder()
                .account(
                    ConnectCreateBlueskyConnectionResponse.Account.builder()
                        .id("id")
                        .avatarUrl("avatar_url")
                        .connectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .displayName("display_name")
                        .group(
                            ConnectCreateBlueskyConnectionResponse.Account.Group.builder()
                                .id("id")
                                .name("name")
                                .build()
                        )
                        .metadata(
                            ConnectCreateBlueskyConnectionResponse.Account.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .platform(ConnectCreateBlueskyConnectionResponse.Account.Platform.TWITTER)
                        .platformAccountId("platform_account_id")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .username("username")
                        .build()
                )
                .build()

        assertThat(connectCreateBlueskyConnectionResponse.account())
            .isEqualTo(
                ConnectCreateBlueskyConnectionResponse.Account.builder()
                    .id("id")
                    .avatarUrl("avatar_url")
                    .connectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .displayName("display_name")
                    .group(
                        ConnectCreateBlueskyConnectionResponse.Account.Group.builder()
                            .id("id")
                            .name("name")
                            .build()
                    )
                    .metadata(
                        ConnectCreateBlueskyConnectionResponse.Account.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .platform(ConnectCreateBlueskyConnectionResponse.Account.Platform.TWITTER)
                    .platformAccountId("platform_account_id")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .username("username")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val connectCreateBlueskyConnectionResponse =
            ConnectCreateBlueskyConnectionResponse.builder()
                .account(
                    ConnectCreateBlueskyConnectionResponse.Account.builder()
                        .id("id")
                        .avatarUrl("avatar_url")
                        .connectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .displayName("display_name")
                        .group(
                            ConnectCreateBlueskyConnectionResponse.Account.Group.builder()
                                .id("id")
                                .name("name")
                                .build()
                        )
                        .metadata(
                            ConnectCreateBlueskyConnectionResponse.Account.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .platform(ConnectCreateBlueskyConnectionResponse.Account.Platform.TWITTER)
                        .platformAccountId("platform_account_id")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .username("username")
                        .build()
                )
                .build()

        val roundtrippedConnectCreateBlueskyConnectionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(connectCreateBlueskyConnectionResponse),
                jacksonTypeRef<ConnectCreateBlueskyConnectionResponse>(),
            )

        assertThat(roundtrippedConnectCreateBlueskyConnectionResponse)
            .isEqualTo(connectCreateBlueskyConnectionResponse)
    }
}
