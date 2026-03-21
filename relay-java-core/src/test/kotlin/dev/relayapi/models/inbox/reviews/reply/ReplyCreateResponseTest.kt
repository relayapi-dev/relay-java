// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.inbox.reviews.reply

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReplyCreateResponseTest {

    @Test
    fun create() {
        val replyCreateResponse = ReplyCreateResponse.builder().success(true).build()

        assertThat(replyCreateResponse.success()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val replyCreateResponse = ReplyCreateResponse.builder().success(true).build()

        val roundtrippedReplyCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(replyCreateResponse),
                jacksonTypeRef<ReplyCreateResponse>(),
            )

        assertThat(roundtrippedReplyCreateResponse).isEqualTo(replyCreateResponse)
    }
}
