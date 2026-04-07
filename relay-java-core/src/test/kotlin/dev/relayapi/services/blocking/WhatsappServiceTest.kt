// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.core.JsonValue
import dev.relayapi.models.whatsapp.WhatsappBulkSendParams
import dev.relayapi.models.whatsapp.WhatsappListPhoneNumbersParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WhatsappServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun bulkSend() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val whatsappService = client.whatsapp()

        val response =
            whatsappService.bulkSend(
                WhatsappBulkSendParams.builder()
                    .accountId("account_id")
                    .addRecipient(
                        WhatsappBulkSendParams.Recipient.builder()
                            .phone("phone")
                            .variables(
                                WhatsappBulkSendParams.Recipient.Variables.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .template(
                        WhatsappBulkSendParams.Template.builder()
                            .language("language")
                            .name("name")
                            .addComponent(
                                WhatsappBulkSendParams.Template.Component.builder()
                                    .type(WhatsappBulkSendParams.Template.Component.Type.HEADER)
                                    .addParameter(
                                        WhatsappBulkSendParams.Template.Component.Parameter
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listPhoneNumbers() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val whatsappService = client.whatsapp()

        val response =
            whatsappService.listPhoneNumbers(
                WhatsappListPhoneNumbersParams.builder()
                    .status(WhatsappListPhoneNumbersParams.Status.PURCHASING)
                    .build()
            )

        response.validate()
    }
}
