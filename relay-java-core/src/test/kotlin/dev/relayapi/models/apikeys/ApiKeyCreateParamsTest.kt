// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.apikeys

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiKeyCreateParamsTest {

    @Test
    fun create() {
        ApiKeyCreateParams.builder().name("x").expiresInDays(1L).build()
    }

    @Test
    fun body() {
        val params = ApiKeyCreateParams.builder().name("x").expiresInDays(1L).build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("x")
        assertThat(body.expiresInDays()).contains(1L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ApiKeyCreateParams.builder().name("x").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("x")
    }
}
