// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.accounts.facebookpages

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FacebookPageSetDefaultParamsTest {

    @Test
    fun create() {
        FacebookPageSetDefaultParams.builder().id("id").pageId("page_id").build()
    }

    @Test
    fun pathParams() {
        val params = FacebookPageSetDefaultParams.builder().id("id").pageId("page_id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params = FacebookPageSetDefaultParams.builder().id("id").pageId("page_id").build()

        val body = params._body()

        assertThat(body.pageId()).isEqualTo("page_id")
    }
}
