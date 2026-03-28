// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async

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
import dev.relayapi.services.async.posts.LogServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PostServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PostServiceAsync

    fun logs(): LogServiceAsync

    /**
     * Create a post. Use scheduled_at: "now" to publish immediately, "draft" to save as draft, or
     * an ISO timestamp to schedule.
     */
    fun create(params: PostCreateParams): CompletableFuture<PostCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PostCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PostCreateResponse>

    /** Get a post */
    fun retrieve(id: String): CompletableFuture<PostRetrieveResponse> =
        retrieve(id, PostRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PostRetrieveParams = PostRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PostRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PostRetrieveParams = PostRetrieveParams.none(),
    ): CompletableFuture<PostRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PostRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PostRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: PostRetrieveParams): CompletableFuture<PostRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PostRetrieveResponse> =
        retrieve(id, PostRetrieveParams.none(), requestOptions)

    /** Update a draft or scheduled post. */
    fun update(id: String): CompletableFuture<PostUpdateResponse> =
        update(id, PostUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: PostUpdateParams = PostUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PostUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: PostUpdateParams = PostUpdateParams.none(),
    ): CompletableFuture<PostUpdateResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PostUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PostUpdateResponse>

    /** @see update */
    fun update(params: PostUpdateParams): CompletableFuture<PostUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<PostUpdateResponse> =
        update(id, PostUpdateParams.none(), requestOptions)

    /** List posts */
    fun list(): CompletableFuture<PostListResponse> = list(PostListParams.none())

    /** @see list */
    fun list(
        params: PostListParams = PostListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PostListResponse>

    /** @see list */
    fun list(params: PostListParams = PostListParams.none()): CompletableFuture<PostListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<PostListResponse> =
        list(PostListParams.none(), requestOptions)

    /** Delete a post. */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, PostDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: PostDeleteParams = PostDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: PostDeleteParams = PostDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PostDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: PostDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, PostDeleteParams.none(), requestOptions)

    /**
     * Create multiple posts in a single request. Each item follows the same schema as single post
     * creation.
     */
    fun bulkCreate(params: PostBulkCreateParams): CompletableFuture<PostBulkCreateResponse> =
        bulkCreate(params, RequestOptions.none())

    /** @see bulkCreate */
    fun bulkCreate(
        params: PostBulkCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PostBulkCreateResponse>

    /** Retry publishing for failed targets on a post. */
    fun retry(id: String): CompletableFuture<PostRetryResponse> = retry(id, PostRetryParams.none())

    /** @see retry */
    fun retry(
        id: String,
        params: PostRetryParams = PostRetryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PostRetryResponse> =
        retry(params.toBuilder().id(id).build(), requestOptions)

    /** @see retry */
    fun retry(
        id: String,
        params: PostRetryParams = PostRetryParams.none(),
    ): CompletableFuture<PostRetryResponse> = retry(id, params, RequestOptions.none())

    /** @see retry */
    fun retry(
        params: PostRetryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PostRetryResponse>

    /** @see retry */
    fun retry(params: PostRetryParams): CompletableFuture<PostRetryResponse> =
        retry(params, RequestOptions.none())

    /** @see retry */
    fun retry(id: String, requestOptions: RequestOptions): CompletableFuture<PostRetryResponse> =
        retry(id, PostRetryParams.none(), requestOptions)

    /** Attempt to delete the post from each platform and set the post status to cancelled. */
    fun unpublish(id: String): CompletableFuture<PostUnpublishResponse> =
        unpublish(id, PostUnpublishParams.none())

    /** @see unpublish */
    fun unpublish(
        id: String,
        params: PostUnpublishParams = PostUnpublishParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PostUnpublishResponse> =
        unpublish(params.toBuilder().id(id).build(), requestOptions)

    /** @see unpublish */
    fun unpublish(
        id: String,
        params: PostUnpublishParams = PostUnpublishParams.none(),
    ): CompletableFuture<PostUnpublishResponse> = unpublish(id, params, RequestOptions.none())

    /** @see unpublish */
    fun unpublish(
        params: PostUnpublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PostUnpublishResponse>

    /** @see unpublish */
    fun unpublish(params: PostUnpublishParams): CompletableFuture<PostUnpublishResponse> =
        unpublish(params, RequestOptions.none())

    /** @see unpublish */
    fun unpublish(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PostUnpublishResponse> =
        unpublish(id, PostUnpublishParams.none(), requestOptions)

    /** A view of [PostServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PostServiceAsync.WithRawResponse

        fun logs(): LogServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/posts`, but is otherwise the same as
         * [PostServiceAsync.create].
         */
        fun create(
            params: PostCreateParams
        ): CompletableFuture<HttpResponseFor<PostCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PostCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PostCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/posts/{id}`, but is otherwise the same as
         * [PostServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<PostRetrieveResponse>> =
            retrieve(id, PostRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: PostRetrieveParams = PostRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PostRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: PostRetrieveParams = PostRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<PostRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: PostRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PostRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: PostRetrieveParams
        ): CompletableFuture<HttpResponseFor<PostRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PostRetrieveResponse>> =
            retrieve(id, PostRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/posts/{id}`, but is otherwise the same as
         * [PostServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<PostUpdateResponse>> =
            update(id, PostUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: PostUpdateParams = PostUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PostUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: PostUpdateParams = PostUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<PostUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: PostUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PostUpdateResponse>>

        /** @see update */
        fun update(
            params: PostUpdateParams
        ): CompletableFuture<HttpResponseFor<PostUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PostUpdateResponse>> =
            update(id, PostUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/posts`, but is otherwise the same as
         * [PostServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PostListResponse>> =
            list(PostListParams.none())

        /** @see list */
        fun list(
            params: PostListParams = PostListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PostListResponse>>

        /** @see list */
        fun list(
            params: PostListParams = PostListParams.none()
        ): CompletableFuture<HttpResponseFor<PostListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PostListResponse>> =
            list(PostListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/posts/{id}`, but is otherwise the same as
         * [PostServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, PostDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: PostDeleteParams = PostDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: PostDeleteParams = PostDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: PostDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: PostDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, PostDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/posts/bulk`, but is otherwise the same as
         * [PostServiceAsync.bulkCreate].
         */
        fun bulkCreate(
            params: PostBulkCreateParams
        ): CompletableFuture<HttpResponseFor<PostBulkCreateResponse>> =
            bulkCreate(params, RequestOptions.none())

        /** @see bulkCreate */
        fun bulkCreate(
            params: PostBulkCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PostBulkCreateResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/posts/{id}/retry`, but is otherwise the same as
         * [PostServiceAsync.retry].
         */
        fun retry(id: String): CompletableFuture<HttpResponseFor<PostRetryResponse>> =
            retry(id, PostRetryParams.none())

        /** @see retry */
        fun retry(
            id: String,
            params: PostRetryParams = PostRetryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PostRetryResponse>> =
            retry(params.toBuilder().id(id).build(), requestOptions)

        /** @see retry */
        fun retry(
            id: String,
            params: PostRetryParams = PostRetryParams.none(),
        ): CompletableFuture<HttpResponseFor<PostRetryResponse>> =
            retry(id, params, RequestOptions.none())

        /** @see retry */
        fun retry(
            params: PostRetryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PostRetryResponse>>

        /** @see retry */
        fun retry(params: PostRetryParams): CompletableFuture<HttpResponseFor<PostRetryResponse>> =
            retry(params, RequestOptions.none())

        /** @see retry */
        fun retry(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PostRetryResponse>> =
            retry(id, PostRetryParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/posts/{id}/unpublish`, but is otherwise the
         * same as [PostServiceAsync.unpublish].
         */
        fun unpublish(id: String): CompletableFuture<HttpResponseFor<PostUnpublishResponse>> =
            unpublish(id, PostUnpublishParams.none())

        /** @see unpublish */
        fun unpublish(
            id: String,
            params: PostUnpublishParams = PostUnpublishParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PostUnpublishResponse>> =
            unpublish(params.toBuilder().id(id).build(), requestOptions)

        /** @see unpublish */
        fun unpublish(
            id: String,
            params: PostUnpublishParams = PostUnpublishParams.none(),
        ): CompletableFuture<HttpResponseFor<PostUnpublishResponse>> =
            unpublish(id, params, RequestOptions.none())

        /** @see unpublish */
        fun unpublish(
            params: PostUnpublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PostUnpublishResponse>>

        /** @see unpublish */
        fun unpublish(
            params: PostUnpublishParams
        ): CompletableFuture<HttpResponseFor<PostUnpublishResponse>> =
            unpublish(params, RequestOptions.none())

        /** @see unpublish */
        fun unpublish(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PostUnpublishResponse>> =
            unpublish(id, PostUnpublishParams.none(), requestOptions)
    }
}
