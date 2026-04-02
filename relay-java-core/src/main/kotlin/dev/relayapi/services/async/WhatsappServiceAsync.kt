// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.whatsapp.WhatsappBulkSendParams
import dev.relayapi.models.whatsapp.WhatsappBulkSendResponse
import dev.relayapi.models.whatsapp.WhatsappListPhoneNumbersParams
import dev.relayapi.models.whatsapp.WhatsappListPhoneNumbersResponse
import dev.relayapi.services.async.whatsapp.BroadcastServiceAsync
import dev.relayapi.services.async.whatsapp.BusinessProfileServiceAsync
import dev.relayapi.services.async.whatsapp.ContactServiceAsync
import dev.relayapi.services.async.whatsapp.GroupServiceAsync
import dev.relayapi.services.async.whatsapp.TemplateServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface WhatsappServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WhatsappServiceAsync

    fun broadcasts(): BroadcastServiceAsync

    fun templates(): TemplateServiceAsync

    fun contacts(): ContactServiceAsync

    fun groups(): GroupServiceAsync

    fun businessProfile(): BusinessProfileServiceAsync

    /** Send bulk WhatsApp messages via template */
    fun bulkSend(params: WhatsappBulkSendParams): CompletableFuture<WhatsappBulkSendResponse> =
        bulkSend(params, RequestOptions.none())

    /** @see bulkSend */
    fun bulkSend(
        params: WhatsappBulkSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WhatsappBulkSendResponse>

    /** List purchased phone numbers */
    fun listPhoneNumbers(): CompletableFuture<WhatsappListPhoneNumbersResponse> =
        listPhoneNumbers(WhatsappListPhoneNumbersParams.none())

    /** @see listPhoneNumbers */
    fun listPhoneNumbers(
        params: WhatsappListPhoneNumbersParams = WhatsappListPhoneNumbersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WhatsappListPhoneNumbersResponse>

    /** @see listPhoneNumbers */
    fun listPhoneNumbers(
        params: WhatsappListPhoneNumbersParams = WhatsappListPhoneNumbersParams.none()
    ): CompletableFuture<WhatsappListPhoneNumbersResponse> =
        listPhoneNumbers(params, RequestOptions.none())

    /** @see listPhoneNumbers */
    fun listPhoneNumbers(
        requestOptions: RequestOptions
    ): CompletableFuture<WhatsappListPhoneNumbersResponse> =
        listPhoneNumbers(WhatsappListPhoneNumbersParams.none(), requestOptions)

    /**
     * A view of [WhatsappServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WhatsappServiceAsync.WithRawResponse

        fun broadcasts(): BroadcastServiceAsync.WithRawResponse

        fun templates(): TemplateServiceAsync.WithRawResponse

        fun contacts(): ContactServiceAsync.WithRawResponse

        fun groups(): GroupServiceAsync.WithRawResponse

        fun businessProfile(): BusinessProfileServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/whatsapp/bulk-send`, but is otherwise the same
         * as [WhatsappServiceAsync.bulkSend].
         */
        fun bulkSend(
            params: WhatsappBulkSendParams
        ): CompletableFuture<HttpResponseFor<WhatsappBulkSendResponse>> =
            bulkSend(params, RequestOptions.none())

        /** @see bulkSend */
        fun bulkSend(
            params: WhatsappBulkSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WhatsappBulkSendResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/whatsapp/phone-numbers`, but is otherwise the
         * same as [WhatsappServiceAsync.listPhoneNumbers].
         */
        fun listPhoneNumbers():
            CompletableFuture<HttpResponseFor<WhatsappListPhoneNumbersResponse>> =
            listPhoneNumbers(WhatsappListPhoneNumbersParams.none())

        /** @see listPhoneNumbers */
        fun listPhoneNumbers(
            params: WhatsappListPhoneNumbersParams = WhatsappListPhoneNumbersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WhatsappListPhoneNumbersResponse>>

        /** @see listPhoneNumbers */
        fun listPhoneNumbers(
            params: WhatsappListPhoneNumbersParams = WhatsappListPhoneNumbersParams.none()
        ): CompletableFuture<HttpResponseFor<WhatsappListPhoneNumbersResponse>> =
            listPhoneNumbers(params, RequestOptions.none())

        /** @see listPhoneNumbers */
        fun listPhoneNumbers(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<WhatsappListPhoneNumbersResponse>> =
            listPhoneNumbers(WhatsappListPhoneNumbersParams.none(), requestOptions)
    }
}
