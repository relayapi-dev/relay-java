// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.connections.ConnectionListLogsParams
import dev.relayapi.models.connections.ConnectionListLogsResponse
import java.util.function.Consumer

interface ConnectionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConnectionService

    /** Returns connection event history for the organization. */
    fun listLogs(): ConnectionListLogsResponse = listLogs(ConnectionListLogsParams.none())

    /** @see listLogs */
    fun listLogs(
        params: ConnectionListLogsParams = ConnectionListLogsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionListLogsResponse

    /** @see listLogs */
    fun listLogs(
        params: ConnectionListLogsParams = ConnectionListLogsParams.none()
    ): ConnectionListLogsResponse = listLogs(params, RequestOptions.none())

    /** @see listLogs */
    fun listLogs(requestOptions: RequestOptions): ConnectionListLogsResponse =
        listLogs(ConnectionListLogsParams.none(), requestOptions)

    /** A view of [ConnectionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConnectionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/connections/logs`, but is otherwise the same as
         * [ConnectionService.listLogs].
         */
        @MustBeClosed
        fun listLogs(): HttpResponseFor<ConnectionListLogsResponse> =
            listLogs(ConnectionListLogsParams.none())

        /** @see listLogs */
        @MustBeClosed
        fun listLogs(
            params: ConnectionListLogsParams = ConnectionListLogsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConnectionListLogsResponse>

        /** @see listLogs */
        @MustBeClosed
        fun listLogs(
            params: ConnectionListLogsParams = ConnectionListLogsParams.none()
        ): HttpResponseFor<ConnectionListLogsResponse> = listLogs(params, RequestOptions.none())

        /** @see listLogs */
        @MustBeClosed
        fun listLogs(requestOptions: RequestOptions): HttpResponseFor<ConnectionListLogsResponse> =
            listLogs(ConnectionListLogsParams.none(), requestOptions)
    }
}
