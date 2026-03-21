// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.accounts

import com.google.errorprone.annotations.MustBeClosed
import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.accounts.health.HealthListParams
import dev.relayapi.models.accounts.health.HealthListResponse
import dev.relayapi.models.accounts.health.HealthRetrieveParams
import dev.relayapi.models.accounts.health.HealthRetrieveResponse
import java.util.function.Consumer

interface HealthService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): HealthService

    /** Check health of a single connected account */
    fun retrieve(id: String): HealthRetrieveResponse = retrieve(id, HealthRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: HealthRetrieveParams = HealthRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HealthRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: HealthRetrieveParams = HealthRetrieveParams.none(),
    ): HealthRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: HealthRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HealthRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: HealthRetrieveParams): HealthRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): HealthRetrieveResponse =
        retrieve(id, HealthRetrieveParams.none(), requestOptions)

    /** Check health of all connected accounts */
    fun list(): HealthListResponse = list(HealthListParams.none())

    /** @see list */
    fun list(
        params: HealthListParams = HealthListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HealthListResponse

    /** @see list */
    fun list(params: HealthListParams = HealthListParams.none()): HealthListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): HealthListResponse =
        list(HealthListParams.none(), requestOptions)

    /** A view of [HealthService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): HealthService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/accounts/{id}/health`, but is otherwise the same
         * as [HealthService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<HealthRetrieveResponse> =
            retrieve(id, HealthRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: HealthRetrieveParams = HealthRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HealthRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: HealthRetrieveParams = HealthRetrieveParams.none(),
        ): HttpResponseFor<HealthRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: HealthRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HealthRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: HealthRetrieveParams): HttpResponseFor<HealthRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HealthRetrieveResponse> =
            retrieve(id, HealthRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/accounts/health`, but is otherwise the same as
         * [HealthService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<HealthListResponse> = list(HealthListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: HealthListParams = HealthListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HealthListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: HealthListParams = HealthListParams.none()
        ): HttpResponseFor<HealthListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<HealthListResponse> =
            list(HealthListParams.none(), requestOptions)
    }
}
