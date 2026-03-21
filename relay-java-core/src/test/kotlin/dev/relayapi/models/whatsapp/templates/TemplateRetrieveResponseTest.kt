// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.whatsapp.templates

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplateRetrieveResponseTest {

    @Test
    fun create() {
        val templateRetrieveResponse =
            TemplateRetrieveResponse.builder()
                .category(TemplateRetrieveResponse.Category.MARKETING)
                .addComponent(
                    TemplateRetrieveResponse.Component.builder()
                        .type(TemplateRetrieveResponse.Component.Type.HEADER)
                        .addButton(
                            TemplateRetrieveResponse.Component.Button.builder()
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
                .status(TemplateRetrieveResponse.Status.APPROVED)
                .build()

        assertThat(templateRetrieveResponse.category())
            .isEqualTo(TemplateRetrieveResponse.Category.MARKETING)
        assertThat(templateRetrieveResponse.components())
            .containsExactly(
                TemplateRetrieveResponse.Component.builder()
                    .type(TemplateRetrieveResponse.Component.Type.HEADER)
                    .addButton(
                        TemplateRetrieveResponse.Component.Button.builder()
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
        assertThat(templateRetrieveResponse.language()).isEqualTo("language")
        assertThat(templateRetrieveResponse.name()).isEqualTo("name")
        assertThat(templateRetrieveResponse.status())
            .isEqualTo(TemplateRetrieveResponse.Status.APPROVED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val templateRetrieveResponse =
            TemplateRetrieveResponse.builder()
                .category(TemplateRetrieveResponse.Category.MARKETING)
                .addComponent(
                    TemplateRetrieveResponse.Component.builder()
                        .type(TemplateRetrieveResponse.Component.Type.HEADER)
                        .addButton(
                            TemplateRetrieveResponse.Component.Button.builder()
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
                .status(TemplateRetrieveResponse.Status.APPROVED)
                .build()

        val roundtrippedTemplateRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(templateRetrieveResponse),
                jacksonTypeRef<TemplateRetrieveResponse>(),
            )

        assertThat(roundtrippedTemplateRetrieveResponse).isEqualTo(templateRetrieveResponse)
    }
}
