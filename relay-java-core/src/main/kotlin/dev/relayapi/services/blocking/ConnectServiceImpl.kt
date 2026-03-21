// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking

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
import dev.relayapi.models.connect.ConnectCompleteOAuthCallbackParams
import dev.relayapi.models.connect.ConnectCompleteOAuthCallbackResponse
import dev.relayapi.models.connect.ConnectCreateBlueskyConnectionParams
import dev.relayapi.models.connect.ConnectCreateBlueskyConnectionResponse
import dev.relayapi.models.connect.ConnectFetchPendingDataParams
import dev.relayapi.models.connect.ConnectFetchPendingDataResponse
import dev.relayapi.models.connect.ConnectStartOAuthFlowParams
import dev.relayapi.models.connect.ConnectStartOAuthFlowResponse
import dev.relayapi.services.blocking.connect.FacebookService
import dev.relayapi.services.blocking.connect.FacebookServiceImpl
import dev.relayapi.services.blocking.connect.GooglebusinessService
import dev.relayapi.services.blocking.connect.GooglebusinessServiceImpl
import dev.relayapi.services.blocking.connect.LinkedinService
import dev.relayapi.services.blocking.connect.LinkedinServiceImpl
import dev.relayapi.services.blocking.connect.PinterestService
import dev.relayapi.services.blocking.connect.PinterestServiceImpl
import dev.relayapi.services.blocking.connect.SnapchatService
import dev.relayapi.services.blocking.connect.SnapchatServiceImpl
import dev.relayapi.services.blocking.connect.TelegramService
import dev.relayapi.services.blocking.connect.TelegramServiceImpl
import dev.relayapi.services.blocking.connect.WhatsappService
import dev.relayapi.services.blocking.connect.WhatsappServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ConnectServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ConnectService {

    private val withRawResponse: ConnectService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val telegram: TelegramService by lazy { TelegramServiceImpl(clientOptions) }

    private val whatsapp: WhatsappService by lazy { WhatsappServiceImpl(clientOptions) }

    private val facebook: FacebookService by lazy { FacebookServiceImpl(clientOptions) }

    private val linkedin: LinkedinService by lazy { LinkedinServiceImpl(clientOptions) }

    private val pinterest: PinterestService by lazy { PinterestServiceImpl(clientOptions) }

    private val googlebusiness: GooglebusinessService by lazy {
        GooglebusinessServiceImpl(clientOptions)
    }

    private val snapchat: SnapchatService by lazy { SnapchatServiceImpl(clientOptions) }

    override fun withRawResponse(): ConnectService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConnectService =
        ConnectServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun telegram(): TelegramService = telegram

    override fun whatsapp(): WhatsappService = whatsapp

    override fun facebook(): FacebookService = facebook

    override fun linkedin(): LinkedinService = linkedin

    override fun pinterest(): PinterestService = pinterest

    override fun googlebusiness(): GooglebusinessService = googlebusiness

    override fun snapchat(): SnapchatService = snapchat

    override fun completeOAuthCallback(
        params: ConnectCompleteOAuthCallbackParams,
        requestOptions: RequestOptions,
    ): ConnectCompleteOAuthCallbackResponse =
        // post /v1/connect/{platform}
        withRawResponse().completeOAuthCallback(params, requestOptions).parse()

    override fun createBlueskyConnection(
        params: ConnectCreateBlueskyConnectionParams,
        requestOptions: RequestOptions,
    ): ConnectCreateBlueskyConnectionResponse =
        // post /v1/connect/bluesky
        withRawResponse().createBlueskyConnection(params, requestOptions).parse()

    override fun fetchPendingData(
        params: ConnectFetchPendingDataParams,
        requestOptions: RequestOptions,
    ): ConnectFetchPendingDataResponse =
        // get /v1/connect/pending-data
        withRawResponse().fetchPendingData(params, requestOptions).parse()

    override fun startOAuthFlow(
        params: ConnectStartOAuthFlowParams,
        requestOptions: RequestOptions,
    ): ConnectStartOAuthFlowResponse =
        // get /v1/connect/{platform}
        withRawResponse().startOAuthFlow(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConnectService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val telegram: TelegramService.WithRawResponse by lazy {
            TelegramServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val whatsapp: WhatsappService.WithRawResponse by lazy {
            WhatsappServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val facebook: FacebookService.WithRawResponse by lazy {
            FacebookServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val linkedin: LinkedinService.WithRawResponse by lazy {
            LinkedinServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val pinterest: PinterestService.WithRawResponse by lazy {
            PinterestServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val googlebusiness: GooglebusinessService.WithRawResponse by lazy {
            GooglebusinessServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val snapchat: SnapchatService.WithRawResponse by lazy {
            SnapchatServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConnectService.WithRawResponse =
            ConnectServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun telegram(): TelegramService.WithRawResponse = telegram

        override fun whatsapp(): WhatsappService.WithRawResponse = whatsapp

        override fun facebook(): FacebookService.WithRawResponse = facebook

        override fun linkedin(): LinkedinService.WithRawResponse = linkedin

        override fun pinterest(): PinterestService.WithRawResponse = pinterest

        override fun googlebusiness(): GooglebusinessService.WithRawResponse = googlebusiness

        override fun snapchat(): SnapchatService.WithRawResponse = snapchat

        private val completeOAuthCallbackHandler: Handler<ConnectCompleteOAuthCallbackResponse> =
            jsonHandler<ConnectCompleteOAuthCallbackResponse>(clientOptions.jsonMapper)

        override fun completeOAuthCallback(
            params: ConnectCompleteOAuthCallbackParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConnectCompleteOAuthCallbackResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { completeOAuthCallbackHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<ConnectCreateBlueskyConnectionResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "connect", "bluesky")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createBlueskyConnectionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val fetchPendingDataHandler: Handler<ConnectFetchPendingDataResponse> =
            jsonHandler<ConnectFetchPendingDataResponse>(clientOptions.jsonMapper)

        override fun fetchPendingData(
            params: ConnectFetchPendingDataParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConnectFetchPendingDataResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "connect", "pending-data")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { fetchPendingDataHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val startOAuthFlowHandler: Handler<ConnectStartOAuthFlowResponse> =
            jsonHandler<ConnectStartOAuthFlowResponse>(clientOptions.jsonMapper)

        override fun startOAuthFlow(
            params: ConnectStartOAuthFlowParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConnectStartOAuthFlowResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("platform", params.platform().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "connect", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
