// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.tools.validate

import dev.relayapi.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ValidateValidatePostParamsTest {

    @Test
    fun create() {
        ValidateValidatePostParams.builder()
            .scheduledAt("now")
            .addTarget("string")
            .content("content")
            .addMedia(
                ValidateValidatePostParams.Media.builder()
                    .url("https://example.com")
                    .type(ValidateValidatePostParams.Media.Type.IMAGE)
                    .build()
            )
            .targetOptions(
                ValidateValidatePostParams.TargetOptions.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                    .build()
            )
            .timezone("timezone")
            .build()
    }

    @Test
    fun body() {
        val params =
            ValidateValidatePostParams.builder()
                .scheduledAt("now")
                .addTarget("string")
                .content("content")
                .addMedia(
                    ValidateValidatePostParams.Media.builder()
                        .url("https://example.com")
                        .type(ValidateValidatePostParams.Media.Type.IMAGE)
                        .build()
                )
                .targetOptions(
                    ValidateValidatePostParams.TargetOptions.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                        .build()
                )
                .timezone("timezone")
                .build()

        val body = params._body()

        assertThat(body.scheduledAt()).isEqualTo("now")
        assertThat(body.targets()).containsExactly("string")
        assertThat(body.content()).contains("content")
        assertThat(body.media().getOrNull())
            .containsExactly(
                ValidateValidatePostParams.Media.builder()
                    .url("https://example.com")
                    .type(ValidateValidatePostParams.Media.Type.IMAGE)
                    .build()
            )
        assertThat(body.targetOptions())
            .contains(
                ValidateValidatePostParams.TargetOptions.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                    .build()
            )
        assertThat(body.timezone()).contains("timezone")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ValidateValidatePostParams.builder().scheduledAt("now").addTarget("string").build()

        val body = params._body()

        assertThat(body.scheduledAt()).isEqualTo("now")
        assertThat(body.targets()).containsExactly("string")
    }
}
