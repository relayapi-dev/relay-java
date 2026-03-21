// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.models.media.MediaGetPresignUrlParams
import dev.relayapi.models.media.MediaUploadParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MediaServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val mediaServiceAsync = client.media()

        val mediaFuture = mediaServiceAsync.retrieve("id")

        val media = mediaFuture.get()
        media.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val mediaServiceAsync = client.media()

        val future = mediaServiceAsync.delete("id")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getPresignUrl() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val mediaServiceAsync = client.media()

        val responseFuture =
            mediaServiceAsync.getPresignUrl(
                MediaGetPresignUrlParams.builder()
                    .contentType("content_type")
                    .filename("filename")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun upload() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val mediaServiceAsync = client.media()

        val responseFuture =
            mediaServiceAsync.upload(
                MediaUploadParams.builder().filename("filename").body("Example data").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
