// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.posts

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.models.posts.logs.LogListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class LogServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val logServiceAsync = client.posts().logs()

        val logFuture = logServiceAsync.retrieve("id")

        val log = logFuture.get()
        log.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val logServiceAsync = client.posts().logs()

        val logsFuture =
            logServiceAsync.list(
                LogListParams.builder()
                    .cursor("cursor")
                    .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .limit(1L)
                    .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val logs = logsFuture.get()
        logs.validate()
    }
}
