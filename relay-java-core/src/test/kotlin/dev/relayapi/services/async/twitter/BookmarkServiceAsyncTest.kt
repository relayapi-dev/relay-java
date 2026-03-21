// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.twitter

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.models.twitter.bookmark.BookmarkCreateParams
import dev.relayapi.models.twitter.bookmark.BookmarkRemoveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BookmarkServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val bookmarkServiceAsync = client.twitter().bookmark()

        val bookmarkFuture =
            bookmarkServiceAsync.create(
                BookmarkCreateParams.builder().accountId("account_id").tweetId("tweet_id").build()
            )

        val bookmark = bookmarkFuture.get()
        bookmark.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun remove() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val bookmarkServiceAsync = client.twitter().bookmark()

        val bookmarkFuture =
            bookmarkServiceAsync.remove(
                BookmarkRemoveParams.builder().accountId("account_id").tweetId("tweet_id").build()
            )

        val bookmark = bookmarkFuture.get()
        bookmark.validate()
    }
}
