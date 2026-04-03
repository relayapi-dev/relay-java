// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.core.JsonValue
import dev.relayapi.models.posts.PostBulkCreateParams
import dev.relayapi.models.posts.PostCreateParams
import dev.relayapi.models.posts.PostListParams
import dev.relayapi.models.posts.PostUnpublishParams
import dev.relayapi.models.posts.PostUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PostServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val postServiceAsync = client.posts()

        val postFuture =
            postServiceAsync.create(
                PostCreateParams.builder()
                    .scheduledAt("now")
                    .addTarget("string")
                    .content("content")
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
                    .targetOptions(
                        PostCreateParams.TargetOptions.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                            .build()
                    )
                    .timezone("timezone")
                    .workspaceId("workspace_id")
                    .build()
            )

        val post = postFuture.get()
        post.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val postServiceAsync = client.posts()

        val postFuture = postServiceAsync.retrieve("id")

        val post = postFuture.get()
        post.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val postServiceAsync = client.posts()

        val postFuture =
            postServiceAsync.update(
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

        val post = postFuture.get()
        post.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val postServiceAsync = client.posts()

        val postsFuture =
            postServiceAsync.list(
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

        val posts = postsFuture.get()
        posts.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val postServiceAsync = client.posts()

        val future = postServiceAsync.delete("id")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun bulkCreate() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val postServiceAsync = client.posts()

        val responseFuture =
            postServiceAsync.bulkCreate(
                PostBulkCreateParams.builder()
                    .addPost(
                        PostBulkCreateParams.Post.builder()
                            .scheduledAt("now")
                            .addTarget("string")
                            .content("content")
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
                            .targetOptions(
                                PostBulkCreateParams.Post.TargetOptions.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf("foo" to "bar")),
                                    )
                                    .build()
                            )
                            .timezone("timezone")
                            .workspaceId("workspace_id")
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retry() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val postServiceAsync = client.posts()

        val responseFuture = postServiceAsync.retry("id")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun unpublish() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val postServiceAsync = client.posts()

        val responseFuture =
            postServiceAsync.unpublish(
                PostUnpublishParams.builder().id("id").addPlatform("string").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
