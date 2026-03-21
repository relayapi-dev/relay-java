// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.inbox.reviews

import com.google.errorprone.annotations.MustBeClosed
import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.inbox.reviews.reply.ReplyCreateParams
import dev.relayapi.models.inbox.reviews.reply.ReplyCreateResponse
import dev.relayapi.models.inbox.reviews.reply.ReplyDeleteParams
import dev.relayapi.models.inbox.reviews.reply.ReplyDeleteResponse
import java.util.function.Consumer

interface ReplyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReplyService

    /** Reply to a review */
    fun create(reviewId: String, params: ReplyCreateParams): ReplyCreateResponse =
        create(reviewId, params, RequestOptions.none())

    /** @see create */
    fun create(
        reviewId: String,
        params: ReplyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReplyCreateResponse = create(params.toBuilder().reviewId(reviewId).build(), requestOptions)

    /** @see create */
    fun create(params: ReplyCreateParams): ReplyCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ReplyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReplyCreateResponse

    /** Delete a review reply */
    fun delete(reviewId: String): ReplyDeleteResponse = delete(reviewId, ReplyDeleteParams.none())

    /** @see delete */
    fun delete(
        reviewId: String,
        params: ReplyDeleteParams = ReplyDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReplyDeleteResponse = delete(params.toBuilder().reviewId(reviewId).build(), requestOptions)

    /** @see delete */
    fun delete(
        reviewId: String,
        params: ReplyDeleteParams = ReplyDeleteParams.none(),
    ): ReplyDeleteResponse = delete(reviewId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ReplyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReplyDeleteResponse

    /** @see delete */
    fun delete(params: ReplyDeleteParams): ReplyDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(reviewId: String, requestOptions: RequestOptions): ReplyDeleteResponse =
        delete(reviewId, ReplyDeleteParams.none(), requestOptions)

    /** A view of [ReplyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReplyService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/inbox/reviews/{review_id}/reply`, but is
         * otherwise the same as [ReplyService.create].
         */
        @MustBeClosed
        fun create(
            reviewId: String,
            params: ReplyCreateParams,
        ): HttpResponseFor<ReplyCreateResponse> = create(reviewId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            reviewId: String,
            params: ReplyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReplyCreateResponse> =
            create(params.toBuilder().reviewId(reviewId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: ReplyCreateParams): HttpResponseFor<ReplyCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ReplyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReplyCreateResponse>

        /**
         * Returns a raw HTTP response for `delete /v1/inbox/reviews/{review_id}/reply`, but is
         * otherwise the same as [ReplyService.delete].
         */
        @MustBeClosed
        fun delete(reviewId: String): HttpResponseFor<ReplyDeleteResponse> =
            delete(reviewId, ReplyDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            reviewId: String,
            params: ReplyDeleteParams = ReplyDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReplyDeleteResponse> =
            delete(params.toBuilder().reviewId(reviewId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            reviewId: String,
            params: ReplyDeleteParams = ReplyDeleteParams.none(),
        ): HttpResponseFor<ReplyDeleteResponse> = delete(reviewId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ReplyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReplyDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: ReplyDeleteParams): HttpResponseFor<ReplyDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            reviewId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReplyDeleteResponse> =
            delete(reviewId, ReplyDeleteParams.none(), requestOptions)
    }
}
