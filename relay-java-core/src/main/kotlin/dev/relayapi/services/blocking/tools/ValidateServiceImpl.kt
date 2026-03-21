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
import dev.relayapi.models.tools.validate.ValidateCheckPostLengthParams
import dev.relayapi.models.tools.validate.ValidateCheckPostLengthResponse
import dev.relayapi.models.tools.validate.ValidateRetrieveSubredditParams
import dev.relayapi.models.tools.validate.ValidateRetrieveSubredditResponse
import dev.relayapi.models.tools.validate.ValidateValidateMediaParams
import dev.relayapi.models.tools.validate.ValidateValidateMediaResponse
import dev.relayapi.models.tools.validate.ValidateValidatePostParams
import dev.relayapi.models.tools.validate.ValidateValidatePostResponse
import java.util.function.Consumer

class ValidateServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ValidateService {

    private val withRawResponse: ValidateService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ValidateService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ValidateService =
        ValidateServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun checkPostLength(
        params: ValidateCheckPostLengthParams,
        requestOptions: RequestOptions,
    ): ValidateCheckPostLengthResponse =
        // post /v1/tools/validate/post-length
        withRawResponse().checkPostLength(params, requestOptions).parse()

    override fun retrieveSubreddit(
        params: ValidateRetrieveSubredditParams,
        requestOptions: RequestOptions,
    ): ValidateRetrieveSubredditResponse =
        // get /v1/tools/validate/subreddit
        withRawResponse().retrieveSubreddit(params, requestOptions).parse()

    override fun validateMedia(
        params: ValidateValidateMediaParams,
        requestOptions: RequestOptions,
    ): ValidateValidateMediaResponse =
        // post /v1/tools/validate/media
        withRawResponse().validateMedia(params, requestOptions).parse()

    override fun validatePost(
        params: ValidateValidatePostParams,
        requestOptions: RequestOptions,
    ): ValidateValidatePostResponse =
        // post /v1/tools/validate/post
        withRawResponse().validatePost(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ValidateService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ValidateService.WithRawResponse =
            ValidateServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val checkPostLengthHandler: Handler<ValidateCheckPostLengthResponse> =
            jsonHandler<ValidateCheckPostLengthResponse>(clientOptions.jsonMapper)

        override fun checkPostLength(
            params: ValidateCheckPostLengthParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ValidateCheckPostLengthResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "tools", "validate", "post-length")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { checkPostLengthHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveSubredditHandler: Handler<ValidateRetrieveSubredditResponse> =
            jsonHandler<ValidateRetrieveSubredditResponse>(clientOptions.jsonMapper)

        override fun retrieveSubreddit(
            params: ValidateRetrieveSubredditParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ValidateRetrieveSubredditResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "tools", "validate", "subreddit")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveSubredditHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val validateMediaHandler: Handler<ValidateValidateMediaResponse> =
            jsonHandler<ValidateValidateMediaResponse>(clientOptions.jsonMapper)

        override fun validateMedia(
            params: ValidateValidateMediaParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ValidateValidateMediaResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "tools", "validate", "media")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { validateMediaHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val validatePostHandler: Handler<ValidateValidatePostResponse> =
            jsonHandler<ValidateValidatePostResponse>(clientOptions.jsonMapper)

        override fun validatePost(
            params: ValidateValidatePostParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ValidateValidatePostResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "tools", "validate", "post")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { validatePostHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
