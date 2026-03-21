// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.accounts

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class HealthServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val healthServiceAsync = client.accounts().health()

        val healthFuture = healthServiceAsync.retrieve("id")

        val health = healthFuture.get()
        health.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val healthServiceAsync = client.accounts().health()

        val healthFuture = healthServiceAsync.list()

        val health = healthFuture.get()
        health.validate()
    }
}
