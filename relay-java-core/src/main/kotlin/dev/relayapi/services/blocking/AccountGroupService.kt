// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

interface AccountGroupService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountGroupService

    /** Create an account group */
    fun create(params: AccountGroupCreateParams): AccountGroupCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AccountGroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountGroupCreateResponse

    /** Update an account group */
    fun update(id: String): AccountGroupUpdateResponse = update(id, AccountGroupUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: AccountGroupUpdateParams = AccountGroupUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountGroupUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: AccountGroupUpdateParams = AccountGroupUpdateParams.none(),
    ): AccountGroupUpdateResponse = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AccountGroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountGroupUpdateResponse

    /** @see update */
    fun update(params: AccountGroupUpdateParams): AccountGroupUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): AccountGroupUpdateResponse =
        update(id, AccountGroupUpdateParams.none(), requestOptions)

    /** List account groups */
    fun list(): AccountGroupListResponse = list(AccountGroupListParams.none())

    /** @see list */
    fun list(
        params: AccountGroupListParams = AccountGroupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountGroupListResponse

    /** @see list */
    fun list(
        params: AccountGroupListParams = AccountGroupListParams.none()
    ): AccountGroupListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AccountGroupListResponse =
        list(AccountGroupListParams.none(), requestOptions)

    /** Delete an account group */
    fun delete(id: String) = delete(id, AccountGroupDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: AccountGroupDeleteParams = AccountGroupDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: AccountGroupDeleteParams = AccountGroupDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AccountGroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: AccountGroupDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, AccountGroupDeleteParams.none(), requestOptions)

    /**
     * A view of [AccountGroupService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccountGroupService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/account-groups`, but is otherwise the same as
         * [AccountGroupService.create].
         */
        @MustBeClosed
        fun create(params: AccountGroupCreateParams): HttpResponseFor<AccountGroupCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AccountGroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountGroupCreateResponse>

        /**
         * Returns a raw HTTP response for `put /v1/account-groups/{id}`, but is otherwise the same
         * as [AccountGroupService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<AccountGroupUpdateResponse> =
            update(id, AccountGroupUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: AccountGroupUpdateParams = AccountGroupUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountGroupUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: AccountGroupUpdateParams = AccountGroupUpdateParams.none(),
        ): HttpResponseFor<AccountGroupUpdateResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: AccountGroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountGroupUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: AccountGroupUpdateParams): HttpResponseFor<AccountGroupUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountGroupUpdateResponse> =
            update(id, AccountGroupUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/account-groups`, but is otherwise the same as
         * [AccountGroupService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<AccountGroupListResponse> = list(AccountGroupListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AccountGroupListParams = AccountGroupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountGroupListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AccountGroupListParams = AccountGroupListParams.none()
        ): HttpResponseFor<AccountGroupListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AccountGroupListResponse> =
            list(AccountGroupListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/account-groups/{id}`, but is otherwise the
         * same as [AccountGroupService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, AccountGroupDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: AccountGroupDeleteParams = AccountGroupDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: AccountGroupDeleteParams = AccountGroupDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AccountGroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: AccountGroupDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, AccountGroupDeleteParams.none(), requestOptions)
    }
}
