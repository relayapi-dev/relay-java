// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.models.apikeys.ApiKeyCreateParams
import dev.relayapi.models.apikeys.ApiKeyListParams
import java.time.OffsetDateTime
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
                ApiKeyCreateParams.builder()
                    .name("x")
                    .expiresInDays(1L)
                    .permission(ApiKeyCreateParams.Permission.READ_WRITE)
                    .workspaceScope(ApiKeyCreateParams.WorkspaceScope.UnionMember0.ALL)
                    .build()
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
            apiKeyServiceAsync.list(
                ApiKeyListParams.builder()
                    .cursor("cursor")
                    .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .limit(1L)
                    .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

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
