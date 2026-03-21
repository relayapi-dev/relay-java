// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
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
import dev.relayapi.core.prepareAsync
import dev.relayapi.models.whatsapp.WhatsappBulkSendParams
import dev.relayapi.models.whatsapp.WhatsappBulkSendResponse
import dev.relayapi.models.whatsapp.WhatsappListPhoneNumbersParams
import dev.relayapi.models.whatsapp.WhatsappListPhoneNumbersResponse
import dev.relayapi.services.async.whatsapp.BroadcastServiceAsync
import dev.relayapi.services.async.whatsapp.BroadcastServiceAsyncImpl
import dev.relayapi.services.async.whatsapp.BusinessProfileServiceAsync
import dev.relayapi.services.async.whatsapp.BusinessProfileServiceAsyncImpl
import dev.relayapi.services.async.whatsapp.ContactServiceAsync
import dev.relayapi.services.async.whatsapp.ContactServiceAsyncImpl
import dev.relayapi.services.async.whatsapp.GroupServiceAsync
import dev.relayapi.services.async.whatsapp.GroupServiceAsyncImpl
import dev.relayapi.services.async.whatsapp.TemplateServiceAsync
import dev.relayapi.services.async.whatsapp.TemplateServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class WhatsappServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    WhatsappServiceAsync {

    private val withRawResponse: WhatsappServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val broadcasts: BroadcastServiceAsync by lazy {
        BroadcastServiceAsyncImpl(clientOptions)
    }

    private val templates: TemplateServiceAsync by lazy { TemplateServiceAsyncImpl(clientOptions) }

    private val contacts: ContactServiceAsync by lazy { ContactServiceAsyncImpl(clientOptions) }

    private val groups: GroupServiceAsync by lazy { GroupServiceAsyncImpl(clientOptions) }

    private val businessProfile: BusinessProfileServiceAsync by lazy {
        BusinessProfileServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): WhatsappServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WhatsappServiceAsync =
        WhatsappServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun broadcasts(): BroadcastServiceAsync = broadcasts

    override fun templates(): TemplateServiceAsync = templates

    override fun contacts(): ContactServiceAsync = contacts

    override fun groups(): GroupServiceAsync = groups

    override fun businessProfile(): BusinessProfileServiceAsync = businessProfile

    override fun bulkSend(
        params: WhatsappBulkSendParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WhatsappBulkSendResponse> =
        // post /v1/whatsapp/bulk-send
        withRawResponse().bulkSend(params, requestOptions).thenApply { it.parse() }

    override fun listPhoneNumbers(
        params: WhatsappListPhoneNumbersParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WhatsappListPhoneNumbersResponse> =
        // get /v1/whatsapp/phone-numbers
        withRawResponse().listPhoneNumbers(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WhatsappServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val broadcasts: BroadcastServiceAsync.WithRawResponse by lazy {
            BroadcastServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val templates: TemplateServiceAsync.WithRawResponse by lazy {
            TemplateServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val contacts: ContactServiceAsync.WithRawResponse by lazy {
            ContactServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val groups: GroupServiceAsync.WithRawResponse by lazy {
            GroupServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val businessProfile: BusinessProfileServiceAsync.WithRawResponse by lazy {
            BusinessProfileServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WhatsappServiceAsync.WithRawResponse =
            WhatsappServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun broadcasts(): BroadcastServiceAsync.WithRawResponse = broadcasts

        override fun templates(): TemplateServiceAsync.WithRawResponse = templates

        override fun contacts(): ContactServiceAsync.WithRawResponse = contacts

        override fun groups(): GroupServiceAsync.WithRawResponse = groups

        override fun businessProfile(): BusinessProfileServiceAsync.WithRawResponse =
            businessProfile

        private val bulkSendHandler: Handler<WhatsappBulkSendResponse> =
            jsonHandler<WhatsappBulkSendResponse>(clientOptions.jsonMapper)

        override fun bulkSend(
            params: WhatsappBulkSendParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WhatsappBulkSendResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "whatsapp", "bulk-send")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { bulkSendHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listPhoneNumbersHandler: Handler<WhatsappListPhoneNumbersResponse> =
            jsonHandler<WhatsappListPhoneNumbersResponse>(clientOptions.jsonMapper)

        override fun listPhoneNumbers(
            params: WhatsappListPhoneNumbersParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WhatsappListPhoneNumbersResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "whatsapp", "phone-numbers")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listPhoneNumbersHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
