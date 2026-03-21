// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.connect.facebook

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.models.connect.facebook.pages.PageSelectParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PageServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val pageServiceAsync = client.connect().facebook().pages()

        val pagesFuture = pageServiceAsync.list()

        val pages = pagesFuture.get()
        pages.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun select() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val pageServiceAsync = client.connect().facebook().pages()

        val responseFuture =
            pageServiceAsync.select(
                PageSelectParams.builder().connectToken("connect_token").pageId("page_id").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
