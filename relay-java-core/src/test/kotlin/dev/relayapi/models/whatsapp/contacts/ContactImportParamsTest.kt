// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.whatsapp.contacts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactImportParamsTest {

    @Test
    fun create() {
        ContactImportParams.builder()
            .accountId("account_id")
            .addContact(
                ContactImportParams.Contact.builder()
                    .phone("phone")
                    .email("email")
                    .name("name")
                    .addTag("string")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            ContactImportParams.builder()
                .accountId("account_id")
                .addContact(
                    ContactImportParams.Contact.builder()
                        .phone("phone")
                        .email("email")
                        .name("name")
                        .addTag("string")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.contacts())
            .containsExactly(
                ContactImportParams.Contact.builder()
                    .phone("phone")
                    .email("email")
                    .name("name")
                    .addTag("string")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ContactImportParams.builder()
                .accountId("account_id")
                .addContact(ContactImportParams.Contact.builder().phone("phone").build())
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.contacts())
            .containsExactly(ContactImportParams.Contact.builder().phone("phone").build())
    }
}
