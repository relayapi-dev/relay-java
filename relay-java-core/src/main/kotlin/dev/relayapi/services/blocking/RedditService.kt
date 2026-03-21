// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.reddit.RedditGetFeedParams
import dev.relayapi.models.reddit.RedditGetFeedResponse
import dev.relayapi.models.reddit.RedditSearchParams
import dev.relayapi.models.reddit.RedditSearchResponse
import java.util.function.Consumer

interface RedditService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RedditService

    /** Get subreddit feed */
    fun getFeed(params: RedditGetFeedParams): RedditGetFeedResponse =
        getFeed(params, RequestOptions.none())

    /** @see getFeed */
    fun getFeed(
        params: RedditGetFeedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RedditGetFeedResponse

    /** Search Reddit posts */
    fun search(params: RedditSearchParams): RedditSearchResponse =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: RedditSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RedditSearchResponse

    /** A view of [RedditService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RedditService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/reddit/feed`, but is otherwise the same as
         * [RedditService.getFeed].
         */
        @MustBeClosed
        fun getFeed(params: RedditGetFeedParams): HttpResponseFor<RedditGetFeedResponse> =
            getFeed(params, RequestOptions.none())

        /** @see getFeed */
        @MustBeClosed
        fun getFeed(
            params: RedditGetFeedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RedditGetFeedResponse>

        /**
         * Returns a raw HTTP response for `get /v1/reddit/search`, but is otherwise the same as
         * [RedditService.search].
         */
        @MustBeClosed
        fun search(params: RedditSearchParams): HttpResponseFor<RedditSearchResponse> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: RedditSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RedditSearchResponse>
    }
}
