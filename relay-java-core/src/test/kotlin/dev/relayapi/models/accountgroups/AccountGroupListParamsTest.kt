// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.accountgroups

import dev.relayapi.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountGroupListParamsTest {

    @Test
    fun create() {
        AccountGroupListParams.builder().cursor("cursor").limit(1.0).search("search").build()
    }

    @Test
    fun queryParams() {
        val params =
            AccountGroupListParams.builder().cursor("cursor").limit(1.0).search("search").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("cursor", "cursor")
                    .put("limit", "1.0")
                    .put("search", "search")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AccountGroupListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
