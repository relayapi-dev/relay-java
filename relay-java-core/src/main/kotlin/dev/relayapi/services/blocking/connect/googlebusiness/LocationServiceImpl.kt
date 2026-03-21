// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.connect.googlebusiness

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
import dev.relayapi.models.connect.googlebusiness.locations.LocationListParams
import dev.relayapi.models.connect.googlebusiness.locations.LocationListResponse
import dev.relayapi.models.connect.googlebusiness.locations.LocationSelectParams
import dev.relayapi.models.connect.googlebusiness.locations.LocationSelectResponse
import java.util.function.Consumer

class LocationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LocationService {

    private val withRawResponse: LocationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LocationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LocationService =
        LocationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: LocationListParams,
        requestOptions: RequestOptions,
    ): LocationListResponse =
        // get /v1/connect/googlebusiness/locations
        withRawResponse().list(params, requestOptions).parse()

    override fun select(
        params: LocationSelectParams,
        requestOptions: RequestOptions,
    ): LocationSelectResponse =
        // post /v1/connect/googlebusiness/locations
        withRawResponse().select(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LocationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LocationService.WithRawResponse =
            LocationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<LocationListResponse> =
            jsonHandler<LocationListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: LocationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LocationListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "connect", "googlebusiness", "locations")
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

        private val selectHandler: Handler<LocationSelectResponse> =
            jsonHandler<LocationSelectResponse>(clientOptions.jsonMapper)

        override fun select(
            params: LocationSelectParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LocationSelectResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "connect", "googlebusiness", "locations")
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
