// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.connect

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.connect.whatsapp.WhatsappCompleteEmbeddedSignupParams
import dev.relayapi.models.connect.whatsapp.WhatsappCompleteEmbeddedSignupResponse
import dev.relayapi.models.connect.whatsapp.WhatsappConnectViaCredentialsParams
import dev.relayapi.models.connect.whatsapp.WhatsappConnectViaCredentialsResponse
import dev.relayapi.models.connect.whatsapp.WhatsappGetSdkConfigParams
import dev.relayapi.models.connect.whatsapp.WhatsappGetSdkConfigResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface WhatsappServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WhatsappServiceAsync

    /** Complete WhatsApp Embedded Signup */
    fun completeEmbeddedSignup(
        params: WhatsappCompleteEmbeddedSignupParams
    ): CompletableFuture<WhatsappCompleteEmbeddedSignupResponse> =
        completeEmbeddedSignup(params, RequestOptions.none())

    /** @see completeEmbeddedSignup */
    fun completeEmbeddedSignup(
        params: WhatsappCompleteEmbeddedSignupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WhatsappCompleteEmbeddedSignupResponse>

    /** Connect WhatsApp via System User credentials */
    fun connectViaCredentials(
        params: WhatsappConnectViaCredentialsParams
    ): CompletableFuture<WhatsappConnectViaCredentialsResponse> =
        connectViaCredentials(params, RequestOptions.none())

    /** @see connectViaCredentials */
    fun connectViaCredentials(
        params: WhatsappConnectViaCredentialsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WhatsappConnectViaCredentialsResponse>

    /** Get WhatsApp Embedded Signup SDK config */
    fun getSdkConfig(): CompletableFuture<WhatsappGetSdkConfigResponse> =
        getSdkConfig(WhatsappGetSdkConfigParams.none())

    /** @see getSdkConfig */
    fun getSdkConfig(
        params: WhatsappGetSdkConfigParams = WhatsappGetSdkConfigParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WhatsappGetSdkConfigResponse>

    /** @see getSdkConfig */
    fun getSdkConfig(
        params: WhatsappGetSdkConfigParams = WhatsappGetSdkConfigParams.none()
    ): CompletableFuture<WhatsappGetSdkConfigResponse> = getSdkConfig(params, RequestOptions.none())

    /** @see getSdkConfig */
    fun getSdkConfig(
        requestOptions: RequestOptions
    ): CompletableFuture<WhatsappGetSdkConfigResponse> =
        getSdkConfig(WhatsappGetSdkConfigParams.none(), requestOptions)

    /**
     * A view of [WhatsappServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WhatsappServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/connect/whatsapp/embedded-signup`, but is
         * otherwise the same as [WhatsappServiceAsync.completeEmbeddedSignup].
         */
        fun completeEmbeddedSignup(
            params: WhatsappCompleteEmbeddedSignupParams
        ): CompletableFuture<HttpResponseFor<WhatsappCompleteEmbeddedSignupResponse>> =
            completeEmbeddedSignup(params, RequestOptions.none())

        /** @see completeEmbeddedSignup */
        fun completeEmbeddedSignup(
            params: WhatsappCompleteEmbeddedSignupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WhatsappCompleteEmbeddedSignupResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/connect/whatsapp/credentials`, but is otherwise
         * the same as [WhatsappServiceAsync.connectViaCredentials].
         */
        fun connectViaCredentials(
            params: WhatsappConnectViaCredentialsParams
        ): CompletableFuture<HttpResponseFor<WhatsappConnectViaCredentialsResponse>> =
            connectViaCredentials(params, RequestOptions.none())

        /** @see connectViaCredentials */
        fun connectViaCredentials(
            params: WhatsappConnectViaCredentialsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WhatsappConnectViaCredentialsResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/connect/whatsapp/sdk-config`, but is otherwise
         * the same as [WhatsappServiceAsync.getSdkConfig].
         */
        fun getSdkConfig(): CompletableFuture<HttpResponseFor<WhatsappGetSdkConfigResponse>> =
            getSdkConfig(WhatsappGetSdkConfigParams.none())

        /** @see getSdkConfig */
        fun getSdkConfig(
            params: WhatsappGetSdkConfigParams = WhatsappGetSdkConfigParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WhatsappGetSdkConfigResponse>>

        /** @see getSdkConfig */
        fun getSdkConfig(
            params: WhatsappGetSdkConfigParams = WhatsappGetSdkConfigParams.none()
        ): CompletableFuture<HttpResponseFor<WhatsappGetSdkConfigResponse>> =
            getSdkConfig(params, RequestOptions.none())

        /** @see getSdkConfig */
        fun getSdkConfig(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<WhatsappGetSdkConfigResponse>> =
            getSdkConfig(WhatsappGetSdkConfigParams.none(), requestOptions)
    }
}
