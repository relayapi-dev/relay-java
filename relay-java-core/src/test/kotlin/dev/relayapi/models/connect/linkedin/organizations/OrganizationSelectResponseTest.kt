// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.connect.linkedin.organizations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.JsonValue
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrganizationSelectResponseTest {

    @Test
    fun create() {
        val organizationSelectResponse =
            OrganizationSelectResponse.builder()
                .account(
                    OrganizationSelectResponse.Account.builder()
                        .id("id")
                        .avatarUrl("avatar_url")
                        .connectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .displayName("display_name")
                        .metadata(
                            OrganizationSelectResponse.Account.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .platform(OrganizationSelectResponse.Account.Platform.TWITTER)
                        .platformAccountId("platform_account_id")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .username("username")
                        .workspace(
                            OrganizationSelectResponse.Account.Workspace.builder()
                                .id("id")
                                .name("name")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(organizationSelectResponse.account())
            .isEqualTo(
                OrganizationSelectResponse.Account.builder()
                    .id("id")
                    .avatarUrl("avatar_url")
                    .connectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .displayName("display_name")
                    .metadata(
                        OrganizationSelectResponse.Account.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .platform(OrganizationSelectResponse.Account.Platform.TWITTER)
                    .platformAccountId("platform_account_id")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .username("username")
                    .workspace(
                        OrganizationSelectResponse.Account.Workspace.builder()
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
        val organizationSelectResponse =
            OrganizationSelectResponse.builder()
                .account(
                    OrganizationSelectResponse.Account.builder()
                        .id("id")
                        .avatarUrl("avatar_url")
                        .connectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .displayName("display_name")
                        .metadata(
                            OrganizationSelectResponse.Account.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .platform(OrganizationSelectResponse.Account.Platform.TWITTER)
                        .platformAccountId("platform_account_id")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .username("username")
                        .workspace(
                            OrganizationSelectResponse.Account.Workspace.builder()
                                .id("id")
                                .name("name")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedOrganizationSelectResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(organizationSelectResponse),
                jacksonTypeRef<OrganizationSelectResponse>(),
            )

        assertThat(roundtrippedOrganizationSelectResponse).isEqualTo(organizationSelectResponse)
    }
}
