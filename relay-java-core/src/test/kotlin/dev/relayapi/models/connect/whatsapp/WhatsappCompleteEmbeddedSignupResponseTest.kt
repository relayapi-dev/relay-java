// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.connect.whatsapp

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.JsonValue
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WhatsappCompleteEmbeddedSignupResponseTest {

    @Test
    fun create() {
        val whatsappCompleteEmbeddedSignupResponse =
            WhatsappCompleteEmbeddedSignupResponse.builder()
                .account(
                    WhatsappCompleteEmbeddedSignupResponse.Account.builder()
                        .id("id")
                        .avatarUrl("avatar_url")
                        .connectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .displayName("display_name")
                        .metadata(
                            WhatsappCompleteEmbeddedSignupResponse.Account.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .platform(WhatsappCompleteEmbeddedSignupResponse.Account.Platform.TWITTER)
                        .platformAccountId("platform_account_id")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .username("username")
                        .workspace(
                            WhatsappCompleteEmbeddedSignupResponse.Account.Workspace.builder()
                                .id("id")
                                .name("name")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(whatsappCompleteEmbeddedSignupResponse.account())
            .isEqualTo(
                WhatsappCompleteEmbeddedSignupResponse.Account.builder()
                    .id("id")
                    .avatarUrl("avatar_url")
                    .connectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .displayName("display_name")
                    .metadata(
                        WhatsappCompleteEmbeddedSignupResponse.Account.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .platform(WhatsappCompleteEmbeddedSignupResponse.Account.Platform.TWITTER)
                    .platformAccountId("platform_account_id")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .username("username")
                    .workspace(
                        WhatsappCompleteEmbeddedSignupResponse.Account.Workspace.builder()
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
        val whatsappCompleteEmbeddedSignupResponse =
            WhatsappCompleteEmbeddedSignupResponse.builder()
                .account(
                    WhatsappCompleteEmbeddedSignupResponse.Account.builder()
                        .id("id")
                        .avatarUrl("avatar_url")
                        .connectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .displayName("display_name")
                        .metadata(
                            WhatsappCompleteEmbeddedSignupResponse.Account.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .platform(WhatsappCompleteEmbeddedSignupResponse.Account.Platform.TWITTER)
                        .platformAccountId("platform_account_id")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .username("username")
                        .workspace(
                            WhatsappCompleteEmbeddedSignupResponse.Account.Workspace.builder()
                                .id("id")
                                .name("name")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedWhatsappCompleteEmbeddedSignupResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(whatsappCompleteEmbeddedSignupResponse),
                jacksonTypeRef<WhatsappCompleteEmbeddedSignupResponse>(),
            )

        assertThat(roundtrippedWhatsappCompleteEmbeddedSignupResponse)
            .isEqualTo(whatsappCompleteEmbeddedSignupResponse)
    }
}
