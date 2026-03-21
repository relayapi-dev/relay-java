// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.inbox.comments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommentDeleteResponseTest {

    @Test
    fun create() {
        val commentDeleteResponse =
            CommentDeleteResponse.builder().success(true).commentId("comment_id").build()

        assertThat(commentDeleteResponse.success()).isEqualTo(true)
        assertThat(commentDeleteResponse.commentId()).contains("comment_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val commentDeleteResponse =
            CommentDeleteResponse.builder().success(true).commentId("comment_id").build()

        val roundtrippedCommentDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(commentDeleteResponse),
                jacksonTypeRef<CommentDeleteResponse>(),
            )

        assertThat(roundtrippedCommentDeleteResponse).isEqualTo(commentDeleteResponse)
    }
}
