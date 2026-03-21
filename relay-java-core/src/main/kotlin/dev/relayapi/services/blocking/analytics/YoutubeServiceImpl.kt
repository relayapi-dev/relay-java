// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.analytics

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
import dev.relayapi.models.analytics.youtube.YoutubeGetDailyViewsParams
import dev.relayapi.models.analytics.youtube.YoutubeGetDailyViewsResponse
import java.util.function.Consumer

class YoutubeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    YoutubeService {

    private val withRawResponse: YoutubeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): YoutubeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): YoutubeService =
        YoutubeServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getDailyViews(
        params: YoutubeGetDailyViewsParams,
        requestOptions: RequestOptions,
    ): YoutubeGetDailyViewsResponse =
        // get /v1/analytics/youtube/daily-views
        withRawResponse().getDailyViews(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        YoutubeService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): YoutubeService.WithRawResponse =
            YoutubeServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getDailyViewsHandler: Handler<YoutubeGetDailyViewsResponse> =
            jsonHandler<YoutubeGetDailyViewsResponse>(clientOptions.jsonMapper)

        override fun getDailyViews(
            params: YoutubeGetDailyViewsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<YoutubeGetDailyViewsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "analytics", "youtube", "daily-views")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
