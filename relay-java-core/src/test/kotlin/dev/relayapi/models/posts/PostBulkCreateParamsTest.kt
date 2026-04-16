// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.posts

import dev.relayapi.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PostBulkCreateParamsTest {

    @Test
    fun create() {
        PostBulkCreateParams.builder()
            .addPost(
                PostBulkCreateParams.Post.builder()
                    .scheduledAt("now")
                    .addTarget("string")
                    .content("content")
                    .addCrossPostAction(
                        PostBulkCreateParams.Post.CrossPostAction.builder()
                            .actionType(PostBulkCreateParams.Post.CrossPostAction.ActionType.REPOST)
                            .targetAccountId("target_account_id")
                            .content("content")
                            .delayMinutes(0L)
                            .build()
                    )
                    .ideaId("idea_id")
                    .addMedia(
                        PostBulkCreateParams.Post.Media.builder()
                            .url("https://example.com")
                            .type(PostBulkCreateParams.Post.Media.Type.IMAGE)
                            .build()
                    )
                    .recycling(
                        PostBulkCreateParams.Post.Recycling.builder()
                            .gap(1L)
                            .gapFreq(PostBulkCreateParams.Post.Recycling.GapFreq.DAY)
                            .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .addContentVariation("string")
                            .enabled(true)
                            .expireCount(1L)
                            .expireDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .shortenUrls(true)
                    .skipSignature(true)
                    .targetOptions(
                        PostBulkCreateParams.Post.TargetOptions.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                            .build()
                    )
                    .templateId("template_id")
                    .templateVariables(
                        PostBulkCreateParams.Post.TemplateVariables.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .timezone("timezone")
                    .workspaceId("workspace_id")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            PostBulkCreateParams.builder()
                .addPost(
                    PostBulkCreateParams.Post.builder()
                        .scheduledAt("now")
                        .addTarget("string")
                        .content("content")
                        .addCrossPostAction(
                            PostBulkCreateParams.Post.CrossPostAction.builder()
                                .actionType(
                                    PostBulkCreateParams.Post.CrossPostAction.ActionType.REPOST
                                )
                                .targetAccountId("target_account_id")
                                .content("content")
                                .delayMinutes(0L)
                                .build()
                        )
                        .ideaId("idea_id")
                        .addMedia(
                            PostBulkCreateParams.Post.Media.builder()
                                .url("https://example.com")
                                .type(PostBulkCreateParams.Post.Media.Type.IMAGE)
                                .build()
                        )
                        .recycling(
                            PostBulkCreateParams.Post.Recycling.builder()
                                .gap(1L)
                                .gapFreq(PostBulkCreateParams.Post.Recycling.GapFreq.DAY)
                                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .addContentVariation("string")
                                .enabled(true)
                                .expireCount(1L)
                                .expireDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .shortenUrls(true)
                        .skipSignature(true)
                        .targetOptions(
                            PostBulkCreateParams.Post.TargetOptions.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                                .build()
                        )
                        .templateId("template_id")
                        .templateVariables(
                            PostBulkCreateParams.Post.TemplateVariables.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .timezone("timezone")
                        .workspaceId("workspace_id")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.posts())
            .containsExactly(
                PostBulkCreateParams.Post.builder()
                    .scheduledAt("now")
                    .addTarget("string")
                    .content("content")
                    .addCrossPostAction(
                        PostBulkCreateParams.Post.CrossPostAction.builder()
                            .actionType(PostBulkCreateParams.Post.CrossPostAction.ActionType.REPOST)
                            .targetAccountId("target_account_id")
                            .content("content")
                            .delayMinutes(0L)
                            .build()
                    )
                    .ideaId("idea_id")
                    .addMedia(
                        PostBulkCreateParams.Post.Media.builder()
                            .url("https://example.com")
                            .type(PostBulkCreateParams.Post.Media.Type.IMAGE)
                            .build()
                    )
                    .recycling(
                        PostBulkCreateParams.Post.Recycling.builder()
                            .gap(1L)
                            .gapFreq(PostBulkCreateParams.Post.Recycling.GapFreq.DAY)
                            .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .addContentVariation("string")
                            .enabled(true)
                            .expireCount(1L)
                            .expireDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .shortenUrls(true)
                    .skipSignature(true)
                    .targetOptions(
                        PostBulkCreateParams.Post.TargetOptions.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                            .build()
                    )
                    .templateId("template_id")
                    .templateVariables(
                        PostBulkCreateParams.Post.TemplateVariables.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .timezone("timezone")
                    .workspaceId("workspace_id")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PostBulkCreateParams.builder()
                .addPost(
                    PostBulkCreateParams.Post.builder()
                        .scheduledAt("now")
                        .addTarget("string")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.posts())
            .containsExactly(
                PostBulkCreateParams.Post.builder().scheduledAt("now").addTarget("string").build()
            )
    }
}
