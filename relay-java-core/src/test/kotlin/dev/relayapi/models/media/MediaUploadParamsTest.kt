// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.media

import dev.relayapi.core.http.QueryParams
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaUploadParamsTest {

    @Test
    fun create() {
        MediaUploadParams.builder().filename("filename").body("Example data").build()
    }

    @Test
    fun queryParams() {
        val params = MediaUploadParams.builder().filename("filename").body("Example data").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("filename", "filename").build())
    }

    @Test
    fun body() {
        val params = MediaUploadParams.builder().filename("filename").body("Example data").build()

        val body = params._body().getOrNull()

        assertThat(body).isEqualTo("Example data")
    }
}
