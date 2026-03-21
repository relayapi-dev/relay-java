// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.connect

import dev.relayapi.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConnectFetchPendingDataParamsTest {

    @Test
    fun create() {
        ConnectFetchPendingDataParams.builder().token("token").build()
    }

    @Test
    fun queryParams() {
        val params = ConnectFetchPendingDataParams.builder().token("token").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("token", "token").build())
    }
}
