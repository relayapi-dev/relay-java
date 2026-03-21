// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.models.media.MediaGetPresignUrlParams
import dev.relayapi.models.media.MediaUploadParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MediaServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val mediaService = client.media()

        val media = mediaService.retrieve("id")

        media.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val mediaService = client.media()

        mediaService.delete("id")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getPresignUrl() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val mediaService = client.media()

        val response =
            mediaService.getPresignUrl(
                MediaGetPresignUrlParams.builder()
                    .contentType("content_type")
                    .filename("filename")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun upload() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val mediaService = client.media()

        val response =
            mediaService.upload(
                MediaUploadParams.builder().filename("filename").body("Example data").build()
            )

        response.validate()
    }
}
