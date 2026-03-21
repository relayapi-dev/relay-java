// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.connect.linkedin

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.models.connect.linkedin.organizations.OrganizationSelectParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OrganizationServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val organizationServiceAsync = client.connect().linkedin().organizations()

        val organizationsFuture = organizationServiceAsync.list()

        val organizations = organizationsFuture.get()
        organizations.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun select() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val organizationServiceAsync = client.connect().linkedin().organizations()

        val responseFuture =
            organizationServiceAsync.select(
                OrganizationSelectParams.builder()
                    .accountType(OrganizationSelectParams.AccountType.PERSONAL)
                    .connectToken("connect_token")
                    .organizationUrn("organization_urn")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
