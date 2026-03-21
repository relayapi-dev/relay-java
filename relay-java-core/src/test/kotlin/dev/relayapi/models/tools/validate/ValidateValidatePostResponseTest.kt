// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.tools.validate

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ValidateValidatePostResponseTest {

    @Test
    fun create() {
        val validateValidatePostResponse =
            ValidateValidatePostResponse.builder()
                .addError(
                    ValidateValidatePostResponse.Error.builder()
                        .code("code")
                        .message("message")
                        .target("target")
                        .build()
                )
                .valid(true)
                .addWarning(
                    ValidateValidatePostResponse.Warning.builder()
                        .code("code")
                        .message("message")
                        .target("target")
                        .build()
                )
                .build()

        assertThat(validateValidatePostResponse.errors())
            .containsExactly(
                ValidateValidatePostResponse.Error.builder()
                    .code("code")
                    .message("message")
                    .target("target")
                    .build()
            )
        assertThat(validateValidatePostResponse.valid()).isEqualTo(true)
        assertThat(validateValidatePostResponse.warnings())
            .containsExactly(
                ValidateValidatePostResponse.Warning.builder()
                    .code("code")
                    .message("message")
                    .target("target")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val validateValidatePostResponse =
            ValidateValidatePostResponse.builder()
                .addError(
                    ValidateValidatePostResponse.Error.builder()
                        .code("code")
                        .message("message")
                        .target("target")
                        .build()
                )
                .valid(true)
                .addWarning(
                    ValidateValidatePostResponse.Warning.builder()
                        .code("code")
                        .message("message")
                        .target("target")
                        .build()
                )
                .build()

        val roundtrippedValidateValidatePostResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(validateValidatePostResponse),
                jacksonTypeRef<ValidateValidatePostResponse>(),
            )

        assertThat(roundtrippedValidateValidatePostResponse).isEqualTo(validateValidatePostResponse)
    }
}
