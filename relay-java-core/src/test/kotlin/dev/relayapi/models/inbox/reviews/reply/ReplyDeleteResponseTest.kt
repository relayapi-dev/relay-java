// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.inbox.reviews.reply

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReplyDeleteResponseTest {

    @Test
    fun create() {
        val replyDeleteResponse = ReplyDeleteResponse.builder().success(true).build()

        assertThat(replyDeleteResponse.success()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val replyDeleteResponse = ReplyDeleteResponse.builder().success(true).build()

        val roundtrippedReplyDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(replyDeleteResponse),
                jacksonTypeRef<ReplyDeleteResponse>(),
            )

        assertThat(roundtrippedReplyDeleteResponse).isEqualTo(replyDeleteResponse)
    }
}
