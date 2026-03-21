// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.connect.pinterest

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.connect.pinterest.boards.BoardListParams
import dev.relayapi.models.connect.pinterest.boards.BoardListResponse
import dev.relayapi.models.connect.pinterest.boards.BoardSelectParams
import dev.relayapi.models.connect.pinterest.boards.BoardSelectResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BoardServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BoardServiceAsync

    /** List Pinterest boards after OAuth */
    fun list(): CompletableFuture<BoardListResponse> = list(BoardListParams.none())

    /** @see list */
    fun list(
        params: BoardListParams = BoardListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BoardListResponse>

    /** @see list */
    fun list(
        params: BoardListParams = BoardListParams.none()
    ): CompletableFuture<BoardListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<BoardListResponse> =
        list(BoardListParams.none(), requestOptions)

    /** Select Pinterest board */
    fun select(params: BoardSelectParams): CompletableFuture<BoardSelectResponse> =
        select(params, RequestOptions.none())

    /** @see select */
    fun select(
        params: BoardSelectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BoardSelectResponse>

    /** A view of [BoardServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BoardServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/connect/pinterest/boards`, but is otherwise the
         * same as [BoardServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<BoardListResponse>> =
            list(BoardListParams.none())

        /** @see list */
        fun list(
            params: BoardListParams = BoardListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BoardListResponse>>

        /** @see list */
        fun list(
            params: BoardListParams = BoardListParams.none()
        ): CompletableFuture<HttpResponseFor<BoardListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BoardListResponse>> =
            list(BoardListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/connect/pinterest/boards`, but is otherwise the
         * same as [BoardServiceAsync.select].
         */
        fun select(
            params: BoardSelectParams
        ): CompletableFuture<HttpResponseFor<BoardSelectResponse>> =
            select(params, RequestOptions.none())

        /** @see select */
        fun select(
            params: BoardSelectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BoardSelectResponse>>
    }
}
