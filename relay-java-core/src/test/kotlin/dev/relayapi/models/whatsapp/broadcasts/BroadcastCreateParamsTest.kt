// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.whatsapp.broadcasts

import dev.relayapi.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BroadcastCreateParamsTest {

    @Test
    fun create() {
        BroadcastCreateParams.builder()
            .accountId("account_id")
            .name("name")
            .addRecipient(
                BroadcastCreateParams.Recipient.builder()
                    .phone("phone")
                    .variables(
                        BroadcastCreateParams.Recipient.Variables.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
            .template(
                BroadcastCreateParams.Template.builder()
                    .language("language")
                    .name("name")
                    .addComponent(
                        BroadcastCreateParams.Template.Component.builder()
                            .type(BroadcastCreateParams.Template.Component.Type.HEADER)
                            .addParameter(
                                BroadcastCreateParams.Template.Component.Parameter.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
            .scheduledAt("scheduled_at")
            .build()
    }

    @Test
    fun body() {
        val params =
            BroadcastCreateParams.builder()
                .accountId("account_id")
                .name("name")
                .addRecipient(
                    BroadcastCreateParams.Recipient.builder()
                        .phone("phone")
                        .variables(
                            BroadcastCreateParams.Recipient.Variables.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .template(
                    BroadcastCreateParams.Template.builder()
                        .language("language")
                        .name("name")
                        .addComponent(
                            BroadcastCreateParams.Template.Component.builder()
                                .type(BroadcastCreateParams.Template.Component.Type.HEADER)
                                .addParameter(
                                    BroadcastCreateParams.Template.Component.Parameter.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .scheduledAt("scheduled_at")
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.recipients())
            .containsExactly(
                BroadcastCreateParams.Recipient.builder()
                    .phone("phone")
                    .variables(
                        BroadcastCreateParams.Recipient.Variables.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
        assertThat(body.template())
            .isEqualTo(
                BroadcastCreateParams.Template.builder()
                    .language("language")
                    .name("name")
                    .addComponent(
                        BroadcastCreateParams.Template.Component.builder()
                            .type(BroadcastCreateParams.Template.Component.Type.HEADER)
                            .addParameter(
                                BroadcastCreateParams.Template.Component.Parameter.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(body.scheduledAt()).contains("scheduled_at")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BroadcastCreateParams.builder()
                .accountId("account_id")
                .name("name")
                .addRecipient(BroadcastCreateParams.Recipient.builder().phone("phone").build())
                .template(
                    BroadcastCreateParams.Template.builder()
                        .language("language")
                        .name("name")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.recipients())
            .containsExactly(BroadcastCreateParams.Recipient.builder().phone("phone").build())
        assertThat(body.template())
            .isEqualTo(
                BroadcastCreateParams.Template.builder().language("language").name("name").build()
            )
    }
}
