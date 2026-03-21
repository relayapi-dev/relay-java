// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.connect

import dev.relayapi.core.ClientOptions
import dev.relayapi.services.async.connect.pinterest.BoardServiceAsync
import dev.relayapi.services.async.connect.pinterest.BoardServiceAsyncImpl
import java.util.function.Consumer

class PinterestServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PinterestServiceAsync {

    private val withRawResponse: PinterestServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val boards: BoardServiceAsync by lazy { BoardServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): PinterestServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PinterestServiceAsync =
        PinterestServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun boards(): BoardServiceAsync = boards

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PinterestServiceAsync.WithRawResponse {

        private val boards: BoardServiceAsync.WithRawResponse by lazy {
            BoardServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PinterestServiceAsync.WithRawResponse =
            PinterestServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun boards(): BoardServiceAsync.WithRawResponse = boards
    }
}
