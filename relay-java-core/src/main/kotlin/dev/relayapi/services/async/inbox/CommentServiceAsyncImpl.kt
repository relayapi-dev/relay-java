// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.inbox

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.checkRequired
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
import dev.relayapi.services.async.inbox.comments.HideServiceAsyncImpl
import dev.relayapi.services.async.inbox.comments.LikeServiceAsync
import dev.relayapi.services.async.inbox.comments.LikeServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CommentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CommentServiceAsync {

    private val withRawResponse: CommentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val hide: HideServiceAsync by lazy { HideServiceAsyncImpl(clientOptions) }

    private val like: LikeServiceAsync by lazy { LikeServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): CommentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommentServiceAsync =
        CommentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun hide(): HideServiceAsync = hide

    override fun like(): LikeServiceAsync = like

    override fun retrieve(
        params: CommentRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CommentRetrieveResponse> =
        // get /v1/inbox/comments/{post_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: CommentListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CommentListResponse> =
        // get /v1/inbox/comments
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: CommentDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CommentDeleteResponse> =
        // delete /v1/inbox/comments/{comment_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun privateReply(
        params: CommentPrivateReplyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CommentPrivateReplyResponse> =
        // post /v1/inbox/comments/{comment_id}/private-reply
        withRawResponse().privateReply(params, requestOptions).thenApply { it.parse() }

    override fun reply(
        params: CommentReplyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CommentReplyResponse> =
        // post /v1/inbox/comments/{post_id}/reply
        withRawResponse().reply(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CommentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val hide: HideServiceAsync.WithRawResponse by lazy {
            HideServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val like: LikeServiceAsync.WithRawResponse by lazy {
            LikeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CommentServiceAsync.WithRawResponse =
            CommentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun hide(): HideServiceAsync.WithRawResponse = hide

        override fun like(): LikeServiceAsync.WithRawResponse = like

        private val retrieveHandler: Handler<CommentRetrieveResponse> =
            jsonHandler<CommentRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CommentRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CommentRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("postId", params.postId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "inbox", "comments", params._pathParam(0))
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

        private val listHandler: Handler<CommentListResponse> =
            jsonHandler<CommentListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CommentListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CommentListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "inbox", "comments")
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

        private val deleteHandler: Handler<CommentDeleteResponse> =
            jsonHandler<CommentDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: CommentDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CommentDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("commentId", params.commentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "inbox", "comments", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val privateReplyHandler: Handler<CommentPrivateReplyResponse> =
            jsonHandler<CommentPrivateReplyResponse>(clientOptions.jsonMapper)

        override fun privateReply(
            params: CommentPrivateReplyParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CommentPrivateReplyResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("commentId", params.commentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "inbox",
                        "comments",
                        params._pathParam(0),
                        "private-reply",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { privateReplyHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val replyHandler: Handler<CommentReplyResponse> =
            jsonHandler<CommentReplyResponse>(clientOptions.jsonMapper)

        override fun reply(
            params: CommentReplyParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CommentReplyResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("postId", params.postId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "inbox", "comments", params._pathParam(0), "reply")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { replyHandler.handle(it) }
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
