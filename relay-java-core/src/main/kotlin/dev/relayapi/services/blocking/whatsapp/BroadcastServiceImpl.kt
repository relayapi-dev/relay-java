// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.whatsapp

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.checkRequired
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
import dev.relayapi.models.whatsapp.broadcasts.BroadcastCreateParams
import dev.relayapi.models.whatsapp.broadcasts.BroadcastCreateResponse
import dev.relayapi.models.whatsapp.broadcasts.BroadcastDeleteParams
import dev.relayapi.models.whatsapp.broadcasts.BroadcastListParams
import dev.relayapi.models.whatsapp.broadcasts.BroadcastListResponse
import dev.relayapi.models.whatsapp.broadcasts.BroadcastRetrieveParams
import dev.relayapi.models.whatsapp.broadcasts.BroadcastRetrieveResponse
import dev.relayapi.models.whatsapp.broadcasts.BroadcastScheduleParams
import dev.relayapi.models.whatsapp.broadcasts.BroadcastScheduleResponse
import dev.relayapi.models.whatsapp.broadcasts.BroadcastSendParams
import dev.relayapi.models.whatsapp.broadcasts.BroadcastSendResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class BroadcastServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BroadcastService {

    private val withRawResponse: BroadcastService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BroadcastService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BroadcastService =
        BroadcastServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    @Deprecated("deprecated")
    override fun create(
        params: BroadcastCreateParams,
        requestOptions: RequestOptions,
    ): BroadcastCreateResponse =
        // post /v1/whatsapp/broadcasts
        withRawResponse().create(params, requestOptions).parse()

    @Deprecated("deprecated")
    override fun retrieve(
        params: BroadcastRetrieveParams,
        requestOptions: RequestOptions,
    ): BroadcastRetrieveResponse =
        // get /v1/whatsapp/broadcasts/{broadcast_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    @Deprecated("deprecated")
    override fun list(
        params: BroadcastListParams,
        requestOptions: RequestOptions,
    ): BroadcastListResponse =
        // get /v1/whatsapp/broadcasts
        withRawResponse().list(params, requestOptions).parse()

    @Deprecated("deprecated")
    override fun delete(params: BroadcastDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/whatsapp/broadcasts/{broadcast_id}
        withRawResponse().delete(params, requestOptions)
    }

    @Deprecated("deprecated")
    override fun schedule(
        params: BroadcastScheduleParams,
        requestOptions: RequestOptions,
    ): BroadcastScheduleResponse =
        // post /v1/whatsapp/broadcasts/{broadcast_id}/schedule
        withRawResponse().schedule(params, requestOptions).parse()

    @Deprecated("deprecated")
    override fun send(
        params: BroadcastSendParams,
        requestOptions: RequestOptions,
    ): BroadcastSendResponse =
        // post /v1/whatsapp/broadcasts/{broadcast_id}/send
        withRawResponse().send(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BroadcastService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BroadcastService.WithRawResponse =
            BroadcastServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<BroadcastCreateResponse> =
            jsonHandler<BroadcastCreateResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun create(
            params: BroadcastCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BroadcastCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "whatsapp", "broadcasts")
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

        private val retrieveHandler: Handler<BroadcastRetrieveResponse> =
            jsonHandler<BroadcastRetrieveResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun retrieve(
            params: BroadcastRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BroadcastRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("broadcastId", params.broadcastId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "whatsapp", "broadcasts", params._pathParam(0))
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

        private val listHandler: Handler<BroadcastListResponse> =
            jsonHandler<BroadcastListResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun list(
            params: BroadcastListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BroadcastListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "whatsapp", "broadcasts")
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

        @Deprecated("deprecated")
        override fun delete(
            params: BroadcastDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("broadcastId", params.broadcastId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "whatsapp", "broadcasts", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val scheduleHandler: Handler<BroadcastScheduleResponse> =
            jsonHandler<BroadcastScheduleResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun schedule(
            params: BroadcastScheduleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BroadcastScheduleResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("broadcastId", params.broadcastId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "whatsapp",
                        "broadcasts",
                        params._pathParam(0),
                        "schedule",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { scheduleHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val sendHandler: Handler<BroadcastSendResponse> =
            jsonHandler<BroadcastSendResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun send(
            params: BroadcastSendParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BroadcastSendResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("broadcastId", params.broadcastId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "whatsapp", "broadcasts", params._pathParam(0), "send")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { sendHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
