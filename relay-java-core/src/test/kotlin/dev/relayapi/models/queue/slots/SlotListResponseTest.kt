// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.queue.slots

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SlotListResponseTest {

    @Test
    fun create() {
        val slotListResponse =
            SlotListResponse.builder()
                .addData(
                    SlotListResponse.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .isDefault(true)
                        .addSlot(
                            SlotListResponse.Data.Slot.builder()
                                .dayOfWeek(0L)
                                .time("73:16")
                                .timezone("timezone")
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .build()
                )
                .build()

        assertThat(slotListResponse.data())
            .containsExactly(
                SlotListResponse.Data.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .isDefault(true)
                    .addSlot(
                        SlotListResponse.Data.Slot.builder()
                            .dayOfWeek(0L)
                            .time("73:16")
                            .timezone("timezone")
                            .build()
                    )
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("name")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val slotListResponse =
            SlotListResponse.builder()
                .addData(
                    SlotListResponse.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .isDefault(true)
                        .addSlot(
                            SlotListResponse.Data.Slot.builder()
                                .dayOfWeek(0L)
                                .time("73:16")
                                .timezone("timezone")
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .build()
                )
                .build()

        val roundtrippedSlotListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(slotListResponse),
                jacksonTypeRef<SlotListResponse>(),
            )

        assertThat(roundtrippedSlotListResponse).isEqualTo(slotListResponse)
    }
}
