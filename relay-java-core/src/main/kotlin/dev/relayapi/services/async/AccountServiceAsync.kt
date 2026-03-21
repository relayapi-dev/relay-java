// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async

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
import dev.relayapi.services.async.accounts.FacebookPageServiceAsync
import dev.relayapi.services.async.accounts.GmbLocationServiceAsync
import dev.relayapi.services.async.accounts.HealthServiceAsync
import dev.relayapi.services.async.accounts.LinkedinOrganizationServiceAsync
import dev.relayapi.services.async.accounts.PinterestBoardServiceAsync
import dev.relayapi.services.async.accounts.RedditFlairServiceAsync
import dev.relayapi.services.async.accounts.RedditSubredditServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountServiceAsync

    fun health(): HealthServiceAsync

    fun redditFlairs(): RedditFlairServiceAsync

    fun facebookPages(): FacebookPageServiceAsync

    fun linkedinOrganizations(): LinkedinOrganizationServiceAsync

    fun pinterestBoards(): PinterestBoardServiceAsync

    fun redditSubreddits(): RedditSubredditServiceAsync

    fun gmbLocations(): GmbLocationServiceAsync

    /** Get a connected account */
    fun retrieve(id: String): CompletableFuture<AccountRetrieveResponse> =
        retrieve(id, AccountRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AccountRetrieveParams = AccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AccountRetrieveParams = AccountRetrieveParams.none(),
    ): CompletableFuture<AccountRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: AccountRetrieveParams): CompletableFuture<AccountRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountRetrieveResponse> =
        retrieve(id, AccountRetrieveParams.none(), requestOptions)

    /** Update account metadata */
    fun update(id: String): CompletableFuture<AccountUpdateResponse> =
        update(id, AccountUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: AccountUpdateParams = AccountUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: AccountUpdateParams = AccountUpdateParams.none(),
    ): CompletableFuture<AccountUpdateResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountUpdateResponse>

    /** @see update */
    fun update(params: AccountUpdateParams): CompletableFuture<AccountUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountUpdateResponse> =
        update(id, AccountUpdateParams.none(), requestOptions)

    /** List connected accounts */
    fun list(): CompletableFuture<AccountListResponse> = list(AccountListParams.none())

    /** @see list */
    fun list(
        params: AccountListParams = AccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountListResponse>

    /** @see list */
    fun list(
        params: AccountListParams = AccountListParams.none()
    ): CompletableFuture<AccountListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AccountListResponse> =
        list(AccountListParams.none(), requestOptions)

    /** Disconnect a social account */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, AccountDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: AccountDeleteParams = AccountDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: AccountDeleteParams = AccountDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AccountDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: AccountDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, AccountDeleteParams.none(), requestOptions)

    /**
     * A view of [AccountServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccountServiceAsync.WithRawResponse

        fun health(): HealthServiceAsync.WithRawResponse

        fun redditFlairs(): RedditFlairServiceAsync.WithRawResponse

        fun facebookPages(): FacebookPageServiceAsync.WithRawResponse

        fun linkedinOrganizations(): LinkedinOrganizationServiceAsync.WithRawResponse

        fun pinterestBoards(): PinterestBoardServiceAsync.WithRawResponse

        fun redditSubreddits(): RedditSubredditServiceAsync.WithRawResponse

        fun gmbLocations(): GmbLocationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/accounts/{id}`, but is otherwise the same as
         * [AccountServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<AccountRetrieveResponse>> =
            retrieve(id, AccountRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AccountRetrieveParams = AccountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AccountRetrieveParams = AccountRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AccountRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: AccountRetrieveParams
        ): CompletableFuture<HttpResponseFor<AccountRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountRetrieveResponse>> =
            retrieve(id, AccountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/accounts/{id}`, but is otherwise the same as
         * [AccountServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<AccountUpdateResponse>> =
            update(id, AccountUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: AccountUpdateParams = AccountUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: AccountUpdateParams = AccountUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<AccountUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: AccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountUpdateResponse>>

        /** @see update */
        fun update(
            params: AccountUpdateParams
        ): CompletableFuture<HttpResponseFor<AccountUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountUpdateResponse>> =
            update(id, AccountUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/accounts`, but is otherwise the same as
         * [AccountServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AccountListResponse>> =
            list(AccountListParams.none())

        /** @see list */
        fun list(
            params: AccountListParams = AccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountListResponse>>

        /** @see list */
        fun list(
            params: AccountListParams = AccountListParams.none()
        ): CompletableFuture<HttpResponseFor<AccountListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AccountListResponse>> =
            list(AccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/accounts/{id}`, but is otherwise the same as
         * [AccountServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, AccountDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: AccountDeleteParams = AccountDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: AccountDeleteParams = AccountDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: AccountDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: AccountDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, AccountDeleteParams.none(), requestOptions)
    }
}
