// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.accounts

import com.google.errorprone.annotations.MustBeClosed
import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.accounts.facebookpages.FacebookPageRetrieveParams
import dev.relayapi.models.accounts.facebookpages.FacebookPageRetrieveResponse
import dev.relayapi.models.accounts.facebookpages.FacebookPageSetDefaultParams
import dev.relayapi.models.accounts.facebookpages.FacebookPageSetDefaultResponse
import java.util.function.Consumer

interface FacebookPageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FacebookPageService

    /** Fetch Facebook pages for an account */
    fun retrieve(id: String): FacebookPageRetrieveResponse =
        retrieve(id, FacebookPageRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: FacebookPageRetrieveParams = FacebookPageRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FacebookPageRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: FacebookPageRetrieveParams = FacebookPageRetrieveParams.none(),
    ): FacebookPageRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: FacebookPageRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FacebookPageRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: FacebookPageRetrieveParams): FacebookPageRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): FacebookPageRetrieveResponse =
        retrieve(id, FacebookPageRetrieveParams.none(), requestOptions)

    /** Set default Facebook page */
    fun setDefault(
        id: String,
        params: FacebookPageSetDefaultParams,
    ): FacebookPageSetDefaultResponse = setDefault(id, params, RequestOptions.none())

    /** @see setDefault */
    fun setDefault(
        id: String,
        params: FacebookPageSetDefaultParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FacebookPageSetDefaultResponse =
        setDefault(params.toBuilder().id(id).build(), requestOptions)

    /** @see setDefault */
    fun setDefault(params: FacebookPageSetDefaultParams): FacebookPageSetDefaultResponse =
        setDefault(params, RequestOptions.none())

    /** @see setDefault */
    fun setDefault(
        params: FacebookPageSetDefaultParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FacebookPageSetDefaultResponse

    /**
     * A view of [FacebookPageService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FacebookPageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/accounts/{id}/facebook-pages`, but is otherwise
         * the same as [FacebookPageService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<FacebookPageRetrieveResponse> =
            retrieve(id, FacebookPageRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: FacebookPageRetrieveParams = FacebookPageRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FacebookPageRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: FacebookPageRetrieveParams = FacebookPageRetrieveParams.none(),
        ): HttpResponseFor<FacebookPageRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: FacebookPageRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FacebookPageRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: FacebookPageRetrieveParams
        ): HttpResponseFor<FacebookPageRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FacebookPageRetrieveResponse> =
            retrieve(id, FacebookPageRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/accounts/{id}/facebook-pages`, but is otherwise
         * the same as [FacebookPageService.setDefault].
         */
        @MustBeClosed
        fun setDefault(
            id: String,
            params: FacebookPageSetDefaultParams,
        ): HttpResponseFor<FacebookPageSetDefaultResponse> =
            setDefault(id, params, RequestOptions.none())

        /** @see setDefault */
        @MustBeClosed
        fun setDefault(
            id: String,
            params: FacebookPageSetDefaultParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FacebookPageSetDefaultResponse> =
            setDefault(params.toBuilder().id(id).build(), requestOptions)

        /** @see setDefault */
        @MustBeClosed
        fun setDefault(
            params: FacebookPageSetDefaultParams
        ): HttpResponseFor<FacebookPageSetDefaultResponse> =
            setDefault(params, RequestOptions.none())

        /** @see setDefault */
        @MustBeClosed
        fun setDefault(
            params: FacebookPageSetDefaultParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FacebookPageSetDefaultResponse>
    }
}
