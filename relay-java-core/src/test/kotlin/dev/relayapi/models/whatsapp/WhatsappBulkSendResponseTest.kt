// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.whatsapp

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WhatsappBulkSendResponseTest {

    @Test
    fun create() {
        val whatsappBulkSendResponse =
            WhatsappBulkSendResponse.builder()
                .addResult(
                    WhatsappBulkSendResponse.Result.builder()
                        .phone("phone")
                        .status(WhatsappBulkSendResponse.Result.Status.SENT)
                        .error("error")
                        .build()
                )
                .summary(WhatsappBulkSendResponse.Summary.builder().failed(0.0).sent(0.0).build())
                .build()

        assertThat(whatsappBulkSendResponse.results())
            .containsExactly(
                WhatsappBulkSendResponse.Result.builder()
                    .phone("phone")
                    .status(WhatsappBulkSendResponse.Result.Status.SENT)
                    .error("error")
                    .build()
            )
        assertThat(whatsappBulkSendResponse.summary())
            .isEqualTo(WhatsappBulkSendResponse.Summary.builder().failed(0.0).sent(0.0).build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val whatsappBulkSendResponse =
            WhatsappBulkSendResponse.builder()
                .addResult(
                    WhatsappBulkSendResponse.Result.builder()
                        .phone("phone")
                        .status(WhatsappBulkSendResponse.Result.Status.SENT)
                        .error("error")
                        .build()
                )
                .summary(WhatsappBulkSendResponse.Summary.builder().failed(0.0).sent(0.0).build())
                .build()

        val roundtrippedWhatsappBulkSendResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(whatsappBulkSendResponse),
                jacksonTypeRef<WhatsappBulkSendResponse>(),
            )

        assertThat(roundtrippedWhatsappBulkSendResponse).isEqualTo(whatsappBulkSendResponse)
    }
}
