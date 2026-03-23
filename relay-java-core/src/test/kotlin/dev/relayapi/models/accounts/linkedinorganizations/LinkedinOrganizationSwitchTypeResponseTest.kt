// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.accounts.linkedinorganizations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.JsonValue
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LinkedinOrganizationSwitchTypeResponseTest {

    @Test
    fun create() {
        val linkedinOrganizationSwitchTypeResponse =
            LinkedinOrganizationSwitchTypeResponse.builder()
                .id("id")
                .avatarUrl("avatar_url")
                .connectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .displayName("display_name")
                .group(
                    LinkedinOrganizationSwitchTypeResponse.Group.builder()
                        .id("id")
                        .name("name")
                        .build()
                )
                .metadata(
                    LinkedinOrganizationSwitchTypeResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .platform(LinkedinOrganizationSwitchTypeResponse.Platform.TWITTER)
                .platformAccountId("platform_account_id")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .username("username")
                .build()

        assertThat(linkedinOrganizationSwitchTypeResponse.id()).isEqualTo("id")
        assertThat(linkedinOrganizationSwitchTypeResponse.avatarUrl()).contains("avatar_url")
        assertThat(linkedinOrganizationSwitchTypeResponse.connectedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(linkedinOrganizationSwitchTypeResponse.displayName()).contains("display_name")
        assertThat(linkedinOrganizationSwitchTypeResponse.group())
            .contains(
                LinkedinOrganizationSwitchTypeResponse.Group.builder().id("id").name("name").build()
            )
        assertThat(linkedinOrganizationSwitchTypeResponse.metadata())
            .contains(
                LinkedinOrganizationSwitchTypeResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(linkedinOrganizationSwitchTypeResponse.platform())
            .isEqualTo(LinkedinOrganizationSwitchTypeResponse.Platform.TWITTER)
        assertThat(linkedinOrganizationSwitchTypeResponse.platformAccountId())
            .isEqualTo("platform_account_id")
        assertThat(linkedinOrganizationSwitchTypeResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(linkedinOrganizationSwitchTypeResponse.username()).contains("username")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val linkedinOrganizationSwitchTypeResponse =
            LinkedinOrganizationSwitchTypeResponse.builder()
                .id("id")
                .avatarUrl("avatar_url")
                .connectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .displayName("display_name")
                .group(
                    LinkedinOrganizationSwitchTypeResponse.Group.builder()
                        .id("id")
                        .name("name")
                        .build()
                )
                .metadata(
                    LinkedinOrganizationSwitchTypeResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .platform(LinkedinOrganizationSwitchTypeResponse.Platform.TWITTER)
                .platformAccountId("platform_account_id")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .username("username")
                .build()

        val roundtrippedLinkedinOrganizationSwitchTypeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(linkedinOrganizationSwitchTypeResponse),
                jacksonTypeRef<LinkedinOrganizationSwitchTypeResponse>(),
            )

        assertThat(roundtrippedLinkedinOrganizationSwitchTypeResponse)
            .isEqualTo(linkedinOrganizationSwitchTypeResponse)
    }
}
