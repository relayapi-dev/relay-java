// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.connect.snapchat

import com.google.errorprone.annotations.MustBeClosed
import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.connect.snapchat.profiles.ProfileListParams
import dev.relayapi.models.connect.snapchat.profiles.ProfileListResponse
import dev.relayapi.models.connect.snapchat.profiles.ProfileSelectParams
import dev.relayapi.models.connect.snapchat.profiles.ProfileSelectResponse
import java.util.function.Consumer

interface ProfileService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProfileService

    /** List Snapchat Public Profiles after OAuth */
    fun list(): ProfileListResponse = list(ProfileListParams.none())

    /** @see list */
    fun list(
        params: ProfileListParams = ProfileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProfileListResponse

    /** @see list */
    fun list(params: ProfileListParams = ProfileListParams.none()): ProfileListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ProfileListResponse =
        list(ProfileListParams.none(), requestOptions)

    /** Select Snapchat Public Profile */
    fun select(params: ProfileSelectParams): ProfileSelectResponse =
        select(params, RequestOptions.none())

    /** @see select */
    fun select(
        params: ProfileSelectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProfileSelectResponse

    /** A view of [ProfileService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProfileService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/connect/snapchat/profiles`, but is otherwise the
         * same as [ProfileService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ProfileListResponse> = list(ProfileListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ProfileListParams = ProfileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProfileListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ProfileListParams = ProfileListParams.none()
        ): HttpResponseFor<ProfileListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ProfileListResponse> =
            list(ProfileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/connect/snapchat/profiles`, but is otherwise
         * the same as [ProfileService.select].
         */
        @MustBeClosed
        fun select(params: ProfileSelectParams): HttpResponseFor<ProfileSelectResponse> =
            select(params, RequestOptions.none())

        /** @see select */
        @MustBeClosed
        fun select(
            params: ProfileSelectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProfileSelectResponse>
    }
}
