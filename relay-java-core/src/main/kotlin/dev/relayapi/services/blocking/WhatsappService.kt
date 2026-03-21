// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.whatsapp.WhatsappBulkSendParams
import dev.relayapi.models.whatsapp.WhatsappBulkSendResponse
import dev.relayapi.models.whatsapp.WhatsappListPhoneNumbersParams
import dev.relayapi.models.whatsapp.WhatsappListPhoneNumbersResponse
import dev.relayapi.services.blocking.whatsapp.BroadcastService
import dev.relayapi.services.blocking.whatsapp.BusinessProfileService
import dev.relayapi.services.blocking.whatsapp.ContactService
import dev.relayapi.services.blocking.whatsapp.GroupService
import dev.relayapi.services.blocking.whatsapp.TemplateService
import java.util.function.Consumer

interface WhatsappService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WhatsappService

    fun broadcasts(): BroadcastService

    fun templates(): TemplateService

    fun contacts(): ContactService

    fun groups(): GroupService

    fun businessProfile(): BusinessProfileService

    /** Send bulk WhatsApp messages via template */
    fun bulkSend(params: WhatsappBulkSendParams): WhatsappBulkSendResponse =
        bulkSend(params, RequestOptions.none())

    /** @see bulkSend */
    fun bulkSend(
        params: WhatsappBulkSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WhatsappBulkSendResponse

    /** List registered phone numbers */
    fun listPhoneNumbers(params: WhatsappListPhoneNumbersParams): WhatsappListPhoneNumbersResponse =
        listPhoneNumbers(params, RequestOptions.none())

    /** @see listPhoneNumbers */
    fun listPhoneNumbers(
        params: WhatsappListPhoneNumbersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WhatsappListPhoneNumbersResponse

    /** A view of [WhatsappService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): WhatsappService.WithRawResponse

        fun broadcasts(): BroadcastService.WithRawResponse

        fun templates(): TemplateService.WithRawResponse

        fun contacts(): ContactService.WithRawResponse

        fun groups(): GroupService.WithRawResponse

        fun businessProfile(): BusinessProfileService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/whatsapp/bulk-send`, but is otherwise the same
         * as [WhatsappService.bulkSend].
         */
        @MustBeClosed
        fun bulkSend(params: WhatsappBulkSendParams): HttpResponseFor<WhatsappBulkSendResponse> =
            bulkSend(params, RequestOptions.none())

        /** @see bulkSend */
        @MustBeClosed
        fun bulkSend(
            params: WhatsappBulkSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WhatsappBulkSendResponse>

        /**
         * Returns a raw HTTP response for `get /v1/whatsapp/phone-numbers`, but is otherwise the
         * same as [WhatsappService.listPhoneNumbers].
         */
        @MustBeClosed
        fun listPhoneNumbers(
            params: WhatsappListPhoneNumbersParams
        ): HttpResponseFor<WhatsappListPhoneNumbersResponse> =
            listPhoneNumbers(params, RequestOptions.none())

        /** @see listPhoneNumbers */
        @MustBeClosed
        fun listPhoneNumbers(
            params: WhatsappListPhoneNumbersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WhatsappListPhoneNumbersResponse>
    }
}
