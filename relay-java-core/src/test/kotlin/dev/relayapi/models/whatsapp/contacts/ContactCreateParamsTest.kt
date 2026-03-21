// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.whatsapp.contacts

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactCreateParamsTest {

    @Test
    fun create() {
        ContactCreateParams.builder()
            .accountId("account_id")
            .phone("phone")
            .email("email")
            .name("name")
            .addTag("string")
            .build()
    }

    @Test
    fun body() {
        val params =
            ContactCreateParams.builder()
                .accountId("account_id")
                .phone("phone")
                .email("email")
                .name("name")
                .addTag("string")
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.phone()).isEqualTo("phone")
        assertThat(body.email()).contains("email")
        assertThat(body.name()).contains("name")
        assertThat(body.tags().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ContactCreateParams.builder().accountId("account_id").phone("phone").build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.phone()).isEqualTo("phone")
    }
}
