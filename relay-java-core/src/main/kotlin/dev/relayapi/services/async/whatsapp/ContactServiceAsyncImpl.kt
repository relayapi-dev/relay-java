// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.whatsapp

import dev.relayapi.core.ClientOptions
import java.util.function.Consumer

class ContactServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ContactServiceAsync {

    private val withRawResponse: ContactServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ContactServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ContactServiceAsync =
        ContactServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ContactServiceAsync.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ContactServiceAsync.WithRawResponse =
            ContactServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
