// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.twitter

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.models.twitter.follow.FollowCreateParams
import dev.relayapi.models.twitter.follow.FollowUnfollowParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FollowServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val followServiceAsync = client.twitter().follow()

        val followFuture =
            followServiceAsync.create(
                FollowCreateParams.builder()
                    .accountId("account_id")
                    .targetUserId("target_user_id")
                    .build()
            )

        val follow = followFuture.get()
        follow.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun unfollow() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val followServiceAsync = client.twitter().follow()

        val responseFuture =
            followServiceAsync.unfollow(
                FollowUnfollowParams.builder()
                    .accountId("account_id")
                    .targetUserId("target_user_id")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
