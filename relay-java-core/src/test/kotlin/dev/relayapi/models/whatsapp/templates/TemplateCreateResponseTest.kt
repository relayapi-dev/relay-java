// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.whatsapp.templates

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplateCreateResponseTest {

    @Test
    fun create() {
        val templateCreateResponse =
            TemplateCreateResponse.builder()
                .category(TemplateCreateResponse.Category.MARKETING)
                .addComponent(
                    TemplateCreateResponse.Component.builder()
                        .type(TemplateCreateResponse.Component.Type.HEADER)
                        .addButton(
                            TemplateCreateResponse.Component.Button.builder()
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
                .status(TemplateCreateResponse.Status.APPROVED)
                .build()

        assertThat(templateCreateResponse.category())
            .isEqualTo(TemplateCreateResponse.Category.MARKETING)
        assertThat(templateCreateResponse.components())
            .containsExactly(
                TemplateCreateResponse.Component.builder()
                    .type(TemplateCreateResponse.Component.Type.HEADER)
                    .addButton(
                        TemplateCreateResponse.Component.Button.builder()
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
        assertThat(templateCreateResponse.language()).isEqualTo("language")
        assertThat(templateCreateResponse.name()).isEqualTo("name")
        assertThat(templateCreateResponse.status())
            .isEqualTo(TemplateCreateResponse.Status.APPROVED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val templateCreateResponse =
            TemplateCreateResponse.builder()
                .category(TemplateCreateResponse.Category.MARKETING)
                .addComponent(
                    TemplateCreateResponse.Component.builder()
                        .type(TemplateCreateResponse.Component.Type.HEADER)
                        .addButton(
                            TemplateCreateResponse.Component.Button.builder()
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
                .status(TemplateCreateResponse.Status.APPROVED)
                .build()

        val roundtrippedTemplateCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(templateCreateResponse),
                jacksonTypeRef<TemplateCreateResponse>(),
            )

        assertThat(roundtrippedTemplateCreateResponse).isEqualTo(templateCreateResponse)
    }
}
