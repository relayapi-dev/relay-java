// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.queue

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QueueGetNextSlotResponseTest {

    @Test
    fun create() {
        val queueGetNextSlotResponse =
            QueueGetNextSlotResponse.builder()
                .nextSlotAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .queueId("queue_id")
                .build()

        assertThat(queueGetNextSlotResponse.nextSlotAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(queueGetNextSlotResponse.queueId()).isEqualTo("queue_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val queueGetNextSlotResponse =
            QueueGetNextSlotResponse.builder()
                .nextSlotAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .queueId("queue_id")
                .build()

        val roundtrippedQueueGetNextSlotResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(queueGetNextSlotResponse),
                jacksonTypeRef<QueueGetNextSlotResponse>(),
            )

        assertThat(roundtrippedQueueGetNextSlotResponse).isEqualTo(queueGetNextSlotResponse)
    }
}
