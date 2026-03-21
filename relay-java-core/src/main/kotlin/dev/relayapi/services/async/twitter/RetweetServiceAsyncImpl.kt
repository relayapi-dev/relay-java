// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.twitter

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
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
import dev.relayapi.models.twitter.retweet.RetweetCreateParams
import dev.relayapi.models.twitter.retweet.RetweetCreateResponse
import dev.relayapi.models.twitter.retweet.RetweetUndoParams
import dev.relayapi.models.twitter.retweet.RetweetUndoResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class RetweetServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RetweetServiceAsync {

    private val withRawResponse: RetweetServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RetweetServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RetweetServiceAsync =
        RetweetServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: RetweetCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RetweetCreateResponse> =
        // post /v1/twitter/retweet
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun undo(
        params: RetweetUndoParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RetweetUndoResponse> =
        // delete /v1/twitter/retweet
        withRawResponse().undo(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RetweetServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RetweetServiceAsync.WithRawResponse =
            RetweetServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<RetweetCreateResponse> =
            jsonHandler<RetweetCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: RetweetCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RetweetCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "twitter", "retweet")
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

        private val undoHandler: Handler<RetweetUndoResponse> =
            jsonHandler<RetweetUndoResponse>(clientOptions.jsonMapper)

        override fun undo(
            params: RetweetUndoParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RetweetUndoResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "twitter", "retweet")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { undoHandler.handle(it) }
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
