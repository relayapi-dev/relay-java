// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.twitter.follow

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FollowUnfollowParamsTest {

    @Test
    fun create() {
        FollowUnfollowParams.builder()
            .accountId("account_id")
            .targetUserId("target_user_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            FollowUnfollowParams.builder()
                .accountId("account_id")
                .targetUserId("target_user_id")
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.targetUserId()).isEqualTo("target_user_id")
    }
}
