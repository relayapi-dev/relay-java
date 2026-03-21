// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.connect.snapchat.profiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProfileListResponseTest {

    @Test
    fun create() {
        val profileListResponse =
            ProfileListResponse.builder()
                .addProfile(
                    ProfileListResponse.Profile.builder()
                        .id("id")
                        .displayName("display_name")
                        .username("username")
                        .profileImageUrl("profile_image_url")
                        .subscriberCount(0L)
                        .build()
                )
                .build()

        assertThat(profileListResponse.profiles())
            .containsExactly(
                ProfileListResponse.Profile.builder()
                    .id("id")
                    .displayName("display_name")
                    .username("username")
                    .profileImageUrl("profile_image_url")
                    .subscriberCount(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val profileListResponse =
            ProfileListResponse.builder()
                .addProfile(
                    ProfileListResponse.Profile.builder()
                        .id("id")
                        .displayName("display_name")
                        .username("username")
                        .profileImageUrl("profile_image_url")
                        .subscriberCount(0L)
                        .build()
                )
                .build()

        val roundtrippedProfileListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(profileListResponse),
                jacksonTypeRef<ProfileListResponse>(),
            )

        assertThat(roundtrippedProfileListResponse).isEqualTo(profileListResponse)
    }
}
