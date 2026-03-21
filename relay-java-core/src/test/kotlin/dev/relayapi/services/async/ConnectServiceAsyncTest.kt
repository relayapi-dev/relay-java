// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.models.connect.ConnectCompleteOAuthCallbackParams
import dev.relayapi.models.connect.ConnectCreateBlueskyConnectionParams
import dev.relayapi.models.connect.ConnectFetchPendingDataParams
import dev.relayapi.models.connect.ConnectStartOAuthFlowParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ConnectServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun completeOAuthCallback() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val connectServiceAsync = client.connect()

        val responseFuture =
            connectServiceAsync.completeOAuthCallback(
                ConnectCompleteOAuthCallbackParams.builder()
                    .platform(ConnectCompleteOAuthCallbackParams.Platform.TWITTER)
                    .code("code")
                    .redirectUrl("https://example.com")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createBlueskyConnection() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val connectServiceAsync = client.connect()

        val responseFuture =
            connectServiceAsync.createBlueskyConnection(
                ConnectCreateBlueskyConnectionParams.builder()
                    .appPassword("app_password")
                    .handle("handle")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun fetchPendingData() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val connectServiceAsync = client.connect()

        val responseFuture =
            connectServiceAsync.fetchPendingData(
                ConnectFetchPendingDataParams.builder().token("token").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun startOAuthFlow() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val connectServiceAsync = client.connect()

        val responseFuture =
            connectServiceAsync.startOAuthFlow(
                ConnectStartOAuthFlowParams.builder()
                    .platform(ConnectStartOAuthFlowParams.Platform.TWITTER)
                    .headless("headless")
                    .redirectUrl("https://example.com")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
