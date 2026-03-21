// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.tools

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
import dev.relayapi.models.tools.instagram.InstagramCheckHashtagSafetyParams
import dev.relayapi.models.tools.instagram.InstagramCheckHashtagSafetyResponse
import java.util.function.Consumer

class InstagramServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InstagramService {

    private val withRawResponse: InstagramService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InstagramService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InstagramService =
        InstagramServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun checkHashtagSafety(
        params: InstagramCheckHashtagSafetyParams,
        requestOptions: RequestOptions,
    ): InstagramCheckHashtagSafetyResponse =
        // post /v1/tools/instagram/hashtag-checker
        withRawResponse().checkHashtagSafety(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InstagramService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InstagramService.WithRawResponse =
            InstagramServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val checkHashtagSafetyHandler: Handler<InstagramCheckHashtagSafetyResponse> =
            jsonHandler<InstagramCheckHashtagSafetyResponse>(clientOptions.jsonMapper)

        override fun checkHashtagSafety(
            params: InstagramCheckHashtagSafetyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InstagramCheckHashtagSafetyResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "tools", "instagram", "hashtag-checker")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
