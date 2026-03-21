// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.connect.snapchat

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.models.connect.snapchat.profiles.ProfileSelectParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ProfileServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val profileServiceAsync = client.connect().snapchat().profiles()

        val profilesFuture = profileServiceAsync.list()

        val profiles = profilesFuture.get()
        profiles.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun select() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val profileServiceAsync = client.connect().snapchat().profiles()

        val responseFuture =
            profileServiceAsync.select(
                ProfileSelectParams.builder()
                    .connectToken("connect_token")
                    .profileId("profile_id")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
