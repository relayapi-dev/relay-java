// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.twitter.bookmark

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BookmarkCreateResponseTest {

    @Test
    fun create() {
        val bookmarkCreateResponse =
            BookmarkCreateResponse.builder()
                .success(true)
                .data(
                    BookmarkCreateResponse.Data.builder()
                        .bookmarked(true)
                        .following(true)
                        .pendingFollow(true)
                        .retweeted(true)
                        .build()
                )
                .error(
                    BookmarkCreateResponse.Error.builder()
                        .code("code")
                        .message("message")
                        .twitterErrorCode(0.0)
                        .build()
                )
                .build()

        assertThat(bookmarkCreateResponse.success()).isEqualTo(true)
        assertThat(bookmarkCreateResponse.data())
            .contains(
                BookmarkCreateResponse.Data.builder()
                    .bookmarked(true)
                    .following(true)
                    .pendingFollow(true)
                    .retweeted(true)
                    .build()
            )
        assertThat(bookmarkCreateResponse.error())
            .contains(
                BookmarkCreateResponse.Error.builder()
                    .code("code")
                    .message("message")
                    .twitterErrorCode(0.0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bookmarkCreateResponse =
            BookmarkCreateResponse.builder()
                .success(true)
                .data(
                    BookmarkCreateResponse.Data.builder()
                        .bookmarked(true)
                        .following(true)
                        .pendingFollow(true)
                        .retweeted(true)
                        .build()
                )
                .error(
                    BookmarkCreateResponse.Error.builder()
                        .code("code")
                        .message("message")
                        .twitterErrorCode(0.0)
                        .build()
                )
                .build()

        val roundtrippedBookmarkCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bookmarkCreateResponse),
                jacksonTypeRef<BookmarkCreateResponse>(),
            )

        assertThat(roundtrippedBookmarkCreateResponse).isEqualTo(bookmarkCreateResponse)
    }
}
