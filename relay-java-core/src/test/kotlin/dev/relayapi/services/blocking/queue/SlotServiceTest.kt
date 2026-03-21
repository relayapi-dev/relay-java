// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.queue

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.models.queue.slots.SlotCreateParams
import dev.relayapi.models.queue.slots.SlotUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SlotServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val slotService = client.queue().slots()

        val slot =
            slotService.create(
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
            )

        slot.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val slotService = client.queue().slots()

        val slot =
            slotService.update(
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
            )

        slot.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val slotService = client.queue().slots()

        val slots = slotService.list()

        slots.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val slotService = client.queue().slots()

        slotService.delete()
    }
}
