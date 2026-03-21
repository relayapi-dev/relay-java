// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.models.apikeys.ApiKeyCreateParams
import dev.relayapi.models.apikeys.ApiKeyListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ApiKeyServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val apiKeyServiceAsync = client.apiKeys()

        val apiKeyFuture =
            apiKeyServiceAsync.create(
                ApiKeyCreateParams.builder().name("x").expiresInDays(1L).build()
            )

        val apiKey = apiKeyFuture.get()
        apiKey.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val apiKeyServiceAsync = client.apiKeys()

        val apiKeysFuture =
            apiKeyServiceAsync.list(ApiKeyListParams.builder().cursor("cursor").limit(1L).build())

        val apiKeys = apiKeysFuture.get()
        apiKeys.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val apiKeyServiceAsync = client.apiKeys()

        val future = apiKeyServiceAsync.delete("id")

        val response = future.get()
    }
}
