// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.accounts.redditflairs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RedditFlairRetrieveResponseTest {

    @Test
    fun create() {
        val redditFlairRetrieveResponse =
            RedditFlairRetrieveResponse.builder()
                .addData(RedditFlairRetrieveResponse.Data.builder().id("id").text("text").build())
                .build()

        assertThat(redditFlairRetrieveResponse.data())
            .containsExactly(
                RedditFlairRetrieveResponse.Data.builder().id("id").text("text").build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val redditFlairRetrieveResponse =
            RedditFlairRetrieveResponse.builder()
                .addData(RedditFlairRetrieveResponse.Data.builder().id("id").text("text").build())
                .build()

        val roundtrippedRedditFlairRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(redditFlairRetrieveResponse),
                jacksonTypeRef<RedditFlairRetrieveResponse>(),
            )

        assertThat(roundtrippedRedditFlairRetrieveResponse).isEqualTo(redditFlairRetrieveResponse)
    }
}
