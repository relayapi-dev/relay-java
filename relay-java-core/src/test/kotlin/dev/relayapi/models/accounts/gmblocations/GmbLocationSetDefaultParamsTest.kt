// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.accounts.gmblocations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GmbLocationSetDefaultParamsTest {

    @Test
    fun create() {
        GmbLocationSetDefaultParams.builder().id("id").locationId("location_id").build()
    }

    @Test
    fun pathParams() {
        val params =
            GmbLocationSetDefaultParams.builder().id("id").locationId("location_id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            GmbLocationSetDefaultParams.builder().id("id").locationId("location_id").build()

        val body = params._body()

        assertThat(body.locationId()).isEqualTo("location_id")
    }
}
