// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.twitter

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
import dev.relayapi.models.twitter.follow.FollowCreateParams
import dev.relayapi.models.twitter.follow.FollowCreateResponse
import dev.relayapi.models.twitter.follow.FollowUnfollowParams
import dev.relayapi.models.twitter.follow.FollowUnfollowResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class FollowServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    FollowServiceAsync {

    private val withRawResponse: FollowServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FollowServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FollowServiceAsync =
        FollowServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: FollowCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FollowCreateResponse> =
        // post /v1/twitter/follow
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun unfollow(
        params: FollowUnfollowParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FollowUnfollowResponse> =
        // delete /v1/twitter/follow
        withRawResponse().unfollow(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FollowServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FollowServiceAsync.WithRawResponse =
            FollowServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<FollowCreateResponse> =
            jsonHandler<FollowCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: FollowCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FollowCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "twitter", "follow")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val unfollowHandler: Handler<FollowUnfollowResponse> =
            jsonHandler<FollowUnfollowResponse>(clientOptions.jsonMapper)

        override fun unfollow(
            params: FollowUnfollowParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FollowUnfollowResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "twitter", "follow")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { unfollowHandler.handle(it) }
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
