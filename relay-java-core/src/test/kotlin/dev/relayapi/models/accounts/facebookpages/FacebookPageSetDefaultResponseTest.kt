// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.accounts.facebookpages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.JsonValue
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FacebookPageSetDefaultResponseTest {

    @Test
    fun create() {
        val facebookPageSetDefaultResponse =
            FacebookPageSetDefaultResponse.builder()
                .id("id")
                .avatarUrl("avatar_url")
                .connectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .displayName("display_name")
                .metadata(
                    FacebookPageSetDefaultResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .platform(FacebookPageSetDefaultResponse.Platform.TWITTER)
                .platformAccountId("platform_account_id")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .username("username")
                .build()

        assertThat(facebookPageSetDefaultResponse.id()).isEqualTo("id")
        assertThat(facebookPageSetDefaultResponse.avatarUrl()).contains("avatar_url")
        assertThat(facebookPageSetDefaultResponse.connectedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(facebookPageSetDefaultResponse.displayName()).contains("display_name")
        assertThat(facebookPageSetDefaultResponse.metadata())
            .contains(
                FacebookPageSetDefaultResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(facebookPageSetDefaultResponse.platform())
            .isEqualTo(FacebookPageSetDefaultResponse.Platform.TWITTER)
        assertThat(facebookPageSetDefaultResponse.platformAccountId())
            .isEqualTo("platform_account_id")
        assertThat(facebookPageSetDefaultResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(facebookPageSetDefaultResponse.username()).contains("username")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val facebookPageSetDefaultResponse =
            FacebookPageSetDefaultResponse.builder()
                .id("id")
                .avatarUrl("avatar_url")
                .connectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .displayName("display_name")
                .metadata(
                    FacebookPageSetDefaultResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .platform(FacebookPageSetDefaultResponse.Platform.TWITTER)
                .platformAccountId("platform_account_id")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .username("username")
                .build()

        val roundtrippedFacebookPageSetDefaultResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(facebookPageSetDefaultResponse),
                jacksonTypeRef<FacebookPageSetDefaultResponse>(),
            )

        assertThat(roundtrippedFacebookPageSetDefaultResponse)
            .isEqualTo(facebookPageSetDefaultResponse)
    }
}
