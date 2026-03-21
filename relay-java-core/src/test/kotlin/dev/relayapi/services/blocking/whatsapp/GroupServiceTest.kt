// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.whatsapp

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.models.whatsapp.groups.GroupCreateParams
import dev.relayapi.models.whatsapp.groups.GroupListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GroupServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val groupService = client.whatsapp().groups()

        val group =
            groupService.create(
                GroupCreateParams.builder()
                    .accountId("account_id")
                    .name("name")
                    .addContactId("string")
                    .description("description")
                    .build()
            )

        group.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val groupService = client.whatsapp().groups()

        val groups = groupService.list(GroupListParams.builder().accountId("account_id").build())

        groups.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val groupService = client.whatsapp().groups()

        groupService.delete("group_id")
    }
}
