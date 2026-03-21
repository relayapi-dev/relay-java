// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking

import dev.relayapi.core.ClientOptions
import dev.relayapi.services.blocking.twitter.BookmarkService
import dev.relayapi.services.blocking.twitter.BookmarkServiceImpl
import dev.relayapi.services.blocking.twitter.FollowService
import dev.relayapi.services.blocking.twitter.FollowServiceImpl
import dev.relayapi.services.blocking.twitter.RetweetService
import dev.relayapi.services.blocking.twitter.RetweetServiceImpl
import java.util.function.Consumer

class TwitterServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TwitterService {

    private val withRawResponse: TwitterService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val retweet: RetweetService by lazy { RetweetServiceImpl(clientOptions) }

    private val bookmark: BookmarkService by lazy { BookmarkServiceImpl(clientOptions) }

    private val follow: FollowService by lazy { FollowServiceImpl(clientOptions) }

    override fun withRawResponse(): TwitterService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TwitterService =
        TwitterServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retweet(): RetweetService = retweet

    override fun bookmark(): BookmarkService = bookmark

    override fun follow(): FollowService = follow

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TwitterService.WithRawResponse {

        private val retweet: RetweetService.WithRawResponse by lazy {
            RetweetServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val bookmark: BookmarkService.WithRawResponse by lazy {
            BookmarkServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val follow: FollowService.WithRawResponse by lazy {
            FollowServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TwitterService.WithRawResponse =
            TwitterServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun retweet(): RetweetService.WithRawResponse = retweet

        override fun bookmark(): BookmarkService.WithRawResponse = bookmark

        override fun follow(): FollowService.WithRawResponse = follow
    }
}
