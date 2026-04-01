// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async

import dev.relayapi.client.okhttp.RelayOkHttpClientAsync
import dev.relayapi.models.webhooks.WebhookCreateParams
import dev.relayapi.models.webhooks.WebhookListLogsParams
import dev.relayapi.models.webhooks.WebhookListParams
import dev.relayapi.models.webhooks.WebhookSendTestParams
import dev.relayapi.models.webhooks.WebhookUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WebhookServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val webhookServiceAsync = client.webhooks()

        val webhookFuture =
            webhookServiceAsync.create(
                WebhookCreateParams.builder()
                    .addEvent(WebhookCreateParams.Event.POST_PUBLISHED)
                    .url("https://example.com")
                    .workspaceId("workspace_id")
                    .build()
            )

        val webhook = webhookFuture.get()
        webhook.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val webhookServiceAsync = client.webhooks()

        val webhookFuture =
            webhookServiceAsync.update(
                WebhookUpdateParams.builder()
                    .id("id")
                    .enabled(true)
                    .addEvent(WebhookUpdateParams.Event.POST_PUBLISHED)
                    .url("https://example.com")
                    .build()
            )

        val webhook = webhookFuture.get()
        webhook.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val webhookServiceAsync = client.webhooks()

        val webhooksFuture =
            webhookServiceAsync.list(
                WebhookListParams.builder()
                    .cursor("cursor")
                    .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .limit(1L)
                    .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .workspaceId("workspace_id")
                    .build()
            )

        val webhooks = webhooksFuture.get()
        webhooks.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val webhookServiceAsync = client.webhooks()

        val future = webhookServiceAsync.delete("id")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listLogs() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val webhookServiceAsync = client.webhooks()

        val responseFuture =
            webhookServiceAsync.listLogs(
                WebhookListLogsParams.builder()
                    .cursor("cursor")
                    .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .limit(1L)
                    .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun sendTest() {
        val client = RelayOkHttpClientAsync.builder().apiKey("My API Key").build()
        val webhookServiceAsync = client.webhooks()

        val responseFuture =
            webhookServiceAsync.sendTest(
                WebhookSendTestParams.builder().webhookId("webhook_id").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
