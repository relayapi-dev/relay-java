// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking

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
import dev.relayapi.core.prepare
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
import dev.relayapi.services.blocking.posts.LogServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PostServiceImpl internal constructor(private val clientOptions: ClientOptions) : PostService {

    private val withRawResponse: PostService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val logs: LogService by lazy { LogServiceImpl(clientOptions) }

    override fun withRawResponse(): PostService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PostService =
        PostServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun logs(): LogService = logs

    override fun create(
        params: PostCreateParams,
        requestOptions: RequestOptions,
    ): PostCreateResponse =
        // post /v1/posts
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: PostRetrieveParams,
        requestOptions: RequestOptions,
    ): PostRetrieveResponse =
        // get /v1/posts/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: PostUpdateParams,
        requestOptions: RequestOptions,
    ): PostUpdateResponse =
        // patch /v1/posts/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: PostListParams, requestOptions: RequestOptions): PostListResponse =
        // get /v1/posts
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: PostDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/posts/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun bulkCreate(
        params: PostBulkCreateParams,
        requestOptions: RequestOptions,
    ): PostBulkCreateResponse =
        // post /v1/posts/bulk
        withRawResponse().bulkCreate(params, requestOptions).parse()

    override fun retry(params: PostRetryParams, requestOptions: RequestOptions): PostRetryResponse =
        // post /v1/posts/{id}/retry
        withRawResponse().retry(params, requestOptions).parse()

    override fun unpublish(
        params: PostUnpublishParams,
        requestOptions: RequestOptions,
    ): PostUnpublishResponse =
        // post /v1/posts/{id}/unpublish
        withRawResponse().unpublish(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PostService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val logs: LogService.WithRawResponse by lazy {
            LogServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PostService.WithRawResponse =
            PostServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun logs(): LogService.WithRawResponse = logs

        private val createHandler: Handler<PostCreateResponse> =
            jsonHandler<PostCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: PostCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PostCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "posts")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<PostRetrieveResponse> =
            jsonHandler<PostRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: PostRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PostRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "posts", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<PostUpdateResponse> =
            jsonHandler<PostUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: PostUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PostUpdateResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<PostListResponse> =
            jsonHandler<PostListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PostListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PostListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "posts")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: PostDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val bulkCreateHandler: Handler<PostBulkCreateResponse> =
            jsonHandler<PostBulkCreateResponse>(clientOptions.jsonMapper)

        override fun bulkCreate(
            params: PostBulkCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PostBulkCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "posts", "bulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { bulkCreateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retryHandler: Handler<PostRetryResponse> =
            jsonHandler<PostRetryResponse>(clientOptions.jsonMapper)

        override fun retry(
            params: PostRetryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PostRetryResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val unpublishHandler: Handler<PostUnpublishResponse> =
            jsonHandler<PostUnpublishResponse>(clientOptions.jsonMapper)

        override fun unpublish(
            params: PostUnpublishParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PostUnpublishResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
