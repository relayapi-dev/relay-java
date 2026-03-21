// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.whatsapp.templates

import dev.relayapi.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplateRetrieveParamsTest {

    @Test
    fun create() {
        TemplateRetrieveParams.builder()
            .templateName("template_name")
            .accountId("account_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TemplateRetrieveParams.builder()
                .templateName("template_name")
                .accountId("account_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("template_name")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            TemplateRetrieveParams.builder()
                .templateName("template_name")
                .accountId("account_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("account_id", "account_id").build())
    }
}
