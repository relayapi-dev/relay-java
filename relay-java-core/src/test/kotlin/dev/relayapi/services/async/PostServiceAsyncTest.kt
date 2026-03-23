// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.core.JsonValue
import dev.relayapi.models.posts.PostBulkCreateParams
import dev.relayapi.models.posts.PostCreateParams
import dev.relayapi.models.posts.PostListParams
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
                    .targetOptions(
                        PostCreateParams.TargetOptions.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                            .build()
                    )
                    .timezone("timezone")
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
                    .cursor("cursor")
                    .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .limit(1L)
                    .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                            .targetOptions(
                                PostBulkCreateParams.Post.TargetOptions.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf("foo" to "bar")),
                                    )
                                    .build()
                            )
                            .timezone("timezone")
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

        val responseFuture = postServiceAsync.unpublish("id")

        val response = responseFuture.get()
        response.validate()
    }
}
