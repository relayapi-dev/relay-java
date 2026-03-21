// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.accounts

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.accounts.facebookpages.FacebookPageRetrieveParams
import dev.relayapi.models.accounts.facebookpages.FacebookPageRetrieveResponse
import dev.relayapi.models.accounts.facebookpages.FacebookPageSetDefaultParams
import dev.relayapi.models.accounts.facebookpages.FacebookPageSetDefaultResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FacebookPageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FacebookPageServiceAsync

    /** Fetch Facebook pages for an account */
    fun retrieve(id: String): CompletableFuture<FacebookPageRetrieveResponse> =
        retrieve(id, FacebookPageRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: FacebookPageRetrieveParams = FacebookPageRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FacebookPageRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: FacebookPageRetrieveParams = FacebookPageRetrieveParams.none(),
    ): CompletableFuture<FacebookPageRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: FacebookPageRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FacebookPageRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: FacebookPageRetrieveParams
    ): CompletableFuture<FacebookPageRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FacebookPageRetrieveResponse> =
        retrieve(id, FacebookPageRetrieveParams.none(), requestOptions)

    /** Set default Facebook page */
    fun setDefault(
        id: String,
        params: FacebookPageSetDefaultParams,
    ): CompletableFuture<FacebookPageSetDefaultResponse> =
        setDefault(id, params, RequestOptions.none())

    /** @see setDefault */
    fun setDefault(
        id: String,
        params: FacebookPageSetDefaultParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FacebookPageSetDefaultResponse> =
        setDefault(params.toBuilder().id(id).build(), requestOptions)

    /** @see setDefault */
    fun setDefault(
        params: FacebookPageSetDefaultParams
    ): CompletableFuture<FacebookPageSetDefaultResponse> = setDefault(params, RequestOptions.none())

    /** @see setDefault */
    fun setDefault(
        params: FacebookPageSetDefaultParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FacebookPageSetDefaultResponse>

    /**
     * A view of [FacebookPageServiceAsync] that provides access to raw HTTP responses for each
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
        ): FacebookPageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/accounts/{id}/facebook-pages`, but is otherwise
         * the same as [FacebookPageServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<FacebookPageRetrieveResponse>> =
            retrieve(id, FacebookPageRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: FacebookPageRetrieveParams = FacebookPageRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FacebookPageRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: FacebookPageRetrieveParams = FacebookPageRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<FacebookPageRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: FacebookPageRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FacebookPageRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: FacebookPageRetrieveParams
        ): CompletableFuture<HttpResponseFor<FacebookPageRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FacebookPageRetrieveResponse>> =
            retrieve(id, FacebookPageRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/accounts/{id}/facebook-pages`, but is otherwise
         * the same as [FacebookPageServiceAsync.setDefault].
         */
        fun setDefault(
            id: String,
            params: FacebookPageSetDefaultParams,
        ): CompletableFuture<HttpResponseFor<FacebookPageSetDefaultResponse>> =
            setDefault(id, params, RequestOptions.none())

        /** @see setDefault */
        fun setDefault(
            id: String,
            params: FacebookPageSetDefaultParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FacebookPageSetDefaultResponse>> =
            setDefault(params.toBuilder().id(id).build(), requestOptions)

        /** @see setDefault */
        fun setDefault(
            params: FacebookPageSetDefaultParams
        ): CompletableFuture<HttpResponseFor<FacebookPageSetDefaultResponse>> =
            setDefault(params, RequestOptions.none())

        /** @see setDefault */
        fun setDefault(
            params: FacebookPageSetDefaultParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FacebookPageSetDefaultResponse>>
    }
}
