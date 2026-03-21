// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.analytics

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnalyticsGetPostTimelineResponseTest {

    @Test
    fun create() {
        val analyticsGetPostTimelineResponse =
            AnalyticsGetPostTimelineResponse.builder()
                .addData(
                    AnalyticsGetPostTimelineResponse.Data.builder()
                        .clicks(0.0)
                        .comments(0.0)
                        .date("date")
                        .impressions(0.0)
                        .likes(0.0)
                        .shares(0.0)
                        .views(0.0)
                        .build()
                )
                .postId("post_id")
                .build()

        assertThat(analyticsGetPostTimelineResponse.data())
            .containsExactly(
                AnalyticsGetPostTimelineResponse.Data.builder()
                    .clicks(0.0)
                    .comments(0.0)
                    .date("date")
                    .impressions(0.0)
                    .likes(0.0)
                    .shares(0.0)
                    .views(0.0)
                    .build()
            )
        assertThat(analyticsGetPostTimelineResponse.postId()).isEqualTo("post_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val analyticsGetPostTimelineResponse =
            AnalyticsGetPostTimelineResponse.builder()
                .addData(
                    AnalyticsGetPostTimelineResponse.Data.builder()
                        .clicks(0.0)
                        .comments(0.0)
                        .date("date")
                        .impressions(0.0)
                        .likes(0.0)
                        .shares(0.0)
                        .views(0.0)
                        .build()
                )
                .postId("post_id")
                .build()

        val roundtrippedAnalyticsGetPostTimelineResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(analyticsGetPostTimelineResponse),
                jacksonTypeRef<AnalyticsGetPostTimelineResponse>(),
            )

        assertThat(roundtrippedAnalyticsGetPostTimelineResponse)
            .isEqualTo(analyticsGetPostTimelineResponse)
    }
}
