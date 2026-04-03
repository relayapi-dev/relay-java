// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.posts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.JsonValue
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PostUnpublishResponseTest {

    @Test
    fun create() {
        val postUnpublishResponse =
            PostUnpublishResponse.builder()
                .id("id")
                .content("content")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addMedia(
                    PostUnpublishResponse.Media.builder()
                        .url("https://example.com")
                        .type(PostUnpublishResponse.Media.Type.IMAGE)
                        .build()
                )
                .publishedAt("published_at")
                .recycledFromId("recycled_from_id")
                .recycling(
                    PostUnpublishResponse.Recycling.builder()
                        .id("id")
                        .contentVariationIndex(0.0)
                        .addContentVariation("string")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .enabled(true)
                        .expireCount(0.0)
                        .expireDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .gap(0.0)
                        .gapFreq(PostUnpublishResponse.Recycling.GapFreq.DAY)
                        .lastRecycledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .nextRecycleAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .recycleCount(0.0)
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .scheduledAt("scheduled_at")
                .status(PostUnpublishResponse.Status.DRAFT)
                .targets(
                    PostUnpublishResponse.Targets.builder()
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
                    PostUnpublishResponse.Metrics.builder()
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
                .build()

        assertThat(postUnpublishResponse.id()).isEqualTo("id")
        assertThat(postUnpublishResponse.content()).contains("content")
        assertThat(postUnpublishResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(postUnpublishResponse.media().getOrNull())
            .containsExactly(
                PostUnpublishResponse.Media.builder()
                    .url("https://example.com")
                    .type(PostUnpublishResponse.Media.Type.IMAGE)
                    .build()
            )
        assertThat(postUnpublishResponse.publishedAt()).contains("published_at")
        assertThat(postUnpublishResponse.recycledFromId()).contains("recycled_from_id")
        assertThat(postUnpublishResponse.recycling())
            .contains(
                PostUnpublishResponse.Recycling.builder()
                    .id("id")
                    .contentVariationIndex(0.0)
                    .addContentVariation("string")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .enabled(true)
                    .expireCount(0.0)
                    .expireDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .gap(0.0)
                    .gapFreq(PostUnpublishResponse.Recycling.GapFreq.DAY)
                    .lastRecycledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .nextRecycleAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .recycleCount(0.0)
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(postUnpublishResponse.scheduledAt()).contains("scheduled_at")
        assertThat(postUnpublishResponse.status()).isEqualTo(PostUnpublishResponse.Status.DRAFT)
        assertThat(postUnpublishResponse.targets())
            .isEqualTo(
                PostUnpublishResponse.Targets.builder()
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
        assertThat(postUnpublishResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(postUnpublishResponse.metrics())
            .contains(
                PostUnpublishResponse.Metrics.builder()
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val postUnpublishResponse =
            PostUnpublishResponse.builder()
                .id("id")
                .content("content")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addMedia(
                    PostUnpublishResponse.Media.builder()
                        .url("https://example.com")
                        .type(PostUnpublishResponse.Media.Type.IMAGE)
                        .build()
                )
                .publishedAt("published_at")
                .recycledFromId("recycled_from_id")
                .recycling(
                    PostUnpublishResponse.Recycling.builder()
                        .id("id")
                        .contentVariationIndex(0.0)
                        .addContentVariation("string")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .enabled(true)
                        .expireCount(0.0)
                        .expireDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .gap(0.0)
                        .gapFreq(PostUnpublishResponse.Recycling.GapFreq.DAY)
                        .lastRecycledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .nextRecycleAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .recycleCount(0.0)
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .scheduledAt("scheduled_at")
                .status(PostUnpublishResponse.Status.DRAFT)
                .targets(
                    PostUnpublishResponse.Targets.builder()
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
                    PostUnpublishResponse.Metrics.builder()
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
                .build()

        val roundtrippedPostUnpublishResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(postUnpublishResponse),
                jacksonTypeRef<PostUnpublishResponse>(),
            )

        assertThat(roundtrippedPostUnpublishResponse).isEqualTo(postUnpublishResponse)
    }
}
