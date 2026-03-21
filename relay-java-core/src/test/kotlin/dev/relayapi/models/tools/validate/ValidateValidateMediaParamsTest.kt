// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.tools.validate

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ValidateValidateMediaParamsTest {

    @Test
    fun create() {
        ValidateValidateMediaParams.builder().url("https://example.com").build()
    }

    @Test
    fun body() {
        val params = ValidateValidateMediaParams.builder().url("https://example.com").build()

        val body = params._body()

        assertThat(body.url()).isEqualTo("https://example.com")
    }
}
