// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.inbox

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.inbox.reviews.ReviewListParams
import dev.relayapi.models.inbox.reviews.ReviewListResponse
import dev.relayapi.services.async.inbox.reviews.ReplyServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ReviewServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReviewServiceAsync

    fun reply(): ReplyServiceAsync

    /** List reviews across platforms */
    fun list(): CompletableFuture<ReviewListResponse> = list(ReviewListParams.none())

    /** @see list */
    fun list(
        params: ReviewListParams = ReviewListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReviewListResponse>

    /** @see list */
    fun list(
        params: ReviewListParams = ReviewListParams.none()
    ): CompletableFuture<ReviewListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ReviewListResponse> =
        list(ReviewListParams.none(), requestOptions)

    /**
     * A view of [ReviewServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ReviewServiceAsync.WithRawResponse

        fun reply(): ReplyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/inbox/reviews`, but is otherwise the same as
         * [ReviewServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ReviewListResponse>> =
            list(ReviewListParams.none())

        /** @see list */
        fun list(
            params: ReviewListParams = ReviewListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReviewListResponse>>

        /** @see list */
        fun list(
            params: ReviewListParams = ReviewListParams.none()
        ): CompletableFuture<HttpResponseFor<ReviewListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ReviewListResponse>> =
            list(ReviewListParams.none(), requestOptions)
    }
}
