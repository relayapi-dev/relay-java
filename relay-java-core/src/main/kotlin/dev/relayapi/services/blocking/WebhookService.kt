// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

interface WebhookService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookService

    /** Create a new webhook endpoint. The signing secret is returned only once in the response. */
    fun create(params: WebhookCreateParams): WebhookCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: WebhookCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookCreateResponse

    /** Update a webhook endpoint */
    fun update(id: String): WebhookUpdateResponse = update(id, WebhookUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: WebhookUpdateParams = WebhookUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: WebhookUpdateParams = WebhookUpdateParams.none(),
    ): WebhookUpdateResponse = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: WebhookUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookUpdateResponse

    /** @see update */
    fun update(params: WebhookUpdateParams): WebhookUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): WebhookUpdateResponse =
        update(id, WebhookUpdateParams.none(), requestOptions)

    /** List webhook endpoints */
    fun list(): WebhookListResponse = list(WebhookListParams.none())

    /** @see list */
    fun list(
        params: WebhookListParams = WebhookListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookListResponse

    /** @see list */
    fun list(params: WebhookListParams = WebhookListParams.none()): WebhookListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): WebhookListResponse =
        list(WebhookListParams.none(), requestOptions)

    /** Delete a webhook endpoint */
    fun delete(id: String) = delete(id, WebhookDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: WebhookDeleteParams = WebhookDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: WebhookDeleteParams = WebhookDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: WebhookDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: WebhookDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, WebhookDeleteParams.none(), requestOptions)

    /** Returns delivery logs from the last 7 days. */
    fun listLogs(): WebhookListLogsResponse = listLogs(WebhookListLogsParams.none())

    /** @see listLogs */
    fun listLogs(
        params: WebhookListLogsParams = WebhookListLogsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookListLogsResponse

    /** @see listLogs */
    fun listLogs(
        params: WebhookListLogsParams = WebhookListLogsParams.none()
    ): WebhookListLogsResponse = listLogs(params, RequestOptions.none())

    /** @see listLogs */
    fun listLogs(requestOptions: RequestOptions): WebhookListLogsResponse =
        listLogs(WebhookListLogsParams.none(), requestOptions)

    /** Send a test POST request to the webhook URL to verify it is reachable. */
    fun sendTest(params: WebhookSendTestParams): WebhookSendTestResponse =
        sendTest(params, RequestOptions.none())

    /** @see sendTest */
    fun sendTest(
        params: WebhookSendTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookSendTestResponse

    /** A view of [WebhookService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/webhooks`, but is otherwise the same as
         * [WebhookService.create].
         */
        @MustBeClosed
        fun create(params: WebhookCreateParams): HttpResponseFor<WebhookCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: WebhookCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookCreateResponse>

        /**
         * Returns a raw HTTP response for `patch /v1/webhooks/{id}`, but is otherwise the same as
         * [WebhookService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<WebhookUpdateResponse> =
            update(id, WebhookUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: WebhookUpdateParams = WebhookUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: WebhookUpdateParams = WebhookUpdateParams.none(),
        ): HttpResponseFor<WebhookUpdateResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: WebhookUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: WebhookUpdateParams): HttpResponseFor<WebhookUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookUpdateResponse> =
            update(id, WebhookUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/webhooks`, but is otherwise the same as
         * [WebhookService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<WebhookListResponse> = list(WebhookListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: WebhookListParams = WebhookListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: WebhookListParams = WebhookListParams.none()
        ): HttpResponseFor<WebhookListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<WebhookListResponse> =
            list(WebhookListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/webhooks/{id}`, but is otherwise the same as
         * [WebhookService.delete].
         */
        @MustBeClosed fun delete(id: String): HttpResponse = delete(id, WebhookDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: WebhookDeleteParams = WebhookDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: WebhookDeleteParams = WebhookDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: WebhookDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: WebhookDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, WebhookDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/webhooks/logs`, but is otherwise the same as
         * [WebhookService.listLogs].
         */
        @MustBeClosed
        fun listLogs(): HttpResponseFor<WebhookListLogsResponse> =
            listLogs(WebhookListLogsParams.none())

        /** @see listLogs */
        @MustBeClosed
        fun listLogs(
            params: WebhookListLogsParams = WebhookListLogsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookListLogsResponse>

        /** @see listLogs */
        @MustBeClosed
        fun listLogs(
            params: WebhookListLogsParams = WebhookListLogsParams.none()
        ): HttpResponseFor<WebhookListLogsResponse> = listLogs(params, RequestOptions.none())

        /** @see listLogs */
        @MustBeClosed
        fun listLogs(requestOptions: RequestOptions): HttpResponseFor<WebhookListLogsResponse> =
            listLogs(WebhookListLogsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/webhooks/test`, but is otherwise the same as
         * [WebhookService.sendTest].
         */
        @MustBeClosed
        fun sendTest(params: WebhookSendTestParams): HttpResponseFor<WebhookSendTestResponse> =
            sendTest(params, RequestOptions.none())

        /** @see sendTest */
        @MustBeClosed
        fun sendTest(
            params: WebhookSendTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookSendTestResponse>
    }
}
