// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.connect.snapchat

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.models.connect.snapchat.profiles.ProfileSelectParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ProfileServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val profileService = client.connect().snapchat().profiles()

        val profiles = profileService.list()

        profiles.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun select() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val profileService = client.connect().snapchat().profiles()

        val response =
            profileService.select(
                ProfileSelectParams.builder()
                    .connectToken("connect_token")
                    .profileId("profile_id")
                    .build()
            )

        response.validate()
    }
}
