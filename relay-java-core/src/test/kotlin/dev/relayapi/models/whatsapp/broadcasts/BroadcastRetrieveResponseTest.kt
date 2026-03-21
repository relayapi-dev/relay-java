// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.whatsapp.broadcasts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BroadcastRetrieveResponseTest {

    @Test
    fun create() {
        val broadcastRetrieveResponse =
            BroadcastRetrieveResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .recipientCount(0.0)
                .status(BroadcastRetrieveResponse.Status.DRAFT)
                .template("template")
                .failed(0.0)
                .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .sent(0.0)
                .build()

        assertThat(broadcastRetrieveResponse.id()).isEqualTo("id")
        assertThat(broadcastRetrieveResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(broadcastRetrieveResponse.name()).isEqualTo("name")
        assertThat(broadcastRetrieveResponse.recipientCount()).isEqualTo(0.0)
        assertThat(broadcastRetrieveResponse.status())
            .isEqualTo(BroadcastRetrieveResponse.Status.DRAFT)
        assertThat(broadcastRetrieveResponse.template()).isEqualTo("template")
        assertThat(broadcastRetrieveResponse.failed()).contains(0.0)
        assertThat(broadcastRetrieveResponse.scheduledAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(broadcastRetrieveResponse.sent()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val broadcastRetrieveResponse =
            BroadcastRetrieveResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .recipientCount(0.0)
                .status(BroadcastRetrieveResponse.Status.DRAFT)
                .template("template")
                .failed(0.0)
                .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .sent(0.0)
                .build()

        val roundtrippedBroadcastRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(broadcastRetrieveResponse),
                jacksonTypeRef<BroadcastRetrieveResponse>(),
            )

        assertThat(roundtrippedBroadcastRetrieveResponse).isEqualTo(broadcastRetrieveResponse)
    }
}
