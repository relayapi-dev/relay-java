// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.connect

import dev.relayapi.core.ClientOptions
import dev.relayapi.services.async.connect.facebook.PageServiceAsync
import dev.relayapi.services.async.connect.facebook.PageServiceAsyncImpl
import java.util.function.Consumer

class FacebookServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    FacebookServiceAsync {

    private val withRawResponse: FacebookServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val pages: PageServiceAsync by lazy { PageServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): FacebookServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FacebookServiceAsync =
        FacebookServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun pages(): PageServiceAsync = pages

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FacebookServiceAsync.WithRawResponse {

        private val pages: PageServiceAsync.WithRawResponse by lazy {
            PageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FacebookServiceAsync.WithRawResponse =
            FacebookServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun pages(): PageServiceAsync.WithRawResponse = pages
    }
}
