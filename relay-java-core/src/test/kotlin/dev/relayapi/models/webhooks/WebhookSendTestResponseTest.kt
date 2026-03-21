// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookSendTestResponseTest {

    @Test
    fun create() {
        val webhookSendTestResponse =
            WebhookSendTestResponse.builder()
                .responseTimeMs(0L)
                .statusCode(0L)
                .success(true)
                .build()

        assertThat(webhookSendTestResponse.responseTimeMs()).contains(0L)
        assertThat(webhookSendTestResponse.statusCode()).contains(0L)
        assertThat(webhookSendTestResponse.success()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookSendTestResponse =
            WebhookSendTestResponse.builder()
                .responseTimeMs(0L)
                .statusCode(0L)
                .success(true)
                .build()

        val roundtrippedWebhookSendTestResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookSendTestResponse),
                jacksonTypeRef<WebhookSendTestResponse>(),
            )

        assertThat(roundtrippedWebhookSendTestResponse).isEqualTo(webhookSendTestResponse)
    }
}
