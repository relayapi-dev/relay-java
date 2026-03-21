// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.analytics

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.analytics.youtube.YoutubeGetDailyViewsParams
import dev.relayapi.models.analytics.youtube.YoutubeGetDailyViewsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface YoutubeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): YoutubeServiceAsync

    /** Get YouTube daily views and watch time */
    fun getDailyViews(
        params: YoutubeGetDailyViewsParams
    ): CompletableFuture<YoutubeGetDailyViewsResponse> =
        getDailyViews(params, RequestOptions.none())

    /** @see getDailyViews */
    fun getDailyViews(
        params: YoutubeGetDailyViewsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<YoutubeGetDailyViewsResponse>

    /**
     * A view of [YoutubeServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): YoutubeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/analytics/youtube/daily-views`, but is otherwise
         * the same as [YoutubeServiceAsync.getDailyViews].
         */
        fun getDailyViews(
            params: YoutubeGetDailyViewsParams
        ): CompletableFuture<HttpResponseFor<YoutubeGetDailyViewsResponse>> =
            getDailyViews(params, RequestOptions.none())

        /** @see getDailyViews */
        fun getDailyViews(
            params: YoutubeGetDailyViewsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<YoutubeGetDailyViewsResponse>>
    }
}
