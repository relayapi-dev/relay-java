// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.inbox.comments

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.inbox.comments.hide.HideCreateParams
import dev.relayapi.models.inbox.comments.hide.HideCreateResponse
import dev.relayapi.models.inbox.comments.hide.HideDeleteParams
import dev.relayapi.models.inbox.comments.hide.HideDeleteResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface HideServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): HideServiceAsync

    /** Hide a comment */
    fun create(commentId: String): CompletableFuture<HideCreateResponse> =
        create(commentId, HideCreateParams.none())

    /** @see create */
    fun create(
        commentId: String,
        params: HideCreateParams = HideCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HideCreateResponse> =
        create(params.toBuilder().commentId(commentId).build(), requestOptions)

    /** @see create */
    fun create(
        commentId: String,
        params: HideCreateParams = HideCreateParams.none(),
    ): CompletableFuture<HideCreateResponse> = create(commentId, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: HideCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HideCreateResponse>

    /** @see create */
    fun create(params: HideCreateParams): CompletableFuture<HideCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        commentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<HideCreateResponse> =
        create(commentId, HideCreateParams.none(), requestOptions)

    /** Unhide a comment */
    fun delete(commentId: String): CompletableFuture<HideDeleteResponse> =
        delete(commentId, HideDeleteParams.none())

    /** @see delete */
    fun delete(
        commentId: String,
        params: HideDeleteParams = HideDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HideDeleteResponse> =
        delete(params.toBuilder().commentId(commentId).build(), requestOptions)

    /** @see delete */
    fun delete(
        commentId: String,
        params: HideDeleteParams = HideDeleteParams.none(),
    ): CompletableFuture<HideDeleteResponse> = delete(commentId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: HideDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HideDeleteResponse>

    /** @see delete */
    fun delete(params: HideDeleteParams): CompletableFuture<HideDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        commentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<HideDeleteResponse> =
        delete(commentId, HideDeleteParams.none(), requestOptions)

    /** A view of [HideServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): HideServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/inbox/comments/{comment_id}/hide`, but is
         * otherwise the same as [HideServiceAsync.create].
         */
        fun create(commentId: String): CompletableFuture<HttpResponseFor<HideCreateResponse>> =
            create(commentId, HideCreateParams.none())

        /** @see create */
        fun create(
            commentId: String,
            params: HideCreateParams = HideCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HideCreateResponse>> =
            create(params.toBuilder().commentId(commentId).build(), requestOptions)

        /** @see create */
        fun create(
            commentId: String,
            params: HideCreateParams = HideCreateParams.none(),
        ): CompletableFuture<HttpResponseFor<HideCreateResponse>> =
            create(commentId, params, RequestOptions.none())

        /** @see create */
        fun create(
            params: HideCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HideCreateResponse>>

        /** @see create */
        fun create(
            params: HideCreateParams
        ): CompletableFuture<HttpResponseFor<HideCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            commentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<HideCreateResponse>> =
            create(commentId, HideCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/inbox/comments/{comment_id}/hide`, but is
         * otherwise the same as [HideServiceAsync.delete].
         */
        fun delete(commentId: String): CompletableFuture<HttpResponseFor<HideDeleteResponse>> =
            delete(commentId, HideDeleteParams.none())

        /** @see delete */
        fun delete(
            commentId: String,
            params: HideDeleteParams = HideDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HideDeleteResponse>> =
            delete(params.toBuilder().commentId(commentId).build(), requestOptions)

        /** @see delete */
        fun delete(
            commentId: String,
            params: HideDeleteParams = HideDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<HideDeleteResponse>> =
            delete(commentId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: HideDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HideDeleteResponse>>

        /** @see delete */
        fun delete(
            params: HideDeleteParams
        ): CompletableFuture<HttpResponseFor<HideDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            commentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<HideDeleteResponse>> =
            delete(commentId, HideDeleteParams.none(), requestOptions)
    }
}
