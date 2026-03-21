// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.connect.linkedin.organizations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrganizationListResponseTest {

    @Test
    fun create() {
        val organizationListResponse =
            OrganizationListResponse.builder()
                .addOrganization(
                    OrganizationListResponse.Organization.builder()
                        .name("name")
                        .urn("urn")
                        .logoUrl("logo_url")
                        .vanityName("vanity_name")
                        .build()
                )
                .personalProfile(
                    OrganizationListResponse.PersonalProfile.builder()
                        .name("name")
                        .urn("urn")
                        .build()
                )
                .build()

        assertThat(organizationListResponse.organizations())
            .containsExactly(
                OrganizationListResponse.Organization.builder()
                    .name("name")
                    .urn("urn")
                    .logoUrl("logo_url")
                    .vanityName("vanity_name")
                    .build()
            )
        assertThat(organizationListResponse.personalProfile())
            .contains(
                OrganizationListResponse.PersonalProfile.builder().name("name").urn("urn").build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val organizationListResponse =
            OrganizationListResponse.builder()
                .addOrganization(
                    OrganizationListResponse.Organization.builder()
                        .name("name")
                        .urn("urn")
                        .logoUrl("logo_url")
                        .vanityName("vanity_name")
                        .build()
                )
                .personalProfile(
                    OrganizationListResponse.PersonalProfile.builder()
                        .name("name")
                        .urn("urn")
                        .build()
                )
                .build()

        val roundtrippedOrganizationListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(organizationListResponse),
                jacksonTypeRef<OrganizationListResponse>(),
            )

        assertThat(roundtrippedOrganizationListResponse).isEqualTo(organizationListResponse)
    }
}
