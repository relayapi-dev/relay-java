// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.models.connections.ConnectionListLogsParams
import java.time.OffsetDateTime
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
                ConnectionListLogsParams.builder()
                    .cursor("cursor")
                    .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .limit(1L)
                    .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        response.validate()
    }
}
