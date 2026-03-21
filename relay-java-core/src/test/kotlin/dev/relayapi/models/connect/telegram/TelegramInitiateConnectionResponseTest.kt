// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.connect.telegram

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TelegramInitiateConnectionResponseTest {

    @Test
    fun create() {
        val telegramInitiateConnectionResponse =
            TelegramInitiateConnectionResponse.builder()
                .botUsername("bot_username")
                .code("code")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expiresIn(0L)
                .addInstruction("string")
                .build()

        assertThat(telegramInitiateConnectionResponse.botUsername()).isEqualTo("bot_username")
        assertThat(telegramInitiateConnectionResponse.code()).isEqualTo("code")
        assertThat(telegramInitiateConnectionResponse.expiresAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(telegramInitiateConnectionResponse.expiresIn()).isEqualTo(0L)
        assertThat(telegramInitiateConnectionResponse.instructions()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val telegramInitiateConnectionResponse =
            TelegramInitiateConnectionResponse.builder()
                .botUsername("bot_username")
                .code("code")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expiresIn(0L)
                .addInstruction("string")
                .build()

        val roundtrippedTelegramInitiateConnectionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(telegramInitiateConnectionResponse),
                jacksonTypeRef<TelegramInitiateConnectionResponse>(),
            )

        assertThat(roundtrippedTelegramInitiateConnectionResponse)
            .isEqualTo(telegramInitiateConnectionResponse)
    }
}
