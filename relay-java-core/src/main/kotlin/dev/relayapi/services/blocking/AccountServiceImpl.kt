// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking

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
import dev.relayapi.core.prepare
import dev.relayapi.models.accounts.AccountDeleteParams
import dev.relayapi.models.accounts.AccountListParams
import dev.relayapi.models.accounts.AccountListResponse
import dev.relayapi.models.accounts.AccountRetrieveParams
import dev.relayapi.models.accounts.AccountRetrieveResponse
import dev.relayapi.models.accounts.AccountUpdateParams
import dev.relayapi.models.accounts.AccountUpdateResponse
import dev.relayapi.services.blocking.accounts.FacebookPageService
import dev.relayapi.services.blocking.accounts.FacebookPageServiceImpl
import dev.relayapi.services.blocking.accounts.GmbLocationService
import dev.relayapi.services.blocking.accounts.GmbLocationServiceImpl
import dev.relayapi.services.blocking.accounts.HealthService
import dev.relayapi.services.blocking.accounts.HealthServiceImpl
import dev.relayapi.services.blocking.accounts.LinkedinOrganizationService
import dev.relayapi.services.blocking.accounts.LinkedinOrganizationServiceImpl
import dev.relayapi.services.blocking.accounts.PinterestBoardService
import dev.relayapi.services.blocking.accounts.PinterestBoardServiceImpl
import dev.relayapi.services.blocking.accounts.RedditFlairService
import dev.relayapi.services.blocking.accounts.RedditFlairServiceImpl
import dev.relayapi.services.blocking.accounts.RedditSubredditService
import dev.relayapi.services.blocking.accounts.RedditSubredditServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AccountServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AccountService {

    private val withRawResponse: AccountService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val health: HealthService by lazy { HealthServiceImpl(clientOptions) }

    private val redditFlairs: RedditFlairService by lazy { RedditFlairServiceImpl(clientOptions) }

    private val facebookPages: FacebookPageService by lazy {
        FacebookPageServiceImpl(clientOptions)
    }

    private val linkedinOrganizations: LinkedinOrganizationService by lazy {
        LinkedinOrganizationServiceImpl(clientOptions)
    }

    private val pinterestBoards: PinterestBoardService by lazy {
        PinterestBoardServiceImpl(clientOptions)
    }

    private val redditSubreddits: RedditSubredditService by lazy {
        RedditSubredditServiceImpl(clientOptions)
    }

    private val gmbLocations: GmbLocationService by lazy { GmbLocationServiceImpl(clientOptions) }

    override fun withRawResponse(): AccountService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountService =
        AccountServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun health(): HealthService = health

    override fun redditFlairs(): RedditFlairService = redditFlairs

    override fun facebookPages(): FacebookPageService = facebookPages

    override fun linkedinOrganizations(): LinkedinOrganizationService = linkedinOrganizations

    override fun pinterestBoards(): PinterestBoardService = pinterestBoards

    override fun redditSubreddits(): RedditSubredditService = redditSubreddits

    override fun gmbLocations(): GmbLocationService = gmbLocations

    override fun retrieve(
        params: AccountRetrieveParams,
        requestOptions: RequestOptions,
    ): AccountRetrieveResponse =
        // get /v1/accounts/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: AccountUpdateParams,
        requestOptions: RequestOptions,
    ): AccountUpdateResponse =
        // patch /v1/accounts/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: AccountListParams,
        requestOptions: RequestOptions,
    ): AccountListResponse =
        // get /v1/accounts
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: AccountDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/accounts/{id}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccountService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val health: HealthService.WithRawResponse by lazy {
            HealthServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val redditFlairs: RedditFlairService.WithRawResponse by lazy {
            RedditFlairServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val facebookPages: FacebookPageService.WithRawResponse by lazy {
            FacebookPageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val linkedinOrganizations: LinkedinOrganizationService.WithRawResponse by lazy {
            LinkedinOrganizationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val pinterestBoards: PinterestBoardService.WithRawResponse by lazy {
            PinterestBoardServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val redditSubreddits: RedditSubredditService.WithRawResponse by lazy {
            RedditSubredditServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val gmbLocations: GmbLocationService.WithRawResponse by lazy {
            GmbLocationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccountService.WithRawResponse =
            AccountServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun health(): HealthService.WithRawResponse = health

        override fun redditFlairs(): RedditFlairService.WithRawResponse = redditFlairs

        override fun facebookPages(): FacebookPageService.WithRawResponse = facebookPages

        override fun linkedinOrganizations(): LinkedinOrganizationService.WithRawResponse =
            linkedinOrganizations

        override fun pinterestBoards(): PinterestBoardService.WithRawResponse = pinterestBoards

        override fun redditSubreddits(): RedditSubredditService.WithRawResponse = redditSubreddits

        override fun gmbLocations(): GmbLocationService.WithRawResponse = gmbLocations

        private val retrieveHandler: Handler<AccountRetrieveResponse> =
            jsonHandler<AccountRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AccountRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "accounts", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<AccountUpdateResponse> =
            jsonHandler<AccountUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: AccountUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountUpdateResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<AccountListResponse> =
            jsonHandler<AccountListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AccountListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "accounts")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: AccountDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }
    }
}
