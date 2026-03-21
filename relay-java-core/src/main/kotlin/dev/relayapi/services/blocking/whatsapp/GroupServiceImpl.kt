// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.whatsapp

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
import dev.relayapi.models.whatsapp.groups.GroupCreateParams
import dev.relayapi.models.whatsapp.groups.GroupCreateResponse
import dev.relayapi.models.whatsapp.groups.GroupDeleteParams
import dev.relayapi.models.whatsapp.groups.GroupListParams
import dev.relayapi.models.whatsapp.groups.GroupListResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class GroupServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    GroupService {

    private val withRawResponse: GroupService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): GroupService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GroupService =
        GroupServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: GroupCreateParams,
        requestOptions: RequestOptions,
    ): GroupCreateResponse =
        // post /v1/whatsapp/groups
        withRawResponse().create(params, requestOptions).parse()

    override fun list(params: GroupListParams, requestOptions: RequestOptions): GroupListResponse =
        // get /v1/whatsapp/groups
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: GroupDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/whatsapp/groups/{group_id}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GroupService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GroupService.WithRawResponse =
            GroupServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<GroupCreateResponse> =
            jsonHandler<GroupCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: GroupCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GroupCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "whatsapp", "groups")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<GroupListResponse> =
            jsonHandler<GroupListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: GroupListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GroupListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "whatsapp", "groups")
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
            params: GroupDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("groupId", params.groupId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "whatsapp", "groups", params._pathParam(0))
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
