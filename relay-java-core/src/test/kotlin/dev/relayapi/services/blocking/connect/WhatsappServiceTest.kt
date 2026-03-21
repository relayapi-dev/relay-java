// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.connect

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.models.connect.whatsapp.WhatsappCompleteEmbeddedSignupParams
import dev.relayapi.models.connect.whatsapp.WhatsappConnectViaCredentialsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WhatsappServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun completeEmbeddedSignup() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val whatsappService = client.connect().whatsapp()

        val response =
            whatsappService.completeEmbeddedSignup(
                WhatsappCompleteEmbeddedSignupParams.builder().code("code").build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun connectViaCredentials() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val whatsappService = client.connect().whatsapp()

        val response =
            whatsappService.connectViaCredentials(
                WhatsappConnectViaCredentialsParams.builder()
                    .accessToken("access_token")
                    .phoneNumberId("phone_number_id")
                    .wabaId("waba_id")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSdkConfig() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val whatsappService = client.connect().whatsapp()

        val response = whatsappService.getSdkConfig()

        response.validate()
    }
}
