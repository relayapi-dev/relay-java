// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.connect

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConnectCreateBlueskyConnectionParamsTest {

    @Test
    fun create() {
        ConnectCreateBlueskyConnectionParams.builder()
            .appPassword("app_password")
            .handle("handle")
            .build()
    }

    @Test
    fun body() {
        val params =
            ConnectCreateBlueskyConnectionParams.builder()
                .appPassword("app_password")
                .handle("handle")
                .build()

        val body = params._body()

        assertThat(body.appPassword()).isEqualTo("app_password")
        assertThat(body.handle()).isEqualTo("handle")
    }
}
