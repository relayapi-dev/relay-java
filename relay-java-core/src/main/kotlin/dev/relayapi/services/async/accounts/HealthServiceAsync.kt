// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.accounts

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.accounts.health.HealthListParams
import dev.relayapi.models.accounts.health.HealthListResponse
import dev.relayapi.models.accounts.health.HealthRetrieveParams
import dev.relayapi.models.accounts.health.HealthRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface HealthServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): HealthServiceAsync

    /** Check health of a single connected account */
    fun retrieve(id: String): CompletableFuture<HealthRetrieveResponse> =
        retrieve(id, HealthRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: HealthRetrieveParams = HealthRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HealthRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: HealthRetrieveParams = HealthRetrieveParams.none(),
    ): CompletableFuture<HealthRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: HealthRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HealthRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: HealthRetrieveParams): CompletableFuture<HealthRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<HealthRetrieveResponse> =
        retrieve(id, HealthRetrieveParams.none(), requestOptions)

    /** Check health of all connected accounts */
    fun list(): CompletableFuture<HealthListResponse> = list(HealthListParams.none())

    /** @see list */
    fun list(
        params: HealthListParams = HealthListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HealthListResponse>

    /** @see list */
    fun list(
        params: HealthListParams = HealthListParams.none()
    ): CompletableFuture<HealthListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<HealthListResponse> =
        list(HealthListParams.none(), requestOptions)

    /**
     * A view of [HealthServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): HealthServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/accounts/{id}/health`, but is otherwise the same
         * as [HealthServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<HealthRetrieveResponse>> =
            retrieve(id, HealthRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: HealthRetrieveParams = HealthRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HealthRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: HealthRetrieveParams = HealthRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<HealthRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: HealthRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HealthRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: HealthRetrieveParams
        ): CompletableFuture<HttpResponseFor<HealthRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<HealthRetrieveResponse>> =
            retrieve(id, HealthRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/accounts/health`, but is otherwise the same as
         * [HealthServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<HealthListResponse>> =
            list(HealthListParams.none())

        /** @see list */
        fun list(
            params: HealthListParams = HealthListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HealthListResponse>>

        /** @see list */
        fun list(
            params: HealthListParams = HealthListParams.none()
        ): CompletableFuture<HttpResponseFor<HealthListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<HealthListResponse>> =
            list(HealthListParams.none(), requestOptions)
    }
}
