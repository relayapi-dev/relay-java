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
import dev.relayapi.models.analytics.AnalyticsGetBestTimeParams
import dev.relayapi.models.analytics.AnalyticsGetBestTimeResponse
import dev.relayapi.models.analytics.AnalyticsGetContentDecayParams
import dev.relayapi.models.analytics.AnalyticsGetContentDecayResponse
import dev.relayapi.models.analytics.AnalyticsGetPostTimelineParams
import dev.relayapi.models.analytics.AnalyticsGetPostTimelineResponse
import dev.relayapi.models.analytics.AnalyticsGetPostingFrequencyParams
import dev.relayapi.models.analytics.AnalyticsGetPostingFrequencyResponse
import dev.relayapi.models.analytics.AnalyticsListDailyMetricsParams
import dev.relayapi.models.analytics.AnalyticsListDailyMetricsResponse
import dev.relayapi.models.analytics.AnalyticsRetrieveParams
import dev.relayapi.models.analytics.AnalyticsRetrieveResponse
import dev.relayapi.services.async.analytics.YoutubeServiceAsync
import dev.relayapi.services.async.analytics.YoutubeServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class AnalyticsServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AnalyticsServiceAsync {

    private val withRawResponse: AnalyticsServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val youtube: YoutubeServiceAsync by lazy { YoutubeServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): AnalyticsServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AnalyticsServiceAsync =
        AnalyticsServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun youtube(): YoutubeServiceAsync = youtube

    override fun retrieve(
        params: AnalyticsRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AnalyticsRetrieveResponse> =
        // get /v1/analytics
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun getBestTime(
        params: AnalyticsGetBestTimeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AnalyticsGetBestTimeResponse> =
        // get /v1/analytics/best-time
        withRawResponse().getBestTime(params, requestOptions).thenApply { it.parse() }

    override fun getContentDecay(
        params: AnalyticsGetContentDecayParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AnalyticsGetContentDecayResponse> =
        // get /v1/analytics/content-decay
        withRawResponse().getContentDecay(params, requestOptions).thenApply { it.parse() }

    override fun getPostTimeline(
        params: AnalyticsGetPostTimelineParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AnalyticsGetPostTimelineResponse> =
        // get /v1/analytics/post-timeline
        withRawResponse().getPostTimeline(params, requestOptions).thenApply { it.parse() }

    override fun getPostingFrequency(
        params: AnalyticsGetPostingFrequencyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AnalyticsGetPostingFrequencyResponse> =
        // get /v1/analytics/posting-frequency
        withRawResponse().getPostingFrequency(params, requestOptions).thenApply { it.parse() }

    override fun listDailyMetrics(
        params: AnalyticsListDailyMetricsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AnalyticsListDailyMetricsResponse> =
        // get /v1/analytics/daily-metrics
        withRawResponse().listDailyMetrics(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AnalyticsServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val youtube: YoutubeServiceAsync.WithRawResponse by lazy {
            YoutubeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AnalyticsServiceAsync.WithRawResponse =
            AnalyticsServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun youtube(): YoutubeServiceAsync.WithRawResponse = youtube

        private val retrieveHandler: Handler<AnalyticsRetrieveResponse> =
            jsonHandler<AnalyticsRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AnalyticsRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AnalyticsRetrieveResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "analytics")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getBestTimeHandler: Handler<AnalyticsGetBestTimeResponse> =
            jsonHandler<AnalyticsGetBestTimeResponse>(clientOptions.jsonMapper)

        override fun getBestTime(
            params: AnalyticsGetBestTimeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AnalyticsGetBestTimeResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "analytics", "best-time")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getBestTimeHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getContentDecayHandler: Handler<AnalyticsGetContentDecayResponse> =
            jsonHandler<AnalyticsGetContentDecayResponse>(clientOptions.jsonMapper)

        override fun getContentDecay(
            params: AnalyticsGetContentDecayParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AnalyticsGetContentDecayResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "analytics", "content-decay")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getContentDecayHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getPostTimelineHandler: Handler<AnalyticsGetPostTimelineResponse> =
            jsonHandler<AnalyticsGetPostTimelineResponse>(clientOptions.jsonMapper)

        override fun getPostTimeline(
            params: AnalyticsGetPostTimelineParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AnalyticsGetPostTimelineResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "analytics", "post-timeline")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getPostTimelineHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getPostingFrequencyHandler: Handler<AnalyticsGetPostingFrequencyResponse> =
            jsonHandler<AnalyticsGetPostingFrequencyResponse>(clientOptions.jsonMapper)

        override fun getPostingFrequency(
            params: AnalyticsGetPostingFrequencyParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AnalyticsGetPostingFrequencyResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "analytics", "posting-frequency")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getPostingFrequencyHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listDailyMetricsHandler: Handler<AnalyticsListDailyMetricsResponse> =
            jsonHandler<AnalyticsListDailyMetricsResponse>(clientOptions.jsonMapper)

        override fun listDailyMetrics(
            params: AnalyticsListDailyMetricsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AnalyticsListDailyMetricsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "analytics", "daily-metrics")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listDailyMetricsHandler.handle(it) }
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
