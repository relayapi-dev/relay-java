// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking

import dev.relayapi.client.okhttp.RelayOkHttpClient
import dev.relayapi.models.webhooks.WebhookCreateParams
import dev.relayapi.models.webhooks.WebhookListLogsParams
import dev.relayapi.models.webhooks.WebhookListParams
import dev.relayapi.models.webhooks.WebhookSendTestParams
import dev.relayapi.models.webhooks.WebhookUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WebhookServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val webhookService = client.webhooks()

        val webhook =
            webhookService.create(
                WebhookCreateParams.builder()
                    .addEvent(WebhookCreateParams.Event.POST_PUBLISHED)
                    .url("https://example.com")
                    .workspaceId("workspace_id")
                    .build()
            )

        webhook.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val webhookService = client.webhooks()

        val webhook =
            webhookService.update(
                WebhookUpdateParams.builder()
                    .id("id")
                    .enabled(true)
                    .addEvent(WebhookUpdateParams.Event.POST_PUBLISHED)
                    .url("https://example.com")
                    .build()
            )

        webhook.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val webhookService = client.webhooks()

        val webhooks =
            webhookService.list(
                WebhookListParams.builder()
                    .cursor("cursor")
                    .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .limit(1L)
                    .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .workspaceId("workspace_id")
                    .build()
            )

        webhooks.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val webhookService = client.webhooks()

        webhookService.delete("id")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listLogs() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val webhookService = client.webhooks()

        val response =
            webhookService.listLogs(
                WebhookListLogsParams.builder()
                    .cursor("cursor")
                    .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .limit(1L)
                    .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun sendTest() {
        val client = RelayOkHttpClient.builder().apiKey("My API Key").build()
        val webhookService = client.webhooks()

        val response =
            webhookService.sendTest(WebhookSendTestParams.builder().webhookId("webhook_id").build())

        response.validate()
    }
}
