// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.core.JsonValue
import dev.relayapi.models.accounts.AccountListParams
import dev.relayapi.models.accounts.AccountUpdateParams
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
            accountServiceAsync.list(AccountListParams.builder().cursor("cursor").limit(1L).build())

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
