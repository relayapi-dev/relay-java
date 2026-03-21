// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.inbox.reviews

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
import dev.relayapi.models.inbox.reviews.reply.ReplyCreateParams
import dev.relayapi.models.inbox.reviews.reply.ReplyCreateResponse
import dev.relayapi.models.inbox.reviews.reply.ReplyDeleteParams
import dev.relayapi.models.inbox.reviews.reply.ReplyDeleteResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ReplyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ReplyService {

    private val withRawResponse: ReplyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ReplyService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReplyService =
        ReplyServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ReplyCreateParams,
        requestOptions: RequestOptions,
    ): ReplyCreateResponse =
        // post /v1/inbox/reviews/{review_id}/reply
        withRawResponse().create(params, requestOptions).parse()

    override fun delete(
        params: ReplyDeleteParams,
        requestOptions: RequestOptions,
    ): ReplyDeleteResponse =
        // delete /v1/inbox/reviews/{review_id}/reply
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ReplyService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ReplyService.WithRawResponse =
            ReplyServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ReplyCreateResponse> =
            jsonHandler<ReplyCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ReplyCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReplyCreateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("reviewId", params.reviewId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "inbox", "reviews", params._pathParam(0), "reply")
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

        private val deleteHandler: Handler<ReplyDeleteResponse> =
            jsonHandler<ReplyDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: ReplyDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReplyDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("reviewId", params.reviewId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "inbox", "reviews", params._pathParam(0), "reply")
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
    }
}
