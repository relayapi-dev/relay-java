// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.connect.linkedin

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.models.connect.linkedin.organizations.OrganizationSelectParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OrganizationServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val organizationService = client.connect().linkedin().organizations()

        val organizations = organizationService.list()

        organizations.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun select() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val organizationService = client.connect().linkedin().organizations()

        val response =
            organizationService.select(
                OrganizationSelectParams.builder()
                    .accountType(OrganizationSelectParams.AccountType.PERSONAL)
                    .connectToken("connect_token")
                    .organizationUrn("organization_urn")
                    .build()
            )

        response.validate()
    }
}
