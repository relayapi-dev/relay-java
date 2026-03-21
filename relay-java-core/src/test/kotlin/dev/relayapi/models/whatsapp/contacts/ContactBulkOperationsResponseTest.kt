// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.whatsapp.contacts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactBulkOperationsResponseTest {

    @Test
    fun create() {
        val contactBulkOperationsResponse =
            ContactBulkOperationsResponse.builder().affected(0.0).build()

        assertThat(contactBulkOperationsResponse.affected()).isEqualTo(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contactBulkOperationsResponse =
            ContactBulkOperationsResponse.builder().affected(0.0).build()

        val roundtrippedContactBulkOperationsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contactBulkOperationsResponse),
                jacksonTypeRef<ContactBulkOperationsResponse>(),
            )

        assertThat(roundtrippedContactBulkOperationsResponse)
            .isEqualTo(contactBulkOperationsResponse)
    }
}
