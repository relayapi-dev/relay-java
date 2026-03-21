// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.analytics

import dev.relayapi.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnalyticsGetPostTimelineParamsTest {

    @Test
    fun create() {
        AnalyticsGetPostTimelineParams.builder()
            .postId("post_id")
            .fromDate("from_date")
            .toDate("to_date")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AnalyticsGetPostTimelineParams.builder()
                .postId("post_id")
                .fromDate("from_date")
                .toDate("to_date")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("post_id", "post_id")
                    .put("from_date", "from_date")
                    .put("to_date", "to_date")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AnalyticsGetPostTimelineParams.builder().postId("post_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("post_id", "post_id").build())
    }
}
