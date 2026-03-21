// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.connect.facebook

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.connect.facebook.pages.PageListParams
import dev.relayapi.models.connect.facebook.pages.PageListResponse
import dev.relayapi.models.connect.facebook.pages.PageSelectParams
import dev.relayapi.models.connect.facebook.pages.PageSelectResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PageServiceAsync

    /** List Facebook Pages after OAuth */
    fun list(): CompletableFuture<PageListResponse> = list(PageListParams.none())

    /** @see list */
    fun list(
        params: PageListParams = PageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PageListResponse>

    /** @see list */
    fun list(params: PageListParams = PageListParams.none()): CompletableFuture<PageListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<PageListResponse> =
        list(PageListParams.none(), requestOptions)

    /** Select Facebook Page to connect */
    fun select(params: PageSelectParams): CompletableFuture<PageSelectResponse> =
        select(params, RequestOptions.none())

    /** @see select */
    fun select(
        params: PageSelectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PageSelectResponse>

    /** A view of [PageServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/connect/facebook/pages`, but is otherwise the
         * same as [PageServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PageListResponse>> =
            list(PageListParams.none())

        /** @see list */
        fun list(
            params: PageListParams = PageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PageListResponse>>

        /** @see list */
        fun list(
            params: PageListParams = PageListParams.none()
        ): CompletableFuture<HttpResponseFor<PageListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PageListResponse>> =
            list(PageListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/connect/facebook/pages`, but is otherwise the
         * same as [PageServiceAsync.select].
         */
        fun select(
            params: PageSelectParams
        ): CompletableFuture<HttpResponseFor<PageSelectResponse>> =
            select(params, RequestOptions.none())

        /** @see select */
        fun select(
            params: PageSelectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PageSelectResponse>>
    }
}
