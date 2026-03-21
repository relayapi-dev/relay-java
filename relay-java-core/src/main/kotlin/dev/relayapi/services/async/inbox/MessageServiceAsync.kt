// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.async.inbox

import dev.relayapi.core.ClientOptions
import dev.relayapi.core.RequestOptions
import dev.relayapi.core.http.HttpResponseFor
import dev.relayapi.models.inbox.messages.MessageArchiveParams
import dev.relayapi.models.inbox.messages.MessageArchiveResponse
import dev.relayapi.models.inbox.messages.MessageEditParams
import dev.relayapi.models.inbox.messages.MessageEditResponse
import dev.relayapi.models.inbox.messages.MessageListParams
import dev.relayapi.models.inbox.messages.MessageListResponse
import dev.relayapi.models.inbox.messages.MessageRetrieveParams
import dev.relayapi.models.inbox.messages.MessageRetrieveResponse
import dev.relayapi.models.inbox.messages.MessageSendParams
import dev.relayapi.models.inbox.messages.MessageSendResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MessageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessageServiceAsync

    /** Get messages in a conversation */
    fun retrieve(conversationId: String): CompletableFuture<MessageRetrieveResponse> =
        retrieve(conversationId, MessageRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        conversationId: String,
        params: MessageRetrieveParams = MessageRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageRetrieveResponse> =
        retrieve(params.toBuilder().conversationId(conversationId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        conversationId: String,
        params: MessageRetrieveParams = MessageRetrieveParams.none(),
    ): CompletableFuture<MessageRetrieveResponse> =
        retrieve(conversationId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MessageRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: MessageRetrieveParams): CompletableFuture<MessageRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        conversationId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessageRetrieveResponse> =
        retrieve(conversationId, MessageRetrieveParams.none(), requestOptions)

    /** List message conversations */
    fun list(): CompletableFuture<MessageListResponse> = list(MessageListParams.none())

    /** @see list */
    fun list(
        params: MessageListParams = MessageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageListResponse>

    /** @see list */
    fun list(
        params: MessageListParams = MessageListParams.none()
    ): CompletableFuture<MessageListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<MessageListResponse> =
        list(MessageListParams.none(), requestOptions)

    /** Archive a conversation */
    fun archive(conversationId: String): CompletableFuture<MessageArchiveResponse> =
        archive(conversationId, MessageArchiveParams.none())

    /** @see archive */
    fun archive(
        conversationId: String,
        params: MessageArchiveParams = MessageArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageArchiveResponse> =
        archive(params.toBuilder().conversationId(conversationId).build(), requestOptions)

    /** @see archive */
    fun archive(
        conversationId: String,
        params: MessageArchiveParams = MessageArchiveParams.none(),
    ): CompletableFuture<MessageArchiveResponse> =
        archive(conversationId, params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: MessageArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageArchiveResponse>

    /** @see archive */
    fun archive(params: MessageArchiveParams): CompletableFuture<MessageArchiveResponse> =
        archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(
        conversationId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessageArchiveResponse> =
        archive(conversationId, MessageArchiveParams.none(), requestOptions)

    /** Edit a sent message */
    fun edit(messageId: String, params: MessageEditParams): CompletableFuture<MessageEditResponse> =
        edit(messageId, params, RequestOptions.none())

    /** @see edit */
    fun edit(
        messageId: String,
        params: MessageEditParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageEditResponse> =
        edit(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see edit */
    fun edit(params: MessageEditParams): CompletableFuture<MessageEditResponse> =
        edit(params, RequestOptions.none())

    /** @see edit */
    fun edit(
        params: MessageEditParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageEditResponse>

    /** Send a message in a conversation */
    fun send(
        conversationId: String,
        params: MessageSendParams,
    ): CompletableFuture<MessageSendResponse> = send(conversationId, params, RequestOptions.none())

    /** @see send */
    fun send(
        conversationId: String,
        params: MessageSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageSendResponse> =
        send(params.toBuilder().conversationId(conversationId).build(), requestOptions)

    /** @see send */
    fun send(params: MessageSendParams): CompletableFuture<MessageSendResponse> =
        send(params, RequestOptions.none())

    /** @see send */
    fun send(
        params: MessageSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageSendResponse>

    /**
     * A view of [MessageServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MessageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/inbox/messages/{conversation_id}`, but is
         * otherwise the same as [MessageServiceAsync.retrieve].
         */
        fun retrieve(
            conversationId: String
        ): CompletableFuture<HttpResponseFor<MessageRetrieveResponse>> =
            retrieve(conversationId, MessageRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            conversationId: String,
            params: MessageRetrieveParams = MessageRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageRetrieveResponse>> =
            retrieve(params.toBuilder().conversationId(conversationId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            conversationId: String,
            params: MessageRetrieveParams = MessageRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<MessageRetrieveResponse>> =
            retrieve(conversationId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: MessageRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: MessageRetrieveParams
        ): CompletableFuture<HttpResponseFor<MessageRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            conversationId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessageRetrieveResponse>> =
            retrieve(conversationId, MessageRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/inbox/messages`, but is otherwise the same as
         * [MessageServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<MessageListResponse>> =
            list(MessageListParams.none())

        /** @see list */
        fun list(
            params: MessageListParams = MessageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageListResponse>>

        /** @see list */
        fun list(
            params: MessageListParams = MessageListParams.none()
        ): CompletableFuture<HttpResponseFor<MessageListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MessageListResponse>> =
            list(MessageListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/inbox/messages/{conversation_id}/archive`, but
         * is otherwise the same as [MessageServiceAsync.archive].
         */
        fun archive(
            conversationId: String
        ): CompletableFuture<HttpResponseFor<MessageArchiveResponse>> =
            archive(conversationId, MessageArchiveParams.none())

        /** @see archive */
        fun archive(
            conversationId: String,
            params: MessageArchiveParams = MessageArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageArchiveResponse>> =
            archive(params.toBuilder().conversationId(conversationId).build(), requestOptions)

        /** @see archive */
        fun archive(
            conversationId: String,
            params: MessageArchiveParams = MessageArchiveParams.none(),
        ): CompletableFuture<HttpResponseFor<MessageArchiveResponse>> =
            archive(conversationId, params, RequestOptions.none())

        /** @see archive */
        fun archive(
            params: MessageArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageArchiveResponse>>

        /** @see archive */
        fun archive(
            params: MessageArchiveParams
        ): CompletableFuture<HttpResponseFor<MessageArchiveResponse>> =
            archive(params, RequestOptions.none())

        /** @see archive */
        fun archive(
            conversationId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessageArchiveResponse>> =
            archive(conversationId, MessageArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch
         * /v1/inbox/messages/{conversation_id}/{message_id}`, but is otherwise the same as
         * [MessageServiceAsync.edit].
         */
        fun edit(
            messageId: String,
            params: MessageEditParams,
        ): CompletableFuture<HttpResponseFor<MessageEditResponse>> =
            edit(messageId, params, RequestOptions.none())

        /** @see edit */
        fun edit(
            messageId: String,
            params: MessageEditParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageEditResponse>> =
            edit(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see edit */
        fun edit(
            params: MessageEditParams
        ): CompletableFuture<HttpResponseFor<MessageEditResponse>> =
            edit(params, RequestOptions.none())

        /** @see edit */
        fun edit(
            params: MessageEditParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageEditResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/inbox/messages/{conversation_id}`, but is
         * otherwise the same as [MessageServiceAsync.send].
         */
        fun send(
            conversationId: String,
            params: MessageSendParams,
        ): CompletableFuture<HttpResponseFor<MessageSendResponse>> =
            send(conversationId, params, RequestOptions.none())

        /** @see send */
        fun send(
            conversationId: String,
            params: MessageSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageSendResponse>> =
            send(params.toBuilder().conversationId(conversationId).build(), requestOptions)

        /** @see send */
        fun send(
            params: MessageSendParams
        ): CompletableFuture<HttpResponseFor<MessageSendResponse>> =
            send(params, RequestOptions.none())

        /** @see send */
        fun send(
            params: MessageSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageSendResponse>>
    }
}
