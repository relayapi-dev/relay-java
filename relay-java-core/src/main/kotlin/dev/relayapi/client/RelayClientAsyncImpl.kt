// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.client

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.getPackageVersion
import dev.relayapi.services.async.AccountGroupServiceAsync
import dev.relayapi.services.async.AccountGroupServiceAsyncImpl
import dev.relayapi.services.async.AccountServiceAsync
import dev.relayapi.services.async.AccountServiceAsyncImpl
import dev.relayapi.services.async.AnalyticsServiceAsync
import dev.relayapi.services.async.AnalyticsServiceAsyncImpl
import dev.relayapi.services.async.ApiKeyServiceAsync
import dev.relayapi.services.async.ApiKeyServiceAsyncImpl
import dev.relayapi.services.async.ConnectServiceAsync
import dev.relayapi.services.async.ConnectServiceAsyncImpl
import dev.relayapi.services.async.ConnectionServiceAsync
import dev.relayapi.services.async.ConnectionServiceAsyncImpl
import dev.relayapi.services.async.InboxServiceAsync
import dev.relayapi.services.async.InboxServiceAsyncImpl
import dev.relayapi.services.async.MediaServiceAsync
import dev.relayapi.services.async.MediaServiceAsyncImpl
import dev.relayapi.services.async.PostServiceAsync
import dev.relayapi.services.async.PostServiceAsyncImpl
import dev.relayapi.services.async.QueueServiceAsync
import dev.relayapi.services.async.QueueServiceAsyncImpl
import dev.relayapi.services.async.RedditServiceAsync
import dev.relayapi.services.async.RedditServiceAsyncImpl
import dev.relayapi.services.async.ToolServiceAsync
import dev.relayapi.services.async.ToolServiceAsyncImpl
import dev.relayapi.services.async.TwitterServiceAsync
import dev.relayapi.services.async.TwitterServiceAsyncImpl
import dev.relayapi.services.async.UsageServiceAsync
import dev.relayapi.services.async.UsageServiceAsyncImpl
import dev.relayapi.services.async.WebhookServiceAsync
import dev.relayapi.services.async.WebhookServiceAsyncImpl
import dev.relayapi.services.async.WhatsappServiceAsync
import dev.relayapi.services.async.WhatsappServiceAsyncImpl
import java.util.function.Consumer

class RelayClientAsyncImpl(private val clientOptions: ClientOptions) : RelayClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: RelayClient by lazy { RelayClientImpl(clientOptions) }

    private val withRawResponse: RelayClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val posts: PostServiceAsync by lazy { PostServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val accounts: AccountServiceAsync by lazy {
        AccountServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val media: MediaServiceAsync by lazy {
        MediaServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val webhooks: WebhookServiceAsync by lazy {
        WebhookServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val apiKeys: ApiKeyServiceAsync by lazy {
        ApiKeyServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val usage: UsageServiceAsync by lazy {
        UsageServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val accountGroups: AccountGroupServiceAsync by lazy {
        AccountGroupServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val connect: ConnectServiceAsync by lazy {
        ConnectServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val connections: ConnectionServiceAsync by lazy {
        ConnectionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val analytics: AnalyticsServiceAsync by lazy {
        AnalyticsServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val tools: ToolServiceAsync by lazy { ToolServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val queue: QueueServiceAsync by lazy {
        QueueServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val twitter: TwitterServiceAsync by lazy {
        TwitterServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val inbox: InboxServiceAsync by lazy {
        InboxServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val reddit: RedditServiceAsync by lazy {
        RedditServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val whatsapp: WhatsappServiceAsync by lazy {
        WhatsappServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): RelayClient = sync

    override fun withRawResponse(): RelayClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RelayClientAsync =
        RelayClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun posts(): PostServiceAsync = posts

    override fun accounts(): AccountServiceAsync = accounts

    override fun media(): MediaServiceAsync = media

    override fun webhooks(): WebhookServiceAsync = webhooks

    override fun apiKeys(): ApiKeyServiceAsync = apiKeys

    override fun usage(): UsageServiceAsync = usage

    override fun accountGroups(): AccountGroupServiceAsync = accountGroups

    override fun connect(): ConnectServiceAsync = connect

    override fun connections(): ConnectionServiceAsync = connections

    override fun analytics(): AnalyticsServiceAsync = analytics

    override fun tools(): ToolServiceAsync = tools

    override fun queue(): QueueServiceAsync = queue

    override fun twitter(): TwitterServiceAsync = twitter

    override fun inbox(): InboxServiceAsync = inbox

    override fun reddit(): RedditServiceAsync = reddit

    override fun whatsapp(): WhatsappServiceAsync = whatsapp

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RelayClientAsync.WithRawResponse {

        private val posts: PostServiceAsync.WithRawResponse by lazy {
            PostServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val accounts: AccountServiceAsync.WithRawResponse by lazy {
            AccountServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val media: MediaServiceAsync.WithRawResponse by lazy {
            MediaServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val webhooks: WebhookServiceAsync.WithRawResponse by lazy {
            WebhookServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val apiKeys: ApiKeyServiceAsync.WithRawResponse by lazy {
            ApiKeyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val usage: UsageServiceAsync.WithRawResponse by lazy {
            UsageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val accountGroups: AccountGroupServiceAsync.WithRawResponse by lazy {
            AccountGroupServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val connect: ConnectServiceAsync.WithRawResponse by lazy {
            ConnectServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val connections: ConnectionServiceAsync.WithRawResponse by lazy {
            ConnectionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val analytics: AnalyticsServiceAsync.WithRawResponse by lazy {
            AnalyticsServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val tools: ToolServiceAsync.WithRawResponse by lazy {
            ToolServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val queue: QueueServiceAsync.WithRawResponse by lazy {
            QueueServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val twitter: TwitterServiceAsync.WithRawResponse by lazy {
            TwitterServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val inbox: InboxServiceAsync.WithRawResponse by lazy {
            InboxServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val reddit: RedditServiceAsync.WithRawResponse by lazy {
            RedditServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val whatsapp: WhatsappServiceAsync.WithRawResponse by lazy {
            WhatsappServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RelayClientAsync.WithRawResponse =
            RelayClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun posts(): PostServiceAsync.WithRawResponse = posts

        override fun accounts(): AccountServiceAsync.WithRawResponse = accounts

        override fun media(): MediaServiceAsync.WithRawResponse = media

        override fun webhooks(): WebhookServiceAsync.WithRawResponse = webhooks

        override fun apiKeys(): ApiKeyServiceAsync.WithRawResponse = apiKeys

        override fun usage(): UsageServiceAsync.WithRawResponse = usage

        override fun accountGroups(): AccountGroupServiceAsync.WithRawResponse = accountGroups

        override fun connect(): ConnectServiceAsync.WithRawResponse = connect

        override fun connections(): ConnectionServiceAsync.WithRawResponse = connections

        override fun analytics(): AnalyticsServiceAsync.WithRawResponse = analytics

        override fun tools(): ToolServiceAsync.WithRawResponse = tools

        override fun queue(): QueueServiceAsync.WithRawResponse = queue

        override fun twitter(): TwitterServiceAsync.WithRawResponse = twitter

        override fun inbox(): InboxServiceAsync.WithRawResponse = inbox

        override fun reddit(): RedditServiceAsync.WithRawResponse = reddit

        override fun whatsapp(): WhatsappServiceAsync.WithRawResponse = whatsapp
    }
}
