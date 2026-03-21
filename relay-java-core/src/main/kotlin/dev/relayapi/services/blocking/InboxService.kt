// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking

import dev.relayapi.core.ClientOptions
import dev.relayapi.services.blocking.inbox.CommentService
import dev.relayapi.services.blocking.inbox.MessageService
import dev.relayapi.services.blocking.inbox.ReviewService
import java.util.function.Consumer

interface InboxService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InboxService

    fun comments(): CommentService

    fun messages(): MessageService

    fun reviews(): ReviewService

    /** A view of [InboxService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): InboxService.WithRawResponse

        fun comments(): CommentService.WithRawResponse

        fun messages(): MessageService.WithRawResponse

        fun reviews(): ReviewService.WithRawResponse
    }
}
