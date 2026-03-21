// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.accounts.pinterestboards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PinterestBoardRetrieveResponseTest {

    @Test
    fun create() {
        val pinterestBoardRetrieveResponse =
            PinterestBoardRetrieveResponse.builder()
                .addData(
                    PinterestBoardRetrieveResponse.Data.builder()
                        .id("id")
                        .name("name")
                        .url("url")
                        .build()
                )
                .build()

        assertThat(pinterestBoardRetrieveResponse.data())
            .containsExactly(
                PinterestBoardRetrieveResponse.Data.builder()
                    .id("id")
                    .name("name")
                    .url("url")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pinterestBoardRetrieveResponse =
            PinterestBoardRetrieveResponse.builder()
                .addData(
                    PinterestBoardRetrieveResponse.Data.builder()
                        .id("id")
                        .name("name")
                        .url("url")
                        .build()
                )
                .build()

        val roundtrippedPinterestBoardRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pinterestBoardRetrieveResponse),
                jacksonTypeRef<PinterestBoardRetrieveResponse>(),
            )

        assertThat(roundtrippedPinterestBoardRetrieveResponse)
            .isEqualTo(pinterestBoardRetrieveResponse)
    }
}
