// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.posts

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.posts.logs.LogListParams
import dev.relayapi.models.posts.logs.LogListResponse
import dev.relayapi.models.posts.logs.LogRetrieveParams
import dev.relayapi.models.posts.logs.LogRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LogServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LogServiceAsync

    /** Get publishing logs for a post */
    fun retrieve(id: String): CompletableFuture<LogRetrieveResponse> =
        retrieve(id, LogRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: LogRetrieveParams = LogRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LogRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: LogRetrieveParams = LogRetrieveParams.none(),
    ): CompletableFuture<LogRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: LogRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LogRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: LogRetrieveParams): CompletableFuture<LogRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LogRetrieveResponse> =
        retrieve(id, LogRetrieveParams.none(), requestOptions)

    /** Query publishing logs across all posts with pagination. */
    fun list(): CompletableFuture<LogListResponse> = list(LogListParams.none())

    /** @see list */
    fun list(
        params: LogListParams = LogListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LogListResponse>

    /** @see list */
    fun list(params: LogListParams = LogListParams.none()): CompletableFuture<LogListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<LogListResponse> =
        list(LogListParams.none(), requestOptions)

    /** A view of [LogServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LogServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/posts/{id}/logs`, but is otherwise the same as
         * [LogServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<LogRetrieveResponse>> =
            retrieve(id, LogRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: LogRetrieveParams = LogRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LogRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: LogRetrieveParams = LogRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<LogRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: LogRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LogRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: LogRetrieveParams
        ): CompletableFuture<HttpResponseFor<LogRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LogRetrieveResponse>> =
            retrieve(id, LogRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/posts/logs`, but is otherwise the same as
         * [LogServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<LogListResponse>> = list(LogListParams.none())

        /** @see list */
        fun list(
            params: LogListParams = LogListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LogListResponse>>

        /** @see list */
        fun list(
            params: LogListParams = LogListParams.none()
        ): CompletableFuture<HttpResponseFor<LogListResponse>> = list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LogListResponse>> =
            list(LogListParams.none(), requestOptions)
    }
}
