// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.inbox.comments

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class HideServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val hideServiceAsync = client.inbox().comments().hide()

        val hideFuture = hideServiceAsync.create("comment_id")

        val hide = hideFuture.get()
        hide.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val hideServiceAsync = client.inbox().comments().hide()

        val hideFuture = hideServiceAsync.delete("comment_id")

        val hide = hideFuture.get()
        hide.validate()
    }
}
