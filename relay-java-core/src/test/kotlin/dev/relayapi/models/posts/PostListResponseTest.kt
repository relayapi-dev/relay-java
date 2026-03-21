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
