// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking

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
import dev.relayapi.core.http.parseable
import dev.relayapi.core.prepare
import dev.relayapi.models.connections.ConnectionListLogsParams
import dev.relayapi.models.connections.ConnectionListLogsResponse
import java.util.function.Consumer

class ConnectionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ConnectionService {

    private val withRawResponse: ConnectionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ConnectionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConnectionService =
        ConnectionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun listLogs(
        params: ConnectionListLogsParams,
        requestOptions: RequestOptions,
    ): ConnectionListLogsResponse =
        // get /v1/connections/logs
        withRawResponse().listLogs(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConnectionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConnectionService.WithRawResponse =
            ConnectionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listLogsHandler: Handler<ConnectionListLogsResponse> =
            jsonHandler<ConnectionListLogsResponse>(clientOptions.jsonMapper)

        override fun listLogs(
            params: ConnectionListLogsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConnectionListLogsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "connections", "logs")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listLogsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
