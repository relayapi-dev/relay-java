// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.reddit

import dev.relayapi.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RedditSearchParamsTest {

    @Test
    fun create() {
        RedditSearchParams.builder()
            .accountId("account_id")
            .query("query")
            .cursor("cursor")
            .limit(1L)
            .sort(RedditSearchParams.Sort.RELEVANCE)
            .subreddit("subreddit")
            .time(RedditSearchParams.Time.HOUR)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            RedditSearchParams.builder()
                .accountId("account_id")
                .query("query")
                .cursor("cursor")
                .limit(1L)
                .sort(RedditSearchParams.Sort.RELEVANCE)
                .subreddit("subreddit")
                .time(RedditSearchParams.Time.HOUR)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("account_id", "account_id")
                    .put("query", "query")
                    .put("cursor", "cursor")
                    .put("limit", "1")
                    .put("sort", "relevance")
                    .put("subreddit", "subreddit")
                    .put("time", "hour")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = RedditSearchParams.builder().accountId("account_id").query("query").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("account_id", "account_id").put("query", "query").build()
            )
    }
}
