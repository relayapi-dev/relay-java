// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.analytics

import dev.relayapi.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnalyticsGetPostingFrequencyParamsTest {

    @Test
    fun create() {
        AnalyticsGetPostingFrequencyParams.builder()
            .accountId("account_id")
            .fromDate("from_date")
            .platform(AnalyticsGetPostingFrequencyParams.Platform.TWITTER)
            .toDate("to_date")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AnalyticsGetPostingFrequencyParams.builder()
                .accountId("account_id")
                .fromDate("from_date")
                .platform(AnalyticsGetPostingFrequencyParams.Platform.TWITTER)
                .toDate("to_date")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("account_id", "account_id")
                    .put("from_date", "from_date")
                    .put("platform", "twitter")
                    .put("to_date", "to_date")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AnalyticsGetPostingFrequencyParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
