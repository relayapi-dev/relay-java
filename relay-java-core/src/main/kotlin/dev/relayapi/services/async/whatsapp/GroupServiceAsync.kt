// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.whatsapp

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponse
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.whatsapp.groups.GroupCreateParams
import dev.relayapi.models.whatsapp.groups.GroupCreateResponse
import dev.relayapi.models.whatsapp.groups.GroupDeleteParams
import dev.relayapi.models.whatsapp.groups.GroupListParams
import dev.relayapi.models.whatsapp.groups.GroupListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface GroupServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GroupServiceAsync

    /** Create a contact group */
    fun create(params: GroupCreateParams): CompletableFuture<GroupCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: GroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GroupCreateResponse>

    /** List contact groups */
    fun list(params: GroupListParams): CompletableFuture<GroupListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: GroupListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GroupListResponse>

    /** Delete a contact group */
    fun delete(groupId: String): CompletableFuture<Void?> =
        delete(groupId, GroupDeleteParams.none())

    /** @see delete */
    fun delete(
        groupId: String,
        params: GroupDeleteParams = GroupDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().groupId(groupId).build(), requestOptions)

    /** @see delete */
    fun delete(
        groupId: String,
        params: GroupDeleteParams = GroupDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(groupId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: GroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: GroupDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(groupId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(groupId, GroupDeleteParams.none(), requestOptions)

    /** A view of [GroupServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GroupServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/whatsapp/groups`, but is otherwise the same as
         * [GroupServiceAsync.create].
         */
        fun create(
            params: GroupCreateParams
        ): CompletableFuture<HttpResponseFor<GroupCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: GroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GroupCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/whatsapp/groups`, but is otherwise the same as
         * [GroupServiceAsync.list].
         */
        fun list(params: GroupListParams): CompletableFuture<HttpResponseFor<GroupListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: GroupListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GroupListResponse>>

        /**
         * Returns a raw HTTP response for `delete /v1/whatsapp/groups/{group_id}`, but is otherwise
         * the same as [GroupServiceAsync.delete].
         */
        fun delete(groupId: String): CompletableFuture<HttpResponse> =
            delete(groupId, GroupDeleteParams.none())

        /** @see delete */
        fun delete(
            groupId: String,
            params: GroupDeleteParams = GroupDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().groupId(groupId).build(), requestOptions)

        /** @see delete */
        fun delete(
            groupId: String,
            params: GroupDeleteParams = GroupDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(groupId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: GroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: GroupDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            groupId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(groupId, GroupDeleteParams.none(), requestOptions)
    }
}
