// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.accounts.health

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HealthRetrieveResponseTest {

    @Test
    fun create() {
        val healthRetrieveResponse =
            HealthRetrieveResponse.builder()
                .id("id")
                .healthy(true)
                .platform("platform")
                .tokenExpiresAt("token_expires_at")
                .username("username")
                .error(
                    HealthRetrieveResponse.Error.builder().code("code").message("message").build()
                )
                .build()

        assertThat(healthRetrieveResponse.id()).isEqualTo("id")
        assertThat(healthRetrieveResponse.healthy()).isEqualTo(true)
        assertThat(healthRetrieveResponse.platform()).isEqualTo("platform")
        assertThat(healthRetrieveResponse.tokenExpiresAt()).contains("token_expires_at")
        assertThat(healthRetrieveResponse.username()).contains("username")
        assertThat(healthRetrieveResponse.error())
            .contains(
                HealthRetrieveResponse.Error.builder().code("code").message("message").build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val healthRetrieveResponse =
            HealthRetrieveResponse.builder()
                .id("id")
                .healthy(true)
                .platform("platform")
                .tokenExpiresAt("token_expires_at")
                .username("username")
                .error(
                    HealthRetrieveResponse.Error.builder().code("code").message("message").build()
                )
                .build()

        val roundtrippedHealthRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(healthRetrieveResponse),
                jacksonTypeRef<HealthRetrieveResponse>(),
            )

        assertThat(roundtrippedHealthRetrieveResponse).isEqualTo(healthRetrieveResponse)
    }
}
