// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.whatsapp

import com.google.errorprone.annotations.MustBeClosed
import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponse
import dev.relayapi.core.http.HttpResponseFor
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

interface BroadcastService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BroadcastService

    /** Create a broadcast */
    fun create(params: BroadcastCreateParams): BroadcastCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BroadcastCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BroadcastCreateResponse

    /** Get broadcast details */
    fun retrieve(broadcastId: String): BroadcastRetrieveResponse =
        retrieve(broadcastId, BroadcastRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        broadcastId: String,
        params: BroadcastRetrieveParams = BroadcastRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BroadcastRetrieveResponse =
        retrieve(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        broadcastId: String,
        params: BroadcastRetrieveParams = BroadcastRetrieveParams.none(),
    ): BroadcastRetrieveResponse = retrieve(broadcastId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BroadcastRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BroadcastRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: BroadcastRetrieveParams): BroadcastRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(broadcastId: String, requestOptions: RequestOptions): BroadcastRetrieveResponse =
        retrieve(broadcastId, BroadcastRetrieveParams.none(), requestOptions)

    /** List broadcasts */
    fun list(params: BroadcastListParams): BroadcastListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: BroadcastListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BroadcastListResponse

    /** Delete a broadcast */
    fun delete(broadcastId: String) = delete(broadcastId, BroadcastDeleteParams.none())

    /** @see delete */
    fun delete(
        broadcastId: String,
        params: BroadcastDeleteParams = BroadcastDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see delete */
    fun delete(broadcastId: String, params: BroadcastDeleteParams = BroadcastDeleteParams.none()) =
        delete(broadcastId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: BroadcastDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: BroadcastDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(broadcastId: String, requestOptions: RequestOptions) =
        delete(broadcastId, BroadcastDeleteParams.none(), requestOptions)

    /** Schedule a broadcast */
    fun schedule(broadcastId: String): BroadcastScheduleResponse =
        schedule(broadcastId, BroadcastScheduleParams.none())

    /** @see schedule */
    fun schedule(
        broadcastId: String,
        params: BroadcastScheduleParams = BroadcastScheduleParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BroadcastScheduleResponse =
        schedule(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see schedule */
    fun schedule(
        broadcastId: String,
        params: BroadcastScheduleParams = BroadcastScheduleParams.none(),
    ): BroadcastScheduleResponse = schedule(broadcastId, params, RequestOptions.none())

    /** @see schedule */
    fun schedule(
        params: BroadcastScheduleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BroadcastScheduleResponse

    /** @see schedule */
    fun schedule(params: BroadcastScheduleParams): BroadcastScheduleResponse =
        schedule(params, RequestOptions.none())

    /** @see schedule */
    fun schedule(broadcastId: String, requestOptions: RequestOptions): BroadcastScheduleResponse =
        schedule(broadcastId, BroadcastScheduleParams.none(), requestOptions)

    /** Send a broadcast immediately */
    fun send(broadcastId: String): BroadcastSendResponse =
        send(broadcastId, BroadcastSendParams.none())

    /** @see send */
    fun send(
        broadcastId: String,
        params: BroadcastSendParams = BroadcastSendParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BroadcastSendResponse =
        send(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see send */
    fun send(
        broadcastId: String,
        params: BroadcastSendParams = BroadcastSendParams.none(),
    ): BroadcastSendResponse = send(broadcastId, params, RequestOptions.none())

    /** @see send */
    fun send(
        params: BroadcastSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BroadcastSendResponse

    /** @see send */
    fun send(params: BroadcastSendParams): BroadcastSendResponse =
        send(params, RequestOptions.none())

    /** @see send */
    fun send(broadcastId: String, requestOptions: RequestOptions): BroadcastSendResponse =
        send(broadcastId, BroadcastSendParams.none(), requestOptions)

    /** A view of [BroadcastService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BroadcastService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/whatsapp/broadcasts`, but is otherwise the same
         * as [BroadcastService.create].
         */
        @MustBeClosed
        fun create(params: BroadcastCreateParams): HttpResponseFor<BroadcastCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: BroadcastCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BroadcastCreateResponse>

        /**
         * Returns a raw HTTP response for `get /v1/whatsapp/broadcasts/{broadcast_id}`, but is
         * otherwise the same as [BroadcastService.retrieve].
         */
        @MustBeClosed
        fun retrieve(broadcastId: String): HttpResponseFor<BroadcastRetrieveResponse> =
            retrieve(broadcastId, BroadcastRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            broadcastId: String,
            params: BroadcastRetrieveParams = BroadcastRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BroadcastRetrieveResponse> =
            retrieve(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            broadcastId: String,
            params: BroadcastRetrieveParams = BroadcastRetrieveParams.none(),
        ): HttpResponseFor<BroadcastRetrieveResponse> =
            retrieve(broadcastId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BroadcastRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BroadcastRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: BroadcastRetrieveParams): HttpResponseFor<BroadcastRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            broadcastId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BroadcastRetrieveResponse> =
            retrieve(broadcastId, BroadcastRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/whatsapp/broadcasts`, but is otherwise the same
         * as [BroadcastService.list].
         */
        @MustBeClosed
        fun list(params: BroadcastListParams): HttpResponseFor<BroadcastListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: BroadcastListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BroadcastListResponse>

        /**
         * Returns a raw HTTP response for `delete /v1/whatsapp/broadcasts/{broadcast_id}`, but is
         * otherwise the same as [BroadcastService.delete].
         */
        @MustBeClosed
        fun delete(broadcastId: String): HttpResponse =
            delete(broadcastId, BroadcastDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            broadcastId: String,
            params: BroadcastDeleteParams = BroadcastDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            broadcastId: String,
            params: BroadcastDeleteParams = BroadcastDeleteParams.none(),
        ): HttpResponse = delete(broadcastId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: BroadcastDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: BroadcastDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(broadcastId: String, requestOptions: RequestOptions): HttpResponse =
            delete(broadcastId, BroadcastDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/whatsapp/broadcasts/{broadcast_id}/schedule`,
         * but is otherwise the same as [BroadcastService.schedule].
         */
        @MustBeClosed
        fun schedule(broadcastId: String): HttpResponseFor<BroadcastScheduleResponse> =
            schedule(broadcastId, BroadcastScheduleParams.none())

        /** @see schedule */
        @MustBeClosed
        fun schedule(
            broadcastId: String,
            params: BroadcastScheduleParams = BroadcastScheduleParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BroadcastScheduleResponse> =
            schedule(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see schedule */
        @MustBeClosed
        fun schedule(
            broadcastId: String,
            params: BroadcastScheduleParams = BroadcastScheduleParams.none(),
        ): HttpResponseFor<BroadcastScheduleResponse> =
            schedule(broadcastId, params, RequestOptions.none())

        /** @see schedule */
        @MustBeClosed
        fun schedule(
            params: BroadcastScheduleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BroadcastScheduleResponse>

        /** @see schedule */
        @MustBeClosed
        fun schedule(params: BroadcastScheduleParams): HttpResponseFor<BroadcastScheduleResponse> =
            schedule(params, RequestOptions.none())

        /** @see schedule */
        @MustBeClosed
        fun schedule(
            broadcastId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BroadcastScheduleResponse> =
            schedule(broadcastId, BroadcastScheduleParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/whatsapp/broadcasts/{broadcast_id}/send`, but
         * is otherwise the same as [BroadcastService.send].
         */
        @MustBeClosed
        fun send(broadcastId: String): HttpResponseFor<BroadcastSendResponse> =
            send(broadcastId, BroadcastSendParams.none())

        /** @see send */
        @MustBeClosed
        fun send(
            broadcastId: String,
            params: BroadcastSendParams = BroadcastSendParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BroadcastSendResponse> =
            send(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see send */
        @MustBeClosed
        fun send(
            broadcastId: String,
            params: BroadcastSendParams = BroadcastSendParams.none(),
        ): HttpResponseFor<BroadcastSendResponse> = send(broadcastId, params, RequestOptions.none())

        /** @see send */
        @MustBeClosed
        fun send(
            params: BroadcastSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BroadcastSendResponse>

        /** @see send */
        @MustBeClosed
        fun send(params: BroadcastSendParams): HttpResponseFor<BroadcastSendResponse> =
            send(params, RequestOptions.none())

        /** @see send */
        @MustBeClosed
        fun send(
            broadcastId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BroadcastSendResponse> =
            send(broadcastId, BroadcastSendParams.none(), requestOptions)
    }
}
