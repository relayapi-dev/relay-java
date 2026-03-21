// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.inbox.comments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommentPrivateReplyResponseTest {

    @Test
    fun create() {
        val commentPrivateReplyResponse =
            CommentPrivateReplyResponse.builder().success(true).commentId("comment_id").build()

        assertThat(commentPrivateReplyResponse.success()).isEqualTo(true)
        assertThat(commentPrivateReplyResponse.commentId()).contains("comment_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val commentPrivateReplyResponse =
            CommentPrivateReplyResponse.builder().success(true).commentId("comment_id").build()

        val roundtrippedCommentPrivateReplyResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(commentPrivateReplyResponse),
                jacksonTypeRef<CommentPrivateReplyResponse>(),
            )

        assertThat(roundtrippedCommentPrivateReplyResponse).isEqualTo(commentPrivateReplyResponse)
    }
}
