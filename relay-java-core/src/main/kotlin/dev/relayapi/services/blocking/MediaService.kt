// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponse
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.media.MediaDeleteParams
import dev.relayapi.models.media.MediaGetPresignUrlParams
import dev.relayapi.models.media.MediaGetPresignUrlResponse
import dev.relayapi.models.media.MediaRetrieveParams
import dev.relayapi.models.media.MediaRetrieveResponse
import dev.relayapi.models.media.MediaUploadParams
import dev.relayapi.models.media.MediaUploadResponse
import java.util.function.Consumer

interface MediaService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MediaService

    /** Get media details */
    fun retrieve(id: String): MediaRetrieveResponse = retrieve(id, MediaRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MediaRetrieveParams = MediaRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MediaRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MediaRetrieveParams = MediaRetrieveParams.none(),
    ): MediaRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MediaRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MediaRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: MediaRetrieveParams): MediaRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): MediaRetrieveResponse =
        retrieve(id, MediaRetrieveParams.none(), requestOptions)

    /** Delete media */
    fun delete(id: String) = delete(id, MediaDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: MediaDeleteParams = MediaDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: MediaDeleteParams = MediaDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: MediaDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: MediaDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, MediaDeleteParams.none(), requestOptions)

    /**
     * Generate a pre-signed URL for direct upload to R2. The client can PUT the file to the
     * returned URL.
     */
    fun getPresignUrl(params: MediaGetPresignUrlParams): MediaGetPresignUrlResponse =
        getPresignUrl(params, RequestOptions.none())

    /** @see getPresignUrl */
    fun getPresignUrl(
        params: MediaGetPresignUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MediaGetPresignUrlResponse

    /**
     * Upload a raw file body. Pass the filename as a query parameter and set the Content-Type
     * header.
     */
    fun upload(body: String, params: MediaUploadParams): MediaUploadResponse =
        upload(body, params, RequestOptions.none())

    /** @see upload */
    fun upload(
        body: String,
        params: MediaUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MediaUploadResponse = upload(params.toBuilder().body(body).build(), requestOptions)

    /** @see upload */
    fun upload(params: MediaUploadParams): MediaUploadResponse =
        upload(params, RequestOptions.none())

    /** @see upload */
    fun upload(
        params: MediaUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MediaUploadResponse

    /** A view of [MediaService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MediaService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/media/{id}`, but is otherwise the same as
         * [MediaService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<MediaRetrieveResponse> =
            retrieve(id, MediaRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: MediaRetrieveParams = MediaRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MediaRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: MediaRetrieveParams = MediaRetrieveParams.none(),
        ): HttpResponseFor<MediaRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MediaRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MediaRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: MediaRetrieveParams): HttpResponseFor<MediaRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MediaRetrieveResponse> =
            retrieve(id, MediaRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/media/{id}`, but is otherwise the same as
         * [MediaService.delete].
         */
        @MustBeClosed fun delete(id: String): HttpResponse = delete(id, MediaDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: MediaDeleteParams = MediaDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: MediaDeleteParams = MediaDeleteParams.none()): HttpResponse =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: MediaDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: MediaDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, MediaDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/media/presign`, but is otherwise the same as
         * [MediaService.getPresignUrl].
         */
        @MustBeClosed
        fun getPresignUrl(
            params: MediaGetPresignUrlParams
        ): HttpResponseFor<MediaGetPresignUrlResponse> =
            getPresignUrl(params, RequestOptions.none())

        /** @see getPresignUrl */
        @MustBeClosed
        fun getPresignUrl(
            params: MediaGetPresignUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MediaGetPresignUrlResponse>

        /**
         * Returns a raw HTTP response for `post /v1/media/upload`, but is otherwise the same as
         * [MediaService.upload].
         */
        @MustBeClosed
        fun upload(body: String, params: MediaUploadParams): HttpResponseFor<MediaUploadResponse> =
            upload(body, params, RequestOptions.none())

        /** @see upload */
        @MustBeClosed
        fun upload(
            body: String,
            params: MediaUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MediaUploadResponse> =
            upload(params.toBuilder().body(body).build(), requestOptions)

        /** @see upload */
        @MustBeClosed
        fun upload(params: MediaUploadParams): HttpResponseFor<MediaUploadResponse> =
            upload(params, RequestOptions.none())

        /** @see upload */
        @MustBeClosed
        fun upload(
            params: MediaUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MediaUploadResponse>
    }
}
