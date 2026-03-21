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

        val roundtrippedPostUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(postUpdateResponse),
                jacksonTypeRef<PostUpdateResponse>(),
            )

        assertThat(roundtrippedPostUpdateResponse).isEqualTo(postUpdateResponse)
    }
}
