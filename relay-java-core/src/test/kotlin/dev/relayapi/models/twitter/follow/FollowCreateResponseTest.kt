// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.twitter.follow

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FollowCreateResponseTest {

    @Test
    fun create() {
        val followCreateResponse = FollowCreateResponse.builder().success(true).build()

        assertThat(followCreateResponse.success()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val followCreateResponse = FollowCreateResponse.builder().success(true).build()

        val roundtrippedFollowCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(followCreateResponse),
                jacksonTypeRef<FollowCreateResponse>(),
            )

        assertThat(roundtrippedFollowCreateResponse).isEqualTo(followCreateResponse)
    }
}
