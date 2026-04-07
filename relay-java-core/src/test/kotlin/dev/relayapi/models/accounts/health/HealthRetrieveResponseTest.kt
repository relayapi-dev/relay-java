// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.accounts.health

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HealthRetrieveResponseTest {

    @Test
    fun create() {
        val healthRetrieveResponse =
            HealthRetrieveResponse.builder()
                .id("id")
                .avatarUrl("avatar_url")
                .displayName("display_name")
                .healthy(true)
                .platform("platform")
                .addScope("string")
                .tokenExpiresAt("token_expires_at")
                .username("username")
                .error(
                    HealthRetrieveResponse.Error.builder().code("code").message("message").build()
                )
                .sync(
                    HealthRetrieveResponse.Sync.builder()
                        .consecutiveErrors(0.0)
                        .enabled(true)
                        .lastError("last_error")
                        .lastErrorAt("last_error_at")
                        .lastSyncAt("last_sync_at")
                        .nextSyncAt("next_sync_at")
                        .rateLimitResetAt("rate_limit_reset_at")
                        .totalPostsSynced(0.0)
                        .totalSyncRuns(0.0)
                        .build()
                )
                .build()

        assertThat(healthRetrieveResponse.id()).isEqualTo("id")
        assertThat(healthRetrieveResponse.avatarUrl()).contains("avatar_url")
        assertThat(healthRetrieveResponse.displayName()).contains("display_name")
        assertThat(healthRetrieveResponse.healthy()).isEqualTo(true)
        assertThat(healthRetrieveResponse.platform()).isEqualTo("platform")
        assertThat(healthRetrieveResponse.scopes()).containsExactly("string")
        assertThat(healthRetrieveResponse.tokenExpiresAt()).contains("token_expires_at")
        assertThat(healthRetrieveResponse.username()).contains("username")
        assertThat(healthRetrieveResponse.error())
            .contains(
                HealthRetrieveResponse.Error.builder().code("code").message("message").build()
            )
        assertThat(healthRetrieveResponse.sync())
            .contains(
                HealthRetrieveResponse.Sync.builder()
                    .consecutiveErrors(0.0)
                    .enabled(true)
                    .lastError("last_error")
                    .lastErrorAt("last_error_at")
                    .lastSyncAt("last_sync_at")
                    .nextSyncAt("next_sync_at")
                    .rateLimitResetAt("rate_limit_reset_at")
                    .totalPostsSynced(0.0)
                    .totalSyncRuns(0.0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val healthRetrieveResponse =
            HealthRetrieveResponse.builder()
                .id("id")
                .avatarUrl("avatar_url")
                .displayName("display_name")
                .healthy(true)
                .platform("platform")
                .addScope("string")
                .tokenExpiresAt("token_expires_at")
                .username("username")
                .error(
                    HealthRetrieveResponse.Error.builder().code("code").message("message").build()
                )
                .sync(
                    HealthRetrieveResponse.Sync.builder()
                        .consecutiveErrors(0.0)
                        .enabled(true)
                        .lastError("last_error")
                        .lastErrorAt("last_error_at")
                        .lastSyncAt("last_sync_at")
                        .nextSyncAt("next_sync_at")
                        .rateLimitResetAt("rate_limit_reset_at")
                        .totalPostsSynced(0.0)
                        .totalSyncRuns(0.0)
                        .build()
                )
                .build()

        val roundtrippedHealthRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(healthRetrieveResponse),
                jacksonTypeRef<HealthRetrieveResponse>(),
            )

        assertThat(roundtrippedHealthRetrieveResponse).isEqualTo(healthRetrieveResponse)
    }
}
