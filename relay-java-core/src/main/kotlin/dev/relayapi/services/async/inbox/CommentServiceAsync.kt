// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.inbox

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.inbox.comments.CommentDeleteParams
import dev.relayapi.models.inbox.comments.CommentDeleteResponse
import dev.relayapi.models.inbox.comments.CommentListParams
import dev.relayapi.models.inbox.comments.CommentListResponse
import dev.relayapi.models.inbox.comments.CommentPrivateReplyParams
import dev.relayapi.models.inbox.comments.CommentPrivateReplyResponse
import dev.relayapi.models.inbox.comments.CommentReplyParams
import dev.relayapi.models.inbox.comments.CommentReplyResponse
import dev.relayapi.models.inbox.comments.CommentRetrieveParams
import dev.relayapi.models.inbox.comments.CommentRetrieveResponse
import dev.relayapi.services.async.inbox.comments.HideServiceAsync
import dev.relayapi.services.async.inbox.comments.LikeServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CommentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommentServiceAsync

    fun hide(): HideServiceAsync

    fun like(): LikeServiceAsync

    /** Get comments for a specific post */
    fun retrieve(postId: String): CompletableFuture<CommentRetrieveResponse> =
        retrieve(postId, CommentRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        postId: String,
        params: CommentRetrieveParams = CommentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommentRetrieveResponse> =
        retrieve(params.toBuilder().postId(postId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        postId: String,
        params: CommentRetrieveParams = CommentRetrieveParams.none(),
    ): CompletableFuture<CommentRetrieveResponse> = retrieve(postId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CommentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommentRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: CommentRetrieveParams): CompletableFuture<CommentRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        postId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CommentRetrieveResponse> =
        retrieve(postId, CommentRetrieveParams.none(), requestOptions)

    /** List comments across platforms */
    fun list(): CompletableFuture<CommentListResponse> = list(CommentListParams.none())

    /** @see list */
    fun list(
        params: CommentListParams = CommentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommentListResponse>

    /** @see list */
    fun list(
        params: CommentListParams = CommentListParams.none()
    ): CompletableFuture<CommentListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CommentListResponse> =
        list(CommentListParams.none(), requestOptions)

    /** Delete a comment */
    fun delete(commentId: String): CompletableFuture<CommentDeleteResponse> =
        delete(commentId, CommentDeleteParams.none())

    /** @see delete */
    fun delete(
        commentId: String,
        params: CommentDeleteParams = CommentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommentDeleteResponse> =
        delete(params.toBuilder().commentId(commentId).build(), requestOptions)

    /** @see delete */
    fun delete(
        commentId: String,
        params: CommentDeleteParams = CommentDeleteParams.none(),
    ): CompletableFuture<CommentDeleteResponse> = delete(commentId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CommentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommentDeleteResponse>

    /** @see delete */
    fun delete(params: CommentDeleteParams): CompletableFuture<CommentDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        commentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CommentDeleteResponse> =
        delete(commentId, CommentDeleteParams.none(), requestOptions)

    /** Send a private reply to a commenter */
    fun privateReply(
        commentId: String,
        params: CommentPrivateReplyParams,
    ): CompletableFuture<CommentPrivateReplyResponse> =
        privateReply(commentId, params, RequestOptions.none())

    /** @see privateReply */
    fun privateReply(
        commentId: String,
        params: CommentPrivateReplyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommentPrivateReplyResponse> =
        privateReply(params.toBuilder().commentId(commentId).build(), requestOptions)

    /** @see privateReply */
    fun privateReply(
        params: CommentPrivateReplyParams
    ): CompletableFuture<CommentPrivateReplyResponse> = privateReply(params, RequestOptions.none())

    /** @see privateReply */
    fun privateReply(
        params: CommentPrivateReplyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommentPrivateReplyResponse>

    /** Reply to a comment */
    fun reply(postId: String, params: CommentReplyParams): CompletableFuture<CommentReplyResponse> =
        reply(postId, params, RequestOptions.none())

    /** @see reply */
    fun reply(
        postId: String,
        params: CommentReplyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommentReplyResponse> =
        reply(params.toBuilder().postId(postId).build(), requestOptions)

    /** @see reply */
    fun reply(params: CommentReplyParams): CompletableFuture<CommentReplyResponse> =
        reply(params, RequestOptions.none())

    /** @see reply */
    fun reply(
        params: CommentReplyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommentReplyResponse>

    /**
     * A view of [CommentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CommentServiceAsync.WithRawResponse

        fun hide(): HideServiceAsync.WithRawResponse

        fun like(): LikeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/inbox/comments/{post_id}`, but is otherwise the
         * same as [CommentServiceAsync.retrieve].
         */
        fun retrieve(postId: String): CompletableFuture<HttpResponseFor<CommentRetrieveResponse>> =
            retrieve(postId, CommentRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            postId: String,
            params: CommentRetrieveParams = CommentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommentRetrieveResponse>> =
            retrieve(params.toBuilder().postId(postId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            postId: String,
            params: CommentRetrieveParams = CommentRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CommentRetrieveResponse>> =
            retrieve(postId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CommentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommentRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: CommentRetrieveParams
        ): CompletableFuture<HttpResponseFor<CommentRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            postId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CommentRetrieveResponse>> =
            retrieve(postId, CommentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/inbox/comments`, but is otherwise the same as
         * [CommentServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CommentListResponse>> =
            list(CommentListParams.none())

        /** @see list */
        fun list(
            params: CommentListParams = CommentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommentListResponse>>

        /** @see list */
        fun list(
            params: CommentListParams = CommentListParams.none()
        ): CompletableFuture<HttpResponseFor<CommentListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CommentListResponse>> =
            list(CommentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/inbox/comments/{comment_id}`, but is
         * otherwise the same as [CommentServiceAsync.delete].
         */
        fun delete(commentId: String): CompletableFuture<HttpResponseFor<CommentDeleteResponse>> =
            delete(commentId, CommentDeleteParams.none())

        /** @see delete */
        fun delete(
            commentId: String,
            params: CommentDeleteParams = CommentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommentDeleteResponse>> =
            delete(params.toBuilder().commentId(commentId).build(), requestOptions)

        /** @see delete */
        fun delete(
            commentId: String,
            params: CommentDeleteParams = CommentDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<CommentDeleteResponse>> =
            delete(commentId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: CommentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommentDeleteResponse>>

        /** @see delete */
        fun delete(
            params: CommentDeleteParams
        ): CompletableFuture<HttpResponseFor<CommentDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            commentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CommentDeleteResponse>> =
            delete(commentId, CommentDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/inbox/comments/{comment_id}/private-reply`, but
         * is otherwise the same as [CommentServiceAsync.privateReply].
         */
        fun privateReply(
            commentId: String,
            params: CommentPrivateReplyParams,
        ): CompletableFuture<HttpResponseFor<CommentPrivateReplyResponse>> =
            privateReply(commentId, params, RequestOptions.none())

        /** @see privateReply */
        fun privateReply(
            commentId: String,
            params: CommentPrivateReplyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommentPrivateReplyResponse>> =
            privateReply(params.toBuilder().commentId(commentId).build(), requestOptions)

        /** @see privateReply */
        fun privateReply(
            params: CommentPrivateReplyParams
        ): CompletableFuture<HttpResponseFor<CommentPrivateReplyResponse>> =
            privateReply(params, RequestOptions.none())

        /** @see privateReply */
        fun privateReply(
            params: CommentPrivateReplyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommentPrivateReplyResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/inbox/comments/{post_id}/reply`, but is
         * otherwise the same as [CommentServiceAsync.reply].
         */
        fun reply(
            postId: String,
            params: CommentReplyParams,
        ): CompletableFuture<HttpResponseFor<CommentReplyResponse>> =
            reply(postId, params, RequestOptions.none())

        /** @see reply */
        fun reply(
            postId: String,
            params: CommentReplyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommentReplyResponse>> =
            reply(params.toBuilder().postId(postId).build(), requestOptions)

        /** @see reply */
        fun reply(
            params: CommentReplyParams
        ): CompletableFuture<HttpResponseFor<CommentReplyResponse>> =
            reply(params, RequestOptions.none())

        /** @see reply */
        fun reply(
            params: CommentReplyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommentReplyResponse>>
    }
}
