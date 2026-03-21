// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.whatsapp

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ContactServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ContactServiceAsync

    /** Create a contact */
    fun create(params: ContactCreateParams): CompletableFuture<ContactCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ContactCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContactCreateResponse>

    /** Get contact details */
    fun retrieve(contactId: String): CompletableFuture<ContactRetrieveResponse> =
        retrieve(contactId, ContactRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        contactId: String,
        params: ContactRetrieveParams = ContactRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContactRetrieveResponse> =
        retrieve(params.toBuilder().contactId(contactId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        contactId: String,
        params: ContactRetrieveParams = ContactRetrieveParams.none(),
    ): CompletableFuture<ContactRetrieveResponse> =
        retrieve(contactId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ContactRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContactRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: ContactRetrieveParams): CompletableFuture<ContactRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        contactId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ContactRetrieveResponse> =
        retrieve(contactId, ContactRetrieveParams.none(), requestOptions)

    /** List contacts */
    fun list(params: ContactListParams): CompletableFuture<ContactListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ContactListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContactListResponse>

    /** Delete a contact */
    fun delete(contactId: String): CompletableFuture<Void?> =
        delete(contactId, ContactDeleteParams.none())

    /** @see delete */
    fun delete(
        contactId: String,
        params: ContactDeleteParams = ContactDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().contactId(contactId).build(), requestOptions)

    /** @see delete */
    fun delete(
        contactId: String,
        params: ContactDeleteParams = ContactDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(contactId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ContactDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: ContactDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(contactId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(contactId, ContactDeleteParams.none(), requestOptions)

    /** Bulk contact operations (add/remove tags, delete) */
    fun bulkOperations(
        params: ContactBulkOperationsParams
    ): CompletableFuture<ContactBulkOperationsResponse> =
        bulkOperations(params, RequestOptions.none())

    /** @see bulkOperations */
    fun bulkOperations(
        params: ContactBulkOperationsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContactBulkOperationsResponse>

    /** Bulk import contacts */
    fun import_(params: ContactImportParams): CompletableFuture<ContactImportResponse> =
        import_(params, RequestOptions.none())

    /** @see import_ */
    fun import_(
        params: ContactImportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContactImportResponse>

    /**
     * A view of [ContactServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ContactServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/whatsapp/contacts`, but is otherwise the same
         * as [ContactServiceAsync.create].
         */
        fun create(
            params: ContactCreateParams
        ): CompletableFuture<HttpResponseFor<ContactCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ContactCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContactCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/whatsapp/contacts/{contact_id}`, but is
         * otherwise the same as [ContactServiceAsync.retrieve].
         */
        fun retrieve(
            contactId: String
        ): CompletableFuture<HttpResponseFor<ContactRetrieveResponse>> =
            retrieve(contactId, ContactRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            contactId: String,
            params: ContactRetrieveParams = ContactRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContactRetrieveResponse>> =
            retrieve(params.toBuilder().contactId(contactId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            contactId: String,
            params: ContactRetrieveParams = ContactRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ContactRetrieveResponse>> =
            retrieve(contactId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ContactRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContactRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: ContactRetrieveParams
        ): CompletableFuture<HttpResponseFor<ContactRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            contactId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ContactRetrieveResponse>> =
            retrieve(contactId, ContactRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/whatsapp/contacts`, but is otherwise the same as
         * [ContactServiceAsync.list].
         */
        fun list(
            params: ContactListParams
        ): CompletableFuture<HttpResponseFor<ContactListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ContactListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContactListResponse>>

        /**
         * Returns a raw HTTP response for `delete /v1/whatsapp/contacts/{contact_id}`, but is
         * otherwise the same as [ContactServiceAsync.delete].
         */
        fun delete(contactId: String): CompletableFuture<HttpResponse> =
            delete(contactId, ContactDeleteParams.none())

        /** @see delete */
        fun delete(
            contactId: String,
            params: ContactDeleteParams = ContactDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().contactId(contactId).build(), requestOptions)

        /** @see delete */
        fun delete(
            contactId: String,
            params: ContactDeleteParams = ContactDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(contactId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ContactDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: ContactDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            contactId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(contactId, ContactDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/whatsapp/contacts/bulk`, but is otherwise the
         * same as [ContactServiceAsync.bulkOperations].
         */
        fun bulkOperations(
            params: ContactBulkOperationsParams
        ): CompletableFuture<HttpResponseFor<ContactBulkOperationsResponse>> =
            bulkOperations(params, RequestOptions.none())

        /** @see bulkOperations */
        fun bulkOperations(
            params: ContactBulkOperationsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContactBulkOperationsResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/whatsapp/contacts/import`, but is otherwise the
         * same as [ContactServiceAsync.import_].
         */
        fun import_(
            params: ContactImportParams
        ): CompletableFuture<HttpResponseFor<ContactImportResponse>> =
            import_(params, RequestOptions.none())

        /** @see import_ */
        fun import_(
            params: ContactImportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContactImportResponse>>
    }
}
