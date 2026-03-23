// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.apikeys

import dev.relayapi.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiKeyListParamsTest {

    @Test
    fun create() {
        ApiKeyListParams.builder()
            .cursor("cursor")
            .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .limit(1L)
            .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ApiKeyListParams.builder()
                .cursor("cursor")
                .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .limit(1L)
                .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("cursor", "cursor")
                    .put("from", "2019-12-27T18:11:19.117Z")
                    .put("limit", "1")
                    .put("to", "2019-12-27T18:11:19.117Z")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ApiKeyListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
