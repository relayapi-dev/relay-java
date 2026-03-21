// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.analytics.youtube

import dev.relayapi.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class YoutubeGetDailyViewsParamsTest {

    @Test
    fun create() {
        YoutubeGetDailyViewsParams.builder()
            .accountId("account_id")
            .fromDate("from_date")
            .toDate("to_date")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            YoutubeGetDailyViewsParams.builder()
                .accountId("account_id")
                .fromDate("from_date")
                .toDate("to_date")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("account_id", "account_id")
                    .put("from_date", "from_date")
                    .put("to_date", "to_date")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = YoutubeGetDailyViewsParams.builder().accountId("account_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("account_id", "account_id").build())
    }
}
