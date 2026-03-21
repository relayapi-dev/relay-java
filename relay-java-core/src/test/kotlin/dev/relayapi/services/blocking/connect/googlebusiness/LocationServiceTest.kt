// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.connect.googlebusiness

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.models.connect.googlebusiness.locations.LocationSelectParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class LocationServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val locationService = client.connect().googlebusiness().locations()

        val locations = locationService.list()

        locations.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun select() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val locationService = client.connect().googlebusiness().locations()

        val response =
            locationService.select(
                LocationSelectParams.builder()
                    .connectToken("connect_token")
                    .locationId("location_id")
                    .build()
            )

        response.validate()
    }
}
