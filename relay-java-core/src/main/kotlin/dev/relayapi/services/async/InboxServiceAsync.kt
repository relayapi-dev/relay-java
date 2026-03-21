// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async

import dev.relayapi.core.ClientOptions
import dev.relayapi.services.async.inbox.CommentServiceAsync
import dev.relayapi.services.async.inbox.MessageServiceAsync
import dev.relayapi.services.async.inbox.ReviewServiceAsync
import java.util.function.Consumer

interface InboxServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InboxServiceAsync

    fun comments(): CommentServiceAsync

    fun messages(): MessageServiceAsync

    fun reviews(): ReviewServiceAsync

    /** A view of [InboxServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InboxServiceAsync.WithRawResponse

        fun comments(): CommentServiceAsync.WithRawResponse

        fun messages(): MessageServiceAsync.WithRawResponse

        fun reviews(): ReviewServiceAsync.WithRawResponse
    }
}
