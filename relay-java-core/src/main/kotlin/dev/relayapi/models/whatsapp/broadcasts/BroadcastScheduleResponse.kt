// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.whatsapp.broadcasts

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

class BroadcastScheduleResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val name: JsonField<String>,
    private val recipientCount: JsonField<Double>,
    private val status: JsonField<Status>,
    private val template: JsonField<String>,
    private val failed: JsonField<Double>,
    private val scheduledAt: JsonField<OffsetDateTime>,
    private val sent: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recipient_count")
        @ExcludeMissing
        recipientCount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("template") @ExcludeMissing template: JsonField<String> = JsonMissing.of(),
        @JsonProperty("failed") @ExcludeMissing failed: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("scheduled_at")
        @ExcludeMissing
        scheduledAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("sent") @ExcludeMissing sent: JsonField<Double> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        name,
        recipientCount,
        status,
        template,
        failed,
        scheduledAt,
        sent,
        mutableMapOf(),
    )

    /**
     * Broadcast ID
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Created timestamp
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * Broadcast name
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Total recipients
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recipientCount(): Double = recipientCount.getRequired("recipient_count")

    /**
     * Broadcast status
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * Template name
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun template(): String = template.getRequired("template")

    /**
     * Failed sends
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun failed(): Optional<Double> = failed.getOptional("failed")

    /**
     * Scheduled time
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scheduledAt(): Optional<OffsetDateTime> = scheduledAt.getOptional("scheduled_at")

    /**
     * Successfully sent
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sent(): Optional<Double> = sent.getOptional("sent")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [recipientCount].
     *
     * Unlike [recipientCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("recipient_count")
    @ExcludeMissing
    fun _recipientCount(): JsonField<Double> = recipientCount

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [template].
     *
     * Unlike [template], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("template") @ExcludeMissing fun _template(): JsonField<String> = template

    /**
     * Returns the raw JSON value of [failed].
     *
     * Unlike [failed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("failed") @ExcludeMissing fun _failed(): JsonField<Double> = failed

    /**
     * Returns the raw JSON value of [scheduledAt].
     *
     * Unlike [scheduledAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scheduled_at")
    @ExcludeMissing
    fun _scheduledAt(): JsonField<OffsetDateTime> = scheduledAt

    /**
     * Returns the raw JSON value of [sent].
     *
     * Unlike [sent], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sent") @ExcludeMissing fun _sent(): JsonField<Double> = sent

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
         * Returns a mutable builder for constructing an instance of [BroadcastScheduleResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .name()
         * .recipientCount()
         * .status()
         * .template()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BroadcastScheduleResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var name: JsonField<String>? = null
        private var recipientCount: JsonField<Double>? = null
        private var status: JsonField<Status>? = null
        private var template: JsonField<String>? = null
        private var failed: JsonField<Double> = JsonMissing.of()
        private var scheduledAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var sent: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(broadcastScheduleResponse: BroadcastScheduleResponse) = apply {
            id = broadcastScheduleResponse.id
            createdAt = broadcastScheduleResponse.createdAt
            name = broadcastScheduleResponse.name
            recipientCount = broadcastScheduleResponse.recipientCount
            status = broadcastScheduleResponse.status
            template = broadcastScheduleResponse.template
            failed = broadcastScheduleResponse.failed
            scheduledAt = broadcastScheduleResponse.scheduledAt
            sent = broadcastScheduleResponse.sent
            additionalProperties = broadcastScheduleResponse.additionalProperties.toMutableMap()
        }

        /** Broadcast ID */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Created timestamp */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Broadcast name */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Total recipients */
        fun recipientCount(recipientCount: Double) = recipientCount(JsonField.of(recipientCount))

        /**
         * Sets [Builder.recipientCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recipientCount] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recipientCount(recipientCount: JsonField<Double>) = apply {
            this.recipientCount = recipientCount
        }

        /** Broadcast status */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Template name */
        fun template(template: String) = template(JsonField.of(template))

        /**
         * Sets [Builder.template] to an arbitrary JSON value.
         *
         * You should usually call [Builder.template] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun template(template: JsonField<String>) = apply { this.template = template }

        /** Failed sends */
        fun failed(failed: Double) = failed(JsonField.of(failed))

        /**
         * Sets [Builder.failed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.failed] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun failed(failed: JsonField<Double>) = apply { this.failed = failed }

        /** Scheduled time */
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

        /** Successfully sent */
        fun sent(sent: Double) = sent(JsonField.of(sent))

        /**
         * Sets [Builder.sent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sent] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sent(sent: JsonField<Double>) = apply { this.sent = sent }

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
         * Returns an immutable instance of [BroadcastScheduleResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .name()
         * .recipientCount()
         * .status()
         * .template()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BroadcastScheduleResponse =
            BroadcastScheduleResponse(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("name", name),
                checkRequired("recipientCount", recipientCount),
                checkRequired("status", status),
                checkRequired("template", template),
                failed,
                scheduledAt,
                sent,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BroadcastScheduleResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        name()
        recipientCount()
        status().validate()
        template()
        failed()
        scheduledAt()
        sent()
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
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (recipientCount.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (template.asKnown().isPresent) 1 else 0) +
            (if (failed.asKnown().isPresent) 1 else 0) +
            (if (scheduledAt.asKnown().isPresent) 1 else 0) +
            (if (sent.asKnown().isPresent) 1 else 0)

    /** Broadcast status */
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

        return other is BroadcastScheduleResponse &&
            id == other.id &&
            createdAt == other.createdAt &&
            name == other.name &&
            recipientCount == other.recipientCount &&
            status == other.status &&
            template == other.template &&
            failed == other.failed &&
            scheduledAt == other.scheduledAt &&
            sent == other.sent &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            name,
            recipientCount,
            status,
            template,
            failed,
            scheduledAt,
            sent,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BroadcastScheduleResponse{id=$id, createdAt=$createdAt, name=$name, recipientCount=$recipientCount, status=$status, template=$template, failed=$failed, scheduledAt=$scheduledAt, sent=$sent, additionalProperties=$additionalProperties}"
}
