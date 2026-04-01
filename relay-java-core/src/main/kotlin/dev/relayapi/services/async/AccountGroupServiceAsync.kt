// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async

import dev.relayapi.core.ClientOptions
import java.util.function.Consumer

interface AccountGroupServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountGroupServiceAsync

    /**
     * A view of [AccountGroupServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccountGroupServiceAsync.WithRawResponse
    }
}
