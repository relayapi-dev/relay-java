// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponse
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.webhooks.WebhookCreateParams
import dev.relayapi.models.webhooks.WebhookCreateResponse
import dev.relayapi.models.webhooks.WebhookDeleteParams
import dev.relayapi.models.webhooks.WebhookListLogsParams
import dev.relayapi.models.webhooks.WebhookListLogsResponse
import dev.relayapi.models.webhooks.WebhookListParams
import dev.relayapi.models.webhooks.WebhookListResponse
import dev.relayapi.models.webhooks.WebhookSendTestParams
import dev.relayapi.models.webhooks.WebhookSendTestResponse
import dev.relayapi.models.webhooks.WebhookUpdateParams
import dev.relayapi.models.webhooks.WebhookUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface WebhookServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookServiceAsync

    /** Create a new webhook endpoint. The signing secret is returned only once in the response. */
    fun create(params: WebhookCreateParams): CompletableFuture<WebhookCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: WebhookCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookCreateResponse>

    /** Update a webhook endpoint */
    fun update(id: String): CompletableFuture<WebhookUpdateResponse> =
        update(id, WebhookUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: WebhookUpdateParams = WebhookUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: WebhookUpdateParams = WebhookUpdateParams.none(),
    ): CompletableFuture<WebhookUpdateResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: WebhookUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookUpdateResponse>

    /** @see update */
    fun update(params: WebhookUpdateParams): CompletableFuture<WebhookUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebhookUpdateResponse> =
        update(id, WebhookUpdateParams.none(), requestOptions)

    /** List webhook endpoints */
    fun list(): CompletableFuture<WebhookListResponse> = list(WebhookListParams.none())

    /** @see list */
    fun list(
        params: WebhookListParams = WebhookListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookListResponse>

    /** @see list */
    fun list(
        params: WebhookListParams = WebhookListParams.none()
    ): CompletableFuture<WebhookListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<WebhookListResponse> =
        list(WebhookListParams.none(), requestOptions)

    /** Delete a webhook endpoint */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, WebhookDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: WebhookDeleteParams = WebhookDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: WebhookDeleteParams = WebhookDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: WebhookDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: WebhookDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, WebhookDeleteParams.none(), requestOptions)

    /** Returns delivery logs from the last 7 days. */
    fun listLogs(): CompletableFuture<WebhookListLogsResponse> =
        listLogs(WebhookListLogsParams.none())

    /** @see listLogs */
    fun listLogs(
        params: WebhookListLogsParams = WebhookListLogsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookListLogsResponse>

    /** @see listLogs */
    fun listLogs(
        params: WebhookListLogsParams = WebhookListLogsParams.none()
    ): CompletableFuture<WebhookListLogsResponse> = listLogs(params, RequestOptions.none())

    /** @see listLogs */
    fun listLogs(requestOptions: RequestOptions): CompletableFuture<WebhookListLogsResponse> =
        listLogs(WebhookListLogsParams.none(), requestOptions)

    /** Send a test POST request to the webhook URL to verify it is reachable. */
    fun sendTest(params: WebhookSendTestParams): CompletableFuture<WebhookSendTestResponse> =
        sendTest(params, RequestOptions.none())

    /** @see sendTest */
    fun sendTest(
        params: WebhookSendTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookSendTestResponse>

    /**
     * A view of [WebhookServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WebhookServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/webhooks`, but is otherwise the same as
         * [WebhookServiceAsync.create].
         */
        fun create(
            params: WebhookCreateParams
        ): CompletableFuture<HttpResponseFor<WebhookCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: WebhookCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookCreateResponse>>

        /**
         * Returns a raw HTTP response for `patch /v1/webhooks/{id}`, but is otherwise the same as
         * [WebhookServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<WebhookUpdateResponse>> =
            update(id, WebhookUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: WebhookUpdateParams = WebhookUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: WebhookUpdateParams = WebhookUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<WebhookUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: WebhookUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookUpdateResponse>>

        /** @see update */
        fun update(
            params: WebhookUpdateParams
        ): CompletableFuture<HttpResponseFor<WebhookUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WebhookUpdateResponse>> =
            update(id, WebhookUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/webhooks`, but is otherwise the same as
         * [WebhookServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<WebhookListResponse>> =
            list(WebhookListParams.none())

        /** @see list */
        fun list(
            params: WebhookListParams = WebhookListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookListResponse>>

        /** @see list */
        fun list(
            params: WebhookListParams = WebhookListParams.none()
        ): CompletableFuture<HttpResponseFor<WebhookListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<WebhookListResponse>> =
            list(WebhookListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/webhooks/{id}`, but is otherwise the same as
         * [WebhookServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, WebhookDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: WebhookDeleteParams = WebhookDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: WebhookDeleteParams = WebhookDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: WebhookDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: WebhookDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, WebhookDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/webhooks/logs`, but is otherwise the same as
         * [WebhookServiceAsync.listLogs].
         */
        fun listLogs(): CompletableFuture<HttpResponseFor<WebhookListLogsResponse>> =
            listLogs(WebhookListLogsParams.none())

        /** @see listLogs */
        fun listLogs(
            params: WebhookListLogsParams = WebhookListLogsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookListLogsResponse>>

        /** @see listLogs */
        fun listLogs(
            params: WebhookListLogsParams = WebhookListLogsParams.none()
        ): CompletableFuture<HttpResponseFor<WebhookListLogsResponse>> =
            listLogs(params, RequestOptions.none())

        /** @see listLogs */
        fun listLogs(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<WebhookListLogsResponse>> =
            listLogs(WebhookListLogsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/webhooks/test`, but is otherwise the same as
         * [WebhookServiceAsync.sendTest].
         */
        fun sendTest(
            params: WebhookSendTestParams
        ): CompletableFuture<HttpResponseFor<WebhookSendTestResponse>> =
            sendTest(params, RequestOptions.none())

        /** @see sendTest */
        fun sendTest(
            params: WebhookSendTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookSendTestResponse>>
    }
}
