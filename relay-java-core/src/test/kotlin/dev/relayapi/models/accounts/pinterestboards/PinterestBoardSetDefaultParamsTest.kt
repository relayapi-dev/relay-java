// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.accounts.pinterestboards

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PinterestBoardSetDefaultParamsTest {

    @Test
    fun create() {
        PinterestBoardSetDefaultParams.builder().id("id").boardId("board_id").build()
    }

    @Test
    fun pathParams() {
        val params = PinterestBoardSetDefaultParams.builder().id("id").boardId("board_id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params = PinterestBoardSetDefaultParams.builder().id("id").boardId("board_id").build()

        val body = params._body()

        assertThat(body.boardId()).isEqualTo("board_id")
    }
}
