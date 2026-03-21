// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.posts

import dev.relayapi.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PostBulkCreateParamsTest {

    @Test
    fun create() {
        PostBulkCreateParams.builder()
            .addPost(
                PostBulkCreateParams.Post.builder()
                    .scheduledAt("now")
                    .addTarget("string")
                    .content("content")
                    .addMedia(
                        PostBulkCreateParams.Post.Media.builder()
                            .url("https://example.com")
                            .type(PostBulkCreateParams.Post.Media.Type.IMAGE)
                            .build()
                    )
                    .targetOptions(
                        PostBulkCreateParams.Post.TargetOptions.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                            .build()
                    )
                    .timezone("timezone")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            PostBulkCreateParams.builder()
                .addPost(
                    PostBulkCreateParams.Post.builder()
                        .scheduledAt("now")
                        .addTarget("string")
                        .content("content")
                        .addMedia(
                            PostBulkCreateParams.Post.Media.builder()
                                .url("https://example.com")
                                .type(PostBulkCreateParams.Post.Media.Type.IMAGE)
                                .build()
                        )
                        .targetOptions(
                            PostBulkCreateParams.Post.TargetOptions.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                                .build()
                        )
                        .timezone("timezone")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.posts())
            .containsExactly(
                PostBulkCreateParams.Post.builder()
                    .scheduledAt("now")
                    .addTarget("string")
                    .content("content")
                    .addMedia(
                        PostBulkCreateParams.Post.Media.builder()
                            .url("https://example.com")
                            .type(PostBulkCreateParams.Post.Media.Type.IMAGE)
                            .build()
                    )
                    .targetOptions(
                        PostBulkCreateParams.Post.TargetOptions.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                            .build()
                    )
                    .timezone("timezone")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PostBulkCreateParams.builder()
                .addPost(
                    PostBulkCreateParams.Post.builder()
                        .scheduledAt("now")
                        .addTarget("string")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.posts())
            .containsExactly(
                PostBulkCreateParams.Post.builder().scheduledAt("now").addTarget("string").build()
            )
    }
}
