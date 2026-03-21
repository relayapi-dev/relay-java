// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.connect.facebook

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
import dev.relayapi.models.connect.facebook.pages.PageListParams
import dev.relayapi.models.connect.facebook.pages.PageListResponse
import dev.relayapi.models.connect.facebook.pages.PageSelectParams
import dev.relayapi.models.connect.facebook.pages.PageSelectResponse
import java.util.function.Consumer

class PageServiceImpl internal constructor(private val clientOptions: ClientOptions) : PageService {

    private val withRawResponse: PageService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PageService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PageService =
        PageServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(params: PageListParams, requestOptions: RequestOptions): PageListResponse =
        // get /v1/connect/facebook/pages
        withRawResponse().list(params, requestOptions).parse()

    override fun select(
        params: PageSelectParams,
        requestOptions: RequestOptions,
    ): PageSelectResponse =
        // post /v1/connect/facebook/pages
        withRawResponse().select(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PageService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PageService.WithRawResponse =
            PageServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<PageListResponse> =
            jsonHandler<PageListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PageListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PageListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "connect", "facebook", "pages")
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

        private val selectHandler: Handler<PageSelectResponse> =
            jsonHandler<PageSelectResponse>(clientOptions.jsonMapper)

        override fun select(
            params: PageSelectParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PageSelectResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "connect", "facebook", "pages")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { selectHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
