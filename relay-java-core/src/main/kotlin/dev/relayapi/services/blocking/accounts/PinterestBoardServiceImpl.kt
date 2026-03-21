// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.accounts

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
import dev.relayapi.core.prepare
import dev.relayapi.models.accounts.pinterestboards.PinterestBoardRetrieveParams
import dev.relayapi.models.accounts.pinterestboards.PinterestBoardRetrieveResponse
import dev.relayapi.models.accounts.pinterestboards.PinterestBoardSetDefaultParams
import dev.relayapi.models.accounts.pinterestboards.PinterestBoardSetDefaultResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PinterestBoardServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PinterestBoardService {

    private val withRawResponse: PinterestBoardService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PinterestBoardService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PinterestBoardService =
        PinterestBoardServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: PinterestBoardRetrieveParams,
        requestOptions: RequestOptions,
    ): PinterestBoardRetrieveResponse =
        // get /v1/accounts/{id}/pinterest-boards
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun setDefault(
        params: PinterestBoardSetDefaultParams,
        requestOptions: RequestOptions,
    ): PinterestBoardSetDefaultResponse =
        // put /v1/accounts/{id}/pinterest-boards
        withRawResponse().setDefault(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PinterestBoardService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PinterestBoardService.WithRawResponse =
            PinterestBoardServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<PinterestBoardRetrieveResponse> =
            jsonHandler<PinterestBoardRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: PinterestBoardRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PinterestBoardRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "accounts", params._pathParam(0), "pinterest-boards")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val setDefaultHandler: Handler<PinterestBoardSetDefaultResponse> =
            jsonHandler<PinterestBoardSetDefaultResponse>(clientOptions.jsonMapper)

        override fun setDefault(
            params: PinterestBoardSetDefaultParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PinterestBoardSetDefaultResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "accounts", params._pathParam(0), "pinterest-boards")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
