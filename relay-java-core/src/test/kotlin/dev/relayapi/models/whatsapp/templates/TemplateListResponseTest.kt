// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.whatsapp.templates

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplateListResponseTest {

    @Test
    fun create() {
        val templateListResponse =
            TemplateListResponse.builder()
                .addData(
                    TemplateListResponse.Data.builder()
                        .category(TemplateListResponse.Data.Category.MARKETING)
                        .addComponent(
                            TemplateListResponse.Data.Component.builder()
                                .type(TemplateListResponse.Data.Component.Type.HEADER)
                                .addButton(
                                    TemplateListResponse.Data.Component.Button.builder()
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
                        .status(TemplateListResponse.Data.Status.APPROVED)
                        .build()
                )
                .build()

        assertThat(templateListResponse.data())
            .containsExactly(
                TemplateListResponse.Data.builder()
                    .category(TemplateListResponse.Data.Category.MARKETING)
                    .addComponent(
                        TemplateListResponse.Data.Component.builder()
                            .type(TemplateListResponse.Data.Component.Type.HEADER)
                            .addButton(
                                TemplateListResponse.Data.Component.Button.builder()
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
                    .status(TemplateListResponse.Data.Status.APPROVED)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val templateListResponse =
            TemplateListResponse.builder()
                .addData(
                    TemplateListResponse.Data.builder()
                        .category(TemplateListResponse.Data.Category.MARKETING)
                        .addComponent(
                            TemplateListResponse.Data.Component.builder()
                                .type(TemplateListResponse.Data.Component.Type.HEADER)
                                .addButton(
                                    TemplateListResponse.Data.Component.Button.builder()
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
                        .status(TemplateListResponse.Data.Status.APPROVED)
                        .build()
                )
                .build()

        val roundtrippedTemplateListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(templateListResponse),
                jacksonTypeRef<TemplateListResponse>(),
            )

        assertThat(roundtrippedTemplateListResponse).isEqualTo(templateListResponse)
    }
}
