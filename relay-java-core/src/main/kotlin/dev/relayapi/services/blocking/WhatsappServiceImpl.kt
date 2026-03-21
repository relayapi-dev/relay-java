// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking

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
import dev.relayapi.core.prepare
import dev.relayapi.models.whatsapp.WhatsappBulkSendParams
import dev.relayapi.models.whatsapp.WhatsappBulkSendResponse
import dev.relayapi.models.whatsapp.WhatsappListPhoneNumbersParams
import dev.relayapi.models.whatsapp.WhatsappListPhoneNumbersResponse
import dev.relayapi.services.blocking.whatsapp.BroadcastService
import dev.relayapi.services.blocking.whatsapp.BroadcastServiceImpl
import dev.relayapi.services.blocking.whatsapp.BusinessProfileService
import dev.relayapi.services.blocking.whatsapp.BusinessProfileServiceImpl
import dev.relayapi.services.blocking.whatsapp.ContactService
import dev.relayapi.services.blocking.whatsapp.ContactServiceImpl
import dev.relayapi.services.blocking.whatsapp.GroupService
import dev.relayapi.services.blocking.whatsapp.GroupServiceImpl
import dev.relayapi.services.blocking.whatsapp.TemplateService
import dev.relayapi.services.blocking.whatsapp.TemplateServiceImpl
import java.util.function.Consumer

class WhatsappServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    WhatsappService {

    private val withRawResponse: WhatsappService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val broadcasts: BroadcastService by lazy { BroadcastServiceImpl(clientOptions) }

    private val templates: TemplateService by lazy { TemplateServiceImpl(clientOptions) }

    private val contacts: ContactService by lazy { ContactServiceImpl(clientOptions) }

    private val groups: GroupService by lazy { GroupServiceImpl(clientOptions) }

    private val businessProfile: BusinessProfileService by lazy {
        BusinessProfileServiceImpl(clientOptions)
    }

    override fun withRawResponse(): WhatsappService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WhatsappService =
        WhatsappServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun broadcasts(): BroadcastService = broadcasts

    override fun templates(): TemplateService = templates

    override fun contacts(): ContactService = contacts

    override fun groups(): GroupService = groups

    override fun businessProfile(): BusinessProfileService = businessProfile

    override fun bulkSend(
        params: WhatsappBulkSendParams,
        requestOptions: RequestOptions,
    ): WhatsappBulkSendResponse =
        // post /v1/whatsapp/bulk-send
        withRawResponse().bulkSend(params, requestOptions).parse()

    override fun listPhoneNumbers(
        params: WhatsappListPhoneNumbersParams,
        requestOptions: RequestOptions,
    ): WhatsappListPhoneNumbersResponse =
        // get /v1/whatsapp/phone-numbers
        withRawResponse().listPhoneNumbers(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WhatsappService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val broadcasts: BroadcastService.WithRawResponse by lazy {
            BroadcastServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val templates: TemplateService.WithRawResponse by lazy {
            TemplateServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val contacts: ContactService.WithRawResponse by lazy {
            ContactServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val groups: GroupService.WithRawResponse by lazy {
            GroupServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val businessProfile: BusinessProfileService.WithRawResponse by lazy {
            BusinessProfileServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WhatsappService.WithRawResponse =
            WhatsappServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun broadcasts(): BroadcastService.WithRawResponse = broadcasts

        override fun templates(): TemplateService.WithRawResponse = templates

        override fun contacts(): ContactService.WithRawResponse = contacts

        override fun groups(): GroupService.WithRawResponse = groups

        override fun businessProfile(): BusinessProfileService.WithRawResponse = businessProfile

        private val bulkSendHandler: Handler<WhatsappBulkSendResponse> =
            jsonHandler<WhatsappBulkSendResponse>(clientOptions.jsonMapper)

        override fun bulkSend(
            params: WhatsappBulkSendParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WhatsappBulkSendResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "whatsapp", "bulk-send")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { bulkSendHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listPhoneNumbersHandler: Handler<WhatsappListPhoneNumbersResponse> =
            jsonHandler<WhatsappListPhoneNumbersResponse>(clientOptions.jsonMapper)

        override fun listPhoneNumbers(
            params: WhatsappListPhoneNumbersParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WhatsappListPhoneNumbersResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "whatsapp", "phone-numbers")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
