// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.posts

import dev.relayapi.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PostUpdateParamsTest {

    @Test
    fun create() {
        PostUpdateParams.builder()
            .id("id")
            .content("content")
            .addMedia(
                PostUpdateParams.Media.builder()
                    .url("https://example.com")
                    .type(PostUpdateParams.Media.Type.IMAGE)
                    .build()
            )
            .scheduledAt("now")
            .targetOptions(
                PostUpdateParams.TargetOptions.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                    .build()
            )
            .addTarget("string")
            .timezone("timezone")
            .build()
    }

    @Test
    fun pathParams() {
        val params = PostUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PostUpdateParams.builder()
                .id("id")
                .content("content")
                .addMedia(
                    PostUpdateParams.Media.builder()
                        .url("https://example.com")
                        .type(PostUpdateParams.Media.Type.IMAGE)
                        .build()
                )
                .scheduledAt("now")
                .targetOptions(
                    PostUpdateParams.TargetOptions.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                        .build()
                )
                .addTarget("string")
                .timezone("timezone")
                .build()

        val body = params._body()

        assertThat(body.content()).contains("content")
        assertThat(body.media().getOrNull())
            .containsExactly(
                PostUpdateParams.Media.builder()
                    .url("https://example.com")
                    .type(PostUpdateParams.Media.Type.IMAGE)
                    .build()
            )
        assertThat(body.scheduledAt()).contains("now")
        assertThat(body.targetOptions())
            .contains(
                PostUpdateParams.TargetOptions.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                    .build()
            )
        assertThat(body.targets().getOrNull()).containsExactly("string")
        assertThat(body.timezone()).contains("timezone")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = PostUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
