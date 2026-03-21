// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async

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
import dev.relayapi.core.http.parseable
import dev.relayapi.core.prepareAsync
import dev.relayapi.models.reddit.RedditGetFeedParams
import dev.relayapi.models.reddit.RedditGetFeedResponse
import dev.relayapi.models.reddit.RedditSearchParams
import dev.relayapi.models.reddit.RedditSearchResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class RedditServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RedditServiceAsync {

    private val withRawResponse: RedditServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RedditServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RedditServiceAsync =
        RedditServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getFeed(
        params: RedditGetFeedParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RedditGetFeedResponse> =
        // get /v1/reddit/feed
        withRawResponse().getFeed(params, requestOptions).thenApply { it.parse() }

    override fun search(
        params: RedditSearchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RedditSearchResponse> =
        // get /v1/reddit/search
        withRawResponse().search(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RedditServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RedditServiceAsync.WithRawResponse =
            RedditServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getFeedHandler: Handler<RedditGetFeedResponse> =
            jsonHandler<RedditGetFeedResponse>(clientOptions.jsonMapper)

        override fun getFeed(
            params: RedditGetFeedParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RedditGetFeedResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "reddit", "feed")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getFeedHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val searchHandler: Handler<RedditSearchResponse> =
            jsonHandler<RedditSearchResponse>(clientOptions.jsonMapper)

        override fun search(
            params: RedditSearchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RedditSearchResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "reddit", "search")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { searchHandler.handle(it) }
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
