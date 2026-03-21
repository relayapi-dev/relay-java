// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.connect

import dev.relayapi.core.ClientOptions
import dev.relayapi.services.async.connect.linkedin.OrganizationServiceAsync
import dev.relayapi.services.async.connect.linkedin.OrganizationServiceAsyncImpl
import java.util.function.Consumer

class LinkedinServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    LinkedinServiceAsync {

    private val withRawResponse: LinkedinServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val organizations: OrganizationServiceAsync by lazy {
        OrganizationServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): LinkedinServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LinkedinServiceAsync =
        LinkedinServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun organizations(): OrganizationServiceAsync = organizations

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LinkedinServiceAsync.WithRawResponse {

        private val organizations: OrganizationServiceAsync.WithRawResponse by lazy {
            OrganizationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LinkedinServiceAsync.WithRawResponse =
            LinkedinServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun organizations(): OrganizationServiceAsync.WithRawResponse = organizations
    }
}
