// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.inbox

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
import dev.relayapi.core.prepare
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
import dev.relayapi.services.blocking.inbox.comments.HideServiceImpl
import dev.relayapi.services.blocking.inbox.comments.LikeService
import dev.relayapi.services.blocking.inbox.comments.LikeServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CommentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CommentService {

    private val withRawResponse: CommentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val hide: HideService by lazy { HideServiceImpl(clientOptions) }

    private val like: LikeService by lazy { LikeServiceImpl(clientOptions) }

    override fun withRawResponse(): CommentService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommentService =
        CommentServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun hide(): HideService = hide

    override fun like(): LikeService = like

    override fun retrieve(
        params: CommentRetrieveParams,
        requestOptions: RequestOptions,
    ): CommentRetrieveResponse =
        // get /v1/inbox/comments/{post_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: CommentListParams,
        requestOptions: RequestOptions,
    ): CommentListResponse =
        // get /v1/inbox/comments
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: CommentDeleteParams,
        requestOptions: RequestOptions,
    ): CommentDeleteResponse =
        // delete /v1/inbox/comments/{comment_id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun privateReply(
        params: CommentPrivateReplyParams,
        requestOptions: RequestOptions,
    ): CommentPrivateReplyResponse =
        // post /v1/inbox/comments/{comment_id}/private-reply
        withRawResponse().privateReply(params, requestOptions).parse()

    override fun reply(
        params: CommentReplyParams,
        requestOptions: RequestOptions,
    ): CommentReplyResponse =
        // post /v1/inbox/comments/{post_id}/reply
        withRawResponse().reply(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CommentService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val hide: HideService.WithRawResponse by lazy {
            HideServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val like: LikeService.WithRawResponse by lazy {
            LikeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CommentService.WithRawResponse =
            CommentServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun hide(): HideService.WithRawResponse = hide

        override fun like(): LikeService.WithRawResponse = like

        private val retrieveHandler: Handler<CommentRetrieveResponse> =
            jsonHandler<CommentRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CommentRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CommentRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("postId", params.postId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "inbox", "comments", params._pathParam(0))
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

        private val listHandler: Handler<CommentListResponse> =
            jsonHandler<CommentListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CommentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CommentListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "inbox", "comments")
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

        private val deleteHandler: Handler<CommentDeleteResponse> =
            jsonHandler<CommentDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: CommentDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CommentDeleteResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val privateReplyHandler: Handler<CommentPrivateReplyResponse> =
            jsonHandler<CommentPrivateReplyResponse>(clientOptions.jsonMapper)

        override fun privateReply(
            params: CommentPrivateReplyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CommentPrivateReplyResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { privateReplyHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val replyHandler: Handler<CommentReplyResponse> =
            jsonHandler<CommentReplyResponse>(clientOptions.jsonMapper)

        override fun reply(
            params: CommentReplyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CommentReplyResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
