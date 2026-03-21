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
import dev.relayapi.models.accounts.gmblocations.GmbLocationRetrieveParams
import dev.relayapi.models.accounts.gmblocations.GmbLocationRetrieveResponse
import dev.relayapi.models.accounts.gmblocations.GmbLocationSetDefaultParams
import dev.relayapi.models.accounts.gmblocations.GmbLocationSetDefaultResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class GmbLocationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    GmbLocationService {

    private val withRawResponse: GmbLocationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): GmbLocationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GmbLocationService =
        GmbLocationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: GmbLocationRetrieveParams,
        requestOptions: RequestOptions,
    ): GmbLocationRetrieveResponse =
        // get /v1/accounts/{id}/gmb-locations
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun setDefault(
        params: GmbLocationSetDefaultParams,
        requestOptions: RequestOptions,
    ): GmbLocationSetDefaultResponse =
        // put /v1/accounts/{id}/gmb-locations
        withRawResponse().setDefault(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GmbLocationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GmbLocationService.WithRawResponse =
            GmbLocationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<GmbLocationRetrieveResponse> =
            jsonHandler<GmbLocationRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: GmbLocationRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GmbLocationRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "accounts", params._pathParam(0), "gmb-locations")
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

        private val setDefaultHandler: Handler<GmbLocationSetDefaultResponse> =
            jsonHandler<GmbLocationSetDefaultResponse>(clientOptions.jsonMapper)

        override fun setDefault(
            params: GmbLocationSetDefaultParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GmbLocationSetDefaultResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "accounts", params._pathParam(0), "gmb-locations")
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
