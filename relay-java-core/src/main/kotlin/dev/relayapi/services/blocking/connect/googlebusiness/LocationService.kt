// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.connect.googlebusiness

import com.google.errorprone.annotations.MustBeClosed
import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.connect.googlebusiness.locations.LocationListParams
import dev.relayapi.models.connect.googlebusiness.locations.LocationListResponse
import dev.relayapi.models.connect.googlebusiness.locations.LocationSelectParams
import dev.relayapi.models.connect.googlebusiness.locations.LocationSelectResponse
import java.util.function.Consumer

interface LocationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LocationService

    /** List Google Business locations after OAuth */
    fun list(): LocationListResponse = list(LocationListParams.none())

    /** @see list */
    fun list(
        params: LocationListParams = LocationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LocationListResponse

    /** @see list */
    fun list(params: LocationListParams = LocationListParams.none()): LocationListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): LocationListResponse =
        list(LocationListParams.none(), requestOptions)

    /** Select Google Business location */
    fun select(params: LocationSelectParams): LocationSelectResponse =
        select(params, RequestOptions.none())

    /** @see select */
    fun select(
        params: LocationSelectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LocationSelectResponse

    /** A view of [LocationService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LocationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/connect/googlebusiness/locations`, but is
         * otherwise the same as [LocationService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<LocationListResponse> = list(LocationListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: LocationListParams = LocationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LocationListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: LocationListParams = LocationListParams.none()
        ): HttpResponseFor<LocationListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<LocationListResponse> =
            list(LocationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/connect/googlebusiness/locations`, but is
         * otherwise the same as [LocationService.select].
         */
        @MustBeClosed
        fun select(params: LocationSelectParams): HttpResponseFor<LocationSelectResponse> =
            select(params, RequestOptions.none())

        /** @see select */
        @MustBeClosed
        fun select(
            params: LocationSelectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LocationSelectResponse>
    }
}
