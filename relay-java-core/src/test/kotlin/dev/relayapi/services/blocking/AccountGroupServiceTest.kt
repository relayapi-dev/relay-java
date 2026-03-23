// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.models.accountgroups.AccountGroupCreateParams
import dev.relayapi.models.accountgroups.AccountGroupListParams
import dev.relayapi.models.accountgroups.AccountGroupUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AccountGroupServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val accountGroupService = client.accountGroups()

        val accountGroup =
            accountGroupService.create(
                AccountGroupCreateParams.builder().name("x").description("description").build()
            )

        accountGroup.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val accountGroupService = client.accountGroups()

        val accountGroup =
            accountGroupService.update(
                AccountGroupUpdateParams.builder()
                    .id("id")
                    .description("description")
                    .name("x")
                    .build()
            )

        accountGroup.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val accountGroupService = client.accountGroups()

        val accountGroups =
            accountGroupService.list(
                AccountGroupListParams.builder()
                    .cursor("cursor")
                    .limit(1.0)
                    .search("search")
                    .build()
            )

        accountGroups.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val accountGroupService = client.accountGroups()

        accountGroupService.delete("id")
    }
}
