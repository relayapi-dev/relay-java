// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.whatsapp

import com.google.errorprone.annotations.MustBeClosed
import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.whatsapp.businessprofile.BusinessProfileRetrieveParams
import dev.relayapi.models.whatsapp.businessprofile.BusinessProfileRetrieveResponse
import dev.relayapi.models.whatsapp.businessprofile.BusinessProfileUpdateParams
import dev.relayapi.models.whatsapp.businessprofile.BusinessProfileUpdateResponse
import java.util.function.Consumer

interface BusinessProfileService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BusinessProfileService

    /** Get WhatsApp Business profile */
    fun retrieve(params: BusinessProfileRetrieveParams): BusinessProfileRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BusinessProfileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BusinessProfileRetrieveResponse

    /** Update WhatsApp Business profile */
    fun update(params: BusinessProfileUpdateParams): BusinessProfileUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BusinessProfileUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BusinessProfileUpdateResponse

    /**
     * A view of [BusinessProfileService] that provides access to raw HTTP responses for each
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
        ): BusinessProfileService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/whatsapp/business-profile`, but is otherwise the
         * same as [BusinessProfileService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: BusinessProfileRetrieveParams
        ): HttpResponseFor<BusinessProfileRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BusinessProfileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BusinessProfileRetrieveResponse>

        /**
         * Returns a raw HTTP response for `put /v1/whatsapp/business-profile`, but is otherwise the
         * same as [BusinessProfileService.update].
         */
        @MustBeClosed
        fun update(
            params: BusinessProfileUpdateParams
        ): HttpResponseFor<BusinessProfileUpdateResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: BusinessProfileUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BusinessProfileUpdateResponse>
    }
}
