// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.accounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.JsonValue
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountUpdateResponseTest {

    @Test
    fun create() {
        val accountUpdateResponse =
            AccountUpdateResponse.builder()
                .id("id")
                .avatarUrl("avatar_url")
                .connectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .displayName("display_name")
                .metadata(
                    AccountUpdateResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .platform(AccountUpdateResponse.Platform.TWITTER)
                .platformAccountId("platform_account_id")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .username("username")
                .build()

        assertThat(accountUpdateResponse.id()).isEqualTo("id")
        assertThat(accountUpdateResponse.avatarUrl()).contains("avatar_url")
        assertThat(accountUpdateResponse.connectedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountUpdateResponse.displayName()).contains("display_name")
        assertThat(accountUpdateResponse.metadata())
            .contains(
                AccountUpdateResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(accountUpdateResponse.platform())
            .isEqualTo(AccountUpdateResponse.Platform.TWITTER)
        assertThat(accountUpdateResponse.platformAccountId()).isEqualTo("platform_account_id")
        assertThat(accountUpdateResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountUpdateResponse.username()).contains("username")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountUpdateResponse =
            AccountUpdateResponse.builder()
                .id("id")
                .avatarUrl("avatar_url")
                .connectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .displayName("display_name")
                .metadata(
                    AccountUpdateResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .platform(AccountUpdateResponse.Platform.TWITTER)
                .platformAccountId("platform_account_id")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .username("username")
                .build()

        val roundtrippedAccountUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountUpdateResponse),
                jacksonTypeRef<AccountUpdateResponse>(),
            )

        assertThat(roundtrippedAccountUpdateResponse).isEqualTo(accountUpdateResponse)
    }
}
