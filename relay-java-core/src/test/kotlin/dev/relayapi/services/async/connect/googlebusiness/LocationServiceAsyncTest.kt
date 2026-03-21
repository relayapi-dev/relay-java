// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.connect.googlebusiness

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.models.connect.googlebusiness.locations.LocationSelectParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class LocationServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val locationServiceAsync = client.connect().googlebusiness().locations()

        val locationsFuture = locationServiceAsync.list()

        val locations = locationsFuture.get()
        locations.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun select() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val locationServiceAsync = client.connect().googlebusiness().locations()

        val responseFuture =
            locationServiceAsync.select(
                LocationSelectParams.builder()
                    .connectToken("connect_token")
                    .locationId("location_id")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
