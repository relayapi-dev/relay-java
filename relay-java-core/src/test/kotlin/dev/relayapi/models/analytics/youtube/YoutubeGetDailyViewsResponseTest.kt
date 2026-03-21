// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.analytics.youtube

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class YoutubeGetDailyViewsResponseTest {

    @Test
    fun create() {
        val youtubeGetDailyViewsResponse =
            YoutubeGetDailyViewsResponse.builder()
                .addData(
                    YoutubeGetDailyViewsResponse.Data.builder()
                        .date("date")
                        .subscribersGained(0.0)
                        .views(0.0)
                        .watchTimeMinutes(0.0)
                        .build()
                )
                .build()

        assertThat(youtubeGetDailyViewsResponse.data())
            .containsExactly(
                YoutubeGetDailyViewsResponse.Data.builder()
                    .date("date")
                    .subscribersGained(0.0)
                    .views(0.0)
                    .watchTimeMinutes(0.0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val youtubeGetDailyViewsResponse =
            YoutubeGetDailyViewsResponse.builder()
                .addData(
                    YoutubeGetDailyViewsResponse.Data.builder()
                        .date("date")
                        .subscribersGained(0.0)
                        .views(0.0)
                        .watchTimeMinutes(0.0)
                        .build()
                )
                .build()

        val roundtrippedYoutubeGetDailyViewsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(youtubeGetDailyViewsResponse),
                jacksonTypeRef<YoutubeGetDailyViewsResponse>(),
            )

        assertThat(roundtrippedYoutubeGetDailyViewsResponse).isEqualTo(youtubeGetDailyViewsResponse)
    }
}
