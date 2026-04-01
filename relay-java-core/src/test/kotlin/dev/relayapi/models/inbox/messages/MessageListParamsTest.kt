// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.inbox.messages

import dev.relayapi.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageListParamsTest {

    @Test
    fun create() {
        MessageListParams.builder()
            .accountId("account_id")
            .cursor("cursor")
            .limit(1L)
            .platform(MessageListParams.Platform.TWITTER)
            .workspaceId("workspace_id")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            MessageListParams.builder()
                .accountId("account_id")
                .cursor("cursor")
                .limit(1L)
                .platform(MessageListParams.Platform.TWITTER)
                .workspaceId("workspace_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("account_id", "account_id")
                    .put("cursor", "cursor")
                    .put("limit", "1")
                    .put("platform", "twitter")
                    .put("workspace_id", "workspace_id")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = MessageListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
