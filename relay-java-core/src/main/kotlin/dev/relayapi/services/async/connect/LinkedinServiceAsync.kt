// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.connect

import dev.relayapi.core.ClientOptions
import dev.relayapi.services.async.connect.linkedin.OrganizationServiceAsync
import java.util.function.Consumer

interface LinkedinServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LinkedinServiceAsync

    fun organizations(): OrganizationServiceAsync

    /**
     * A view of [LinkedinServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LinkedinServiceAsync.WithRawResponse

        fun organizations(): OrganizationServiceAsync.WithRawResponse
    }
}
