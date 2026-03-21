// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponse
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.accounts.AccountDeleteParams
import dev.relayapi.models.accounts.AccountListParams
import dev.relayapi.models.accounts.AccountListResponse
import dev.relayapi.models.accounts.AccountRetrieveParams
import dev.relayapi.models.accounts.AccountRetrieveResponse
import dev.relayapi.models.accounts.AccountUpdateParams
import dev.relayapi.models.accounts.AccountUpdateResponse
import dev.relayapi.services.blocking.accounts.FacebookPageService
import dev.relayapi.services.blocking.accounts.GmbLocationService
import dev.relayapi.services.blocking.accounts.HealthService
import dev.relayapi.services.blocking.accounts.LinkedinOrganizationService
import dev.relayapi.services.blocking.accounts.PinterestBoardService
import dev.relayapi.services.blocking.accounts.RedditFlairService
import dev.relayapi.services.blocking.accounts.RedditSubredditService
import java.util.function.Consumer

interface AccountService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountService

    fun health(): HealthService

    fun redditFlairs(): RedditFlairService

    fun facebookPages(): FacebookPageService

    fun linkedinOrganizations(): LinkedinOrganizationService

    fun pinterestBoards(): PinterestBoardService

    fun redditSubreddits(): RedditSubredditService

    fun gmbLocations(): GmbLocationService

    /** Get a connected account */
    fun retrieve(id: String): AccountRetrieveResponse = retrieve(id, AccountRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AccountRetrieveParams = AccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AccountRetrieveParams = AccountRetrieveParams.none(),
    ): AccountRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: AccountRetrieveParams): AccountRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): AccountRetrieveResponse =
        retrieve(id, AccountRetrieveParams.none(), requestOptions)

    /** Update account metadata */
    fun update(id: String): AccountUpdateResponse = update(id, AccountUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: AccountUpdateParams = AccountUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: AccountUpdateParams = AccountUpdateParams.none(),
    ): AccountUpdateResponse = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountUpdateResponse

    /** @see update */
    fun update(params: AccountUpdateParams): AccountUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): AccountUpdateResponse =
        update(id, AccountUpdateParams.none(), requestOptions)

    /** List connected accounts */
    fun list(): AccountListResponse = list(AccountListParams.none())

    /** @see list */
    fun list(
        params: AccountListParams = AccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountListResponse

    /** @see list */
    fun list(params: AccountListParams = AccountListParams.none()): AccountListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AccountListResponse =
        list(AccountListParams.none(), requestOptions)

    /** Disconnect a social account */
    fun delete(id: String) = delete(id, AccountDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: AccountDeleteParams = AccountDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: AccountDeleteParams = AccountDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: AccountDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: AccountDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, AccountDeleteParams.none(), requestOptions)

    /** A view of [AccountService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountService.WithRawResponse

        fun health(): HealthService.WithRawResponse

        fun redditFlairs(): RedditFlairService.WithRawResponse

        fun facebookPages(): FacebookPageService.WithRawResponse

        fun linkedinOrganizations(): LinkedinOrganizationService.WithRawResponse

        fun pinterestBoards(): PinterestBoardService.WithRawResponse

        fun redditSubreddits(): RedditSubredditService.WithRawResponse

        fun gmbLocations(): GmbLocationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/accounts/{id}`, but is otherwise the same as
         * [AccountService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<AccountRetrieveResponse> =
            retrieve(id, AccountRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AccountRetrieveParams = AccountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AccountRetrieveParams = AccountRetrieveParams.none(),
        ): HttpResponseFor<AccountRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AccountRetrieveParams): HttpResponseFor<AccountRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountRetrieveResponse> =
            retrieve(id, AccountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/accounts/{id}`, but is otherwise the same as
         * [AccountService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<AccountUpdateResponse> =
            update(id, AccountUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: AccountUpdateParams = AccountUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: AccountUpdateParams = AccountUpdateParams.none(),
        ): HttpResponseFor<AccountUpdateResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: AccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: AccountUpdateParams): HttpResponseFor<AccountUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountUpdateResponse> =
            update(id, AccountUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/accounts`, but is otherwise the same as
         * [AccountService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<AccountListResponse> = list(AccountListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AccountListParams = AccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AccountListParams = AccountListParams.none()
        ): HttpResponseFor<AccountListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AccountListResponse> =
            list(AccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/accounts/{id}`, but is otherwise the same as
         * [AccountService.delete].
         */
        @MustBeClosed fun delete(id: String): HttpResponse = delete(id, AccountDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: AccountDeleteParams = AccountDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: AccountDeleteParams = AccountDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AccountDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: AccountDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, AccountDeleteParams.none(), requestOptions)
    }
}
