// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.inbox.comments

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.inbox.comments.like.LikeCreateParams
import dev.relayapi.models.inbox.comments.like.LikeCreateResponse
import dev.relayapi.models.inbox.comments.like.LikeDeleteParams
import dev.relayapi.models.inbox.comments.like.LikeDeleteResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LikeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LikeServiceAsync

    /** Like a comment */
    fun create(commentId: String): CompletableFuture<LikeCreateResponse> =
        create(commentId, LikeCreateParams.none())

    /** @see create */
    fun create(
        commentId: String,
        params: LikeCreateParams = LikeCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LikeCreateResponse> =
        create(params.toBuilder().commentId(commentId).build(), requestOptions)

    /** @see create */
    fun create(
        commentId: String,
        params: LikeCreateParams = LikeCreateParams.none(),
    ): CompletableFuture<LikeCreateResponse> = create(commentId, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LikeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LikeCreateResponse>

    /** @see create */
    fun create(params: LikeCreateParams): CompletableFuture<LikeCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        commentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LikeCreateResponse> =
        create(commentId, LikeCreateParams.none(), requestOptions)

    /** Unlike a comment */
    fun delete(commentId: String): CompletableFuture<LikeDeleteResponse> =
        delete(commentId, LikeDeleteParams.none())

    /** @see delete */
    fun delete(
        commentId: String,
        params: LikeDeleteParams = LikeDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LikeDeleteResponse> =
        delete(params.toBuilder().commentId(commentId).build(), requestOptions)

    /** @see delete */
    fun delete(
        commentId: String,
        params: LikeDeleteParams = LikeDeleteParams.none(),
    ): CompletableFuture<LikeDeleteResponse> = delete(commentId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: LikeDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LikeDeleteResponse>

    /** @see delete */
    fun delete(params: LikeDeleteParams): CompletableFuture<LikeDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        commentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LikeDeleteResponse> =
        delete(commentId, LikeDeleteParams.none(), requestOptions)

    /** A view of [LikeServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LikeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/inbox/comments/{comment_id}/like`, but is
         * otherwise the same as [LikeServiceAsync.create].
         */
        fun create(commentId: String): CompletableFuture<HttpResponseFor<LikeCreateResponse>> =
            create(commentId, LikeCreateParams.none())

        /** @see create */
        fun create(
            commentId: String,
            params: LikeCreateParams = LikeCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LikeCreateResponse>> =
            create(params.toBuilder().commentId(commentId).build(), requestOptions)

        /** @see create */
        fun create(
            commentId: String,
            params: LikeCreateParams = LikeCreateParams.none(),
        ): CompletableFuture<HttpResponseFor<LikeCreateResponse>> =
            create(commentId, params, RequestOptions.none())

        /** @see create */
        fun create(
            params: LikeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LikeCreateResponse>>

        /** @see create */
        fun create(
            params: LikeCreateParams
        ): CompletableFuture<HttpResponseFor<LikeCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            commentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LikeCreateResponse>> =
            create(commentId, LikeCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/inbox/comments/{comment_id}/like`, but is
         * otherwise the same as [LikeServiceAsync.delete].
         */
        fun delete(commentId: String): CompletableFuture<HttpResponseFor<LikeDeleteResponse>> =
            delete(commentId, LikeDeleteParams.none())

        /** @see delete */
        fun delete(
            commentId: String,
            params: LikeDeleteParams = LikeDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LikeDeleteResponse>> =
            delete(params.toBuilder().commentId(commentId).build(), requestOptions)

        /** @see delete */
        fun delete(
            commentId: String,
            params: LikeDeleteParams = LikeDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<LikeDeleteResponse>> =
            delete(commentId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: LikeDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LikeDeleteResponse>>

        /** @see delete */
        fun delete(
            params: LikeDeleteParams
        ): CompletableFuture<HttpResponseFor<LikeDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            commentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LikeDeleteResponse>> =
            delete(commentId, LikeDeleteParams.none(), requestOptions)
    }
}
