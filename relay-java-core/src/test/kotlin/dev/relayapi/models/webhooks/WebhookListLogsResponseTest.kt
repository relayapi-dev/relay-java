// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.relayapi.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookListLogsResponseTest {

    @Test
    fun create() {
        val webhookListLogsResponse =
            WebhookListLogsResponse.builder()
                .addData(
                    WebhookListLogsResponse.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .error("error")
                        .event("event")
                        .responseTimeMs(0.0)
                        .statusCode(0.0)
                        .success(true)
                        .webhookId("webhook_id")
                        .build()
                )
                .hasMore(true)
                .nextCursor("next_cursor")
                .build()

        assertThat(webhookListLogsResponse.data())
            .containsExactly(
                WebhookListLogsResponse.Data.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .error("error")
                    .event("event")
                    .responseTimeMs(0.0)
                    .statusCode(0.0)
                    .success(true)
                    .webhookId("webhook_id")
                    .build()
            )
        assertThat(webhookListLogsResponse.hasMore()).isEqualTo(true)
        assertThat(webhookListLogsResponse.nextCursor()).contains("next_cursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookListLogsResponse =
            WebhookListLogsResponse.builder()
                .addData(
                    WebhookListLogsResponse.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .error("error")
                        .event("event")
                        .responseTimeMs(0.0)
                        .statusCode(0.0)
                        .success(true)
                        .webhookId("webhook_id")
                        .build()
                )
                .hasMore(true)
                .nextCursor("next_cursor")
                .build()

        val roundtrippedWebhookListLogsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookListLogsResponse),
                jacksonTypeRef<WebhookListLogsResponse>(),
            )

        assertThat(roundtrippedWebhookListLogsResponse).isEqualTo(webhookListLogsResponse)
    }
}
