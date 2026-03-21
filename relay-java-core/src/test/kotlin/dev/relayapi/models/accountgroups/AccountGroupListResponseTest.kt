// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.accountgroups

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountGroupListResponseTest {

    @Test
    fun create() {
        val accountGroupListResponse =
            AccountGroupListResponse.builder()
                .addData(
                    AccountGroupListResponse.Data.builder()
                        .id("id")
                        .addAccountId("string")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(accountGroupListResponse.data())
            .containsExactly(
                AccountGroupListResponse.Data.builder()
                    .id("id")
                    .addAccountId("string")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("name")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountGroupListResponse =
            AccountGroupListResponse.builder()
                .addData(
                    AccountGroupListResponse.Data.builder()
                        .id("id")
                        .addAccountId("string")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedAccountGroupListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountGroupListResponse),
                jacksonTypeRef<AccountGroupListResponse>(),
            )

        assertThat(roundtrippedAccountGroupListResponse).isEqualTo(accountGroupListResponse)
    }
}
