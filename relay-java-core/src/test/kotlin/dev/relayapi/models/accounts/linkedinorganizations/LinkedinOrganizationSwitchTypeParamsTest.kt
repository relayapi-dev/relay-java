// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.accounts.linkedinorganizations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LinkedinOrganizationSwitchTypeParamsTest {

    @Test
    fun create() {
        LinkedinOrganizationSwitchTypeParams.builder()
            .id("id")
            .accountType(LinkedinOrganizationSwitchTypeParams.AccountType.PERSONAL)
            .organizationId("organization_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            LinkedinOrganizationSwitchTypeParams.builder()
                .id("id")
                .accountType(LinkedinOrganizationSwitchTypeParams.AccountType.PERSONAL)
                .organizationId("organization_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            LinkedinOrganizationSwitchTypeParams.builder()
                .id("id")
                .accountType(LinkedinOrganizationSwitchTypeParams.AccountType.PERSONAL)
                .organizationId("organization_id")
                .build()

        val body = params._body()

        assertThat(body.accountType())
            .isEqualTo(LinkedinOrganizationSwitchTypeParams.AccountType.PERSONAL)
        assertThat(body.organizationId()).isEqualTo("organization_id")
    }
}
