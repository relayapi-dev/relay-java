// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async

import dev.relayapi.core.ClientOptions
import dev.relayapi.services.async.twitter.BookmarkServiceAsync
import dev.relayapi.services.async.twitter.BookmarkServiceAsyncImpl
import dev.relayapi.services.async.twitter.FollowServiceAsync
import dev.relayapi.services.async.twitter.FollowServiceAsyncImpl
import dev.relayapi.services.async.twitter.RetweetServiceAsync
import dev.relayapi.services.async.twitter.RetweetServiceAsyncImpl
import java.util.function.Consumer

class TwitterServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TwitterServiceAsync {

    private val withRawResponse: TwitterServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val retweet: RetweetServiceAsync by lazy { RetweetServiceAsyncImpl(clientOptions) }

    private val bookmark: BookmarkServiceAsync by lazy { BookmarkServiceAsyncImpl(clientOptions) }

    private val follow: FollowServiceAsync by lazy { FollowServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): TwitterServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TwitterServiceAsync =
        TwitterServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retweet(): RetweetServiceAsync = retweet

    override fun bookmark(): BookmarkServiceAsync = bookmark

    override fun follow(): FollowServiceAsync = follow

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TwitterServiceAsync.WithRawResponse {

        private val retweet: RetweetServiceAsync.WithRawResponse by lazy {
            RetweetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val bookmark: BookmarkServiceAsync.WithRawResponse by lazy {
            BookmarkServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val follow: FollowServiceAsync.WithRawResponse by lazy {
            FollowServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TwitterServiceAsync.WithRawResponse =
            TwitterServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun retweet(): RetweetServiceAsync.WithRawResponse = retweet

        override fun bookmark(): BookmarkServiceAsync.WithRawResponse = bookmark

        override fun follow(): FollowServiceAsync.WithRawResponse = follow
    }
}
