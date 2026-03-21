// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.connect.pinterest.boards

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BoardSelectParamsTest {

    @Test
    fun create() {
        BoardSelectParams.builder().boardId("board_id").connectToken("connect_token").build()
    }

    @Test
    fun body() {
        val params =
            BoardSelectParams.builder().boardId("board_id").connectToken("connect_token").build()

        val body = params._body()

        assertThat(body.boardId()).isEqualTo("board_id")
        assertThat(body.connectToken()).isEqualTo("connect_token")
    }
}
