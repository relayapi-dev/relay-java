// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.queue

import dev.relayapi.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QueuePreviewParamsTest {

    @Test
    fun create() {
        QueuePreviewParams.builder().count(1L).build()
    }

    @Test
    fun queryParams() {
        val params = QueuePreviewParams.builder().count(1L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("count", "1").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = QueuePreviewParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
