// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.whatsapp.contacts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactRetrieveParamsTest {

    @Test
    fun create() {
        ContactRetrieveParams.builder().contactId("contact_id").build()
    }

    @Test
    fun pathParams() {
        val params = ContactRetrieveParams.builder().contactId("contact_id").build()

        assertThat(params._pathParam(0)).isEqualTo("contact_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
