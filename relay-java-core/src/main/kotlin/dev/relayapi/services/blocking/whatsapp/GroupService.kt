// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.whatsapp

import com.google.errorprone.annotations.MustBeClosed
import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponse
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.whatsapp.groups.GroupCreateParams
import dev.relayapi.models.whatsapp.groups.GroupCreateResponse
import dev.relayapi.models.whatsapp.groups.GroupDeleteParams
import dev.relayapi.models.whatsapp.groups.GroupListParams
import dev.relayapi.models.whatsapp.groups.GroupListResponse
import java.util.function.Consumer

interface GroupService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GroupService

    /** Create a contact group */
    fun create(params: GroupCreateParams): GroupCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: GroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GroupCreateResponse

    /** List contact groups */
    fun list(params: GroupListParams): GroupListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: GroupListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GroupListResponse

    /** Delete a contact group */
    fun delete(groupId: String) = delete(groupId, GroupDeleteParams.none())

    /** @see delete */
    fun delete(
        groupId: String,
        params: GroupDeleteParams = GroupDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().groupId(groupId).build(), requestOptions)

    /** @see delete */
    fun delete(groupId: String, params: GroupDeleteParams = GroupDeleteParams.none()) =
        delete(groupId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: GroupDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: GroupDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(groupId: String, requestOptions: RequestOptions) =
        delete(groupId, GroupDeleteParams.none(), requestOptions)

    /** A view of [GroupService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): GroupService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/whatsapp/groups`, but is otherwise the same as
         * [GroupService.create].
         */
        @MustBeClosed
        fun create(params: GroupCreateParams): HttpResponseFor<GroupCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: GroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GroupCreateResponse>

        /**
         * Returns a raw HTTP response for `get /v1/whatsapp/groups`, but is otherwise the same as
         * [GroupService.list].
         */
        @MustBeClosed
        fun list(params: GroupListParams): HttpResponseFor<GroupListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: GroupListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GroupListResponse>

        /**
         * Returns a raw HTTP response for `delete /v1/whatsapp/groups/{group_id}`, but is otherwise
         * the same as [GroupService.delete].
         */
        @MustBeClosed
        fun delete(groupId: String): HttpResponse = delete(groupId, GroupDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            groupId: String,
            params: GroupDeleteParams = GroupDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().groupId(groupId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            groupId: String,
            params: GroupDeleteParams = GroupDeleteParams.none(),
        ): HttpResponse = delete(groupId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: GroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: GroupDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(groupId: String, requestOptions: RequestOptions): HttpResponse =
            delete(groupId, GroupDeleteParams.none(), requestOptions)
    }
}
