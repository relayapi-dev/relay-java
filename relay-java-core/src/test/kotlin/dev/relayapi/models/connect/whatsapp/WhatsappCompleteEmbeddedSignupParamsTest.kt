// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.connect.whatsapp

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WhatsappCompleteEmbeddedSignupParamsTest {

    @Test
    fun create() {
        WhatsappCompleteEmbeddedSignupParams.builder().code("code").build()
    }

    @Test
    fun body() {
        val params = WhatsappCompleteEmbeddedSignupParams.builder().code("code").build()

        val body = params._body()

        assertThat(body.code()).isEqualTo("code")
    }
}
