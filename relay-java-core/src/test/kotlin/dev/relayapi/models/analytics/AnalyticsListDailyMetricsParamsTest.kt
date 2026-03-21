// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.analytics

import dev.relayapi.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnalyticsListDailyMetricsParamsTest {

    @Test
    fun create() {
        AnalyticsListDailyMetricsParams.builder()
            .accountId("account_id")
            .fromDate("from_date")
            .platform(AnalyticsListDailyMetricsParams.Platform.TWITTER)
            .toDate("to_date")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AnalyticsListDailyMetricsParams.builder()
                .accountId("account_id")
                .fromDate("from_date")
                .platform(AnalyticsListDailyMetricsParams.Platform.TWITTER)
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
        val params = AnalyticsListDailyMetricsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
