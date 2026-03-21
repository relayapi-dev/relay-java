// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.connect

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.models.connect.whatsapp.WhatsappCompleteEmbeddedSignupParams
import dev.relayapi.models.connect.whatsapp.WhatsappConnectViaCredentialsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WhatsappServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun completeEmbeddedSignup() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val whatsappServiceAsync = client.connect().whatsapp()

        val responseFuture =
            whatsappServiceAsync.completeEmbeddedSignup(
                WhatsappCompleteEmbeddedSignupParams.builder().code("code").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun connectViaCredentials() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val whatsappServiceAsync = client.connect().whatsapp()

        val responseFuture =
            whatsappServiceAsync.connectViaCredentials(
                WhatsappConnectViaCredentialsParams.builder()
                    .accessToken("access_token")
                    .phoneNumberId("phone_number_id")
                    .wabaId("waba_id")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSdkConfig() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val whatsappServiceAsync = client.connect().whatsapp()

        val responseFuture = whatsappServiceAsync.getSdkConfig()

        val response = responseFuture.get()
        response.validate()
    }
}
