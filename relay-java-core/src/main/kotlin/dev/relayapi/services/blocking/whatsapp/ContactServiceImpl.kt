// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.whatsapp

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.checkRequired
import dev.relayapi.core.handlers.emptyHandler
import dev.relayapi.core.handlers.errorBodyHandler
import dev.relayapi.core.handlers.errorHandler
import dev.relayapi.core.handlers.jsonHandler
import dev.relayapi.core.http.HttpMethod
import dev.relayapi.core.http.HttpRequest
import dev.relayapi.core.http.HttpResponse
import dev.relayapi.core.http.HttpResponse.Handler
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.core.http.json
import dev.relayapi.core.http.parseable
import dev.relayapi.core.prepare
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
import kotlin.jvm.optionals.getOrNull

class ContactServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ContactService {

    private val withRawResponse: ContactService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ContactService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ContactService =
        ContactServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ContactCreateParams,
        requestOptions: RequestOptions,
    ): ContactCreateResponse =
        // post /v1/whatsapp/contacts
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: ContactRetrieveParams,
        requestOptions: RequestOptions,
    ): ContactRetrieveResponse =
        // get /v1/whatsapp/contacts/{contact_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: ContactListParams,
        requestOptions: RequestOptions,
    ): ContactListResponse =
        // get /v1/whatsapp/contacts
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: ContactDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/whatsapp/contacts/{contact_id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun bulkOperations(
        params: ContactBulkOperationsParams,
        requestOptions: RequestOptions,
    ): ContactBulkOperationsResponse =
        // post /v1/whatsapp/contacts/bulk
        withRawResponse().bulkOperations(params, requestOptions).parse()

    override fun import_(
        params: ContactImportParams,
        requestOptions: RequestOptions,
    ): ContactImportResponse =
        // post /v1/whatsapp/contacts/import
        withRawResponse().import_(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ContactService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ContactService.WithRawResponse =
            ContactServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ContactCreateResponse> =
            jsonHandler<ContactCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ContactCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContactCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "whatsapp", "contacts")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<ContactRetrieveResponse> =
            jsonHandler<ContactRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ContactRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContactRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("contactId", params.contactId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "whatsapp", "contacts", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<ContactListResponse> =
            jsonHandler<ContactListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ContactListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContactListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "whatsapp", "contacts")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: ContactDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("contactId", params.contactId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "whatsapp", "contacts", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val bulkOperationsHandler: Handler<ContactBulkOperationsResponse> =
            jsonHandler<ContactBulkOperationsResponse>(clientOptions.jsonMapper)

        override fun bulkOperations(
            params: ContactBulkOperationsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContactBulkOperationsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "whatsapp", "contacts", "bulk")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { bulkOperationsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val importHandler: Handler<ContactImportResponse> =
            jsonHandler<ContactImportResponse>(clientOptions.jsonMapper)

        override fun import_(
            params: ContactImportParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContactImportResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "whatsapp", "contacts", "import")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { importHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
