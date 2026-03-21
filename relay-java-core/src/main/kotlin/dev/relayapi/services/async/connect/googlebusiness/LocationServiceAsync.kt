// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.connect.googlebusiness

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.connect.googlebusiness.locations.LocationListParams
import dev.relayapi.models.connect.googlebusiness.locations.LocationListResponse
import dev.relayapi.models.connect.googlebusiness.locations.LocationSelectParams
import dev.relayapi.models.connect.googlebusiness.locations.LocationSelectResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LocationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LocationServiceAsync

    /** List Google Business locations after OAuth */
    fun list(): CompletableFuture<LocationListResponse> = list(LocationListParams.none())

    /** @see list */
    fun list(
        params: LocationListParams = LocationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LocationListResponse>

    /** @see list */
    fun list(
        params: LocationListParams = LocationListParams.none()
    ): CompletableFuture<LocationListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<LocationListResponse> =
        list(LocationListParams.none(), requestOptions)

    /** Select Google Business location */
    fun select(params: LocationSelectParams): CompletableFuture<LocationSelectResponse> =
        select(params, RequestOptions.none())

    /** @see select */
    fun select(
        params: LocationSelectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LocationSelectResponse>

    /**
     * A view of [LocationServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LocationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/connect/googlebusiness/locations`, but is
         * otherwise the same as [LocationServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<LocationListResponse>> =
            list(LocationListParams.none())

        /** @see list */
        fun list(
            params: LocationListParams = LocationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LocationListResponse>>

        /** @see list */
        fun list(
            params: LocationListParams = LocationListParams.none()
        ): CompletableFuture<HttpResponseFor<LocationListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LocationListResponse>> =
            list(LocationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/connect/googlebusiness/locations`, but is
         * otherwise the same as [LocationServiceAsync.select].
         */
        fun select(
            params: LocationSelectParams
        ): CompletableFuture<HttpResponseFor<LocationSelectResponse>> =
            select(params, RequestOptions.none())

        /** @see select */
        fun select(
            params: LocationSelectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LocationSelectResponse>>
    }
}
