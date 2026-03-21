// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.accounts

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.models.accounts.pinterestboards.PinterestBoardSetDefaultParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PinterestBoardServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val pinterestBoardService = client.accounts().pinterestBoards()

        val pinterestBoard = pinterestBoardService.retrieve("id")

        pinterestBoard.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun setDefault() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val pinterestBoardService = client.accounts().pinterestBoards()

        val response =
            pinterestBoardService.setDefault(
                PinterestBoardSetDefaultParams.builder().id("id").boardId("board_id").build()
            )

        response.validate()
    }
}
