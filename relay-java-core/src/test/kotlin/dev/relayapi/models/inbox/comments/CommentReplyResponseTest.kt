// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.inbox.comments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommentReplyResponseTest {

    @Test
    fun create() {
        val commentReplyResponse =
            CommentReplyResponse.builder().success(true).commentId("comment_id").build()

        assertThat(commentReplyResponse.success()).isEqualTo(true)
        assertThat(commentReplyResponse.commentId()).contains("comment_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val commentReplyResponse =
            CommentReplyResponse.builder().success(true).commentId("comment_id").build()

        val roundtrippedCommentReplyResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(commentReplyResponse),
                jacksonTypeRef<CommentReplyResponse>(),
            )

        assertThat(roundtrippedCommentReplyResponse).isEqualTo(commentReplyResponse)
    }
}
