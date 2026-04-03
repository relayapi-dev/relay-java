// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.posts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.JsonValue
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PostUpdateResponseTest {

    @Test
    fun create() {
        val postUpdateResponse =
            PostUpdateResponse.builder()
                .id("id")
                .content("content")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addMedia(
                    PostUpdateResponse.Media.builder()
                        .url("https://example.com")
                        .type(PostUpdateResponse.Media.Type.IMAGE)
                        .build()
                )
                .publishedAt("published_at")
                .recycledFromId("recycled_from_id")
                .recycling(
                    PostUpdateResponse.Recycling.builder()
                        .id("id")
                        .contentVariationIndex(0.0)
                        .addContentVariation("string")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .enabled(true)
                        .expireCount(0.0)
                        .expireDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .gap(0.0)
                        .gapFreq(PostUpdateResponse.Recycling.GapFreq.DAY)
                        .lastRecycledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .nextRecycleAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .recycleCount(0.0)
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .scheduledAt("scheduled_at")
                .status(PostUpdateResponse.Status.DRAFT)
                .targets(
                    PostUpdateResponse.Targets.builder()
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
                    PostUpdateResponse.Metrics.builder()
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
                    PostUpdateResponse.TargetOptions.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                        .build()
                )
                .timezone("timezone")
                .build()

        assertThat(postUpdateResponse.id()).isEqualTo("id")
        assertThat(postUpdateResponse.content()).contains("content")
        assertThat(postUpdateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(postUpdateResponse.media().getOrNull())
            .containsExactly(
                PostUpdateResponse.Media.builder()
                    .url("https://example.com")
                    .type(PostUpdateResponse.Media.Type.IMAGE)
                    .build()
            )
        assertThat(postUpdateResponse.publishedAt()).contains("published_at")
        assertThat(postUpdateResponse.recycledFromId()).contains("recycled_from_id")
        assertThat(postUpdateResponse.recycling())
            .contains(
                PostUpdateResponse.Recycling.builder()
                    .id("id")
                    .contentVariationIndex(0.0)
                    .addContentVariation("string")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .enabled(true)
                    .expireCount(0.0)
                    .expireDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .gap(0.0)
                    .gapFreq(PostUpdateResponse.Recycling.GapFreq.DAY)
                    .lastRecycledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .nextRecycleAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .recycleCount(0.0)
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(postUpdateResponse.scheduledAt()).contains("scheduled_at")
        assertThat(postUpdateResponse.status()).isEqualTo(PostUpdateResponse.Status.DRAFT)
        assertThat(postUpdateResponse.targets())
            .isEqualTo(
                PostUpdateResponse.Targets.builder()
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
        assertThat(postUpdateResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(postUpdateResponse.metrics())
            .contains(
                PostUpdateResponse.Metrics.builder()
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
        assertThat(postUpdateResponse.targetOptions())
            .contains(
                PostUpdateResponse.TargetOptions.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                    .build()
            )
        assertThat(postUpdateResponse.timezone()).contains("timezone")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val postUpdateResponse =
            PostUpdateResponse.builder()
                .id("id")
                .content("content")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addMedia(
                    PostUpdateResponse.Media.builder()
                        .url("https://example.com")
                        .type(PostUpdateResponse.Media.Type.IMAGE)
                        .build()
                )
                .publishedAt("published_at")
                .recycledFromId("recycled_from_id")
                .recycling(
                    PostUpdateResponse.Recycling.builder()
                        .id("id")
                        .contentVariationIndex(0.0)
                        .addContentVariation("string")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .enabled(true)
                        .expireCount(0.0)
                        .expireDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .gap(0.0)
                        .gapFreq(PostUpdateResponse.Recycling.GapFreq.DAY)
                        .lastRecycledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .nextRecycleAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .recycleCount(0.0)
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .scheduledAt("scheduled_at")
                .status(PostUpdateResponse.Status.DRAFT)
                .targets(
                    PostUpdateResponse.Targets.builder()
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
                    PostUpdateResponse.Metrics.builder()
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
                    PostUpdateResponse.TargetOptions.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                        .build()
                )
                .timezone("timezone")
                .build()

        val roundtrippedPostUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(postUpdateResponse),
                jacksonTypeRef<PostUpdateResponse>(),
            )

        assertThat(roundtrippedPostUpdateResponse).isEqualTo(postUpdateResponse)
    }
}
