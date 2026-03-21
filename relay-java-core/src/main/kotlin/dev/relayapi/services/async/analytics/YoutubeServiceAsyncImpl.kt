// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.analytics

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
import dev.relayapi.models.analytics.youtube.YoutubeGetDailyViewsParams
import dev.relayapi.models.analytics.youtube.YoutubeGetDailyViewsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class YoutubeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    YoutubeServiceAsync {

    private val withRawResponse: YoutubeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): YoutubeServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): YoutubeServiceAsync =
        YoutubeServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getDailyViews(
        params: YoutubeGetDailyViewsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<YoutubeGetDailyViewsResponse> =
        // get /v1/analytics/youtube/daily-views
        withRawResponse().getDailyViews(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        YoutubeServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): YoutubeServiceAsync.WithRawResponse =
            YoutubeServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getDailyViewsHandler: Handler<YoutubeGetDailyViewsResponse> =
            jsonHandler<YoutubeGetDailyViewsResponse>(clientOptions.jsonMapper)

        override fun getDailyViews(
            params: YoutubeGetDailyViewsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<YoutubeGetDailyViewsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "analytics", "youtube", "daily-views")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getDailyViewsHandler.handle(it) }
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
