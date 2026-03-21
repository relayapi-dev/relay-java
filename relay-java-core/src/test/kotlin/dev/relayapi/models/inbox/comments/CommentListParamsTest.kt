// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.inbox.comments

import dev.relayapi.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommentListParamsTest {

    @Test
    fun create() {
        CommentListParams.builder()
            .accountId("account_id")
            .cursor("cursor")
            .limit(1L)
            .platform(CommentListParams.Platform.TWITTER)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CommentListParams.builder()
                .accountId("account_id")
                .cursor("cursor")
                .limit(1L)
                .platform(CommentListParams.Platform.TWITTER)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("account_id", "account_id")
                    .put("cursor", "cursor")
                    .put("limit", "1")
                    .put("platform", "twitter")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CommentListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
