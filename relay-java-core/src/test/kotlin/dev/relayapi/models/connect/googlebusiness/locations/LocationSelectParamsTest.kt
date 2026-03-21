// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.connect.googlebusiness.locations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LocationSelectParamsTest {

    @Test
    fun create() {
        LocationSelectParams.builder()
            .connectToken("connect_token")
            .locationId("location_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            LocationSelectParams.builder()
                .connectToken("connect_token")
                .locationId("location_id")
                .build()

        val body = params._body()

        assertThat(body.connectToken()).isEqualTo("connect_token")
        assertThat(body.locationId()).isEqualTo("location_id")
    }
}
