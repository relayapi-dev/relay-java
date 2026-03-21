// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.inbox.comments.hide

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HideDeleteResponseTest {

    @Test
    fun create() {
        val hideDeleteResponse =
            HideDeleteResponse.builder().success(true).commentId("comment_id").build()

        assertThat(hideDeleteResponse.success()).isEqualTo(true)
        assertThat(hideDeleteResponse.commentId()).contains("comment_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val hideDeleteResponse =
            HideDeleteResponse.builder().success(true).commentId("comment_id").build()

        val roundtrippedHideDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(hideDeleteResponse),
                jacksonTypeRef<HideDeleteResponse>(),
            )

        assertThat(roundtrippedHideDeleteResponse).isEqualTo(hideDeleteResponse)
    }
}
