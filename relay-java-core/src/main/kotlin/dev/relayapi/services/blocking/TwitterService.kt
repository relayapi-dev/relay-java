// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking

import dev.relayapi.core.ClientOptions
import dev.relayapi.services.blocking.twitter.BookmarkService
import dev.relayapi.services.blocking.twitter.FollowService
import dev.relayapi.services.blocking.twitter.RetweetService
import java.util.function.Consumer

interface TwitterService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TwitterService

    fun retweet(): RetweetService

    fun bookmark(): BookmarkService

    fun follow(): FollowService

    /** A view of [TwitterService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TwitterService.WithRawResponse

        fun retweet(): RetweetService.WithRawResponse

        fun bookmark(): BookmarkService.WithRawResponse

        fun follow(): FollowService.WithRawResponse
    }
}
