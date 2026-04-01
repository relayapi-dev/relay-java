// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.posts

import dev.relayapi.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PostCreateParamsTest {

    @Test
    fun create() {
        PostCreateParams.builder()
            .scheduledAt("now")
            .addTarget("string")
            .content("content")
            .addMedia(
                PostCreateParams.Media.builder()
                    .url("https://example.com")
                    .type(PostCreateParams.Media.Type.IMAGE)
                    .build()
            )
            .targetOptions(
                PostCreateParams.TargetOptions.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                    .build()
            )
            .timezone("timezone")
            .workspaceId("workspace_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            PostCreateParams.builder()
                .scheduledAt("now")
                .addTarget("string")
                .content("content")
                .addMedia(
                    PostCreateParams.Media.builder()
                        .url("https://example.com")
                        .type(PostCreateParams.Media.Type.IMAGE)
                        .build()
                )
                .targetOptions(
                    PostCreateParams.TargetOptions.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                        .build()
                )
                .timezone("timezone")
                .workspaceId("workspace_id")
                .build()

        val body = params._body()

        assertThat(body.scheduledAt()).isEqualTo("now")
        assertThat(body.targets()).containsExactly("string")
        assertThat(body.content()).contains("content")
        assertThat(body.media().getOrNull())
            .containsExactly(
                PostCreateParams.Media.builder()
                    .url("https://example.com")
                    .type(PostCreateParams.Media.Type.IMAGE)
                    .build()
            )
        assertThat(body.targetOptions())
            .contains(
                PostCreateParams.TargetOptions.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                    .build()
            )
        assertThat(body.timezone()).contains("timezone")
        assertThat(body.workspaceId()).contains("workspace_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = PostCreateParams.builder().scheduledAt("now").addTarget("string").build()

        val body = params._body()

        assertThat(body.scheduledAt()).isEqualTo("now")
        assertThat(body.targets()).containsExactly("string")
    }
}
