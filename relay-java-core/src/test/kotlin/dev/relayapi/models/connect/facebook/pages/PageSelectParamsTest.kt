// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.connect.facebook.pages

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PageSelectParamsTest {

    @Test
    fun create() {
        PageSelectParams.builder().connectToken("connect_token").pageId("page_id").build()
    }

    @Test
    fun body() {
        val params =
            PageSelectParams.builder().connectToken("connect_token").pageId("page_id").build()

        val body = params._body()

        assertThat(body.connectToken()).isEqualTo("connect_token")
        assertThat(body.pageId()).isEqualTo("page_id")
    }
}
