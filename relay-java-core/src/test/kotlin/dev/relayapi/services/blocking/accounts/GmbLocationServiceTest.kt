// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.accounts

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.models.accounts.gmblocations.GmbLocationSetDefaultParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GmbLocationServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val gmbLocationService = client.accounts().gmbLocations()

        val gmbLocation = gmbLocationService.retrieve("id")

        gmbLocation.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun setDefault() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val gmbLocationService = client.accounts().gmbLocations()

        val response =
            gmbLocationService.setDefault(
                GmbLocationSetDefaultParams.builder().id("id").locationId("location_id").build()
            )

        response.validate()
    }
}
