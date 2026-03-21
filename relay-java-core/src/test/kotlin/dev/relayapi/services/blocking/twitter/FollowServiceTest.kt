// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.twitter

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.models.twitter.follow.FollowCreateParams
import dev.relayapi.models.twitter.follow.FollowUnfollowParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FollowServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val followService = client.twitter().follow()

        val follow =
            followService.create(
                FollowCreateParams.builder()
                    .accountId("account_id")
                    .targetUserId("target_user_id")
                    .build()
            )

        follow.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun unfollow() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val followService = client.twitter().follow()

        val response =
            followService.unfollow(
                FollowUnfollowParams.builder()
                    .accountId("account_id")
                    .targetUserId("target_user_id")
                    .build()
            )

        response.validate()
    }
}
