// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.whatsapp.contacts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactRetrieveResponseTest {

    @Test
    fun create() {
        val contactRetrieveResponse =
            ContactRetrieveResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .optedIn(true)
                .phone("phone")
                .email("email")
                .addGroup("string")
                .name("name")
                .addTag("string")
                .build()

        assertThat(contactRetrieveResponse.id()).isEqualTo("id")
        assertThat(contactRetrieveResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(contactRetrieveResponse.optedIn()).isEqualTo(true)
        assertThat(contactRetrieveResponse.phone()).isEqualTo("phone")
        assertThat(contactRetrieveResponse.email()).contains("email")
        assertThat(contactRetrieveResponse.groups().getOrNull()).containsExactly("string")
        assertThat(contactRetrieveResponse.name()).contains("name")
        assertThat(contactRetrieveResponse.tags().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contactRetrieveResponse =
            ContactRetrieveResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .optedIn(true)
                .phone("phone")
                .email("email")
                .addGroup("string")
                .name("name")
                .addTag("string")
                .build()

        val roundtrippedContactRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contactRetrieveResponse),
                jacksonTypeRef<ContactRetrieveResponse>(),
            )

        assertThat(roundtrippedContactRetrieveResponse).isEqualTo(contactRetrieveResponse)
    }
}
