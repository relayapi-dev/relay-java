// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.accounts

import com.google.errorprone.annotations.MustBeClosed
import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.accounts.redditflairs.RedditFlairRetrieveParams
import dev.relayapi.models.accounts.redditflairs.RedditFlairRetrieveResponse
import java.util.function.Consumer

interface RedditFlairService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RedditFlairService

    /** Fetch Reddit flairs for a subreddit */
    fun retrieve(id: String, params: RedditFlairRetrieveParams): RedditFlairRetrieveResponse =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: RedditFlairRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RedditFlairRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: RedditFlairRetrieveParams): RedditFlairRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RedditFlairRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RedditFlairRetrieveResponse

    /**
     * A view of [RedditFlairService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RedditFlairService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/accounts/{id}/reddit-flairs`, but is otherwise
         * the same as [RedditFlairService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: RedditFlairRetrieveParams,
        ): HttpResponseFor<RedditFlairRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: RedditFlairRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RedditFlairRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RedditFlairRetrieveParams
        ): HttpResponseFor<RedditFlairRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RedditFlairRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RedditFlairRetrieveResponse>
    }
}
