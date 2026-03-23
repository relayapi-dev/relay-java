// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.accountgroups

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountGroupUpdateResponseTest {

    @Test
    fun create() {
        val accountGroupUpdateResponse =
            AccountGroupUpdateResponse.builder()
                .id("id")
                .accountCount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .name("name")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(accountGroupUpdateResponse.id()).isEqualTo("id")
        assertThat(accountGroupUpdateResponse.accountCount()).isEqualTo(0.0)
        assertThat(accountGroupUpdateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountGroupUpdateResponse.description()).contains("description")
        assertThat(accountGroupUpdateResponse.name()).isEqualTo("name")
        assertThat(accountGroupUpdateResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountGroupUpdateResponse =
            AccountGroupUpdateResponse.builder()
                .id("id")
                .accountCount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .name("name")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedAccountGroupUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountGroupUpdateResponse),
                jacksonTypeRef<AccountGroupUpdateResponse>(),
            )

        assertThat(roundtrippedAccountGroupUpdateResponse).isEqualTo(accountGroupUpdateResponse)
    }
}
