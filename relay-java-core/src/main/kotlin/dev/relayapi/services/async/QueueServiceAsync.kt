// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.queue.QueueGetNextSlotParams
import dev.relayapi.models.queue.QueueGetNextSlotResponse
import dev.relayapi.models.queue.QueuePreviewParams
import dev.relayapi.models.queue.QueuePreviewResponse
import dev.relayapi.services.async.queue.SlotServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface QueueServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): QueueServiceAsync

    fun slots(): SlotServiceAsync

    /** Get next available queue slot */
    fun getNextSlot(): CompletableFuture<QueueGetNextSlotResponse> =
        getNextSlot(QueueGetNextSlotParams.none())

    /** @see getNextSlot */
    fun getNextSlot(
        params: QueueGetNextSlotParams = QueueGetNextSlotParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<QueueGetNextSlotResponse>

    /** @see getNextSlot */
    fun getNextSlot(
        params: QueueGetNextSlotParams = QueueGetNextSlotParams.none()
    ): CompletableFuture<QueueGetNextSlotResponse> = getNextSlot(params, RequestOptions.none())

    /** @see getNextSlot */
    fun getNextSlot(requestOptions: RequestOptions): CompletableFuture<QueueGetNextSlotResponse> =
        getNextSlot(QueueGetNextSlotParams.none(), requestOptions)

    /** Preview upcoming queue slots */
    fun preview(): CompletableFuture<QueuePreviewResponse> = preview(QueuePreviewParams.none())

    /** @see preview */
    fun preview(
        params: QueuePreviewParams = QueuePreviewParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<QueuePreviewResponse>

    /** @see preview */
    fun preview(
        params: QueuePreviewParams = QueuePreviewParams.none()
    ): CompletableFuture<QueuePreviewResponse> = preview(params, RequestOptions.none())

    /** @see preview */
    fun preview(requestOptions: RequestOptions): CompletableFuture<QueuePreviewResponse> =
        preview(QueuePreviewParams.none(), requestOptions)

    /** A view of [QueueServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): QueueServiceAsync.WithRawResponse

        fun slots(): SlotServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/queue/next-slot`, but is otherwise the same as
         * [QueueServiceAsync.getNextSlot].
         */
        fun getNextSlot(): CompletableFuture<HttpResponseFor<QueueGetNextSlotResponse>> =
            getNextSlot(QueueGetNextSlotParams.none())

        /** @see getNextSlot */
        fun getNextSlot(
            params: QueueGetNextSlotParams = QueueGetNextSlotParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<QueueGetNextSlotResponse>>

        /** @see getNextSlot */
        fun getNextSlot(
            params: QueueGetNextSlotParams = QueueGetNextSlotParams.none()
        ): CompletableFuture<HttpResponseFor<QueueGetNextSlotResponse>> =
            getNextSlot(params, RequestOptions.none())

        /** @see getNextSlot */
        fun getNextSlot(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<QueueGetNextSlotResponse>> =
            getNextSlot(QueueGetNextSlotParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/queue/preview`, but is otherwise the same as
         * [QueueServiceAsync.preview].
         */
        fun preview(): CompletableFuture<HttpResponseFor<QueuePreviewResponse>> =
            preview(QueuePreviewParams.none())

        /** @see preview */
        fun preview(
            params: QueuePreviewParams = QueuePreviewParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<QueuePreviewResponse>>

        /** @see preview */
        fun preview(
            params: QueuePreviewParams = QueuePreviewParams.none()
        ): CompletableFuture<HttpResponseFor<QueuePreviewResponse>> =
            preview(params, RequestOptions.none())

        /** @see preview */
        fun preview(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<QueuePreviewResponse>> =
            preview(QueuePreviewParams.none(), requestOptions)
    }
}
