// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.media

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaRetrieveResponseTest {

    @Test
    fun create() {
        val mediaRetrieveResponse =
            MediaRetrieveResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .filename("filename")
                .mimeType("mime_type")
                .size(0L)
                .url("https://example.com")
                .duration(0L)
                .height(0L)
                .width(0L)
                .build()

        assertThat(mediaRetrieveResponse.id()).isEqualTo("id")
        assertThat(mediaRetrieveResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(mediaRetrieveResponse.filename()).isEqualTo("filename")
        assertThat(mediaRetrieveResponse.mimeType()).isEqualTo("mime_type")
        assertThat(mediaRetrieveResponse.size()).isEqualTo(0L)
        assertThat(mediaRetrieveResponse.url()).contains("https://example.com")
        assertThat(mediaRetrieveResponse.duration()).contains(0L)
        assertThat(mediaRetrieveResponse.height()).contains(0L)
        assertThat(mediaRetrieveResponse.width()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mediaRetrieveResponse =
            MediaRetrieveResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .filename("filename")
                .mimeType("mime_type")
                .size(0L)
                .url("https://example.com")
                .duration(0L)
                .height(0L)
                .width(0L)
                .build()

        val roundtrippedMediaRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mediaRetrieveResponse),
                jacksonTypeRef<MediaRetrieveResponse>(),
            )

        assertThat(roundtrippedMediaRetrieveResponse).isEqualTo(mediaRetrieveResponse)
    }
}
