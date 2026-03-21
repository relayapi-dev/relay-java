// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.twitter

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.twitter.follow.FollowCreateParams
import dev.relayapi.models.twitter.follow.FollowCreateResponse
import dev.relayapi.models.twitter.follow.FollowUnfollowParams
import dev.relayapi.models.twitter.follow.FollowUnfollowResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FollowServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FollowServiceAsync

    /** Follow a user */
    fun create(params: FollowCreateParams): CompletableFuture<FollowCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FollowCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FollowCreateResponse>

    /** Unfollow a user */
    fun unfollow(params: FollowUnfollowParams): CompletableFuture<FollowUnfollowResponse> =
        unfollow(params, RequestOptions.none())

    /** @see unfollow */
    fun unfollow(
        params: FollowUnfollowParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FollowUnfollowResponse>

    /**
     * A view of [FollowServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FollowServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/twitter/follow`, but is otherwise the same as
         * [FollowServiceAsync.create].
         */
        fun create(
            params: FollowCreateParams
        ): CompletableFuture<HttpResponseFor<FollowCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: FollowCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FollowCreateResponse>>

        /**
         * Returns a raw HTTP response for `delete /v1/twitter/follow`, but is otherwise the same as
         * [FollowServiceAsync.unfollow].
         */
        fun unfollow(
            params: FollowUnfollowParams
        ): CompletableFuture<HttpResponseFor<FollowUnfollowResponse>> =
            unfollow(params, RequestOptions.none())

        /** @see unfollow */
        fun unfollow(
            params: FollowUnfollowParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FollowUnfollowResponse>>
    }
}
