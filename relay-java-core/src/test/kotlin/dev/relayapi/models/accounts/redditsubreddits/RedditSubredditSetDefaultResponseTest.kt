// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.accounts.redditsubreddits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.JsonValue
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RedditSubredditSetDefaultResponseTest {

    @Test
    fun create() {
        val redditSubredditSetDefaultResponse =
            RedditSubredditSetDefaultResponse.builder()
                .id("id")
                .avatarUrl("avatar_url")
                .connectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .displayName("display_name")
                .group(
                    RedditSubredditSetDefaultResponse.Group.builder().id("id").name("name").build()
                )
                .metadata(
                    RedditSubredditSetDefaultResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .platform(RedditSubredditSetDefaultResponse.Platform.TWITTER)
                .platformAccountId("platform_account_id")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .username("username")
                .build()

        assertThat(redditSubredditSetDefaultResponse.id()).isEqualTo("id")
        assertThat(redditSubredditSetDefaultResponse.avatarUrl()).contains("avatar_url")
        assertThat(redditSubredditSetDefaultResponse.connectedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(redditSubredditSetDefaultResponse.displayName()).contains("display_name")
        assertThat(redditSubredditSetDefaultResponse.group())
            .contains(
                RedditSubredditSetDefaultResponse.Group.builder().id("id").name("name").build()
            )
        assertThat(redditSubredditSetDefaultResponse.metadata())
            .contains(
                RedditSubredditSetDefaultResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(redditSubredditSetDefaultResponse.platform())
            .isEqualTo(RedditSubredditSetDefaultResponse.Platform.TWITTER)
        assertThat(redditSubredditSetDefaultResponse.platformAccountId())
            .isEqualTo("platform_account_id")
        assertThat(redditSubredditSetDefaultResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(redditSubredditSetDefaultResponse.username()).contains("username")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val redditSubredditSetDefaultResponse =
            RedditSubredditSetDefaultResponse.builder()
                .id("id")
                .avatarUrl("avatar_url")
                .connectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .displayName("display_name")
                .group(
                    RedditSubredditSetDefaultResponse.Group.builder().id("id").name("name").build()
                )
                .metadata(
                    RedditSubredditSetDefaultResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .platform(RedditSubredditSetDefaultResponse.Platform.TWITTER)
                .platformAccountId("platform_account_id")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .username("username")
                .build()

        val roundtrippedRedditSubredditSetDefaultResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(redditSubredditSetDefaultResponse),
                jacksonTypeRef<RedditSubredditSetDefaultResponse>(),
            )

        assertThat(roundtrippedRedditSubredditSetDefaultResponse)
            .isEqualTo(redditSubredditSetDefaultResponse)
    }
}
