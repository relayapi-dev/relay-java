// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.accounts

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.models.accounts.health.HealthListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class HealthServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val healthService = client.accounts().health()

        val health = healthService.retrieve("id")

        health.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val healthService = client.accounts().health()

        val health =
            healthService.list(HealthListParams.builder().cursor("cursor").limit(1L).build())

        health.validate()
    }
}
