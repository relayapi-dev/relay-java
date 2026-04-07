// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.connect

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConnectCompleteOAuthCallbackParamsTest {

    @Test
    fun create() {
        ConnectCompleteOAuthCallbackParams.builder()
            .platform(ConnectCompleteOAuthCallbackParams.Platform.TWITTER)
            .code("code")
            .redirectUrl("https://example.com")
            .state("state")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ConnectCompleteOAuthCallbackParams.builder()
                .platform(ConnectCompleteOAuthCallbackParams.Platform.TWITTER)
                .code("code")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("twitter")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ConnectCompleteOAuthCallbackParams.builder()
                .platform(ConnectCompleteOAuthCallbackParams.Platform.TWITTER)
                .code("code")
                .redirectUrl("https://example.com")
                .state("state")
                .build()

        val body = params._body()

        assertThat(body.code()).isEqualTo("code")
        assertThat(body.redirectUrl()).contains("https://example.com")
        assertThat(body.state()).contains("state")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ConnectCompleteOAuthCallbackParams.builder()
                .platform(ConnectCompleteOAuthCallbackParams.Platform.TWITTER)
                .code("code")
                .build()

        val body = params._body()

        assertThat(body.code()).isEqualTo("code")
    }
}
