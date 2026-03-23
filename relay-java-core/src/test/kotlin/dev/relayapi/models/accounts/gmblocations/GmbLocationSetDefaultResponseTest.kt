// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.accounts.gmblocations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.JsonValue
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GmbLocationSetDefaultResponseTest {

    @Test
    fun create() {
        val gmbLocationSetDefaultResponse =
            GmbLocationSetDefaultResponse.builder()
                .id("id")
                .avatarUrl("avatar_url")
                .connectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .displayName("display_name")
                .group(GmbLocationSetDefaultResponse.Group.builder().id("id").name("name").build())
                .metadata(
                    GmbLocationSetDefaultResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .platform(GmbLocationSetDefaultResponse.Platform.TWITTER)
                .platformAccountId("platform_account_id")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .username("username")
                .build()

        assertThat(gmbLocationSetDefaultResponse.id()).isEqualTo("id")
        assertThat(gmbLocationSetDefaultResponse.avatarUrl()).contains("avatar_url")
        assertThat(gmbLocationSetDefaultResponse.connectedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(gmbLocationSetDefaultResponse.displayName()).contains("display_name")
        assertThat(gmbLocationSetDefaultResponse.group())
            .contains(GmbLocationSetDefaultResponse.Group.builder().id("id").name("name").build())
        assertThat(gmbLocationSetDefaultResponse.metadata())
            .contains(
                GmbLocationSetDefaultResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(gmbLocationSetDefaultResponse.platform())
            .isEqualTo(GmbLocationSetDefaultResponse.Platform.TWITTER)
        assertThat(gmbLocationSetDefaultResponse.platformAccountId())
            .isEqualTo("platform_account_id")
        assertThat(gmbLocationSetDefaultResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(gmbLocationSetDefaultResponse.username()).contains("username")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val gmbLocationSetDefaultResponse =
            GmbLocationSetDefaultResponse.builder()
                .id("id")
                .avatarUrl("avatar_url")
                .connectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .displayName("display_name")
                .group(GmbLocationSetDefaultResponse.Group.builder().id("id").name("name").build())
                .metadata(
                    GmbLocationSetDefaultResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .platform(GmbLocationSetDefaultResponse.Platform.TWITTER)
                .platformAccountId("platform_account_id")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .username("username")
                .build()

        val roundtrippedGmbLocationSetDefaultResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(gmbLocationSetDefaultResponse),
                jacksonTypeRef<GmbLocationSetDefaultResponse>(),
            )

        assertThat(roundtrippedGmbLocationSetDefaultResponse)
            .isEqualTo(gmbLocationSetDefaultResponse)
    }
}
