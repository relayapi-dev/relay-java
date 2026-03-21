// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.connect.telegram

import dev.relayapi.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TelegramPollConnectionStatusParamsTest {

    @Test
    fun create() {
        TelegramPollConnectionStatusParams.builder().code("code").build()
    }

    @Test
    fun queryParams() {
        val params = TelegramPollConnectionStatusParams.builder().code("code").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("code", "code").build())
    }
}
