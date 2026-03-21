// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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
import dev.relayapi.services.blocking.connect.FacebookService
import dev.relayapi.services.blocking.connect.GooglebusinessService
import dev.relayapi.services.blocking.connect.LinkedinService
import dev.relayapi.services.blocking.connect.PinterestService
import dev.relayapi.services.blocking.connect.SnapchatService
import dev.relayapi.services.blocking.connect.TelegramService
import dev.relayapi.services.blocking.connect.WhatsappService
import java.util.function.Consumer

interface ConnectService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConnectService

    fun telegram(): TelegramService

    fun whatsapp(): WhatsappService

    fun facebook(): FacebookService

    fun linkedin(): LinkedinService

    fun pinterest(): PinterestService

    fun googlebusiness(): GooglebusinessService

    fun snapchat(): SnapchatService

    /** Exchange OAuth code for tokens and save the account. */
    fun completeOAuthCallback(
        platform: ConnectCompleteOAuthCallbackParams.Platform,
        params: ConnectCompleteOAuthCallbackParams,
    ): ConnectCompleteOAuthCallbackResponse =
        completeOAuthCallback(platform, params, RequestOptions.none())

    /** @see completeOAuthCallback */
    fun completeOAuthCallback(
        platform: ConnectCompleteOAuthCallbackParams.Platform,
        params: ConnectCompleteOAuthCallbackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectCompleteOAuthCallbackResponse =
        completeOAuthCallback(params.toBuilder().platform(platform).build(), requestOptions)

    /** @see completeOAuthCallback */
    fun completeOAuthCallback(
        params: ConnectCompleteOAuthCallbackParams
    ): ConnectCompleteOAuthCallbackResponse = completeOAuthCallback(params, RequestOptions.none())

    /** @see completeOAuthCallback */
    fun completeOAuthCallback(
        params: ConnectCompleteOAuthCallbackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectCompleteOAuthCallbackResponse

    /** Connect Bluesky via app password */
    fun createBlueskyConnection(
        params: ConnectCreateBlueskyConnectionParams
    ): ConnectCreateBlueskyConnectionResponse =
        createBlueskyConnection(params, RequestOptions.none())

    /** @see createBlueskyConnection */
    fun createBlueskyConnection(
        params: ConnectCreateBlueskyConnectionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectCreateBlueskyConnectionResponse

    /** One-time use, expires after 10 minutes. For headless OAuth flows. */
    fun fetchPendingData(params: ConnectFetchPendingDataParams): ConnectFetchPendingDataResponse =
        fetchPendingData(params, RequestOptions.none())

    /** @see fetchPendingData */
    fun fetchPendingData(
        params: ConnectFetchPendingDataParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectFetchPendingDataResponse

    /** Returns an auth_url to redirect the user for OAuth authorization. */
    fun startOAuthFlow(
        platform: ConnectStartOAuthFlowParams.Platform
    ): ConnectStartOAuthFlowResponse = startOAuthFlow(platform, ConnectStartOAuthFlowParams.none())

    /** @see startOAuthFlow */
    fun startOAuthFlow(
        platform: ConnectStartOAuthFlowParams.Platform,
        params: ConnectStartOAuthFlowParams = ConnectStartOAuthFlowParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectStartOAuthFlowResponse =
        startOAuthFlow(params.toBuilder().platform(platform).build(), requestOptions)

    /** @see startOAuthFlow */
    fun startOAuthFlow(
        platform: ConnectStartOAuthFlowParams.Platform,
        params: ConnectStartOAuthFlowParams = ConnectStartOAuthFlowParams.none(),
    ): ConnectStartOAuthFlowResponse = startOAuthFlow(platform, params, RequestOptions.none())

    /** @see startOAuthFlow */
    fun startOAuthFlow(
        params: ConnectStartOAuthFlowParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectStartOAuthFlowResponse

    /** @see startOAuthFlow */
    fun startOAuthFlow(params: ConnectStartOAuthFlowParams): ConnectStartOAuthFlowResponse =
        startOAuthFlow(params, RequestOptions.none())

    /** @see startOAuthFlow */
    fun startOAuthFlow(
        platform: ConnectStartOAuthFlowParams.Platform,
        requestOptions: RequestOptions,
    ): ConnectStartOAuthFlowResponse =
        startOAuthFlow(platform, ConnectStartOAuthFlowParams.none(), requestOptions)

    /** A view of [ConnectService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConnectService.WithRawResponse

        fun telegram(): TelegramService.WithRawResponse

        fun whatsapp(): WhatsappService.WithRawResponse

        fun facebook(): FacebookService.WithRawResponse

        fun linkedin(): LinkedinService.WithRawResponse

        fun pinterest(): PinterestService.WithRawResponse

        fun googlebusiness(): GooglebusinessService.WithRawResponse

        fun snapchat(): SnapchatService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/connect/{platform}`, but is otherwise the same
         * as [ConnectService.completeOAuthCallback].
         */
        @MustBeClosed
        fun completeOAuthCallback(
            platform: ConnectCompleteOAuthCallbackParams.Platform,
            params: ConnectCompleteOAuthCallbackParams,
        ): HttpResponseFor<ConnectCompleteOAuthCallbackResponse> =
            completeOAuthCallback(platform, params, RequestOptions.none())

        /** @see completeOAuthCallback */
        @MustBeClosed
        fun completeOAuthCallback(
            platform: ConnectCompleteOAuthCallbackParams.Platform,
            params: ConnectCompleteOAuthCallbackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConnectCompleteOAuthCallbackResponse> =
            completeOAuthCallback(params.toBuilder().platform(platform).build(), requestOptions)

        /** @see completeOAuthCallback */
        @MustBeClosed
        fun completeOAuthCallback(
            params: ConnectCompleteOAuthCallbackParams
        ): HttpResponseFor<ConnectCompleteOAuthCallbackResponse> =
            completeOAuthCallback(params, RequestOptions.none())

        /** @see completeOAuthCallback */
        @MustBeClosed
        fun completeOAuthCallback(
            params: ConnectCompleteOAuthCallbackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConnectCompleteOAuthCallbackResponse>

        /**
         * Returns a raw HTTP response for `post /v1/connect/bluesky`, but is otherwise the same as
         * [ConnectService.createBlueskyConnection].
         */
        @MustBeClosed
        fun createBlueskyConnection(
            params: ConnectCreateBlueskyConnectionParams
        ): HttpResponseFor<ConnectCreateBlueskyConnectionResponse> =
            createBlueskyConnection(params, RequestOptions.none())

        /** @see createBlueskyConnection */
        @MustBeClosed
        fun createBlueskyConnection(
            params: ConnectCreateBlueskyConnectionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConnectCreateBlueskyConnectionResponse>

        /**
         * Returns a raw HTTP response for `get /v1/connect/pending-data`, but is otherwise the same
         * as [ConnectService.fetchPendingData].
         */
        @MustBeClosed
        fun fetchPendingData(
            params: ConnectFetchPendingDataParams
        ): HttpResponseFor<ConnectFetchPendingDataResponse> =
            fetchPendingData(params, RequestOptions.none())

        /** @see fetchPendingData */
        @MustBeClosed
        fun fetchPendingData(
            params: ConnectFetchPendingDataParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConnectFetchPendingDataResponse>

        /**
         * Returns a raw HTTP response for `get /v1/connect/{platform}`, but is otherwise the same
         * as [ConnectService.startOAuthFlow].
         */
        @MustBeClosed
        fun startOAuthFlow(
            platform: ConnectStartOAuthFlowParams.Platform
        ): HttpResponseFor<ConnectStartOAuthFlowResponse> =
            startOAuthFlow(platform, ConnectStartOAuthFlowParams.none())

        /** @see startOAuthFlow */
        @MustBeClosed
        fun startOAuthFlow(
            platform: ConnectStartOAuthFlowParams.Platform,
            params: ConnectStartOAuthFlowParams = ConnectStartOAuthFlowParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConnectStartOAuthFlowResponse> =
            startOAuthFlow(params.toBuilder().platform(platform).build(), requestOptions)

        /** @see startOAuthFlow */
        @MustBeClosed
        fun startOAuthFlow(
            platform: ConnectStartOAuthFlowParams.Platform,
            params: ConnectStartOAuthFlowParams = ConnectStartOAuthFlowParams.none(),
        ): HttpResponseFor<ConnectStartOAuthFlowResponse> =
            startOAuthFlow(platform, params, RequestOptions.none())

        /** @see startOAuthFlow */
        @MustBeClosed
        fun startOAuthFlow(
            params: ConnectStartOAuthFlowParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConnectStartOAuthFlowResponse>

        /** @see startOAuthFlow */
        @MustBeClosed
        fun startOAuthFlow(
            params: ConnectStartOAuthFlowParams
        ): HttpResponseFor<ConnectStartOAuthFlowResponse> =
            startOAuthFlow(params, RequestOptions.none())

        /** @see startOAuthFlow */
        @MustBeClosed
        fun startOAuthFlow(
            platform: ConnectStartOAuthFlowParams.Platform,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConnectStartOAuthFlowResponse> =
            startOAuthFlow(platform, ConnectStartOAuthFlowParams.none(), requestOptions)
    }
}
