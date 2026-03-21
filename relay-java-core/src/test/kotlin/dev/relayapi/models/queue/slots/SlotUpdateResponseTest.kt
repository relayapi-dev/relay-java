// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.queue.slots

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SlotUpdateResponseTest {

    @Test
    fun create() {
        val slotUpdateResponse =
            SlotUpdateResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .isDefault(true)
                .addSlot(
                    SlotUpdateResponse.Slot.builder()
                        .dayOfWeek(0L)
                        .time("73:16")
                        .timezone("timezone")
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .build()

        assertThat(slotUpdateResponse.id()).isEqualTo("id")
        assertThat(slotUpdateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(slotUpdateResponse.isDefault()).isEqualTo(true)
        assertThat(slotUpdateResponse.slots())
            .containsExactly(
                SlotUpdateResponse.Slot.builder()
                    .dayOfWeek(0L)
                    .time("73:16")
                    .timezone("timezone")
                    .build()
            )
        assertThat(slotUpdateResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(slotUpdateResponse.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val slotUpdateResponse =
            SlotUpdateResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .isDefault(true)
                .addSlot(
                    SlotUpdateResponse.Slot.builder()
                        .dayOfWeek(0L)
                        .time("73:16")
                        .timezone("timezone")
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .build()

        val roundtrippedSlotUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(slotUpdateResponse),
                jacksonTypeRef<SlotUpdateResponse>(),
            )

        assertThat(roundtrippedSlotUpdateResponse).isEqualTo(slotUpdateResponse)
    }
}
