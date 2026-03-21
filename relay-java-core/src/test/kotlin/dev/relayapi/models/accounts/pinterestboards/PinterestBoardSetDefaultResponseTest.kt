// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.accounts.pinterestboards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.JsonValue
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PinterestBoardSetDefaultResponseTest {

    @Test
    fun create() {
        val pinterestBoardSetDefaultResponse =
            PinterestBoardSetDefaultResponse.builder()
                .id("id")
                .avatarUrl("avatar_url")
                .connectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .displayName("display_name")
                .metadata(
                    PinterestBoardSetDefaultResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .platform(PinterestBoardSetDefaultResponse.Platform.TWITTER)
                .platformAccountId("platform_account_id")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .username("username")
                .build()

        assertThat(pinterestBoardSetDefaultResponse.id()).isEqualTo("id")
        assertThat(pinterestBoardSetDefaultResponse.avatarUrl()).contains("avatar_url")
        assertThat(pinterestBoardSetDefaultResponse.connectedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(pinterestBoardSetDefaultResponse.displayName()).contains("display_name")
        assertThat(pinterestBoardSetDefaultResponse.metadata())
            .contains(
                PinterestBoardSetDefaultResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(pinterestBoardSetDefaultResponse.platform())
            .isEqualTo(PinterestBoardSetDefaultResponse.Platform.TWITTER)
        assertThat(pinterestBoardSetDefaultResponse.platformAccountId())
            .isEqualTo("platform_account_id")
        assertThat(pinterestBoardSetDefaultResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(pinterestBoardSetDefaultResponse.username()).contains("username")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pinterestBoardSetDefaultResponse =
            PinterestBoardSetDefaultResponse.builder()
                .id("id")
                .avatarUrl("avatar_url")
                .connectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .displayName("display_name")
                .metadata(
                    PinterestBoardSetDefaultResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .platform(PinterestBoardSetDefaultResponse.Platform.TWITTER)
                .platformAccountId("platform_account_id")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .username("username")
                .build()

        val roundtrippedPinterestBoardSetDefaultResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pinterestBoardSetDefaultResponse),
                jacksonTypeRef<PinterestBoardSetDefaultResponse>(),
            )

        assertThat(roundtrippedPinterestBoardSetDefaultResponse)
            .isEqualTo(pinterestBoardSetDefaultResponse)
    }
}
