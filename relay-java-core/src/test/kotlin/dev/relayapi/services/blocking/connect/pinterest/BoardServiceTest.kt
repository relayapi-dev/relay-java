// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.connect.pinterest

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.models.connect.pinterest.boards.BoardSelectParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BoardServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val boardService = client.connect().pinterest().boards()

        val boards = boardService.list()

        boards.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun select() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val boardService = client.connect().pinterest().boards()

        val response =
            boardService.select(
                BoardSelectParams.builder()
                    .boardId("board_id")
                    .connectToken("connect_token")
                    .build()
            )

        response.validate()
    }
}
