// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.accountgroups

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountGroupUpdateParamsTest {

    @Test
    fun create() {
        AccountGroupUpdateParams.builder().id("id").description("description").name("x").build()
    }

    @Test
    fun pathParams() {
        val params = AccountGroupUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AccountGroupUpdateParams.builder().id("id").description("description").name("x").build()

        val body = params._body()

        assertThat(body.description()).contains("description")
        assertThat(body.name()).contains("x")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AccountGroupUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
