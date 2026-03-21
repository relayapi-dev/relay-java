// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.queue

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.relayapi.core.ExcludeMissing
import dev.relayapi.core.JsonField
import dev.relayapi.core.JsonMissing
import dev.relayapi.core.JsonValue
import dev.relayapi.core.checkRequired
import dev.relayapi.errors.RelayInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class QueueGetNextSlotResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val nextSlotAt: JsonField<OffsetDateTime>,
    private val queueId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("next_slot_at")
        @ExcludeMissing
        nextSlotAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("queue_id") @ExcludeMissing queueId: JsonField<String> = JsonMissing.of(),
    ) : this(nextSlotAt, queueId, mutableMapOf())

    /**
     * Next available slot (ISO 8601)
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun nextSlotAt(): OffsetDateTime = nextSlotAt.getRequired("next_slot_at")

    /**
     * Queue schedule ID
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun queueId(): String = queueId.getRequired("queue_id")

    /**
     * Returns the raw JSON value of [nextSlotAt].
     *
     * Unlike [nextSlotAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("next_slot_at")
    @ExcludeMissing
    fun _nextSlotAt(): JsonField<OffsetDateTime> = nextSlotAt

    /**
     * Returns the raw JSON value of [queueId].
     *
     * Unlike [queueId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("queue_id") @ExcludeMissing fun _queueId(): JsonField<String> = queueId

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
         * Returns a mutable builder for constructing an instance of [QueueGetNextSlotResponse].
         *
         * The following fields are required:
         * ```java
         * .nextSlotAt()
         * .queueId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [QueueGetNextSlotResponse]. */
    class Builder internal constructor() {

        private var nextSlotAt: JsonField<OffsetDateTime>? = null
        private var queueId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(queueGetNextSlotResponse: QueueGetNextSlotResponse) = apply {
            nextSlotAt = queueGetNextSlotResponse.nextSlotAt
            queueId = queueGetNextSlotResponse.queueId
            additionalProperties = queueGetNextSlotResponse.additionalProperties.toMutableMap()
        }

        /** Next available slot (ISO 8601) */
        fun nextSlotAt(nextSlotAt: OffsetDateTime) = nextSlotAt(JsonField.of(nextSlotAt))

        /**
         * Sets [Builder.nextSlotAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextSlotAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun nextSlotAt(nextSlotAt: JsonField<OffsetDateTime>) = apply {
            this.nextSlotAt = nextSlotAt
        }

        /** Queue schedule ID */
        fun queueId(queueId: String) = queueId(JsonField.of(queueId))

        /**
         * Sets [Builder.queueId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.queueId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun queueId(queueId: JsonField<String>) = apply { this.queueId = queueId }

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
         * Returns an immutable instance of [QueueGetNextSlotResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .nextSlotAt()
         * .queueId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): QueueGetNextSlotResponse =
            QueueGetNextSlotResponse(
                checkRequired("nextSlotAt", nextSlotAt),
                checkRequired("queueId", queueId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): QueueGetNextSlotResponse = apply {
        if (validated) {
            return@apply
        }

        nextSlotAt()
        queueId()
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
        (if (nextSlotAt.asKnown().isPresent) 1 else 0) + (if (queueId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is QueueGetNextSlotResponse &&
            nextSlotAt == other.nextSlotAt &&
            queueId == other.queueId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(nextSlotAt, queueId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "QueueGetNextSlotResponse{nextSlotAt=$nextSlotAt, queueId=$queueId, additionalProperties=$additionalProperties}"
}
