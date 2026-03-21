// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.queue.slots

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SlotCreateResponseTest {

    @Test
    fun create() {
        val slotCreateResponse =
            SlotCreateResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .isDefault(true)
                .addSlot(
                    SlotCreateResponse.Slot.builder()
                        .dayOfWeek(0L)
                        .time("73:16")
                        .timezone("timezone")
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .build()

        assertThat(slotCreateResponse.id()).isEqualTo("id")
        assertThat(slotCreateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(slotCreateResponse.isDefault()).isEqualTo(true)
        assertThat(slotCreateResponse.slots())
            .containsExactly(
                SlotCreateResponse.Slot.builder()
                    .dayOfWeek(0L)
                    .time("73:16")
                    .timezone("timezone")
                    .build()
            )
        assertThat(slotCreateResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(slotCreateResponse.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val slotCreateResponse =
            SlotCreateResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .isDefault(true)
                .addSlot(
                    SlotCreateResponse.Slot.builder()
                        .dayOfWeek(0L)
                        .time("73:16")
                        .timezone("timezone")
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .build()

        val roundtrippedSlotCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(slotCreateResponse),
                jacksonTypeRef<SlotCreateResponse>(),
            )

        assertThat(roundtrippedSlotCreateResponse).isEqualTo(slotCreateResponse)
    }
}
