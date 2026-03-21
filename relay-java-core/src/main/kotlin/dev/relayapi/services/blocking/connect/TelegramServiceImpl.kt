// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.connect

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
import dev.relayapi.core.prepare
import dev.relayapi.models.connect.telegram.TelegramConnectDirectlyParams
import dev.relayapi.models.connect.telegram.TelegramConnectDirectlyResponse
import dev.relayapi.models.connect.telegram.TelegramInitiateConnectionParams
import dev.relayapi.models.connect.telegram.TelegramInitiateConnectionResponse
import dev.relayapi.models.connect.telegram.TelegramPollConnectionStatusParams
import dev.relayapi.models.connect.telegram.TelegramPollConnectionStatusResponse
import java.util.function.Consumer

class TelegramServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TelegramService {

    private val withRawResponse: TelegramService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TelegramService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TelegramService =
        TelegramServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun connectDirectly(
        params: TelegramConnectDirectlyParams,
        requestOptions: RequestOptions,
    ): TelegramConnectDirectlyResponse =
        // post /v1/connect/telegram/direct
        withRawResponse().connectDirectly(params, requestOptions).parse()

    override fun initiateConnection(
        params: TelegramInitiateConnectionParams,
        requestOptions: RequestOptions,
    ): TelegramInitiateConnectionResponse =
        // post /v1/connect/telegram
        withRawResponse().initiateConnection(params, requestOptions).parse()

    override fun pollConnectionStatus(
        params: TelegramPollConnectionStatusParams,
        requestOptions: RequestOptions,
    ): TelegramPollConnectionStatusResponse =
        // get /v1/connect/telegram
        withRawResponse().pollConnectionStatus(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TelegramService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TelegramService.WithRawResponse =
            TelegramServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val connectDirectlyHandler: Handler<TelegramConnectDirectlyResponse> =
            jsonHandler<TelegramConnectDirectlyResponse>(clientOptions.jsonMapper)

        override fun connectDirectly(
            params: TelegramConnectDirectlyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TelegramConnectDirectlyResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "connect", "telegram", "direct")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { connectDirectlyHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val initiateConnectionHandler: Handler<TelegramInitiateConnectionResponse> =
            jsonHandler<TelegramInitiateConnectionResponse>(clientOptions.jsonMapper)

        override fun initiateConnection(
            params: TelegramInitiateConnectionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TelegramInitiateConnectionResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "connect", "telegram")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { initiateConnectionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val pollConnectionStatusHandler: Handler<TelegramPollConnectionStatusResponse> =
            jsonHandler<TelegramPollConnectionStatusResponse>(clientOptions.jsonMapper)

        override fun pollConnectionStatus(
            params: TelegramPollConnectionStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TelegramPollConnectionStatusResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "connect", "telegram")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
