// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.twitter

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.models.twitter.bookmark.BookmarkCreateParams
import dev.relayapi.models.twitter.bookmark.BookmarkRemoveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BookmarkServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val bookmarkService = client.twitter().bookmark()

        val bookmark =
            bookmarkService.create(
                BookmarkCreateParams.builder().accountId("account_id").tweetId("tweet_id").build()
            )

        bookmark.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun remove() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val bookmarkService = client.twitter().bookmark()

        val bookmark =
            bookmarkService.remove(
                BookmarkRemoveParams.builder().accountId("account_id").tweetId("tweet_id").build()
            )

        bookmark.validate()
    }
}
