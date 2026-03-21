// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.connect

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConnectStartOAuthFlowResponseTest {

    @Test
    fun create() {
        val connectStartOAuthFlowResponse =
            ConnectStartOAuthFlowResponse.builder().authUrl("https://example.com").build()

        assertThat(connectStartOAuthFlowResponse.authUrl()).isEqualTo("https://example.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val connectStartOAuthFlowResponse =
            ConnectStartOAuthFlowResponse.builder().authUrl("https://example.com").build()

        val roundtrippedConnectStartOAuthFlowResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(connectStartOAuthFlowResponse),
                jacksonTypeRef<ConnectStartOAuthFlowResponse>(),
            )

        assertThat(roundtrippedConnectStartOAuthFlowResponse)
            .isEqualTo(connectStartOAuthFlowResponse)
    }
}
