// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.connect

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.connect.telegram.TelegramConnectDirectlyParams
import dev.relayapi.models.connect.telegram.TelegramConnectDirectlyResponse
import dev.relayapi.models.connect.telegram.TelegramInitiateConnectionParams
import dev.relayapi.models.connect.telegram.TelegramInitiateConnectionResponse
import dev.relayapi.models.connect.telegram.TelegramPollConnectionStatusParams
import dev.relayapi.models.connect.telegram.TelegramPollConnectionStatusResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TelegramServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TelegramServiceAsync

    /** Connect Telegram directly with chat ID */
    fun connectDirectly(
        params: TelegramConnectDirectlyParams
    ): CompletableFuture<TelegramConnectDirectlyResponse> =
        connectDirectly(params, RequestOptions.none())

    /** @see connectDirectly */
    fun connectDirectly(
        params: TelegramConnectDirectlyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TelegramConnectDirectlyResponse>

    /** Generates a 6-character access code (valid 15 minutes). */
    fun initiateConnection(): CompletableFuture<TelegramInitiateConnectionResponse> =
        initiateConnection(TelegramInitiateConnectionParams.none())

    /** @see initiateConnection */
    fun initiateConnection(
        params: TelegramInitiateConnectionParams = TelegramInitiateConnectionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TelegramInitiateConnectionResponse>

    /** @see initiateConnection */
    fun initiateConnection(
        params: TelegramInitiateConnectionParams = TelegramInitiateConnectionParams.none()
    ): CompletableFuture<TelegramInitiateConnectionResponse> =
        initiateConnection(params, RequestOptions.none())

    /** @see initiateConnection */
    fun initiateConnection(
        requestOptions: RequestOptions
    ): CompletableFuture<TelegramInitiateConnectionResponse> =
        initiateConnection(TelegramInitiateConnectionParams.none(), requestOptions)

    /** Poll Telegram connection status */
    fun pollConnectionStatus(
        params: TelegramPollConnectionStatusParams
    ): CompletableFuture<TelegramPollConnectionStatusResponse> =
        pollConnectionStatus(params, RequestOptions.none())

    /** @see pollConnectionStatus */
    fun pollConnectionStatus(
        params: TelegramPollConnectionStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TelegramPollConnectionStatusResponse>

    /**
     * A view of [TelegramServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TelegramServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/connect/telegram/direct`, but is otherwise the
         * same as [TelegramServiceAsync.connectDirectly].
         */
        fun connectDirectly(
            params: TelegramConnectDirectlyParams
        ): CompletableFuture<HttpResponseFor<TelegramConnectDirectlyResponse>> =
            connectDirectly(params, RequestOptions.none())

        /** @see connectDirectly */
        fun connectDirectly(
            params: TelegramConnectDirectlyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TelegramConnectDirectlyResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/connect/telegram`, but is otherwise the same as
         * [TelegramServiceAsync.initiateConnection].
         */
        fun initiateConnection():
            CompletableFuture<HttpResponseFor<TelegramInitiateConnectionResponse>> =
            initiateConnection(TelegramInitiateConnectionParams.none())

        /** @see initiateConnection */
        fun initiateConnection(
            params: TelegramInitiateConnectionParams = TelegramInitiateConnectionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TelegramInitiateConnectionResponse>>

        /** @see initiateConnection */
        fun initiateConnection(
            params: TelegramInitiateConnectionParams = TelegramInitiateConnectionParams.none()
        ): CompletableFuture<HttpResponseFor<TelegramInitiateConnectionResponse>> =
            initiateConnection(params, RequestOptions.none())

        /** @see initiateConnection */
        fun initiateConnection(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TelegramInitiateConnectionResponse>> =
            initiateConnection(TelegramInitiateConnectionParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/connect/telegram`, but is otherwise the same as
         * [TelegramServiceAsync.pollConnectionStatus].
         */
        fun pollConnectionStatus(
            params: TelegramPollConnectionStatusParams
        ): CompletableFuture<HttpResponseFor<TelegramPollConnectionStatusResponse>> =
            pollConnectionStatus(params, RequestOptions.none())

        /** @see pollConnectionStatus */
        fun pollConnectionStatus(
            params: TelegramPollConnectionStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TelegramPollConnectionStatusResponse>>
    }
}
