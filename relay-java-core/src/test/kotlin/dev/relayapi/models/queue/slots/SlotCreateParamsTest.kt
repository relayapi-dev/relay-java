// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.queue.slots

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SlotCreateParamsTest {

    @Test
    fun create() {
        SlotCreateParams.builder()
            .addSlot(
                SlotCreateParams.Slot.builder()
                    .dayOfWeek(0L)
                    .time("73:16")
                    .timezone("timezone")
                    .build()
            )
            .timezone("timezone")
            .name("name")
            .build()
    }

    @Test
    fun body() {
        val params =
            SlotCreateParams.builder()
                .addSlot(
                    SlotCreateParams.Slot.builder()
                        .dayOfWeek(0L)
                        .time("73:16")
                        .timezone("timezone")
                        .build()
                )
                .timezone("timezone")
                .name("name")
                .build()

        val body = params._body()

        assertThat(body.slots())
            .containsExactly(
                SlotCreateParams.Slot.builder()
                    .dayOfWeek(0L)
                    .time("73:16")
                    .timezone("timezone")
                    .build()
            )
        assertThat(body.timezone()).isEqualTo("timezone")
        assertThat(body.name()).contains("name")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SlotCreateParams.builder()
                .addSlot(
                    SlotCreateParams.Slot.builder()
                        .dayOfWeek(0L)
                        .time("73:16")
                        .timezone("timezone")
                        .build()
                )
                .timezone("timezone")
                .build()

        val body = params._body()

        assertThat(body.slots())
            .containsExactly(
                SlotCreateParams.Slot.builder()
                    .dayOfWeek(0L)
                    .time("73:16")
                    .timezone("timezone")
                    .build()
            )
        assertThat(body.timezone()).isEqualTo("timezone")
    }
}
