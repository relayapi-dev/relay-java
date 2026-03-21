// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.twitter

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.twitter.retweet.RetweetCreateParams
import dev.relayapi.models.twitter.retweet.RetweetCreateResponse
import dev.relayapi.models.twitter.retweet.RetweetUndoParams
import dev.relayapi.models.twitter.retweet.RetweetUndoResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RetweetServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RetweetServiceAsync

    /** Retweet a tweet */
    fun create(params: RetweetCreateParams): CompletableFuture<RetweetCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RetweetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RetweetCreateResponse>

    /** Undo a retweet */
    fun undo(params: RetweetUndoParams): CompletableFuture<RetweetUndoResponse> =
        undo(params, RequestOptions.none())

    /** @see undo */
    fun undo(
        params: RetweetUndoParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RetweetUndoResponse>

    /**
     * A view of [RetweetServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RetweetServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/twitter/retweet`, but is otherwise the same as
         * [RetweetServiceAsync.create].
         */
        fun create(
            params: RetweetCreateParams
        ): CompletableFuture<HttpResponseFor<RetweetCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: RetweetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RetweetCreateResponse>>

        /**
         * Returns a raw HTTP response for `delete /v1/twitter/retweet`, but is otherwise the same
         * as [RetweetServiceAsync.undo].
         */
        fun undo(
            params: RetweetUndoParams
        ): CompletableFuture<HttpResponseFor<RetweetUndoResponse>> =
            undo(params, RequestOptions.none())

        /** @see undo */
        fun undo(
            params: RetweetUndoParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RetweetUndoResponse>>
    }
}
