// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.client

import dev.relayapi.core.ClientOptions
import dev.relayapi.services.blocking.AccountGroupService
import dev.relayapi.services.blocking.AccountService
import dev.relayapi.services.blocking.AnalyticsService
import dev.relayapi.services.blocking.ApiKeyService
import dev.relayapi.services.blocking.ConnectService
import dev.relayapi.services.blocking.ConnectionService
import dev.relayapi.services.blocking.InboxService
import dev.relayapi.services.blocking.MediaService
import dev.relayapi.services.blocking.PostService
import dev.relayapi.services.blocking.QueueService
import dev.relayapi.services.blocking.RedditService
import dev.relayapi.services.blocking.ToolService
import dev.relayapi.services.blocking.TwitterService
import dev.relayapi.services.blocking.UsageService
import dev.relayapi.services.blocking.WebhookService
import dev.relayapi.services.blocking.WhatsappService
import java.util.function.Consumer

/**
 * A client for interacting with the Relay REST API synchronously. You can also switch to
 * asynchronous execution via the [async] method.
 *
 * This client performs best when you create a single instance and reuse it for all interactions
 * with the REST API. This is because each client holds its own connection pool and thread pools.
 * Reusing connections and threads reduces latency and saves memory. The client also handles rate
 * limiting per client. This means that creating and using multiple instances at the same time will
 * not respect rate limits.
 *
 * The threads and connections that are held will be released automatically if they remain idle. But
 * if you are writing an application that needs to aggressively release unused resources, then you
 * may call [close].
 */
interface RelayClient {

    /**
     * Returns a version of this client that uses asynchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun async(): RelayClientAsync

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RelayClient

    fun posts(): PostService

    fun accounts(): AccountService

    fun media(): MediaService

    fun webhooks(): WebhookService

    fun apiKeys(): ApiKeyService

    fun usage(): UsageService

    fun accountGroups(): AccountGroupService

    fun connect(): ConnectService

    fun connections(): ConnectionService

    fun analytics(): AnalyticsService

    fun tools(): ToolService

    fun queue(): QueueService

    fun twitter(): TwitterService

    fun inbox(): InboxService

    fun reddit(): RedditService

    fun whatsapp(): WhatsappService

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()

    /** A view of [RelayClient] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RelayClient.WithRawResponse

        fun posts(): PostService.WithRawResponse

        fun accounts(): AccountService.WithRawResponse

        fun media(): MediaService.WithRawResponse

        fun webhooks(): WebhookService.WithRawResponse

        fun apiKeys(): ApiKeyService.WithRawResponse

        fun usage(): UsageService.WithRawResponse

        fun accountGroups(): AccountGroupService.WithRawResponse

        fun connect(): ConnectService.WithRawResponse

        fun connections(): ConnectionService.WithRawResponse

        fun analytics(): AnalyticsService.WithRawResponse

        fun tools(): ToolService.WithRawResponse

        fun queue(): QueueService.WithRawResponse

        fun twitter(): TwitterService.WithRawResponse

        fun inbox(): InboxService.WithRawResponse

        fun reddit(): RedditService.WithRawResponse

        fun whatsapp(): WhatsappService.WithRawResponse
    }
}
