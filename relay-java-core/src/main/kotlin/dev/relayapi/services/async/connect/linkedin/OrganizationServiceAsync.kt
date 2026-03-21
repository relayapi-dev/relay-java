// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.connect.linkedin

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.connect.linkedin.organizations.OrganizationListParams
import dev.relayapi.models.connect.linkedin.organizations.OrganizationListResponse
import dev.relayapi.models.connect.linkedin.organizations.OrganizationSelectParams
import dev.relayapi.models.connect.linkedin.organizations.OrganizationSelectResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface OrganizationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrganizationServiceAsync

    /** List LinkedIn organizations after OAuth */
    fun list(): CompletableFuture<OrganizationListResponse> = list(OrganizationListParams.none())

    /** @see list */
    fun list(
        params: OrganizationListParams = OrganizationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrganizationListResponse>

    /** @see list */
    fun list(
        params: OrganizationListParams = OrganizationListParams.none()
    ): CompletableFuture<OrganizationListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<OrganizationListResponse> =
        list(OrganizationListParams.none(), requestOptions)

    /** Select LinkedIn organization */
    fun select(params: OrganizationSelectParams): CompletableFuture<OrganizationSelectResponse> =
        select(params, RequestOptions.none())

    /** @see select */
    fun select(
        params: OrganizationSelectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrganizationSelectResponse>

    /**
     * A view of [OrganizationServiceAsync] that provides access to raw HTTP responses for each
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
        ): OrganizationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/connect/linkedin/organizations`, but is
         * otherwise the same as [OrganizationServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<OrganizationListResponse>> =
            list(OrganizationListParams.none())

        /** @see list */
        fun list(
            params: OrganizationListParams = OrganizationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrganizationListResponse>>

        /** @see list */
        fun list(
            params: OrganizationListParams = OrganizationListParams.none()
        ): CompletableFuture<HttpResponseFor<OrganizationListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<OrganizationListResponse>> =
            list(OrganizationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/connect/linkedin/organizations`, but is
         * otherwise the same as [OrganizationServiceAsync.select].
         */
        fun select(
            params: OrganizationSelectParams
        ): CompletableFuture<HttpResponseFor<OrganizationSelectResponse>> =
            select(params, RequestOptions.none())

        /** @see select */
        fun select(
            params: OrganizationSelectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrganizationSelectResponse>>
    }
}
