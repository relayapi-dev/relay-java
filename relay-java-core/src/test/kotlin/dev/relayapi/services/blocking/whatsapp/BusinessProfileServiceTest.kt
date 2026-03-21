// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.whatsapp

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.models.whatsapp.businessprofile.BusinessProfileRetrieveParams
import dev.relayapi.models.whatsapp.businessprofile.BusinessProfileUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BusinessProfileServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val businessProfileService = client.whatsapp().businessProfile()

        val businessProfile =
            businessProfileService.retrieve(
                BusinessProfileRetrieveParams.builder().accountId("account_id").build()
            )

        businessProfile.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val businessProfileService = client.whatsapp().businessProfile()

        val businessProfile =
            businessProfileService.update(
                BusinessProfileUpdateParams.builder()
                    .accountId("account_id")
                    .about("about")
                    .address("address")
                    .description("description")
                    .email("email")
                    .addWebsite("string")
                    .build()
            )

        businessProfile.validate()
    }
}
