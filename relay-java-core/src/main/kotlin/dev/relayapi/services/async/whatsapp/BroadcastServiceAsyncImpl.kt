// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.whatsapp

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
import dev.relayapi.core.prepareAsync
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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class BroadcastServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BroadcastServiceAsync {

    private val withRawResponse: BroadcastServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BroadcastServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BroadcastServiceAsync =
        BroadcastServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: BroadcastCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BroadcastCreateResponse> =
        // post /v1/whatsapp/broadcasts
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: BroadcastRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BroadcastRetrieveResponse> =
        // get /v1/whatsapp/broadcasts/{broadcast_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: BroadcastListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BroadcastListResponse> =
        // get /v1/whatsapp/broadcasts
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: BroadcastDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /v1/whatsapp/broadcasts/{broadcast_id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun schedule(
        params: BroadcastScheduleParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BroadcastScheduleResponse> =
        // post /v1/whatsapp/broadcasts/{broadcast_id}/schedule
        withRawResponse().schedule(params, requestOptions).thenApply { it.parse() }

    override fun send(
        params: BroadcastSendParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BroadcastSendResponse> =
        // post /v1/whatsapp/broadcasts/{broadcast_id}/send
        withRawResponse().send(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BroadcastServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BroadcastServiceAsync.WithRawResponse =
            BroadcastServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<BroadcastCreateResponse> =
            jsonHandler<BroadcastCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: BroadcastCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BroadcastCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "whatsapp", "broadcasts")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<BroadcastRetrieveResponse> =
            jsonHandler<BroadcastRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: BroadcastRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BroadcastRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("broadcastId", params.broadcastId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "whatsapp", "broadcasts", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<BroadcastListResponse> =
            jsonHandler<BroadcastListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: BroadcastListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BroadcastListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "whatsapp", "broadcasts")
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: BroadcastDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        private val scheduleHandler: Handler<BroadcastScheduleResponse> =
            jsonHandler<BroadcastScheduleResponse>(clientOptions.jsonMapper)

        override fun schedule(
            params: BroadcastScheduleParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BroadcastScheduleResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { scheduleHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val sendHandler: Handler<BroadcastSendResponse> =
            jsonHandler<BroadcastSendResponse>(clientOptions.jsonMapper)

        override fun send(
            params: BroadcastSendParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BroadcastSendResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
