// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking

import dev.relayapi.core.ClientOptions
import dev.relayapi.services.blocking.tools.InstagramService
import dev.relayapi.services.blocking.tools.InstagramServiceImpl
import dev.relayapi.services.blocking.tools.ValidateService
import dev.relayapi.services.blocking.tools.ValidateServiceImpl
import java.util.function.Consumer

class ToolServiceImpl internal constructor(private val clientOptions: ClientOptions) : ToolService {

    private val withRawResponse: ToolService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val validate: ValidateService by lazy { ValidateServiceImpl(clientOptions) }

    private val instagram: InstagramService by lazy { InstagramServiceImpl(clientOptions) }

    override fun withRawResponse(): ToolService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ToolService =
        ToolServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun validate(): ValidateService = validate

    override fun instagram(): InstagramService = instagram

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ToolService.WithRawResponse {

        private val validate: ValidateService.WithRawResponse by lazy {
            ValidateServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val instagram: InstagramService.WithRawResponse by lazy {
            InstagramServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ToolService.WithRawResponse =
            ToolServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun validate(): ValidateService.WithRawResponse = validate

        override fun instagram(): InstagramService.WithRawResponse = instagram
    }
}
