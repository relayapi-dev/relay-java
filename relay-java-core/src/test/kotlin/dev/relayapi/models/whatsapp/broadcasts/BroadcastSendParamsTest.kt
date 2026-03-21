// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.whatsapp.broadcasts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BroadcastSendParamsTest {

    @Test
    fun create() {
        BroadcastSendParams.builder().broadcastId("broadcast_id").build()
    }

    @Test
    fun pathParams() {
        val params = BroadcastSendParams.builder().broadcastId("broadcast_id").build()

        assertThat(params._pathParam(0)).isEqualTo("broadcast_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
