// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.inbox.comments

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.models.inbox.comments.hide.HideCreateParams
import dev.relayapi.models.inbox.comments.hide.HideDeleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class HideServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val hideService = client.inbox().comments().hide()

        val hide =
            hideService.create(
                HideCreateParams.builder().commentId("comment_id").accountId("account_id").build()
            )

        hide.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val hideService = client.inbox().comments().hide()

        val hide =
            hideService.delete(
                HideDeleteParams.builder().commentId("comment_id").accountId("account_id").build()
            )

        hide.validate()
    }
}
