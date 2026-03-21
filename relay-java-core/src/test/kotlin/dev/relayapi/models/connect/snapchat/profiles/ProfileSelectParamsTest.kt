// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.connect.snapchat.profiles

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProfileSelectParamsTest {

    @Test
    fun create() {
        ProfileSelectParams.builder().connectToken("connect_token").profileId("profile_id").build()
    }

    @Test
    fun body() {
        val params =
            ProfileSelectParams.builder()
                .connectToken("connect_token")
                .profileId("profile_id")
                .build()

        val body = params._body()

        assertThat(body.connectToken()).isEqualTo("connect_token")
        assertThat(body.profileId()).isEqualTo("profile_id")
    }
}
