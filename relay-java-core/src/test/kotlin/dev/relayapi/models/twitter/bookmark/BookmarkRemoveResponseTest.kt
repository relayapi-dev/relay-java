// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.twitter.bookmark

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BookmarkRemoveResponseTest {

    @Test
    fun create() {
        val bookmarkRemoveResponse = BookmarkRemoveResponse.builder().success(true).build()

        assertThat(bookmarkRemoveResponse.success()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bookmarkRemoveResponse = BookmarkRemoveResponse.builder().success(true).build()

        val roundtrippedBookmarkRemoveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bookmarkRemoveResponse),
                jacksonTypeRef<BookmarkRemoveResponse>(),
            )

        assertThat(roundtrippedBookmarkRemoveResponse).isEqualTo(bookmarkRemoveResponse)
    }
}
