// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.inbox

import com.google.errorprone.annotations.MustBeClosed
import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.inbox.reviews.ReviewListParams
import dev.relayapi.models.inbox.reviews.ReviewListResponse
import dev.relayapi.services.blocking.inbox.reviews.ReplyService
import java.util.function.Consumer

interface ReviewService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReviewService

    fun reply(): ReplyService

    /** List reviews across platforms */
    fun list(): ReviewListResponse = list(ReviewListParams.none())

    /** @see list */
    fun list(
        params: ReviewListParams = ReviewListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReviewListResponse

    /** @see list */
    fun list(params: ReviewListParams = ReviewListParams.none()): ReviewListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ReviewListResponse =
        list(ReviewListParams.none(), requestOptions)

    /** A view of [ReviewService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReviewService.WithRawResponse

        fun reply(): ReplyService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/inbox/reviews`, but is otherwise the same as
         * [ReviewService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ReviewListResponse> = list(ReviewListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ReviewListParams = ReviewListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReviewListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ReviewListParams = ReviewListParams.none()
        ): HttpResponseFor<ReviewListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ReviewListResponse> =
            list(ReviewListParams.none(), requestOptions)
    }
}
