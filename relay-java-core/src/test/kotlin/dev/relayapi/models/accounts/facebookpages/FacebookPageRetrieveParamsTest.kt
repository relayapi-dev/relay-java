// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.accounts.facebookpages

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FacebookPageRetrieveParamsTest {

    @Test
    fun create() {
        FacebookPageRetrieveParams.builder().id("id").build()
    }

    @Test
    fun pathParams() {
        val params = FacebookPageRetrieveParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
