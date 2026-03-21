// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async

import dev.relayapi.core.ClientOptions
import dev.relayapi.services.async.twitter.BookmarkServiceAsync
import dev.relayapi.services.async.twitter.FollowServiceAsync
import dev.relayapi.services.async.twitter.RetweetServiceAsync
import java.util.function.Consumer

interface TwitterServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TwitterServiceAsync

    fun retweet(): RetweetServiceAsync

    fun bookmark(): BookmarkServiceAsync

    fun follow(): FollowServiceAsync

    /**
     * A view of [TwitterServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TwitterServiceAsync.WithRawResponse

        fun retweet(): RetweetServiceAsync.WithRawResponse

        fun bookmark(): BookmarkServiceAsync.WithRawResponse

        fun follow(): FollowServiceAsync.WithRawResponse
    }
}
