// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.tools.instagram

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstagramCheckHashtagSafetyParamsTest {

    @Test
    fun create() {
        InstagramCheckHashtagSafetyParams.builder().addHashtag("string").build()
    }

    @Test
    fun body() {
        val params = InstagramCheckHashtagSafetyParams.builder().addHashtag("string").build()

        val body = params._body()

        assertThat(body.hashtags()).containsExactly("string")
    }
}
