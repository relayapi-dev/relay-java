// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.accounts

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.accounts.gmblocations.GmbLocationRetrieveParams
import dev.relayapi.models.accounts.gmblocations.GmbLocationRetrieveResponse
import dev.relayapi.models.accounts.gmblocations.GmbLocationSetDefaultParams
import dev.relayapi.models.accounts.gmblocations.GmbLocationSetDefaultResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface GmbLocationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GmbLocationServiceAsync

    /** Fetch Google My Business locations */
    fun retrieve(id: String): CompletableFuture<GmbLocationRetrieveResponse> =
        retrieve(id, GmbLocationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: GmbLocationRetrieveParams = GmbLocationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GmbLocationRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: GmbLocationRetrieveParams = GmbLocationRetrieveParams.none(),
    ): CompletableFuture<GmbLocationRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: GmbLocationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GmbLocationRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: GmbLocationRetrieveParams
    ): CompletableFuture<GmbLocationRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<GmbLocationRetrieveResponse> =
        retrieve(id, GmbLocationRetrieveParams.none(), requestOptions)

    /** Set default GMB location */
    fun setDefault(
        id: String,
        params: GmbLocationSetDefaultParams,
    ): CompletableFuture<GmbLocationSetDefaultResponse> =
        setDefault(id, params, RequestOptions.none())

    /** @see setDefault */
    fun setDefault(
        id: String,
        params: GmbLocationSetDefaultParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GmbLocationSetDefaultResponse> =
        setDefault(params.toBuilder().id(id).build(), requestOptions)

    /** @see setDefault */
    fun setDefault(
        params: GmbLocationSetDefaultParams
    ): CompletableFuture<GmbLocationSetDefaultResponse> = setDefault(params, RequestOptions.none())

    /** @see setDefault */
    fun setDefault(
        params: GmbLocationSetDefaultParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GmbLocationSetDefaultResponse>

    /**
     * A view of [GmbLocationServiceAsync] that provides access to raw HTTP responses for each
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
        ): GmbLocationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/accounts/{id}/gmb-locations`, but is otherwise
         * the same as [GmbLocationServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<GmbLocationRetrieveResponse>> =
            retrieve(id, GmbLocationRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: GmbLocationRetrieveParams = GmbLocationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GmbLocationRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: GmbLocationRetrieveParams = GmbLocationRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<GmbLocationRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: GmbLocationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GmbLocationRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: GmbLocationRetrieveParams
        ): CompletableFuture<HttpResponseFor<GmbLocationRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GmbLocationRetrieveResponse>> =
            retrieve(id, GmbLocationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/accounts/{id}/gmb-locations`, but is otherwise
         * the same as [GmbLocationServiceAsync.setDefault].
         */
        fun setDefault(
            id: String,
            params: GmbLocationSetDefaultParams,
        ): CompletableFuture<HttpResponseFor<GmbLocationSetDefaultResponse>> =
            setDefault(id, params, RequestOptions.none())

        /** @see setDefault */
        fun setDefault(
            id: String,
            params: GmbLocationSetDefaultParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GmbLocationSetDefaultResponse>> =
            setDefault(params.toBuilder().id(id).build(), requestOptions)

        /** @see setDefault */
        fun setDefault(
            params: GmbLocationSetDefaultParams
        ): CompletableFuture<HttpResponseFor<GmbLocationSetDefaultResponse>> =
            setDefault(params, RequestOptions.none())

        /** @see setDefault */
        fun setDefault(
            params: GmbLocationSetDefaultParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GmbLocationSetDefaultResponse>>
    }
}
