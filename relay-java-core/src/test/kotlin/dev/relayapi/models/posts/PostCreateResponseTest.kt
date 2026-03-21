// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.posts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.JsonValue
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PostCreateResponseTest {

    @Test
    fun create() {
        val postCreateResponse =
            PostCreateResponse.builder()
                .id("id")
                .content("content")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addMedia(
                    PostCreateResponse.Media.builder()
                        .url("https://example.com")
                        .type(PostCreateResponse.Media.Type.IMAGE)
                        .build()
                )
                .scheduledAt("scheduled_at")
                .status(PostCreateResponse.Status.DRAFT)
                .targets(
                    PostCreateResponse.Targets.builder()
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

        assertThat(postCreateResponse.id()).isEqualTo("id")
        assertThat(postCreateResponse.content()).contains("content")
        assertThat(postCreateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(postCreateResponse.media().getOrNull())
            .containsExactly(
                PostCreateResponse.Media.builder()
                    .url("https://example.com")
                    .type(PostCreateResponse.Media.Type.IMAGE)
                    .build()
            )
        assertThat(postCreateResponse.scheduledAt()).contains("scheduled_at")
        assertThat(postCreateResponse.status()).isEqualTo(PostCreateResponse.Status.DRAFT)
        assertThat(postCreateResponse.targets())
            .isEqualTo(
                PostCreateResponse.Targets.builder()
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
        assertThat(postCreateResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val postCreateResponse =
            PostCreateResponse.builder()
                .id("id")
                .content("content")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addMedia(
                    PostCreateResponse.Media.builder()
                        .url("https://example.com")
                        .type(PostCreateResponse.Media.Type.IMAGE)
                        .build()
                )
                .scheduledAt("scheduled_at")
                .status(PostCreateResponse.Status.DRAFT)
                .targets(
                    PostCreateResponse.Targets.builder()
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

        val roundtrippedPostCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(postCreateResponse),
                jacksonTypeRef<PostCreateResponse>(),
            )

        assertThat(roundtrippedPostCreateResponse).isEqualTo(postCreateResponse)
    }
}
