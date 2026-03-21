// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.connect.pinterest.boards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BoardListResponseTest {

    @Test
    fun create() {
        val boardListResponse =
            BoardListResponse.builder()
                .addBoard(
                    BoardListResponse.Board.builder()
                        .id("id")
                        .name("name")
                        .description("description")
                        .pinCount(0L)
                        .build()
                )
                .build()

        assertThat(boardListResponse.boards())
            .containsExactly(
                BoardListResponse.Board.builder()
                    .id("id")
                    .name("name")
                    .description("description")
                    .pinCount(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val boardListResponse =
            BoardListResponse.builder()
                .addBoard(
                    BoardListResponse.Board.builder()
                        .id("id")
                        .name("name")
                        .description("description")
                        .pinCount(0L)
                        .build()
                )
                .build()

        val roundtrippedBoardListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(boardListResponse),
                jacksonTypeRef<BoardListResponse>(),
            )

        assertThat(roundtrippedBoardListResponse).isEqualTo(boardListResponse)
    }
}
