// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.twitter.follow

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FollowCreateResponseTest {

    @Test
    fun create() {
        val followCreateResponse =
            FollowCreateResponse.builder()
                .success(true)
                .data(
                    FollowCreateResponse.Data.builder()
                        .bookmarked(true)
                        .following(true)
                        .pendingFollow(true)
                        .retweeted(true)
                        .build()
                )
                .error(
                    FollowCreateResponse.Error.builder()
                        .code("code")
                        .message("message")
                        .twitterErrorCode(0.0)
                        .build()
                )
                .build()

        assertThat(followCreateResponse.success()).isEqualTo(true)
        assertThat(followCreateResponse.data())
            .contains(
                FollowCreateResponse.Data.builder()
                    .bookmarked(true)
                    .following(true)
                    .pendingFollow(true)
                    .retweeted(true)
                    .build()
            )
        assertThat(followCreateResponse.error())
            .contains(
                FollowCreateResponse.Error.builder()
                    .code("code")
                    .message("message")
                    .twitterErrorCode(0.0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val followCreateResponse =
            FollowCreateResponse.builder()
                .success(true)
                .data(
                    FollowCreateResponse.Data.builder()
                        .bookmarked(true)
                        .following(true)
                        .pendingFollow(true)
                        .retweeted(true)
                        .build()
                )
                .error(
                    FollowCreateResponse.Error.builder()
                        .code("code")
                        .message("message")
                        .twitterErrorCode(0.0)
                        .build()
                )
                .build()

        val roundtrippedFollowCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(followCreateResponse),
                jacksonTypeRef<FollowCreateResponse>(),
            )

        assertThat(roundtrippedFollowCreateResponse).isEqualTo(followCreateResponse)
    }
}
