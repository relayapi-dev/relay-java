// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking

import dev.relayapi.core.ClientOptions
import java.util.function.Consumer

class AccountGroupServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AccountGroupService {

    private val withRawResponse: AccountGroupService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AccountGroupService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountGroupService =
        AccountGroupServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccountGroupService.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccountGroupService.WithRawResponse =
            AccountGroupServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
