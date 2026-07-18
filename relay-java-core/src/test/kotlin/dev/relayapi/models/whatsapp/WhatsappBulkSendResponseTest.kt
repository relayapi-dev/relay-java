// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.whatsapp

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WhatsappBulkSendResponseTest {

    @Test
    fun create() {
        val whatsappBulkSendResponse =
            WhatsappBulkSendResponse.builder()
                .id("id")
                .accountId("account_id")
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .failedCount(0L)
                .messageText("message_text")
                .name("name")
                .platform("platform")
                .recipientCount(0L)
                .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .sentCount(0L)
                .status(WhatsappBulkSendResponse.Status.DRAFT)
                .templateLanguage("template_language")
                .templateName("template_name")
                .build()

        assertThat(whatsappBulkSendResponse.id()).isEqualTo("id")
        assertThat(whatsappBulkSendResponse.accountId()).isEqualTo("account_id")
        assertThat(whatsappBulkSendResponse.completedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(whatsappBulkSendResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(whatsappBulkSendResponse.description()).contains("description")
        assertThat(whatsappBulkSendResponse.failedCount()).isEqualTo(0L)
        assertThat(whatsappBulkSendResponse.messageText()).contains("message_text")
        assertThat(whatsappBulkSendResponse.name()).contains("name")
        assertThat(whatsappBulkSendResponse.platform()).isEqualTo("platform")
        assertThat(whatsappBulkSendResponse.recipientCount()).isEqualTo(0L)
        assertThat(whatsappBulkSendResponse.scheduledAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(whatsappBulkSendResponse.sentCount()).isEqualTo(0L)
        assertThat(whatsappBulkSendResponse.status())
            .isEqualTo(WhatsappBulkSendResponse.Status.DRAFT)
        assertThat(whatsappBulkSendResponse.templateLanguage()).contains("template_language")
        assertThat(whatsappBulkSendResponse.templateName()).contains("template_name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val whatsappBulkSendResponse =
            WhatsappBulkSendResponse.builder()
                .id("id")
                .accountId("account_id")
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .failedCount(0L)
                .messageText("message_text")
                .name("name")
                .platform("platform")
                .recipientCount(0L)
                .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .sentCount(0L)
                .status(WhatsappBulkSendResponse.Status.DRAFT)
                .templateLanguage("template_language")
                .templateName("template_name")
                .build()

        val roundtrippedWhatsappBulkSendResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(whatsappBulkSendResponse),
                jacksonTypeRef<WhatsappBulkSendResponse>(),
            )

        assertThat(roundtrippedWhatsappBulkSendResponse).isEqualTo(whatsappBulkSendResponse)
    }
}
