// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.whatsapp

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.core.JsonValue
import dev.relayapi.models.whatsapp.broadcasts.BroadcastCreateParams
import dev.relayapi.models.whatsapp.broadcasts.BroadcastListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BroadcastServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val broadcastService = client.whatsapp().broadcasts()

        val broadcast =
            broadcastService.create(
                BroadcastCreateParams.builder()
                    .accountId("account_id")
                    .name("name")
                    .addRecipient(
                        BroadcastCreateParams.Recipient.builder()
                            .phone("phone")
                            .variables(
                                BroadcastCreateParams.Recipient.Variables.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .template(
                        BroadcastCreateParams.Template.builder()
                            .language("language")
                            .name("name")
                            .addComponent(
                                BroadcastCreateParams.Template.Component.builder()
                                    .type(BroadcastCreateParams.Template.Component.Type.HEADER)
                                    .addParameter(
                                        BroadcastCreateParams.Template.Component.Parameter.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .scheduledAt("scheduled_at")
                    .build()
            )

        broadcast.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val broadcastService = client.whatsapp().broadcasts()

        val broadcast = broadcastService.retrieve("broadcast_id")

        broadcast.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val broadcastService = client.whatsapp().broadcasts()

        val broadcasts =
            broadcastService.list(BroadcastListParams.builder().accountId("account_id").build())

        broadcasts.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val broadcastService = client.whatsapp().broadcasts()

        broadcastService.delete("broadcast_id")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun schedule() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val broadcastService = client.whatsapp().broadcasts()

        val response = broadcastService.schedule("broadcast_id")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun send() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val broadcastService = client.whatsapp().broadcasts()

        val response = broadcastService.send("broadcast_id")

        response.validate()
    }
}
