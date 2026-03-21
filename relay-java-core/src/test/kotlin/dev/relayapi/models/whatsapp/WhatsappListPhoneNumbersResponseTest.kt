// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.whatsapp

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
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
                        .phoneNumber("phone_number")
                        .status(WhatsappListPhoneNumbersResponse.Data.Status.ACTIVE)
                        .displayName("display_name")
                        .build()
                )
                .build()

        assertThat(whatsappListPhoneNumbersResponse.data())
            .containsExactly(
                WhatsappListPhoneNumbersResponse.Data.builder()
                    .id("id")
                    .phoneNumber("phone_number")
                    .status(WhatsappListPhoneNumbersResponse.Data.Status.ACTIVE)
                    .displayName("display_name")
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
                        .phoneNumber("phone_number")
                        .status(WhatsappListPhoneNumbersResponse.Data.Status.ACTIVE)
                        .displayName("display_name")
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
