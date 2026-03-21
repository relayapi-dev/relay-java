// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.inbox.comments.hide

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HideCreateResponseTest {

    @Test
    fun create() {
        val hideCreateResponse =
            HideCreateResponse.builder().success(true).commentId("comment_id").build()

        assertThat(hideCreateResponse.success()).isEqualTo(true)
        assertThat(hideCreateResponse.commentId()).contains("comment_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val hideCreateResponse =
            HideCreateResponse.builder().success(true).commentId("comment_id").build()

        val roundtrippedHideCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(hideCreateResponse),
                jacksonTypeRef<HideCreateResponse>(),
            )

        assertThat(roundtrippedHideCreateResponse).isEqualTo(hideCreateResponse)
    }
}
