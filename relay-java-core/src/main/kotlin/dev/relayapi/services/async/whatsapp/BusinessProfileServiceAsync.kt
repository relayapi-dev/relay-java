// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.whatsapp

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.whatsapp.businessprofile.BusinessProfileRetrieveParams
import dev.relayapi.models.whatsapp.businessprofile.BusinessProfileRetrieveResponse
import dev.relayapi.models.whatsapp.businessprofile.BusinessProfileUpdateParams
import dev.relayapi.models.whatsapp.businessprofile.BusinessProfileUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BusinessProfileServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BusinessProfileServiceAsync

    /** Get WhatsApp Business profile */
    fun retrieve(
        params: BusinessProfileRetrieveParams
    ): CompletableFuture<BusinessProfileRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BusinessProfileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BusinessProfileRetrieveResponse>

    /** Update WhatsApp Business profile */
    fun update(
        params: BusinessProfileUpdateParams
    ): CompletableFuture<BusinessProfileUpdateResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BusinessProfileUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BusinessProfileUpdateResponse>

    /**
     * A view of [BusinessProfileServiceAsync] that provides access to raw HTTP responses for each
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
        ): BusinessProfileServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/whatsapp/business-profile`, but is otherwise the
         * same as [BusinessProfileServiceAsync.retrieve].
         */
        fun retrieve(
            params: BusinessProfileRetrieveParams
        ): CompletableFuture<HttpResponseFor<BusinessProfileRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: BusinessProfileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BusinessProfileRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `put /v1/whatsapp/business-profile`, but is otherwise the
         * same as [BusinessProfileServiceAsync.update].
         */
        fun update(
            params: BusinessProfileUpdateParams
        ): CompletableFuture<HttpResponseFor<BusinessProfileUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: BusinessProfileUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BusinessProfileUpdateResponse>>
    }
}
