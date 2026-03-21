// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.connect.snapchat

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
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
import dev.relayapi.models.connect.snapchat.profiles.ProfileListParams
import dev.relayapi.models.connect.snapchat.profiles.ProfileListResponse
import dev.relayapi.models.connect.snapchat.profiles.ProfileSelectParams
import dev.relayapi.models.connect.snapchat.profiles.ProfileSelectResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class ProfileServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ProfileServiceAsync {

    private val withRawResponse: ProfileServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ProfileServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProfileServiceAsync =
        ProfileServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: ProfileListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProfileListResponse> =
        // get /v1/connect/snapchat/profiles
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun select(
        params: ProfileSelectParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProfileSelectResponse> =
        // post /v1/connect/snapchat/profiles
        withRawResponse().select(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ProfileServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ProfileServiceAsync.WithRawResponse =
            ProfileServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<ProfileListResponse> =
            jsonHandler<ProfileListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ProfileListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProfileListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "connect", "snapchat", "profiles")
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

        private val selectHandler: Handler<ProfileSelectResponse> =
            jsonHandler<ProfileSelectResponse>(clientOptions.jsonMapper)

        override fun select(
            params: ProfileSelectParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProfileSelectResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "connect", "snapchat", "profiles")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { selectHandler.handle(it) }
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
