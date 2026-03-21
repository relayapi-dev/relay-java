// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.tools

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.tools.instagram.InstagramCheckHashtagSafetyParams
import dev.relayapi.models.tools.instagram.InstagramCheckHashtagSafetyResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface InstagramServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InstagramServiceAsync

    /** Check Instagram hashtag safety status */
    fun checkHashtagSafety(
        params: InstagramCheckHashtagSafetyParams
    ): CompletableFuture<InstagramCheckHashtagSafetyResponse> =
        checkHashtagSafety(params, RequestOptions.none())

    /** @see checkHashtagSafety */
    fun checkHashtagSafety(
        params: InstagramCheckHashtagSafetyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InstagramCheckHashtagSafetyResponse>

    /**
     * A view of [InstagramServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InstagramServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/tools/instagram/hashtag-checker`, but is
         * otherwise the same as [InstagramServiceAsync.checkHashtagSafety].
         */
        fun checkHashtagSafety(
            params: InstagramCheckHashtagSafetyParams
        ): CompletableFuture<HttpResponseFor<InstagramCheckHashtagSafetyResponse>> =
            checkHashtagSafety(params, RequestOptions.none())

        /** @see checkHashtagSafety */
        fun checkHashtagSafety(
            params: InstagramCheckHashtagSafetyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InstagramCheckHashtagSafetyResponse>>
    }
}
