// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.whatsapp.contacts

import dev.relayapi.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactListParamsTest {

    @Test
    fun create() {
        ContactListParams.builder()
            .accountId("account_id")
            .cursor("cursor")
            .limit(1L)
            .search("search")
            .tag("tag")
            .workspaceId("workspace_id")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ContactListParams.builder()
                .accountId("account_id")
                .cursor("cursor")
                .limit(1L)
                .search("search")
                .tag("tag")
                .workspaceId("workspace_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("account_id", "account_id")
                    .put("cursor", "cursor")
                    .put("limit", "1")
                    .put("search", "search")
                    .put("tag", "tag")
                    .put("workspace_id", "workspace_id")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ContactListParams.builder().accountId("account_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("account_id", "account_id").build())
    }
}
