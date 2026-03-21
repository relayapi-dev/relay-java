// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.services.blocking.inbox

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

interface MessageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessageService

    /** Get messages in a conversation */
    fun retrieve(conversationId: String): MessageRetrieveResponse =
        retrieve(conversationId, MessageRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        conversationId: String,
        params: MessageRetrieveParams = MessageRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageRetrieveResponse =
        retrieve(params.toBuilder().conversationId(conversationId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        conversationId: String,
        params: MessageRetrieveParams = MessageRetrieveParams.none(),
    ): MessageRetrieveResponse = retrieve(conversationId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MessageRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: MessageRetrieveParams): MessageRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(conversationId: String, requestOptions: RequestOptions): MessageRetrieveResponse =
        retrieve(conversationId, MessageRetrieveParams.none(), requestOptions)

    /** List message conversations */
    fun list(): MessageListResponse = list(MessageListParams.none())

    /** @see list */
    fun list(
        params: MessageListParams = MessageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageListResponse

    /** @see list */
    fun list(params: MessageListParams = MessageListParams.none()): MessageListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): MessageListResponse =
        list(MessageListParams.none(), requestOptions)

    /** Archive a conversation */
    fun archive(conversationId: String): MessageArchiveResponse =
        archive(conversationId, MessageArchiveParams.none())

    /** @see archive */
    fun archive(
        conversationId: String,
        params: MessageArchiveParams = MessageArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageArchiveResponse =
        archive(params.toBuilder().conversationId(conversationId).build(), requestOptions)

    /** @see archive */
    fun archive(
        conversationId: String,
        params: MessageArchiveParams = MessageArchiveParams.none(),
    ): MessageArchiveResponse = archive(conversationId, params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: MessageArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageArchiveResponse

    /** @see archive */
    fun archive(params: MessageArchiveParams): MessageArchiveResponse =
        archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(conversationId: String, requestOptions: RequestOptions): MessageArchiveResponse =
        archive(conversationId, MessageArchiveParams.none(), requestOptions)

    /** Edit a sent message */
    fun edit(messageId: String, params: MessageEditParams): MessageEditResponse =
        edit(messageId, params, RequestOptions.none())

    /** @see edit */
    fun edit(
        messageId: String,
        params: MessageEditParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageEditResponse = edit(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see edit */
    fun edit(params: MessageEditParams): MessageEditResponse = edit(params, RequestOptions.none())

    /** @see edit */
    fun edit(
        params: MessageEditParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageEditResponse

    /** Send a message in a conversation */
    fun send(conversationId: String, params: MessageSendParams): MessageSendResponse =
        send(conversationId, params, RequestOptions.none())

    /** @see send */
    fun send(
        conversationId: String,
        params: MessageSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageSendResponse =
        send(params.toBuilder().conversationId(conversationId).build(), requestOptions)

    /** @see send */
    fun send(params: MessageSendParams): MessageSendResponse = send(params, RequestOptions.none())

    /** @see send */
    fun send(
        params: MessageSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageSendResponse

    /** A view of [MessageService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/inbox/messages/{conversation_id}`, but is
         * otherwise the same as [MessageService.retrieve].
         */
        @MustBeClosed
        fun retrieve(conversationId: String): HttpResponseFor<MessageRetrieveResponse> =
            retrieve(conversationId, MessageRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            conversationId: String,
            params: MessageRetrieveParams = MessageRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageRetrieveResponse> =
            retrieve(params.toBuilder().conversationId(conversationId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            conversationId: String,
            params: MessageRetrieveParams = MessageRetrieveParams.none(),
        ): HttpResponseFor<MessageRetrieveResponse> =
            retrieve(conversationId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MessageRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: MessageRetrieveParams): HttpResponseFor<MessageRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            conversationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessageRetrieveResponse> =
            retrieve(conversationId, MessageRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/inbox/messages`, but is otherwise the same as
         * [MessageService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<MessageListResponse> = list(MessageListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MessageListParams = MessageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: MessageListParams = MessageListParams.none()
        ): HttpResponseFor<MessageListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<MessageListResponse> =
            list(MessageListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/inbox/messages/{conversation_id}/archive`, but
         * is otherwise the same as [MessageService.archive].
         */
        @MustBeClosed
        fun archive(conversationId: String): HttpResponseFor<MessageArchiveResponse> =
            archive(conversationId, MessageArchiveParams.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            conversationId: String,
            params: MessageArchiveParams = MessageArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageArchiveResponse> =
            archive(params.toBuilder().conversationId(conversationId).build(), requestOptions)

        /** @see archive */
        @MustBeClosed
        fun archive(
            conversationId: String,
            params: MessageArchiveParams = MessageArchiveParams.none(),
        ): HttpResponseFor<MessageArchiveResponse> =
            archive(conversationId, params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            params: MessageArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageArchiveResponse>

        /** @see archive */
        @MustBeClosed
        fun archive(params: MessageArchiveParams): HttpResponseFor<MessageArchiveResponse> =
            archive(params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            conversationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessageArchiveResponse> =
            archive(conversationId, MessageArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch
         * /v1/inbox/messages/{conversation_id}/{message_id}`, but is otherwise the same as
         * [MessageService.edit].
         */
        @MustBeClosed
        fun edit(
            messageId: String,
            params: MessageEditParams,
        ): HttpResponseFor<MessageEditResponse> = edit(messageId, params, RequestOptions.none())

        /** @see edit */
        @MustBeClosed
        fun edit(
            messageId: String,
            params: MessageEditParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageEditResponse> =
            edit(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see edit */
        @MustBeClosed
        fun edit(params: MessageEditParams): HttpResponseFor<MessageEditResponse> =
            edit(params, RequestOptions.none())

        /** @see edit */
        @MustBeClosed
        fun edit(
            params: MessageEditParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageEditResponse>

        /**
         * Returns a raw HTTP response for `post /v1/inbox/messages/{conversation_id}`, but is
         * otherwise the same as [MessageService.send].
         */
        @MustBeClosed
        fun send(
            conversationId: String,
            params: MessageSendParams,
        ): HttpResponseFor<MessageSendResponse> =
            send(conversationId, params, RequestOptions.none())

        /** @see send */
        @MustBeClosed
        fun send(
            conversationId: String,
            params: MessageSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageSendResponse> =
            send(params.toBuilder().conversationId(conversationId).build(), requestOptions)

        /** @see send */
        @MustBeClosed
        fun send(params: MessageSendParams): HttpResponseFor<MessageSendResponse> =
            send(params, RequestOptions.none())

        /** @see send */
        @MustBeClosed
        fun send(
            params: MessageSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageSendResponse>
    }
}
