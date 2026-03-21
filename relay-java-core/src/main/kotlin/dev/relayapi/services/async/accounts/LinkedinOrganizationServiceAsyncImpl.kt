// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.accounts

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.checkRequired
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
import dev.relayapi.models.accounts.linkedinorganizations.LinkedinOrganizationRetrieveParams
import dev.relayapi.models.accounts.linkedinorganizations.LinkedinOrganizationRetrieveResponse
import dev.relayapi.models.accounts.linkedinorganizations.LinkedinOrganizationSwitchTypeParams
import dev.relayapi.models.accounts.linkedinorganizations.LinkedinOrganizationSwitchTypeResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LinkedinOrganizationServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : LinkedinOrganizationServiceAsync {

    private val withRawResponse: LinkedinOrganizationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LinkedinOrganizationServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): LinkedinOrganizationServiceAsync =
        LinkedinOrganizationServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun retrieve(
        params: LinkedinOrganizationRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LinkedinOrganizationRetrieveResponse> =
        // get /v1/accounts/{id}/linkedin-organizations
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun switchType(
        params: LinkedinOrganizationSwitchTypeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LinkedinOrganizationSwitchTypeResponse> =
        // put /v1/accounts/{id}/linkedin-organizations
        withRawResponse().switchType(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LinkedinOrganizationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LinkedinOrganizationServiceAsync.WithRawResponse =
            LinkedinOrganizationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<LinkedinOrganizationRetrieveResponse> =
            jsonHandler<LinkedinOrganizationRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: LinkedinOrganizationRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LinkedinOrganizationRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "accounts",
                        params._pathParam(0),
                        "linkedin-organizations",
                    )
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

        private val switchTypeHandler: Handler<LinkedinOrganizationSwitchTypeResponse> =
            jsonHandler<LinkedinOrganizationSwitchTypeResponse>(clientOptions.jsonMapper)

        override fun switchType(
            params: LinkedinOrganizationSwitchTypeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LinkedinOrganizationSwitchTypeResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "accounts",
                        params._pathParam(0),
                        "linkedin-organizations",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { switchTypeHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
