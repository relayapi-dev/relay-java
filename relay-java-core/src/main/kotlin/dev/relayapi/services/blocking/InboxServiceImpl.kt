// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking

import dev.relayapi.core.ClientOptions
import dev.relayapi.services.blocking.inbox.CommentService
import dev.relayapi.services.blocking.inbox.CommentServiceImpl
import dev.relayapi.services.blocking.inbox.MessageService
import dev.relayapi.services.blocking.inbox.MessageServiceImpl
import dev.relayapi.services.blocking.inbox.ReviewService
import dev.relayapi.services.blocking.inbox.ReviewServiceImpl
import java.util.function.Consumer

class InboxServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InboxService {

    private val withRawResponse: InboxService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val comments: CommentService by lazy { CommentServiceImpl(clientOptions) }

    private val messages: MessageService by lazy { MessageServiceImpl(clientOptions) }

    private val reviews: ReviewService by lazy { ReviewServiceImpl(clientOptions) }

    override fun withRawResponse(): InboxService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InboxService =
        InboxServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun comments(): CommentService = comments

    override fun messages(): MessageService = messages

    override fun reviews(): ReviewService = reviews

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InboxService.WithRawResponse {

        private val comments: CommentService.WithRawResponse by lazy {
            CommentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val messages: MessageService.WithRawResponse by lazy {
            MessageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val reviews: ReviewService.WithRawResponse by lazy {
            ReviewServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InboxService.WithRawResponse =
            InboxServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun comments(): CommentService.WithRawResponse = comments

        override fun messages(): MessageService.WithRawResponse = messages

        override fun reviews(): ReviewService.WithRawResponse = reviews
    }
}
