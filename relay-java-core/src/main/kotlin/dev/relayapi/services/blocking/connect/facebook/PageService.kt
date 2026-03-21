// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.connect.facebook

import com.google.errorprone.annotations.MustBeClosed
import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.connect.facebook.pages.PageListParams
import dev.relayapi.models.connect.facebook.pages.PageListResponse
import dev.relayapi.models.connect.facebook.pages.PageSelectParams
import dev.relayapi.models.connect.facebook.pages.PageSelectResponse
import java.util.function.Consumer

interface PageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PageService

    /** List Facebook Pages after OAuth */
    fun list(): PageListResponse = list(PageListParams.none())

    /** @see list */
    fun list(
        params: PageListParams = PageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PageListResponse

    /** @see list */
    fun list(params: PageListParams = PageListParams.none()): PageListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): PageListResponse =
        list(PageListParams.none(), requestOptions)

    /** Select Facebook Page to connect */
    fun select(params: PageSelectParams): PageSelectResponse = select(params, RequestOptions.none())

    /** @see select */
    fun select(
        params: PageSelectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PageSelectResponse

    /** A view of [PageService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/connect/facebook/pages`, but is otherwise the
         * same as [PageService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<PageListResponse> = list(PageListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PageListParams = PageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PageListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: PageListParams = PageListParams.none()
        ): HttpResponseFor<PageListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PageListResponse> =
            list(PageListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/connect/facebook/pages`, but is otherwise the
         * same as [PageService.select].
         */
        @MustBeClosed
        fun select(params: PageSelectParams): HttpResponseFor<PageSelectResponse> =
            select(params, RequestOptions.none())

        /** @see select */
        @MustBeClosed
        fun select(
            params: PageSelectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PageSelectResponse>
    }
}
