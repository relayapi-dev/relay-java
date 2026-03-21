// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.inbox.comments

import com.google.errorprone.annotations.MustBeClosed
import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.inbox.comments.hide.HideCreateParams
import dev.relayapi.models.inbox.comments.hide.HideCreateResponse
import dev.relayapi.models.inbox.comments.hide.HideDeleteParams
import dev.relayapi.models.inbox.comments.hide.HideDeleteResponse
import java.util.function.Consumer

interface HideService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): HideService

    /** Hide a comment */
    fun create(commentId: String): HideCreateResponse = create(commentId, HideCreateParams.none())

    /** @see create */
    fun create(
        commentId: String,
        params: HideCreateParams = HideCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HideCreateResponse = create(params.toBuilder().commentId(commentId).build(), requestOptions)

    /** @see create */
    fun create(
        commentId: String,
        params: HideCreateParams = HideCreateParams.none(),
    ): HideCreateResponse = create(commentId, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: HideCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HideCreateResponse

    /** @see create */
    fun create(params: HideCreateParams): HideCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(commentId: String, requestOptions: RequestOptions): HideCreateResponse =
        create(commentId, HideCreateParams.none(), requestOptions)

    /** Unhide a comment */
    fun delete(commentId: String): HideDeleteResponse = delete(commentId, HideDeleteParams.none())

    /** @see delete */
    fun delete(
        commentId: String,
        params: HideDeleteParams = HideDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HideDeleteResponse = delete(params.toBuilder().commentId(commentId).build(), requestOptions)

    /** @see delete */
    fun delete(
        commentId: String,
        params: HideDeleteParams = HideDeleteParams.none(),
    ): HideDeleteResponse = delete(commentId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: HideDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HideDeleteResponse

    /** @see delete */
    fun delete(params: HideDeleteParams): HideDeleteResponse = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(commentId: String, requestOptions: RequestOptions): HideDeleteResponse =
        delete(commentId, HideDeleteParams.none(), requestOptions)

    /** A view of [HideService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): HideService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/inbox/comments/{comment_id}/hide`, but is
         * otherwise the same as [HideService.create].
         */
        @MustBeClosed
        fun create(commentId: String): HttpResponseFor<HideCreateResponse> =
            create(commentId, HideCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            commentId: String,
            params: HideCreateParams = HideCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HideCreateResponse> =
            create(params.toBuilder().commentId(commentId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            commentId: String,
            params: HideCreateParams = HideCreateParams.none(),
        ): HttpResponseFor<HideCreateResponse> = create(commentId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: HideCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HideCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(params: HideCreateParams): HttpResponseFor<HideCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            commentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HideCreateResponse> =
            create(commentId, HideCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/inbox/comments/{comment_id}/hide`, but is
         * otherwise the same as [HideService.delete].
         */
        @MustBeClosed
        fun delete(commentId: String): HttpResponseFor<HideDeleteResponse> =
            delete(commentId, HideDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            commentId: String,
            params: HideDeleteParams = HideDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HideDeleteResponse> =
            delete(params.toBuilder().commentId(commentId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            commentId: String,
            params: HideDeleteParams = HideDeleteParams.none(),
        ): HttpResponseFor<HideDeleteResponse> = delete(commentId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: HideDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HideDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: HideDeleteParams): HttpResponseFor<HideDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            commentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HideDeleteResponse> =
            delete(commentId, HideDeleteParams.none(), requestOptions)
    }
}
