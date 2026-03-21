// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.connect.whatsapp

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WhatsappGetSdkConfigResponseTest {

    @Test
    fun create() {
        val whatsappGetSdkConfigResponse =
            WhatsappGetSdkConfigResponse.builder().appId("app_id").configId("config_id").build()

        assertThat(whatsappGetSdkConfigResponse.appId()).isEqualTo("app_id")
        assertThat(whatsappGetSdkConfigResponse.configId()).isEqualTo("config_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val whatsappGetSdkConfigResponse =
            WhatsappGetSdkConfigResponse.builder().appId("app_id").configId("config_id").build()

        val roundtrippedWhatsappGetSdkConfigResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(whatsappGetSdkConfigResponse),
                jacksonTypeRef<WhatsappGetSdkConfigResponse>(),
            )

        assertThat(roundtrippedWhatsappGetSdkConfigResponse).isEqualTo(whatsappGetSdkConfigResponse)
    }
}
