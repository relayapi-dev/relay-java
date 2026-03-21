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
