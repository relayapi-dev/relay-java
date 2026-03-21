// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.tools

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.core.JsonValue
import dev.relayapi.models.tools.validate.ValidateCheckPostLengthParams
import dev.relayapi.models.tools.validate.ValidateRetrieveSubredditParams
import dev.relayapi.models.tools.validate.ValidateValidateMediaParams
import dev.relayapi.models.tools.validate.ValidateValidatePostParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ValidateServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun checkPostLength() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val validateServiceAsync = client.tools().validate()

        val responseFuture =
            validateServiceAsync.checkPostLength(
                ValidateCheckPostLengthParams.builder().content("content").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveSubreddit() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val validateServiceAsync = client.tools().validate()

        val responseFuture =
            validateServiceAsync.retrieveSubreddit(
                ValidateRetrieveSubredditParams.builder().name("name").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun validateMedia() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val validateServiceAsync = client.tools().validate()

        val responseFuture =
            validateServiceAsync.validateMedia(
                ValidateValidateMediaParams.builder().url("https://example.com").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun validatePost() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val validateServiceAsync = client.tools().validate()

        val responseFuture =
            validateServiceAsync.validatePost(
                ValidateValidatePostParams.builder()
                    .scheduledAt("now")
                    .addTarget("string")
                    .content("content")
                    .addMedia(
                        ValidateValidatePostParams.Media.builder()
                            .url("https://example.com")
                            .type(ValidateValidatePostParams.Media.Type.IMAGE)
                            .build()
                    )
                    .targetOptions(
                        ValidateValidatePostParams.TargetOptions.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                            .build()
                    )
                    .timezone("timezone")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
