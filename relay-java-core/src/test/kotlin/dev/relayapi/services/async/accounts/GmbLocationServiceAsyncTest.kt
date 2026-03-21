// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.accounts

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.models.accounts.gmblocations.GmbLocationSetDefaultParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GmbLocationServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val gmbLocationServiceAsync = client.accounts().gmbLocations()

        val gmbLocationFuture = gmbLocationServiceAsync.retrieve("id")

        val gmbLocation = gmbLocationFuture.get()
        gmbLocation.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun setDefault() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val gmbLocationServiceAsync = client.accounts().gmbLocations()

        val responseFuture =
            gmbLocationServiceAsync.setDefault(
                GmbLocationSetDefaultParams.builder().id("id").locationId("location_id").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
