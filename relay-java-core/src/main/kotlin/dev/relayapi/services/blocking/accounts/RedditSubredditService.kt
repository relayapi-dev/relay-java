// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.accounts

import com.google.errorprone.annotations.MustBeClosed
import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.accounts.redditsubreddits.RedditSubredditRetrieveParams
import dev.relayapi.models.accounts.redditsubreddits.RedditSubredditRetrieveResponse
import dev.relayapi.models.accounts.redditsubreddits.RedditSubredditSetDefaultParams
import dev.relayapi.models.accounts.redditsubreddits.RedditSubredditSetDefaultResponse
import java.util.function.Consumer

interface RedditSubredditService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RedditSubredditService

    /** Fetch Reddit subreddits for an account */
    fun retrieve(id: String): RedditSubredditRetrieveResponse =
        retrieve(id, RedditSubredditRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: RedditSubredditRetrieveParams = RedditSubredditRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RedditSubredditRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: RedditSubredditRetrieveParams = RedditSubredditRetrieveParams.none(),
    ): RedditSubredditRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RedditSubredditRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RedditSubredditRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: RedditSubredditRetrieveParams): RedditSubredditRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): RedditSubredditRetrieveResponse =
        retrieve(id, RedditSubredditRetrieveParams.none(), requestOptions)

    /** Set default Reddit subreddit */
    fun setDefault(
        id: String,
        params: RedditSubredditSetDefaultParams,
    ): RedditSubredditSetDefaultResponse = setDefault(id, params, RequestOptions.none())

    /** @see setDefault */
    fun setDefault(
        id: String,
        params: RedditSubredditSetDefaultParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RedditSubredditSetDefaultResponse =
        setDefault(params.toBuilder().id(id).build(), requestOptions)

    /** @see setDefault */
    fun setDefault(params: RedditSubredditSetDefaultParams): RedditSubredditSetDefaultResponse =
        setDefault(params, RequestOptions.none())

    /** @see setDefault */
    fun setDefault(
        params: RedditSubredditSetDefaultParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RedditSubredditSetDefaultResponse

    /**
     * A view of [RedditSubredditService] that provides access to raw HTTP responses for each
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
        ): RedditSubredditService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/accounts/{id}/reddit-subreddits`, but is
         * otherwise the same as [RedditSubredditService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<RedditSubredditRetrieveResponse> =
            retrieve(id, RedditSubredditRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: RedditSubredditRetrieveParams = RedditSubredditRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RedditSubredditRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: RedditSubredditRetrieveParams = RedditSubredditRetrieveParams.none(),
        ): HttpResponseFor<RedditSubredditRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RedditSubredditRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RedditSubredditRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RedditSubredditRetrieveParams
        ): HttpResponseFor<RedditSubredditRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RedditSubredditRetrieveResponse> =
            retrieve(id, RedditSubredditRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/accounts/{id}/reddit-subreddits`, but is
         * otherwise the same as [RedditSubredditService.setDefault].
         */
        @MustBeClosed
        fun setDefault(
            id: String,
            params: RedditSubredditSetDefaultParams,
        ): HttpResponseFor<RedditSubredditSetDefaultResponse> =
            setDefault(id, params, RequestOptions.none())

        /** @see setDefault */
        @MustBeClosed
        fun setDefault(
            id: String,
            params: RedditSubredditSetDefaultParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RedditSubredditSetDefaultResponse> =
            setDefault(params.toBuilder().id(id).build(), requestOptions)

        /** @see setDefault */
        @MustBeClosed
        fun setDefault(
            params: RedditSubredditSetDefaultParams
        ): HttpResponseFor<RedditSubredditSetDefaultResponse> =
            setDefault(params, RequestOptions.none())

        /** @see setDefault */
        @MustBeClosed
        fun setDefault(
            params: RedditSubredditSetDefaultParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RedditSubredditSetDefaultResponse>
    }
}
