// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.inbox.comments

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
import dev.relayapi.models.inbox.comments.hide.HideCreateParams
import dev.relayapi.models.inbox.comments.hide.HideCreateResponse
import dev.relayapi.models.inbox.comments.hide.HideDeleteParams
import dev.relayapi.models.inbox.comments.hide.HideDeleteResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class HideServiceImpl internal constructor(private val clientOptions: ClientOptions) : HideService {

    private val withRawResponse: HideService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): HideService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HideService =
        HideServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: HideCreateParams,
        requestOptions: RequestOptions,
    ): HideCreateResponse =
        // post /v1/inbox/comments/{comment_id}/hide
        withRawResponse().create(params, requestOptions).parse()

    override fun delete(
        params: HideDeleteParams,
        requestOptions: RequestOptions,
    ): HideDeleteResponse =
        // delete /v1/inbox/comments/{comment_id}/hide
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        HideService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): HideService.WithRawResponse =
            HideServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<HideCreateResponse> =
            jsonHandler<HideCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: HideCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HideCreateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("commentId", params.commentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "inbox", "comments", params._pathParam(0), "hide")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
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

        private val deleteHandler: Handler<HideDeleteResponse> =
            jsonHandler<HideDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: HideDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HideDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("commentId", params.commentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "inbox", "comments", params._pathParam(0), "hide")
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
