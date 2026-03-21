// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.whatsapp

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.models.whatsapp.templates.TemplateCreateParams
import dev.relayapi.models.whatsapp.templates.TemplateDeleteParams
import dev.relayapi.models.whatsapp.templates.TemplateListParams
import dev.relayapi.models.whatsapp.templates.TemplateRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TemplateServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val templateServiceAsync = client.whatsapp().templates()

        val templateFuture =
            templateServiceAsync.create(
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

        val template = templateFuture.get()
        template.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val templateServiceAsync = client.whatsapp().templates()

        val templateFuture =
            templateServiceAsync.retrieve(
                TemplateRetrieveParams.builder()
                    .templateName("template_name")
                    .accountId("account_id")
                    .build()
            )

        val template = templateFuture.get()
        template.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val templateServiceAsync = client.whatsapp().templates()

        val templatesFuture =
            templateServiceAsync.list(TemplateListParams.builder().accountId("account_id").build())

        val templates = templatesFuture.get()
        templates.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val templateServiceAsync = client.whatsapp().templates()

        val future =
            templateServiceAsync.delete(
                TemplateDeleteParams.builder()
                    .templateName("template_name")
                    .accountId("account_id")
                    .build()
            )

        val response = future.get()
    }
}
