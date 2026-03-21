// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.reddit

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RedditSearchResponseTest {

    @Test
    fun create() {
        val redditSearchResponse =
            RedditSearchResponse.builder()
                .addData(
                    RedditSearchResponse.Data.builder()
                        .id("id")
                        .author("author")
                        .createdUtc(0.0)
                        .isSelf(true)
                        .nsfw(true)
                        .numComments(0.0)
                        .score(0.0)
                        .subreddit("subreddit")
                        .title("title")
                        .url("url")
                        .selftext("selftext")
                        .thumbnail("thumbnail")
                        .build()
                )
                .hasMore(true)
                .nextCursor("next_cursor")
                .build()

        assertThat(redditSearchResponse.data())
            .containsExactly(
                RedditSearchResponse.Data.builder()
                    .id("id")
                    .author("author")
                    .createdUtc(0.0)
                    .isSelf(true)
                    .nsfw(true)
                    .numComments(0.0)
                    .score(0.0)
                    .subreddit("subreddit")
                    .title("title")
                    .url("url")
                    .selftext("selftext")
                    .thumbnail("thumbnail")
                    .build()
            )
        assertThat(redditSearchResponse.hasMore()).isEqualTo(true)
        assertThat(redditSearchResponse.nextCursor()).contains("next_cursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val redditSearchResponse =
            RedditSearchResponse.builder()
                .addData(
                    RedditSearchResponse.Data.builder()
                        .id("id")
                        .author("author")
                        .createdUtc(0.0)
                        .isSelf(true)
                        .nsfw(true)
                        .numComments(0.0)
                        .score(0.0)
                        .subreddit("subreddit")
                        .title("title")
                        .url("url")
                        .selftext("selftext")
                        .thumbnail("thumbnail")
                        .build()
                )
                .hasMore(true)
                .nextCursor("next_cursor")
                .build()

        val roundtrippedRedditSearchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(redditSearchResponse),
                jacksonTypeRef<RedditSearchResponse>(),
            )

        assertThat(roundtrippedRedditSearchResponse).isEqualTo(redditSearchResponse)
    }
}
