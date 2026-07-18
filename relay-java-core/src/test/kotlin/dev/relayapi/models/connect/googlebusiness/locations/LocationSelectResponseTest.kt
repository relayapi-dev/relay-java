// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.connect.googlebusiness.locations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.JsonValue
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LocationSelectResponseTest {

    @Test
    fun create() {
        val locationSelectResponse =
            LocationSelectResponse.builder()
                .account(
                    LocationSelectResponse.Account.builder()
                        .id("id")
                        .avatarUrl("avatar_url")
                        .connectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .displayName("display_name")
                        .metadata(
                            LocationSelectResponse.Account.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .platform(LocationSelectResponse.Account.Platform.TWITTER)
                        .platformAccountId("platform_account_id")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .username("username")
                        .workspace(
                            LocationSelectResponse.Account.Workspace.builder()
                                .id("id")
                                .name("name")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(locationSelectResponse.account())
            .isEqualTo(
                LocationSelectResponse.Account.builder()
                    .id("id")
                    .avatarUrl("avatar_url")
                    .connectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .displayName("display_name")
                    .metadata(
                        LocationSelectResponse.Account.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .platform(LocationSelectResponse.Account.Platform.TWITTER)
                    .platformAccountId("platform_account_id")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .username("username")
                    .workspace(
                        LocationSelectResponse.Account.Workspace.builder()
                            .id("id")
                            .name("name")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val locationSelectResponse =
            LocationSelectResponse.builder()
                .account(
                    LocationSelectResponse.Account.builder()
                        .id("id")
                        .avatarUrl("avatar_url")
                        .connectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .displayName("display_name")
                        .metadata(
                            LocationSelectResponse.Account.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .platform(LocationSelectResponse.Account.Platform.TWITTER)
                        .platformAccountId("platform_account_id")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .username("username")
                        .workspace(
                            LocationSelectResponse.Account.Workspace.builder()
                                .id("id")
                                .name("name")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedLocationSelectResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(locationSelectResponse),
                jacksonTypeRef<LocationSelectResponse>(),
            )

        assertThat(roundtrippedLocationSelectResponse).isEqualTo(locationSelectResponse)
    }
}
