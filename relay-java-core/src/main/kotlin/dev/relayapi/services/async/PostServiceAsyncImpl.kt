// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.checkRequired
import dev.relayapi.core.handlers.emptyHandler
import dev.relayapi.core.handlers.errorBodyHandler
import dev.relayapi.core.handlers.errorHandler
import dev.relayapi.core.handlers.jsonHandler
import dev.relayapi.core.http.HttpMethod
import dev.relayapi.core.http.HttpRequest
import dev.relayapi.core.http.HttpResponse
import dev.relayapi.core.http.HttpResponse.Handler
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.core.http.json
import dev.relayapi.core.http.parseable
import dev.relayapi.core.prepareAsync
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
import dev.relayapi.services.async.posts.LogServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PostServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PostServiceAsync {

    private val withRawResponse: PostServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val logs: LogServiceAsync by lazy { LogServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): PostServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PostServiceAsync =
        PostServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun logs(): LogServiceAsync = logs

    override fun create(
        params: PostCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PostCreateResponse> =
        // post /v1/posts
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: PostRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PostRetrieveResponse> =
        // get /v1/posts/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: PostUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PostUpdateResponse> =
        // patch /v1/posts/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: PostListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PostListResponse> =
        // get /v1/posts
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: PostDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /v1/posts/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun bulkCreate(
        params: PostBulkCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PostBulkCreateResponse> =
        // post /v1/posts/bulk
        withRawResponse().bulkCreate(params, requestOptions).thenApply { it.parse() }

    override fun retry(
        params: PostRetryParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PostRetryResponse> =
        // post /v1/posts/{id}/retry
        withRawResponse().retry(params, requestOptions).thenApply { it.parse() }

    override fun unpublish(
        params: PostUnpublishParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PostUnpublishResponse> =
        // post /v1/posts/{id}/unpublish
        withRawResponse().unpublish(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PostServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val logs: LogServiceAsync.WithRawResponse by lazy {
            LogServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PostServiceAsync.WithRawResponse =
            PostServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun logs(): LogServiceAsync.WithRawResponse = logs

        private val createHandler: Handler<PostCreateResponse> =
            jsonHandler<PostCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: PostCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PostCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "posts")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<PostRetrieveResponse> =
            jsonHandler<PostRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: PostRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PostRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "posts", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<PostUpdateResponse> =
            jsonHandler<PostUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: PostUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PostUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "posts", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<PostListResponse> =
            jsonHandler<PostListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PostListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PostListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "posts")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: PostDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "posts", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        private val bulkCreateHandler: Handler<PostBulkCreateResponse> =
            jsonHandler<PostBulkCreateResponse>(clientOptions.jsonMapper)

        override fun bulkCreate(
            params: PostBulkCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PostBulkCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "posts", "bulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { bulkCreateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retryHandler: Handler<PostRetryResponse> =
            jsonHandler<PostRetryResponse>(clientOptions.jsonMapper)

        override fun retry(
            params: PostRetryParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PostRetryResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "posts", params._pathParam(0), "retry")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retryHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val unpublishHandler: Handler<PostUnpublishResponse> =
            jsonHandler<PostUnpublishResponse>(clientOptions.jsonMapper)

        override fun unpublish(
            params: PostUnpublishParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PostUnpublishResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "posts", params._pathParam(0), "unpublish")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { unpublishHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
