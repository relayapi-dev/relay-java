// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.accounts

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.accounts.pinterestboards.PinterestBoardRetrieveParams
import dev.relayapi.models.accounts.pinterestboards.PinterestBoardRetrieveResponse
import dev.relayapi.models.accounts.pinterestboards.PinterestBoardSetDefaultParams
import dev.relayapi.models.accounts.pinterestboards.PinterestBoardSetDefaultResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PinterestBoardServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PinterestBoardServiceAsync

    /** Fetch Pinterest boards for an account */
    fun retrieve(id: String): CompletableFuture<PinterestBoardRetrieveResponse> =
        retrieve(id, PinterestBoardRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PinterestBoardRetrieveParams = PinterestBoardRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PinterestBoardRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PinterestBoardRetrieveParams = PinterestBoardRetrieveParams.none(),
    ): CompletableFuture<PinterestBoardRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PinterestBoardRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PinterestBoardRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: PinterestBoardRetrieveParams
    ): CompletableFuture<PinterestBoardRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PinterestBoardRetrieveResponse> =
        retrieve(id, PinterestBoardRetrieveParams.none(), requestOptions)

    /** Set default Pinterest board */
    fun setDefault(
        id: String,
        params: PinterestBoardSetDefaultParams,
    ): CompletableFuture<PinterestBoardSetDefaultResponse> =
        setDefault(id, params, RequestOptions.none())

    /** @see setDefault */
    fun setDefault(
        id: String,
        params: PinterestBoardSetDefaultParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PinterestBoardSetDefaultResponse> =
        setDefault(params.toBuilder().id(id).build(), requestOptions)

    /** @see setDefault */
    fun setDefault(
        params: PinterestBoardSetDefaultParams
    ): CompletableFuture<PinterestBoardSetDefaultResponse> =
        setDefault(params, RequestOptions.none())

    /** @see setDefault */
    fun setDefault(
        params: PinterestBoardSetDefaultParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PinterestBoardSetDefaultResponse>

    /**
     * A view of [PinterestBoardServiceAsync] that provides access to raw HTTP responses for each
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
        ): PinterestBoardServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/accounts/{id}/pinterest-boards`, but is
         * otherwise the same as [PinterestBoardServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<PinterestBoardRetrieveResponse>> =
            retrieve(id, PinterestBoardRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: PinterestBoardRetrieveParams = PinterestBoardRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PinterestBoardRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: PinterestBoardRetrieveParams = PinterestBoardRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<PinterestBoardRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: PinterestBoardRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PinterestBoardRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: PinterestBoardRetrieveParams
        ): CompletableFuture<HttpResponseFor<PinterestBoardRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PinterestBoardRetrieveResponse>> =
            retrieve(id, PinterestBoardRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/accounts/{id}/pinterest-boards`, but is
         * otherwise the same as [PinterestBoardServiceAsync.setDefault].
         */
        fun setDefault(
            id: String,
            params: PinterestBoardSetDefaultParams,
        ): CompletableFuture<HttpResponseFor<PinterestBoardSetDefaultResponse>> =
            setDefault(id, params, RequestOptions.none())

        /** @see setDefault */
        fun setDefault(
            id: String,
            params: PinterestBoardSetDefaultParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PinterestBoardSetDefaultResponse>> =
            setDefault(params.toBuilder().id(id).build(), requestOptions)

        /** @see setDefault */
        fun setDefault(
            params: PinterestBoardSetDefaultParams
        ): CompletableFuture<HttpResponseFor<PinterestBoardSetDefaultResponse>> =
            setDefault(params, RequestOptions.none())

        /** @see setDefault */
        fun setDefault(
            params: PinterestBoardSetDefaultParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PinterestBoardSetDefaultResponse>>
    }
}
