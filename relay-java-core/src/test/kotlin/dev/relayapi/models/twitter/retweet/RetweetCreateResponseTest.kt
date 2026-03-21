// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.twitter.retweet

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RetweetCreateResponseTest {

    @Test
    fun create() {
        val retweetCreateResponse = RetweetCreateResponse.builder().success(true).build()

        assertThat(retweetCreateResponse.success()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val retweetCreateResponse = RetweetCreateResponse.builder().success(true).build()

        val roundtrippedRetweetCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(retweetCreateResponse),
                jacksonTypeRef<RetweetCreateResponse>(),
            )

        assertThat(roundtrippedRetweetCreateResponse).isEqualTo(retweetCreateResponse)
    }
}
