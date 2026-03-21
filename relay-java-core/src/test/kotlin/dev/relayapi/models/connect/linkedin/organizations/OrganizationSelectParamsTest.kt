// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.connect.linkedin.organizations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrganizationSelectParamsTest {

    @Test
    fun create() {
        OrganizationSelectParams.builder()
            .accountType(OrganizationSelectParams.AccountType.PERSONAL)
            .connectToken("connect_token")
            .organizationUrn("organization_urn")
            .build()
    }

    @Test
    fun body() {
        val params =
            OrganizationSelectParams.builder()
                .accountType(OrganizationSelectParams.AccountType.PERSONAL)
                .connectToken("connect_token")
                .organizationUrn("organization_urn")
                .build()

        val body = params._body()

        assertThat(body.accountType()).isEqualTo(OrganizationSelectParams.AccountType.PERSONAL)
        assertThat(body.connectToken()).isEqualTo("connect_token")
        assertThat(body.organizationUrn()).contains("organization_urn")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            OrganizationSelectParams.builder()
                .accountType(OrganizationSelectParams.AccountType.PERSONAL)
                .connectToken("connect_token")
                .build()

        val body = params._body()

        assertThat(body.accountType()).isEqualTo(OrganizationSelectParams.AccountType.PERSONAL)
        assertThat(body.connectToken()).isEqualTo("connect_token")
    }
}
