// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.models.accountgroups.AccountGroupCreateParams
import dev.relayapi.models.accountgroups.AccountGroupListParams
import dev.relayapi.models.accountgroups.AccountGroupUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AccountGroupServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accountGroupServiceAsync = client.accountGroups()

        val accountGroupFuture =
            accountGroupServiceAsync.create(
                AccountGroupCreateParams.builder().name("x").description("description").build()
            )

        val accountGroup = accountGroupFuture.get()
        accountGroup.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accountGroupServiceAsync = client.accountGroups()

        val accountGroupFuture =
            accountGroupServiceAsync.update(
                AccountGroupUpdateParams.builder()
                    .id("id")
                    .description("description")
                    .name("x")
                    .build()
            )

        val accountGroup = accountGroupFuture.get()
        accountGroup.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accountGroupServiceAsync = client.accountGroups()

        val accountGroupsFuture =
            accountGroupServiceAsync.list(
                AccountGroupListParams.builder()
                    .cursor("cursor")
                    .limit(1.0)
                    .search("search")
                    .build()
            )

        val accountGroups = accountGroupsFuture.get()
        accountGroups.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accountGroupServiceAsync = client.accountGroups()

        val future = accountGroupServiceAsync.delete("id")

        val response = future.get()
    }
}
