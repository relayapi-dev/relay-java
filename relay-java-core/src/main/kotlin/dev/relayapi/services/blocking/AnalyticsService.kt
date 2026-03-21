// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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
import dev.relayapi.services.blocking.analytics.YoutubeService
import java.util.function.Consumer

interface AnalyticsService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AnalyticsService

    fun youtube(): YoutubeService

    /** Get post analytics */
    fun retrieve(): AnalyticsRetrieveResponse = retrieve(AnalyticsRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: AnalyticsRetrieveParams = AnalyticsRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnalyticsRetrieveResponse

    /** @see retrieve */
    fun retrieve(
        params: AnalyticsRetrieveParams = AnalyticsRetrieveParams.none()
    ): AnalyticsRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): AnalyticsRetrieveResponse =
        retrieve(AnalyticsRetrieveParams.none(), requestOptions)

    /** Get best posting times based on engagement */
    fun getBestTime(): AnalyticsGetBestTimeResponse = getBestTime(AnalyticsGetBestTimeParams.none())

    /** @see getBestTime */
    fun getBestTime(
        params: AnalyticsGetBestTimeParams = AnalyticsGetBestTimeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnalyticsGetBestTimeResponse

    /** @see getBestTime */
    fun getBestTime(
        params: AnalyticsGetBestTimeParams = AnalyticsGetBestTimeParams.none()
    ): AnalyticsGetBestTimeResponse = getBestTime(params, RequestOptions.none())

    /** @see getBestTime */
    fun getBestTime(requestOptions: RequestOptions): AnalyticsGetBestTimeResponse =
        getBestTime(AnalyticsGetBestTimeParams.none(), requestOptions)

    /** Get engagement decay curve for a post */
    fun getContentDecay(params: AnalyticsGetContentDecayParams): AnalyticsGetContentDecayResponse =
        getContentDecay(params, RequestOptions.none())

    /** @see getContentDecay */
    fun getContentDecay(
        params: AnalyticsGetContentDecayParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnalyticsGetContentDecayResponse

    /** Get per-post daily timeline of metrics */
    fun getPostTimeline(params: AnalyticsGetPostTimelineParams): AnalyticsGetPostTimelineResponse =
        getPostTimeline(params, RequestOptions.none())

    /** @see getPostTimeline */
    fun getPostTimeline(
        params: AnalyticsGetPostTimelineParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnalyticsGetPostTimelineResponse

    /** Get posting frequency vs engagement analysis */
    fun getPostingFrequency(): AnalyticsGetPostingFrequencyResponse =
        getPostingFrequency(AnalyticsGetPostingFrequencyParams.none())

    /** @see getPostingFrequency */
    fun getPostingFrequency(
        params: AnalyticsGetPostingFrequencyParams = AnalyticsGetPostingFrequencyParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnalyticsGetPostingFrequencyResponse

    /** @see getPostingFrequency */
    fun getPostingFrequency(
        params: AnalyticsGetPostingFrequencyParams = AnalyticsGetPostingFrequencyParams.none()
    ): AnalyticsGetPostingFrequencyResponse = getPostingFrequency(params, RequestOptions.none())

    /** @see getPostingFrequency */
    fun getPostingFrequency(requestOptions: RequestOptions): AnalyticsGetPostingFrequencyResponse =
        getPostingFrequency(AnalyticsGetPostingFrequencyParams.none(), requestOptions)

    /** Get daily aggregated metrics */
    fun listDailyMetrics(): AnalyticsListDailyMetricsResponse =
        listDailyMetrics(AnalyticsListDailyMetricsParams.none())

    /** @see listDailyMetrics */
    fun listDailyMetrics(
        params: AnalyticsListDailyMetricsParams = AnalyticsListDailyMetricsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnalyticsListDailyMetricsResponse

    /** @see listDailyMetrics */
    fun listDailyMetrics(
        params: AnalyticsListDailyMetricsParams = AnalyticsListDailyMetricsParams.none()
    ): AnalyticsListDailyMetricsResponse = listDailyMetrics(params, RequestOptions.none())

    /** @see listDailyMetrics */
    fun listDailyMetrics(requestOptions: RequestOptions): AnalyticsListDailyMetricsResponse =
        listDailyMetrics(AnalyticsListDailyMetricsParams.none(), requestOptions)

    /** A view of [AnalyticsService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AnalyticsService.WithRawResponse

        fun youtube(): YoutubeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/analytics`, but is otherwise the same as
         * [AnalyticsService.retrieve].
         */
        @MustBeClosed
        fun retrieve(): HttpResponseFor<AnalyticsRetrieveResponse> =
            retrieve(AnalyticsRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AnalyticsRetrieveParams = AnalyticsRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnalyticsRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AnalyticsRetrieveParams = AnalyticsRetrieveParams.none()
        ): HttpResponseFor<AnalyticsRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(requestOptions: RequestOptions): HttpResponseFor<AnalyticsRetrieveResponse> =
            retrieve(AnalyticsRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/analytics/best-time`, but is otherwise the same
         * as [AnalyticsService.getBestTime].
         */
        @MustBeClosed
        fun getBestTime(): HttpResponseFor<AnalyticsGetBestTimeResponse> =
            getBestTime(AnalyticsGetBestTimeParams.none())

        /** @see getBestTime */
        @MustBeClosed
        fun getBestTime(
            params: AnalyticsGetBestTimeParams = AnalyticsGetBestTimeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnalyticsGetBestTimeResponse>

        /** @see getBestTime */
        @MustBeClosed
        fun getBestTime(
            params: AnalyticsGetBestTimeParams = AnalyticsGetBestTimeParams.none()
        ): HttpResponseFor<AnalyticsGetBestTimeResponse> =
            getBestTime(params, RequestOptions.none())

        /** @see getBestTime */
        @MustBeClosed
        fun getBestTime(
            requestOptions: RequestOptions
        ): HttpResponseFor<AnalyticsGetBestTimeResponse> =
            getBestTime(AnalyticsGetBestTimeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/analytics/content-decay`, but is otherwise the
         * same as [AnalyticsService.getContentDecay].
         */
        @MustBeClosed
        fun getContentDecay(
            params: AnalyticsGetContentDecayParams
        ): HttpResponseFor<AnalyticsGetContentDecayResponse> =
            getContentDecay(params, RequestOptions.none())

        /** @see getContentDecay */
        @MustBeClosed
        fun getContentDecay(
            params: AnalyticsGetContentDecayParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnalyticsGetContentDecayResponse>

        /**
         * Returns a raw HTTP response for `get /v1/analytics/post-timeline`, but is otherwise the
         * same as [AnalyticsService.getPostTimeline].
         */
        @MustBeClosed
        fun getPostTimeline(
            params: AnalyticsGetPostTimelineParams
        ): HttpResponseFor<AnalyticsGetPostTimelineResponse> =
            getPostTimeline(params, RequestOptions.none())

        /** @see getPostTimeline */
        @MustBeClosed
        fun getPostTimeline(
            params: AnalyticsGetPostTimelineParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnalyticsGetPostTimelineResponse>

        /**
         * Returns a raw HTTP response for `get /v1/analytics/posting-frequency`, but is otherwise
         * the same as [AnalyticsService.getPostingFrequency].
         */
        @MustBeClosed
        fun getPostingFrequency(): HttpResponseFor<AnalyticsGetPostingFrequencyResponse> =
            getPostingFrequency(AnalyticsGetPostingFrequencyParams.none())

        /** @see getPostingFrequency */
        @MustBeClosed
        fun getPostingFrequency(
            params: AnalyticsGetPostingFrequencyParams = AnalyticsGetPostingFrequencyParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnalyticsGetPostingFrequencyResponse>

        /** @see getPostingFrequency */
        @MustBeClosed
        fun getPostingFrequency(
            params: AnalyticsGetPostingFrequencyParams = AnalyticsGetPostingFrequencyParams.none()
        ): HttpResponseFor<AnalyticsGetPostingFrequencyResponse> =
            getPostingFrequency(params, RequestOptions.none())

        /** @see getPostingFrequency */
        @MustBeClosed
        fun getPostingFrequency(
            requestOptions: RequestOptions
        ): HttpResponseFor<AnalyticsGetPostingFrequencyResponse> =
            getPostingFrequency(AnalyticsGetPostingFrequencyParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/analytics/daily-metrics`, but is otherwise the
         * same as [AnalyticsService.listDailyMetrics].
         */
        @MustBeClosed
        fun listDailyMetrics(): HttpResponseFor<AnalyticsListDailyMetricsResponse> =
            listDailyMetrics(AnalyticsListDailyMetricsParams.none())

        /** @see listDailyMetrics */
        @MustBeClosed
        fun listDailyMetrics(
            params: AnalyticsListDailyMetricsParams = AnalyticsListDailyMetricsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnalyticsListDailyMetricsResponse>

        /** @see listDailyMetrics */
        @MustBeClosed
        fun listDailyMetrics(
            params: AnalyticsListDailyMetricsParams = AnalyticsListDailyMetricsParams.none()
        ): HttpResponseFor<AnalyticsListDailyMetricsResponse> =
            listDailyMetrics(params, RequestOptions.none())

        /** @see listDailyMetrics */
        @MustBeClosed
        fun listDailyMetrics(
            requestOptions: RequestOptions
        ): HttpResponseFor<AnalyticsListDailyMetricsResponse> =
            listDailyMetrics(AnalyticsListDailyMetricsParams.none(), requestOptions)
    }
}
