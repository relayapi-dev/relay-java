// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.twitter

import com.google.errorprone.annotations.MustBeClosed
import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.twitter.bookmark.BookmarkCreateParams
import dev.relayapi.models.twitter.bookmark.BookmarkCreateResponse
import dev.relayapi.models.twitter.bookmark.BookmarkRemoveParams
import dev.relayapi.models.twitter.bookmark.BookmarkRemoveResponse
import java.util.function.Consumer

interface BookmarkService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BookmarkService

    /** Bookmark a tweet */
    fun create(params: BookmarkCreateParams): BookmarkCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BookmarkCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookmarkCreateResponse

    /** Remove a bookmark */
    fun remove(params: BookmarkRemoveParams): BookmarkRemoveResponse =
        remove(params, RequestOptions.none())

    /** @see remove */
    fun remove(
        params: BookmarkRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookmarkRemoveResponse

    /** A view of [BookmarkService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BookmarkService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/twitter/bookmark`, but is otherwise the same as
         * [BookmarkService.create].
         */
        @MustBeClosed
        fun create(params: BookmarkCreateParams): HttpResponseFor<BookmarkCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: BookmarkCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookmarkCreateResponse>

        /**
         * Returns a raw HTTP response for `delete /v1/twitter/bookmark`, but is otherwise the same
         * as [BookmarkService.remove].
         */
        @MustBeClosed
        fun remove(params: BookmarkRemoveParams): HttpResponseFor<BookmarkRemoveResponse> =
            remove(params, RequestOptions.none())

        /** @see remove */
        @MustBeClosed
        fun remove(
            params: BookmarkRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookmarkRemoveResponse>
    }
}
