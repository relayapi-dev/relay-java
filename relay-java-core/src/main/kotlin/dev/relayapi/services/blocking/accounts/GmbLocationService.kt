// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.accounts

import com.google.errorprone.annotations.MustBeClosed
import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.accounts.gmblocations.GmbLocationRetrieveParams
import dev.relayapi.models.accounts.gmblocations.GmbLocationRetrieveResponse
import dev.relayapi.models.accounts.gmblocations.GmbLocationSetDefaultParams
import dev.relayapi.models.accounts.gmblocations.GmbLocationSetDefaultResponse
import java.util.function.Consumer

interface GmbLocationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GmbLocationService

    /** Fetch Google My Business locations */
    fun retrieve(id: String): GmbLocationRetrieveResponse =
        retrieve(id, GmbLocationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: GmbLocationRetrieveParams = GmbLocationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GmbLocationRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: GmbLocationRetrieveParams = GmbLocationRetrieveParams.none(),
    ): GmbLocationRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: GmbLocationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GmbLocationRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: GmbLocationRetrieveParams): GmbLocationRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): GmbLocationRetrieveResponse =
        retrieve(id, GmbLocationRetrieveParams.none(), requestOptions)

    /** Set default GMB location */
    fun setDefault(id: String, params: GmbLocationSetDefaultParams): GmbLocationSetDefaultResponse =
        setDefault(id, params, RequestOptions.none())

    /** @see setDefault */
    fun setDefault(
        id: String,
        params: GmbLocationSetDefaultParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GmbLocationSetDefaultResponse = setDefault(params.toBuilder().id(id).build(), requestOptions)

    /** @see setDefault */
    fun setDefault(params: GmbLocationSetDefaultParams): GmbLocationSetDefaultResponse =
        setDefault(params, RequestOptions.none())

    /** @see setDefault */
    fun setDefault(
        params: GmbLocationSetDefaultParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GmbLocationSetDefaultResponse

    /**
     * A view of [GmbLocationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GmbLocationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/accounts/{id}/gmb-locations`, but is otherwise
         * the same as [GmbLocationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<GmbLocationRetrieveResponse> =
            retrieve(id, GmbLocationRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: GmbLocationRetrieveParams = GmbLocationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GmbLocationRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: GmbLocationRetrieveParams = GmbLocationRetrieveParams.none(),
        ): HttpResponseFor<GmbLocationRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: GmbLocationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GmbLocationRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: GmbLocationRetrieveParams
        ): HttpResponseFor<GmbLocationRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GmbLocationRetrieveResponse> =
            retrieve(id, GmbLocationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/accounts/{id}/gmb-locations`, but is otherwise
         * the same as [GmbLocationService.setDefault].
         */
        @MustBeClosed
        fun setDefault(
            id: String,
            params: GmbLocationSetDefaultParams,
        ): HttpResponseFor<GmbLocationSetDefaultResponse> =
            setDefault(id, params, RequestOptions.none())

        /** @see setDefault */
        @MustBeClosed
        fun setDefault(
            id: String,
            params: GmbLocationSetDefaultParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GmbLocationSetDefaultResponse> =
            setDefault(params.toBuilder().id(id).build(), requestOptions)

        /** @see setDefault */
        @MustBeClosed
        fun setDefault(
            params: GmbLocationSetDefaultParams
        ): HttpResponseFor<GmbLocationSetDefaultResponse> =
            setDefault(params, RequestOptions.none())

        /** @see setDefault */
        @MustBeClosed
        fun setDefault(
            params: GmbLocationSetDefaultParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GmbLocationSetDefaultResponse>
    }
}
