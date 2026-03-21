// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.tools

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.models.tools.instagram.InstagramCheckHashtagSafetyParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InstagramServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun checkHashtagSafety() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val instagramService = client.tools().instagram()

        val response =
            instagramService.checkHashtagSafety(
                InstagramCheckHashtagSafetyParams.builder().addHashtag("string").build()
            )

        response.validate()
    }
}
