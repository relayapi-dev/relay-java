// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.posts

import com.google.errorprone.annotations.MustBeClosed
import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.posts.logs.LogListParams
import dev.relayapi.models.posts.logs.LogListResponse
import dev.relayapi.models.posts.logs.LogRetrieveParams
import dev.relayapi.models.posts.logs.LogRetrieveResponse
import java.util.function.Consumer

interface LogService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LogService

    /** Get publishing logs for a post */
    fun retrieve(id: String): LogRetrieveResponse = retrieve(id, LogRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: LogRetrieveParams = LogRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LogRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: LogRetrieveParams = LogRetrieveParams.none(),
    ): LogRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: LogRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LogRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: LogRetrieveParams): LogRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): LogRetrieveResponse =
        retrieve(id, LogRetrieveParams.none(), requestOptions)

    /** Query publishing logs across all posts with pagination. */
    fun list(): LogListResponse = list(LogListParams.none())

    /** @see list */
    fun list(
        params: LogListParams = LogListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LogListResponse

    /** @see list */
    fun list(params: LogListParams = LogListParams.none()): LogListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): LogListResponse =
        list(LogListParams.none(), requestOptions)

    /** A view of [LogService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LogService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/posts/{id}/logs`, but is otherwise the same as
         * [LogService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<LogRetrieveResponse> =
            retrieve(id, LogRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: LogRetrieveParams = LogRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LogRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: LogRetrieveParams = LogRetrieveParams.none(),
        ): HttpResponseFor<LogRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: LogRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LogRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: LogRetrieveParams): HttpResponseFor<LogRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LogRetrieveResponse> =
            retrieve(id, LogRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/posts/logs`, but is otherwise the same as
         * [LogService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<LogListResponse> = list(LogListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: LogListParams = LogListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LogListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: LogListParams = LogListParams.none()): HttpResponseFor<LogListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<LogListResponse> =
            list(LogListParams.none(), requestOptions)
    }
}
