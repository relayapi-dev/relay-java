// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.tools

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.models.tools.instagram.InstagramCheckHashtagSafetyParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InstagramServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun checkHashtagSafety() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val instagramServiceAsync = client.tools().instagram()

        val responseFuture =
            instagramServiceAsync.checkHashtagSafety(
                InstagramCheckHashtagSafetyParams.builder().addHashtag("string").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
