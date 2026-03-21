// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.connections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConnectionListLogsResponseTest {

    @Test
    fun create() {
        val connectionListLogsResponse =
            ConnectionListLogsResponse.builder()
                .addData(
                    ConnectionListLogsResponse.Data.builder()
                        .id("id")
                        .accountId("account_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .event(ConnectionListLogsResponse.Data.Event.CONNECTED)
                        .message("message")
                        .platform("platform")
                        .build()
                )
                .hasMore(true)
                .nextCursor("next_cursor")
                .build()

        assertThat(connectionListLogsResponse.data())
            .containsExactly(
                ConnectionListLogsResponse.Data.builder()
                    .id("id")
                    .accountId("account_id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .event(ConnectionListLogsResponse.Data.Event.CONNECTED)
                    .message("message")
                    .platform("platform")
                    .build()
            )
        assertThat(connectionListLogsResponse.hasMore()).isEqualTo(true)
        assertThat(connectionListLogsResponse.nextCursor()).contains("next_cursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val connectionListLogsResponse =
            ConnectionListLogsResponse.builder()
                .addData(
                    ConnectionListLogsResponse.Data.builder()
                        .id("id")
                        .accountId("account_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .event(ConnectionListLogsResponse.Data.Event.CONNECTED)
                        .message("message")
                        .platform("platform")
                        .build()
                )
                .hasMore(true)
                .nextCursor("next_cursor")
                .build()

        val roundtrippedConnectionListLogsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(connectionListLogsResponse),
                jacksonTypeRef<ConnectionListLogsResponse>(),
            )

        assertThat(roundtrippedConnectionListLogsResponse).isEqualTo(connectionListLogsResponse)
    }
}
