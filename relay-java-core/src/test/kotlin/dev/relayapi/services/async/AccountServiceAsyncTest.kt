// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.core.JsonValue
import dev.relayapi.models.accounts.AccountListParams
import dev.relayapi.models.accounts.AccountUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AccountServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accountServiceAsync = client.accounts()

        val accountFuture = accountServiceAsync.retrieve("id")

        val account = accountFuture.get()
        account.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accountServiceAsync = client.accounts()

        val accountFuture =
            accountServiceAsync.update(
                AccountUpdateParams.builder()
                    .id("id")
                    .displayName("display_name")
                    .metadata(
                        AccountUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .workspaceId("workspace_id")
                    .build()
            )

        val account = accountFuture.get()
        account.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accountServiceAsync = client.accounts()

        val accountsFuture =
            accountServiceAsync.list(
                AccountListParams.builder()
                    .cursor("cursor")
                    .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .limit(1L)
                    .platforms("platforms")
                    .search("search")
                    .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .ungrouped(true)
                    .workspaceId("workspace_id")
                    .build()
            )

        val accounts = accountsFuture.get()
        accounts.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accountServiceAsync = client.accounts()

        val future = accountServiceAsync.delete("id")

        val response = future.get()
    }
}
