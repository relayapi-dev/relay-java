// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.queue

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SlotServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SlotServiceAsync

    /** Create a queue schedule */
    fun create(params: SlotCreateParams): CompletableFuture<SlotCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SlotCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SlotCreateResponse>

    /** Update queue schedule */
    fun update(): CompletableFuture<SlotUpdateResponse> = update(SlotUpdateParams.none())

    /** @see update */
    fun update(
        params: SlotUpdateParams = SlotUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SlotUpdateResponse>

    /** @see update */
    fun update(
        params: SlotUpdateParams = SlotUpdateParams.none()
    ): CompletableFuture<SlotUpdateResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(requestOptions: RequestOptions): CompletableFuture<SlotUpdateResponse> =
        update(SlotUpdateParams.none(), requestOptions)

    /** List queue schedules */
    fun list(): CompletableFuture<SlotListResponse> = list(SlotListParams.none())

    /** @see list */
    fun list(
        params: SlotListParams = SlotListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SlotListResponse>

    /** @see list */
    fun list(params: SlotListParams = SlotListParams.none()): CompletableFuture<SlotListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SlotListResponse> =
        list(SlotListParams.none(), requestOptions)

    /** Delete queue schedule */
    fun delete(): CompletableFuture<Void?> = delete(SlotDeleteParams.none())

    /** @see delete */
    fun delete(
        params: SlotDeleteParams = SlotDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: SlotDeleteParams = SlotDeleteParams.none()): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(SlotDeleteParams.none(), requestOptions)

    /** A view of [SlotServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SlotServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/queue/slots`, but is otherwise the same as
         * [SlotServiceAsync.create].
         */
        fun create(
            params: SlotCreateParams
        ): CompletableFuture<HttpResponseFor<SlotCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SlotCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SlotCreateResponse>>

        /**
         * Returns a raw HTTP response for `put /v1/queue/slots`, but is otherwise the same as
         * [SlotServiceAsync.update].
         */
        fun update(): CompletableFuture<HttpResponseFor<SlotUpdateResponse>> =
            update(SlotUpdateParams.none())

        /** @see update */
        fun update(
            params: SlotUpdateParams = SlotUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SlotUpdateResponse>>

        /** @see update */
        fun update(
            params: SlotUpdateParams = SlotUpdateParams.none()
        ): CompletableFuture<HttpResponseFor<SlotUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SlotUpdateResponse>> =
            update(SlotUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/queue/slots`, but is otherwise the same as
         * [SlotServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SlotListResponse>> =
            list(SlotListParams.none())

        /** @see list */
        fun list(
            params: SlotListParams = SlotListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SlotListResponse>>

        /** @see list */
        fun list(
            params: SlotListParams = SlotListParams.none()
        ): CompletableFuture<HttpResponseFor<SlotListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SlotListResponse>> =
            list(SlotListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/queue/slots`, but is otherwise the same as
         * [SlotServiceAsync.delete].
         */
        fun delete(): CompletableFuture<HttpResponse> = delete(SlotDeleteParams.none())

        /** @see delete */
        fun delete(
            params: SlotDeleteParams = SlotDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(
            params: SlotDeleteParams = SlotDeleteParams.none()
        ): CompletableFuture<HttpResponse> = delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(SlotDeleteParams.none(), requestOptions)
    }
}
