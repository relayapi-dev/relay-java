// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.tools.validate

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ValidateCheckPostLengthParamsTest {

    @Test
    fun create() {
        ValidateCheckPostLengthParams.builder().content("content").build()
    }

    @Test
    fun body() {
        val params = ValidateCheckPostLengthParams.builder().content("content").build()

        val body = params._body()

        assertThat(body.content()).isEqualTo("content")
    }
}
