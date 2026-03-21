// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.whatsapp.broadcasts

import dev.relayapi.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BroadcastListParamsTest {

    @Test
    fun create() {
        BroadcastListParams.builder().accountId("account_id").build()
    }

    @Test
    fun queryParams() {
        val params = BroadcastListParams.builder().accountId("account_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("account_id", "account_id").build())
    }
}
