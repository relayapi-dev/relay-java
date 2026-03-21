// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.whatsapp

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.models.whatsapp.groups.GroupCreateParams
import dev.relayapi.models.whatsapp.groups.GroupListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GroupServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val groupServiceAsync = client.whatsapp().groups()

        val groupFuture =
            groupServiceAsync.create(
                GroupCreateParams.builder()
                    .accountId("account_id")
                    .name("name")
                    .addContactId("string")
                    .description("description")
                    .build()
            )

        val group = groupFuture.get()
        group.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val groupServiceAsync = client.whatsapp().groups()

        val groupsFuture =
            groupServiceAsync.list(GroupListParams.builder().accountId("account_id").build())

        val groups = groupsFuture.get()
        groups.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val groupServiceAsync = client.whatsapp().groups()

        val future = groupServiceAsync.delete("group_id")

        val response = future.get()
    }
}
