// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.whatsapp.contacts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactListResponseTest {

    @Test
    fun create() {
        val contactListResponse =
            ContactListResponse.builder()
                .addData(
                    ContactListResponse.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .optedIn(true)
                        .phone("phone")
                        .email("email")
                        .addGroup("string")
                        .name("name")
                        .addTag("string")
                        .build()
                )
                .hasMore(true)
                .nextCursor("next_cursor")
                .build()

        assertThat(contactListResponse.data())
            .containsExactly(
                ContactListResponse.Data.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .optedIn(true)
                    .phone("phone")
                    .email("email")
                    .addGroup("string")
                    .name("name")
                    .addTag("string")
                    .build()
            )
        assertThat(contactListResponse.hasMore()).isEqualTo(true)
        assertThat(contactListResponse.nextCursor()).contains("next_cursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contactListResponse =
            ContactListResponse.builder()
                .addData(
                    ContactListResponse.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .optedIn(true)
                        .phone("phone")
                        .email("email")
                        .addGroup("string")
                        .name("name")
                        .addTag("string")
                        .build()
                )
                .hasMore(true)
                .nextCursor("next_cursor")
                .build()

        val roundtrippedContactListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contactListResponse),
                jacksonTypeRef<ContactListResponse>(),
            )

        assertThat(roundtrippedContactListResponse).isEqualTo(contactListResponse)
    }
}
