// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.connect.pinterest

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.models.connect.pinterest.boards.BoardSelectParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BoardServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val boardServiceAsync = client.connect().pinterest().boards()

        val boardsFuture = boardServiceAsync.list()

        val boards = boardsFuture.get()
        boards.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun select() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val boardServiceAsync = client.connect().pinterest().boards()

        val responseFuture =
            boardServiceAsync.select(
                BoardSelectParams.builder()
                    .boardId("board_id")
                    .connectToken("connect_token")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
