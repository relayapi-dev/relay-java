// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async

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
import dev.relayapi.models.connect.ConnectCompleteOAuthCallbackParams
import dev.relayapi.models.connect.ConnectCompleteOAuthCallbackResponse
import dev.relayapi.models.connect.ConnectCreateBlueskyConnectionParams
import dev.relayapi.models.connect.ConnectCreateBlueskyConnectionResponse
import dev.relayapi.models.connect.ConnectFetchPendingDataParams
import dev.relayapi.models.connect.ConnectFetchPendingDataResponse
import dev.relayapi.models.connect.ConnectStartOAuthFlowParams
import dev.relayapi.models.connect.ConnectStartOAuthFlowResponse
import dev.relayapi.services.async.connect.FacebookServiceAsync
import dev.relayapi.services.async.connect.FacebookServiceAsyncImpl
import dev.relayapi.services.async.connect.GooglebusinessServiceAsync
import dev.relayapi.services.async.connect.GooglebusinessServiceAsyncImpl
import dev.relayapi.services.async.connect.LinkedinServiceAsync
import dev.relayapi.services.async.connect.LinkedinServiceAsyncImpl
import dev.relayapi.services.async.connect.PinterestServiceAsync
import dev.relayapi.services.async.connect.PinterestServiceAsyncImpl
import dev.relayapi.services.async.connect.SnapchatServiceAsync
import dev.relayapi.services.async.connect.SnapchatServiceAsyncImpl
import dev.relayapi.services.async.connect.TelegramServiceAsync
import dev.relayapi.services.async.connect.TelegramServiceAsyncImpl
import dev.relayapi.services.async.connect.WhatsappServiceAsync
import dev.relayapi.services.async.connect.WhatsappServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ConnectServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ConnectServiceAsync {

    private val withRawResponse: ConnectServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val telegram: TelegramServiceAsync by lazy { TelegramServiceAsyncImpl(clientOptions) }

    private val whatsapp: WhatsappServiceAsync by lazy { WhatsappServiceAsyncImpl(clientOptions) }

    private val facebook: FacebookServiceAsync by lazy { FacebookServiceAsyncImpl(clientOptions) }

    private val linkedin: LinkedinServiceAsync by lazy { LinkedinServiceAsyncImpl(clientOptions) }

    private val pinterest: PinterestServiceAsync by lazy {
        PinterestServiceAsyncImpl(clientOptions)
    }

    private val googlebusiness: GooglebusinessServiceAsync by lazy {
        GooglebusinessServiceAsyncImpl(clientOptions)
    }

    private val snapchat: SnapchatServiceAsync by lazy { SnapchatServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ConnectServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConnectServiceAsync =
        ConnectServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun telegram(): TelegramServiceAsync = telegram

    override fun whatsapp(): WhatsappServiceAsync = whatsapp

    override fun facebook(): FacebookServiceAsync = facebook

    override fun linkedin(): LinkedinServiceAsync = linkedin

    override fun pinterest(): PinterestServiceAsync = pinterest

    override fun googlebusiness(): GooglebusinessServiceAsync = googlebusiness

    override fun snapchat(): SnapchatServiceAsync = snapchat

    override fun completeOAuthCallback(
        params: ConnectCompleteOAuthCallbackParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConnectCompleteOAuthCallbackResponse> =
        // post /v1/connect/{platform}
        withRawResponse().completeOAuthCallback(params, requestOptions).thenApply { it.parse() }

    override fun createBlueskyConnection(
        params: ConnectCreateBlueskyConnectionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConnectCreateBlueskyConnectionResponse> =
        // post /v1/connect/bluesky
        withRawResponse().createBlueskyConnection(params, requestOptions).thenApply { it.parse() }

    override fun fetchPendingData(
        params: ConnectFetchPendingDataParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConnectFetchPendingDataResponse> =
        // get /v1/connect/pending-data
        withRawResponse().fetchPendingData(params, requestOptions).thenApply { it.parse() }

    override fun startOAuthFlow(
        params: ConnectStartOAuthFlowParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConnectStartOAuthFlowResponse> =
        // get /v1/connect/{platform}
        withRawResponse().startOAuthFlow(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConnectServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val telegram: TelegramServiceAsync.WithRawResponse by lazy {
            TelegramServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val whatsapp: WhatsappServiceAsync.WithRawResponse by lazy {
            WhatsappServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val facebook: FacebookServiceAsync.WithRawResponse by lazy {
            FacebookServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val linkedin: LinkedinServiceAsync.WithRawResponse by lazy {
            LinkedinServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val pinterest: PinterestServiceAsync.WithRawResponse by lazy {
            PinterestServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val googlebusiness: GooglebusinessServiceAsync.WithRawResponse by lazy {
            GooglebusinessServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val snapchat: SnapchatServiceAsync.WithRawResponse by lazy {
            SnapchatServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConnectServiceAsync.WithRawResponse =
            ConnectServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun telegram(): TelegramServiceAsync.WithRawResponse = telegram

        override fun whatsapp(): WhatsappServiceAsync.WithRawResponse = whatsapp

        override fun facebook(): FacebookServiceAsync.WithRawResponse = facebook

        override fun linkedin(): LinkedinServiceAsync.WithRawResponse = linkedin

        override fun pinterest(): PinterestServiceAsync.WithRawResponse = pinterest

        override fun googlebusiness(): GooglebusinessServiceAsync.WithRawResponse = googlebusiness

        override fun snapchat(): SnapchatServiceAsync.WithRawResponse = snapchat

        private val completeOAuthCallbackHandler: Handler<ConnectCompleteOAuthCallbackResponse> =
            jsonHandler<ConnectCompleteOAuthCallbackResponse>(clientOptions.jsonMapper)

        override fun completeOAuthCallback(
            params: ConnectCompleteOAuthCallbackParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConnectCompleteOAuthCallbackResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("platform", params.platform().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "connect", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { completeOAuthCallbackHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createBlueskyConnectionHandler:
            Handler<ConnectCreateBlueskyConnectionResponse> =
            jsonHandler<ConnectCreateBlueskyConnectionResponse>(clientOptions.jsonMapper)

        override fun createBlueskyConnection(
            params: ConnectCreateBlueskyConnectionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConnectCreateBlueskyConnectionResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "connect", "bluesky")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createBlueskyConnectionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val fetchPendingDataHandler: Handler<ConnectFetchPendingDataResponse> =
            jsonHandler<ConnectFetchPendingDataResponse>(clientOptions.jsonMapper)

        override fun fetchPendingData(
            params: ConnectFetchPendingDataParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConnectFetchPendingDataResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "connect", "pending-data")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { fetchPendingDataHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val startOAuthFlowHandler: Handler<ConnectStartOAuthFlowResponse> =
            jsonHandler<ConnectStartOAuthFlowResponse>(clientOptions.jsonMapper)

        override fun startOAuthFlow(
            params: ConnectStartOAuthFlowParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConnectStartOAuthFlowResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("platform", params.platform().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "connect", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { startOAuthFlowHandler.handle(it) }
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
