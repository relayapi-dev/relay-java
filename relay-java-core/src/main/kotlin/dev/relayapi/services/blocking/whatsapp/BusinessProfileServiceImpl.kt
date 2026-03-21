// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.whatsapp

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
import dev.relayapi.models.whatsapp.businessprofile.BusinessProfileRetrieveParams
import dev.relayapi.models.whatsapp.businessprofile.BusinessProfileRetrieveResponse
import dev.relayapi.models.whatsapp.businessprofile.BusinessProfileUpdateParams
import dev.relayapi.models.whatsapp.businessprofile.BusinessProfileUpdateResponse
import java.util.function.Consumer

class BusinessProfileServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BusinessProfileService {

    private val withRawResponse: BusinessProfileService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BusinessProfileService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BusinessProfileService =
        BusinessProfileServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: BusinessProfileRetrieveParams,
        requestOptions: RequestOptions,
    ): BusinessProfileRetrieveResponse =
        // get /v1/whatsapp/business-profile
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: BusinessProfileUpdateParams,
        requestOptions: RequestOptions,
    ): BusinessProfileUpdateResponse =
        // put /v1/whatsapp/business-profile
        withRawResponse().update(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BusinessProfileService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BusinessProfileService.WithRawResponse =
            BusinessProfileServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<BusinessProfileRetrieveResponse> =
            jsonHandler<BusinessProfileRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: BusinessProfileRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BusinessProfileRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "whatsapp", "business-profile")
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

        private val updateHandler: Handler<BusinessProfileUpdateResponse> =
            jsonHandler<BusinessProfileUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: BusinessProfileUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BusinessProfileUpdateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "whatsapp", "business-profile")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
