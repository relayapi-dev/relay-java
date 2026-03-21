// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.accounts

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.checkRequired
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
import dev.relayapi.models.accounts.redditsubreddits.RedditSubredditRetrieveParams
import dev.relayapi.models.accounts.redditsubreddits.RedditSubredditRetrieveResponse
import dev.relayapi.models.accounts.redditsubreddits.RedditSubredditSetDefaultParams
import dev.relayapi.models.accounts.redditsubreddits.RedditSubredditSetDefaultResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RedditSubredditServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : RedditSubredditServiceAsync {

    private val withRawResponse: RedditSubredditServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RedditSubredditServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): RedditSubredditServiceAsync =
        RedditSubredditServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: RedditSubredditRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RedditSubredditRetrieveResponse> =
        // get /v1/accounts/{id}/reddit-subreddits
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun setDefault(
        params: RedditSubredditSetDefaultParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RedditSubredditSetDefaultResponse> =
        // put /v1/accounts/{id}/reddit-subreddits
        withRawResponse().setDefault(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RedditSubredditServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RedditSubredditServiceAsync.WithRawResponse =
            RedditSubredditServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<RedditSubredditRetrieveResponse> =
            jsonHandler<RedditSubredditRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: RedditSubredditRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RedditSubredditRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "accounts", params._pathParam(0), "reddit-subreddits")
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

        private val setDefaultHandler: Handler<RedditSubredditSetDefaultResponse> =
            jsonHandler<RedditSubredditSetDefaultResponse>(clientOptions.jsonMapper)

        override fun setDefault(
            params: RedditSubredditSetDefaultParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RedditSubredditSetDefaultResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "accounts", params._pathParam(0), "reddit-subreddits")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { setDefaultHandler.handle(it) }
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
