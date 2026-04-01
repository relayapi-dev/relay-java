// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.core.JsonValue
import dev.relayapi.models.accounts.AccountListParams
import dev.relayapi.models.accounts.AccountUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AccountServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val accountService = client.accounts()

        val account = accountService.retrieve("id")

        account.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val accountService = client.accounts()

        val account =
            accountService.update(
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

        account.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val accountService = client.accounts()

        val accounts =
            accountService.list(
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

        accounts.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val accountService = client.accounts()

        accountService.delete("id")
    }
}
