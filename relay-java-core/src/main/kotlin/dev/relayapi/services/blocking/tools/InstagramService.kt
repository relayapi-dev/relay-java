// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.tools

import com.google.errorprone.annotations.MustBeClosed
import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.tools.instagram.InstagramCheckHashtagSafetyParams
import dev.relayapi.models.tools.instagram.InstagramCheckHashtagSafetyResponse
import java.util.function.Consumer

interface InstagramService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InstagramService

    /** Check Instagram hashtag safety status */
    fun checkHashtagSafety(
        params: InstagramCheckHashtagSafetyParams
    ): InstagramCheckHashtagSafetyResponse = checkHashtagSafety(params, RequestOptions.none())

    /** @see checkHashtagSafety */
    fun checkHashtagSafety(
        params: InstagramCheckHashtagSafetyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InstagramCheckHashtagSafetyResponse

    /** A view of [InstagramService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): InstagramService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/tools/instagram/hashtag-checker`, but is
         * otherwise the same as [InstagramService.checkHashtagSafety].
         */
        @MustBeClosed
        fun checkHashtagSafety(
            params: InstagramCheckHashtagSafetyParams
        ): HttpResponseFor<InstagramCheckHashtagSafetyResponse> =
            checkHashtagSafety(params, RequestOptions.none())

        /** @see checkHashtagSafety */
        @MustBeClosed
        fun checkHashtagSafety(
            params: InstagramCheckHashtagSafetyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InstagramCheckHashtagSafetyResponse>
    }
}
