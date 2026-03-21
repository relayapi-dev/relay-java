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
import dev.relayapi.core.checkKnown
import dev.relayapi.core.checkRequired
import dev.relayapi.core.toImmutable
import dev.relayapi.errors.RelayInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class QueuePreviewResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val slots: JsonField<List<OffsetDateTime>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("slots")
        @ExcludeMissing
        slots: JsonField<List<OffsetDateTime>> = JsonMissing.of()
    ) : this(slots, mutableMapOf())

    /**
     * Upcoming slot timestamps (ISO 8601)
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun slots(): List<OffsetDateTime> = slots.getRequired("slots")

    /**
     * Returns the raw JSON value of [slots].
     *
     * Unlike [slots], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("slots") @ExcludeMissing fun _slots(): JsonField<List<OffsetDateTime>> = slots

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
         * Returns a mutable builder for constructing an instance of [QueuePreviewResponse].
         *
         * The following fields are required:
         * ```java
         * .slots()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [QueuePreviewResponse]. */
    class Builder internal constructor() {

        private var slots: JsonField<MutableList<OffsetDateTime>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(queuePreviewResponse: QueuePreviewResponse) = apply {
            slots = queuePreviewResponse.slots.map { it.toMutableList() }
            additionalProperties = queuePreviewResponse.additionalProperties.toMutableMap()
        }

        /** Upcoming slot timestamps (ISO 8601) */
        fun slots(slots: List<OffsetDateTime>) = slots(JsonField.of(slots))

        /**
         * Sets [Builder.slots] to an arbitrary JSON value.
         *
         * You should usually call [Builder.slots] with a well-typed `List<OffsetDateTime>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun slots(slots: JsonField<List<OffsetDateTime>>) = apply {
            this.slots = slots.map { it.toMutableList() }
        }

        /**
         * Adds a single [OffsetDateTime] to [slots].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSlot(slot: OffsetDateTime) = apply {
            slots =
                (slots ?: JsonField.of(mutableListOf())).also { checkKnown("slots", it).add(slot) }
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
         * Returns an immutable instance of [QueuePreviewResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .slots()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): QueuePreviewResponse =
            QueuePreviewResponse(
                checkRequired("slots", slots).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): QueuePreviewResponse = apply {
        if (validated) {
            return@apply
        }

        slots()
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
    @JvmSynthetic internal fun validity(): Int = (slots.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is QueuePreviewResponse &&
            slots == other.slots &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(slots, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "QueuePreviewResponse{slots=$slots, additionalProperties=$additionalProperties}"
}
