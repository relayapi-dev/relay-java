// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.inbox.messages

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.relayapi.core.Enum
import dev.relayapi.core.ExcludeMissing
import dev.relayapi.core.JsonField
import dev.relayapi.core.JsonMissing
import dev.relayapi.core.JsonValue
import dev.relayapi.core.Params
import dev.relayapi.core.checkKnown
import dev.relayapi.core.checkRequired
import dev.relayapi.core.http.Headers
import dev.relayapi.core.http.QueryParams
import dev.relayapi.core.toImmutable
import dev.relayapi.errors.RelayInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Send a message in a conversation */
class MessageSendParams
private constructor(
    private val conversationId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Conversation ID */
    fun conversationId(): Optional<String> = Optional.ofNullable(conversationId)

    /**
     * Account ID to send from
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): String = body.accountId()

    /**
     * Attachments
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun attachments(): Optional<List<Attachment>> = body.attachments()

    /**
     * Message tag for sending outside the 24h window (Facebook only)
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messageTag(): Optional<MessageTag> = body.messageTag()

    /**
     * Quick reply buttons (Facebook/Instagram, max 13)
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun quickReplies(): Optional<List<QuickReply>> = body.quickReplies()

    /**
     * Message ID to reply to
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun replyTo(): Optional<String> = body.replyTo()

    /**
     * Structured template message (Facebook/Instagram)
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun template(): Optional<Template> = body.template()

    /**
     * Message text
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun text(): Optional<String> = body.text()

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _accountId(): JsonField<String> = body._accountId()

    /**
     * Returns the raw JSON value of [attachments].
     *
     * Unlike [attachments], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _attachments(): JsonField<List<Attachment>> = body._attachments()

    /**
     * Returns the raw JSON value of [messageTag].
     *
     * Unlike [messageTag], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _messageTag(): JsonField<MessageTag> = body._messageTag()

    /**
     * Returns the raw JSON value of [quickReplies].
     *
     * Unlike [quickReplies], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _quickReplies(): JsonField<List<QuickReply>> = body._quickReplies()

    /**
     * Returns the raw JSON value of [replyTo].
     *
     * Unlike [replyTo], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _replyTo(): JsonField<String> = body._replyTo()

    /**
     * Returns the raw JSON value of [template].
     *
     * Unlike [template], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _template(): JsonField<Template> = body._template()

    /**
     * Returns the raw JSON value of [text].
     *
     * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _text(): JsonField<String> = body._text()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MessageSendParams].
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MessageSendParams]. */
    class Builder internal constructor() {

        private var conversationId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(messageSendParams: MessageSendParams) = apply {
            conversationId = messageSendParams.conversationId
            body = messageSendParams.body.toBuilder()
            additionalHeaders = messageSendParams.additionalHeaders.toBuilder()
            additionalQueryParams = messageSendParams.additionalQueryParams.toBuilder()
        }

        /** Conversation ID */
        fun conversationId(conversationId: String?) = apply { this.conversationId = conversationId }

        /** Alias for calling [Builder.conversationId] with `conversationId.orElse(null)`. */
        fun conversationId(conversationId: Optional<String>) =
            conversationId(conversationId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [accountId]
         * - [attachments]
         * - [messageTag]
         * - [quickReplies]
         * - [replyTo]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Account ID to send from */
        fun accountId(accountId: String) = apply { body.accountId(accountId) }

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountId(accountId: JsonField<String>) = apply { body.accountId(accountId) }

        /** Attachments */
        fun attachments(attachments: List<Attachment>) = apply { body.attachments(attachments) }

        /**
         * Sets [Builder.attachments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attachments] with a well-typed `List<Attachment>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun attachments(attachments: JsonField<List<Attachment>>) = apply {
            body.attachments(attachments)
        }

        /**
         * Adds a single [Attachment] to [attachments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAttachment(attachment: Attachment) = apply { body.addAttachment(attachment) }

        /** Message tag for sending outside the 24h window (Facebook only) */
        fun messageTag(messageTag: MessageTag) = apply { body.messageTag(messageTag) }

        /**
         * Sets [Builder.messageTag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messageTag] with a well-typed [MessageTag] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun messageTag(messageTag: JsonField<MessageTag>) = apply { body.messageTag(messageTag) }

        /** Quick reply buttons (Facebook/Instagram, max 13) */
        fun quickReplies(quickReplies: List<QuickReply>) = apply { body.quickReplies(quickReplies) }

        /**
         * Sets [Builder.quickReplies] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quickReplies] with a well-typed `List<QuickReply>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun quickReplies(quickReplies: JsonField<List<QuickReply>>) = apply {
            body.quickReplies(quickReplies)
        }

        /**
         * Adds a single [QuickReply] to [quickReplies].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addQuickReply(quickReply: QuickReply) = apply { body.addQuickReply(quickReply) }

        /** Message ID to reply to */
        fun replyTo(replyTo: String) = apply { body.replyTo(replyTo) }

        /**
         * Sets [Builder.replyTo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.replyTo] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun replyTo(replyTo: JsonField<String>) = apply { body.replyTo(replyTo) }

        /** Structured template message (Facebook/Instagram) */
        fun template(template: Template) = apply { body.template(template) }

        /**
         * Sets [Builder.template] to an arbitrary JSON value.
         *
         * You should usually call [Builder.template] with a well-typed [Template] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun template(template: JsonField<Template>) = apply { body.template(template) }

        /** Message text */
        fun text(text: String) = apply { body.text(text) }

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<String>) = apply { body.text(text) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [MessageSendParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MessageSendParams =
            MessageSendParams(
                conversationId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> conversationId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountId: JsonField<String>,
        private val attachments: JsonField<List<Attachment>>,
        private val messageTag: JsonField<MessageTag>,
        private val quickReplies: JsonField<List<QuickReply>>,
        private val replyTo: JsonField<String>,
        private val template: JsonField<Template>,
        private val text: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_id")
            @ExcludeMissing
            accountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("attachments")
            @ExcludeMissing
            attachments: JsonField<List<Attachment>> = JsonMissing.of(),
            @JsonProperty("message_tag")
            @ExcludeMissing
            messageTag: JsonField<MessageTag> = JsonMissing.of(),
            @JsonProperty("quick_replies")
            @ExcludeMissing
            quickReplies: JsonField<List<QuickReply>> = JsonMissing.of(),
            @JsonProperty("reply_to") @ExcludeMissing replyTo: JsonField<String> = JsonMissing.of(),
            @JsonProperty("template")
            @ExcludeMissing
            template: JsonField<Template> = JsonMissing.of(),
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
        ) : this(
            accountId,
            attachments,
            messageTag,
            quickReplies,
            replyTo,
            template,
            text,
            mutableMapOf(),
        )

        /**
         * Account ID to send from
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountId(): String = accountId.getRequired("account_id")

        /**
         * Attachments
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun attachments(): Optional<List<Attachment>> = attachments.getOptional("attachments")

        /**
         * Message tag for sending outside the 24h window (Facebook only)
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun messageTag(): Optional<MessageTag> = messageTag.getOptional("message_tag")

        /**
         * Quick reply buttons (Facebook/Instagram, max 13)
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun quickReplies(): Optional<List<QuickReply>> = quickReplies.getOptional("quick_replies")

        /**
         * Message ID to reply to
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun replyTo(): Optional<String> = replyTo.getOptional("reply_to")

        /**
         * Structured template message (Facebook/Instagram)
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun template(): Optional<Template> = template.getOptional("template")

        /**
         * Message text
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun text(): Optional<String> = text.getOptional("text")

        /**
         * Returns the raw JSON value of [accountId].
         *
         * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /**
         * Returns the raw JSON value of [attachments].
         *
         * Unlike [attachments], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("attachments")
        @ExcludeMissing
        fun _attachments(): JsonField<List<Attachment>> = attachments

        /**
         * Returns the raw JSON value of [messageTag].
         *
         * Unlike [messageTag], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("message_tag")
        @ExcludeMissing
        fun _messageTag(): JsonField<MessageTag> = messageTag

        /**
         * Returns the raw JSON value of [quickReplies].
         *
         * Unlike [quickReplies], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("quick_replies")
        @ExcludeMissing
        fun _quickReplies(): JsonField<List<QuickReply>> = quickReplies

        /**
         * Returns the raw JSON value of [replyTo].
         *
         * Unlike [replyTo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reply_to") @ExcludeMissing fun _replyTo(): JsonField<String> = replyTo

        /**
         * Returns the raw JSON value of [template].
         *
         * Unlike [template], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("template") @ExcludeMissing fun _template(): JsonField<Template> = template

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .accountId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var attachments: JsonField<MutableList<Attachment>>? = null
            private var messageTag: JsonField<MessageTag> = JsonMissing.of()
            private var quickReplies: JsonField<MutableList<QuickReply>>? = null
            private var replyTo: JsonField<String> = JsonMissing.of()
            private var template: JsonField<Template> = JsonMissing.of()
            private var text: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                accountId = body.accountId
                attachments = body.attachments.map { it.toMutableList() }
                messageTag = body.messageTag
                quickReplies = body.quickReplies.map { it.toMutableList() }
                replyTo = body.replyTo
                template = body.template
                text = body.text
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Account ID to send from */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /**
             * Sets [Builder.accountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /** Attachments */
            fun attachments(attachments: List<Attachment>) = attachments(JsonField.of(attachments))

            /**
             * Sets [Builder.attachments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attachments] with a well-typed `List<Attachment>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun attachments(attachments: JsonField<List<Attachment>>) = apply {
                this.attachments = attachments.map { it.toMutableList() }
            }

            /**
             * Adds a single [Attachment] to [attachments].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAttachment(attachment: Attachment) = apply {
                attachments =
                    (attachments ?: JsonField.of(mutableListOf())).also {
                        checkKnown("attachments", it).add(attachment)
                    }
            }

            /** Message tag for sending outside the 24h window (Facebook only) */
            fun messageTag(messageTag: MessageTag) = messageTag(JsonField.of(messageTag))

            /**
             * Sets [Builder.messageTag] to an arbitrary JSON value.
             *
             * You should usually call [Builder.messageTag] with a well-typed [MessageTag] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun messageTag(messageTag: JsonField<MessageTag>) = apply {
                this.messageTag = messageTag
            }

            /** Quick reply buttons (Facebook/Instagram, max 13) */
            fun quickReplies(quickReplies: List<QuickReply>) =
                quickReplies(JsonField.of(quickReplies))

            /**
             * Sets [Builder.quickReplies] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quickReplies] with a well-typed `List<QuickReply>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun quickReplies(quickReplies: JsonField<List<QuickReply>>) = apply {
                this.quickReplies = quickReplies.map { it.toMutableList() }
            }

            /**
             * Adds a single [QuickReply] to [quickReplies].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addQuickReply(quickReply: QuickReply) = apply {
                quickReplies =
                    (quickReplies ?: JsonField.of(mutableListOf())).also {
                        checkKnown("quickReplies", it).add(quickReply)
                    }
            }

            /** Message ID to reply to */
            fun replyTo(replyTo: String) = replyTo(JsonField.of(replyTo))

            /**
             * Sets [Builder.replyTo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.replyTo] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun replyTo(replyTo: JsonField<String>) = apply { this.replyTo = replyTo }

            /** Structured template message (Facebook/Instagram) */
            fun template(template: Template) = template(JsonField.of(template))

            /**
             * Sets [Builder.template] to an arbitrary JSON value.
             *
             * You should usually call [Builder.template] with a well-typed [Template] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun template(template: JsonField<Template>) = apply { this.template = template }

            /** Message text */
            fun text(text: String) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .accountId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("accountId", accountId),
                    (attachments ?: JsonMissing.of()).map { it.toImmutable() },
                    messageTag,
                    (quickReplies ?: JsonMissing.of()).map { it.toImmutable() },
                    replyTo,
                    template,
                    text,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accountId()
            attachments().ifPresent { it.forEach { it.validate() } }
            messageTag().ifPresent { it.validate() }
            quickReplies().ifPresent { it.forEach { it.validate() } }
            replyTo()
            template().ifPresent { it.validate() }
            text()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: RelayInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (accountId.asKnown().isPresent) 1 else 0) +
                (attachments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (messageTag.asKnown().getOrNull()?.validity() ?: 0) +
                (quickReplies.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (replyTo.asKnown().isPresent) 1 else 0) +
                (template.asKnown().getOrNull()?.validity() ?: 0) +
                (if (text.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                accountId == other.accountId &&
                attachments == other.attachments &&
                messageTag == other.messageTag &&
                quickReplies == other.quickReplies &&
                replyTo == other.replyTo &&
                template == other.template &&
                text == other.text &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountId,
                attachments,
                messageTag,
                quickReplies,
                replyTo,
                template,
                text,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{accountId=$accountId, attachments=$attachments, messageTag=$messageTag, quickReplies=$quickReplies, replyTo=$replyTo, template=$template, text=$text, additionalProperties=$additionalProperties}"
    }

    class Attachment
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val type: JsonField<String>,
        private val url: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        ) : this(type, url, mutableMapOf())

        /**
         * Attachment MIME type
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): String = type.getRequired("type")

        /**
         * Attachment URL
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun url(): String = url.getRequired("url")

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Attachment].
             *
             * The following fields are required:
             * ```java
             * .type()
             * .url()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Attachment]. */
        class Builder internal constructor() {

            private var type: JsonField<String>? = null
            private var url: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(attachment: Attachment) = apply {
                type = attachment.type
                url = attachment.url
                additionalProperties = attachment.additionalProperties.toMutableMap()
            }

            /** Attachment MIME type */
            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

            /** Attachment URL */
            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Attachment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .type()
             * .url()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Attachment =
                Attachment(
                    checkRequired("type", type),
                    checkRequired("url", url),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Attachment = apply {
            if (validated) {
                return@apply
            }

            type()
            url()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: RelayInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (type.asKnown().isPresent) 1 else 0) + (if (url.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Attachment &&
                type == other.type &&
                url == other.url &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(type, url, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Attachment{type=$type, url=$url, additionalProperties=$additionalProperties}"
    }

    /** Message tag for sending outside the 24h window (Facebook only) */
    class MessageTag @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val HUMAN_AGENT = of("HUMAN_AGENT")

            @JvmField val CUSTOMER_FEEDBACK = of("CUSTOMER_FEEDBACK")

            @JvmStatic fun of(value: String) = MessageTag(JsonField.of(value))
        }

        /** An enum containing [MessageTag]'s known values. */
        enum class Known {
            HUMAN_AGENT,
            CUSTOMER_FEEDBACK,
        }

        /**
         * An enum containing [MessageTag]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [MessageTag] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            HUMAN_AGENT,
            CUSTOMER_FEEDBACK,
            /**
             * An enum member indicating that [MessageTag] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                HUMAN_AGENT -> Value.HUMAN_AGENT
                CUSTOMER_FEEDBACK -> Value.CUSTOMER_FEEDBACK
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws RelayInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                HUMAN_AGENT -> Known.HUMAN_AGENT
                CUSTOMER_FEEDBACK -> Known.CUSTOMER_FEEDBACK
                else -> throw RelayInvalidDataException("Unknown MessageTag: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws RelayInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { RelayInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): MessageTag = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: RelayInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is MessageTag && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class QuickReply
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val contentType: JsonField<ContentType>,
        private val imageUrl: JsonField<String>,
        private val payload: JsonField<String>,
        private val title: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("content_type")
            @ExcludeMissing
            contentType: JsonField<ContentType> = JsonMissing.of(),
            @JsonProperty("image_url")
            @ExcludeMissing
            imageUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("payload") @ExcludeMissing payload: JsonField<String> = JsonMissing.of(),
            @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
        ) : this(contentType, imageUrl, payload, title, mutableMapOf())

        /**
         * Quick reply type
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun contentType(): Optional<ContentType> = contentType.getOptional("content_type")

        /**
         * Icon URL for the button
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun imageUrl(): Optional<String> = imageUrl.getOptional("image_url")

        /**
         * Postback payload
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun payload(): Optional<String> = payload.getOptional("payload")

        /**
         * Button label (required for text type)
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun title(): Optional<String> = title.getOptional("title")

        /**
         * Returns the raw JSON value of [contentType].
         *
         * Unlike [contentType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("content_type")
        @ExcludeMissing
        fun _contentType(): JsonField<ContentType> = contentType

        /**
         * Returns the raw JSON value of [imageUrl].
         *
         * Unlike [imageUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("image_url") @ExcludeMissing fun _imageUrl(): JsonField<String> = imageUrl

        /**
         * Returns the raw JSON value of [payload].
         *
         * Unlike [payload], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("payload") @ExcludeMissing fun _payload(): JsonField<String> = payload

        /**
         * Returns the raw JSON value of [title].
         *
         * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [QuickReply]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [QuickReply]. */
        class Builder internal constructor() {

            private var contentType: JsonField<ContentType> = JsonMissing.of()
            private var imageUrl: JsonField<String> = JsonMissing.of()
            private var payload: JsonField<String> = JsonMissing.of()
            private var title: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(quickReply: QuickReply) = apply {
                contentType = quickReply.contentType
                imageUrl = quickReply.imageUrl
                payload = quickReply.payload
                title = quickReply.title
                additionalProperties = quickReply.additionalProperties.toMutableMap()
            }

            /** Quick reply type */
            fun contentType(contentType: ContentType) = contentType(JsonField.of(contentType))

            /**
             * Sets [Builder.contentType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contentType] with a well-typed [ContentType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contentType(contentType: JsonField<ContentType>) = apply {
                this.contentType = contentType
            }

            /** Icon URL for the button */
            fun imageUrl(imageUrl: String) = imageUrl(JsonField.of(imageUrl))

            /**
             * Sets [Builder.imageUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.imageUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun imageUrl(imageUrl: JsonField<String>) = apply { this.imageUrl = imageUrl }

            /** Postback payload */
            fun payload(payload: String) = payload(JsonField.of(payload))

            /**
             * Sets [Builder.payload] to an arbitrary JSON value.
             *
             * You should usually call [Builder.payload] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun payload(payload: JsonField<String>) = apply { this.payload = payload }

            /** Button label (required for text type) */
            fun title(title: String) = title(JsonField.of(title))

            /**
             * Sets [Builder.title] to an arbitrary JSON value.
             *
             * You should usually call [Builder.title] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun title(title: JsonField<String>) = apply { this.title = title }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [QuickReply].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): QuickReply =
                QuickReply(
                    contentType,
                    imageUrl,
                    payload,
                    title,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): QuickReply = apply {
            if (validated) {
                return@apply
            }

            contentType().ifPresent { it.validate() }
            imageUrl()
            payload()
            title()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: RelayInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (contentType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (imageUrl.asKnown().isPresent) 1 else 0) +
                (if (payload.asKnown().isPresent) 1 else 0) +
                (if (title.asKnown().isPresent) 1 else 0)

        /** Quick reply type */
        class ContentType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val TEXT = of("text")

                @JvmField val USER_PHONE_NUMBER = of("user_phone_number")

                @JvmField val USER_EMAIL = of("user_email")

                @JvmStatic fun of(value: String) = ContentType(JsonField.of(value))
            }

            /** An enum containing [ContentType]'s known values. */
            enum class Known {
                TEXT,
                USER_PHONE_NUMBER,
                USER_EMAIL,
            }

            /**
             * An enum containing [ContentType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ContentType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                TEXT,
                USER_PHONE_NUMBER,
                USER_EMAIL,
                /**
                 * An enum member indicating that [ContentType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    TEXT -> Value.TEXT
                    USER_PHONE_NUMBER -> Value.USER_PHONE_NUMBER
                    USER_EMAIL -> Value.USER_EMAIL
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws RelayInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    TEXT -> Known.TEXT
                    USER_PHONE_NUMBER -> Known.USER_PHONE_NUMBER
                    USER_EMAIL -> Known.USER_EMAIL
                    else -> throw RelayInvalidDataException("Unknown ContentType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws RelayInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    RelayInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): ContentType = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: RelayInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ContentType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is QuickReply &&
                contentType == other.contentType &&
                imageUrl == other.imageUrl &&
                payload == other.payload &&
                title == other.title &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(contentType, imageUrl, payload, title, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "QuickReply{contentType=$contentType, imageUrl=$imageUrl, payload=$payload, title=$title, additionalProperties=$additionalProperties}"
    }

    /** Structured template message (Facebook/Instagram) */
    class Template
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val elements: JsonField<List<Element>>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("elements")
            @ExcludeMissing
            elements: JsonField<List<Element>> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(elements, type, mutableMapOf())

        /**
         * Template elements (max 10 for carousel)
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun elements(): List<Element> = elements.getRequired("elements")

        /**
         * Template type
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Returns the raw JSON value of [elements].
         *
         * Unlike [elements], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("elements")
        @ExcludeMissing
        fun _elements(): JsonField<List<Element>> = elements

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Template].
             *
             * The following fields are required:
             * ```java
             * .elements()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Template]. */
        class Builder internal constructor() {

            private var elements: JsonField<MutableList<Element>>? = null
            private var type: JsonField<Type>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(template: Template) = apply {
                elements = template.elements.map { it.toMutableList() }
                type = template.type
                additionalProperties = template.additionalProperties.toMutableMap()
            }

            /** Template elements (max 10 for carousel) */
            fun elements(elements: List<Element>) = elements(JsonField.of(elements))

            /**
             * Sets [Builder.elements] to an arbitrary JSON value.
             *
             * You should usually call [Builder.elements] with a well-typed `List<Element>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun elements(elements: JsonField<List<Element>>) = apply {
                this.elements = elements.map { it.toMutableList() }
            }

            /**
             * Adds a single [Element] to [elements].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addElement(element: Element) = apply {
                elements =
                    (elements ?: JsonField.of(mutableListOf())).also {
                        checkKnown("elements", it).add(element)
                    }
            }

            /** Template type */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Template].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .elements()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Template =
                Template(
                    checkRequired("elements", elements).map { it.toImmutable() },
                    checkRequired("type", type),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Template = apply {
            if (validated) {
                return@apply
            }

            elements().forEach { it.validate() }
            type().validate()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: RelayInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (elements.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        class Element
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val title: JsonField<String>,
            private val buttons: JsonField<List<Button>>,
            private val imageUrl: JsonField<String>,
            private val subtitle: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
                @JsonProperty("buttons")
                @ExcludeMissing
                buttons: JsonField<List<Button>> = JsonMissing.of(),
                @JsonProperty("image_url")
                @ExcludeMissing
                imageUrl: JsonField<String> = JsonMissing.of(),
                @JsonProperty("subtitle")
                @ExcludeMissing
                subtitle: JsonField<String> = JsonMissing.of(),
            ) : this(title, buttons, imageUrl, subtitle, mutableMapOf())

            /**
             * Element title
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun title(): String = title.getRequired("title")

            /**
             * Element buttons (max 3)
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun buttons(): Optional<List<Button>> = buttons.getOptional("buttons")

            /**
             * Element image URL
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun imageUrl(): Optional<String> = imageUrl.getOptional("image_url")

            /**
             * Element subtitle
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun subtitle(): Optional<String> = subtitle.getOptional("subtitle")

            /**
             * Returns the raw JSON value of [title].
             *
             * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

            /**
             * Returns the raw JSON value of [buttons].
             *
             * Unlike [buttons], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("buttons")
            @ExcludeMissing
            fun _buttons(): JsonField<List<Button>> = buttons

            /**
             * Returns the raw JSON value of [imageUrl].
             *
             * Unlike [imageUrl], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("image_url") @ExcludeMissing fun _imageUrl(): JsonField<String> = imageUrl

            /**
             * Returns the raw JSON value of [subtitle].
             *
             * Unlike [subtitle], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("subtitle") @ExcludeMissing fun _subtitle(): JsonField<String> = subtitle

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Element].
                 *
                 * The following fields are required:
                 * ```java
                 * .title()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Element]. */
            class Builder internal constructor() {

                private var title: JsonField<String>? = null
                private var buttons: JsonField<MutableList<Button>>? = null
                private var imageUrl: JsonField<String> = JsonMissing.of()
                private var subtitle: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(element: Element) = apply {
                    title = element.title
                    buttons = element.buttons.map { it.toMutableList() }
                    imageUrl = element.imageUrl
                    subtitle = element.subtitle
                    additionalProperties = element.additionalProperties.toMutableMap()
                }

                /** Element title */
                fun title(title: String) = title(JsonField.of(title))

                /**
                 * Sets [Builder.title] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.title] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun title(title: JsonField<String>) = apply { this.title = title }

                /** Element buttons (max 3) */
                fun buttons(buttons: List<Button>) = buttons(JsonField.of(buttons))

                /**
                 * Sets [Builder.buttons] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.buttons] with a well-typed `List<Button>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun buttons(buttons: JsonField<List<Button>>) = apply {
                    this.buttons = buttons.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Button] to [buttons].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addButton(button: Button) = apply {
                    buttons =
                        (buttons ?: JsonField.of(mutableListOf())).also {
                            checkKnown("buttons", it).add(button)
                        }
                }

                /** Element image URL */
                fun imageUrl(imageUrl: String) = imageUrl(JsonField.of(imageUrl))

                /**
                 * Sets [Builder.imageUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.imageUrl] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun imageUrl(imageUrl: JsonField<String>) = apply { this.imageUrl = imageUrl }

                /** Element subtitle */
                fun subtitle(subtitle: String) = subtitle(JsonField.of(subtitle))

                /**
                 * Sets [Builder.subtitle] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subtitle] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun subtitle(subtitle: JsonField<String>) = apply { this.subtitle = subtitle }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Element].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .title()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Element =
                    Element(
                        checkRequired("title", title),
                        (buttons ?: JsonMissing.of()).map { it.toImmutable() },
                        imageUrl,
                        subtitle,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Element = apply {
                if (validated) {
                    return@apply
                }

                title()
                buttons().ifPresent { it.forEach { it.validate() } }
                imageUrl()
                subtitle()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: RelayInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (title.asKnown().isPresent) 1 else 0) +
                    (buttons.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (imageUrl.asKnown().isPresent) 1 else 0) +
                    (if (subtitle.asKnown().isPresent) 1 else 0)

            class Button
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val title: JsonField<String>,
                private val type: JsonField<Type>,
                private val payload: JsonField<String>,
                private val url: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("title")
                    @ExcludeMissing
                    title: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                    @JsonProperty("payload")
                    @ExcludeMissing
                    payload: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
                ) : this(title, type, payload, url, mutableMapOf())

                /**
                 * Button label
                 *
                 * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun title(): String = title.getRequired("title")

                /**
                 * Button type
                 *
                 * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun type(): Type = type.getRequired("type")

                /**
                 * Payload for postback buttons
                 *
                 * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun payload(): Optional<String> = payload.getOptional("payload")

                /**
                 * URL for web_url buttons
                 *
                 * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun url(): Optional<String> = url.getOptional("url")

                /**
                 * Returns the raw JSON value of [title].
                 *
                 * Unlike [title], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                /**
                 * Returns the raw JSON value of [payload].
                 *
                 * Unlike [payload], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("payload") @ExcludeMissing fun _payload(): JsonField<String> = payload

                /**
                 * Returns the raw JSON value of [url].
                 *
                 * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Button].
                     *
                     * The following fields are required:
                     * ```java
                     * .title()
                     * .type()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Button]. */
                class Builder internal constructor() {

                    private var title: JsonField<String>? = null
                    private var type: JsonField<Type>? = null
                    private var payload: JsonField<String> = JsonMissing.of()
                    private var url: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(button: Button) = apply {
                        title = button.title
                        type = button.type
                        payload = button.payload
                        url = button.url
                        additionalProperties = button.additionalProperties.toMutableMap()
                    }

                    /** Button label */
                    fun title(title: String) = title(JsonField.of(title))

                    /**
                     * Sets [Builder.title] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.title] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun title(title: JsonField<String>) = apply { this.title = title }

                    /** Button type */
                    fun type(type: Type) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [Type] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    /** Payload for postback buttons */
                    fun payload(payload: String) = payload(JsonField.of(payload))

                    /**
                     * Sets [Builder.payload] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.payload] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun payload(payload: JsonField<String>) = apply { this.payload = payload }

                    /** URL for web_url buttons */
                    fun url(url: String) = url(JsonField.of(url))

                    /**
                     * Sets [Builder.url] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.url] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun url(url: JsonField<String>) = apply { this.url = url }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Button].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .title()
                     * .type()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Button =
                        Button(
                            checkRequired("title", title),
                            checkRequired("type", type),
                            payload,
                            url,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Button = apply {
                    if (validated) {
                        return@apply
                    }

                    title()
                    type().validate()
                    payload()
                    url()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: RelayInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (title.asKnown().isPresent) 1 else 0) +
                        (type.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (payload.asKnown().isPresent) 1 else 0) +
                        (if (url.asKnown().isPresent) 1 else 0)

                /** Button type */
                class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val WEB_URL = of("web_url")

                        @JvmField val POSTBACK = of("postback")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        WEB_URL,
                        POSTBACK,
                    }

                    /**
                     * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Type] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        WEB_URL,
                        POSTBACK,
                        /**
                         * An enum member indicating that [Type] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            WEB_URL -> Value.WEB_URL
                            POSTBACK -> Value.POSTBACK
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws RelayInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            WEB_URL -> Known.WEB_URL
                            POSTBACK -> Known.POSTBACK
                            else -> throw RelayInvalidDataException("Unknown Type: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws RelayInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            RelayInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): Type = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: RelayInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Type && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Button &&
                        title == other.title &&
                        type == other.type &&
                        payload == other.payload &&
                        url == other.url &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(title, type, payload, url, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Button{title=$title, type=$type, payload=$payload, url=$url, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Element &&
                    title == other.title &&
                    buttons == other.buttons &&
                    imageUrl == other.imageUrl &&
                    subtitle == other.subtitle &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(title, buttons, imageUrl, subtitle, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Element{title=$title, buttons=$buttons, imageUrl=$imageUrl, subtitle=$subtitle, additionalProperties=$additionalProperties}"
        }

        /** Template type */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val GENERIC = of("generic")

                @JvmField val BUTTON = of("button")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                GENERIC,
                BUTTON,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                GENERIC,
                BUTTON,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    GENERIC -> Value.GENERIC
                    BUTTON -> Value.BUTTON
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws RelayInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    GENERIC -> Known.GENERIC
                    BUTTON -> Known.BUTTON
                    else -> throw RelayInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws RelayInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    RelayInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Type = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: RelayInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Template &&
                elements == other.elements &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(elements, type, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Template{elements=$elements, type=$type, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessageSendParams &&
            conversationId == other.conversationId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(conversationId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "MessageSendParams{conversationId=$conversationId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
