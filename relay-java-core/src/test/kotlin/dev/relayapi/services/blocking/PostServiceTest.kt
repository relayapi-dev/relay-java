// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.core.JsonValue
import dev.relayapi.models.posts.PostBulkCreateParams
import dev.relayapi.models.posts.PostCreateParams
import dev.relayapi.models.posts.PostListParams
import dev.relayapi.models.posts.PostUpdateParams
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

        val posts = postService.list(PostListParams.builder().cursor("cursor").limit(1L).build())

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

        val response = postService.unpublish("id")

        response.validate()
    }
}
