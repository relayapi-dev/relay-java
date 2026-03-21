// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.webhooks

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookSendTestParamsTest {

    @Test
    fun create() {
        WebhookSendTestParams.builder().webhookId("webhook_id").build()
    }

    @Test
    fun body() {
        val params = WebhookSendTestParams.builder().webhookId("webhook_id").build()

        val body = params._body()

        assertThat(body.webhookId()).isEqualTo("webhook_id")
    }
}
