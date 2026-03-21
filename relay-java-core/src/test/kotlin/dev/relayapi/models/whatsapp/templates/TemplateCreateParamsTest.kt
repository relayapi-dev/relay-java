// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.whatsapp.templates

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplateCreateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.category()).isEqualTo(TemplateCreateParams.Category.MARKETING)
        assertThat(body.components())
            .containsExactly(
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
        assertThat(body.language()).isEqualTo("language")
        assertThat(body.name()).isEqualTo("name")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TemplateCreateParams.builder()
                .accountId("account_id")
                .category(TemplateCreateParams.Category.MARKETING)
                .addComponent(
                    TemplateCreateParams.Component.builder()
                        .type(TemplateCreateParams.Component.Type.HEADER)
                        .build()
                )
                .language("language")
                .name("name")
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.category()).isEqualTo(TemplateCreateParams.Category.MARKETING)
        assertThat(body.components())
            .containsExactly(
                TemplateCreateParams.Component.builder()
                    .type(TemplateCreateParams.Component.Type.HEADER)
                    .build()
            )
        assertThat(body.language()).isEqualTo("language")
        assertThat(body.name()).isEqualTo("name")
    }
}
