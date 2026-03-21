// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.whatsapp

import dev.relayapi.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WhatsappBulkSendParamsTest {

    @Test
    fun create() {
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
                                WhatsappBulkSendParams.Template.Component.Parameter.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
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
                                    WhatsappBulkSendParams.Template.Component.Parameter.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.recipients())
            .containsExactly(
                WhatsappBulkSendParams.Recipient.builder()
                    .phone("phone")
                    .variables(
                        WhatsappBulkSendParams.Recipient.Variables.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
        assertThat(body.template())
            .isEqualTo(
                WhatsappBulkSendParams.Template.builder()
                    .language("language")
                    .name("name")
                    .addComponent(
                        WhatsappBulkSendParams.Template.Component.builder()
                            .type(WhatsappBulkSendParams.Template.Component.Type.HEADER)
                            .addParameter(
                                WhatsappBulkSendParams.Template.Component.Parameter.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            WhatsappBulkSendParams.builder()
                .accountId("account_id")
                .addRecipient(WhatsappBulkSendParams.Recipient.builder().phone("phone").build())
                .template(
                    WhatsappBulkSendParams.Template.builder()
                        .language("language")
                        .name("name")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.recipients())
            .containsExactly(WhatsappBulkSendParams.Recipient.builder().phone("phone").build())
        assertThat(body.template())
            .isEqualTo(
                WhatsappBulkSendParams.Template.builder().language("language").name("name").build()
            )
    }
}
