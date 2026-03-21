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
import dev.relayapi.models.twitter.bookmark.BookmarkCreateParams
import dev.relayapi.models.twitter.bookmark.BookmarkCreateResponse
import dev.relayapi.models.twitter.bookmark.BookmarkRemoveParams
import dev.relayapi.models.twitter.bookmark.BookmarkRemoveResponse
import java.util.function.Consumer

class BookmarkServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BookmarkService {

    private val withRawResponse: BookmarkService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BookmarkService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BookmarkService =
        BookmarkServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: BookmarkCreateParams,
        requestOptions: RequestOptions,
    ): BookmarkCreateResponse =
        // post /v1/twitter/bookmark
        withRawResponse().create(params, requestOptions).parse()

    override fun remove(
        params: BookmarkRemoveParams,
        requestOptions: RequestOptions,
    ): BookmarkRemoveResponse =
        // delete /v1/twitter/bookmark
        withRawResponse().remove(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BookmarkService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BookmarkService.WithRawResponse =
            BookmarkServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<BookmarkCreateResponse> =
            jsonHandler<BookmarkCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: BookmarkCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BookmarkCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "twitter", "bookmark")
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

        private val removeHandler: Handler<BookmarkRemoveResponse> =
            jsonHandler<BookmarkRemoveResponse>(clientOptions.jsonMapper)

        override fun remove(
            params: BookmarkRemoveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BookmarkRemoveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "twitter", "bookmark")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { removeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
