// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.media

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaUploadResponseTest {

    @Test
    fun create() {
        val mediaUploadResponse =
            MediaUploadResponse.builder()
                .filename("filename")
                .size(0L)
                .type("type")
                .url("https://example.com")
                .build()

        assertThat(mediaUploadResponse.filename()).isEqualTo("filename")
        assertThat(mediaUploadResponse.size()).isEqualTo(0L)
        assertThat(mediaUploadResponse.type()).isEqualTo("type")
        assertThat(mediaUploadResponse.url()).isEqualTo("https://example.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mediaUploadResponse =
            MediaUploadResponse.builder()
                .filename("filename")
                .size(0L)
                .type("type")
                .url("https://example.com")
                .build()

        val roundtrippedMediaUploadResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mediaUploadResponse),
                jacksonTypeRef<MediaUploadResponse>(),
            )

        assertThat(roundtrippedMediaUploadResponse).isEqualTo(mediaUploadResponse)
    }
}
