// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.whatsapp.groups

import dev.relayapi.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupListParamsTest {

    @Test
    fun create() {
        GroupListParams.builder().accountId("account_id").build()
    }

    @Test
    fun queryParams() {
        val params = GroupListParams.builder().accountId("account_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("account_id", "account_id").build())
    }
}
