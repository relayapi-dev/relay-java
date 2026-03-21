// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.webhooks

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookCreateParamsTest {

    @Test
    fun create() {
        WebhookCreateParams.builder()
            .addEvent(WebhookCreateParams.Event.POST_PUBLISHED)
            .url("https://example.com")
            .build()
    }

    @Test
    fun body() {
        val params =
            WebhookCreateParams.builder()
                .addEvent(WebhookCreateParams.Event.POST_PUBLISHED)
                .url("https://example.com")
                .build()

        val body = params._body()

        assertThat(body.events()).containsExactly(WebhookCreateParams.Event.POST_PUBLISHED)
        assertThat(body.url()).isEqualTo("https://example.com")
    }
}
