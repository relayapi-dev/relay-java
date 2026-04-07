// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.twitter.follow

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FollowUnfollowResponseTest {

    @Test
    fun create() {
        val followUnfollowResponse =
            FollowUnfollowResponse.builder()
                .success(true)
                .data(
                    FollowUnfollowResponse.Data.builder()
                        .bookmarked(true)
                        .following(true)
                        .pendingFollow(true)
                        .retweeted(true)
                        .build()
                )
                .error(
                    FollowUnfollowResponse.Error.builder()
                        .code("code")
                        .message("message")
                        .twitterErrorCode(0.0)
                        .build()
                )
                .build()

        assertThat(followUnfollowResponse.success()).isEqualTo(true)
        assertThat(followUnfollowResponse.data())
            .contains(
                FollowUnfollowResponse.Data.builder()
                    .bookmarked(true)
                    .following(true)
                    .pendingFollow(true)
                    .retweeted(true)
                    .build()
            )
        assertThat(followUnfollowResponse.error())
            .contains(
                FollowUnfollowResponse.Error.builder()
                    .code("code")
                    .message("message")
                    .twitterErrorCode(0.0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val followUnfollowResponse =
            FollowUnfollowResponse.builder()
                .success(true)
                .data(
                    FollowUnfollowResponse.Data.builder()
                        .bookmarked(true)
                        .following(true)
                        .pendingFollow(true)
                        .retweeted(true)
                        .build()
                )
                .error(
                    FollowUnfollowResponse.Error.builder()
                        .code("code")
                        .message("message")
                        .twitterErrorCode(0.0)
                        .build()
                )
                .build()

        val roundtrippedFollowUnfollowResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(followUnfollowResponse),
                jacksonTypeRef<FollowUnfollowResponse>(),
            )

        assertThat(roundtrippedFollowUnfollowResponse).isEqualTo(followUnfollowResponse)
    }
}
