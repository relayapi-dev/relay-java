// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.connect.facebook

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.models.connect.facebook.pages.PageSelectParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PageServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val pageService = client.connect().facebook().pages()

        val pages = pageService.list()

        pages.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun select() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val pageService = client.connect().facebook().pages()

        val response =
            pageService.select(
                PageSelectParams.builder().connectToken("connect_token").pageId("page_id").build()
            )

        response.validate()
    }
}
