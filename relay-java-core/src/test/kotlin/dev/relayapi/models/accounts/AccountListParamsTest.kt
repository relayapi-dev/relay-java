// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.accounts

import dev.relayapi.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountListParamsTest {

    @Test
    fun create() {
        AccountListParams.builder()
            .cursor("cursor")
            .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .limit(1L)
            .platforms("platforms")
            .search("search")
            .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .ungrouped(true)
            .workspaceId("workspace_id")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AccountListParams.builder()
                .cursor("cursor")
                .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .limit(1L)
                .platforms("platforms")
                .search("search")
                .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .ungrouped(true)
                .workspaceId("workspace_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("cursor", "cursor")
                    .put("from", "2019-12-27T18:11:19.117Z")
                    .put("limit", "1")
                    .put("platforms", "platforms")
                    .put("search", "search")
                    .put("to", "2019-12-27T18:11:19.117Z")
                    .put("ungrouped", "true")
                    .put("workspace_id", "workspace_id")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AccountListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
