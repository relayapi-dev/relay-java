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
import dev.relayapi.models.connect.whatsapp.WhatsappCompleteEmbeddedSignupParams
import dev.relayapi.models.connect.whatsapp.WhatsappCompleteEmbeddedSignupResponse
import dev.relayapi.models.connect.whatsapp.WhatsappConnectViaCredentialsParams
import dev.relayapi.models.connect.whatsapp.WhatsappConnectViaCredentialsResponse
import dev.relayapi.models.connect.whatsapp.WhatsappGetSdkConfigParams
import dev.relayapi.models.connect.whatsapp.WhatsappGetSdkConfigResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class WhatsappServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    WhatsappServiceAsync {

    private val withRawResponse: WhatsappServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WhatsappServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WhatsappServiceAsync =
        WhatsappServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun completeEmbeddedSignup(
        params: WhatsappCompleteEmbeddedSignupParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WhatsappCompleteEmbeddedSignupResponse> =
        // post /v1/connect/whatsapp/embedded-signup
        withRawResponse().completeEmbeddedSignup(params, requestOptions).thenApply { it.parse() }

    override fun connectViaCredentials(
        params: WhatsappConnectViaCredentialsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WhatsappConnectViaCredentialsResponse> =
        // post /v1/connect/whatsapp/credentials
        withRawResponse().connectViaCredentials(params, requestOptions).thenApply { it.parse() }

    override fun getSdkConfig(
        params: WhatsappGetSdkConfigParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WhatsappGetSdkConfigResponse> =
        // get /v1/connect/whatsapp/sdk-config
        withRawResponse().getSdkConfig(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WhatsappServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WhatsappServiceAsync.WithRawResponse =
            WhatsappServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val completeEmbeddedSignupHandler: Handler<WhatsappCompleteEmbeddedSignupResponse> =
            jsonHandler<WhatsappCompleteEmbeddedSignupResponse>(clientOptions.jsonMapper)

        override fun completeEmbeddedSignup(
            params: WhatsappCompleteEmbeddedSignupParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WhatsappCompleteEmbeddedSignupResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "connect", "whatsapp", "embedded-signup")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { completeEmbeddedSignupHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val connectViaCredentialsHandler: Handler<WhatsappConnectViaCredentialsResponse> =
            jsonHandler<WhatsappConnectViaCredentialsResponse>(clientOptions.jsonMapper)

        override fun connectViaCredentials(
            params: WhatsappConnectViaCredentialsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WhatsappConnectViaCredentialsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "connect", "whatsapp", "credentials")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { connectViaCredentialsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getSdkConfigHandler: Handler<WhatsappGetSdkConfigResponse> =
            jsonHandler<WhatsappGetSdkConfigResponse>(clientOptions.jsonMapper)

        override fun getSdkConfig(
            params: WhatsappGetSdkConfigParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WhatsappGetSdkConfigResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "connect", "whatsapp", "sdk-config")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
