// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.twitter

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.twitter.bookmark.BookmarkCreateParams
import dev.relayapi.models.twitter.bookmark.BookmarkCreateResponse
import dev.relayapi.models.twitter.bookmark.BookmarkRemoveParams
import dev.relayapi.models.twitter.bookmark.BookmarkRemoveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BookmarkServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BookmarkServiceAsync

    /** Bookmark a tweet */
    fun create(params: BookmarkCreateParams): CompletableFuture<BookmarkCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BookmarkCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BookmarkCreateResponse>

    /** Remove a bookmark */
    fun remove(params: BookmarkRemoveParams): CompletableFuture<BookmarkRemoveResponse> =
        remove(params, RequestOptions.none())

    /** @see remove */
    fun remove(
        params: BookmarkRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BookmarkRemoveResponse>

    /**
     * A view of [BookmarkServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BookmarkServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/twitter/bookmark`, but is otherwise the same as
         * [BookmarkServiceAsync.create].
         */
        fun create(
            params: BookmarkCreateParams
        ): CompletableFuture<HttpResponseFor<BookmarkCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: BookmarkCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BookmarkCreateResponse>>

        /**
         * Returns a raw HTTP response for `delete /v1/twitter/bookmark`, but is otherwise the same
         * as [BookmarkServiceAsync.remove].
         */
        fun remove(
            params: BookmarkRemoveParams
        ): CompletableFuture<HttpResponseFor<BookmarkRemoveResponse>> =
            remove(params, RequestOptions.none())

        /** @see remove */
        fun remove(
            params: BookmarkRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BookmarkRemoveResponse>>
    }
}
