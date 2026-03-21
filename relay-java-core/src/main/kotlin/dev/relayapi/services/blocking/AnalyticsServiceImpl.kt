// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking

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
import dev.relayapi.core.prepare
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
import dev.relayapi.services.blocking.analytics.YoutubeService
import dev.relayapi.services.blocking.analytics.YoutubeServiceImpl
import java.util.function.Consumer

class AnalyticsServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AnalyticsService {

    private val withRawResponse: AnalyticsService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val youtube: YoutubeService by lazy { YoutubeServiceImpl(clientOptions) }

    override fun withRawResponse(): AnalyticsService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AnalyticsService =
        AnalyticsServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun youtube(): YoutubeService = youtube

    override fun retrieve(
        params: AnalyticsRetrieveParams,
        requestOptions: RequestOptions,
    ): AnalyticsRetrieveResponse =
        // get /v1/analytics
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun getBestTime(
        params: AnalyticsGetBestTimeParams,
        requestOptions: RequestOptions,
    ): AnalyticsGetBestTimeResponse =
        // get /v1/analytics/best-time
        withRawResponse().getBestTime(params, requestOptions).parse()

    override fun getContentDecay(
        params: AnalyticsGetContentDecayParams,
        requestOptions: RequestOptions,
    ): AnalyticsGetContentDecayResponse =
        // get /v1/analytics/content-decay
        withRawResponse().getContentDecay(params, requestOptions).parse()

    override fun getPostTimeline(
        params: AnalyticsGetPostTimelineParams,
        requestOptions: RequestOptions,
    ): AnalyticsGetPostTimelineResponse =
        // get /v1/analytics/post-timeline
        withRawResponse().getPostTimeline(params, requestOptions).parse()

    override fun getPostingFrequency(
        params: AnalyticsGetPostingFrequencyParams,
        requestOptions: RequestOptions,
    ): AnalyticsGetPostingFrequencyResponse =
        // get /v1/analytics/posting-frequency
        withRawResponse().getPostingFrequency(params, requestOptions).parse()

    override fun listDailyMetrics(
        params: AnalyticsListDailyMetricsParams,
        requestOptions: RequestOptions,
    ): AnalyticsListDailyMetricsResponse =
        // get /v1/analytics/daily-metrics
        withRawResponse().listDailyMetrics(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AnalyticsService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val youtube: YoutubeService.WithRawResponse by lazy {
            YoutubeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AnalyticsService.WithRawResponse =
            AnalyticsServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun youtube(): YoutubeService.WithRawResponse = youtube

        private val retrieveHandler: Handler<AnalyticsRetrieveResponse> =
            jsonHandler<AnalyticsRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AnalyticsRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnalyticsRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "analytics")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getBestTimeHandler: Handler<AnalyticsGetBestTimeResponse> =
            jsonHandler<AnalyticsGetBestTimeResponse>(clientOptions.jsonMapper)

        override fun getBestTime(
            params: AnalyticsGetBestTimeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnalyticsGetBestTimeResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "analytics", "best-time")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getBestTimeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getContentDecayHandler: Handler<AnalyticsGetContentDecayResponse> =
            jsonHandler<AnalyticsGetContentDecayResponse>(clientOptions.jsonMapper)

        override fun getContentDecay(
            params: AnalyticsGetContentDecayParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnalyticsGetContentDecayResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "analytics", "content-decay")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getContentDecayHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getPostTimelineHandler: Handler<AnalyticsGetPostTimelineResponse> =
            jsonHandler<AnalyticsGetPostTimelineResponse>(clientOptions.jsonMapper)

        override fun getPostTimeline(
            params: AnalyticsGetPostTimelineParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnalyticsGetPostTimelineResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "analytics", "post-timeline")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getPostTimelineHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getPostingFrequencyHandler: Handler<AnalyticsGetPostingFrequencyResponse> =
            jsonHandler<AnalyticsGetPostingFrequencyResponse>(clientOptions.jsonMapper)

        override fun getPostingFrequency(
            params: AnalyticsGetPostingFrequencyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnalyticsGetPostingFrequencyResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "analytics", "posting-frequency")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getPostingFrequencyHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listDailyMetricsHandler: Handler<AnalyticsListDailyMetricsResponse> =
            jsonHandler<AnalyticsListDailyMetricsResponse>(clientOptions.jsonMapper)

        override fun listDailyMetrics(
            params: AnalyticsListDailyMetricsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnalyticsListDailyMetricsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "analytics", "daily-metrics")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
