// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async

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
import dev.relayapi.core.http.parseable
import dev.relayapi.core.prepareAsync
import dev.relayapi.models.queue.QueueGetNextSlotParams
import dev.relayapi.models.queue.QueueGetNextSlotResponse
import dev.relayapi.models.queue.QueuePreviewParams
import dev.relayapi.models.queue.QueuePreviewResponse
import dev.relayapi.services.async.queue.SlotServiceAsync
import dev.relayapi.services.async.queue.SlotServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class QueueServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    QueueServiceAsync {

    private val withRawResponse: QueueServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val slots: SlotServiceAsync by lazy { SlotServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): QueueServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): QueueServiceAsync =
        QueueServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun slots(): SlotServiceAsync = slots

    override fun getNextSlot(
        params: QueueGetNextSlotParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<QueueGetNextSlotResponse> =
        // get /v1/queue/next-slot
        withRawResponse().getNextSlot(params, requestOptions).thenApply { it.parse() }

    override fun preview(
        params: QueuePreviewParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<QueuePreviewResponse> =
        // get /v1/queue/preview
        withRawResponse().preview(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        QueueServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val slots: SlotServiceAsync.WithRawResponse by lazy {
            SlotServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): QueueServiceAsync.WithRawResponse =
            QueueServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun slots(): SlotServiceAsync.WithRawResponse = slots

        private val getNextSlotHandler: Handler<QueueGetNextSlotResponse> =
            jsonHandler<QueueGetNextSlotResponse>(clientOptions.jsonMapper)

        override fun getNextSlot(
            params: QueueGetNextSlotParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<QueueGetNextSlotResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "queue", "next-slot")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getNextSlotHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val previewHandler: Handler<QueuePreviewResponse> =
            jsonHandler<QueuePreviewResponse>(clientOptions.jsonMapper)

        override fun preview(
            params: QueuePreviewParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<QueuePreviewResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "queue", "preview")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { previewHandler.handle(it) }
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
