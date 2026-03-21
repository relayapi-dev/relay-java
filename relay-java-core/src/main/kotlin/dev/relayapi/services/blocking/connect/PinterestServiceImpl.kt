// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.connect

import dev.relayapi.core.ClientOptions
import dev.relayapi.services.blocking.connect.pinterest.BoardService
import dev.relayapi.services.blocking.connect.pinterest.BoardServiceImpl
import java.util.function.Consumer

class PinterestServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PinterestService {

    private val withRawResponse: PinterestService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val boards: BoardService by lazy { BoardServiceImpl(clientOptions) }

    override fun withRawResponse(): PinterestService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PinterestService =
        PinterestServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun boards(): BoardService = boards

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PinterestService.WithRawResponse {

        private val boards: BoardService.WithRawResponse by lazy {
            BoardServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PinterestService.WithRawResponse =
            PinterestServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun boards(): BoardService.WithRawResponse = boards
    }
}
