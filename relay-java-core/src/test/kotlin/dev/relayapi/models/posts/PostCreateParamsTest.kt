// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.posts

import dev.relayapi.core.JsonValue
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PostCreateParamsTest {

    @Test
    fun create() {
        PostCreateParams.builder()
            .scheduledAt("now")
            .addTarget("string")
            .content("content")
            .addCrossPostAction(
                PostCreateParams.CrossPostAction.builder()
                    .actionType(PostCreateParams.CrossPostAction.ActionType.REPOST)
                    .targetAccountId("target_account_id")
                    .content("content")
                    .delayMinutes(0L)
                    .build()
            )
            .addMedia(
                PostCreateParams.Media.builder()
                    .url("https://example.com")
                    .type(PostCreateParams.Media.Type.IMAGE)
                    .build()
            )
            .recycling(
                PostCreateParams.Recycling.builder()
                    .gap(1L)
                    .gapFreq(PostCreateParams.Recycling.GapFreq.DAY)
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
                PostCreateParams.TargetOptions.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                    .build()
            )
            .templateId("template_id")
            .templateVariables(
                PostCreateParams.TemplateVariables.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .timezone("timezone")
            .workspaceId("workspace_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            PostCreateParams.builder()
                .scheduledAt("now")
                .addTarget("string")
                .content("content")
                .addCrossPostAction(
                    PostCreateParams.CrossPostAction.builder()
                        .actionType(PostCreateParams.CrossPostAction.ActionType.REPOST)
                        .targetAccountId("target_account_id")
                        .content("content")
                        .delayMinutes(0L)
                        .build()
                )
                .addMedia(
                    PostCreateParams.Media.builder()
                        .url("https://example.com")
                        .type(PostCreateParams.Media.Type.IMAGE)
                        .build()
                )
                .recycling(
                    PostCreateParams.Recycling.builder()
                        .gap(1L)
                        .gapFreq(PostCreateParams.Recycling.GapFreq.DAY)
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
                    PostCreateParams.TargetOptions.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                        .build()
                )
                .templateId("template_id")
                .templateVariables(
                    PostCreateParams.TemplateVariables.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .timezone("timezone")
                .workspaceId("workspace_id")
                .build()

        val body = params._body()

        assertThat(body.scheduledAt()).isEqualTo("now")
        assertThat(body.targets()).containsExactly("string")
        assertThat(body.content()).contains("content")
        assertThat(body.crossPostActions().getOrNull())
            .containsExactly(
                PostCreateParams.CrossPostAction.builder()
                    .actionType(PostCreateParams.CrossPostAction.ActionType.REPOST)
                    .targetAccountId("target_account_id")
                    .content("content")
                    .delayMinutes(0L)
                    .build()
            )
        assertThat(body.media().getOrNull())
            .containsExactly(
                PostCreateParams.Media.builder()
                    .url("https://example.com")
                    .type(PostCreateParams.Media.Type.IMAGE)
                    .build()
            )
        assertThat(body.recycling())
            .contains(
                PostCreateParams.Recycling.builder()
                    .gap(1L)
                    .gapFreq(PostCreateParams.Recycling.GapFreq.DAY)
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addContentVariation("string")
                    .enabled(true)
                    .expireCount(1L)
                    .expireDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(body.shortenUrls()).contains(true)
        assertThat(body.skipSignature()).contains(true)
        assertThat(body.targetOptions())
            .contains(
                PostCreateParams.TargetOptions.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                    .build()
            )
        assertThat(body.templateId()).contains("template_id")
        assertThat(body.templateVariables())
            .contains(
                PostCreateParams.TemplateVariables.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.timezone()).contains("timezone")
        assertThat(body.workspaceId()).contains("workspace_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = PostCreateParams.builder().scheduledAt("now").addTarget("string").build()

        val body = params._body()

        assertThat(body.scheduledAt()).isEqualTo("now")
        assertThat(body.targets()).containsExactly("string")
    }
}
