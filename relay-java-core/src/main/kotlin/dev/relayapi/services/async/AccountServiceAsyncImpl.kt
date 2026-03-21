// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.checkRequired
import dev.relayapi.core.handlers.emptyHandler
import dev.relayapi.core.handlers.errorBodyHandler
import dev.relayapi.core.handlers.errorHandler
import dev.relayapi.core.handlers.jsonHandler
import dev.relayapi.core.http.HttpMethod
import dev.relayapi.core.http.HttpRequest
import dev.relayapi.core.http.HttpResponse
import dev.relayapi.core.http.HttpResponse.Handler
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.core.http.json
import dev.relayapi.core.http.parseable
import dev.relayapi.core.prepareAsync
import dev.relayapi.models.accounts.AccountDeleteParams
import dev.relayapi.models.accounts.AccountListParams
import dev.relayapi.models.accounts.AccountListResponse
import dev.relayapi.models.accounts.AccountRetrieveParams
import dev.relayapi.models.accounts.AccountRetrieveResponse
import dev.relayapi.models.accounts.AccountUpdateParams
import dev.relayapi.models.accounts.AccountUpdateResponse
import dev.relayapi.services.async.accounts.FacebookPageServiceAsync
import dev.relayapi.services.async.accounts.FacebookPageServiceAsyncImpl
import dev.relayapi.services.async.accounts.GmbLocationServiceAsync
import dev.relayapi.services.async.accounts.GmbLocationServiceAsyncImpl
import dev.relayapi.services.async.accounts.HealthServiceAsync
import dev.relayapi.services.async.accounts.HealthServiceAsyncImpl
import dev.relayapi.services.async.accounts.LinkedinOrganizationServiceAsync
import dev.relayapi.services.async.accounts.LinkedinOrganizationServiceAsyncImpl
import dev.relayapi.services.async.accounts.PinterestBoardServiceAsync
import dev.relayapi.services.async.accounts.PinterestBoardServiceAsyncImpl
import dev.relayapi.services.async.accounts.RedditFlairServiceAsync
import dev.relayapi.services.async.accounts.RedditFlairServiceAsyncImpl
import dev.relayapi.services.async.accounts.RedditSubredditServiceAsync
import dev.relayapi.services.async.accounts.RedditSubredditServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AccountServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AccountServiceAsync {

    private val withRawResponse: AccountServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val health: HealthServiceAsync by lazy { HealthServiceAsyncImpl(clientOptions) }

    private val redditFlairs: RedditFlairServiceAsync by lazy {
        RedditFlairServiceAsyncImpl(clientOptions)
    }

    private val facebookPages: FacebookPageServiceAsync by lazy {
        FacebookPageServiceAsyncImpl(clientOptions)
    }

    private val linkedinOrganizations: LinkedinOrganizationServiceAsync by lazy {
        LinkedinOrganizationServiceAsyncImpl(clientOptions)
    }

    private val pinterestBoards: PinterestBoardServiceAsync by lazy {
        PinterestBoardServiceAsyncImpl(clientOptions)
    }

    private val redditSubreddits: RedditSubredditServiceAsync by lazy {
        RedditSubredditServiceAsyncImpl(clientOptions)
    }

    private val gmbLocations: GmbLocationServiceAsync by lazy {
        GmbLocationServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): AccountServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountServiceAsync =
        AccountServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun health(): HealthServiceAsync = health

    override fun redditFlairs(): RedditFlairServiceAsync = redditFlairs

    override fun facebookPages(): FacebookPageServiceAsync = facebookPages

    override fun linkedinOrganizations(): LinkedinOrganizationServiceAsync = linkedinOrganizations

    override fun pinterestBoards(): PinterestBoardServiceAsync = pinterestBoards

    override fun redditSubreddits(): RedditSubredditServiceAsync = redditSubreddits

    override fun gmbLocations(): GmbLocationServiceAsync = gmbLocations

    override fun retrieve(
        params: AccountRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountRetrieveResponse> =
        // get /v1/accounts/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: AccountUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountUpdateResponse> =
        // patch /v1/accounts/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: AccountListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountListResponse> =
        // get /v1/accounts
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: AccountDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /v1/accounts/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccountServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val health: HealthServiceAsync.WithRawResponse by lazy {
            HealthServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val redditFlairs: RedditFlairServiceAsync.WithRawResponse by lazy {
            RedditFlairServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val facebookPages: FacebookPageServiceAsync.WithRawResponse by lazy {
            FacebookPageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val linkedinOrganizations:
            LinkedinOrganizationServiceAsync.WithRawResponse by lazy {
            LinkedinOrganizationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val pinterestBoards: PinterestBoardServiceAsync.WithRawResponse by lazy {
            PinterestBoardServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val redditSubreddits: RedditSubredditServiceAsync.WithRawResponse by lazy {
            RedditSubredditServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val gmbLocations: GmbLocationServiceAsync.WithRawResponse by lazy {
            GmbLocationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccountServiceAsync.WithRawResponse =
            AccountServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun health(): HealthServiceAsync.WithRawResponse = health

        override fun redditFlairs(): RedditFlairServiceAsync.WithRawResponse = redditFlairs

        override fun facebookPages(): FacebookPageServiceAsync.WithRawResponse = facebookPages

        override fun linkedinOrganizations(): LinkedinOrganizationServiceAsync.WithRawResponse =
            linkedinOrganizations

        override fun pinterestBoards(): PinterestBoardServiceAsync.WithRawResponse = pinterestBoards

        override fun redditSubreddits(): RedditSubredditServiceAsync.WithRawResponse =
            redditSubreddits

        override fun gmbLocations(): GmbLocationServiceAsync.WithRawResponse = gmbLocations

        private val retrieveHandler: Handler<AccountRetrieveResponse> =
            jsonHandler<AccountRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AccountRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "accounts", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<AccountUpdateResponse> =
            jsonHandler<AccountUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: AccountUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "accounts", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<AccountListResponse> =
            jsonHandler<AccountListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AccountListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "accounts")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: AccountDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "accounts", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }
    }
}
