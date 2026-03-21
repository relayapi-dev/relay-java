// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.whatsapp.contacts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactImportResponseTest {

    @Test
    fun create() {
        val contactImportResponse =
            ContactImportResponse.builder().failed(0.0).imported(0.0).skipped(0.0).build()

        assertThat(contactImportResponse.failed()).isEqualTo(0.0)
        assertThat(contactImportResponse.imported()).isEqualTo(0.0)
        assertThat(contactImportResponse.skipped()).isEqualTo(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contactImportResponse =
            ContactImportResponse.builder().failed(0.0).imported(0.0).skipped(0.0).build()

        val roundtrippedContactImportResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contactImportResponse),
                jacksonTypeRef<ContactImportResponse>(),
            )

        assertThat(roundtrippedContactImportResponse).isEqualTo(contactImportResponse)
    }
}
