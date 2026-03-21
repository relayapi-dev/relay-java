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
                .addAccountId("string")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(accountGroupUpdateResponse.id()).isEqualTo("id")
        assertThat(accountGroupUpdateResponse.accountIds()).containsExactly("string")
        assertThat(accountGroupUpdateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                .addAccountId("string")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
