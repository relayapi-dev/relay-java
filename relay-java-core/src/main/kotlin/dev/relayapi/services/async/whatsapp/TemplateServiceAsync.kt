// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.whatsapp

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponse
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.whatsapp.templates.TemplateCreateParams
import dev.relayapi.models.whatsapp.templates.TemplateCreateResponse
import dev.relayapi.models.whatsapp.templates.TemplateDeleteParams
import dev.relayapi.models.whatsapp.templates.TemplateListParams
import dev.relayapi.models.whatsapp.templates.TemplateListResponse
import dev.relayapi.models.whatsapp.templates.TemplateRetrieveParams
import dev.relayapi.models.whatsapp.templates.TemplateRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TemplateServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TemplateServiceAsync

    /** Create a message template */
    fun create(params: TemplateCreateParams): CompletableFuture<TemplateCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TemplateCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TemplateCreateResponse>

    /** Get template details */
    fun retrieve(
        templateName: String,
        params: TemplateRetrieveParams,
    ): CompletableFuture<TemplateRetrieveResponse> =
        retrieve(templateName, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        templateName: String,
        params: TemplateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TemplateRetrieveResponse> =
        retrieve(params.toBuilder().templateName(templateName).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: TemplateRetrieveParams): CompletableFuture<TemplateRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TemplateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TemplateRetrieveResponse>

    /** List message templates */
    fun list(params: TemplateListParams): CompletableFuture<TemplateListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: TemplateListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TemplateListResponse>

    /** Delete a message template */
    fun delete(templateName: String, params: TemplateDeleteParams): CompletableFuture<Void?> =
        delete(templateName, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        templateName: String,
        params: TemplateDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().templateName(templateName).build(), requestOptions)

    /** @see delete */
    fun delete(params: TemplateDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TemplateDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [TemplateServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TemplateServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/whatsapp/templates`, but is otherwise the same
         * as [TemplateServiceAsync.create].
         */
        fun create(
            params: TemplateCreateParams
        ): CompletableFuture<HttpResponseFor<TemplateCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TemplateCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TemplateCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/whatsapp/templates/{template_name}`, but is
         * otherwise the same as [TemplateServiceAsync.retrieve].
         */
        fun retrieve(
            templateName: String,
            params: TemplateRetrieveParams,
        ): CompletableFuture<HttpResponseFor<TemplateRetrieveResponse>> =
            retrieve(templateName, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            templateName: String,
            params: TemplateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TemplateRetrieveResponse>> =
            retrieve(params.toBuilder().templateName(templateName).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: TemplateRetrieveParams
        ): CompletableFuture<HttpResponseFor<TemplateRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: TemplateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TemplateRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/whatsapp/templates`, but is otherwise the same
         * as [TemplateServiceAsync.list].
         */
        fun list(
            params: TemplateListParams
        ): CompletableFuture<HttpResponseFor<TemplateListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: TemplateListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TemplateListResponse>>

        /**
         * Returns a raw HTTP response for `delete /v1/whatsapp/templates/{template_name}`, but is
         * otherwise the same as [TemplateServiceAsync.delete].
         */
        fun delete(
            templateName: String,
            params: TemplateDeleteParams,
        ): CompletableFuture<HttpResponse> = delete(templateName, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            templateName: String,
            params: TemplateDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().templateName(templateName).build(), requestOptions)

        /** @see delete */
        fun delete(params: TemplateDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: TemplateDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
