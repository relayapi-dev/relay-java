// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.queue

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.handlers.emptyHandler
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
import dev.relayapi.models.queue.slots.SlotCreateParams
import dev.relayapi.models.queue.slots.SlotCreateResponse
import dev.relayapi.models.queue.slots.SlotDeleteParams
import dev.relayapi.models.queue.slots.SlotListParams
import dev.relayapi.models.queue.slots.SlotListResponse
import dev.relayapi.models.queue.slots.SlotUpdateParams
import dev.relayapi.models.queue.slots.SlotUpdateResponse
import java.util.function.Consumer

class SlotServiceImpl internal constructor(private val clientOptions: ClientOptions) : SlotService {

    private val withRawResponse: SlotService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SlotService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SlotService =
        SlotServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: SlotCreateParams,
        requestOptions: RequestOptions,
    ): SlotCreateResponse =
        // post /v1/queue/slots
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: SlotUpdateParams,
        requestOptions: RequestOptions,
    ): SlotUpdateResponse =
        // put /v1/queue/slots
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: SlotListParams, requestOptions: RequestOptions): SlotListResponse =
        // get /v1/queue/slots
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: SlotDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/queue/slots
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SlotService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SlotService.WithRawResponse =
            SlotServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<SlotCreateResponse> =
            jsonHandler<SlotCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: SlotCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SlotCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "queue", "slots")
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

        private val updateHandler: Handler<SlotUpdateResponse> =
            jsonHandler<SlotUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: SlotUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SlotUpdateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "queue", "slots")
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

        private val listHandler: Handler<SlotListResponse> =
            jsonHandler<SlotListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SlotListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SlotListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "queue", "slots")
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: SlotDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "queue", "slots")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }
    }
}
