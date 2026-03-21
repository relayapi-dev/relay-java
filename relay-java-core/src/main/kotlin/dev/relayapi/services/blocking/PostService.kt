// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponse
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.posts.PostBulkCreateParams
import dev.relayapi.models.posts.PostBulkCreateResponse
import dev.relayapi.models.posts.PostCreateParams
import dev.relayapi.models.posts.PostCreateResponse
import dev.relayapi.models.posts.PostDeleteParams
import dev.relayapi.models.posts.PostListParams
import dev.relayapi.models.posts.PostListResponse
import dev.relayapi.models.posts.PostRetrieveParams
import dev.relayapi.models.posts.PostRetrieveResponse
import dev.relayapi.models.posts.PostRetryParams
import dev.relayapi.models.posts.PostRetryResponse
import dev.relayapi.models.posts.PostUnpublishParams
import dev.relayapi.models.posts.PostUnpublishResponse
import dev.relayapi.models.posts.PostUpdateParams
import dev.relayapi.models.posts.PostUpdateResponse
import dev.relayapi.services.blocking.posts.LogService
import java.util.function.Consumer

interface PostService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PostService

    fun logs(): LogService

    /**
     * Create a post. Use scheduled_at: "now" to publish immediately, "draft" to save as draft, or
     * an ISO timestamp to schedule.
     */
    fun create(params: PostCreateParams): PostCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PostCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PostCreateResponse

    /** Get a post */
    fun retrieve(id: String): PostRetrieveResponse = retrieve(id, PostRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PostRetrieveParams = PostRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PostRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PostRetrieveParams = PostRetrieveParams.none(),
    ): PostRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PostRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PostRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: PostRetrieveParams): PostRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): PostRetrieveResponse =
        retrieve(id, PostRetrieveParams.none(), requestOptions)

    /** Update a draft or scheduled post. */
    fun update(id: String): PostUpdateResponse = update(id, PostUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: PostUpdateParams = PostUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PostUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(id: String, params: PostUpdateParams = PostUpdateParams.none()): PostUpdateResponse =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PostUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PostUpdateResponse

    /** @see update */
    fun update(params: PostUpdateParams): PostUpdateResponse = update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): PostUpdateResponse =
        update(id, PostUpdateParams.none(), requestOptions)

    /** List posts */
    fun list(): PostListResponse = list(PostListParams.none())

    /** @see list */
    fun list(
        params: PostListParams = PostListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PostListResponse

    /** @see list */
    fun list(params: PostListParams = PostListParams.none()): PostListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): PostListResponse =
        list(PostListParams.none(), requestOptions)

    /** Delete a draft or scheduled post. */
    fun delete(id: String) = delete(id, PostDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: PostDeleteParams = PostDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: PostDeleteParams = PostDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: PostDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: PostDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, PostDeleteParams.none(), requestOptions)

    /**
     * Create multiple posts in a single request. Each item follows the same schema as single post
     * creation.
     */
    fun bulkCreate(params: PostBulkCreateParams): PostBulkCreateResponse =
        bulkCreate(params, RequestOptions.none())

    /** @see bulkCreate */
    fun bulkCreate(
        params: PostBulkCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PostBulkCreateResponse

    /** Retry publishing for failed targets on a post. */
    fun retry(id: String): PostRetryResponse = retry(id, PostRetryParams.none())

    /** @see retry */
    fun retry(
        id: String,
        params: PostRetryParams = PostRetryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PostRetryResponse = retry(params.toBuilder().id(id).build(), requestOptions)

    /** @see retry */
    fun retry(id: String, params: PostRetryParams = PostRetryParams.none()): PostRetryResponse =
        retry(id, params, RequestOptions.none())

    /** @see retry */
    fun retry(
        params: PostRetryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PostRetryResponse

    /** @see retry */
    fun retry(params: PostRetryParams): PostRetryResponse = retry(params, RequestOptions.none())

    /** @see retry */
    fun retry(id: String, requestOptions: RequestOptions): PostRetryResponse =
        retry(id, PostRetryParams.none(), requestOptions)

    /** Attempt to delete the post from each platform and set the post status to cancelled. */
    fun unpublish(id: String): PostUnpublishResponse = unpublish(id, PostUnpublishParams.none())

    /** @see unpublish */
    fun unpublish(
        id: String,
        params: PostUnpublishParams = PostUnpublishParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PostUnpublishResponse = unpublish(params.toBuilder().id(id).build(), requestOptions)

    /** @see unpublish */
    fun unpublish(
        id: String,
        params: PostUnpublishParams = PostUnpublishParams.none(),
    ): PostUnpublishResponse = unpublish(id, params, RequestOptions.none())

    /** @see unpublish */
    fun unpublish(
        params: PostUnpublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PostUnpublishResponse

    /** @see unpublish */
    fun unpublish(params: PostUnpublishParams): PostUnpublishResponse =
        unpublish(params, RequestOptions.none())

    /** @see unpublish */
    fun unpublish(id: String, requestOptions: RequestOptions): PostUnpublishResponse =
        unpublish(id, PostUnpublishParams.none(), requestOptions)

    /** A view of [PostService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PostService.WithRawResponse

        fun logs(): LogService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/posts`, but is otherwise the same as
         * [PostService.create].
         */
        @MustBeClosed
        fun create(params: PostCreateParams): HttpResponseFor<PostCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: PostCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PostCreateResponse>

        /**
         * Returns a raw HTTP response for `get /v1/posts/{id}`, but is otherwise the same as
         * [PostService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<PostRetrieveResponse> =
            retrieve(id, PostRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PostRetrieveParams = PostRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PostRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PostRetrieveParams = PostRetrieveParams.none(),
        ): HttpResponseFor<PostRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PostRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PostRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: PostRetrieveParams): HttpResponseFor<PostRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PostRetrieveResponse> =
            retrieve(id, PostRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/posts/{id}`, but is otherwise the same as
         * [PostService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<PostUpdateResponse> =
            update(id, PostUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: PostUpdateParams = PostUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PostUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: PostUpdateParams = PostUpdateParams.none(),
        ): HttpResponseFor<PostUpdateResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: PostUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PostUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: PostUpdateParams): HttpResponseFor<PostUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PostUpdateResponse> = update(id, PostUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/posts`, but is otherwise the same as
         * [PostService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<PostListResponse> = list(PostListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PostListParams = PostListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PostListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: PostListParams = PostListParams.none()
        ): HttpResponseFor<PostListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PostListResponse> =
            list(PostListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/posts/{id}`, but is otherwise the same as
         * [PostService.delete].
         */
        @MustBeClosed fun delete(id: String): HttpResponse = delete(id, PostDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: PostDeleteParams = PostDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: PostDeleteParams = PostDeleteParams.none()): HttpResponse =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: PostDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: PostDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, PostDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/posts/bulk`, but is otherwise the same as
         * [PostService.bulkCreate].
         */
        @MustBeClosed
        fun bulkCreate(params: PostBulkCreateParams): HttpResponseFor<PostBulkCreateResponse> =
            bulkCreate(params, RequestOptions.none())

        /** @see bulkCreate */
        @MustBeClosed
        fun bulkCreate(
            params: PostBulkCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PostBulkCreateResponse>

        /**
         * Returns a raw HTTP response for `post /v1/posts/{id}/retry`, but is otherwise the same as
         * [PostService.retry].
         */
        @MustBeClosed
        fun retry(id: String): HttpResponseFor<PostRetryResponse> =
            retry(id, PostRetryParams.none())

        /** @see retry */
        @MustBeClosed
        fun retry(
            id: String,
            params: PostRetryParams = PostRetryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PostRetryResponse> =
            retry(params.toBuilder().id(id).build(), requestOptions)

        /** @see retry */
        @MustBeClosed
        fun retry(
            id: String,
            params: PostRetryParams = PostRetryParams.none(),
        ): HttpResponseFor<PostRetryResponse> = retry(id, params, RequestOptions.none())

        /** @see retry */
        @MustBeClosed
        fun retry(
            params: PostRetryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PostRetryResponse>

        /** @see retry */
        @MustBeClosed
        fun retry(params: PostRetryParams): HttpResponseFor<PostRetryResponse> =
            retry(params, RequestOptions.none())

        /** @see retry */
        @MustBeClosed
        fun retry(id: String, requestOptions: RequestOptions): HttpResponseFor<PostRetryResponse> =
            retry(id, PostRetryParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/posts/{id}/unpublish`, but is otherwise the
         * same as [PostService.unpublish].
         */
        @MustBeClosed
        fun unpublish(id: String): HttpResponseFor<PostUnpublishResponse> =
            unpublish(id, PostUnpublishParams.none())

        /** @see unpublish */
        @MustBeClosed
        fun unpublish(
            id: String,
            params: PostUnpublishParams = PostUnpublishParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PostUnpublishResponse> =
            unpublish(params.toBuilder().id(id).build(), requestOptions)

        /** @see unpublish */
        @MustBeClosed
        fun unpublish(
            id: String,
            params: PostUnpublishParams = PostUnpublishParams.none(),
        ): HttpResponseFor<PostUnpublishResponse> = unpublish(id, params, RequestOptions.none())

        /** @see unpublish */
        @MustBeClosed
        fun unpublish(
            params: PostUnpublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PostUnpublishResponse>

        /** @see unpublish */
        @MustBeClosed
        fun unpublish(params: PostUnpublishParams): HttpResponseFor<PostUnpublishResponse> =
            unpublish(params, RequestOptions.none())

        /** @see unpublish */
        @MustBeClosed
        fun unpublish(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PostUnpublishResponse> =
            unpublish(id, PostUnpublishParams.none(), requestOptions)
    }
}
