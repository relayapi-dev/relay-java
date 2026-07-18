// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.whatsapp

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.relayapi.core.Enum
import dev.relayapi.core.ExcludeMissing
import dev.relayapi.core.JsonField
import dev.relayapi.core.JsonMissing
import dev.relayapi.core.JsonValue
import dev.relayapi.core.checkRequired
import dev.relayapi.errors.RelayInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class WhatsappBulkSendResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val accountId: JsonField<String>,
    private val completedAt: JsonField<OffsetDateTime>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val description: JsonField<String>,
    private val failedCount: JsonField<Long>,
    private val messageText: JsonField<String>,
    private val name: JsonField<String>,
    private val platform: JsonField<String>,
    private val recipientCount: JsonField<Long>,
    private val scheduledAt: JsonField<OffsetDateTime>,
    private val sentCount: JsonField<Long>,
    private val status: JsonField<Status>,
    private val templateLanguage: JsonField<String>,
    private val templateName: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_id") @ExcludeMissing accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("completed_at")
        @ExcludeMissing
        completedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("failed_count")
        @ExcludeMissing
        failedCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("message_text")
        @ExcludeMissing
        messageText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("platform") @ExcludeMissing platform: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recipient_count")
        @ExcludeMissing
        recipientCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("scheduled_at")
        @ExcludeMissing
        scheduledAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("sent_count") @ExcludeMissing sentCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("template_language")
        @ExcludeMissing
        templateLanguage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("template_name")
        @ExcludeMissing
        templateName: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        accountId,
        completedAt,
        createdAt,
        description,
        failedCount,
        messageText,
        name,
        platform,
        recipientCount,
        scheduledAt,
        sentCount,
        status,
        templateLanguage,
        templateName,
        mutableMapOf(),
    )

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): String = accountId.getRequired("account_id")

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completedAt(): Optional<OffsetDateTime> = completedAt.getOptional("completed_at")

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun failedCount(): Long = failedCount.getRequired("failed_count")

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messageText(): Optional<String> = messageText.getOptional("message_text")

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun platform(): String = platform.getRequired("platform")

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recipientCount(): Long = recipientCount.getRequired("recipient_count")

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scheduledAt(): Optional<OffsetDateTime> = scheduledAt.getOptional("scheduled_at")

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sentCount(): Long = sentCount.getRequired("sent_count")

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun templateLanguage(): Optional<String> = templateLanguage.getOptional("template_language")

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun templateName(): Optional<String> = templateName.getOptional("template_name")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /**
     * Returns the raw JSON value of [completedAt].
     *
     * Unlike [completedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("completed_at")
    @ExcludeMissing
    fun _completedAt(): JsonField<OffsetDateTime> = completedAt

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [failedCount].
     *
     * Unlike [failedCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("failed_count") @ExcludeMissing fun _failedCount(): JsonField<Long> = failedCount

    /**
     * Returns the raw JSON value of [messageText].
     *
     * Unlike [messageText], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message_text")
    @ExcludeMissing
    fun _messageText(): JsonField<String> = messageText

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [platform].
     *
     * Unlike [platform], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("platform") @ExcludeMissing fun _platform(): JsonField<String> = platform

    /**
     * Returns the raw JSON value of [recipientCount].
     *
     * Unlike [recipientCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("recipient_count")
    @ExcludeMissing
    fun _recipientCount(): JsonField<Long> = recipientCount

    /**
     * Returns the raw JSON value of [scheduledAt].
     *
     * Unlike [scheduledAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scheduled_at")
    @ExcludeMissing
    fun _scheduledAt(): JsonField<OffsetDateTime> = scheduledAt

    /**
     * Returns the raw JSON value of [sentCount].
     *
     * Unlike [sentCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sent_count") @ExcludeMissing fun _sentCount(): JsonField<Long> = sentCount

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [templateLanguage].
     *
     * Unlike [templateLanguage], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("template_language")
    @ExcludeMissing
    fun _templateLanguage(): JsonField<String> = templateLanguage

    /**
     * Returns the raw JSON value of [templateName].
     *
     * Unlike [templateName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("template_name")
    @ExcludeMissing
    fun _templateName(): JsonField<String> = templateName

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
         * Returns a mutable builder for constructing an instance of [WhatsappBulkSendResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountId()
         * .completedAt()
         * .createdAt()
         * .description()
         * .failedCount()
         * .messageText()
         * .name()
         * .platform()
         * .recipientCount()
         * .scheduledAt()
         * .sentCount()
         * .status()
         * .templateLanguage()
         * .templateName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WhatsappBulkSendResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accountId: JsonField<String>? = null
        private var completedAt: JsonField<OffsetDateTime>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var description: JsonField<String>? = null
        private var failedCount: JsonField<Long>? = null
        private var messageText: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var platform: JsonField<String>? = null
        private var recipientCount: JsonField<Long>? = null
        private var scheduledAt: JsonField<OffsetDateTime>? = null
        private var sentCount: JsonField<Long>? = null
        private var status: JsonField<Status>? = null
        private var templateLanguage: JsonField<String>? = null
        private var templateName: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(whatsappBulkSendResponse: WhatsappBulkSendResponse) = apply {
            id = whatsappBulkSendResponse.id
            accountId = whatsappBulkSendResponse.accountId
            completedAt = whatsappBulkSendResponse.completedAt
            createdAt = whatsappBulkSendResponse.createdAt
            description = whatsappBulkSendResponse.description
            failedCount = whatsappBulkSendResponse.failedCount
            messageText = whatsappBulkSendResponse.messageText
            name = whatsappBulkSendResponse.name
            platform = whatsappBulkSendResponse.platform
            recipientCount = whatsappBulkSendResponse.recipientCount
            scheduledAt = whatsappBulkSendResponse.scheduledAt
            sentCount = whatsappBulkSendResponse.sentCount
            status = whatsappBulkSendResponse.status
            templateLanguage = whatsappBulkSendResponse.templateLanguage
            templateName = whatsappBulkSendResponse.templateName
            additionalProperties = whatsappBulkSendResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        fun completedAt(completedAt: OffsetDateTime?) =
            completedAt(JsonField.ofNullable(completedAt))

        /** Alias for calling [Builder.completedAt] with `completedAt.orElse(null)`. */
        fun completedAt(completedAt: Optional<OffsetDateTime>) =
            completedAt(completedAt.getOrNull())

        /**
         * Sets [Builder.completedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.completedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun completedAt(completedAt: JsonField<OffsetDateTime>) = apply {
            this.completedAt = completedAt
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun failedCount(failedCount: Long) = failedCount(JsonField.of(failedCount))

        /**
         * Sets [Builder.failedCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.failedCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun failedCount(failedCount: JsonField<Long>) = apply { this.failedCount = failedCount }

        fun messageText(messageText: String?) = messageText(JsonField.ofNullable(messageText))

        /** Alias for calling [Builder.messageText] with `messageText.orElse(null)`. */
        fun messageText(messageText: Optional<String>) = messageText(messageText.getOrNull())

        /**
         * Sets [Builder.messageText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messageText] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun messageText(messageText: JsonField<String>) = apply { this.messageText = messageText }

        fun name(name: String?) = name(JsonField.ofNullable(name))

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun platform(platform: String) = platform(JsonField.of(platform))

        /**
         * Sets [Builder.platform] to an arbitrary JSON value.
         *
         * You should usually call [Builder.platform] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun platform(platform: JsonField<String>) = apply { this.platform = platform }

        fun recipientCount(recipientCount: Long) = recipientCount(JsonField.of(recipientCount))

        /**
         * Sets [Builder.recipientCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recipientCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recipientCount(recipientCount: JsonField<Long>) = apply {
            this.recipientCount = recipientCount
        }

        fun scheduledAt(scheduledAt: OffsetDateTime?) =
            scheduledAt(JsonField.ofNullable(scheduledAt))

        /** Alias for calling [Builder.scheduledAt] with `scheduledAt.orElse(null)`. */
        fun scheduledAt(scheduledAt: Optional<OffsetDateTime>) =
            scheduledAt(scheduledAt.getOrNull())

        /**
         * Sets [Builder.scheduledAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scheduledAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun scheduledAt(scheduledAt: JsonField<OffsetDateTime>) = apply {
            this.scheduledAt = scheduledAt
        }

        fun sentCount(sentCount: Long) = sentCount(JsonField.of(sentCount))

        /**
         * Sets [Builder.sentCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sentCount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sentCount(sentCount: JsonField<Long>) = apply { this.sentCount = sentCount }

        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun templateLanguage(templateLanguage: String?) =
            templateLanguage(JsonField.ofNullable(templateLanguage))

        /** Alias for calling [Builder.templateLanguage] with `templateLanguage.orElse(null)`. */
        fun templateLanguage(templateLanguage: Optional<String>) =
            templateLanguage(templateLanguage.getOrNull())

        /**
         * Sets [Builder.templateLanguage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.templateLanguage] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun templateLanguage(templateLanguage: JsonField<String>) = apply {
            this.templateLanguage = templateLanguage
        }

        fun templateName(templateName: String?) = templateName(JsonField.ofNullable(templateName))

        /** Alias for calling [Builder.templateName] with `templateName.orElse(null)`. */
        fun templateName(templateName: Optional<String>) = templateName(templateName.getOrNull())

        /**
         * Sets [Builder.templateName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.templateName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun templateName(templateName: JsonField<String>) = apply {
            this.templateName = templateName
        }

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
         * Returns an immutable instance of [WhatsappBulkSendResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountId()
         * .completedAt()
         * .createdAt()
         * .description()
         * .failedCount()
         * .messageText()
         * .name()
         * .platform()
         * .recipientCount()
         * .scheduledAt()
         * .sentCount()
         * .status()
         * .templateLanguage()
         * .templateName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WhatsappBulkSendResponse =
            WhatsappBulkSendResponse(
                checkRequired("id", id),
                checkRequired("accountId", accountId),
                checkRequired("completedAt", completedAt),
                checkRequired("createdAt", createdAt),
                checkRequired("description", description),
                checkRequired("failedCount", failedCount),
                checkRequired("messageText", messageText),
                checkRequired("name", name),
                checkRequired("platform", platform),
                checkRequired("recipientCount", recipientCount),
                checkRequired("scheduledAt", scheduledAt),
                checkRequired("sentCount", sentCount),
                checkRequired("status", status),
                checkRequired("templateLanguage", templateLanguage),
                checkRequired("templateName", templateName),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws RelayInvalidDataException if any value type in this object doesn't match its expected
     *   type.
     */
    fun validate(): WhatsappBulkSendResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        accountId()
        completedAt()
        createdAt()
        description()
        failedCount()
        messageText()
        name()
        platform()
        recipientCount()
        scheduledAt()
        sentCount()
        status().validate()
        templateLanguage()
        templateName()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (accountId.asKnown().isPresent) 1 else 0) +
            (if (completedAt.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (failedCount.asKnown().isPresent) 1 else 0) +
            (if (messageText.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (platform.asKnown().isPresent) 1 else 0) +
            (if (recipientCount.asKnown().isPresent) 1 else 0) +
            (if (scheduledAt.asKnown().isPresent) 1 else 0) +
            (if (sentCount.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (templateLanguage.asKnown().isPresent) 1 else 0) +
            (if (templateName.asKnown().isPresent) 1 else 0)

    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val DRAFT = of("draft")

            @JvmField val SCHEDULED = of("scheduled")

            @JvmField val SENDING = of("sending")

            @JvmField val SENT = of("sent")

            @JvmField val PARTIALLY_FAILED = of("partially_failed")

            @JvmField val FAILED = of("failed")

            @JvmField val CANCELLED = of("cancelled")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            DRAFT,
            SCHEDULED,
            SENDING,
            SENT,
            PARTIALLY_FAILED,
            FAILED,
            CANCELLED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DRAFT,
            SCHEDULED,
            SENDING,
            SENT,
            PARTIALLY_FAILED,
            FAILED,
            CANCELLED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                DRAFT -> Value.DRAFT
                SCHEDULED -> Value.SCHEDULED
                SENDING -> Value.SENDING
                SENT -> Value.SENT
                PARTIALLY_FAILED -> Value.PARTIALLY_FAILED
                FAILED -> Value.FAILED
                CANCELLED -> Value.CANCELLED
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
                DRAFT -> Known.DRAFT
                SCHEDULED -> Known.SCHEDULED
                SENDING -> Known.SENDING
                SENT -> Known.SENT
                PARTIALLY_FAILED -> Known.PARTIALLY_FAILED
                FAILED -> Known.FAILED
                CANCELLED -> Known.CANCELLED
                else -> throw RelayInvalidDataException("Unknown Status: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws RelayInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WhatsappBulkSendResponse &&
            id == other.id &&
            accountId == other.accountId &&
            completedAt == other.completedAt &&
            createdAt == other.createdAt &&
            description == other.description &&
            failedCount == other.failedCount &&
            messageText == other.messageText &&
            name == other.name &&
            platform == other.platform &&
            recipientCount == other.recipientCount &&
            scheduledAt == other.scheduledAt &&
            sentCount == other.sentCount &&
            status == other.status &&
            templateLanguage == other.templateLanguage &&
            templateName == other.templateName &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            accountId,
            completedAt,
            createdAt,
            description,
            failedCount,
            messageText,
            name,
            platform,
            recipientCount,
            scheduledAt,
            sentCount,
            status,
            templateLanguage,
            templateName,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WhatsappBulkSendResponse{id=$id, accountId=$accountId, completedAt=$completedAt, createdAt=$createdAt, description=$description, failedCount=$failedCount, messageText=$messageText, name=$name, platform=$platform, recipientCount=$recipientCount, scheduledAt=$scheduledAt, sentCount=$sentCount, status=$status, templateLanguage=$templateLanguage, templateName=$templateName, additionalProperties=$additionalProperties}"
}
