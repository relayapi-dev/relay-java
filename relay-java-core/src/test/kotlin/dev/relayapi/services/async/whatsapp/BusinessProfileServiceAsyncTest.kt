// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.whatsapp

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.models.whatsapp.businessprofile.BusinessProfileRetrieveParams
import dev.relayapi.models.whatsapp.businessprofile.BusinessProfileUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BusinessProfileServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val businessProfileServiceAsync = client.whatsapp().businessProfile()

        val businessProfileFuture =
            businessProfileServiceAsync.retrieve(
                BusinessProfileRetrieveParams.builder().accountId("account_id").build()
            )

        val businessProfile = businessProfileFuture.get()
        businessProfile.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val businessProfileServiceAsync = client.whatsapp().businessProfile()

        val businessProfileFuture =
            businessProfileServiceAsync.update(
                BusinessProfileUpdateParams.builder()
                    .accountId("account_id")
                    .about("about")
                    .address("address")
                    .description("description")
                    .email("email")
                    .addWebsite("string")
                    .build()
            )

        val businessProfile = businessProfileFuture.get()
        businessProfile.validate()
    }
}
