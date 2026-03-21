// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.queue

import com.google.errorprone.annotations.MustBeClosed
import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponse
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.queue.slots.SlotCreateParams
import dev.relayapi.models.queue.slots.SlotCreateResponse
import dev.relayapi.models.queue.slots.SlotDeleteParams
import dev.relayapi.models.queue.slots.SlotListParams
import dev.relayapi.models.queue.slots.SlotListResponse
import dev.relayapi.models.queue.slots.SlotUpdateParams
import dev.relayapi.models.queue.slots.SlotUpdateResponse
import java.util.function.Consumer

interface SlotService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SlotService

    /** Create a queue schedule */
    fun create(params: SlotCreateParams): SlotCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SlotCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SlotCreateResponse

    /** Update queue schedule */
    fun update(): SlotUpdateResponse = update(SlotUpdateParams.none())

    /** @see update */
    fun update(
        params: SlotUpdateParams = SlotUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SlotUpdateResponse

    /** @see update */
    fun update(params: SlotUpdateParams = SlotUpdateParams.none()): SlotUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(requestOptions: RequestOptions): SlotUpdateResponse =
        update(SlotUpdateParams.none(), requestOptions)

    /** List queue schedules */
    fun list(): SlotListResponse = list(SlotListParams.none())

    /** @see list */
    fun list(
        params: SlotListParams = SlotListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SlotListResponse

    /** @see list */
    fun list(params: SlotListParams = SlotListParams.none()): SlotListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): SlotListResponse =
        list(SlotListParams.none(), requestOptions)

    /** Delete queue schedule */
    fun delete() = delete(SlotDeleteParams.none())

    /** @see delete */
    fun delete(
        params: SlotDeleteParams = SlotDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: SlotDeleteParams = SlotDeleteParams.none()) =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(requestOptions: RequestOptions) = delete(SlotDeleteParams.none(), requestOptions)

    /** A view of [SlotService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SlotService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/queue/slots`, but is otherwise the same as
         * [SlotService.create].
         */
        @MustBeClosed
        fun create(params: SlotCreateParams): HttpResponseFor<SlotCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SlotCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SlotCreateResponse>

        /**
         * Returns a raw HTTP response for `put /v1/queue/slots`, but is otherwise the same as
         * [SlotService.update].
         */
        @MustBeClosed
        fun update(): HttpResponseFor<SlotUpdateResponse> = update(SlotUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: SlotUpdateParams = SlotUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SlotUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(
            params: SlotUpdateParams = SlotUpdateParams.none()
        ): HttpResponseFor<SlotUpdateResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(requestOptions: RequestOptions): HttpResponseFor<SlotUpdateResponse> =
            update(SlotUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/queue/slots`, but is otherwise the same as
         * [SlotService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<SlotListResponse> = list(SlotListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SlotListParams = SlotListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SlotListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SlotListParams = SlotListParams.none()
        ): HttpResponseFor<SlotListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SlotListResponse> =
            list(SlotListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/queue/slots`, but is otherwise the same as
         * [SlotService.delete].
         */
        @MustBeClosed fun delete(): HttpResponse = delete(SlotDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SlotDeleteParams = SlotDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: SlotDeleteParams = SlotDeleteParams.none()): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(requestOptions: RequestOptions): HttpResponse =
            delete(SlotDeleteParams.none(), requestOptions)
    }
}
