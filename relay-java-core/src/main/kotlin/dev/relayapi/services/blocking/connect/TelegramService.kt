// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.connect

import com.google.errorprone.annotations.MustBeClosed
import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.connect.telegram.TelegramConnectDirectlyParams
import dev.relayapi.models.connect.telegram.TelegramConnectDirectlyResponse
import dev.relayapi.models.connect.telegram.TelegramInitiateConnectionParams
import dev.relayapi.models.connect.telegram.TelegramInitiateConnectionResponse
import dev.relayapi.models.connect.telegram.TelegramPollConnectionStatusParams
import dev.relayapi.models.connect.telegram.TelegramPollConnectionStatusResponse
import java.util.function.Consumer

interface TelegramService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TelegramService

    /** Connect Telegram directly with chat ID */
    fun connectDirectly(params: TelegramConnectDirectlyParams): TelegramConnectDirectlyResponse =
        connectDirectly(params, RequestOptions.none())

    /** @see connectDirectly */
    fun connectDirectly(
        params: TelegramConnectDirectlyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TelegramConnectDirectlyResponse

    /** Generates a 6-character access code (valid 15 minutes). */
    fun initiateConnection(): TelegramInitiateConnectionResponse =
        initiateConnection(TelegramInitiateConnectionParams.none())

    /** @see initiateConnection */
    fun initiateConnection(
        params: TelegramInitiateConnectionParams = TelegramInitiateConnectionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TelegramInitiateConnectionResponse

    /** @see initiateConnection */
    fun initiateConnection(
        params: TelegramInitiateConnectionParams = TelegramInitiateConnectionParams.none()
    ): TelegramInitiateConnectionResponse = initiateConnection(params, RequestOptions.none())

    /** @see initiateConnection */
    fun initiateConnection(requestOptions: RequestOptions): TelegramInitiateConnectionResponse =
        initiateConnection(TelegramInitiateConnectionParams.none(), requestOptions)

    /** Poll Telegram connection status */
    fun pollConnectionStatus(
        params: TelegramPollConnectionStatusParams
    ): TelegramPollConnectionStatusResponse = pollConnectionStatus(params, RequestOptions.none())

    /** @see pollConnectionStatus */
    fun pollConnectionStatus(
        params: TelegramPollConnectionStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TelegramPollConnectionStatusResponse

    /** A view of [TelegramService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TelegramService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/connect/telegram/direct`, but is otherwise the
         * same as [TelegramService.connectDirectly].
         */
        @MustBeClosed
        fun connectDirectly(
            params: TelegramConnectDirectlyParams
        ): HttpResponseFor<TelegramConnectDirectlyResponse> =
            connectDirectly(params, RequestOptions.none())

        /** @see connectDirectly */
        @MustBeClosed
        fun connectDirectly(
            params: TelegramConnectDirectlyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TelegramConnectDirectlyResponse>

        /**
         * Returns a raw HTTP response for `post /v1/connect/telegram`, but is otherwise the same as
         * [TelegramService.initiateConnection].
         */
        @MustBeClosed
        fun initiateConnection(): HttpResponseFor<TelegramInitiateConnectionResponse> =
            initiateConnection(TelegramInitiateConnectionParams.none())

        /** @see initiateConnection */
        @MustBeClosed
        fun initiateConnection(
            params: TelegramInitiateConnectionParams = TelegramInitiateConnectionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TelegramInitiateConnectionResponse>

        /** @see initiateConnection */
        @MustBeClosed
        fun initiateConnection(
            params: TelegramInitiateConnectionParams = TelegramInitiateConnectionParams.none()
        ): HttpResponseFor<TelegramInitiateConnectionResponse> =
            initiateConnection(params, RequestOptions.none())

        /** @see initiateConnection */
        @MustBeClosed
        fun initiateConnection(
            requestOptions: RequestOptions
        ): HttpResponseFor<TelegramInitiateConnectionResponse> =
            initiateConnection(TelegramInitiateConnectionParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/connect/telegram`, but is otherwise the same as
         * [TelegramService.pollConnectionStatus].
         */
        @MustBeClosed
        fun pollConnectionStatus(
            params: TelegramPollConnectionStatusParams
        ): HttpResponseFor<TelegramPollConnectionStatusResponse> =
            pollConnectionStatus(params, RequestOptions.none())

        /** @see pollConnectionStatus */
        @MustBeClosed
        fun pollConnectionStatus(
            params: TelegramPollConnectionStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TelegramPollConnectionStatusResponse>
    }
}
