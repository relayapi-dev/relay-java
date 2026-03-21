// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.whatsapp

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

interface TemplateService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TemplateService

    /** Create a message template */
    fun create(params: TemplateCreateParams): TemplateCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TemplateCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TemplateCreateResponse

    /** Get template details */
    fun retrieve(templateName: String, params: TemplateRetrieveParams): TemplateRetrieveResponse =
        retrieve(templateName, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        templateName: String,
        params: TemplateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TemplateRetrieveResponse =
        retrieve(params.toBuilder().templateName(templateName).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: TemplateRetrieveParams): TemplateRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TemplateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TemplateRetrieveResponse

    /** List message templates */
    fun list(params: TemplateListParams): TemplateListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: TemplateListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TemplateListResponse

    /** Delete a message template */
    fun delete(templateName: String, params: TemplateDeleteParams) =
        delete(templateName, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        templateName: String,
        params: TemplateDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().templateName(templateName).build(), requestOptions)

    /** @see delete */
    fun delete(params: TemplateDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: TemplateDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [TemplateService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TemplateService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/whatsapp/templates`, but is otherwise the same
         * as [TemplateService.create].
         */
        @MustBeClosed
        fun create(params: TemplateCreateParams): HttpResponseFor<TemplateCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TemplateCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TemplateCreateResponse>

        /**
         * Returns a raw HTTP response for `get /v1/whatsapp/templates/{template_name}`, but is
         * otherwise the same as [TemplateService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            templateName: String,
            params: TemplateRetrieveParams,
        ): HttpResponseFor<TemplateRetrieveResponse> =
            retrieve(templateName, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            templateName: String,
            params: TemplateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TemplateRetrieveResponse> =
            retrieve(params.toBuilder().templateName(templateName).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: TemplateRetrieveParams): HttpResponseFor<TemplateRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TemplateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TemplateRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get /v1/whatsapp/templates`, but is otherwise the same
         * as [TemplateService.list].
         */
        @MustBeClosed
        fun list(params: TemplateListParams): HttpResponseFor<TemplateListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TemplateListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TemplateListResponse>

        /**
         * Returns a raw HTTP response for `delete /v1/whatsapp/templates/{template_name}`, but is
         * otherwise the same as [TemplateService.delete].
         */
        @MustBeClosed
        fun delete(templateName: String, params: TemplateDeleteParams): HttpResponse =
            delete(templateName, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            templateName: String,
            params: TemplateDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().templateName(templateName).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: TemplateDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: TemplateDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
