// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.analytics

import dev.relayapi.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnalyticsGetContentDecayParamsTest {

    @Test
    fun create() {
        AnalyticsGetContentDecayParams.builder().postId("post_id").days(1L).build()
    }

    @Test
    fun queryParams() {
        val params = AnalyticsGetContentDecayParams.builder().postId("post_id").days(1L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("post_id", "post_id").put("days", "1").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AnalyticsGetContentDecayParams.builder().postId("post_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("post_id", "post_id").build())
    }
}
