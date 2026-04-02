// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.posts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.JsonValue
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PostRetryResponseTest {

    @Test
    fun create() {
        val postRetryResponse =
            PostRetryResponse.builder()
                .id("id")
                .content("content")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addMedia(
                    PostRetryResponse.Media.builder()
                        .url("https://example.com")
                        .type(PostRetryResponse.Media.Type.IMAGE)
                        .build()
                )
                .publishedAt("published_at")
                .recycledFromId("recycled_from_id")
                .recycling(
                    PostRetryResponse.Recycling.builder()
                        .id("id")
                        .contentVariationIndex(0.0)
                        .addContentVariation("string")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .enabled(true)
                        .expireCount(0.0)
                        .expireDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .gap(0.0)
                        .gapFreq(PostRetryResponse.Recycling.GapFreq.DAY)
                        .lastRecycledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .nextRecycleAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .recycleCount(0.0)
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .scheduledAt("scheduled_at")
                .status(PostRetryResponse.Status.DRAFT)
                .targets(
                    PostRetryResponse.Targets.builder()
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
                .build()

        assertThat(postRetryResponse.id()).isEqualTo("id")
        assertThat(postRetryResponse.content()).contains("content")
        assertThat(postRetryResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(postRetryResponse.media().getOrNull())
            .containsExactly(
                PostRetryResponse.Media.builder()
                    .url("https://example.com")
                    .type(PostRetryResponse.Media.Type.IMAGE)
                    .build()
            )
        assertThat(postRetryResponse.publishedAt()).contains("published_at")
        assertThat(postRetryResponse.recycledFromId()).contains("recycled_from_id")
        assertThat(postRetryResponse.recycling())
            .contains(
                PostRetryResponse.Recycling.builder()
                    .id("id")
                    .contentVariationIndex(0.0)
                    .addContentVariation("string")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .enabled(true)
                    .expireCount(0.0)
                    .expireDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .gap(0.0)
                    .gapFreq(PostRetryResponse.Recycling.GapFreq.DAY)
                    .lastRecycledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .nextRecycleAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .recycleCount(0.0)
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(postRetryResponse.scheduledAt()).contains("scheduled_at")
        assertThat(postRetryResponse.status()).isEqualTo(PostRetryResponse.Status.DRAFT)
        assertThat(postRetryResponse.targets())
            .isEqualTo(
                PostRetryResponse.Targets.builder()
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
        assertThat(postRetryResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val postRetryResponse =
            PostRetryResponse.builder()
                .id("id")
                .content("content")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addMedia(
                    PostRetryResponse.Media.builder()
                        .url("https://example.com")
                        .type(PostRetryResponse.Media.Type.IMAGE)
                        .build()
                )
                .publishedAt("published_at")
                .recycledFromId("recycled_from_id")
                .recycling(
                    PostRetryResponse.Recycling.builder()
                        .id("id")
                        .contentVariationIndex(0.0)
                        .addContentVariation("string")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .enabled(true)
                        .expireCount(0.0)
                        .expireDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .gap(0.0)
                        .gapFreq(PostRetryResponse.Recycling.GapFreq.DAY)
                        .lastRecycledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .nextRecycleAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .recycleCount(0.0)
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .scheduledAt("scheduled_at")
                .status(PostRetryResponse.Status.DRAFT)
                .targets(
                    PostRetryResponse.Targets.builder()
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
                .build()

        val roundtrippedPostRetryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(postRetryResponse),
                jacksonTypeRef<PostRetryResponse>(),
            )

        assertThat(roundtrippedPostRetryResponse).isEqualTo(postRetryResponse)
    }
}
