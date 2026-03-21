// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.connect.pinterest

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
import dev.relayapi.core.prepareAsync
import dev.relayapi.models.connect.pinterest.boards.BoardListParams
import dev.relayapi.models.connect.pinterest.boards.BoardListResponse
import dev.relayapi.models.connect.pinterest.boards.BoardSelectParams
import dev.relayapi.models.connect.pinterest.boards.BoardSelectResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class BoardServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BoardServiceAsync {

    private val withRawResponse: BoardServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BoardServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BoardServiceAsync =
        BoardServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: BoardListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BoardListResponse> =
        // get /v1/connect/pinterest/boards
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun select(
        params: BoardSelectParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BoardSelectResponse> =
        // post /v1/connect/pinterest/boards
        withRawResponse().select(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BoardServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BoardServiceAsync.WithRawResponse =
            BoardServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<BoardListResponse> =
            jsonHandler<BoardListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: BoardListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BoardListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "connect", "pinterest", "boards")
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

        private val selectHandler: Handler<BoardSelectResponse> =
            jsonHandler<BoardSelectResponse>(clientOptions.jsonMapper)

        override fun select(
            params: BoardSelectParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BoardSelectResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "connect", "pinterest", "boards")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
