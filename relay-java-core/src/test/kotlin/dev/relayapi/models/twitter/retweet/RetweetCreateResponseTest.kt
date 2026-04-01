// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.twitter.retweet

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RetweetCreateResponseTest {

    @Test
    fun create() {
        val retweetCreateResponse =
            RetweetCreateResponse.builder()
                .success(true)
                .data(
                    RetweetCreateResponse.Data.builder()
                        .bookmarked(true)
                        .following(true)
                        .pendingFollow(true)
                        .retweeted(true)
                        .build()
                )
                .error(
                    RetweetCreateResponse.Error.builder()
                        .code("code")
                        .message("message")
                        .twitterErrorCode(0.0)
                        .build()
                )
                .build()

        assertThat(retweetCreateResponse.success()).isEqualTo(true)
        assertThat(retweetCreateResponse.data())
            .contains(
                RetweetCreateResponse.Data.builder()
                    .bookmarked(true)
                    .following(true)
                    .pendingFollow(true)
                    .retweeted(true)
                    .build()
            )
        assertThat(retweetCreateResponse.error())
            .contains(
                RetweetCreateResponse.Error.builder()
                    .code("code")
                    .message("message")
                    .twitterErrorCode(0.0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val retweetCreateResponse =
            RetweetCreateResponse.builder()
                .success(true)
                .data(
                    RetweetCreateResponse.Data.builder()
                        .bookmarked(true)
                        .following(true)
                        .pendingFollow(true)
                        .retweeted(true)
                        .build()
                )
                .error(
                    RetweetCreateResponse.Error.builder()
                        .code("code")
                        .message("message")
                        .twitterErrorCode(0.0)
                        .build()
                )
                .build()

        val roundtrippedRetweetCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(retweetCreateResponse),
                jacksonTypeRef<RetweetCreateResponse>(),
            )

        assertThat(roundtrippedRetweetCreateResponse).isEqualTo(retweetCreateResponse)
    }
}
