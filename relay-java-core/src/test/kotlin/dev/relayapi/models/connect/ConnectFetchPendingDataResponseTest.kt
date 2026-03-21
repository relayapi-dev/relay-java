// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.connect

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.JsonValue
import dev.relayapi.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConnectFetchPendingDataResponseTest {

    @Test
    fun create() {
        val connectFetchPendingDataResponse =
            ConnectFetchPendingDataResponse.builder()
                .platform(ConnectFetchPendingDataResponse.Platform.TWITTER)
                .tempToken("temp_token")
                .userProfile(
                    ConnectFetchPendingDataResponse.UserProfile.builder()
                        .id("id")
                        .avatarUrl("avatar_url")
                        .name("name")
                        .username("username")
                        .build()
                )
                .addBoard(
                    ConnectFetchPendingDataResponse.Board.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addLocation(
                    ConnectFetchPendingDataResponse.Location.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addOrganization(
                    ConnectFetchPendingDataResponse.Organization.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addPage(
                    ConnectFetchPendingDataResponse.Page.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addProfile(
                    ConnectFetchPendingDataResponse.Profile.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(connectFetchPendingDataResponse.platform())
            .isEqualTo(ConnectFetchPendingDataResponse.Platform.TWITTER)
        assertThat(connectFetchPendingDataResponse.tempToken()).isEqualTo("temp_token")
        assertThat(connectFetchPendingDataResponse.userProfile())
            .isEqualTo(
                ConnectFetchPendingDataResponse.UserProfile.builder()
                    .id("id")
                    .avatarUrl("avatar_url")
                    .name("name")
                    .username("username")
                    .build()
            )
        assertThat(connectFetchPendingDataResponse.boards().getOrNull())
            .containsExactly(
                ConnectFetchPendingDataResponse.Board.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(connectFetchPendingDataResponse.locations().getOrNull())
            .containsExactly(
                ConnectFetchPendingDataResponse.Location.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(connectFetchPendingDataResponse.organizations().getOrNull())
            .containsExactly(
                ConnectFetchPendingDataResponse.Organization.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(connectFetchPendingDataResponse.pages().getOrNull())
            .containsExactly(
                ConnectFetchPendingDataResponse.Page.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(connectFetchPendingDataResponse.profiles().getOrNull())
            .containsExactly(
                ConnectFetchPendingDataResponse.Profile.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val connectFetchPendingDataResponse =
            ConnectFetchPendingDataResponse.builder()
                .platform(ConnectFetchPendingDataResponse.Platform.TWITTER)
                .tempToken("temp_token")
                .userProfile(
                    ConnectFetchPendingDataResponse.UserProfile.builder()
                        .id("id")
                        .avatarUrl("avatar_url")
                        .name("name")
                        .username("username")
                        .build()
                )
                .addBoard(
                    ConnectFetchPendingDataResponse.Board.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addLocation(
                    ConnectFetchPendingDataResponse.Location.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addOrganization(
                    ConnectFetchPendingDataResponse.Organization.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addPage(
                    ConnectFetchPendingDataResponse.Page.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addProfile(
                    ConnectFetchPendingDataResponse.Profile.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedConnectFetchPendingDataResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(connectFetchPendingDataResponse),
                jacksonTypeRef<ConnectFetchPendingDataResponse>(),
            )

        assertThat(roundtrippedConnectFetchPendingDataResponse)
            .isEqualTo(connectFetchPendingDataResponse)
    }
}
