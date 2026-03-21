// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.connect

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
import dev.relayapi.models.connect.telegram.TelegramConnectDirectlyParams
import dev.relayapi.models.connect.telegram.TelegramConnectDirectlyResponse
import dev.relayapi.models.connect.telegram.TelegramInitiateConnectionParams
import dev.relayapi.models.connect.telegram.TelegramInitiateConnectionResponse
import dev.relayapi.models.connect.telegram.TelegramPollConnectionStatusParams
import dev.relayapi.models.connect.telegram.TelegramPollConnectionStatusResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class TelegramServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TelegramServiceAsync {

    private val withRawResponse: TelegramServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TelegramServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TelegramServiceAsync =
        TelegramServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun connectDirectly(
        params: TelegramConnectDirectlyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TelegramConnectDirectlyResponse> =
        // post /v1/connect/telegram/direct
        withRawResponse().connectDirectly(params, requestOptions).thenApply { it.parse() }

    override fun initiateConnection(
        params: TelegramInitiateConnectionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TelegramInitiateConnectionResponse> =
        // post /v1/connect/telegram
        withRawResponse().initiateConnection(params, requestOptions).thenApply { it.parse() }

    override fun pollConnectionStatus(
        params: TelegramPollConnectionStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TelegramPollConnectionStatusResponse> =
        // get /v1/connect/telegram
        withRawResponse().pollConnectionStatus(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TelegramServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TelegramServiceAsync.WithRawResponse =
            TelegramServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val connectDirectlyHandler: Handler<TelegramConnectDirectlyResponse> =
            jsonHandler<TelegramConnectDirectlyResponse>(clientOptions.jsonMapper)

        override fun connectDirectly(
            params: TelegramConnectDirectlyParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TelegramConnectDirectlyResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "connect", "telegram", "direct")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { connectDirectlyHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val initiateConnectionHandler: Handler<TelegramInitiateConnectionResponse> =
            jsonHandler<TelegramInitiateConnectionResponse>(clientOptions.jsonMapper)

        override fun initiateConnection(
            params: TelegramInitiateConnectionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TelegramInitiateConnectionResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "connect", "telegram")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { initiateConnectionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val pollConnectionStatusHandler: Handler<TelegramPollConnectionStatusResponse> =
            jsonHandler<TelegramPollConnectionStatusResponse>(clientOptions.jsonMapper)

        override fun pollConnectionStatus(
            params: TelegramPollConnectionStatusParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TelegramPollConnectionStatusResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "connect", "telegram")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { pollConnectionStatusHandler.handle(it) }
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
