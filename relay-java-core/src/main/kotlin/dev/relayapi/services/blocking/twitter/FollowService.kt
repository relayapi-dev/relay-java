// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.twitter

import com.google.errorprone.annotations.MustBeClosed
import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.twitter.follow.FollowCreateParams
import dev.relayapi.models.twitter.follow.FollowCreateResponse
import dev.relayapi.models.twitter.follow.FollowUnfollowParams
import dev.relayapi.models.twitter.follow.FollowUnfollowResponse
import java.util.function.Consumer

interface FollowService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FollowService

    /** Follow a user */
    fun create(params: FollowCreateParams): FollowCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FollowCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FollowCreateResponse

    /** Unfollow a user */
    fun unfollow(params: FollowUnfollowParams): FollowUnfollowResponse =
        unfollow(params, RequestOptions.none())

    /** @see unfollow */
    fun unfollow(
        params: FollowUnfollowParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FollowUnfollowResponse

    /** A view of [FollowService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FollowService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/twitter/follow`, but is otherwise the same as
         * [FollowService.create].
         */
        @MustBeClosed
        fun create(params: FollowCreateParams): HttpResponseFor<FollowCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: FollowCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FollowCreateResponse>

        /**
         * Returns a raw HTTP response for `delete /v1/twitter/follow`, but is otherwise the same as
         * [FollowService.unfollow].
         */
        @MustBeClosed
        fun unfollow(params: FollowUnfollowParams): HttpResponseFor<FollowUnfollowResponse> =
            unfollow(params, RequestOptions.none())

        /** @see unfollow */
        @MustBeClosed
        fun unfollow(
            params: FollowUnfollowParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FollowUnfollowResponse>
    }
}
