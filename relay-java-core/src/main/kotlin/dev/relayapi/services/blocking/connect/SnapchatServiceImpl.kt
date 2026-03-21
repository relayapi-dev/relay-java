// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.connect

import dev.relayapi.core.ClientOptions
import dev.relayapi.services.blocking.connect.snapchat.ProfileService
import dev.relayapi.services.blocking.connect.snapchat.ProfileServiceImpl
import java.util.function.Consumer

class SnapchatServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SnapchatService {

    private val withRawResponse: SnapchatService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val profiles: ProfileService by lazy { ProfileServiceImpl(clientOptions) }

    override fun withRawResponse(): SnapchatService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SnapchatService =
        SnapchatServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun profiles(): ProfileService = profiles

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SnapchatService.WithRawResponse {

        private val profiles: ProfileService.WithRawResponse by lazy {
            ProfileServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SnapchatService.WithRawResponse =
            SnapchatServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun profiles(): ProfileService.WithRawResponse = profiles
    }
}
