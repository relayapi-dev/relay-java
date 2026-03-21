// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.connect.snapchat

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.connect.snapchat.profiles.ProfileListParams
import dev.relayapi.models.connect.snapchat.profiles.ProfileListResponse
import dev.relayapi.models.connect.snapchat.profiles.ProfileSelectParams
import dev.relayapi.models.connect.snapchat.profiles.ProfileSelectResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ProfileServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProfileServiceAsync

    /** List Snapchat Public Profiles after OAuth */
    fun list(): CompletableFuture<ProfileListResponse> = list(ProfileListParams.none())

    /** @see list */
    fun list(
        params: ProfileListParams = ProfileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProfileListResponse>

    /** @see list */
    fun list(
        params: ProfileListParams = ProfileListParams.none()
    ): CompletableFuture<ProfileListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ProfileListResponse> =
        list(ProfileListParams.none(), requestOptions)

    /** Select Snapchat Public Profile */
    fun select(params: ProfileSelectParams): CompletableFuture<ProfileSelectResponse> =
        select(params, RequestOptions.none())

    /** @see select */
    fun select(
        params: ProfileSelectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProfileSelectResponse>

    /**
     * A view of [ProfileServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ProfileServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/connect/snapchat/profiles`, but is otherwise the
         * same as [ProfileServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ProfileListResponse>> =
            list(ProfileListParams.none())

        /** @see list */
        fun list(
            params: ProfileListParams = ProfileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProfileListResponse>>

        /** @see list */
        fun list(
            params: ProfileListParams = ProfileListParams.none()
        ): CompletableFuture<HttpResponseFor<ProfileListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ProfileListResponse>> =
            list(ProfileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/connect/snapchat/profiles`, but is otherwise
         * the same as [ProfileServiceAsync.select].
         */
        fun select(
            params: ProfileSelectParams
        ): CompletableFuture<HttpResponseFor<ProfileSelectResponse>> =
            select(params, RequestOptions.none())

        /** @see select */
        fun select(
            params: ProfileSelectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProfileSelectResponse>>
    }
}
