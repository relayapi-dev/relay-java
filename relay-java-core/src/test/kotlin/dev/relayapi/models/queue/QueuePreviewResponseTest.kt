// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.queue

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QueuePreviewResponseTest {

    @Test
    fun create() {
        val queuePreviewResponse =
            QueuePreviewResponse.builder()
                .addSlot(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(queuePreviewResponse.slots())
            .containsExactly(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val queuePreviewResponse =
            QueuePreviewResponse.builder()
                .addSlot(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedQueuePreviewResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(queuePreviewResponse),
                jacksonTypeRef<QueuePreviewResponse>(),
            )

        assertThat(roundtrippedQueuePreviewResponse).isEqualTo(queuePreviewResponse)
    }
}
