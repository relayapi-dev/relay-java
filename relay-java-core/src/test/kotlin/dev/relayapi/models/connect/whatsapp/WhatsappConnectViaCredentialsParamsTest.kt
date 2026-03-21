// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.connect.whatsapp

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WhatsappConnectViaCredentialsParamsTest {

    @Test
    fun create() {
        WhatsappConnectViaCredentialsParams.builder()
            .accessToken("access_token")
            .phoneNumberId("phone_number_id")
            .wabaId("waba_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            WhatsappConnectViaCredentialsParams.builder()
                .accessToken("access_token")
                .phoneNumberId("phone_number_id")
                .wabaId("waba_id")
                .build()

        val body = params._body()

        assertThat(body.accessToken()).isEqualTo("access_token")
        assertThat(body.phoneNumberId()).isEqualTo("phone_number_id")
        assertThat(body.wabaId()).isEqualTo("waba_id")
    }
}
