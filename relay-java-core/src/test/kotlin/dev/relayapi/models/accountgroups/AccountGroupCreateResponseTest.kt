// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.accountgroups

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountGroupCreateResponseTest {

    @Test
    fun create() {
        val accountGroupCreateResponse =
            AccountGroupCreateResponse.builder()
                .id("id")
                .accountCount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .name("name")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(accountGroupCreateResponse.id()).isEqualTo("id")
        assertThat(accountGroupCreateResponse.accountCount()).isEqualTo(0.0)
        assertThat(accountGroupCreateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountGroupCreateResponse.description()).contains("description")
        assertThat(accountGroupCreateResponse.name()).isEqualTo("name")
        assertThat(accountGroupCreateResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountGroupCreateResponse =
            AccountGroupCreateResponse.builder()
                .id("id")
                .accountCount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .name("name")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedAccountGroupCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountGroupCreateResponse),
                jacksonTypeRef<AccountGroupCreateResponse>(),
            )

        assertThat(roundtrippedAccountGroupCreateResponse).isEqualTo(accountGroupCreateResponse)
    }
}
