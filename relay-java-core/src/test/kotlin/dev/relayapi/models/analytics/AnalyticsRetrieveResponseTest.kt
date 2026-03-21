// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.analytics

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnalyticsRetrieveResponseTest {

    @Test
    fun create() {
        val analyticsRetrieveResponse =
            AnalyticsRetrieveResponse.builder()
                .addData(
                    AnalyticsRetrieveResponse.Data.builder()
                        .platform(AnalyticsRetrieveResponse.Data.Platform.TWITTER)
                        .postId("post_id")
                        .publishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .clicks(0.0)
                        .comments(0.0)
                        .impressions(0.0)
                        .likes(0.0)
                        .reach(0.0)
                        .saves(0.0)
                        .shares(0.0)
                        .views(0.0)
                        .build()
                )
                .overview(
                    AnalyticsRetrieveResponse.Overview.builder()
                        .totalClicks(0.0)
                        .totalComments(0.0)
                        .totalImpressions(0.0)
                        .totalLikes(0.0)
                        .totalPosts(0.0)
                        .totalShares(0.0)
                        .totalViews(0.0)
                        .build()
                )
                .build()

        assertThat(analyticsRetrieveResponse.data())
            .containsExactly(
                AnalyticsRetrieveResponse.Data.builder()
                    .platform(AnalyticsRetrieveResponse.Data.Platform.TWITTER)
                    .postId("post_id")
                    .publishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .clicks(0.0)
                    .comments(0.0)
                    .impressions(0.0)
                    .likes(0.0)
                    .reach(0.0)
                    .saves(0.0)
                    .shares(0.0)
                    .views(0.0)
                    .build()
            )
        assertThat(analyticsRetrieveResponse.overview())
            .contains(
                AnalyticsRetrieveResponse.Overview.builder()
                    .totalClicks(0.0)
                    .totalComments(0.0)
                    .totalImpressions(0.0)
                    .totalLikes(0.0)
                    .totalPosts(0.0)
                    .totalShares(0.0)
                    .totalViews(0.0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val analyticsRetrieveResponse =
            AnalyticsRetrieveResponse.builder()
                .addData(
                    AnalyticsRetrieveResponse.Data.builder()
                        .platform(AnalyticsRetrieveResponse.Data.Platform.TWITTER)
                        .postId("post_id")
                        .publishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .clicks(0.0)
                        .comments(0.0)
                        .impressions(0.0)
                        .likes(0.0)
                        .reach(0.0)
                        .saves(0.0)
                        .shares(0.0)
                        .views(0.0)
                        .build()
                )
                .overview(
                    AnalyticsRetrieveResponse.Overview.builder()
                        .totalClicks(0.0)
                        .totalComments(0.0)
                        .totalImpressions(0.0)
                        .totalLikes(0.0)
                        .totalPosts(0.0)
                        .totalShares(0.0)
                        .totalViews(0.0)
                        .build()
                )
                .build()

        val roundtrippedAnalyticsRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(analyticsRetrieveResponse),
                jacksonTypeRef<AnalyticsRetrieveResponse>(),
            )

        assertThat(roundtrippedAnalyticsRetrieveResponse).isEqualTo(analyticsRetrieveResponse)
    }
}
