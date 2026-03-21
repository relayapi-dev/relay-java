// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.accounts

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.accounts.redditflairs.RedditFlairRetrieveParams
import dev.relayapi.models.accounts.redditflairs.RedditFlairRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RedditFlairServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RedditFlairServiceAsync

    /** Fetch Reddit flairs for a subreddit */
    fun retrieve(
        id: String,
        params: RedditFlairRetrieveParams,
    ): CompletableFuture<RedditFlairRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: RedditFlairRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RedditFlairRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: RedditFlairRetrieveParams
    ): CompletableFuture<RedditFlairRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RedditFlairRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RedditFlairRetrieveResponse>

    /**
     * A view of [RedditFlairServiceAsync] that provides access to raw HTTP responses for each
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
        ): RedditFlairServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/accounts/{id}/reddit-flairs`, but is otherwise
         * the same as [RedditFlairServiceAsync.retrieve].
         */
        fun retrieve(
            id: String,
            params: RedditFlairRetrieveParams,
        ): CompletableFuture<HttpResponseFor<RedditFlairRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: RedditFlairRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RedditFlairRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: RedditFlairRetrieveParams
        ): CompletableFuture<HttpResponseFor<RedditFlairRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: RedditFlairRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RedditFlairRetrieveResponse>>
    }
}
