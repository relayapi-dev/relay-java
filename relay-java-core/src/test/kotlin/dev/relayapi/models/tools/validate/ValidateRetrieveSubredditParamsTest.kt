// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.tools.validate

import dev.relayapi.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ValidateRetrieveSubredditParamsTest {

    @Test
    fun create() {
        ValidateRetrieveSubredditParams.builder().name("name").build()
    }

    @Test
    fun queryParams() {
        val params = ValidateRetrieveSubredditParams.builder().name("name").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("name", "name").build())
    }
}
