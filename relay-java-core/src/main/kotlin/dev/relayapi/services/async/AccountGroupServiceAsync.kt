// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponse
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.accountgroups.AccountGroupCreateParams
import dev.relayapi.models.accountgroups.AccountGroupCreateResponse
import dev.relayapi.models.accountgroups.AccountGroupDeleteParams
import dev.relayapi.models.accountgroups.AccountGroupListParams
import dev.relayapi.models.accountgroups.AccountGroupListResponse
import dev.relayapi.models.accountgroups.AccountGroupUpdateParams
import dev.relayapi.models.accountgroups.AccountGroupUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AccountGroupServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountGroupServiceAsync

    /** Create an account group */
    fun create(params: AccountGroupCreateParams): CompletableFuture<AccountGroupCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AccountGroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountGroupCreateResponse>

    /** Update an account group */
    fun update(id: String): CompletableFuture<AccountGroupUpdateResponse> =
        update(id, AccountGroupUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: AccountGroupUpdateParams = AccountGroupUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountGroupUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: AccountGroupUpdateParams = AccountGroupUpdateParams.none(),
    ): CompletableFuture<AccountGroupUpdateResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AccountGroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountGroupUpdateResponse>

    /** @see update */
    fun update(params: AccountGroupUpdateParams): CompletableFuture<AccountGroupUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountGroupUpdateResponse> =
        update(id, AccountGroupUpdateParams.none(), requestOptions)

    /** List account groups */
    fun list(): CompletableFuture<AccountGroupListResponse> = list(AccountGroupListParams.none())

    /** @see list */
    fun list(
        params: AccountGroupListParams = AccountGroupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountGroupListResponse>

    /** @see list */
    fun list(
        params: AccountGroupListParams = AccountGroupListParams.none()
    ): CompletableFuture<AccountGroupListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AccountGroupListResponse> =
        list(AccountGroupListParams.none(), requestOptions)

    /** Delete an account group */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, AccountGroupDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: AccountGroupDeleteParams = AccountGroupDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: AccountGroupDeleteParams = AccountGroupDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AccountGroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: AccountGroupDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, AccountGroupDeleteParams.none(), requestOptions)

    /**
     * A view of [AccountGroupServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccountGroupServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/account-groups`, but is otherwise the same as
         * [AccountGroupServiceAsync.create].
         */
        fun create(
            params: AccountGroupCreateParams
        ): CompletableFuture<HttpResponseFor<AccountGroupCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AccountGroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountGroupCreateResponse>>

        /**
         * Returns a raw HTTP response for `put /v1/account-groups/{id}`, but is otherwise the same
         * as [AccountGroupServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<AccountGroupUpdateResponse>> =
            update(id, AccountGroupUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: AccountGroupUpdateParams = AccountGroupUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountGroupUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: AccountGroupUpdateParams = AccountGroupUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<AccountGroupUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: AccountGroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountGroupUpdateResponse>>

        /** @see update */
        fun update(
            params: AccountGroupUpdateParams
        ): CompletableFuture<HttpResponseFor<AccountGroupUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountGroupUpdateResponse>> =
            update(id, AccountGroupUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/account-groups`, but is otherwise the same as
         * [AccountGroupServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AccountGroupListResponse>> =
            list(AccountGroupListParams.none())

        /** @see list */
        fun list(
            params: AccountGroupListParams = AccountGroupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountGroupListResponse>>

        /** @see list */
        fun list(
            params: AccountGroupListParams = AccountGroupListParams.none()
        ): CompletableFuture<HttpResponseFor<AccountGroupListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AccountGroupListResponse>> =
            list(AccountGroupListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/account-groups/{id}`, but is otherwise the
         * same as [AccountGroupServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, AccountGroupDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: AccountGroupDeleteParams = AccountGroupDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: AccountGroupDeleteParams = AccountGroupDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: AccountGroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: AccountGroupDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, AccountGroupDeleteParams.none(), requestOptions)
    }
}
