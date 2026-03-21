// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.whatsapp.contacts

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
import java.util.Collections
import java.util.Objects

class ContactBulkOperationsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val affected: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("affected") @ExcludeMissing affected: JsonField<Double> = JsonMissing.of()
    ) : this(affected, mutableMapOf())

    /**
     * Number of contacts affected
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun affected(): Double = affected.getRequired("affected")

    /**
     * Returns the raw JSON value of [affected].
     *
     * Unlike [affected], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("affected") @ExcludeMissing fun _affected(): JsonField<Double> = affected

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
         * Returns a mutable builder for constructing an instance of
         * [ContactBulkOperationsResponse].
         *
         * The following fields are required:
         * ```java
         * .affected()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContactBulkOperationsResponse]. */
    class Builder internal constructor() {

        private var affected: JsonField<Double>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contactBulkOperationsResponse: ContactBulkOperationsResponse) = apply {
            affected = contactBulkOperationsResponse.affected
            additionalProperties = contactBulkOperationsResponse.additionalProperties.toMutableMap()
        }

        /** Number of contacts affected */
        fun affected(affected: Double) = affected(JsonField.of(affected))

        /**
         * Sets [Builder.affected] to an arbitrary JSON value.
         *
         * You should usually call [Builder.affected] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun affected(affected: JsonField<Double>) = apply { this.affected = affected }

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
         * Returns an immutable instance of [ContactBulkOperationsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .affected()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ContactBulkOperationsResponse =
            ContactBulkOperationsResponse(
                checkRequired("affected", affected),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ContactBulkOperationsResponse = apply {
        if (validated) {
            return@apply
        }

        affected()
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
    @JvmSynthetic internal fun validity(): Int = (if (affected.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContactBulkOperationsResponse &&
            affected == other.affected &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(affected, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ContactBulkOperationsResponse{affected=$affected, additionalProperties=$additionalProperties}"
}
