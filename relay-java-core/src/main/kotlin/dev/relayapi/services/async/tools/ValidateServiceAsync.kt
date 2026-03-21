// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.tools

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.tools.validate.ValidateCheckPostLengthParams
import dev.relayapi.models.tools.validate.ValidateCheckPostLengthResponse
import dev.relayapi.models.tools.validate.ValidateRetrieveSubredditParams
import dev.relayapi.models.tools.validate.ValidateRetrieveSubredditResponse
import dev.relayapi.models.tools.validate.ValidateValidateMediaParams
import dev.relayapi.models.tools.validate.ValidateValidateMediaResponse
import dev.relayapi.models.tools.validate.ValidateValidatePostParams
import dev.relayapi.models.tools.validate.ValidateValidatePostResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ValidateServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ValidateServiceAsync

    /** Check character counts against platform limits */
    fun checkPostLength(
        params: ValidateCheckPostLengthParams
    ): CompletableFuture<ValidateCheckPostLengthResponse> =
        checkPostLength(params, RequestOptions.none())

    /** @see checkPostLength */
    fun checkPostLength(
        params: ValidateCheckPostLengthParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ValidateCheckPostLengthResponse>

    /** Check if a subreddit exists and get its details */
    fun retrieveSubreddit(
        params: ValidateRetrieveSubredditParams
    ): CompletableFuture<ValidateRetrieveSubredditResponse> =
        retrieveSubreddit(params, RequestOptions.none())

    /** @see retrieveSubreddit */
    fun retrieveSubreddit(
        params: ValidateRetrieveSubredditParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ValidateRetrieveSubredditResponse>

    /** Validate a media URL for platform compatibility */
    fun validateMedia(
        params: ValidateValidateMediaParams
    ): CompletableFuture<ValidateValidateMediaResponse> =
        validateMedia(params, RequestOptions.none())

    /** @see validateMedia */
    fun validateMedia(
        params: ValidateValidateMediaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ValidateValidateMediaResponse>

    /** Validate a post (dry-run without publishing) */
    fun validatePost(
        params: ValidateValidatePostParams
    ): CompletableFuture<ValidateValidatePostResponse> = validatePost(params, RequestOptions.none())

    /** @see validatePost */
    fun validatePost(
        params: ValidateValidatePostParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ValidateValidatePostResponse>

    /**
     * A view of [ValidateServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ValidateServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/tools/validate/post-length`, but is otherwise
         * the same as [ValidateServiceAsync.checkPostLength].
         */
        fun checkPostLength(
            params: ValidateCheckPostLengthParams
        ): CompletableFuture<HttpResponseFor<ValidateCheckPostLengthResponse>> =
            checkPostLength(params, RequestOptions.none())

        /** @see checkPostLength */
        fun checkPostLength(
            params: ValidateCheckPostLengthParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ValidateCheckPostLengthResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/tools/validate/subreddit`, but is otherwise the
         * same as [ValidateServiceAsync.retrieveSubreddit].
         */
        fun retrieveSubreddit(
            params: ValidateRetrieveSubredditParams
        ): CompletableFuture<HttpResponseFor<ValidateRetrieveSubredditResponse>> =
            retrieveSubreddit(params, RequestOptions.none())

        /** @see retrieveSubreddit */
        fun retrieveSubreddit(
            params: ValidateRetrieveSubredditParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ValidateRetrieveSubredditResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/tools/validate/media`, but is otherwise the
         * same as [ValidateServiceAsync.validateMedia].
         */
        fun validateMedia(
            params: ValidateValidateMediaParams
        ): CompletableFuture<HttpResponseFor<ValidateValidateMediaResponse>> =
            validateMedia(params, RequestOptions.none())

        /** @see validateMedia */
        fun validateMedia(
            params: ValidateValidateMediaParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ValidateValidateMediaResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/tools/validate/post`, but is otherwise the same
         * as [ValidateServiceAsync.validatePost].
         */
        fun validatePost(
            params: ValidateValidatePostParams
        ): CompletableFuture<HttpResponseFor<ValidateValidatePostResponse>> =
            validatePost(params, RequestOptions.none())

        /** @see validatePost */
        fun validatePost(
            params: ValidateValidatePostParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ValidateValidatePostResponse>>
    }
}
