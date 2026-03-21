// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.accounts

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.models.accounts.linkedinorganizations.LinkedinOrganizationSwitchTypeParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class LinkedinOrganizationServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val linkedinOrganizationServiceAsync = client.accounts().linkedinOrganizations()

        val linkedinOrganizationFuture = linkedinOrganizationServiceAsync.retrieve("id")

        val linkedinOrganization = linkedinOrganizationFuture.get()
        linkedinOrganization.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun switchType() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val linkedinOrganizationServiceAsync = client.accounts().linkedinOrganizations()

        val responseFuture =
            linkedinOrganizationServiceAsync.switchType(
                LinkedinOrganizationSwitchTypeParams.builder()
                    .id("id")
                    .accountType(LinkedinOrganizationSwitchTypeParams.AccountType.PERSONAL)
                    .organizationId("organization_id")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
