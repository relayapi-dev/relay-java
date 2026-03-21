// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.whatsapp.broadcasts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BroadcastSendResponseTest {

    @Test
    fun create() {
        val broadcastSendResponse =
            BroadcastSendResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .recipientCount(0.0)
                .status(BroadcastSendResponse.Status.DRAFT)
                .template("template")
                .failed(0.0)
                .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .sent(0.0)
                .build()

        assertThat(broadcastSendResponse.id()).isEqualTo("id")
        assertThat(broadcastSendResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(broadcastSendResponse.name()).isEqualTo("name")
        assertThat(broadcastSendResponse.recipientCount()).isEqualTo(0.0)
        assertThat(broadcastSendResponse.status()).isEqualTo(BroadcastSendResponse.Status.DRAFT)
        assertThat(broadcastSendResponse.template()).isEqualTo("template")
        assertThat(broadcastSendResponse.failed()).contains(0.0)
        assertThat(broadcastSendResponse.scheduledAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(broadcastSendResponse.sent()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val broadcastSendResponse =
            BroadcastSendResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .recipientCount(0.0)
                .status(BroadcastSendResponse.Status.DRAFT)
                .template("template")
                .failed(0.0)
                .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .sent(0.0)
                .build()

        val roundtrippedBroadcastSendResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(broadcastSendResponse),
                jacksonTypeRef<BroadcastSendResponse>(),
            )

        assertThat(roundtrippedBroadcastSendResponse).isEqualTo(broadcastSendResponse)
    }
}
