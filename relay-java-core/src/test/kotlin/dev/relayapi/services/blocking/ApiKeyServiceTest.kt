// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.models.apikeys.ApiKeyCreateParams
import dev.relayapi.models.apikeys.ApiKeyListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ApiKeyServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val apiKeyService = client.apiKeys()

        val apiKey =
            apiKeyService.create(ApiKeyCreateParams.builder().name("x").expiresInDays(1L).build())

        apiKey.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val apiKeyService = client.apiKeys()

        val apiKeys =
            apiKeyService.list(ApiKeyListParams.builder().cursor("cursor").limit(1L).build())

        apiKeys.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val apiKeyService = client.apiKeys()

        apiKeyService.delete("id")
    }
}
