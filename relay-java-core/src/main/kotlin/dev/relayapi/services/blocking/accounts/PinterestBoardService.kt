// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.accounts

import com.google.errorprone.annotations.MustBeClosed
import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.accounts.pinterestboards.PinterestBoardRetrieveParams
import dev.relayapi.models.accounts.pinterestboards.PinterestBoardRetrieveResponse
import dev.relayapi.models.accounts.pinterestboards.PinterestBoardSetDefaultParams
import dev.relayapi.models.accounts.pinterestboards.PinterestBoardSetDefaultResponse
import java.util.function.Consumer

interface PinterestBoardService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PinterestBoardService

    /** Fetch Pinterest boards for an account */
    fun retrieve(id: String): PinterestBoardRetrieveResponse =
        retrieve(id, PinterestBoardRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PinterestBoardRetrieveParams = PinterestBoardRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PinterestBoardRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PinterestBoardRetrieveParams = PinterestBoardRetrieveParams.none(),
    ): PinterestBoardRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PinterestBoardRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PinterestBoardRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: PinterestBoardRetrieveParams): PinterestBoardRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): PinterestBoardRetrieveResponse =
        retrieve(id, PinterestBoardRetrieveParams.none(), requestOptions)

    /** Set default Pinterest board */
    fun setDefault(
        id: String,
        params: PinterestBoardSetDefaultParams,
    ): PinterestBoardSetDefaultResponse = setDefault(id, params, RequestOptions.none())

    /** @see setDefault */
    fun setDefault(
        id: String,
        params: PinterestBoardSetDefaultParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PinterestBoardSetDefaultResponse =
        setDefault(params.toBuilder().id(id).build(), requestOptions)

    /** @see setDefault */
    fun setDefault(params: PinterestBoardSetDefaultParams): PinterestBoardSetDefaultResponse =
        setDefault(params, RequestOptions.none())

    /** @see setDefault */
    fun setDefault(
        params: PinterestBoardSetDefaultParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PinterestBoardSetDefaultResponse

    /**
     * A view of [PinterestBoardService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PinterestBoardService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/accounts/{id}/pinterest-boards`, but is
         * otherwise the same as [PinterestBoardService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<PinterestBoardRetrieveResponse> =
            retrieve(id, PinterestBoardRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PinterestBoardRetrieveParams = PinterestBoardRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PinterestBoardRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PinterestBoardRetrieveParams = PinterestBoardRetrieveParams.none(),
        ): HttpResponseFor<PinterestBoardRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PinterestBoardRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PinterestBoardRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PinterestBoardRetrieveParams
        ): HttpResponseFor<PinterestBoardRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PinterestBoardRetrieveResponse> =
            retrieve(id, PinterestBoardRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/accounts/{id}/pinterest-boards`, but is
         * otherwise the same as [PinterestBoardService.setDefault].
         */
        @MustBeClosed
        fun setDefault(
            id: String,
            params: PinterestBoardSetDefaultParams,
        ): HttpResponseFor<PinterestBoardSetDefaultResponse> =
            setDefault(id, params, RequestOptions.none())

        /** @see setDefault */
        @MustBeClosed
        fun setDefault(
            id: String,
            params: PinterestBoardSetDefaultParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PinterestBoardSetDefaultResponse> =
            setDefault(params.toBuilder().id(id).build(), requestOptions)

        /** @see setDefault */
        @MustBeClosed
        fun setDefault(
            params: PinterestBoardSetDefaultParams
        ): HttpResponseFor<PinterestBoardSetDefaultResponse> =
            setDefault(params, RequestOptions.none())

        /** @see setDefault */
        @MustBeClosed
        fun setDefault(
            params: PinterestBoardSetDefaultParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PinterestBoardSetDefaultResponse>
    }
}
