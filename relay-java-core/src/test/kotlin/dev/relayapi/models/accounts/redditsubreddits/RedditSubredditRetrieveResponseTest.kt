// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.accounts.redditsubreddits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RedditSubredditRetrieveResponseTest {

    @Test
    fun create() {
        val redditSubredditRetrieveResponse =
            RedditSubredditRetrieveResponse.builder()
                .addData(
                    RedditSubredditRetrieveResponse.Data.builder()
                        .displayName("display_name")
                        .name("name")
                        .subscribers(0.0)
                        .build()
                )
                .build()

        assertThat(redditSubredditRetrieveResponse.data())
            .containsExactly(
                RedditSubredditRetrieveResponse.Data.builder()
                    .displayName("display_name")
                    .name("name")
                    .subscribers(0.0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val redditSubredditRetrieveResponse =
            RedditSubredditRetrieveResponse.builder()
                .addData(
                    RedditSubredditRetrieveResponse.Data.builder()
                        .displayName("display_name")
                        .name("name")
                        .subscribers(0.0)
                        .build()
                )
                .build()

        val roundtrippedRedditSubredditRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(redditSubredditRetrieveResponse),
                jacksonTypeRef<RedditSubredditRetrieveResponse>(),
            )

        assertThat(roundtrippedRedditSubredditRetrieveResponse)
            .isEqualTo(redditSubredditRetrieveResponse)
    }
}
