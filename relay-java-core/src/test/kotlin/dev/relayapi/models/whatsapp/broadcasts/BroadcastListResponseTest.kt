// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.whatsapp.broadcasts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BroadcastListResponseTest {

    @Test
    fun create() {
        val broadcastListResponse =
            BroadcastListResponse.builder()
                .addData(
                    BroadcastListResponse.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .recipientCount(0.0)
                        .status(BroadcastListResponse.Data.Status.DRAFT)
                        .template("template")
                        .failed(0.0)
                        .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .sent(0.0)
                        .build()
                )
                .build()

        assertThat(broadcastListResponse.data())
            .containsExactly(
                BroadcastListResponse.Data.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("name")
                    .recipientCount(0.0)
                    .status(BroadcastListResponse.Data.Status.DRAFT)
                    .template("template")
                    .failed(0.0)
                    .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .sent(0.0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val broadcastListResponse =
            BroadcastListResponse.builder()
                .addData(
                    BroadcastListResponse.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .recipientCount(0.0)
                        .status(BroadcastListResponse.Data.Status.DRAFT)
                        .template("template")
                        .failed(0.0)
                        .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .sent(0.0)
                        .build()
                )
                .build()

        val roundtrippedBroadcastListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(broadcastListResponse),
                jacksonTypeRef<BroadcastListResponse>(),
            )

        assertThat(roundtrippedBroadcastListResponse).isEqualTo(broadcastListResponse)
    }
}
