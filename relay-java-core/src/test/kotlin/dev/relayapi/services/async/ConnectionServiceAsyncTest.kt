// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.models.connections.ConnectionListLogsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ConnectionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun listLogs() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val connectionServiceAsync = client.connections()

        val responseFuture =
            connectionServiceAsync.listLogs(
                ConnectionListLogsParams.builder().cursor("cursor").limit(1L).build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
