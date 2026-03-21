// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.whatsapp.contacts

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactBulkOperationsParamsTest {

    @Test
    fun create() {
        ContactBulkOperationsParams.builder()
            .accountId("account_id")
            .action(ContactBulkOperationsParams.Action.ADD_TAGS)
            .addContactId("string")
            .addTag("string")
            .build()
    }

    @Test
    fun body() {
        val params =
            ContactBulkOperationsParams.builder()
                .accountId("account_id")
                .action(ContactBulkOperationsParams.Action.ADD_TAGS)
                .addContactId("string")
                .addTag("string")
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.action()).isEqualTo(ContactBulkOperationsParams.Action.ADD_TAGS)
        assertThat(body.contactIds()).containsExactly("string")
        assertThat(body.tags().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ContactBulkOperationsParams.builder()
                .accountId("account_id")
                .action(ContactBulkOperationsParams.Action.ADD_TAGS)
                .addContactId("string")
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.action()).isEqualTo(ContactBulkOperationsParams.Action.ADD_TAGS)
        assertThat(body.contactIds()).containsExactly("string")
    }
}
