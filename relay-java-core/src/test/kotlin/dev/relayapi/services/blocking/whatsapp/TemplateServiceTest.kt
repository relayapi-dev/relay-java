// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.whatsapp

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.models.whatsapp.templates.TemplateCreateParams
import dev.relayapi.models.whatsapp.templates.TemplateDeleteParams
import dev.relayapi.models.whatsapp.templates.TemplateListParams
import dev.relayapi.models.whatsapp.templates.TemplateRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TemplateServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val templateService = client.whatsapp().templates()

        val template =
            templateService.create(
                TemplateCreateParams.builder()
                    .accountId("account_id")
                    .category(TemplateCreateParams.Category.MARKETING)
                    .addComponent(
                        TemplateCreateParams.Component.builder()
                            .type(TemplateCreateParams.Component.Type.HEADER)
                            .addButton(
                                TemplateCreateParams.Component.Button.builder()
                                    .text("text")
                                    .type("type")
                                    .phoneNumber("phone_number")
                                    .url("url")
                                    .build()
                            )
                            .format("format")
                            .text("text")
                            .build()
                    )
                    .language("language")
                    .name("name")
                    .build()
            )

        template.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val templateService = client.whatsapp().templates()

        val template =
            templateService.retrieve(
                TemplateRetrieveParams.builder()
                    .templateName("template_name")
                    .accountId("account_id")
                    .build()
            )

        template.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val templateService = client.whatsapp().templates()

        val templates =
            templateService.list(TemplateListParams.builder().accountId("account_id").build())

        templates.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val templateService = client.whatsapp().templates()

        templateService.delete(
            TemplateDeleteParams.builder()
                .templateName("template_name")
                .accountId("account_id")
                .build()
        )
    }
}
