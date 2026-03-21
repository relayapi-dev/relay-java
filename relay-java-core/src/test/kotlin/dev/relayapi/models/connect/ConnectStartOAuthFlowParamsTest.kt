// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.connect

import dev.relayapi.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConnectStartOAuthFlowParamsTest {

    @Test
    fun create() {
        ConnectStartOAuthFlowParams.builder()
            .platform(ConnectStartOAuthFlowParams.Platform.TWITTER)
            .headless("headless")
            .redirectUrl("https://example.com")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ConnectStartOAuthFlowParams.builder()
                .platform(ConnectStartOAuthFlowParams.Platform.TWITTER)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("twitter")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ConnectStartOAuthFlowParams.builder()
                .platform(ConnectStartOAuthFlowParams.Platform.TWITTER)
                .headless("headless")
                .redirectUrl("https://example.com")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("headless", "headless")
                    .put("redirect_url", "https://example.com")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ConnectStartOAuthFlowParams.builder()
                .platform(ConnectStartOAuthFlowParams.Platform.TWITTER)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
