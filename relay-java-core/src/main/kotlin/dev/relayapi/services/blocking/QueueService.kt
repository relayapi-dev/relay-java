// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.queue.QueueGetNextSlotParams
import dev.relayapi.models.queue.QueueGetNextSlotResponse
import dev.relayapi.models.queue.QueuePreviewParams
import dev.relayapi.models.queue.QueuePreviewResponse
import dev.relayapi.services.blocking.queue.SlotService
import java.util.function.Consumer

interface QueueService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): QueueService

    fun slots(): SlotService

    /** Get next available queue slot */
    fun getNextSlot(): QueueGetNextSlotResponse = getNextSlot(QueueGetNextSlotParams.none())

    /** @see getNextSlot */
    fun getNextSlot(
        params: QueueGetNextSlotParams = QueueGetNextSlotParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): QueueGetNextSlotResponse

    /** @see getNextSlot */
    fun getNextSlot(
        params: QueueGetNextSlotParams = QueueGetNextSlotParams.none()
    ): QueueGetNextSlotResponse = getNextSlot(params, RequestOptions.none())

    /** @see getNextSlot */
    fun getNextSlot(requestOptions: RequestOptions): QueueGetNextSlotResponse =
        getNextSlot(QueueGetNextSlotParams.none(), requestOptions)

    /** Preview upcoming queue slots */
    fun preview(): QueuePreviewResponse = preview(QueuePreviewParams.none())

    /** @see preview */
    fun preview(
        params: QueuePreviewParams = QueuePreviewParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): QueuePreviewResponse

    /** @see preview */
    fun preview(params: QueuePreviewParams = QueuePreviewParams.none()): QueuePreviewResponse =
        preview(params, RequestOptions.none())

    /** @see preview */
    fun preview(requestOptions: RequestOptions): QueuePreviewResponse =
        preview(QueuePreviewParams.none(), requestOptions)

    /** A view of [QueueService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): QueueService.WithRawResponse

        fun slots(): SlotService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/queue/next-slot`, but is otherwise the same as
         * [QueueService.getNextSlot].
         */
        @MustBeClosed
        fun getNextSlot(): HttpResponseFor<QueueGetNextSlotResponse> =
            getNextSlot(QueueGetNextSlotParams.none())

        /** @see getNextSlot */
        @MustBeClosed
        fun getNextSlot(
            params: QueueGetNextSlotParams = QueueGetNextSlotParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<QueueGetNextSlotResponse>

        /** @see getNextSlot */
        @MustBeClosed
        fun getNextSlot(
            params: QueueGetNextSlotParams = QueueGetNextSlotParams.none()
        ): HttpResponseFor<QueueGetNextSlotResponse> = getNextSlot(params, RequestOptions.none())

        /** @see getNextSlot */
        @MustBeClosed
        fun getNextSlot(requestOptions: RequestOptions): HttpResponseFor<QueueGetNextSlotResponse> =
            getNextSlot(QueueGetNextSlotParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/queue/preview`, but is otherwise the same as
         * [QueueService.preview].
         */
        @MustBeClosed
        fun preview(): HttpResponseFor<QueuePreviewResponse> = preview(QueuePreviewParams.none())

        /** @see preview */
        @MustBeClosed
        fun preview(
            params: QueuePreviewParams = QueuePreviewParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<QueuePreviewResponse>

        /** @see preview */
        @MustBeClosed
        fun preview(
            params: QueuePreviewParams = QueuePreviewParams.none()
        ): HttpResponseFor<QueuePreviewResponse> = preview(params, RequestOptions.none())

        /** @see preview */
        @MustBeClosed
        fun preview(requestOptions: RequestOptions): HttpResponseFor<QueuePreviewResponse> =
            preview(QueuePreviewParams.none(), requestOptions)
    }
}
