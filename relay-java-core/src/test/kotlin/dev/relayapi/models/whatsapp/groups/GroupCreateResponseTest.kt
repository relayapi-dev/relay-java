// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.whatsapp.groups

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupCreateResponseTest {

    @Test
    fun create() {
        val groupCreateResponse =
            GroupCreateResponse.builder()
                .id("id")
                .contactCount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .description("description")
                .build()

        assertThat(groupCreateResponse.id()).isEqualTo("id")
        assertThat(groupCreateResponse.contactCount()).isEqualTo(0.0)
        assertThat(groupCreateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(groupCreateResponse.name()).isEqualTo("name")
        assertThat(groupCreateResponse.description()).contains("description")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val groupCreateResponse =
            GroupCreateResponse.builder()
                .id("id")
                .contactCount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .description("description")
                .build()

        val roundtrippedGroupCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(groupCreateResponse),
                jacksonTypeRef<GroupCreateResponse>(),
            )

        assertThat(roundtrippedGroupCreateResponse).isEqualTo(groupCreateResponse)
    }
}
