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
            .groupId("group_id")
            .limit(1L)
            .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PostListParams.builder()
                .accountId("account_id")
                .cursor("cursor")
                .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .groupId("group_id")
                .limit(1L)
                .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("account_id", "account_id")
                    .put("cursor", "cursor")
                    .put("from", "2019-12-27T18:11:19.117Z")
                    .put("group_id", "group_id")
                    .put("limit", "1")
                    .put("to", "2019-12-27T18:11:19.117Z")
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
