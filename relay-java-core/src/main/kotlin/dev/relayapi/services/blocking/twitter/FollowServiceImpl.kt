// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.twitter

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
import dev.relayapi.core.prepare
import dev.relayapi.models.twitter.follow.FollowCreateParams
import dev.relayapi.models.twitter.follow.FollowCreateResponse
import dev.relayapi.models.twitter.follow.FollowUnfollowParams
import dev.relayapi.models.twitter.follow.FollowUnfollowResponse
import java.util.function.Consumer

class FollowServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    FollowService {

    private val withRawResponse: FollowService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FollowService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FollowService =
        FollowServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: FollowCreateParams,
        requestOptions: RequestOptions,
    ): FollowCreateResponse =
        // post /v1/twitter/follow
        withRawResponse().create(params, requestOptions).parse()

    override fun unfollow(
        params: FollowUnfollowParams,
        requestOptions: RequestOptions,
    ): FollowUnfollowResponse =
        // delete /v1/twitter/follow
        withRawResponse().unfollow(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FollowService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FollowService.WithRawResponse =
            FollowServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<FollowCreateResponse> =
            jsonHandler<FollowCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: FollowCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FollowCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "twitter", "follow")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val unfollowHandler: Handler<FollowUnfollowResponse> =
            jsonHandler<FollowUnfollowResponse>(clientOptions.jsonMapper)

        override fun unfollow(
            params: FollowUnfollowParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FollowUnfollowResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "twitter", "follow")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
