// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.accounts

import com.google.errorprone.annotations.MustBeClosed
import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.accounts.linkedinorganizations.LinkedinOrganizationRetrieveParams
import dev.relayapi.models.accounts.linkedinorganizations.LinkedinOrganizationRetrieveResponse
import dev.relayapi.models.accounts.linkedinorganizations.LinkedinOrganizationSwitchTypeParams
import dev.relayapi.models.accounts.linkedinorganizations.LinkedinOrganizationSwitchTypeResponse
import java.util.function.Consumer

interface LinkedinOrganizationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LinkedinOrganizationService

    /** Fetch LinkedIn organizations for an account */
    fun retrieve(id: String): LinkedinOrganizationRetrieveResponse =
        retrieve(id, LinkedinOrganizationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: LinkedinOrganizationRetrieveParams = LinkedinOrganizationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LinkedinOrganizationRetrieveResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: LinkedinOrganizationRetrieveParams = LinkedinOrganizationRetrieveParams.none(),
    ): LinkedinOrganizationRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: LinkedinOrganizationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LinkedinOrganizationRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: LinkedinOrganizationRetrieveParams): LinkedinOrganizationRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): LinkedinOrganizationRetrieveResponse =
        retrieve(id, LinkedinOrganizationRetrieveParams.none(), requestOptions)

    /** Switch LinkedIn account type */
    fun switchType(
        id: String,
        params: LinkedinOrganizationSwitchTypeParams,
    ): LinkedinOrganizationSwitchTypeResponse = switchType(id, params, RequestOptions.none())

    /** @see switchType */
    fun switchType(
        id: String,
        params: LinkedinOrganizationSwitchTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LinkedinOrganizationSwitchTypeResponse =
        switchType(params.toBuilder().id(id).build(), requestOptions)

    /** @see switchType */
    fun switchType(
        params: LinkedinOrganizationSwitchTypeParams
    ): LinkedinOrganizationSwitchTypeResponse = switchType(params, RequestOptions.none())

    /** @see switchType */
    fun switchType(
        params: LinkedinOrganizationSwitchTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LinkedinOrganizationSwitchTypeResponse

    /**
     * A view of [LinkedinOrganizationService] that provides access to raw HTTP responses for each
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
        ): LinkedinOrganizationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/accounts/{id}/linkedin-organizations`, but is
         * otherwise the same as [LinkedinOrganizationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<LinkedinOrganizationRetrieveResponse> =
            retrieve(id, LinkedinOrganizationRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: LinkedinOrganizationRetrieveParams = LinkedinOrganizationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LinkedinOrganizationRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: LinkedinOrganizationRetrieveParams = LinkedinOrganizationRetrieveParams.none(),
        ): HttpResponseFor<LinkedinOrganizationRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: LinkedinOrganizationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LinkedinOrganizationRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: LinkedinOrganizationRetrieveParams
        ): HttpResponseFor<LinkedinOrganizationRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LinkedinOrganizationRetrieveResponse> =
            retrieve(id, LinkedinOrganizationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/accounts/{id}/linkedin-organizations`, but is
         * otherwise the same as [LinkedinOrganizationService.switchType].
         */
        @MustBeClosed
        fun switchType(
            id: String,
            params: LinkedinOrganizationSwitchTypeParams,
        ): HttpResponseFor<LinkedinOrganizationSwitchTypeResponse> =
            switchType(id, params, RequestOptions.none())

        /** @see switchType */
        @MustBeClosed
        fun switchType(
            id: String,
            params: LinkedinOrganizationSwitchTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LinkedinOrganizationSwitchTypeResponse> =
            switchType(params.toBuilder().id(id).build(), requestOptions)

        /** @see switchType */
        @MustBeClosed
        fun switchType(
            params: LinkedinOrganizationSwitchTypeParams
        ): HttpResponseFor<LinkedinOrganizationSwitchTypeResponse> =
            switchType(params, RequestOptions.none())

        /** @see switchType */
        @MustBeClosed
        fun switchType(
            params: LinkedinOrganizationSwitchTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LinkedinOrganizationSwitchTypeResponse>
    }
}
