// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.models.connect.ConnectCompleteOAuthCallbackParams
import dev.relayapi.models.connect.ConnectCreateBlueskyConnectionParams
import dev.relayapi.models.connect.ConnectFetchPendingDataParams
import dev.relayapi.models.connect.ConnectStartOAuthFlowParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ConnectServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun completeOAuthCallback() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val connectService = client.connect()

        val response =
            connectService.completeOAuthCallback(
                ConnectCompleteOAuthCallbackParams.builder()
                    .platform(ConnectCompleteOAuthCallbackParams.Platform.TWITTER)
                    .code("code")
                    .redirectUrl("https://example.com")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createBlueskyConnection() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val connectService = client.connect()

        val response =
            connectService.createBlueskyConnection(
                ConnectCreateBlueskyConnectionParams.builder()
                    .appPassword("app_password")
                    .handle("handle")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun fetchPendingData() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val connectService = client.connect()

        val response =
            connectService.fetchPendingData(
                ConnectFetchPendingDataParams.builder().token("token").build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun startOAuthFlow() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val connectService = client.connect()

        val response =
            connectService.startOAuthFlow(
                ConnectStartOAuthFlowParams.builder()
                    .platform(ConnectStartOAuthFlowParams.Platform.TWITTER)
                    .headless("headless")
                    .method("method")
                    .redirectUrl("https://example.com")
                    .build()
            )

        response.validate()
    }
}
