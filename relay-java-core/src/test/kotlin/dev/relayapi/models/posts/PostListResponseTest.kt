// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.posts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.JsonValue
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PostListResponseTest {

    @Test
    fun create() {
        val postListResponse =
            PostListResponse.builder()
                .addData(
                    PostListResponse.Data.builder()
                        .id("id")
                        .content("content")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addMedia(
                            PostListResponse.Data.Media.builder()
                                .url("https://example.com")
                                .type(PostListResponse.Data.Media.Type.IMAGE)
                                .build()
                        )
                        .publishedAt("published_at")
                        .recycledFromId("recycled_from_id")
                        .recycling(
                            PostListResponse.Data.Recycling.builder()
                                .id("id")
                                .contentVariationIndex(0.0)
                                .addContentVariation("string")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .enabled(true)
                                .expireCount(0.0)
                                .expireDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .gap(0.0)
                                .gapFreq(PostListResponse.Data.Recycling.GapFreq.DAY)
                                .lastRecycledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .nextRecycleAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .recycleCount(0.0)
                                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .scheduledAt("scheduled_at")
                        .status(PostListResponse.Data.Status.DRAFT)
                        .targets(
                            PostListResponse.Data.Targets.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf(
                                            "platform" to "twitter",
                                            "status" to "draft",
                                            "accounts" to
                                                listOf(
                                                    mapOf(
                                                        "id" to "id",
                                                        "avatar_url" to "avatar_url",
                                                        "display_name" to "display_name",
                                                        "platform_post_id" to "platform_post_id",
                                                        "url" to "url",
                                                        "username" to "username",
                                                    )
                                                ),
                                            "error" to
                                                mapOf("code" to "code", "message" to "message"),
                                        )
                                    ),
                                )
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .metrics(
                            PostListResponse.Data.Metrics.builder()
                                .clicks(0.0)
                                .comments(0.0)
                                .engagementRate(0.0)
                                .impressions(0.0)
                                .likes(0.0)
                                .reach(0.0)
                                .saves(0.0)
                                .shares(0.0)
                                .views(0.0)
                                .build()
                        )
                        .targetOptions(
                            PostListResponse.Data.TargetOptions.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                                .build()
                        )
                        .timezone("timezone")
                        .build()
                )
                .hasMore(true)
                .nextCursor("next_cursor")
                .build()

        assertThat(postListResponse.data())
            .containsExactly(
                PostListResponse.Data.builder()
                    .id("id")
                    .content("content")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addMedia(
                        PostListResponse.Data.Media.builder()
                            .url("https://example.com")
                            .type(PostListResponse.Data.Media.Type.IMAGE)
                            .build()
                    )
                    .publishedAt("published_at")
                    .recycledFromId("recycled_from_id")
                    .recycling(
                        PostListResponse.Data.Recycling.builder()
                            .id("id")
                            .contentVariationIndex(0.0)
                            .addContentVariation("string")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .enabled(true)
                            .expireCount(0.0)
                            .expireDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .gap(0.0)
                            .gapFreq(PostListResponse.Data.Recycling.GapFreq.DAY)
                            .lastRecycledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .nextRecycleAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .recycleCount(0.0)
                            .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .scheduledAt("scheduled_at")
                    .status(PostListResponse.Data.Status.DRAFT)
                    .targets(
                        PostListResponse.Data.Targets.builder()
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(
                                    mapOf(
                                        "platform" to "twitter",
                                        "status" to "draft",
                                        "accounts" to
                                            listOf(
                                                mapOf(
                                                    "id" to "id",
                                                    "avatar_url" to "avatar_url",
                                                    "display_name" to "display_name",
                                                    "platform_post_id" to "platform_post_id",
                                                    "url" to "url",
                                                    "username" to "username",
                                                )
                                            ),
                                        "error" to mapOf("code" to "code", "message" to "message"),
                                    )
                                ),
                            )
                            .build()
                    )
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .metrics(
                        PostListResponse.Data.Metrics.builder()
                            .clicks(0.0)
                            .comments(0.0)
                            .engagementRate(0.0)
                            .impressions(0.0)
                            .likes(0.0)
                            .reach(0.0)
                            .saves(0.0)
                            .shares(0.0)
                            .views(0.0)
                            .build()
                    )
                    .targetOptions(
                        PostListResponse.Data.TargetOptions.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                            .build()
                    )
                    .timezone("timezone")
                    .build()
            )
        assertThat(postListResponse.hasMore()).isEqualTo(true)
        assertThat(postListResponse.nextCursor()).contains("next_cursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val postListResponse =
            PostListResponse.builder()
                .addData(
                    PostListResponse.Data.builder()
                        .id("id")
                        .content("content")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addMedia(
                            PostListResponse.Data.Media.builder()
                                .url("https://example.com")
                                .type(PostListResponse.Data.Media.Type.IMAGE)
                                .build()
                        )
                        .publishedAt("published_at")
                        .recycledFromId("recycled_from_id")
                        .recycling(
                            PostListResponse.Data.Recycling.builder()
                                .id("id")
                                .contentVariationIndex(0.0)
                                .addContentVariation("string")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .enabled(true)
                                .expireCount(0.0)
                                .expireDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .gap(0.0)
                                .gapFreq(PostListResponse.Data.Recycling.GapFreq.DAY)
                                .lastRecycledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .nextRecycleAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .recycleCount(0.0)
                                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .scheduledAt("scheduled_at")
                        .status(PostListResponse.Data.Status.DRAFT)
                        .targets(
                            PostListResponse.Data.Targets.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf(
                                            "platform" to "twitter",
                                            "status" to "draft",
                                            "accounts" to
                                                listOf(
                                                    mapOf(
                                                        "id" to "id",
                                                        "avatar_url" to "avatar_url",
                                                        "display_name" to "display_name",
                                                        "platform_post_id" to "platform_post_id",
                                                        "url" to "url",
                                                        "username" to "username",
                                                    )
                                                ),
                                            "error" to
                                                mapOf("code" to "code", "message" to "message"),
                                        )
                                    ),
                                )
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .metrics(
                            PostListResponse.Data.Metrics.builder()
                                .clicks(0.0)
                                .comments(0.0)
                                .engagementRate(0.0)
                                .impressions(0.0)
                                .likes(0.0)
                                .reach(0.0)
                                .saves(0.0)
                                .shares(0.0)
                                .views(0.0)
                                .build()
                        )
                        .targetOptions(
                            PostListResponse.Data.TargetOptions.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                                .build()
                        )
                        .timezone("timezone")
                        .build()
                )
                .hasMore(true)
                .nextCursor("next_cursor")
                .build()

        val roundtrippedPostListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(postListResponse),
                jacksonTypeRef<PostListResponse>(),
            )

        assertThat(roundtrippedPostListResponse).isEqualTo(postListResponse)
    }
}
