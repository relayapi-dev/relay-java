// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.whatsapp

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BroadcastServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BroadcastServiceAsync

    /** Deprecated. Use POST /v1/broadcasts instead. */
    @Deprecated("deprecated")
    fun create(params: BroadcastCreateParams): CompletableFuture<BroadcastCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    @Deprecated("deprecated")
    fun create(
        params: BroadcastCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BroadcastCreateResponse>

    /** Deprecated. Use GET /v1/broadcasts/{id} instead. */
    @Deprecated("deprecated")
    fun retrieve(broadcastId: String): CompletableFuture<BroadcastRetrieveResponse> =
        retrieve(broadcastId, BroadcastRetrieveParams.none())

    /** @see retrieve */
    @Deprecated("deprecated")
    fun retrieve(
        broadcastId: String,
        params: BroadcastRetrieveParams = BroadcastRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BroadcastRetrieveResponse> =
        retrieve(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see retrieve */
    @Deprecated("deprecated")
    fun retrieve(
        broadcastId: String,
        params: BroadcastRetrieveParams = BroadcastRetrieveParams.none(),
    ): CompletableFuture<BroadcastRetrieveResponse> =
        retrieve(broadcastId, params, RequestOptions.none())

    /** @see retrieve */
    @Deprecated("deprecated")
    fun retrieve(
        params: BroadcastRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BroadcastRetrieveResponse>

    /** @see retrieve */
    @Deprecated("deprecated")
    fun retrieve(params: BroadcastRetrieveParams): CompletableFuture<BroadcastRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    @Deprecated("deprecated")
    fun retrieve(
        broadcastId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BroadcastRetrieveResponse> =
        retrieve(broadcastId, BroadcastRetrieveParams.none(), requestOptions)

    /** Deprecated. Use GET /v1/broadcasts instead. */
    @Deprecated("deprecated")
    fun list(params: BroadcastListParams): CompletableFuture<BroadcastListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    @Deprecated("deprecated")
    fun list(
        params: BroadcastListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BroadcastListResponse>

    /** Deprecated. Use DELETE /v1/broadcasts/{id} instead. */
    @Deprecated("deprecated")
    fun delete(broadcastId: String): CompletableFuture<Void?> =
        delete(broadcastId, BroadcastDeleteParams.none())

    /** @see delete */
    @Deprecated("deprecated")
    fun delete(
        broadcastId: String,
        params: BroadcastDeleteParams = BroadcastDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see delete */
    @Deprecated("deprecated")
    fun delete(
        broadcastId: String,
        params: BroadcastDeleteParams = BroadcastDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(broadcastId, params, RequestOptions.none())

    /** @see delete */
    @Deprecated("deprecated")
    fun delete(
        params: BroadcastDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    @Deprecated("deprecated")
    fun delete(params: BroadcastDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    @Deprecated("deprecated")
    fun delete(broadcastId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(broadcastId, BroadcastDeleteParams.none(), requestOptions)

    /** Deprecated. Use POST /v1/broadcasts/{id}/schedule instead. */
    @Deprecated("deprecated")
    fun schedule(broadcastId: String): CompletableFuture<BroadcastScheduleResponse> =
        schedule(broadcastId, BroadcastScheduleParams.none())

    /** @see schedule */
    @Deprecated("deprecated")
    fun schedule(
        broadcastId: String,
        params: BroadcastScheduleParams = BroadcastScheduleParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BroadcastScheduleResponse> =
        schedule(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see schedule */
    @Deprecated("deprecated")
    fun schedule(
        broadcastId: String,
        params: BroadcastScheduleParams = BroadcastScheduleParams.none(),
    ): CompletableFuture<BroadcastScheduleResponse> =
        schedule(broadcastId, params, RequestOptions.none())

    /** @see schedule */
    @Deprecated("deprecated")
    fun schedule(
        params: BroadcastScheduleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BroadcastScheduleResponse>

    /** @see schedule */
    @Deprecated("deprecated")
    fun schedule(params: BroadcastScheduleParams): CompletableFuture<BroadcastScheduleResponse> =
        schedule(params, RequestOptions.none())

    /** @see schedule */
    @Deprecated("deprecated")
    fun schedule(
        broadcastId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BroadcastScheduleResponse> =
        schedule(broadcastId, BroadcastScheduleParams.none(), requestOptions)

    /** Deprecated. Use POST /v1/broadcasts/{id}/send instead. */
    @Deprecated("deprecated")
    fun send(broadcastId: String): CompletableFuture<BroadcastSendResponse> =
        send(broadcastId, BroadcastSendParams.none())

    /** @see send */
    @Deprecated("deprecated")
    fun send(
        broadcastId: String,
        params: BroadcastSendParams = BroadcastSendParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BroadcastSendResponse> =
        send(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see send */
    @Deprecated("deprecated")
    fun send(
        broadcastId: String,
        params: BroadcastSendParams = BroadcastSendParams.none(),
    ): CompletableFuture<BroadcastSendResponse> = send(broadcastId, params, RequestOptions.none())

    /** @see send */
    @Deprecated("deprecated")
    fun send(
        params: BroadcastSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BroadcastSendResponse>

    /** @see send */
    @Deprecated("deprecated")
    fun send(params: BroadcastSendParams): CompletableFuture<BroadcastSendResponse> =
        send(params, RequestOptions.none())

    /** @see send */
    @Deprecated("deprecated")
    fun send(
        broadcastId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BroadcastSendResponse> =
        send(broadcastId, BroadcastSendParams.none(), requestOptions)

    /**
     * A view of [BroadcastServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BroadcastServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/whatsapp/broadcasts`, but is otherwise the same
         * as [BroadcastServiceAsync.create].
         */
        @Deprecated("deprecated")
        fun create(
            params: BroadcastCreateParams
        ): CompletableFuture<HttpResponseFor<BroadcastCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        @Deprecated("deprecated")
        fun create(
            params: BroadcastCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BroadcastCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/whatsapp/broadcasts/{broadcast_id}`, but is
         * otherwise the same as [BroadcastServiceAsync.retrieve].
         */
        @Deprecated("deprecated")
        fun retrieve(
            broadcastId: String
        ): CompletableFuture<HttpResponseFor<BroadcastRetrieveResponse>> =
            retrieve(broadcastId, BroadcastRetrieveParams.none())

        /** @see retrieve */
        @Deprecated("deprecated")
        fun retrieve(
            broadcastId: String,
            params: BroadcastRetrieveParams = BroadcastRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BroadcastRetrieveResponse>> =
            retrieve(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see retrieve */
        @Deprecated("deprecated")
        fun retrieve(
            broadcastId: String,
            params: BroadcastRetrieveParams = BroadcastRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<BroadcastRetrieveResponse>> =
            retrieve(broadcastId, params, RequestOptions.none())

        /** @see retrieve */
        @Deprecated("deprecated")
        fun retrieve(
            params: BroadcastRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BroadcastRetrieveResponse>>

        /** @see retrieve */
        @Deprecated("deprecated")
        fun retrieve(
            params: BroadcastRetrieveParams
        ): CompletableFuture<HttpResponseFor<BroadcastRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @Deprecated("deprecated")
        fun retrieve(
            broadcastId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BroadcastRetrieveResponse>> =
            retrieve(broadcastId, BroadcastRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/whatsapp/broadcasts`, but is otherwise the same
         * as [BroadcastServiceAsync.list].
         */
        @Deprecated("deprecated")
        fun list(
            params: BroadcastListParams
        ): CompletableFuture<HttpResponseFor<BroadcastListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        @Deprecated("deprecated")
        fun list(
            params: BroadcastListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BroadcastListResponse>>

        /**
         * Returns a raw HTTP response for `delete /v1/whatsapp/broadcasts/{broadcast_id}`, but is
         * otherwise the same as [BroadcastServiceAsync.delete].
         */
        @Deprecated("deprecated")
        fun delete(broadcastId: String): CompletableFuture<HttpResponse> =
            delete(broadcastId, BroadcastDeleteParams.none())

        /** @see delete */
        @Deprecated("deprecated")
        fun delete(
            broadcastId: String,
            params: BroadcastDeleteParams = BroadcastDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see delete */
        @Deprecated("deprecated")
        fun delete(
            broadcastId: String,
            params: BroadcastDeleteParams = BroadcastDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(broadcastId, params, RequestOptions.none())

        /** @see delete */
        @Deprecated("deprecated")
        fun delete(
            params: BroadcastDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        @Deprecated("deprecated")
        fun delete(params: BroadcastDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @Deprecated("deprecated")
        fun delete(
            broadcastId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(broadcastId, BroadcastDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/whatsapp/broadcasts/{broadcast_id}/schedule`,
         * but is otherwise the same as [BroadcastServiceAsync.schedule].
         */
        @Deprecated("deprecated")
        fun schedule(
            broadcastId: String
        ): CompletableFuture<HttpResponseFor<BroadcastScheduleResponse>> =
            schedule(broadcastId, BroadcastScheduleParams.none())

        /** @see schedule */
        @Deprecated("deprecated")
        fun schedule(
            broadcastId: String,
            params: BroadcastScheduleParams = BroadcastScheduleParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BroadcastScheduleResponse>> =
            schedule(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see schedule */
        @Deprecated("deprecated")
        fun schedule(
            broadcastId: String,
            params: BroadcastScheduleParams = BroadcastScheduleParams.none(),
        ): CompletableFuture<HttpResponseFor<BroadcastScheduleResponse>> =
            schedule(broadcastId, params, RequestOptions.none())

        /** @see schedule */
        @Deprecated("deprecated")
        fun schedule(
            params: BroadcastScheduleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BroadcastScheduleResponse>>

        /** @see schedule */
        @Deprecated("deprecated")
        fun schedule(
            params: BroadcastScheduleParams
        ): CompletableFuture<HttpResponseFor<BroadcastScheduleResponse>> =
            schedule(params, RequestOptions.none())

        /** @see schedule */
        @Deprecated("deprecated")
        fun schedule(
            broadcastId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BroadcastScheduleResponse>> =
            schedule(broadcastId, BroadcastScheduleParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/whatsapp/broadcasts/{broadcast_id}/send`, but
         * is otherwise the same as [BroadcastServiceAsync.send].
         */
        @Deprecated("deprecated")
        fun send(broadcastId: String): CompletableFuture<HttpResponseFor<BroadcastSendResponse>> =
            send(broadcastId, BroadcastSendParams.none())

        /** @see send */
        @Deprecated("deprecated")
        fun send(
            broadcastId: String,
            params: BroadcastSendParams = BroadcastSendParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BroadcastSendResponse>> =
            send(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see send */
        @Deprecated("deprecated")
        fun send(
            broadcastId: String,
            params: BroadcastSendParams = BroadcastSendParams.none(),
        ): CompletableFuture<HttpResponseFor<BroadcastSendResponse>> =
            send(broadcastId, params, RequestOptions.none())

        /** @see send */
        @Deprecated("deprecated")
        fun send(
            params: BroadcastSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BroadcastSendResponse>>

        /** @see send */
        @Deprecated("deprecated")
        fun send(
            params: BroadcastSendParams
        ): CompletableFuture<HttpResponseFor<BroadcastSendResponse>> =
            send(params, RequestOptions.none())

        /** @see send */
        @Deprecated("deprecated")
        fun send(
            broadcastId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BroadcastSendResponse>> =
            send(broadcastId, BroadcastSendParams.none(), requestOptions)
    }
}
