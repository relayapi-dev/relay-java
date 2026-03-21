// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.accounts

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.models.accounts.linkedinorganizations.LinkedinOrganizationSwitchTypeParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class LinkedinOrganizationServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val linkedinOrganizationService = client.accounts().linkedinOrganizations()

        val linkedinOrganization = linkedinOrganizationService.retrieve("id")

        linkedinOrganization.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun switchType() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val linkedinOrganizationService = client.accounts().linkedinOrganizations()

        val response =
            linkedinOrganizationService.switchType(
                LinkedinOrganizationSwitchTypeParams.builder()
                    .id("id")
                    .accountType(LinkedinOrganizationSwitchTypeParams.AccountType.PERSONAL)
                    .organizationId("organization_id")
                    .build()
            )

        response.validate()
    }
}
