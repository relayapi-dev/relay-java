// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.client

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.getPackageVersion
import dev.relayapi.services.blocking.AccountGroupService
import dev.relayapi.services.blocking.AccountGroupServiceImpl
import dev.relayapi.services.blocking.AccountService
import dev.relayapi.services.blocking.AccountServiceImpl
import dev.relayapi.services.blocking.AnalyticsService
import dev.relayapi.services.blocking.AnalyticsServiceImpl
import dev.relayapi.services.blocking.ApiKeyService
import dev.relayapi.services.blocking.ApiKeyServiceImpl
import dev.relayapi.services.blocking.ConnectService
import dev.relayapi.services.blocking.ConnectServiceImpl
import dev.relayapi.services.blocking.ConnectionService
import dev.relayapi.services.blocking.ConnectionServiceImpl
import dev.relayapi.services.blocking.InboxService
import dev.relayapi.services.blocking.InboxServiceImpl
import dev.relayapi.services.blocking.MediaService
import dev.relayapi.services.blocking.MediaServiceImpl
import dev.relayapi.services.blocking.PostService
import dev.relayapi.services.blocking.PostServiceImpl
import dev.relayapi.services.blocking.QueueService
import dev.relayapi.services.blocking.QueueServiceImpl
import dev.relayapi.services.blocking.RedditService
import dev.relayapi.services.blocking.RedditServiceImpl
import dev.relayapi.services.blocking.ToolService
import dev.relayapi.services.blocking.ToolServiceImpl
import dev.relayapi.services.blocking.TwitterService
import dev.relayapi.services.blocking.TwitterServiceImpl
import dev.relayapi.services.blocking.UsageService
import dev.relayapi.services.blocking.UsageServiceImpl
import dev.relayapi.services.blocking.WebhookService
import dev.relayapi.services.blocking.WebhookServiceImpl
import dev.relayapi.services.blocking.WhatsappService
import dev.relayapi.services.blocking.WhatsappServiceImpl
import java.util.function.Consumer

class RelayClientImpl(private val clientOptions: ClientOptions) : RelayClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: RelayClientAsync by lazy { RelayClientAsyncImpl(clientOptions) }

    private val withRawResponse: RelayClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val posts: PostService by lazy { PostServiceImpl(clientOptionsWithUserAgent) }

    private val accounts: AccountService by lazy { AccountServiceImpl(clientOptionsWithUserAgent) }

    private val media: MediaService by lazy { MediaServiceImpl(clientOptionsWithUserAgent) }

    private val webhooks: WebhookService by lazy { WebhookServiceImpl(clientOptionsWithUserAgent) }

    private val apiKeys: ApiKeyService by lazy { ApiKeyServiceImpl(clientOptionsWithUserAgent) }

    private val usage: UsageService by lazy { UsageServiceImpl(clientOptionsWithUserAgent) }

    private val accountGroups: AccountGroupService by lazy {
        AccountGroupServiceImpl(clientOptionsWithUserAgent)
    }

    private val connect: ConnectService by lazy { ConnectServiceImpl(clientOptionsWithUserAgent) }

    private val connections: ConnectionService by lazy {
        ConnectionServiceImpl(clientOptionsWithUserAgent)
    }

    private val analytics: AnalyticsService by lazy {
        AnalyticsServiceImpl(clientOptionsWithUserAgent)
    }

    private val tools: ToolService by lazy { ToolServiceImpl(clientOptionsWithUserAgent) }

    private val queue: QueueService by lazy { QueueServiceImpl(clientOptionsWithUserAgent) }

    private val twitter: TwitterService by lazy { TwitterServiceImpl(clientOptionsWithUserAgent) }

    private val inbox: InboxService by lazy { InboxServiceImpl(clientOptionsWithUserAgent) }

    private val reddit: RedditService by lazy { RedditServiceImpl(clientOptionsWithUserAgent) }

    private val whatsapp: WhatsappService by lazy {
        WhatsappServiceImpl(clientOptionsWithUserAgent)
    }

    override fun async(): RelayClientAsync = async

    override fun withRawResponse(): RelayClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RelayClient =
        RelayClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun posts(): PostService = posts

    override fun accounts(): AccountService = accounts

    override fun media(): MediaService = media

    override fun webhooks(): WebhookService = webhooks

    override fun apiKeys(): ApiKeyService = apiKeys

    override fun usage(): UsageService = usage

    override fun accountGroups(): AccountGroupService = accountGroups

    override fun connect(): ConnectService = connect

    override fun connections(): ConnectionService = connections

    override fun analytics(): AnalyticsService = analytics

    override fun tools(): ToolService = tools

    override fun queue(): QueueService = queue

    override fun twitter(): TwitterService = twitter

    override fun inbox(): InboxService = inbox

    override fun reddit(): RedditService = reddit

    override fun whatsapp(): WhatsappService = whatsapp

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RelayClient.WithRawResponse {

        private val posts: PostService.WithRawResponse by lazy {
            PostServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val accounts: AccountService.WithRawResponse by lazy {
            AccountServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val media: MediaService.WithRawResponse by lazy {
            MediaServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val webhooks: WebhookService.WithRawResponse by lazy {
            WebhookServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val apiKeys: ApiKeyService.WithRawResponse by lazy {
            ApiKeyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val usage: UsageService.WithRawResponse by lazy {
            UsageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val accountGroups: AccountGroupService.WithRawResponse by lazy {
            AccountGroupServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val connect: ConnectService.WithRawResponse by lazy {
            ConnectServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val connections: ConnectionService.WithRawResponse by lazy {
            ConnectionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val analytics: AnalyticsService.WithRawResponse by lazy {
            AnalyticsServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val tools: ToolService.WithRawResponse by lazy {
            ToolServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val queue: QueueService.WithRawResponse by lazy {
            QueueServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val twitter: TwitterService.WithRawResponse by lazy {
            TwitterServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val inbox: InboxService.WithRawResponse by lazy {
            InboxServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val reddit: RedditService.WithRawResponse by lazy {
            RedditServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val whatsapp: WhatsappService.WithRawResponse by lazy {
            WhatsappServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RelayClient.WithRawResponse =
            RelayClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun posts(): PostService.WithRawResponse = posts

        override fun accounts(): AccountService.WithRawResponse = accounts

        override fun media(): MediaService.WithRawResponse = media

        override fun webhooks(): WebhookService.WithRawResponse = webhooks

        override fun apiKeys(): ApiKeyService.WithRawResponse = apiKeys

        override fun usage(): UsageService.WithRawResponse = usage

        override fun accountGroups(): AccountGroupService.WithRawResponse = accountGroups

        override fun connect(): ConnectService.WithRawResponse = connect

        override fun connections(): ConnectionService.WithRawResponse = connections

        override fun analytics(): AnalyticsService.WithRawResponse = analytics

        override fun tools(): ToolService.WithRawResponse = tools

        override fun queue(): QueueService.WithRawResponse = queue

        override fun twitter(): TwitterService.WithRawResponse = twitter

        override fun inbox(): InboxService.WithRawResponse = inbox

        override fun reddit(): RedditService.WithRawResponse = reddit

        override fun whatsapp(): WhatsappService.WithRawResponse = whatsapp
    }
}
