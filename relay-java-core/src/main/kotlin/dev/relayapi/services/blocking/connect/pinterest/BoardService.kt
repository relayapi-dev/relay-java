// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.connect.pinterest

import com.google.errorprone.annotations.MustBeClosed
import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.connect.pinterest.boards.BoardListParams
import dev.relayapi.models.connect.pinterest.boards.BoardListResponse
import dev.relayapi.models.connect.pinterest.boards.BoardSelectParams
import dev.relayapi.models.connect.pinterest.boards.BoardSelectResponse
import java.util.function.Consumer

interface BoardService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BoardService

    /** List Pinterest boards after OAuth */
    fun list(): BoardListResponse = list(BoardListParams.none())

    /** @see list */
    fun list(
        params: BoardListParams = BoardListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BoardListResponse

    /** @see list */
    fun list(params: BoardListParams = BoardListParams.none()): BoardListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): BoardListResponse =
        list(BoardListParams.none(), requestOptions)

    /** Select Pinterest board */
    fun select(params: BoardSelectParams): BoardSelectResponse =
        select(params, RequestOptions.none())

    /** @see select */
    fun select(
        params: BoardSelectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BoardSelectResponse

    /** A view of [BoardService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BoardService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/connect/pinterest/boards`, but is otherwise the
         * same as [BoardService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<BoardListResponse> = list(BoardListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: BoardListParams = BoardListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BoardListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: BoardListParams = BoardListParams.none()
        ): HttpResponseFor<BoardListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<BoardListResponse> =
            list(BoardListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/connect/pinterest/boards`, but is otherwise the
         * same as [BoardService.select].
         */
        @MustBeClosed
        fun select(params: BoardSelectParams): HttpResponseFor<BoardSelectResponse> =
            select(params, RequestOptions.none())

        /** @see select */
        @MustBeClosed
        fun select(
            params: BoardSelectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BoardSelectResponse>
    }
}
