// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.whatsapp.broadcasts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BroadcastScheduleResponseTest {

    @Test
    fun create() {
        val broadcastScheduleResponse =
            BroadcastScheduleResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .recipientCount(0.0)
                .status(BroadcastScheduleResponse.Status.DRAFT)
                .template("template")
                .failed(0.0)
                .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .sent(0.0)
                .build()

        assertThat(broadcastScheduleResponse.id()).isEqualTo("id")
        assertThat(broadcastScheduleResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(broadcastScheduleResponse.name()).isEqualTo("name")
        assertThat(broadcastScheduleResponse.recipientCount()).isEqualTo(0.0)
        assertThat(broadcastScheduleResponse.status())
            .isEqualTo(BroadcastScheduleResponse.Status.DRAFT)
        assertThat(broadcastScheduleResponse.template()).isEqualTo("template")
        assertThat(broadcastScheduleResponse.failed()).contains(0.0)
        assertThat(broadcastScheduleResponse.scheduledAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(broadcastScheduleResponse.sent()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val broadcastScheduleResponse =
            BroadcastScheduleResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .recipientCount(0.0)
                .status(BroadcastScheduleResponse.Status.DRAFT)
                .template("template")
                .failed(0.0)
                .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .sent(0.0)
                .build()

        val roundtrippedBroadcastScheduleResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(broadcastScheduleResponse),
                jacksonTypeRef<BroadcastScheduleResponse>(),
            )

        assertThat(roundtrippedBroadcastScheduleResponse).isEqualTo(broadcastScheduleResponse)
    }
}
