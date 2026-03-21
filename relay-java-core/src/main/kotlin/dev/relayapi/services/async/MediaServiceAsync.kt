// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MediaServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MediaServiceAsync

    /** Get media details */
    fun retrieve(id: String): CompletableFuture<MediaRetrieveResponse> =
        retrieve(id, MediaRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MediaRetrieveParams = MediaRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MediaRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MediaRetrieveParams = MediaRetrieveParams.none(),
    ): CompletableFuture<MediaRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MediaRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MediaRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: MediaRetrieveParams): CompletableFuture<MediaRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MediaRetrieveResponse> =
        retrieve(id, MediaRetrieveParams.none(), requestOptions)

    /** Delete media */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, MediaDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: MediaDeleteParams = MediaDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: MediaDeleteParams = MediaDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: MediaDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: MediaDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, MediaDeleteParams.none(), requestOptions)

    /**
     * Generate a pre-signed URL for direct upload to R2. The client can PUT the file to the
     * returned URL.
     */
    fun getPresignUrl(
        params: MediaGetPresignUrlParams
    ): CompletableFuture<MediaGetPresignUrlResponse> = getPresignUrl(params, RequestOptions.none())

    /** @see getPresignUrl */
    fun getPresignUrl(
        params: MediaGetPresignUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MediaGetPresignUrlResponse>

    /**
     * Upload a raw file body. Pass the filename as a query parameter and set the Content-Type
     * header.
     */
    fun upload(body: String, params: MediaUploadParams): CompletableFuture<MediaUploadResponse> =
        upload(body, params, RequestOptions.none())

    /** @see upload */
    fun upload(
        body: String,
        params: MediaUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MediaUploadResponse> =
        upload(params.toBuilder().body(body).build(), requestOptions)

    /** @see upload */
    fun upload(params: MediaUploadParams): CompletableFuture<MediaUploadResponse> =
        upload(params, RequestOptions.none())

    /** @see upload */
    fun upload(
        params: MediaUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MediaUploadResponse>

    /** A view of [MediaServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MediaServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/media/{id}`, but is otherwise the same as
         * [MediaServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<MediaRetrieveResponse>> =
            retrieve(id, MediaRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: MediaRetrieveParams = MediaRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MediaRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: MediaRetrieveParams = MediaRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<MediaRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: MediaRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MediaRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: MediaRetrieveParams
        ): CompletableFuture<HttpResponseFor<MediaRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MediaRetrieveResponse>> =
            retrieve(id, MediaRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/media/{id}`, but is otherwise the same as
         * [MediaServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, MediaDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: MediaDeleteParams = MediaDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: MediaDeleteParams = MediaDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: MediaDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: MediaDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, MediaDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/media/presign`, but is otherwise the same as
         * [MediaServiceAsync.getPresignUrl].
         */
        fun getPresignUrl(
            params: MediaGetPresignUrlParams
        ): CompletableFuture<HttpResponseFor<MediaGetPresignUrlResponse>> =
            getPresignUrl(params, RequestOptions.none())

        /** @see getPresignUrl */
        fun getPresignUrl(
            params: MediaGetPresignUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MediaGetPresignUrlResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/media/upload`, but is otherwise the same as
         * [MediaServiceAsync.upload].
         */
        fun upload(
            body: String,
            params: MediaUploadParams,
        ): CompletableFuture<HttpResponseFor<MediaUploadResponse>> =
            upload(body, params, RequestOptions.none())

        /** @see upload */
        fun upload(
            body: String,
            params: MediaUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MediaUploadResponse>> =
            upload(params.toBuilder().body(body).build(), requestOptions)

        /** @see upload */
        fun upload(
            params: MediaUploadParams
        ): CompletableFuture<HttpResponseFor<MediaUploadResponse>> =
            upload(params, RequestOptions.none())

        /** @see upload */
        fun upload(
            params: MediaUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MediaUploadResponse>>
    }
}
