// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.connect.snapchat.profiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.JsonValue
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProfileSelectResponseTest {

    @Test
    fun create() {
        val profileSelectResponse =
            ProfileSelectResponse.builder()
                .account(
                    ProfileSelectResponse.Account.builder()
                        .id("id")
                        .avatarUrl("avatar_url")
                        .connectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .displayName("display_name")
                        .group(
                            ProfileSelectResponse.Account.Group.builder()
                                .id("id")
                                .name("name")
                                .build()
                        )
                        .metadata(
                            ProfileSelectResponse.Account.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .platform(ProfileSelectResponse.Account.Platform.TWITTER)
                        .platformAccountId("platform_account_id")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .username("username")
                        .build()
                )
                .build()

        assertThat(profileSelectResponse.account())
            .isEqualTo(
                ProfileSelectResponse.Account.builder()
                    .id("id")
                    .avatarUrl("avatar_url")
                    .connectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .displayName("display_name")
                    .group(
                        ProfileSelectResponse.Account.Group.builder().id("id").name("name").build()
                    )
                    .metadata(
                        ProfileSelectResponse.Account.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .platform(ProfileSelectResponse.Account.Platform.TWITTER)
                    .platformAccountId("platform_account_id")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .username("username")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val profileSelectResponse =
            ProfileSelectResponse.builder()
                .account(
                    ProfileSelectResponse.Account.builder()
                        .id("id")
                        .avatarUrl("avatar_url")
                        .connectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .displayName("display_name")
                        .group(
                            ProfileSelectResponse.Account.Group.builder()
                                .id("id")
                                .name("name")
                                .build()
                        )
                        .metadata(
                            ProfileSelectResponse.Account.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .platform(ProfileSelectResponse.Account.Platform.TWITTER)
                        .platformAccountId("platform_account_id")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .username("username")
                        .build()
                )
                .build()

        val roundtrippedProfileSelectResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(profileSelectResponse),
                jacksonTypeRef<ProfileSelectResponse>(),
            )

        assertThat(roundtrippedProfileSelectResponse).isEqualTo(profileSelectResponse)
    }
}
