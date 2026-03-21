// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.connect.pinterest

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
import dev.relayapi.models.connect.pinterest.boards.BoardListParams
import dev.relayapi.models.connect.pinterest.boards.BoardListResponse
import dev.relayapi.models.connect.pinterest.boards.BoardSelectParams
import dev.relayapi.models.connect.pinterest.boards.BoardSelectResponse
import java.util.function.Consumer

class BoardServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BoardService {

    private val withRawResponse: BoardService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BoardService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BoardService =
        BoardServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(params: BoardListParams, requestOptions: RequestOptions): BoardListResponse =
        // get /v1/connect/pinterest/boards
        withRawResponse().list(params, requestOptions).parse()

    override fun select(
        params: BoardSelectParams,
        requestOptions: RequestOptions,
    ): BoardSelectResponse =
        // post /v1/connect/pinterest/boards
        withRawResponse().select(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BoardService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BoardService.WithRawResponse =
            BoardServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<BoardListResponse> =
            jsonHandler<BoardListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: BoardListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BoardListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "connect", "pinterest", "boards")
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

        private val selectHandler: Handler<BoardSelectResponse> =
            jsonHandler<BoardSelectResponse>(clientOptions.jsonMapper)

        override fun select(
            params: BoardSelectParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BoardSelectResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "connect", "pinterest", "boards")
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
