// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.twitter.retweet

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RetweetUndoResponseTest {

    @Test
    fun create() {
        val retweetUndoResponse = RetweetUndoResponse.builder().success(true).build()

        assertThat(retweetUndoResponse.success()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val retweetUndoResponse = RetweetUndoResponse.builder().success(true).build()

        val roundtrippedRetweetUndoResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(retweetUndoResponse),
                jacksonTypeRef<RetweetUndoResponse>(),
            )

        assertThat(roundtrippedRetweetUndoResponse).isEqualTo(retweetUndoResponse)
    }
}
