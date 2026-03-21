// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.reddit.RedditGetFeedParams
import dev.relayapi.models.reddit.RedditGetFeedResponse
import dev.relayapi.models.reddit.RedditSearchParams
import dev.relayapi.models.reddit.RedditSearchResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RedditServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RedditServiceAsync

    /** Get subreddit feed */
    fun getFeed(params: RedditGetFeedParams): CompletableFuture<RedditGetFeedResponse> =
        getFeed(params, RequestOptions.none())

    /** @see getFeed */
    fun getFeed(
        params: RedditGetFeedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RedditGetFeedResponse>

    /** Search Reddit posts */
    fun search(params: RedditSearchParams): CompletableFuture<RedditSearchResponse> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: RedditSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RedditSearchResponse>

    /**
     * A view of [RedditServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RedditServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/reddit/feed`, but is otherwise the same as
         * [RedditServiceAsync.getFeed].
         */
        fun getFeed(
            params: RedditGetFeedParams
        ): CompletableFuture<HttpResponseFor<RedditGetFeedResponse>> =
            getFeed(params, RequestOptions.none())

        /** @see getFeed */
        fun getFeed(
            params: RedditGetFeedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RedditGetFeedResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/reddit/search`, but is otherwise the same as
         * [RedditServiceAsync.search].
         */
        fun search(
            params: RedditSearchParams
        ): CompletableFuture<HttpResponseFor<RedditSearchResponse>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: RedditSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RedditSearchResponse>>
    }
}
