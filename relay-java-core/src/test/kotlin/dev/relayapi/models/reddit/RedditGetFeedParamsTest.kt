// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.reddit

import dev.relayapi.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RedditGetFeedParamsTest {

    @Test
    fun create() {
        RedditGetFeedParams.builder()
            .accountId("account_id")
            .subreddit("subreddit")
            .cursor("cursor")
            .limit(1L)
            .sort(RedditGetFeedParams.Sort.HOT)
            .time(RedditGetFeedParams.Time.HOUR)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            RedditGetFeedParams.builder()
                .accountId("account_id")
                .subreddit("subreddit")
                .cursor("cursor")
                .limit(1L)
                .sort(RedditGetFeedParams.Sort.HOT)
                .time(RedditGetFeedParams.Time.HOUR)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("account_id", "account_id")
                    .put("subreddit", "subreddit")
                    .put("cursor", "cursor")
                    .put("limit", "1")
                    .put("sort", "hot")
                    .put("time", "hour")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            RedditGetFeedParams.builder().accountId("account_id").subreddit("subreddit").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("account_id", "account_id")
                    .put("subreddit", "subreddit")
                    .build()
            )
    }
}
