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
import dev.relayapi.models.tools.validate.ValidateCheckPostLengthParams
import dev.relayapi.models.tools.validate.ValidateCheckPostLengthResponse
import dev.relayapi.models.tools.validate.ValidateRetrieveSubredditParams
import dev.relayapi.models.tools.validate.ValidateRetrieveSubredditResponse
import dev.relayapi.models.tools.validate.ValidateValidateMediaParams
import dev.relayapi.models.tools.validate.ValidateValidateMediaResponse
import dev.relayapi.models.tools.validate.ValidateValidatePostParams
import dev.relayapi.models.tools.validate.ValidateValidatePostResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class ValidateServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ValidateServiceAsync {

    private val withRawResponse: ValidateServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ValidateServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ValidateServiceAsync =
        ValidateServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun checkPostLength(
        params: ValidateCheckPostLengthParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ValidateCheckPostLengthResponse> =
        // post /v1/tools/validate/post-length
        withRawResponse().checkPostLength(params, requestOptions).thenApply { it.parse() }

    override fun retrieveSubreddit(
        params: ValidateRetrieveSubredditParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ValidateRetrieveSubredditResponse> =
        // get /v1/tools/validate/subreddit
        withRawResponse().retrieveSubreddit(params, requestOptions).thenApply { it.parse() }

    override fun validateMedia(
        params: ValidateValidateMediaParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ValidateValidateMediaResponse> =
        // post /v1/tools/validate/media
        withRawResponse().validateMedia(params, requestOptions).thenApply { it.parse() }

    override fun validatePost(
        params: ValidateValidatePostParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ValidateValidatePostResponse> =
        // post /v1/tools/validate/post
        withRawResponse().validatePost(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ValidateServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ValidateServiceAsync.WithRawResponse =
            ValidateServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val checkPostLengthHandler: Handler<ValidateCheckPostLengthResponse> =
            jsonHandler<ValidateCheckPostLengthResponse>(clientOptions.jsonMapper)

        override fun checkPostLength(
            params: ValidateCheckPostLengthParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ValidateCheckPostLengthResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "tools", "validate", "post-length")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { checkPostLengthHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveSubredditHandler: Handler<ValidateRetrieveSubredditResponse> =
            jsonHandler<ValidateRetrieveSubredditResponse>(clientOptions.jsonMapper)

        override fun retrieveSubreddit(
            params: ValidateRetrieveSubredditParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ValidateRetrieveSubredditResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "tools", "validate", "subreddit")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveSubredditHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val validateMediaHandler: Handler<ValidateValidateMediaResponse> =
            jsonHandler<ValidateValidateMediaResponse>(clientOptions.jsonMapper)

        override fun validateMedia(
            params: ValidateValidateMediaParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ValidateValidateMediaResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "tools", "validate", "media")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { validateMediaHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val validatePostHandler: Handler<ValidateValidatePostResponse> =
            jsonHandler<ValidateValidatePostResponse>(clientOptions.jsonMapper)

        override fun validatePost(
            params: ValidateValidatePostParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ValidateValidatePostResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "tools", "validate", "post")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
