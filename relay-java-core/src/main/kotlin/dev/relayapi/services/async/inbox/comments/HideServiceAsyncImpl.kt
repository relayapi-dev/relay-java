// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.inbox.comments

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
import dev.relayapi.models.inbox.comments.hide.HideCreateParams
import dev.relayapi.models.inbox.comments.hide.HideCreateResponse
import dev.relayapi.models.inbox.comments.hide.HideDeleteParams
import dev.relayapi.models.inbox.comments.hide.HideDeleteResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class HideServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    HideServiceAsync {

    private val withRawResponse: HideServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): HideServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HideServiceAsync =
        HideServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: HideCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HideCreateResponse> =
        // post /v1/inbox/comments/{comment_id}/hide
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: HideDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HideDeleteResponse> =
        // delete /v1/inbox/comments/{comment_id}/hide
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        HideServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): HideServiceAsync.WithRawResponse =
            HideServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<HideCreateResponse> =
            jsonHandler<HideCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: HideCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<HideCreateResponse>> {
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

        private val deleteHandler: Handler<HideDeleteResponse> =
            jsonHandler<HideDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: HideDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<HideDeleteResponse>> {
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
    }
}
