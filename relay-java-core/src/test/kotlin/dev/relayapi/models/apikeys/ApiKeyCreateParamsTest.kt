// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.apikeys

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiKeyCreateParamsTest {

    @Test
    fun create() {
        ApiKeyCreateParams.builder()
            .name("x")
            .expiresInDays(1L)
            .permission(ApiKeyCreateParams.Permission.READ_WRITE)
            .workspaceScope(ApiKeyCreateParams.WorkspaceScope.UnionMember0.ALL)
            .build()
    }

    @Test
    fun body() {
        val params =
            ApiKeyCreateParams.builder()
                .name("x")
                .expiresInDays(1L)
                .permission(ApiKeyCreateParams.Permission.READ_WRITE)
                .workspaceScope(ApiKeyCreateParams.WorkspaceScope.UnionMember0.ALL)
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("x")
        assertThat(body.expiresInDays()).contains(1L)
        assertThat(body.permission()).contains(ApiKeyCreateParams.Permission.READ_WRITE)
        assertThat(body.workspaceScope())
            .contains(
                ApiKeyCreateParams.WorkspaceScope.ofUnionMember0(
                    ApiKeyCreateParams.WorkspaceScope.UnionMember0.ALL
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ApiKeyCreateParams.builder().name("x").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("x")
    }
}
