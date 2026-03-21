// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.inbox

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
import dev.relayapi.models.inbox.reviews.ReviewListParams
import dev.relayapi.models.inbox.reviews.ReviewListResponse
import dev.relayapi.services.blocking.inbox.reviews.ReplyService
import dev.relayapi.services.blocking.inbox.reviews.ReplyServiceImpl
import java.util.function.Consumer

class ReviewServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ReviewService {

    private val withRawResponse: ReviewService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val reply: ReplyService by lazy { ReplyServiceImpl(clientOptions) }

    override fun withRawResponse(): ReviewService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReviewService =
        ReviewServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun reply(): ReplyService = reply

    override fun list(
        params: ReviewListParams,
        requestOptions: RequestOptions,
    ): ReviewListResponse =
        // get /v1/inbox/reviews
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ReviewService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val reply: ReplyService.WithRawResponse by lazy {
            ReplyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ReviewService.WithRawResponse =
            ReviewServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun reply(): ReplyService.WithRawResponse = reply

        private val listHandler: Handler<ReviewListResponse> =
            jsonHandler<ReviewListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ReviewListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReviewListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "inbox", "reviews")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
