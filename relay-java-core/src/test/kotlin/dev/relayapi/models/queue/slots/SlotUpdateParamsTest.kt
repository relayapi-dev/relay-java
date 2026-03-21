// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.queue.slots

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SlotUpdateParamsTest {

    @Test
    fun create() {
        SlotUpdateParams.builder()
            .name("name")
            .setAsDefault(true)
            .addSlot(
                SlotUpdateParams.Slot.builder()
                    .dayOfWeek(0L)
                    .time("73:16")
                    .timezone("timezone")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            SlotUpdateParams.builder()
                .name("name")
                .setAsDefault(true)
                .addSlot(
                    SlotUpdateParams.Slot.builder()
                        .dayOfWeek(0L)
                        .time("73:16")
                        .timezone("timezone")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.name()).contains("name")
        assertThat(body.setAsDefault()).contains(true)
        assertThat(body.slots().getOrNull())
            .containsExactly(
                SlotUpdateParams.Slot.builder()
                    .dayOfWeek(0L)
                    .time("73:16")
                    .timezone("timezone")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SlotUpdateParams.builder().build()

        val body = params._body()
    }
}
