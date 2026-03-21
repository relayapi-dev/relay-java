// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.inbox.comments.like

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LikeDeleteResponseTest {

    @Test
    fun create() {
        val likeDeleteResponse =
            LikeDeleteResponse.builder().success(true).commentId("comment_id").build()

        assertThat(likeDeleteResponse.success()).isEqualTo(true)
        assertThat(likeDeleteResponse.commentId()).contains("comment_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val likeDeleteResponse =
            LikeDeleteResponse.builder().success(true).commentId("comment_id").build()

        val roundtrippedLikeDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(likeDeleteResponse),
                jacksonTypeRef<LikeDeleteResponse>(),
            )

        assertThat(roundtrippedLikeDeleteResponse).isEqualTo(likeDeleteResponse)
    }
}
