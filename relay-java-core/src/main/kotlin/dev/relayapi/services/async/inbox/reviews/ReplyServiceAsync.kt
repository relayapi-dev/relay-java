// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.inbox.reviews

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.inbox.reviews.reply.ReplyCreateParams
import dev.relayapi.models.inbox.reviews.reply.ReplyCreateResponse
import dev.relayapi.models.inbox.reviews.reply.ReplyDeleteParams
import dev.relayapi.models.inbox.reviews.reply.ReplyDeleteResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ReplyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReplyServiceAsync

    /** Reply to a review */
    fun create(
        reviewId: String,
        params: ReplyCreateParams,
    ): CompletableFuture<ReplyCreateResponse> = create(reviewId, params, RequestOptions.none())

    /** @see create */
    fun create(
        reviewId: String,
        params: ReplyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReplyCreateResponse> =
        create(params.toBuilder().reviewId(reviewId).build(), requestOptions)

    /** @see create */
    fun create(params: ReplyCreateParams): CompletableFuture<ReplyCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ReplyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReplyCreateResponse>

    /** Delete a review reply */
    fun delete(reviewId: String): CompletableFuture<ReplyDeleteResponse> =
        delete(reviewId, ReplyDeleteParams.none())

    /** @see delete */
    fun delete(
        reviewId: String,
        params: ReplyDeleteParams = ReplyDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReplyDeleteResponse> =
        delete(params.toBuilder().reviewId(reviewId).build(), requestOptions)

    /** @see delete */
    fun delete(
        reviewId: String,
        params: ReplyDeleteParams = ReplyDeleteParams.none(),
    ): CompletableFuture<ReplyDeleteResponse> = delete(reviewId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ReplyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReplyDeleteResponse>

    /** @see delete */
    fun delete(params: ReplyDeleteParams): CompletableFuture<ReplyDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        reviewId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ReplyDeleteResponse> =
        delete(reviewId, ReplyDeleteParams.none(), requestOptions)

    /** A view of [ReplyServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ReplyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/inbox/reviews/{review_id}/reply`, but is
         * otherwise the same as [ReplyServiceAsync.create].
         */
        fun create(
            reviewId: String,
            params: ReplyCreateParams,
        ): CompletableFuture<HttpResponseFor<ReplyCreateResponse>> =
            create(reviewId, params, RequestOptions.none())

        /** @see create */
        fun create(
            reviewId: String,
            params: ReplyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReplyCreateResponse>> =
            create(params.toBuilder().reviewId(reviewId).build(), requestOptions)

        /** @see create */
        fun create(
            params: ReplyCreateParams
        ): CompletableFuture<HttpResponseFor<ReplyCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ReplyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReplyCreateResponse>>

        /**
         * Returns a raw HTTP response for `delete /v1/inbox/reviews/{review_id}/reply`, but is
         * otherwise the same as [ReplyServiceAsync.delete].
         */
        fun delete(reviewId: String): CompletableFuture<HttpResponseFor<ReplyDeleteResponse>> =
            delete(reviewId, ReplyDeleteParams.none())

        /** @see delete */
        fun delete(
            reviewId: String,
            params: ReplyDeleteParams = ReplyDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReplyDeleteResponse>> =
            delete(params.toBuilder().reviewId(reviewId).build(), requestOptions)

        /** @see delete */
        fun delete(
            reviewId: String,
            params: ReplyDeleteParams = ReplyDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<ReplyDeleteResponse>> =
            delete(reviewId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ReplyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReplyDeleteResponse>>

        /** @see delete */
        fun delete(
            params: ReplyDeleteParams
        ): CompletableFuture<HttpResponseFor<ReplyDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            reviewId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ReplyDeleteResponse>> =
            delete(reviewId, ReplyDeleteParams.none(), requestOptions)
    }
}
