// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.analytics.AnalyticsGetBestTimeParams
import dev.relayapi.models.analytics.AnalyticsGetBestTimeResponse
import dev.relayapi.models.analytics.AnalyticsGetContentDecayParams
import dev.relayapi.models.analytics.AnalyticsGetContentDecayResponse
import dev.relayapi.models.analytics.AnalyticsGetPostTimelineParams
import dev.relayapi.models.analytics.AnalyticsGetPostTimelineResponse
import dev.relayapi.models.analytics.AnalyticsGetPostingFrequencyParams
import dev.relayapi.models.analytics.AnalyticsGetPostingFrequencyResponse
import dev.relayapi.models.analytics.AnalyticsListDailyMetricsParams
import dev.relayapi.models.analytics.AnalyticsListDailyMetricsResponse
import dev.relayapi.models.analytics.AnalyticsRetrieveParams
import dev.relayapi.models.analytics.AnalyticsRetrieveResponse
import dev.relayapi.services.async.analytics.YoutubeServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AnalyticsServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AnalyticsServiceAsync

    fun youtube(): YoutubeServiceAsync

    /** Get post analytics */
    fun retrieve(): CompletableFuture<AnalyticsRetrieveResponse> =
        retrieve(AnalyticsRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: AnalyticsRetrieveParams = AnalyticsRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AnalyticsRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: AnalyticsRetrieveParams = AnalyticsRetrieveParams.none()
    ): CompletableFuture<AnalyticsRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): CompletableFuture<AnalyticsRetrieveResponse> =
        retrieve(AnalyticsRetrieveParams.none(), requestOptions)

    /** Get best posting times based on engagement */
    fun getBestTime(): CompletableFuture<AnalyticsGetBestTimeResponse> =
        getBestTime(AnalyticsGetBestTimeParams.none())

    /** @see getBestTime */
    fun getBestTime(
        params: AnalyticsGetBestTimeParams = AnalyticsGetBestTimeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AnalyticsGetBestTimeResponse>

    /** @see getBestTime */
    fun getBestTime(
        params: AnalyticsGetBestTimeParams = AnalyticsGetBestTimeParams.none()
    ): CompletableFuture<AnalyticsGetBestTimeResponse> = getBestTime(params, RequestOptions.none())

    /** @see getBestTime */
    fun getBestTime(
        requestOptions: RequestOptions
    ): CompletableFuture<AnalyticsGetBestTimeResponse> =
        getBestTime(AnalyticsGetBestTimeParams.none(), requestOptions)

    /** Get engagement decay curve for a post */
    fun getContentDecay(
        params: AnalyticsGetContentDecayParams
    ): CompletableFuture<AnalyticsGetContentDecayResponse> =
        getContentDecay(params, RequestOptions.none())

    /** @see getContentDecay */
    fun getContentDecay(
        params: AnalyticsGetContentDecayParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AnalyticsGetContentDecayResponse>

    /** Get per-post daily timeline of metrics */
    fun getPostTimeline(
        params: AnalyticsGetPostTimelineParams
    ): CompletableFuture<AnalyticsGetPostTimelineResponse> =
        getPostTimeline(params, RequestOptions.none())

    /** @see getPostTimeline */
    fun getPostTimeline(
        params: AnalyticsGetPostTimelineParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AnalyticsGetPostTimelineResponse>

    /** Get posting frequency vs engagement analysis */
    fun getPostingFrequency(): CompletableFuture<AnalyticsGetPostingFrequencyResponse> =
        getPostingFrequency(AnalyticsGetPostingFrequencyParams.none())

    /** @see getPostingFrequency */
    fun getPostingFrequency(
        params: AnalyticsGetPostingFrequencyParams = AnalyticsGetPostingFrequencyParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AnalyticsGetPostingFrequencyResponse>

    /** @see getPostingFrequency */
    fun getPostingFrequency(
        params: AnalyticsGetPostingFrequencyParams = AnalyticsGetPostingFrequencyParams.none()
    ): CompletableFuture<AnalyticsGetPostingFrequencyResponse> =
        getPostingFrequency(params, RequestOptions.none())

    /** @see getPostingFrequency */
    fun getPostingFrequency(
        requestOptions: RequestOptions
    ): CompletableFuture<AnalyticsGetPostingFrequencyResponse> =
        getPostingFrequency(AnalyticsGetPostingFrequencyParams.none(), requestOptions)

    /** Get daily aggregated metrics */
    fun listDailyMetrics(): CompletableFuture<AnalyticsListDailyMetricsResponse> =
        listDailyMetrics(AnalyticsListDailyMetricsParams.none())

    /** @see listDailyMetrics */
    fun listDailyMetrics(
        params: AnalyticsListDailyMetricsParams = AnalyticsListDailyMetricsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AnalyticsListDailyMetricsResponse>

    /** @see listDailyMetrics */
    fun listDailyMetrics(
        params: AnalyticsListDailyMetricsParams = AnalyticsListDailyMetricsParams.none()
    ): CompletableFuture<AnalyticsListDailyMetricsResponse> =
        listDailyMetrics(params, RequestOptions.none())

    /** @see listDailyMetrics */
    fun listDailyMetrics(
        requestOptions: RequestOptions
    ): CompletableFuture<AnalyticsListDailyMetricsResponse> =
        listDailyMetrics(AnalyticsListDailyMetricsParams.none(), requestOptions)

    /**
     * A view of [AnalyticsServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AnalyticsServiceAsync.WithRawResponse

        fun youtube(): YoutubeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/analytics`, but is otherwise the same as
         * [AnalyticsServiceAsync.retrieve].
         */
        fun retrieve(): CompletableFuture<HttpResponseFor<AnalyticsRetrieveResponse>> =
            retrieve(AnalyticsRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            params: AnalyticsRetrieveParams = AnalyticsRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AnalyticsRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: AnalyticsRetrieveParams = AnalyticsRetrieveParams.none()
        ): CompletableFuture<HttpResponseFor<AnalyticsRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AnalyticsRetrieveResponse>> =
            retrieve(AnalyticsRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/analytics/best-time`, but is otherwise the same
         * as [AnalyticsServiceAsync.getBestTime].
         */
        fun getBestTime(): CompletableFuture<HttpResponseFor<AnalyticsGetBestTimeResponse>> =
            getBestTime(AnalyticsGetBestTimeParams.none())

        /** @see getBestTime */
        fun getBestTime(
            params: AnalyticsGetBestTimeParams = AnalyticsGetBestTimeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AnalyticsGetBestTimeResponse>>

        /** @see getBestTime */
        fun getBestTime(
            params: AnalyticsGetBestTimeParams = AnalyticsGetBestTimeParams.none()
        ): CompletableFuture<HttpResponseFor<AnalyticsGetBestTimeResponse>> =
            getBestTime(params, RequestOptions.none())

        /** @see getBestTime */
        fun getBestTime(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AnalyticsGetBestTimeResponse>> =
            getBestTime(AnalyticsGetBestTimeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/analytics/content-decay`, but is otherwise the
         * same as [AnalyticsServiceAsync.getContentDecay].
         */
        fun getContentDecay(
            params: AnalyticsGetContentDecayParams
        ): CompletableFuture<HttpResponseFor<AnalyticsGetContentDecayResponse>> =
            getContentDecay(params, RequestOptions.none())

        /** @see getContentDecay */
        fun getContentDecay(
            params: AnalyticsGetContentDecayParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AnalyticsGetContentDecayResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/analytics/post-timeline`, but is otherwise the
         * same as [AnalyticsServiceAsync.getPostTimeline].
         */
        fun getPostTimeline(
            params: AnalyticsGetPostTimelineParams
        ): CompletableFuture<HttpResponseFor<AnalyticsGetPostTimelineResponse>> =
            getPostTimeline(params, RequestOptions.none())

        /** @see getPostTimeline */
        fun getPostTimeline(
            params: AnalyticsGetPostTimelineParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AnalyticsGetPostTimelineResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/analytics/posting-frequency`, but is otherwise
         * the same as [AnalyticsServiceAsync.getPostingFrequency].
         */
        fun getPostingFrequency():
            CompletableFuture<HttpResponseFor<AnalyticsGetPostingFrequencyResponse>> =
            getPostingFrequency(AnalyticsGetPostingFrequencyParams.none())

        /** @see getPostingFrequency */
        fun getPostingFrequency(
            params: AnalyticsGetPostingFrequencyParams = AnalyticsGetPostingFrequencyParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AnalyticsGetPostingFrequencyResponse>>

        /** @see getPostingFrequency */
        fun getPostingFrequency(
            params: AnalyticsGetPostingFrequencyParams = AnalyticsGetPostingFrequencyParams.none()
        ): CompletableFuture<HttpResponseFor<AnalyticsGetPostingFrequencyResponse>> =
            getPostingFrequency(params, RequestOptions.none())

        /** @see getPostingFrequency */
        fun getPostingFrequency(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AnalyticsGetPostingFrequencyResponse>> =
            getPostingFrequency(AnalyticsGetPostingFrequencyParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/analytics/daily-metrics`, but is otherwise the
         * same as [AnalyticsServiceAsync.listDailyMetrics].
         */
        fun listDailyMetrics():
            CompletableFuture<HttpResponseFor<AnalyticsListDailyMetricsResponse>> =
            listDailyMetrics(AnalyticsListDailyMetricsParams.none())

        /** @see listDailyMetrics */
        fun listDailyMetrics(
            params: AnalyticsListDailyMetricsParams = AnalyticsListDailyMetricsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AnalyticsListDailyMetricsResponse>>

        /** @see listDailyMetrics */
        fun listDailyMetrics(
            params: AnalyticsListDailyMetricsParams = AnalyticsListDailyMetricsParams.none()
        ): CompletableFuture<HttpResponseFor<AnalyticsListDailyMetricsResponse>> =
            listDailyMetrics(params, RequestOptions.none())

        /** @see listDailyMetrics */
        fun listDailyMetrics(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AnalyticsListDailyMetricsResponse>> =
            listDailyMetrics(AnalyticsListDailyMetricsParams.none(), requestOptions)
    }
}
