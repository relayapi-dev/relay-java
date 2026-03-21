// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.inbox.reviews

import dev.relayapi.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReviewListParamsTest {

    @Test
    fun create() {
        ReviewListParams.builder()
            .accountId("account_id")
            .cursor("cursor")
            .limit(1L)
            .maxRating(1L)
            .minRating(1L)
            .platform(ReviewListParams.Platform.TWITTER)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ReviewListParams.builder()
                .accountId("account_id")
                .cursor("cursor")
                .limit(1L)
                .maxRating(1L)
                .minRating(1L)
                .platform(ReviewListParams.Platform.TWITTER)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("account_id", "account_id")
                    .put("cursor", "cursor")
                    .put("limit", "1")
                    .put("max_rating", "1")
                    .put("min_rating", "1")
                    .put("platform", "twitter")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ReviewListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
