// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.whatsapp

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.core.JsonValue
import dev.relayapi.models.whatsapp.broadcasts.BroadcastCreateParams
import dev.relayapi.models.whatsapp.broadcasts.BroadcastListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BroadcastServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val broadcastServiceAsync = client.whatsapp().broadcasts()

        val broadcastFuture =
            broadcastServiceAsync.create(
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

        val broadcast = broadcastFuture.get()
        broadcast.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val broadcastServiceAsync = client.whatsapp().broadcasts()

        val broadcastFuture = broadcastServiceAsync.retrieve("broadcast_id")

        val broadcast = broadcastFuture.get()
        broadcast.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val broadcastServiceAsync = client.whatsapp().broadcasts()

        val broadcastsFuture =
            broadcastServiceAsync.list(
                BroadcastListParams.builder().accountId("account_id").build()
            )

        val broadcasts = broadcastsFuture.get()
        broadcasts.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val broadcastServiceAsync = client.whatsapp().broadcasts()

        val future = broadcastServiceAsync.delete("broadcast_id")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun schedule() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val broadcastServiceAsync = client.whatsapp().broadcasts()

        val responseFuture = broadcastServiceAsync.schedule("broadcast_id")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun send() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val broadcastServiceAsync = client.whatsapp().broadcasts()

        val responseFuture = broadcastServiceAsync.send("broadcast_id")

        val response = responseFuture.get()
        response.validate()
    }
}
