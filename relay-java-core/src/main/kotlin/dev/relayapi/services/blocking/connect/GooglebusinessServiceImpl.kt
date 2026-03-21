// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.connect

import dev.relayapi.core.ClientOptions
import dev.relayapi.services.blocking.connect.googlebusiness.LocationService
import dev.relayapi.services.blocking.connect.googlebusiness.LocationServiceImpl
import java.util.function.Consumer

class GooglebusinessServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    GooglebusinessService {

    private val withRawResponse: GooglebusinessService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val locations: LocationService by lazy { LocationServiceImpl(clientOptions) }

    override fun withRawResponse(): GooglebusinessService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GooglebusinessService =
        GooglebusinessServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun locations(): LocationService = locations

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GooglebusinessService.WithRawResponse {

        private val locations: LocationService.WithRawResponse by lazy {
            LocationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GooglebusinessService.WithRawResponse =
            GooglebusinessServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun locations(): LocationService.WithRawResponse = locations
    }
}
