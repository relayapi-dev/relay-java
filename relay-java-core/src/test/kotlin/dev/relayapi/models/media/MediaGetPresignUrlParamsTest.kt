// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.media

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaGetPresignUrlParamsTest {

    @Test
    fun create() {
        MediaGetPresignUrlParams.builder().contentType("content_type").filename("filename").build()
    }

    @Test
    fun body() {
        val params =
            MediaGetPresignUrlParams.builder()
                .contentType("content_type")
                .filename("filename")
                .build()

        val body = params._body()

        assertThat(body.contentType()).isEqualTo("content_type")
        assertThat(body.filename()).isEqualTo("filename")
    }
}
