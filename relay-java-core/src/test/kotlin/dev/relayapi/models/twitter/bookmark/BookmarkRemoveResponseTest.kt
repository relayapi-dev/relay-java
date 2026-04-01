// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.twitter.bookmark

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BookmarkRemoveResponseTest {

    @Test
    fun create() {
        val bookmarkRemoveResponse =
            BookmarkRemoveResponse.builder()
                .success(true)
                .data(
                    BookmarkRemoveResponse.Data.builder()
                        .bookmarked(true)
                        .following(true)
                        .pendingFollow(true)
                        .retweeted(true)
                        .build()
                )
                .error(
                    BookmarkRemoveResponse.Error.builder()
                        .code("code")
                        .message("message")
                        .twitterErrorCode(0.0)
                        .build()
                )
                .build()

        assertThat(bookmarkRemoveResponse.success()).isEqualTo(true)
        assertThat(bookmarkRemoveResponse.data())
            .contains(
                BookmarkRemoveResponse.Data.builder()
                    .bookmarked(true)
                    .following(true)
                    .pendingFollow(true)
                    .retweeted(true)
                    .build()
            )
        assertThat(bookmarkRemoveResponse.error())
            .contains(
                BookmarkRemoveResponse.Error.builder()
                    .code("code")
                    .message("message")
                    .twitterErrorCode(0.0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bookmarkRemoveResponse =
            BookmarkRemoveResponse.builder()
                .success(true)
                .data(
                    BookmarkRemoveResponse.Data.builder()
                        .bookmarked(true)
                        .following(true)
                        .pendingFollow(true)
                        .retweeted(true)
                        .build()
                )
                .error(
                    BookmarkRemoveResponse.Error.builder()
                        .code("code")
                        .message("message")
                        .twitterErrorCode(0.0)
                        .build()
                )
                .build()

        val roundtrippedBookmarkRemoveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bookmarkRemoveResponse),
                jacksonTypeRef<BookmarkRemoveResponse>(),
            )

        assertThat(roundtrippedBookmarkRemoveResponse).isEqualTo(bookmarkRemoveResponse)
    }
}
