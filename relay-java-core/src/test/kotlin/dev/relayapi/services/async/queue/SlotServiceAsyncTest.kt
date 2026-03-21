// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.queue

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.models.queue.slots.SlotCreateParams
import dev.relayapi.models.queue.slots.SlotUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SlotServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val slotServiceAsync = client.queue().slots()

        val slotFuture =
            slotServiceAsync.create(
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

        val slot = slotFuture.get()
        slot.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val slotServiceAsync = client.queue().slots()

        val slotFuture =
            slotServiceAsync.update(
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

        val slot = slotFuture.get()
        slot.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val slotServiceAsync = client.queue().slots()

        val slotsFuture = slotServiceAsync.list()

        val slots = slotsFuture.get()
        slots.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val slotServiceAsync = client.queue().slots()

        val future = slotServiceAsync.delete()

        val response = future.get()
    }
}
