// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.connect.whatsapp

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.JsonValue
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WhatsappConnectViaCredentialsResponseTest {

    @Test
    fun create() {
        val whatsappConnectViaCredentialsResponse =
            WhatsappConnectViaCredentialsResponse.builder()
                .account(
                    WhatsappConnectViaCredentialsResponse.Account.builder()
                        .id("id")
                        .avatarUrl("avatar_url")
                        .connectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .displayName("display_name")
                        .group(
                            WhatsappConnectViaCredentialsResponse.Account.Group.builder()
                                .id("id")
                                .name("name")
                                .build()
                        )
                        .metadata(
                            WhatsappConnectViaCredentialsResponse.Account.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .platform(WhatsappConnectViaCredentialsResponse.Account.Platform.TWITTER)
                        .platformAccountId("platform_account_id")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .username("username")
                        .build()
                )
                .build()

        assertThat(whatsappConnectViaCredentialsResponse.account())
            .isEqualTo(
                WhatsappConnectViaCredentialsResponse.Account.builder()
                    .id("id")
                    .avatarUrl("avatar_url")
                    .connectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .displayName("display_name")
                    .group(
                        WhatsappConnectViaCredentialsResponse.Account.Group.builder()
                            .id("id")
                            .name("name")
                            .build()
                    )
                    .metadata(
                        WhatsappConnectViaCredentialsResponse.Account.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .platform(WhatsappConnectViaCredentialsResponse.Account.Platform.TWITTER)
                    .platformAccountId("platform_account_id")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .username("username")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val whatsappConnectViaCredentialsResponse =
            WhatsappConnectViaCredentialsResponse.builder()
                .account(
                    WhatsappConnectViaCredentialsResponse.Account.builder()
                        .id("id")
                        .avatarUrl("avatar_url")
                        .connectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .displayName("display_name")
                        .group(
                            WhatsappConnectViaCredentialsResponse.Account.Group.builder()
                                .id("id")
                                .name("name")
                                .build()
                        )
                        .metadata(
                            WhatsappConnectViaCredentialsResponse.Account.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .platform(WhatsappConnectViaCredentialsResponse.Account.Platform.TWITTER)
                        .platformAccountId("platform_account_id")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .username("username")
                        .build()
                )
                .build()

        val roundtrippedWhatsappConnectViaCredentialsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(whatsappConnectViaCredentialsResponse),
                jacksonTypeRef<WhatsappConnectViaCredentialsResponse>(),
            )

        assertThat(roundtrippedWhatsappConnectViaCredentialsResponse)
            .isEqualTo(whatsappConnectViaCredentialsResponse)
    }
}
