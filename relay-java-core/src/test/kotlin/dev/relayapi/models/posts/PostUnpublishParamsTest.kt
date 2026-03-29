// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.posts

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PostUnpublishParamsTest {

    @Test
    fun create() {
        PostUnpublishParams.builder().id("id").addPlatform("string").build()
    }

    @Test
    fun pathParams() {
        val params = PostUnpublishParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params = PostUnpublishParams.builder().id("id").addPlatform("string").build()

        val body = params._body()

        assertThat(body.platforms().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = PostUnpublishParams.builder().id("id").build()

        val body = params._body()
    }
}
