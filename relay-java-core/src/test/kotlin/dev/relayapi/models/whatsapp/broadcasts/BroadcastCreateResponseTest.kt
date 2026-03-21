// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.whatsapp.broadcasts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BroadcastCreateResponseTest {

    @Test
    fun create() {
        val broadcastCreateResponse =
            BroadcastCreateResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .recipientCount(0.0)
                .status(BroadcastCreateResponse.Status.DRAFT)
                .template("template")
                .failed(0.0)
                .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .sent(0.0)
                .build()

        assertThat(broadcastCreateResponse.id()).isEqualTo("id")
        assertThat(broadcastCreateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(broadcastCreateResponse.name()).isEqualTo("name")
        assertThat(broadcastCreateResponse.recipientCount()).isEqualTo(0.0)
        assertThat(broadcastCreateResponse.status()).isEqualTo(BroadcastCreateResponse.Status.DRAFT)
        assertThat(broadcastCreateResponse.template()).isEqualTo("template")
        assertThat(broadcastCreateResponse.failed()).contains(0.0)
        assertThat(broadcastCreateResponse.scheduledAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(broadcastCreateResponse.sent()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val broadcastCreateResponse =
            BroadcastCreateResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .recipientCount(0.0)
                .status(BroadcastCreateResponse.Status.DRAFT)
                .template("template")
                .failed(0.0)
                .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .sent(0.0)
                .build()

        val roundtrippedBroadcastCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(broadcastCreateResponse),
                jacksonTypeRef<BroadcastCreateResponse>(),
            )

        assertThat(roundtrippedBroadcastCreateResponse).isEqualTo(broadcastCreateResponse)
    }
}
