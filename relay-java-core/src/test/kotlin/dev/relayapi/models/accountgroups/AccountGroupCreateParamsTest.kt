// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.accountgroups

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountGroupCreateParamsTest {

    @Test
    fun create() {
        AccountGroupCreateParams.builder().name("x").description("description").build()
    }

    @Test
    fun body() {
        val params = AccountGroupCreateParams.builder().name("x").description("description").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("x")
        assertThat(body.description()).contains("description")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AccountGroupCreateParams.builder().name("x").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("x")
    }
}
