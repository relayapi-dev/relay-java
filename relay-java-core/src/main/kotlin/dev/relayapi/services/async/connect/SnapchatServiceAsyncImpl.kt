// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.connect

import dev.relayapi.core.ClientOptions
import dev.relayapi.services.async.connect.snapchat.ProfileServiceAsync
import dev.relayapi.services.async.connect.snapchat.ProfileServiceAsyncImpl
import java.util.function.Consumer

class SnapchatServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SnapchatServiceAsync {

    private val withRawResponse: SnapchatServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val profiles: ProfileServiceAsync by lazy { ProfileServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): SnapchatServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SnapchatServiceAsync =
        SnapchatServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun profiles(): ProfileServiceAsync = profiles

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SnapchatServiceAsync.WithRawResponse {

        private val profiles: ProfileServiceAsync.WithRawResponse by lazy {
            ProfileServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SnapchatServiceAsync.WithRawResponse =
            SnapchatServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun profiles(): ProfileServiceAsync.WithRawResponse = profiles
    }
}
