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

        val roundtrippedPostUnpublishResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(postUnpublishResponse),
                jacksonTypeRef<PostUnpublishResponse>(),
            )

        assertThat(roundtrippedPostUnpublishResponse).isEqualTo(postUnpublishResponse)
    }
}
