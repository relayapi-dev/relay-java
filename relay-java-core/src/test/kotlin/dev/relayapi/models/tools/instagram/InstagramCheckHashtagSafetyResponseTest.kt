// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.tools.instagram

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstagramCheckHashtagSafetyResponseTest {

    @Test
    fun create() {
        val instagramCheckHashtagSafetyResponse =
            InstagramCheckHashtagSafetyResponse.builder()
                .addResult(
                    InstagramCheckHashtagSafetyResponse.Result.builder()
                        .hashtag("hashtag")
                        .status(InstagramCheckHashtagSafetyResponse.Result.Status.SAFE)
                        .build()
                )
                .build()

        assertThat(instagramCheckHashtagSafetyResponse.results())
            .containsExactly(
                InstagramCheckHashtagSafetyResponse.Result.builder()
                    .hashtag("hashtag")
                    .status(InstagramCheckHashtagSafetyResponse.Result.Status.SAFE)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val instagramCheckHashtagSafetyResponse =
            InstagramCheckHashtagSafetyResponse.builder()
                .addResult(
                    InstagramCheckHashtagSafetyResponse.Result.builder()
                        .hashtag("hashtag")
                        .status(InstagramCheckHashtagSafetyResponse.Result.Status.SAFE)
                        .build()
                )
                .build()

        val roundtrippedInstagramCheckHashtagSafetyResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(instagramCheckHashtagSafetyResponse),
                jacksonTypeRef<InstagramCheckHashtagSafetyResponse>(),
            )

        assertThat(roundtrippedInstagramCheckHashtagSafetyResponse)
            .isEqualTo(instagramCheckHashtagSafetyResponse)
    }
}
