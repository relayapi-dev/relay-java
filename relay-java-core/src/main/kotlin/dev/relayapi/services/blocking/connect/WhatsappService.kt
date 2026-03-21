// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.connect

import com.google.errorprone.annotations.MustBeClosed
import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.connect.whatsapp.WhatsappCompleteEmbeddedSignupParams
import dev.relayapi.models.connect.whatsapp.WhatsappCompleteEmbeddedSignupResponse
import dev.relayapi.models.connect.whatsapp.WhatsappConnectViaCredentialsParams
import dev.relayapi.models.connect.whatsapp.WhatsappConnectViaCredentialsResponse
import dev.relayapi.models.connect.whatsapp.WhatsappGetSdkConfigParams
import dev.relayapi.models.connect.whatsapp.WhatsappGetSdkConfigResponse
import java.util.function.Consumer

interface WhatsappService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WhatsappService

    /** Complete WhatsApp Embedded Signup */
    fun completeEmbeddedSignup(
        params: WhatsappCompleteEmbeddedSignupParams
    ): WhatsappCompleteEmbeddedSignupResponse =
        completeEmbeddedSignup(params, RequestOptions.none())

    /** @see completeEmbeddedSignup */
    fun completeEmbeddedSignup(
        params: WhatsappCompleteEmbeddedSignupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WhatsappCompleteEmbeddedSignupResponse

    /** Connect WhatsApp via System User credentials */
    fun connectViaCredentials(
        params: WhatsappConnectViaCredentialsParams
    ): WhatsappConnectViaCredentialsResponse = connectViaCredentials(params, RequestOptions.none())

    /** @see connectViaCredentials */
    fun connectViaCredentials(
        params: WhatsappConnectViaCredentialsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WhatsappConnectViaCredentialsResponse

    /** Get WhatsApp Embedded Signup SDK config */
    fun getSdkConfig(): WhatsappGetSdkConfigResponse =
        getSdkConfig(WhatsappGetSdkConfigParams.none())

    /** @see getSdkConfig */
    fun getSdkConfig(
        params: WhatsappGetSdkConfigParams = WhatsappGetSdkConfigParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WhatsappGetSdkConfigResponse

    /** @see getSdkConfig */
    fun getSdkConfig(
        params: WhatsappGetSdkConfigParams = WhatsappGetSdkConfigParams.none()
    ): WhatsappGetSdkConfigResponse = getSdkConfig(params, RequestOptions.none())

    /** @see getSdkConfig */
    fun getSdkConfig(requestOptions: RequestOptions): WhatsappGetSdkConfigResponse =
        getSdkConfig(WhatsappGetSdkConfigParams.none(), requestOptions)

    /** A view of [WhatsappService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): WhatsappService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/connect/whatsapp/embedded-signup`, but is
         * otherwise the same as [WhatsappService.completeEmbeddedSignup].
         */
        @MustBeClosed
        fun completeEmbeddedSignup(
            params: WhatsappCompleteEmbeddedSignupParams
        ): HttpResponseFor<WhatsappCompleteEmbeddedSignupResponse> =
            completeEmbeddedSignup(params, RequestOptions.none())

        /** @see completeEmbeddedSignup */
        @MustBeClosed
        fun completeEmbeddedSignup(
            params: WhatsappCompleteEmbeddedSignupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WhatsappCompleteEmbeddedSignupResponse>

        /**
         * Returns a raw HTTP response for `post /v1/connect/whatsapp/credentials`, but is otherwise
         * the same as [WhatsappService.connectViaCredentials].
         */
        @MustBeClosed
        fun connectViaCredentials(
            params: WhatsappConnectViaCredentialsParams
        ): HttpResponseFor<WhatsappConnectViaCredentialsResponse> =
            connectViaCredentials(params, RequestOptions.none())

        /** @see connectViaCredentials */
        @MustBeClosed
        fun connectViaCredentials(
            params: WhatsappConnectViaCredentialsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WhatsappConnectViaCredentialsResponse>

        /**
         * Returns a raw HTTP response for `get /v1/connect/whatsapp/sdk-config`, but is otherwise
         * the same as [WhatsappService.getSdkConfig].
         */
        @MustBeClosed
        fun getSdkConfig(): HttpResponseFor<WhatsappGetSdkConfigResponse> =
            getSdkConfig(WhatsappGetSdkConfigParams.none())

        /** @see getSdkConfig */
        @MustBeClosed
        fun getSdkConfig(
            params: WhatsappGetSdkConfigParams = WhatsappGetSdkConfigParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WhatsappGetSdkConfigResponse>

        /** @see getSdkConfig */
        @MustBeClosed
        fun getSdkConfig(
            params: WhatsappGetSdkConfigParams = WhatsappGetSdkConfigParams.none()
        ): HttpResponseFor<WhatsappGetSdkConfigResponse> =
            getSdkConfig(params, RequestOptions.none())

        /** @see getSdkConfig */
        @MustBeClosed
        fun getSdkConfig(
            requestOptions: RequestOptions
        ): HttpResponseFor<WhatsappGetSdkConfigResponse> =
            getSdkConfig(WhatsappGetSdkConfigParams.none(), requestOptions)
    }
}
