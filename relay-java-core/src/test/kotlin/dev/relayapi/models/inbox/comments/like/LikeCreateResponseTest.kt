// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.inbox.comments.like

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LikeCreateResponseTest {

    @Test
    fun create() {
        val likeCreateResponse =
            LikeCreateResponse.builder().success(true).commentId("comment_id").build()

        assertThat(likeCreateResponse.success()).isEqualTo(true)
        assertThat(likeCreateResponse.commentId()).contains("comment_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val likeCreateResponse =
            LikeCreateResponse.builder().success(true).commentId("comment_id").build()

        val roundtrippedLikeCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(likeCreateResponse),
                jacksonTypeRef<LikeCreateResponse>(),
            )

        assertThat(roundtrippedLikeCreateResponse).isEqualTo(likeCreateResponse)
    }
}
