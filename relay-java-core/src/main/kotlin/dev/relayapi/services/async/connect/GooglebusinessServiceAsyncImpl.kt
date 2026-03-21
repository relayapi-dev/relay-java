// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.connect

import dev.relayapi.core.ClientOptions
import dev.relayapi.services.async.connect.googlebusiness.LocationServiceAsync
import dev.relayapi.services.async.connect.googlebusiness.LocationServiceAsyncImpl
import java.util.function.Consumer

class GooglebusinessServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : GooglebusinessServiceAsync {

    private val withRawResponse: GooglebusinessServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val locations: LocationServiceAsync by lazy { LocationServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): GooglebusinessServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): GooglebusinessServiceAsync =
        GooglebusinessServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun locations(): LocationServiceAsync = locations

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GooglebusinessServiceAsync.WithRawResponse {

        private val locations: LocationServiceAsync.WithRawResponse by lazy {
            LocationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GooglebusinessServiceAsync.WithRawResponse =
            GooglebusinessServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun locations(): LocationServiceAsync.WithRawResponse = locations
    }
}
