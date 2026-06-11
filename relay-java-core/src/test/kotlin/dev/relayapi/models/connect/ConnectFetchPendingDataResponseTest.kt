// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.connect

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.JsonValue
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConnectFetchPendingDataResponseTest {

    @Test
    fun create() {
        val connectFetchPendingDataResponse =
            ConnectFetchPendingDataResponse.builder()
                .platform(ConnectFetchPendingDataResponse.Platform.TWITTER)
                .status(ConnectFetchPendingDataResponse.Status.SUCCESS)
                .account(
                    ConnectFetchPendingDataResponse.Account.builder()
                        .id("id")
                        .avatarUrl("avatar_url")
                        .connectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .displayName("display_name")
                        .metadata(
                            ConnectFetchPendingDataResponse.Account.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .platform(ConnectFetchPendingDataResponse.Account.Platform.TWITTER)
                        .platformAccountId("platform_account_id")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .username("username")
                        .workspace(
                            ConnectFetchPendingDataResponse.Account.Workspace.builder()
                                .id("id")
                                .name("name")
                                .build()
                        )
                        .build()
                )
                .error("error")
                .errorCode("error_code")
                .errorDescription("error_description")
                .errorMessage("error_message")
                .build()

        assertThat(connectFetchPendingDataResponse.platform())
            .isEqualTo(ConnectFetchPendingDataResponse.Platform.TWITTER)
        assertThat(connectFetchPendingDataResponse.status())
            .isEqualTo(ConnectFetchPendingDataResponse.Status.SUCCESS)
        assertThat(connectFetchPendingDataResponse.account())
            .contains(
                ConnectFetchPendingDataResponse.Account.builder()
                    .id("id")
                    .avatarUrl("avatar_url")
                    .connectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .displayName("display_name")
                    .metadata(
                        ConnectFetchPendingDataResponse.Account.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .platform(ConnectFetchPendingDataResponse.Account.Platform.TWITTER)
                    .platformAccountId("platform_account_id")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .username("username")
                    .workspace(
                        ConnectFetchPendingDataResponse.Account.Workspace.builder()
                            .id("id")
                            .name("name")
                            .build()
                    )
                    .build()
            )
        assertThat(connectFetchPendingDataResponse.error()).contains("error")
        assertThat(connectFetchPendingDataResponse.errorCode()).contains("error_code")
        assertThat(connectFetchPendingDataResponse.errorDescription()).contains("error_description")
        assertThat(connectFetchPendingDataResponse.errorMessage()).contains("error_message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val connectFetchPendingDataResponse =
            ConnectFetchPendingDataResponse.builder()
                .platform(ConnectFetchPendingDataResponse.Platform.TWITTER)
                .status(ConnectFetchPendingDataResponse.Status.SUCCESS)
                .account(
                    ConnectFetchPendingDataResponse.Account.builder()
                        .id("id")
                        .avatarUrl("avatar_url")
                        .connectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .displayName("display_name")
                        .metadata(
                            ConnectFetchPendingDataResponse.Account.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .platform(ConnectFetchPendingDataResponse.Account.Platform.TWITTER)
                        .platformAccountId("platform_account_id")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .username("username")
                        .workspace(
                            ConnectFetchPendingDataResponse.Account.Workspace.builder()
                                .id("id")
                                .name("name")
                                .build()
                        )
                        .build()
                )
                .error("error")
                .errorCode("error_code")
                .errorDescription("error_description")
                .errorMessage("error_message")
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
