// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.connect.ConnectCompleteOAuthCallbackParams
import dev.relayapi.models.connect.ConnectCompleteOAuthCallbackResponse
import dev.relayapi.models.connect.ConnectCreateBlueskyConnectionParams
import dev.relayapi.models.connect.ConnectCreateBlueskyConnectionResponse
import dev.relayapi.models.connect.ConnectFetchPendingDataParams
import dev.relayapi.models.connect.ConnectFetchPendingDataResponse
import dev.relayapi.models.connect.ConnectStartOAuthFlowParams
import dev.relayapi.models.connect.ConnectStartOAuthFlowResponse
import dev.relayapi.services.async.connect.FacebookServiceAsync
import dev.relayapi.services.async.connect.GooglebusinessServiceAsync
import dev.relayapi.services.async.connect.LinkedinServiceAsync
import dev.relayapi.services.async.connect.PinterestServiceAsync
import dev.relayapi.services.async.connect.SnapchatServiceAsync
import dev.relayapi.services.async.connect.TelegramServiceAsync
import dev.relayapi.services.async.connect.WhatsappServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ConnectServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConnectServiceAsync

    fun telegram(): TelegramServiceAsync

    fun whatsapp(): WhatsappServiceAsync

    fun facebook(): FacebookServiceAsync

    fun linkedin(): LinkedinServiceAsync

    fun pinterest(): PinterestServiceAsync

    fun googlebusiness(): GooglebusinessServiceAsync

    fun snapchat(): SnapchatServiceAsync

    /** Exchange OAuth code for tokens and save the account. */
    fun completeOAuthCallback(
        platform: ConnectCompleteOAuthCallbackParams.Platform,
        params: ConnectCompleteOAuthCallbackParams,
    ): CompletableFuture<ConnectCompleteOAuthCallbackResponse> =
        completeOAuthCallback(platform, params, RequestOptions.none())

    /** @see completeOAuthCallback */
    fun completeOAuthCallback(
        platform: ConnectCompleteOAuthCallbackParams.Platform,
        params: ConnectCompleteOAuthCallbackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConnectCompleteOAuthCallbackResponse> =
        completeOAuthCallback(params.toBuilder().platform(platform).build(), requestOptions)

    /** @see completeOAuthCallback */
    fun completeOAuthCallback(
        params: ConnectCompleteOAuthCallbackParams
    ): CompletableFuture<ConnectCompleteOAuthCallbackResponse> =
        completeOAuthCallback(params, RequestOptions.none())

    /** @see completeOAuthCallback */
    fun completeOAuthCallback(
        params: ConnectCompleteOAuthCallbackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConnectCompleteOAuthCallbackResponse>

    /** Connect Bluesky via app password */
    fun createBlueskyConnection(
        params: ConnectCreateBlueskyConnectionParams
    ): CompletableFuture<ConnectCreateBlueskyConnectionResponse> =
        createBlueskyConnection(params, RequestOptions.none())

    /** @see createBlueskyConnection */
    fun createBlueskyConnection(
        params: ConnectCreateBlueskyConnectionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConnectCreateBlueskyConnectionResponse>

    /** One-time use, expires after 10 minutes. For headless OAuth flows. */
    fun fetchPendingData(
        params: ConnectFetchPendingDataParams
    ): CompletableFuture<ConnectFetchPendingDataResponse> =
        fetchPendingData(params, RequestOptions.none())

    /** @see fetchPendingData */
    fun fetchPendingData(
        params: ConnectFetchPendingDataParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConnectFetchPendingDataResponse>

    /** Returns an auth_url to redirect the user for OAuth authorization. */
    fun startOAuthFlow(
        platform: ConnectStartOAuthFlowParams.Platform
    ): CompletableFuture<ConnectStartOAuthFlowResponse> =
        startOAuthFlow(platform, ConnectStartOAuthFlowParams.none())

    /** @see startOAuthFlow */
    fun startOAuthFlow(
        platform: ConnectStartOAuthFlowParams.Platform,
        params: ConnectStartOAuthFlowParams = ConnectStartOAuthFlowParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConnectStartOAuthFlowResponse> =
        startOAuthFlow(params.toBuilder().platform(platform).build(), requestOptions)

    /** @see startOAuthFlow */
    fun startOAuthFlow(
        platform: ConnectStartOAuthFlowParams.Platform,
        params: ConnectStartOAuthFlowParams = ConnectStartOAuthFlowParams.none(),
    ): CompletableFuture<ConnectStartOAuthFlowResponse> =
        startOAuthFlow(platform, params, RequestOptions.none())

    /** @see startOAuthFlow */
    fun startOAuthFlow(
        params: ConnectStartOAuthFlowParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConnectStartOAuthFlowResponse>

    /** @see startOAuthFlow */
    fun startOAuthFlow(
        params: ConnectStartOAuthFlowParams
    ): CompletableFuture<ConnectStartOAuthFlowResponse> =
        startOAuthFlow(params, RequestOptions.none())

    /** @see startOAuthFlow */
    fun startOAuthFlow(
        platform: ConnectStartOAuthFlowParams.Platform,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConnectStartOAuthFlowResponse> =
        startOAuthFlow(platform, ConnectStartOAuthFlowParams.none(), requestOptions)

    /**
     * A view of [ConnectServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConnectServiceAsync.WithRawResponse

        fun telegram(): TelegramServiceAsync.WithRawResponse

        fun whatsapp(): WhatsappServiceAsync.WithRawResponse

        fun facebook(): FacebookServiceAsync.WithRawResponse

        fun linkedin(): LinkedinServiceAsync.WithRawResponse

        fun pinterest(): PinterestServiceAsync.WithRawResponse

        fun googlebusiness(): GooglebusinessServiceAsync.WithRawResponse

        fun snapchat(): SnapchatServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/connect/{platform}`, but is otherwise the same
         * as [ConnectServiceAsync.completeOAuthCallback].
         */
        fun completeOAuthCallback(
            platform: ConnectCompleteOAuthCallbackParams.Platform,
            params: ConnectCompleteOAuthCallbackParams,
        ): CompletableFuture<HttpResponseFor<ConnectCompleteOAuthCallbackResponse>> =
            completeOAuthCallback(platform, params, RequestOptions.none())

        /** @see completeOAuthCallback */
        fun completeOAuthCallback(
            platform: ConnectCompleteOAuthCallbackParams.Platform,
            params: ConnectCompleteOAuthCallbackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConnectCompleteOAuthCallbackResponse>> =
            completeOAuthCallback(params.toBuilder().platform(platform).build(), requestOptions)

        /** @see completeOAuthCallback */
        fun completeOAuthCallback(
            params: ConnectCompleteOAuthCallbackParams
        ): CompletableFuture<HttpResponseFor<ConnectCompleteOAuthCallbackResponse>> =
            completeOAuthCallback(params, RequestOptions.none())

        /** @see completeOAuthCallback */
        fun completeOAuthCallback(
            params: ConnectCompleteOAuthCallbackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConnectCompleteOAuthCallbackResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/connect/bluesky`, but is otherwise the same as
         * [ConnectServiceAsync.createBlueskyConnection].
         */
        fun createBlueskyConnection(
            params: ConnectCreateBlueskyConnectionParams
        ): CompletableFuture<HttpResponseFor<ConnectCreateBlueskyConnectionResponse>> =
            createBlueskyConnection(params, RequestOptions.none())

        /** @see createBlueskyConnection */
        fun createBlueskyConnection(
            params: ConnectCreateBlueskyConnectionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConnectCreateBlueskyConnectionResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/connect/pending-data`, but is otherwise the same
         * as [ConnectServiceAsync.fetchPendingData].
         */
        fun fetchPendingData(
            params: ConnectFetchPendingDataParams
        ): CompletableFuture<HttpResponseFor<ConnectFetchPendingDataResponse>> =
            fetchPendingData(params, RequestOptions.none())

        /** @see fetchPendingData */
        fun fetchPendingData(
            params: ConnectFetchPendingDataParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConnectFetchPendingDataResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/connect/{platform}`, but is otherwise the same
         * as [ConnectServiceAsync.startOAuthFlow].
         */
        fun startOAuthFlow(
            platform: ConnectStartOAuthFlowParams.Platform
        ): CompletableFuture<HttpResponseFor<ConnectStartOAuthFlowResponse>> =
            startOAuthFlow(platform, ConnectStartOAuthFlowParams.none())

        /** @see startOAuthFlow */
        fun startOAuthFlow(
            platform: ConnectStartOAuthFlowParams.Platform,
            params: ConnectStartOAuthFlowParams = ConnectStartOAuthFlowParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConnectStartOAuthFlowResponse>> =
            startOAuthFlow(params.toBuilder().platform(platform).build(), requestOptions)

        /** @see startOAuthFlow */
        fun startOAuthFlow(
            platform: ConnectStartOAuthFlowParams.Platform,
            params: ConnectStartOAuthFlowParams = ConnectStartOAuthFlowParams.none(),
        ): CompletableFuture<HttpResponseFor<ConnectStartOAuthFlowResponse>> =
            startOAuthFlow(platform, params, RequestOptions.none())

        /** @see startOAuthFlow */
        fun startOAuthFlow(
            params: ConnectStartOAuthFlowParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConnectStartOAuthFlowResponse>>

        /** @see startOAuthFlow */
        fun startOAuthFlow(
            params: ConnectStartOAuthFlowParams
        ): CompletableFuture<HttpResponseFor<ConnectStartOAuthFlowResponse>> =
            startOAuthFlow(params, RequestOptions.none())

        /** @see startOAuthFlow */
        fun startOAuthFlow(
            platform: ConnectStartOAuthFlowParams.Platform,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConnectStartOAuthFlowResponse>> =
            startOAuthFlow(platform, ConnectStartOAuthFlowParams.none(), requestOptions)
    }
}
