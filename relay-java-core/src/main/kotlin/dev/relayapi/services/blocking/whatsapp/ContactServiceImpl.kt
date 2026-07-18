// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.whatsapp

import dev.relayapi.core.ClientOptions
import java.util.function.Consumer

class ContactServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ContactService {

    private val withRawResponse: ContactService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ContactService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ContactService =
        ContactServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ContactService.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ContactService.WithRawResponse =
            ContactServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
