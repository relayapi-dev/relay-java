// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.reddit

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RedditGetFeedResponseTest {

    @Test
    fun create() {
        val redditGetFeedResponse =
            RedditGetFeedResponse.builder()
                .addData(
                    RedditGetFeedResponse.Data.builder()
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

        assertThat(redditGetFeedResponse.data())
            .containsExactly(
                RedditGetFeedResponse.Data.builder()
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
        assertThat(redditGetFeedResponse.hasMore()).isEqualTo(true)
        assertThat(redditGetFeedResponse.nextCursor()).contains("next_cursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val redditGetFeedResponse =
            RedditGetFeedResponse.builder()
                .addData(
                    RedditGetFeedResponse.Data.builder()
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

        val roundtrippedRedditGetFeedResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(redditGetFeedResponse),
                jacksonTypeRef<RedditGetFeedResponse>(),
            )

        assertThat(roundtrippedRedditGetFeedResponse).isEqualTo(redditGetFeedResponse)
    }
}
