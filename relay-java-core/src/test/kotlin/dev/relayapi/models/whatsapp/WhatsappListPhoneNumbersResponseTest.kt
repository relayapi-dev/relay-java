// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.whatsapp

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WhatsappListPhoneNumbersResponseTest {

    @Test
    fun create() {
        val whatsappListPhoneNumbersResponse =
            WhatsappListPhoneNumbersResponse.builder()
                .addData(
                    WhatsappListPhoneNumbersResponse.Data.builder()
                        .id("id")
                        .country("country")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .monthlyCostCents(0.0)
                        .phoneNumber("phone_number")
                        .provider("provider")
                        .status(WhatsappListPhoneNumbersResponse.Data.Status.PURCHASING)
                        .socialAccountId("social_account_id")
                        .waPhoneNumberId("wa_phone_number_id")
                        .build()
                )
                .build()

        assertThat(whatsappListPhoneNumbersResponse.data())
            .containsExactly(
                WhatsappListPhoneNumbersResponse.Data.builder()
                    .id("id")
                    .country("country")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .monthlyCostCents(0.0)
                    .phoneNumber("phone_number")
                    .provider("provider")
                    .status(WhatsappListPhoneNumbersResponse.Data.Status.PURCHASING)
                    .socialAccountId("social_account_id")
                    .waPhoneNumberId("wa_phone_number_id")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val whatsappListPhoneNumbersResponse =
            WhatsappListPhoneNumbersResponse.builder()
                .addData(
                    WhatsappListPhoneNumbersResponse.Data.builder()
                        .id("id")
                        .country("country")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .monthlyCostCents(0.0)
                        .phoneNumber("phone_number")
                        .provider("provider")
                        .status(WhatsappListPhoneNumbersResponse.Data.Status.PURCHASING)
                        .socialAccountId("social_account_id")
                        .waPhoneNumberId("wa_phone_number_id")
                        .build()
                )
                .build()

        val roundtrippedWhatsappListPhoneNumbersResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(whatsappListPhoneNumbersResponse),
                jacksonTypeRef<WhatsappListPhoneNumbersResponse>(),
            )

        assertThat(roundtrippedWhatsappListPhoneNumbersResponse)
            .isEqualTo(whatsappListPhoneNumbersResponse)
    }
}
