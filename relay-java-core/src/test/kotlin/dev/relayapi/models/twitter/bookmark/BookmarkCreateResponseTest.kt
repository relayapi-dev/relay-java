// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.twitter.bookmark

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BookmarkCreateResponseTest {

    @Test
    fun create() {
        val bookmarkCreateResponse = BookmarkCreateResponse.builder().success(true).build()

        assertThat(bookmarkCreateResponse.success()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bookmarkCreateResponse = BookmarkCreateResponse.builder().success(true).build()

        val roundtrippedBookmarkCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bookmarkCreateResponse),
                jacksonTypeRef<BookmarkCreateResponse>(),
            )

        assertThat(roundtrippedBookmarkCreateResponse).isEqualTo(bookmarkCreateResponse)
    }
}
