// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.whatsapp.groups

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupCreateParamsTest {

    @Test
    fun create() {
        GroupCreateParams.builder()
            .accountId("account_id")
            .name("name")
            .addContactId("string")
            .description("description")
            .build()
    }

    @Test
    fun body() {
        val params =
            GroupCreateParams.builder()
                .accountId("account_id")
                .name("name")
                .addContactId("string")
                .description("description")
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.contactIds().getOrNull()).containsExactly("string")
        assertThat(body.description()).contains("description")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = GroupCreateParams.builder().accountId("account_id").name("name").build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.name()).isEqualTo("name")
    }
}
