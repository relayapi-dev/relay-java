// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.posts

import dev.relayapi.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PostListParamsTest {

    @Test
    fun create() {
        PostListParams.builder()
            .accountId("account_id")
            .cursor("cursor")
            .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .include("include")
            .limit(1L)
            .status(PostListParams.Status.DRAFT)
            .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .workspaceId("workspace_id")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PostListParams.builder()
                .accountId("account_id")
                .cursor("cursor")
                .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .include("include")
                .limit(1L)
                .status(PostListParams.Status.DRAFT)
                .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .workspaceId("workspace_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("account_id", "account_id")
                    .put("cursor", "cursor")
                    .put("from", "2019-12-27T18:11:19.117Z")
                    .put("include", "include")
                    .put("limit", "1")
                    .put("status", "draft")
                    .put("to", "2019-12-27T18:11:19.117Z")
                    .put("workspace_id", "workspace_id")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PostListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
