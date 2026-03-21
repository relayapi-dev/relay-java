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
import dev.relayapi.models.reddit.RedditGetFeedParams
import dev.relayapi.models.reddit.RedditGetFeedResponse
import dev.relayapi.models.reddit.RedditSearchParams
import dev.relayapi.models.reddit.RedditSearchResponse
import java.util.function.Consumer

class RedditServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RedditService {

    private val withRawResponse: RedditService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RedditService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RedditService =
        RedditServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getFeed(
        params: RedditGetFeedParams,
        requestOptions: RequestOptions,
    ): RedditGetFeedResponse =
        // get /v1/reddit/feed
        withRawResponse().getFeed(params, requestOptions).parse()

    override fun search(
        params: RedditSearchParams,
        requestOptions: RequestOptions,
    ): RedditSearchResponse =
        // get /v1/reddit/search
        withRawResponse().search(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RedditService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RedditService.WithRawResponse =
            RedditServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getFeedHandler: Handler<RedditGetFeedResponse> =
            jsonHandler<RedditGetFeedResponse>(clientOptions.jsonMapper)

        override fun getFeed(
            params: RedditGetFeedParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RedditGetFeedResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "reddit", "feed")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getFeedHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val searchHandler: Handler<RedditSearchResponse> =
            jsonHandler<RedditSearchResponse>(clientOptions.jsonMapper)

        override fun search(
            params: RedditSearchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RedditSearchResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "reddit", "search")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
