// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.accounts

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.models.accounts.facebookpages.FacebookPageSetDefaultParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FacebookPageServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val facebookPageService = client.accounts().facebookPages()

        val facebookPage = facebookPageService.retrieve("id")

        facebookPage.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun setDefault() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val facebookPageService = client.accounts().facebookPages()

        val response =
            facebookPageService.setDefault(
                FacebookPageSetDefaultParams.builder().id("id").pageId("page_id").build()
            )

        response.validate()
    }
}
