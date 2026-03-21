// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.client

import dev.relayapi.core.ClientOptions
import dev.relayapi.services.async.AccountGroupServiceAsync
import dev.relayapi.services.async.AccountServiceAsync
import dev.relayapi.services.async.AnalyticsServiceAsync
import dev.relayapi.services.async.ApiKeyServiceAsync
import dev.relayapi.services.async.ConnectServiceAsync
import dev.relayapi.services.async.ConnectionServiceAsync
import dev.relayapi.services.async.InboxServiceAsync
import dev.relayapi.services.async.MediaServiceAsync
import dev.relayapi.services.async.PostServiceAsync
import dev.relayapi.services.async.QueueServiceAsync
import dev.relayapi.services.async.RedditServiceAsync
import dev.relayapi.services.async.ToolServiceAsync
import dev.relayapi.services.async.TwitterServiceAsync
import dev.relayapi.services.async.UsageServiceAsync
import dev.relayapi.services.async.WebhookServiceAsync
import dev.relayapi.services.async.WhatsappServiceAsync
import java.util.function.Consumer

/**
 * A client for interacting with the Relay REST API asynchronously. You can also switch to
 * synchronous execution via the [sync] method.
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
interface RelayClientAsync {

    /**
     * Returns a version of this client that uses synchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun sync(): RelayClient

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RelayClientAsync

    fun posts(): PostServiceAsync

    fun accounts(): AccountServiceAsync

    fun media(): MediaServiceAsync

    fun webhooks(): WebhookServiceAsync

    fun apiKeys(): ApiKeyServiceAsync

    fun usage(): UsageServiceAsync

    fun accountGroups(): AccountGroupServiceAsync

    fun connect(): ConnectServiceAsync

    fun connections(): ConnectionServiceAsync

    fun analytics(): AnalyticsServiceAsync

    fun tools(): ToolServiceAsync

    fun queue(): QueueServiceAsync

    fun twitter(): TwitterServiceAsync

    fun inbox(): InboxServiceAsync

    fun reddit(): RedditServiceAsync

    fun whatsapp(): WhatsappServiceAsync

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

    /** A view of [RelayClientAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RelayClientAsync.WithRawResponse

        fun posts(): PostServiceAsync.WithRawResponse

        fun accounts(): AccountServiceAsync.WithRawResponse

        fun media(): MediaServiceAsync.WithRawResponse

        fun webhooks(): WebhookServiceAsync.WithRawResponse

        fun apiKeys(): ApiKeyServiceAsync.WithRawResponse

        fun usage(): UsageServiceAsync.WithRawResponse

        fun accountGroups(): AccountGroupServiceAsync.WithRawResponse

        fun connect(): ConnectServiceAsync.WithRawResponse

        fun connections(): ConnectionServiceAsync.WithRawResponse

        fun analytics(): AnalyticsServiceAsync.WithRawResponse

        fun tools(): ToolServiceAsync.WithRawResponse

        fun queue(): QueueServiceAsync.WithRawResponse

        fun twitter(): TwitterServiceAsync.WithRawResponse

        fun inbox(): InboxServiceAsync.WithRawResponse

        fun reddit(): RedditServiceAsync.WithRawResponse

        fun whatsapp(): WhatsappServiceAsync.WithRawResponse
    }
}
