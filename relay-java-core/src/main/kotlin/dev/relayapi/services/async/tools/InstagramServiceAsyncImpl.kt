// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.tools

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
import dev.relayapi.models.tools.instagram.InstagramCheckHashtagSafetyParams
import dev.relayapi.models.tools.instagram.InstagramCheckHashtagSafetyResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class InstagramServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    InstagramServiceAsync {

    private val withRawResponse: InstagramServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InstagramServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InstagramServiceAsync =
        InstagramServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun checkHashtagSafety(
        params: InstagramCheckHashtagSafetyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InstagramCheckHashtagSafetyResponse> =
        // post /v1/tools/instagram/hashtag-checker
        withRawResponse().checkHashtagSafety(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InstagramServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InstagramServiceAsync.WithRawResponse =
            InstagramServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val checkHashtagSafetyHandler: Handler<InstagramCheckHashtagSafetyResponse> =
            jsonHandler<InstagramCheckHashtagSafetyResponse>(clientOptions.jsonMapper)

        override fun checkHashtagSafety(
            params: InstagramCheckHashtagSafetyParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InstagramCheckHashtagSafetyResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "tools", "instagram", "hashtag-checker")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { checkHashtagSafetyHandler.handle(it) }
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
