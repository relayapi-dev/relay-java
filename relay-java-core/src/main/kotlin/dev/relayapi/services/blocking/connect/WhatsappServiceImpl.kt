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
import dev.relayapi.models.connect.whatsapp.WhatsappCompleteEmbeddedSignupParams
import dev.relayapi.models.connect.whatsapp.WhatsappCompleteEmbeddedSignupResponse
import dev.relayapi.models.connect.whatsapp.WhatsappConnectViaCredentialsParams
import dev.relayapi.models.connect.whatsapp.WhatsappConnectViaCredentialsResponse
import dev.relayapi.models.connect.whatsapp.WhatsappGetSdkConfigParams
import dev.relayapi.models.connect.whatsapp.WhatsappGetSdkConfigResponse
import java.util.function.Consumer

class WhatsappServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    WhatsappService {

    private val withRawResponse: WhatsappService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WhatsappService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WhatsappService =
        WhatsappServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun completeEmbeddedSignup(
        params: WhatsappCompleteEmbeddedSignupParams,
        requestOptions: RequestOptions,
    ): WhatsappCompleteEmbeddedSignupResponse =
        // post /v1/connect/whatsapp/embedded-signup
        withRawResponse().completeEmbeddedSignup(params, requestOptions).parse()

    override fun connectViaCredentials(
        params: WhatsappConnectViaCredentialsParams,
        requestOptions: RequestOptions,
    ): WhatsappConnectViaCredentialsResponse =
        // post /v1/connect/whatsapp/credentials
        withRawResponse().connectViaCredentials(params, requestOptions).parse()

    override fun getSdkConfig(
        params: WhatsappGetSdkConfigParams,
        requestOptions: RequestOptions,
    ): WhatsappGetSdkConfigResponse =
        // get /v1/connect/whatsapp/sdk-config
        withRawResponse().getSdkConfig(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WhatsappService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WhatsappService.WithRawResponse =
            WhatsappServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val completeEmbeddedSignupHandler: Handler<WhatsappCompleteEmbeddedSignupResponse> =
            jsonHandler<WhatsappCompleteEmbeddedSignupResponse>(clientOptions.jsonMapper)

        override fun completeEmbeddedSignup(
            params: WhatsappCompleteEmbeddedSignupParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WhatsappCompleteEmbeddedSignupResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "connect", "whatsapp", "embedded-signup")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { completeEmbeddedSignupHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val connectViaCredentialsHandler: Handler<WhatsappConnectViaCredentialsResponse> =
            jsonHandler<WhatsappConnectViaCredentialsResponse>(clientOptions.jsonMapper)

        override fun connectViaCredentials(
            params: WhatsappConnectViaCredentialsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WhatsappConnectViaCredentialsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "connect", "whatsapp", "credentials")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { connectViaCredentialsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getSdkConfigHandler: Handler<WhatsappGetSdkConfigResponse> =
            jsonHandler<WhatsappGetSdkConfigResponse>(clientOptions.jsonMapper)

        override fun getSdkConfig(
            params: WhatsappGetSdkConfigParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WhatsappGetSdkConfigResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "connect", "whatsapp", "sdk-config")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getSdkConfigHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
