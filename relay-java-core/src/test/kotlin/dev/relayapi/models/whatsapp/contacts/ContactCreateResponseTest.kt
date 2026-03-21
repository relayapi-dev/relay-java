// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.whatsapp.contacts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactCreateResponseTest {

    @Test
    fun create() {
        val contactCreateResponse =
            ContactCreateResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .optedIn(true)
                .phone("phone")
                .email("email")
                .addGroup("string")
                .name("name")
                .addTag("string")
                .build()

        assertThat(contactCreateResponse.id()).isEqualTo("id")
        assertThat(contactCreateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(contactCreateResponse.optedIn()).isEqualTo(true)
        assertThat(contactCreateResponse.phone()).isEqualTo("phone")
        assertThat(contactCreateResponse.email()).contains("email")
        assertThat(contactCreateResponse.groups().getOrNull()).containsExactly("string")
        assertThat(contactCreateResponse.name()).contains("name")
        assertThat(contactCreateResponse.tags().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contactCreateResponse =
            ContactCreateResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .optedIn(true)
                .phone("phone")
                .email("email")
                .addGroup("string")
                .name("name")
                .addTag("string")
                .build()

        val roundtrippedContactCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contactCreateResponse),
                jacksonTypeRef<ContactCreateResponse>(),
            )

        assertThat(roundtrippedContactCreateResponse).isEqualTo(contactCreateResponse)
    }
}
