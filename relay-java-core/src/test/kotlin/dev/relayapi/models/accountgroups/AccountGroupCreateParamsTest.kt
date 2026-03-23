// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.accountgroups

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountGroupCreateParamsTest {

    @Test
    fun create() {
        AccountGroupCreateParams.builder().name("x").addAccountId("string").build()
    }

    @Test
    fun body() {
        val params = AccountGroupCreateParams.builder().name("x").addAccountId("string").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("x")
        assertThat(body.accountIds().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AccountGroupCreateParams.builder().name("x").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("x")
    }
}
