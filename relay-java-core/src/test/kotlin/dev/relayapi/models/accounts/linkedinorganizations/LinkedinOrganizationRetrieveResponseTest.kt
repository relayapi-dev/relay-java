// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.accounts.linkedinorganizations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LinkedinOrganizationRetrieveResponseTest {

    @Test
    fun create() {
        val linkedinOrganizationRetrieveResponse =
            LinkedinOrganizationRetrieveResponse.builder()
                .addData(
                    LinkedinOrganizationRetrieveResponse.Data.builder()
                        .id("id")
                        .name("name")
                        .vanityName("vanity_name")
                        .build()
                )
                .build()

        assertThat(linkedinOrganizationRetrieveResponse.data())
            .containsExactly(
                LinkedinOrganizationRetrieveResponse.Data.builder()
                    .id("id")
                    .name("name")
                    .vanityName("vanity_name")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val linkedinOrganizationRetrieveResponse =
            LinkedinOrganizationRetrieveResponse.builder()
                .addData(
                    LinkedinOrganizationRetrieveResponse.Data.builder()
                        .id("id")
                        .name("name")
                        .vanityName("vanity_name")
                        .build()
                )
                .build()

        val roundtrippedLinkedinOrganizationRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(linkedinOrganizationRetrieveResponse),
                jacksonTypeRef<LinkedinOrganizationRetrieveResponse>(),
            )

        assertThat(roundtrippedLinkedinOrganizationRetrieveResponse)
            .isEqualTo(linkedinOrganizationRetrieveResponse)
    }
}
