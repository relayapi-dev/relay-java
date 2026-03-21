// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.accounts

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.accounts.redditsubreddits.RedditSubredditRetrieveParams
import dev.relayapi.models.accounts.redditsubreddits.RedditSubredditRetrieveResponse
import dev.relayapi.models.accounts.redditsubreddits.RedditSubredditSetDefaultParams
import dev.relayapi.models.accounts.redditsubreddits.RedditSubredditSetDefaultResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RedditSubredditServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RedditSubredditServiceAsync

    /** Fetch Reddit subreddits for an account */
    fun retrieve(id: String): CompletableFuture<RedditSubredditRetrieveResponse> =
        retrieve(id, RedditSubredditRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: RedditSubredditRetrieveParams = RedditSubredditRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RedditSubredditRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: RedditSubredditRetrieveParams = RedditSubredditRetrieveParams.none(),
    ): CompletableFuture<RedditSubredditRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RedditSubredditRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RedditSubredditRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: RedditSubredditRetrieveParams
    ): CompletableFuture<RedditSubredditRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RedditSubredditRetrieveResponse> =
        retrieve(id, RedditSubredditRetrieveParams.none(), requestOptions)

    /** Set default Reddit subreddit */
    fun setDefault(
        id: String,
        params: RedditSubredditSetDefaultParams,
    ): CompletableFuture<RedditSubredditSetDefaultResponse> =
        setDefault(id, params, RequestOptions.none())

    /** @see setDefault */
    fun setDefault(
        id: String,
        params: RedditSubredditSetDefaultParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RedditSubredditSetDefaultResponse> =
        setDefault(params.toBuilder().id(id).build(), requestOptions)

    /** @see setDefault */
    fun setDefault(
        params: RedditSubredditSetDefaultParams
    ): CompletableFuture<RedditSubredditSetDefaultResponse> =
        setDefault(params, RequestOptions.none())

    /** @see setDefault */
    fun setDefault(
        params: RedditSubredditSetDefaultParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RedditSubredditSetDefaultResponse>

    /**
     * A view of [RedditSubredditServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RedditSubredditServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/accounts/{id}/reddit-subreddits`, but is
         * otherwise the same as [RedditSubredditServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<RedditSubredditRetrieveResponse>> =
            retrieve(id, RedditSubredditRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: RedditSubredditRetrieveParams = RedditSubredditRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RedditSubredditRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: RedditSubredditRetrieveParams = RedditSubredditRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<RedditSubredditRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: RedditSubredditRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RedditSubredditRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: RedditSubredditRetrieveParams
        ): CompletableFuture<HttpResponseFor<RedditSubredditRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RedditSubredditRetrieveResponse>> =
            retrieve(id, RedditSubredditRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/accounts/{id}/reddit-subreddits`, but is
         * otherwise the same as [RedditSubredditServiceAsync.setDefault].
         */
        fun setDefault(
            id: String,
            params: RedditSubredditSetDefaultParams,
        ): CompletableFuture<HttpResponseFor<RedditSubredditSetDefaultResponse>> =
            setDefault(id, params, RequestOptions.none())

        /** @see setDefault */
        fun setDefault(
            id: String,
            params: RedditSubredditSetDefaultParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RedditSubredditSetDefaultResponse>> =
            setDefault(params.toBuilder().id(id).build(), requestOptions)

        /** @see setDefault */
        fun setDefault(
            params: RedditSubredditSetDefaultParams
        ): CompletableFuture<HttpResponseFor<RedditSubredditSetDefaultResponse>> =
            setDefault(params, RequestOptions.none())

        /** @see setDefault */
        fun setDefault(
            params: RedditSubredditSetDefaultParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RedditSubredditSetDefaultResponse>>
    }
}
