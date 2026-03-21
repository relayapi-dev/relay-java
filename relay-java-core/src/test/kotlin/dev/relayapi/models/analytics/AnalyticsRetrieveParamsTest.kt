// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.analytics

import dev.relayapi.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnalyticsRetrieveParamsTest {

    @Test
    fun create() {
        AnalyticsRetrieveParams.builder()
            .accountId("account_id")
            .fromDate("from_date")
            .limit(1L)
            .offset(0L)
            .platform(AnalyticsRetrieveParams.Platform.TWITTER)
            .postId("post_id")
            .toDate("to_date")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AnalyticsRetrieveParams.builder()
                .accountId("account_id")
                .fromDate("from_date")
                .limit(1L)
                .offset(0L)
                .platform(AnalyticsRetrieveParams.Platform.TWITTER)
                .postId("post_id")
                .toDate("to_date")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("account_id", "account_id")
                    .put("from_date", "from_date")
                    .put("limit", "1")
                    .put("offset", "0")
                    .put("platform", "twitter")
                    .put("post_id", "post_id")
                    .put("to_date", "to_date")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AnalyticsRetrieveParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
