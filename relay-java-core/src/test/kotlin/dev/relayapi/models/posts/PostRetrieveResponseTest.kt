// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.posts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.JsonValue
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PostRetrieveResponseTest {

    @Test
    fun create() {
        val postRetrieveResponse =
            PostRetrieveResponse.builder()
                .id("id")
                .content("content")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addMedia(
                    PostRetrieveResponse.Media.builder()
                        .url("https://example.com")
                        .type(PostRetrieveResponse.Media.Type.IMAGE)
                        .build()
                )
                .publishedAt("published_at")
                .recycledFromId("recycled_from_id")
                .recycling(
                    PostRetrieveResponse.Recycling.builder()
                        .id("id")
                        .contentVariationIndex(0.0)
                        .addContentVariation("string")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .enabled(true)
                        .expireCount(0.0)
                        .expireDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .gap(0.0)
                        .gapFreq(PostRetrieveResponse.Recycling.GapFreq.DAY)
                        .lastRecycledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .nextRecycleAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .recycleCount(0.0)
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .scheduledAt("scheduled_at")
                .status(PostRetrieveResponse.Status.DRAFT)
                .targets(
                    PostRetrieveResponse.Targets.builder()
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

        assertThat(postRetrieveResponse.id()).isEqualTo("id")
        assertThat(postRetrieveResponse.content()).contains("content")
        assertThat(postRetrieveResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(postRetrieveResponse.media().getOrNull())
            .containsExactly(
                PostRetrieveResponse.Media.builder()
                    .url("https://example.com")
                    .type(PostRetrieveResponse.Media.Type.IMAGE)
                    .build()
            )
        assertThat(postRetrieveResponse.publishedAt()).contains("published_at")
        assertThat(postRetrieveResponse.recycledFromId()).contains("recycled_from_id")
        assertThat(postRetrieveResponse.recycling())
            .contains(
                PostRetrieveResponse.Recycling.builder()
                    .id("id")
                    .contentVariationIndex(0.0)
                    .addContentVariation("string")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .enabled(true)
                    .expireCount(0.0)
                    .expireDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .gap(0.0)
                    .gapFreq(PostRetrieveResponse.Recycling.GapFreq.DAY)
                    .lastRecycledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .nextRecycleAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .recycleCount(0.0)
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(postRetrieveResponse.scheduledAt()).contains("scheduled_at")
        assertThat(postRetrieveResponse.status()).isEqualTo(PostRetrieveResponse.Status.DRAFT)
        assertThat(postRetrieveResponse.targets())
            .isEqualTo(
                PostRetrieveResponse.Targets.builder()
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
        assertThat(postRetrieveResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val postRetrieveResponse =
            PostRetrieveResponse.builder()
                .id("id")
                .content("content")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addMedia(
                    PostRetrieveResponse.Media.builder()
                        .url("https://example.com")
                        .type(PostRetrieveResponse.Media.Type.IMAGE)
                        .build()
                )
                .publishedAt("published_at")
                .recycledFromId("recycled_from_id")
                .recycling(
                    PostRetrieveResponse.Recycling.builder()
                        .id("id")
                        .contentVariationIndex(0.0)
                        .addContentVariation("string")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .enabled(true)
                        .expireCount(0.0)
                        .expireDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .gap(0.0)
                        .gapFreq(PostRetrieveResponse.Recycling.GapFreq.DAY)
                        .lastRecycledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .nextRecycleAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .recycleCount(0.0)
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .scheduledAt("scheduled_at")
                .status(PostRetrieveResponse.Status.DRAFT)
                .targets(
                    PostRetrieveResponse.Targets.builder()
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

        val roundtrippedPostRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(postRetrieveResponse),
                jacksonTypeRef<PostRetrieveResponse>(),
            )

        assertThat(roundtrippedPostRetrieveResponse).isEqualTo(postRetrieveResponse)
    }
}
