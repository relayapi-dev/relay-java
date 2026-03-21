// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.posts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.JsonValue
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PostBulkCreateResponseTest {

    @Test
    fun create() {
        val postBulkCreateResponse =
            PostBulkCreateResponse.builder()
                .addData(
                    PostBulkCreateResponse.Data.builder()
                        .id("id")
                        .content("content")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addMedia(
                            PostBulkCreateResponse.Data.Media.builder()
                                .url("https://example.com")
                                .type(PostBulkCreateResponse.Data.Media.Type.IMAGE)
                                .build()
                        )
                        .scheduledAt("scheduled_at")
                        .status(PostBulkCreateResponse.Data.Status.DRAFT)
                        .targets(
                            PostBulkCreateResponse.Data.Targets.builder()
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
                .summary(
                    PostBulkCreateResponse.Summary.builder()
                        .failed(0.0)
                        .succeeded(0.0)
                        .total(0.0)
                        .build()
                )
                .build()

        assertThat(postBulkCreateResponse.data())
            .containsExactly(
                PostBulkCreateResponse.Data.builder()
                    .id("id")
                    .content("content")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addMedia(
                        PostBulkCreateResponse.Data.Media.builder()
                            .url("https://example.com")
                            .type(PostBulkCreateResponse.Data.Media.Type.IMAGE)
                            .build()
                    )
                    .scheduledAt("scheduled_at")
                    .status(PostBulkCreateResponse.Data.Status.DRAFT)
                    .targets(
                        PostBulkCreateResponse.Data.Targets.builder()
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
        assertThat(postBulkCreateResponse.summary())
            .isEqualTo(
                PostBulkCreateResponse.Summary.builder()
                    .failed(0.0)
                    .succeeded(0.0)
                    .total(0.0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val postBulkCreateResponse =
            PostBulkCreateResponse.builder()
                .addData(
                    PostBulkCreateResponse.Data.builder()
                        .id("id")
                        .content("content")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addMedia(
                            PostBulkCreateResponse.Data.Media.builder()
                                .url("https://example.com")
                                .type(PostBulkCreateResponse.Data.Media.Type.IMAGE)
                                .build()
                        )
                        .scheduledAt("scheduled_at")
                        .status(PostBulkCreateResponse.Data.Status.DRAFT)
                        .targets(
                            PostBulkCreateResponse.Data.Targets.builder()
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
                .summary(
                    PostBulkCreateResponse.Summary.builder()
                        .failed(0.0)
                        .succeeded(0.0)
                        .total(0.0)
                        .build()
                )
                .build()

        val roundtrippedPostBulkCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(postBulkCreateResponse),
                jacksonTypeRef<PostBulkCreateResponse>(),
            )

        assertThat(roundtrippedPostBulkCreateResponse).isEqualTo(postBulkCreateResponse)
    }
}
