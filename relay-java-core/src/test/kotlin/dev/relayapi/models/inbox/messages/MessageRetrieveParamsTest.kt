// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.inbox.messages

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageRetrieveParamsTest {

    @Test
    fun create() {
        MessageRetrieveParams.builder().conversationId("conversation_id").build()
    }

    @Test
    fun pathParams() {
        val params = MessageRetrieveParams.builder().conversationId("conversation_id").build()

        assertThat(params._pathParam(0)).isEqualTo("conversation_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
