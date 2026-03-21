// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.connect

import dev.relayapi.core.ClientOptions
import dev.relayapi.services.blocking.connect.facebook.PageService
import dev.relayapi.services.blocking.connect.facebook.PageServiceImpl
import java.util.function.Consumer

class FacebookServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    FacebookService {

    private val withRawResponse: FacebookService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val pages: PageService by lazy { PageServiceImpl(clientOptions) }

    override fun withRawResponse(): FacebookService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FacebookService =
        FacebookServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun pages(): PageService = pages

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FacebookService.WithRawResponse {

        private val pages: PageService.WithRawResponse by lazy {
            PageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FacebookService.WithRawResponse =
            FacebookServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun pages(): PageService.WithRawResponse = pages
    }
}
