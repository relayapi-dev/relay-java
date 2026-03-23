// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.models.connections.ConnectionListLogsParams
import java.time.OffsetDateTime
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
                ConnectionListLogsParams.builder()
                    .cursor("cursor")
                    .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .limit(1L)
                    .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
