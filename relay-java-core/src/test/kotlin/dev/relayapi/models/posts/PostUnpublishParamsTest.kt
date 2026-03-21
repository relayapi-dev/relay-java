// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.posts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PostUnpublishParamsTest {

    @Test
    fun create() {
        PostUnpublishParams.builder().id("id").build()
    }

    @Test
    fun pathParams() {
        val params = PostUnpublishParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
