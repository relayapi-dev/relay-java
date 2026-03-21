// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.whatsapp.businessprofile

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BusinessProfileUpdateParamsTest {

    @Test
    fun create() {
        BusinessProfileUpdateParams.builder()
            .accountId("account_id")
            .about("about")
            .address("address")
            .description("description")
            .email("email")
            .addWebsite("string")
            .build()
    }

    @Test
    fun body() {
        val params =
            BusinessProfileUpdateParams.builder()
                .accountId("account_id")
                .about("about")
                .address("address")
                .description("description")
                .email("email")
                .addWebsite("string")
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.about()).contains("about")
        assertThat(body.address()).contains("address")
        assertThat(body.description()).contains("description")
        assertThat(body.email()).contains("email")
        assertThat(body.websites().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = BusinessProfileUpdateParams.builder().accountId("account_id").build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_id")
    }
}
