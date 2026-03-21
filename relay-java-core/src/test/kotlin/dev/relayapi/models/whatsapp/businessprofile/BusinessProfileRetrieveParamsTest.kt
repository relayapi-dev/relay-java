// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.whatsapp.businessprofile

import dev.relayapi.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BusinessProfileRetrieveParamsTest {

    @Test
    fun create() {
        BusinessProfileRetrieveParams.builder().accountId("account_id").build()
    }

    @Test
    fun queryParams() {
        val params = BusinessProfileRetrieveParams.builder().accountId("account_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("account_id", "account_id").build())
    }
}
