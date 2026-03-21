// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.inbox

import com.google.errorprone.annotations.MustBeClosed
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
import dev.relayapi.services.blocking.inbox.comments.HideService
import dev.relayapi.services.blocking.inbox.comments.LikeService
import java.util.function.Consumer

interface CommentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommentService

    fun hide(): HideService

    fun like(): LikeService

    /** Get comments for a specific post */
    fun retrieve(postId: String): CommentRetrieveResponse =
        retrieve(postId, CommentRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        postId: String,
        params: CommentRetrieveParams = CommentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommentRetrieveResponse = retrieve(params.toBuilder().postId(postId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        postId: String,
        params: CommentRetrieveParams = CommentRetrieveParams.none(),
    ): CommentRetrieveResponse = retrieve(postId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CommentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommentRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: CommentRetrieveParams): CommentRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(postId: String, requestOptions: RequestOptions): CommentRetrieveResponse =
        retrieve(postId, CommentRetrieveParams.none(), requestOptions)

    /** List comments across platforms */
    fun list(): CommentListResponse = list(CommentListParams.none())

    /** @see list */
    fun list(
        params: CommentListParams = CommentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommentListResponse

    /** @see list */
    fun list(params: CommentListParams = CommentListParams.none()): CommentListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CommentListResponse =
        list(CommentListParams.none(), requestOptions)

    /** Delete a comment */
    fun delete(commentId: String): CommentDeleteResponse =
        delete(commentId, CommentDeleteParams.none())

    /** @see delete */
    fun delete(
        commentId: String,
        params: CommentDeleteParams = CommentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommentDeleteResponse =
        delete(params.toBuilder().commentId(commentId).build(), requestOptions)

    /** @see delete */
    fun delete(
        commentId: String,
        params: CommentDeleteParams = CommentDeleteParams.none(),
    ): CommentDeleteResponse = delete(commentId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CommentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommentDeleteResponse

    /** @see delete */
    fun delete(params: CommentDeleteParams): CommentDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(commentId: String, requestOptions: RequestOptions): CommentDeleteResponse =
        delete(commentId, CommentDeleteParams.none(), requestOptions)

    /** Send a private reply to a commenter */
    fun privateReply(
        commentId: String,
        params: CommentPrivateReplyParams,
    ): CommentPrivateReplyResponse = privateReply(commentId, params, RequestOptions.none())

    /** @see privateReply */
    fun privateReply(
        commentId: String,
        params: CommentPrivateReplyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommentPrivateReplyResponse =
        privateReply(params.toBuilder().commentId(commentId).build(), requestOptions)

    /** @see privateReply */
    fun privateReply(params: CommentPrivateReplyParams): CommentPrivateReplyResponse =
        privateReply(params, RequestOptions.none())

    /** @see privateReply */
    fun privateReply(
        params: CommentPrivateReplyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommentPrivateReplyResponse

    /** Reply to a comment */
    fun reply(postId: String, params: CommentReplyParams): CommentReplyResponse =
        reply(postId, params, RequestOptions.none())

    /** @see reply */
    fun reply(
        postId: String,
        params: CommentReplyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommentReplyResponse = reply(params.toBuilder().postId(postId).build(), requestOptions)

    /** @see reply */
    fun reply(params: CommentReplyParams): CommentReplyResponse =
        reply(params, RequestOptions.none())

    /** @see reply */
    fun reply(
        params: CommentReplyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommentReplyResponse

    /** A view of [CommentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommentService.WithRawResponse

        fun hide(): HideService.WithRawResponse

        fun like(): LikeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/inbox/comments/{post_id}`, but is otherwise the
         * same as [CommentService.retrieve].
         */
        @MustBeClosed
        fun retrieve(postId: String): HttpResponseFor<CommentRetrieveResponse> =
            retrieve(postId, CommentRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            postId: String,
            params: CommentRetrieveParams = CommentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommentRetrieveResponse> =
            retrieve(params.toBuilder().postId(postId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            postId: String,
            params: CommentRetrieveParams = CommentRetrieveParams.none(),
        ): HttpResponseFor<CommentRetrieveResponse> =
            retrieve(postId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CommentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommentRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: CommentRetrieveParams): HttpResponseFor<CommentRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            postId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CommentRetrieveResponse> =
            retrieve(postId, CommentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/inbox/comments`, but is otherwise the same as
         * [CommentService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CommentListResponse> = list(CommentListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CommentListParams = CommentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommentListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CommentListParams = CommentListParams.none()
        ): HttpResponseFor<CommentListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CommentListResponse> =
            list(CommentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/inbox/comments/{comment_id}`, but is
         * otherwise the same as [CommentService.delete].
         */
        @MustBeClosed
        fun delete(commentId: String): HttpResponseFor<CommentDeleteResponse> =
            delete(commentId, CommentDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            commentId: String,
            params: CommentDeleteParams = CommentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommentDeleteResponse> =
            delete(params.toBuilder().commentId(commentId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            commentId: String,
            params: CommentDeleteParams = CommentDeleteParams.none(),
        ): HttpResponseFor<CommentDeleteResponse> = delete(commentId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CommentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommentDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: CommentDeleteParams): HttpResponseFor<CommentDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            commentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CommentDeleteResponse> =
            delete(commentId, CommentDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/inbox/comments/{comment_id}/private-reply`, but
         * is otherwise the same as [CommentService.privateReply].
         */
        @MustBeClosed
        fun privateReply(
            commentId: String,
            params: CommentPrivateReplyParams,
        ): HttpResponseFor<CommentPrivateReplyResponse> =
            privateReply(commentId, params, RequestOptions.none())

        /** @see privateReply */
        @MustBeClosed
        fun privateReply(
            commentId: String,
            params: CommentPrivateReplyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommentPrivateReplyResponse> =
            privateReply(params.toBuilder().commentId(commentId).build(), requestOptions)

        /** @see privateReply */
        @MustBeClosed
        fun privateReply(
            params: CommentPrivateReplyParams
        ): HttpResponseFor<CommentPrivateReplyResponse> =
            privateReply(params, RequestOptions.none())

        /** @see privateReply */
        @MustBeClosed
        fun privateReply(
            params: CommentPrivateReplyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommentPrivateReplyResponse>

        /**
         * Returns a raw HTTP response for `post /v1/inbox/comments/{post_id}/reply`, but is
         * otherwise the same as [CommentService.reply].
         */
        @MustBeClosed
        fun reply(
            postId: String,
            params: CommentReplyParams,
        ): HttpResponseFor<CommentReplyResponse> = reply(postId, params, RequestOptions.none())

        /** @see reply */
        @MustBeClosed
        fun reply(
            postId: String,
            params: CommentReplyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommentReplyResponse> =
            reply(params.toBuilder().postId(postId).build(), requestOptions)

        /** @see reply */
        @MustBeClosed
        fun reply(params: CommentReplyParams): HttpResponseFor<CommentReplyResponse> =
            reply(params, RequestOptions.none())

        /** @see reply */
        @MustBeClosed
        fun reply(
            params: CommentReplyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommentReplyResponse>
    }
}
