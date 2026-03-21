// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.tools

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

interface ValidateService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ValidateService

    /** Check character counts against platform limits */
    fun checkPostLength(params: ValidateCheckPostLengthParams): ValidateCheckPostLengthResponse =
        checkPostLength(params, RequestOptions.none())

    /** @see checkPostLength */
    fun checkPostLength(
        params: ValidateCheckPostLengthParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ValidateCheckPostLengthResponse

    /** Check if a subreddit exists and get its details */
    fun retrieveSubreddit(
        params: ValidateRetrieveSubredditParams
    ): ValidateRetrieveSubredditResponse = retrieveSubreddit(params, RequestOptions.none())

    /** @see retrieveSubreddit */
    fun retrieveSubreddit(
        params: ValidateRetrieveSubredditParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ValidateRetrieveSubredditResponse

    /** Validate a media URL for platform compatibility */
    fun validateMedia(params: ValidateValidateMediaParams): ValidateValidateMediaResponse =
        validateMedia(params, RequestOptions.none())

    /** @see validateMedia */
    fun validateMedia(
        params: ValidateValidateMediaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ValidateValidateMediaResponse

    /** Validate a post (dry-run without publishing) */
    fun validatePost(params: ValidateValidatePostParams): ValidateValidatePostResponse =
        validatePost(params, RequestOptions.none())

    /** @see validatePost */
    fun validatePost(
        params: ValidateValidatePostParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ValidateValidatePostResponse

    /** A view of [ValidateService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ValidateService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/tools/validate/post-length`, but is otherwise
         * the same as [ValidateService.checkPostLength].
         */
        @MustBeClosed
        fun checkPostLength(
            params: ValidateCheckPostLengthParams
        ): HttpResponseFor<ValidateCheckPostLengthResponse> =
            checkPostLength(params, RequestOptions.none())

        /** @see checkPostLength */
        @MustBeClosed
        fun checkPostLength(
            params: ValidateCheckPostLengthParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ValidateCheckPostLengthResponse>

        /**
         * Returns a raw HTTP response for `get /v1/tools/validate/subreddit`, but is otherwise the
         * same as [ValidateService.retrieveSubreddit].
         */
        @MustBeClosed
        fun retrieveSubreddit(
            params: ValidateRetrieveSubredditParams
        ): HttpResponseFor<ValidateRetrieveSubredditResponse> =
            retrieveSubreddit(params, RequestOptions.none())

        /** @see retrieveSubreddit */
        @MustBeClosed
        fun retrieveSubreddit(
            params: ValidateRetrieveSubredditParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ValidateRetrieveSubredditResponse>

        /**
         * Returns a raw HTTP response for `post /v1/tools/validate/media`, but is otherwise the
         * same as [ValidateService.validateMedia].
         */
        @MustBeClosed
        fun validateMedia(
            params: ValidateValidateMediaParams
        ): HttpResponseFor<ValidateValidateMediaResponse> =
            validateMedia(params, RequestOptions.none())

        /** @see validateMedia */
        @MustBeClosed
        fun validateMedia(
            params: ValidateValidateMediaParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ValidateValidateMediaResponse>

        /**
         * Returns a raw HTTP response for `post /v1/tools/validate/post`, but is otherwise the same
         * as [ValidateService.validatePost].
         */
        @MustBeClosed
        fun validatePost(
            params: ValidateValidatePostParams
        ): HttpResponseFor<ValidateValidatePostResponse> =
            validatePost(params, RequestOptions.none())

        /** @see validatePost */
        @MustBeClosed
        fun validatePost(
            params: ValidateValidatePostParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ValidateValidatePostResponse>
    }
}
