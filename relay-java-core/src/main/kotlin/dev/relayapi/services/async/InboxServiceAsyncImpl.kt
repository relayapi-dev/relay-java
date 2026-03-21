// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async

import dev.relayapi.core.ClientOptions
import dev.relayapi.services.async.inbox.CommentServiceAsync
import dev.relayapi.services.async.inbox.CommentServiceAsyncImpl
import dev.relayapi.services.async.inbox.MessageServiceAsync
import dev.relayapi.services.async.inbox.MessageServiceAsyncImpl
import dev.relayapi.services.async.inbox.ReviewServiceAsync
import dev.relayapi.services.async.inbox.ReviewServiceAsyncImpl
import java.util.function.Consumer

class InboxServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    InboxServiceAsync {

    private val withRawResponse: InboxServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val comments: CommentServiceAsync by lazy { CommentServiceAsyncImpl(clientOptions) }

    private val messages: MessageServiceAsync by lazy { MessageServiceAsyncImpl(clientOptions) }

    private val reviews: ReviewServiceAsync by lazy { ReviewServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): InboxServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InboxServiceAsync =
        InboxServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun comments(): CommentServiceAsync = comments

    override fun messages(): MessageServiceAsync = messages

    override fun reviews(): ReviewServiceAsync = reviews

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InboxServiceAsync.WithRawResponse {

        private val comments: CommentServiceAsync.WithRawResponse by lazy {
            CommentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val messages: MessageServiceAsync.WithRawResponse by lazy {
            MessageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val reviews: ReviewServiceAsync.WithRawResponse by lazy {
            ReviewServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InboxServiceAsync.WithRawResponse =
            InboxServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun comments(): CommentServiceAsync.WithRawResponse = comments

        override fun messages(): MessageServiceAsync.WithRawResponse = messages

        override fun reviews(): ReviewServiceAsync.WithRawResponse = reviews
    }
}
