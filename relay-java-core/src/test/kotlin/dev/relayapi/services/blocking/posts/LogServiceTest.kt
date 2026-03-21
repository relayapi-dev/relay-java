// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.posts

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.models.posts.logs.LogListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class LogServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val logService = client.posts().logs()

        val log = logService.retrieve("id")

        log.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val logService = client.posts().logs()

        val logs = logService.list(LogListParams.builder().cursor("cursor").limit(1L).build())

        logs.validate()
    }
}
