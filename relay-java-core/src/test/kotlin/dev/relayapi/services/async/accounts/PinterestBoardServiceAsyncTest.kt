// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.accounts

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.models.accounts.pinterestboards.PinterestBoardSetDefaultParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PinterestBoardServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val pinterestBoardServiceAsync = client.accounts().pinterestBoards()

        val pinterestBoardFuture = pinterestBoardServiceAsync.retrieve("id")

        val pinterestBoard = pinterestBoardFuture.get()
        pinterestBoard.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun setDefault() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val pinterestBoardServiceAsync = client.accounts().pinterestBoards()

        val responseFuture =
            pinterestBoardServiceAsync.setDefault(
                PinterestBoardSetDefaultParams.builder().id("id").boardId("board_id").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
