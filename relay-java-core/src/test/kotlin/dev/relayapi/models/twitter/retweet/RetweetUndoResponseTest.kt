// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.twitter.retweet

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RetweetUndoResponseTest {

    @Test
    fun create() {
        val retweetUndoResponse =
            RetweetUndoResponse.builder()
                .success(true)
                .data(
                    RetweetUndoResponse.Data.builder()
                        .bookmarked(true)
                        .following(true)
                        .pendingFollow(true)
                        .retweeted(true)
                        .build()
                )
                .error(
                    RetweetUndoResponse.Error.builder()
                        .code("code")
                        .message("message")
                        .twitterErrorCode(0.0)
                        .build()
                )
                .build()

        assertThat(retweetUndoResponse.success()).isEqualTo(true)
        assertThat(retweetUndoResponse.data())
            .contains(
                RetweetUndoResponse.Data.builder()
                    .bookmarked(true)
                    .following(true)
                    .pendingFollow(true)
                    .retweeted(true)
                    .build()
            )
        assertThat(retweetUndoResponse.error())
            .contains(
                RetweetUndoResponse.Error.builder()
                    .code("code")
                    .message("message")
                    .twitterErrorCode(0.0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val retweetUndoResponse =
            RetweetUndoResponse.builder()
                .success(true)
                .data(
                    RetweetUndoResponse.Data.builder()
                        .bookmarked(true)
                        .following(true)
                        .pendingFollow(true)
                        .retweeted(true)
                        .build()
                )
                .error(
                    RetweetUndoResponse.Error.builder()
                        .code("code")
                        .message("message")
                        .twitterErrorCode(0.0)
                        .build()
                )
                .build()

        val roundtrippedRetweetUndoResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(retweetUndoResponse),
                jacksonTypeRef<RetweetUndoResponse>(),
            )

        assertThat(roundtrippedRetweetUndoResponse).isEqualTo(retweetUndoResponse)
    }
}
