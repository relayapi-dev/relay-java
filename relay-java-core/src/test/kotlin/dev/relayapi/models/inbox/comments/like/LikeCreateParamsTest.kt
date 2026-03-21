// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.inbox.comments.like

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LikeCreateParamsTest {

    @Test
    fun create() {
        LikeCreateParams.builder().commentId("comment_id").build()
    }

    @Test
    fun pathParams() {
        val params = LikeCreateParams.builder().commentId("comment_id").build()

        assertThat(params._pathParam(0)).isEqualTo("comment_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
