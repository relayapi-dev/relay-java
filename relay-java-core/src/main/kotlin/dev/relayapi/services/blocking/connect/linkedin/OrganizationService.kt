// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.connect.linkedin

import com.google.errorprone.annotations.MustBeClosed
import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.connect.linkedin.organizations.OrganizationListParams
import dev.relayapi.models.connect.linkedin.organizations.OrganizationListResponse
import dev.relayapi.models.connect.linkedin.organizations.OrganizationSelectParams
import dev.relayapi.models.connect.linkedin.organizations.OrganizationSelectResponse
import java.util.function.Consumer

interface OrganizationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrganizationService

    /** List LinkedIn organizations after OAuth */
    fun list(): OrganizationListResponse = list(OrganizationListParams.none())

    /** @see list */
    fun list(
        params: OrganizationListParams = OrganizationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrganizationListResponse

    /** @see list */
    fun list(
        params: OrganizationListParams = OrganizationListParams.none()
    ): OrganizationListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): OrganizationListResponse =
        list(OrganizationListParams.none(), requestOptions)

    /** Select LinkedIn organization */
    fun select(params: OrganizationSelectParams): OrganizationSelectResponse =
        select(params, RequestOptions.none())

    /** @see select */
    fun select(
        params: OrganizationSelectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrganizationSelectResponse

    /**
     * A view of [OrganizationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OrganizationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/connect/linkedin/organizations`, but is
         * otherwise the same as [OrganizationService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<OrganizationListResponse> = list(OrganizationListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: OrganizationListParams = OrganizationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrganizationListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: OrganizationListParams = OrganizationListParams.none()
        ): HttpResponseFor<OrganizationListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<OrganizationListResponse> =
            list(OrganizationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/connect/linkedin/organizations`, but is
         * otherwise the same as [OrganizationService.select].
         */
        @MustBeClosed
        fun select(params: OrganizationSelectParams): HttpResponseFor<OrganizationSelectResponse> =
            select(params, RequestOptions.none())

        /** @see select */
        @MustBeClosed
        fun select(
            params: OrganizationSelectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrganizationSelectResponse>
    }
}
