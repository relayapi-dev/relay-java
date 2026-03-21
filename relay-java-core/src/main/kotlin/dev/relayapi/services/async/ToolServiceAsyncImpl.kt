// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async

import dev.relayapi.core.ClientOptions
import dev.relayapi.services.async.tools.InstagramServiceAsync
import dev.relayapi.services.async.tools.InstagramServiceAsyncImpl
import dev.relayapi.services.async.tools.ValidateServiceAsync
import dev.relayapi.services.async.tools.ValidateServiceAsyncImpl
import java.util.function.Consumer

class ToolServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ToolServiceAsync {

    private val withRawResponse: ToolServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val validate: ValidateServiceAsync by lazy { ValidateServiceAsyncImpl(clientOptions) }

    private val instagram: InstagramServiceAsync by lazy {
        InstagramServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): ToolServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ToolServiceAsync =
        ToolServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun validate(): ValidateServiceAsync = validate

    override fun instagram(): InstagramServiceAsync = instagram

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ToolServiceAsync.WithRawResponse {

        private val validate: ValidateServiceAsync.WithRawResponse by lazy {
            ValidateServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val instagram: InstagramServiceAsync.WithRawResponse by lazy {
            InstagramServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ToolServiceAsync.WithRawResponse =
            ToolServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun validate(): ValidateServiceAsync.WithRawResponse = validate

        override fun instagram(): InstagramServiceAsync.WithRawResponse = instagram
    }
}
