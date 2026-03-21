// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking

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
import dev.relayapi.core.prepare
import dev.relayapi.models.queue.QueueGetNextSlotParams
import dev.relayapi.models.queue.QueueGetNextSlotResponse
import dev.relayapi.models.queue.QueuePreviewParams
import dev.relayapi.models.queue.QueuePreviewResponse
import dev.relayapi.services.blocking.queue.SlotService
import dev.relayapi.services.blocking.queue.SlotServiceImpl
import java.util.function.Consumer

class QueueServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    QueueService {

    private val withRawResponse: QueueService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val slots: SlotService by lazy { SlotServiceImpl(clientOptions) }

    override fun withRawResponse(): QueueService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): QueueService =
        QueueServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun slots(): SlotService = slots

    override fun getNextSlot(
        params: QueueGetNextSlotParams,
        requestOptions: RequestOptions,
    ): QueueGetNextSlotResponse =
        // get /v1/queue/next-slot
        withRawResponse().getNextSlot(params, requestOptions).parse()

    override fun preview(
        params: QueuePreviewParams,
        requestOptions: RequestOptions,
    ): QueuePreviewResponse =
        // get /v1/queue/preview
        withRawResponse().preview(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        QueueService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val slots: SlotService.WithRawResponse by lazy {
            SlotServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): QueueService.WithRawResponse =
            QueueServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun slots(): SlotService.WithRawResponse = slots

        private val getNextSlotHandler: Handler<QueueGetNextSlotResponse> =
            jsonHandler<QueueGetNextSlotResponse>(clientOptions.jsonMapper)

        override fun getNextSlot(
            params: QueueGetNextSlotParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<QueueGetNextSlotResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "queue", "next-slot")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getNextSlotHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val previewHandler: Handler<QueuePreviewResponse> =
            jsonHandler<QueuePreviewResponse>(clientOptions.jsonMapper)

        override fun preview(
            params: QueuePreviewParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<QueuePreviewResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "queue", "preview")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
