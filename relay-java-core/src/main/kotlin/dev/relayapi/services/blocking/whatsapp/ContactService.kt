// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.whatsapp

import com.google.errorprone.annotations.MustBeClosed
import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponse
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.whatsapp.contacts.ContactBulkOperationsParams
import dev.relayapi.models.whatsapp.contacts.ContactBulkOperationsResponse
import dev.relayapi.models.whatsapp.contacts.ContactCreateParams
import dev.relayapi.models.whatsapp.contacts.ContactCreateResponse
import dev.relayapi.models.whatsapp.contacts.ContactDeleteParams
import dev.relayapi.models.whatsapp.contacts.ContactImportParams
import dev.relayapi.models.whatsapp.contacts.ContactImportResponse
import dev.relayapi.models.whatsapp.contacts.ContactListParams
import dev.relayapi.models.whatsapp.contacts.ContactListResponse
import dev.relayapi.models.whatsapp.contacts.ContactRetrieveParams
import dev.relayapi.models.whatsapp.contacts.ContactRetrieveResponse
import java.util.function.Consumer

interface ContactService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ContactService

    /** Create a contact */
    fun create(params: ContactCreateParams): ContactCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ContactCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContactCreateResponse

    /** Get contact details */
    fun retrieve(contactId: String): ContactRetrieveResponse =
        retrieve(contactId, ContactRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        contactId: String,
        params: ContactRetrieveParams = ContactRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContactRetrieveResponse =
        retrieve(params.toBuilder().contactId(contactId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        contactId: String,
        params: ContactRetrieveParams = ContactRetrieveParams.none(),
    ): ContactRetrieveResponse = retrieve(contactId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ContactRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContactRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: ContactRetrieveParams): ContactRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(contactId: String, requestOptions: RequestOptions): ContactRetrieveResponse =
        retrieve(contactId, ContactRetrieveParams.none(), requestOptions)

    /** List contacts */
    fun list(params: ContactListParams): ContactListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ContactListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContactListResponse

    /** Delete a contact */
    fun delete(contactId: String) = delete(contactId, ContactDeleteParams.none())

    /** @see delete */
    fun delete(
        contactId: String,
        params: ContactDeleteParams = ContactDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().contactId(contactId).build(), requestOptions)

    /** @see delete */
    fun delete(contactId: String, params: ContactDeleteParams = ContactDeleteParams.none()) =
        delete(contactId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: ContactDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: ContactDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(contactId: String, requestOptions: RequestOptions) =
        delete(contactId, ContactDeleteParams.none(), requestOptions)

    /** Bulk contact operations (add/remove tags, delete) */
    fun bulkOperations(params: ContactBulkOperationsParams): ContactBulkOperationsResponse =
        bulkOperations(params, RequestOptions.none())

    /** @see bulkOperations */
    fun bulkOperations(
        params: ContactBulkOperationsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContactBulkOperationsResponse

    /** Bulk import contacts */
    fun import_(params: ContactImportParams): ContactImportResponse =
        import_(params, RequestOptions.none())

    /** @see import_ */
    fun import_(
        params: ContactImportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContactImportResponse

    /** A view of [ContactService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ContactService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/whatsapp/contacts`, but is otherwise the same
         * as [ContactService.create].
         */
        @MustBeClosed
        fun create(params: ContactCreateParams): HttpResponseFor<ContactCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ContactCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContactCreateResponse>

        /**
         * Returns a raw HTTP response for `get /v1/whatsapp/contacts/{contact_id}`, but is
         * otherwise the same as [ContactService.retrieve].
         */
        @MustBeClosed
        fun retrieve(contactId: String): HttpResponseFor<ContactRetrieveResponse> =
            retrieve(contactId, ContactRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            contactId: String,
            params: ContactRetrieveParams = ContactRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContactRetrieveResponse> =
            retrieve(params.toBuilder().contactId(contactId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            contactId: String,
            params: ContactRetrieveParams = ContactRetrieveParams.none(),
        ): HttpResponseFor<ContactRetrieveResponse> =
            retrieve(contactId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ContactRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContactRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ContactRetrieveParams): HttpResponseFor<ContactRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            contactId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContactRetrieveResponse> =
            retrieve(contactId, ContactRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/whatsapp/contacts`, but is otherwise the same as
         * [ContactService.list].
         */
        @MustBeClosed
        fun list(params: ContactListParams): HttpResponseFor<ContactListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ContactListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContactListResponse>

        /**
         * Returns a raw HTTP response for `delete /v1/whatsapp/contacts/{contact_id}`, but is
         * otherwise the same as [ContactService.delete].
         */
        @MustBeClosed
        fun delete(contactId: String): HttpResponse = delete(contactId, ContactDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            contactId: String,
            params: ContactDeleteParams = ContactDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().contactId(contactId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            contactId: String,
            params: ContactDeleteParams = ContactDeleteParams.none(),
        ): HttpResponse = delete(contactId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ContactDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: ContactDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(contactId: String, requestOptions: RequestOptions): HttpResponse =
            delete(contactId, ContactDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/whatsapp/contacts/bulk`, but is otherwise the
         * same as [ContactService.bulkOperations].
         */
        @MustBeClosed
        fun bulkOperations(
            params: ContactBulkOperationsParams
        ): HttpResponseFor<ContactBulkOperationsResponse> =
            bulkOperations(params, RequestOptions.none())

        /** @see bulkOperations */
        @MustBeClosed
        fun bulkOperations(
            params: ContactBulkOperationsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContactBulkOperationsResponse>

        /**
         * Returns a raw HTTP response for `post /v1/whatsapp/contacts/import`, but is otherwise the
         * same as [ContactService.import_].
         */
        @MustBeClosed
        fun import_(params: ContactImportParams): HttpResponseFor<ContactImportResponse> =
            import_(params, RequestOptions.none())

        /** @see import_ */
        @MustBeClosed
        fun import_(
            params: ContactImportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContactImportResponse>
    }
}
