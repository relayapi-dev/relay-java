// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.connect

import dev.relayapi.core.ClientOptions
import dev.relayapi.services.blocking.connect.linkedin.OrganizationService
import dev.relayapi.services.blocking.connect.linkedin.OrganizationServiceImpl
import java.util.function.Consumer

class LinkedinServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LinkedinService {

    private val withRawResponse: LinkedinService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val organizations: OrganizationService by lazy {
        OrganizationServiceImpl(clientOptions)
    }

    override fun withRawResponse(): LinkedinService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LinkedinService =
        LinkedinServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun organizations(): OrganizationService = organizations

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LinkedinService.WithRawResponse {

        private val organizations: OrganizationService.WithRawResponse by lazy {
            OrganizationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LinkedinService.WithRawResponse =
            LinkedinServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun organizations(): OrganizationService.WithRawResponse = organizations
    }
}
