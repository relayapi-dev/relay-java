// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.media

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaGetPresignUrlResponseTest {

    @Test
    fun create() {
        val mediaGetPresignUrlResponse =
            MediaGetPresignUrlResponse.builder()
                .expiresIn(0L)
                .uploadUrl("https://example.com")
                .url("https://example.com")
                .build()

        assertThat(mediaGetPresignUrlResponse.expiresIn()).isEqualTo(0L)
        assertThat(mediaGetPresignUrlResponse.uploadUrl()).isEqualTo("https://example.com")
        assertThat(mediaGetPresignUrlResponse.url()).isEqualTo("https://example.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mediaGetPresignUrlResponse =
            MediaGetPresignUrlResponse.builder()
                .expiresIn(0L)
                .uploadUrl("https://example.com")
                .url("https://example.com")
                .build()

        val roundtrippedMediaGetPresignUrlResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mediaGetPresignUrlResponse),
                jacksonTypeRef<MediaGetPresignUrlResponse>(),
            )

        assertThat(roundtrippedMediaGetPresignUrlResponse).isEqualTo(mediaGetPresignUrlResponse)
    }
}
