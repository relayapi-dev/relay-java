// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.core.JsonValue
import dev.relayapi.models.posts.PostBulkCreateParams
import dev.relayapi.models.posts.PostCreateParams
import dev.relayapi.models.posts.PostListParams
import dev.relayapi.models.posts.PostUnpublishParams
import dev.relayapi.models.posts.PostUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PostServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val postService = client.posts()

        val post =
            postService.create(
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
            )

        post.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val postService = client.posts()

        val post = postService.retrieve("id")

        post.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val postService = client.posts()

        val post =
            postService.update(
                PostUpdateParams.builder()
                    .id("id")
                    .content("content")
                    .addMedia(
                        PostUpdateParams.Media.builder()
                            .url("https://example.com")
                            .type(PostUpdateParams.Media.Type.IMAGE)
                            .build()
                    )
                    .notes("notes")
                    .recycling(
                        PostUpdateParams.Recycling.builder()
                            .gap(1L)
                            .gapFreq(PostUpdateParams.Recycling.GapFreq.DAY)
                            .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .addContentVariation("string")
                            .enabled(true)
                            .expireCount(1L)
                            .expireDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .scheduledAt("now")
                    .targetOptions(
                        PostUpdateParams.TargetOptions.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                            .build()
                    )
                    .addTarget("string")
                    .timezone("timezone")
                    .build()
            )

        post.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val postService = client.posts()

        val posts =
            postService.list(
                PostListParams.builder()
                    .accountId("account_id")
                    .cursor("cursor")
                    .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .include("include")
                    .includeExternal(PostListParams.IncludeExternal.TRUE)
                    .limit(1L)
                    .status(PostListParams.Status.DRAFT)
                    .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .workspaceId("workspace_id")
                    .build()
            )

        posts.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val postService = client.posts()

        postService.delete("id")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun bulkCreate() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val postService = client.posts()

        val response =
            postService.bulkCreate(
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
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf("foo" to "bar")),
                                    )
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
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retry() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val postService = client.posts()

        val response = postService.retry("id")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun unpublish() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val postService = client.posts()

        val response =
            postService.unpublish(
                PostUnpublishParams.builder().id("id").addPlatform("string").build()
            )

        response.validate()
    }
}
