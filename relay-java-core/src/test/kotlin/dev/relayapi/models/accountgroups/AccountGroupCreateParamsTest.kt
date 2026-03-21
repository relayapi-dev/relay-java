// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.accountgroups

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountGroupCreateParamsTest {

    @Test
    fun create() {
        AccountGroupCreateParams.builder().addAccountId("string").name("x").build()
    }

    @Test
    fun body() {
        val params = AccountGroupCreateParams.builder().addAccountId("string").name("x").build()

        val body = params._body()

        assertThat(body.accountIds()).containsExactly("string")
        assertThat(body.name()).isEqualTo("x")
    }
}
