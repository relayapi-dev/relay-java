// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.accounts

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.models.accounts.facebookpages.FacebookPageSetDefaultParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FacebookPageServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val facebookPageServiceAsync = client.accounts().facebookPages()

        val facebookPageFuture = facebookPageServiceAsync.retrieve("id")

        val facebookPage = facebookPageFuture.get()
        facebookPage.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun setDefault() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val facebookPageServiceAsync = client.accounts().facebookPages()

        val responseFuture =
            facebookPageServiceAsync.setDefault(
                FacebookPageSetDefaultParams.builder().id("id").pageId("page_id").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
