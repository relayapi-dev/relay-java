// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.webhooks

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookUpdateParamsTest {

    @Test
    fun create() {
        WebhookUpdateParams.builder()
            .id("id")
            .enabled(true)
            .addEvent(WebhookUpdateParams.Event.POST_PUBLISHED)
            .url("https://example.com")
            .build()
    }

    @Test
    fun pathParams() {
        val params = WebhookUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            WebhookUpdateParams.builder()
                .id("id")
                .enabled(true)
                .addEvent(WebhookUpdateParams.Event.POST_PUBLISHED)
                .url("https://example.com")
                .build()

        val body = params._body()

        assertThat(body.enabled()).contains(true)
        assertThat(body.events().getOrNull())
            .containsExactly(WebhookUpdateParams.Event.POST_PUBLISHED)
        assertThat(body.url()).contains("https://example.com")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = WebhookUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
