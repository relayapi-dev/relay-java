// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.whatsapp.groups

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupListResponseTest {

    @Test
    fun create() {
        val groupListResponse =
            GroupListResponse.builder()
                .addData(
                    GroupListResponse.Data.builder()
                        .id("id")
                        .contactCount(0.0)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .description("description")
                        .build()
                )
                .build()

        assertThat(groupListResponse.data())
            .containsExactly(
                GroupListResponse.Data.builder()
                    .id("id")
                    .contactCount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("name")
                    .description("description")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val groupListResponse =
            GroupListResponse.builder()
                .addData(
                    GroupListResponse.Data.builder()
                        .id("id")
                        .contactCount(0.0)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .description("description")
                        .build()
                )
                .build()

        val roundtrippedGroupListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(groupListResponse),
                jacksonTypeRef<GroupListResponse>(),
            )

        assertThat(roundtrippedGroupListResponse).isEqualTo(groupListResponse)
    }
}
