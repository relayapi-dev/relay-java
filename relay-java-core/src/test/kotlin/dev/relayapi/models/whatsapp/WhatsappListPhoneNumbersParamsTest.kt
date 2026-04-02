// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.whatsapp

import dev.relayapi.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WhatsappListPhoneNumbersParamsTest {

    @Test
    fun create() {
        WhatsappListPhoneNumbersParams.builder()
            .status(WhatsappListPhoneNumbersParams.Status.PURCHASING)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            WhatsappListPhoneNumbersParams.builder()
                .status(WhatsappListPhoneNumbersParams.Status.PURCHASING)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("status", "purchasing").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = WhatsappListPhoneNumbersParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
