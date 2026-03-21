// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.twitter.follow

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FollowUnfollowResponseTest {

    @Test
    fun create() {
        val followUnfollowResponse = FollowUnfollowResponse.builder().success(true).build()

        assertThat(followUnfollowResponse.success()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val followUnfollowResponse = FollowUnfollowResponse.builder().success(true).build()

        val roundtrippedFollowUnfollowResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(followUnfollowResponse),
                jacksonTypeRef<FollowUnfollowResponse>(),
            )

        assertThat(roundtrippedFollowUnfollowResponse).isEqualTo(followUnfollowResponse)
    }
}
