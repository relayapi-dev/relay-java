// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.tools

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.core.JsonValue
import dev.relayapi.models.tools.validate.ValidateCheckPostLengthParams
import dev.relayapi.models.tools.validate.ValidateRetrieveSubredditParams
import dev.relayapi.models.tools.validate.ValidateValidateMediaParams
import dev.relayapi.models.tools.validate.ValidateValidatePostParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ValidateServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun checkPostLength() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val validateService = client.tools().validate()

        val response =
            validateService.checkPostLength(
                ValidateCheckPostLengthParams.builder().content("content").build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveSubreddit() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val validateService = client.tools().validate()

        val response =
            validateService.retrieveSubreddit(
                ValidateRetrieveSubredditParams.builder().name("name").build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun validateMedia() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val validateService = client.tools().validate()

        val response =
            validateService.validateMedia(
                ValidateValidateMediaParams.builder().url("https://example.com").build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun validatePost() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val validateService = client.tools().validate()

        val response =
            validateService.validatePost(
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

        response.validate()
    }
}
