// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.connect

import dev.relayapi.core.ClientOptions
import dev.relayapi.services.blocking.connect.googlebusiness.LocationService
import java.util.function.Consumer

interface GooglebusinessService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GooglebusinessService

    fun locations(): LocationService

    /**
     * A view of [GooglebusinessService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GooglebusinessService.WithRawResponse

        fun locations(): LocationService.WithRawResponse
    }
}
