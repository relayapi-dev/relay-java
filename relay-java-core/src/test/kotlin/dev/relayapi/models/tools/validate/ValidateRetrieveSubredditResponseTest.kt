// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.tools.validate

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ValidateRetrieveSubredditResponseTest {

    @Test
    fun create() {
        val validateRetrieveSubredditResponse =
            ValidateRetrieveSubredditResponse.builder()
                .exists(true)
                .name("name")
                .nsfw(true)
                .postTypes(
                    ValidateRetrieveSubredditResponse.PostTypes.builder()
                        .image(true)
                        .link(true)
                        .self(true)
                        .build()
                )
                .subscribers(0.0)
                .title("title")
                .build()

        assertThat(validateRetrieveSubredditResponse.exists()).isEqualTo(true)
        assertThat(validateRetrieveSubredditResponse.name()).contains("name")
        assertThat(validateRetrieveSubredditResponse.nsfw()).contains(true)
        assertThat(validateRetrieveSubredditResponse.postTypes())
            .contains(
                ValidateRetrieveSubredditResponse.PostTypes.builder()
                    .image(true)
                    .link(true)
                    .self(true)
                    .build()
            )
        assertThat(validateRetrieveSubredditResponse.subscribers()).contains(0.0)
        assertThat(validateRetrieveSubredditResponse.title()).contains("title")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val validateRetrieveSubredditResponse =
            ValidateRetrieveSubredditResponse.builder()
                .exists(true)
                .name("name")
                .nsfw(true)
                .postTypes(
                    ValidateRetrieveSubredditResponse.PostTypes.builder()
                        .image(true)
                        .link(true)
                        .self(true)
                        .build()
                )
                .subscribers(0.0)
                .title("title")
                .build()

        val roundtrippedValidateRetrieveSubredditResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(validateRetrieveSubredditResponse),
                jacksonTypeRef<ValidateRetrieveSubredditResponse>(),
            )

        assertThat(roundtrippedValidateRetrieveSubredditResponse)
            .isEqualTo(validateRetrieveSubredditResponse)
    }
}
