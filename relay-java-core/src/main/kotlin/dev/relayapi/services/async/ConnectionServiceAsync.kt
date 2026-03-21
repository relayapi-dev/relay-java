// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.connections.ConnectionListLogsParams
import dev.relayapi.models.connections.ConnectionListLogsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ConnectionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConnectionServiceAsync

    /** Returns connection event history for the organization. */
    fun listLogs(): CompletableFuture<ConnectionListLogsResponse> =
        listLogs(ConnectionListLogsParams.none())

    /** @see listLogs */
    fun listLogs(
        params: ConnectionListLogsParams = ConnectionListLogsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConnectionListLogsResponse>

    /** @see listLogs */
    fun listLogs(
        params: ConnectionListLogsParams = ConnectionListLogsParams.none()
    ): CompletableFuture<ConnectionListLogsResponse> = listLogs(params, RequestOptions.none())

    /** @see listLogs */
    fun listLogs(requestOptions: RequestOptions): CompletableFuture<ConnectionListLogsResponse> =
        listLogs(ConnectionListLogsParams.none(), requestOptions)

    /**
     * A view of [ConnectionServiceAsync] that provides access to raw HTTP responses for each
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
        ): ConnectionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/connections/logs`, but is otherwise the same as
         * [ConnectionServiceAsync.listLogs].
         */
        fun listLogs(): CompletableFuture<HttpResponseFor<ConnectionListLogsResponse>> =
            listLogs(ConnectionListLogsParams.none())

        /** @see listLogs */
        fun listLogs(
            params: ConnectionListLogsParams = ConnectionListLogsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConnectionListLogsResponse>>

        /** @see listLogs */
        fun listLogs(
            params: ConnectionListLogsParams = ConnectionListLogsParams.none()
        ): CompletableFuture<HttpResponseFor<ConnectionListLogsResponse>> =
            listLogs(params, RequestOptions.none())

        /** @see listLogs */
        fun listLogs(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ConnectionListLogsResponse>> =
            listLogs(ConnectionListLogsParams.none(), requestOptions)
    }
}
