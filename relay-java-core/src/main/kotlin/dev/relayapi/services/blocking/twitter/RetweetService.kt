// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.twitter

import com.google.errorprone.annotations.MustBeClosed
import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.twitter.retweet.RetweetCreateParams
import dev.relayapi.models.twitter.retweet.RetweetCreateResponse
import dev.relayapi.models.twitter.retweet.RetweetUndoParams
import dev.relayapi.models.twitter.retweet.RetweetUndoResponse
import java.util.function.Consumer

interface RetweetService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RetweetService

    /** Retweet a tweet */
    fun create(params: RetweetCreateParams): RetweetCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RetweetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RetweetCreateResponse

    /** Undo a retweet */
    fun undo(params: RetweetUndoParams): RetweetUndoResponse = undo(params, RequestOptions.none())

    /** @see undo */
    fun undo(
        params: RetweetUndoParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RetweetUndoResponse

    /** A view of [RetweetService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RetweetService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/twitter/retweet`, but is otherwise the same as
         * [RetweetService.create].
         */
        @MustBeClosed
        fun create(params: RetweetCreateParams): HttpResponseFor<RetweetCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: RetweetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RetweetCreateResponse>

        /**
         * Returns a raw HTTP response for `delete /v1/twitter/retweet`, but is otherwise the same
         * as [RetweetService.undo].
         */
        @MustBeClosed
        fun undo(params: RetweetUndoParams): HttpResponseFor<RetweetUndoResponse> =
            undo(params, RequestOptions.none())

        /** @see undo */
        @MustBeClosed
        fun undo(
            params: RetweetUndoParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RetweetUndoResponse>
    }
}
