// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.models.connections.ConnectionListLogsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ConnectionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun listLogs() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val connectionService = client.connections()

        val response =
            connectionService.listLogs(
                ConnectionListLogsParams.builder().cursor("cursor").limit(1L).build()
            )

        response.validate()
    }
}
