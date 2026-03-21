// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.inbox

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
import dev.relayapi.models.inbox.reviews.ReviewListParams
import dev.relayapi.models.inbox.reviews.ReviewListResponse
import dev.relayapi.services.async.inbox.reviews.ReplyServiceAsync
import dev.relayapi.services.async.inbox.reviews.ReplyServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class ReviewServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ReviewServiceAsync {

    private val withRawResponse: ReviewServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val reply: ReplyServiceAsync by lazy { ReplyServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ReviewServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReviewServiceAsync =
        ReviewServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun reply(): ReplyServiceAsync = reply

    override fun list(
        params: ReviewListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ReviewListResponse> =
        // get /v1/inbox/reviews
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ReviewServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val reply: ReplyServiceAsync.WithRawResponse by lazy {
            ReplyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ReviewServiceAsync.WithRawResponse =
            ReviewServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun reply(): ReplyServiceAsync.WithRawResponse = reply

        private val listHandler: Handler<ReviewListResponse> =
            jsonHandler<ReviewListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ReviewListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ReviewListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "inbox", "reviews")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
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
