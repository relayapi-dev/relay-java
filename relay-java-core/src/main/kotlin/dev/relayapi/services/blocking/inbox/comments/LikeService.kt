// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.inbox.comments

import com.google.errorprone.annotations.MustBeClosed
import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.inbox.comments.like.LikeCreateParams
import dev.relayapi.models.inbox.comments.like.LikeCreateResponse
import dev.relayapi.models.inbox.comments.like.LikeDeleteParams
import dev.relayapi.models.inbox.comments.like.LikeDeleteResponse
import java.util.function.Consumer

interface LikeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LikeService

    /** Like a comment */
    fun create(commentId: String): LikeCreateResponse = create(commentId, LikeCreateParams.none())

    /** @see create */
    fun create(
        commentId: String,
        params: LikeCreateParams = LikeCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LikeCreateResponse = create(params.toBuilder().commentId(commentId).build(), requestOptions)

    /** @see create */
    fun create(
        commentId: String,
        params: LikeCreateParams = LikeCreateParams.none(),
    ): LikeCreateResponse = create(commentId, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LikeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LikeCreateResponse

    /** @see create */
    fun create(params: LikeCreateParams): LikeCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(commentId: String, requestOptions: RequestOptions): LikeCreateResponse =
        create(commentId, LikeCreateParams.none(), requestOptions)

    /** Unlike a comment */
    fun delete(commentId: String): LikeDeleteResponse = delete(commentId, LikeDeleteParams.none())

    /** @see delete */
    fun delete(
        commentId: String,
        params: LikeDeleteParams = LikeDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LikeDeleteResponse = delete(params.toBuilder().commentId(commentId).build(), requestOptions)

    /** @see delete */
    fun delete(
        commentId: String,
        params: LikeDeleteParams = LikeDeleteParams.none(),
    ): LikeDeleteResponse = delete(commentId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: LikeDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LikeDeleteResponse

    /** @see delete */
    fun delete(params: LikeDeleteParams): LikeDeleteResponse = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(commentId: String, requestOptions: RequestOptions): LikeDeleteResponse =
        delete(commentId, LikeDeleteParams.none(), requestOptions)

    /** A view of [LikeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LikeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/inbox/comments/{comment_id}/like`, but is
         * otherwise the same as [LikeService.create].
         */
        @MustBeClosed
        fun create(commentId: String): HttpResponseFor<LikeCreateResponse> =
            create(commentId, LikeCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            commentId: String,
            params: LikeCreateParams = LikeCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LikeCreateResponse> =
            create(params.toBuilder().commentId(commentId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            commentId: String,
            params: LikeCreateParams = LikeCreateParams.none(),
        ): HttpResponseFor<LikeCreateResponse> = create(commentId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: LikeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LikeCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(params: LikeCreateParams): HttpResponseFor<LikeCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            commentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LikeCreateResponse> =
            create(commentId, LikeCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/inbox/comments/{comment_id}/like`, but is
         * otherwise the same as [LikeService.delete].
         */
        @MustBeClosed
        fun delete(commentId: String): HttpResponseFor<LikeDeleteResponse> =
            delete(commentId, LikeDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            commentId: String,
            params: LikeDeleteParams = LikeDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LikeDeleteResponse> =
            delete(params.toBuilder().commentId(commentId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            commentId: String,
            params: LikeDeleteParams = LikeDeleteParams.none(),
        ): HttpResponseFor<LikeDeleteResponse> = delete(commentId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: LikeDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LikeDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: LikeDeleteParams): HttpResponseFor<LikeDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            commentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LikeDeleteResponse> =
            delete(commentId, LikeDeleteParams.none(), requestOptions)
    }
}
