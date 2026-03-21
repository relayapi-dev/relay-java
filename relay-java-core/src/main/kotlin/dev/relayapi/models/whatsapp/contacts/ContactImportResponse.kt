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

class ContactImportResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val failed: JsonField<Double>,
    private val imported: JsonField<Double>,
    private val skipped: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("failed") @ExcludeMissing failed: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("imported") @ExcludeMissing imported: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("skipped") @ExcludeMissing skipped: JsonField<Double> = JsonMissing.of(),
    ) : this(failed, imported, skipped, mutableMapOf())

    /**
     * Failed count
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun failed(): Double = failed.getRequired("failed")

    /**
     * Successfully imported count
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun imported(): Double = imported.getRequired("imported")

    /**
     * Skipped (duplicate) count
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun skipped(): Double = skipped.getRequired("skipped")

    /**
     * Returns the raw JSON value of [failed].
     *
     * Unlike [failed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("failed") @ExcludeMissing fun _failed(): JsonField<Double> = failed

    /**
     * Returns the raw JSON value of [imported].
     *
     * Unlike [imported], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("imported") @ExcludeMissing fun _imported(): JsonField<Double> = imported

    /**
     * Returns the raw JSON value of [skipped].
     *
     * Unlike [skipped], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("skipped") @ExcludeMissing fun _skipped(): JsonField<Double> = skipped

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
         * Returns a mutable builder for constructing an instance of [ContactImportResponse].
         *
         * The following fields are required:
         * ```java
         * .failed()
         * .imported()
         * .skipped()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContactImportResponse]. */
    class Builder internal constructor() {

        private var failed: JsonField<Double>? = null
        private var imported: JsonField<Double>? = null
        private var skipped: JsonField<Double>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contactImportResponse: ContactImportResponse) = apply {
            failed = contactImportResponse.failed
            imported = contactImportResponse.imported
            skipped = contactImportResponse.skipped
            additionalProperties = contactImportResponse.additionalProperties.toMutableMap()
        }

        /** Failed count */
        fun failed(failed: Double) = failed(JsonField.of(failed))

        /**
         * Sets [Builder.failed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.failed] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun failed(failed: JsonField<Double>) = apply { this.failed = failed }

        /** Successfully imported count */
        fun imported(imported: Double) = imported(JsonField.of(imported))

        /**
         * Sets [Builder.imported] to an arbitrary JSON value.
         *
         * You should usually call [Builder.imported] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun imported(imported: JsonField<Double>) = apply { this.imported = imported }

        /** Skipped (duplicate) count */
        fun skipped(skipped: Double) = skipped(JsonField.of(skipped))

        /**
         * Sets [Builder.skipped] to an arbitrary JSON value.
         *
         * You should usually call [Builder.skipped] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun skipped(skipped: JsonField<Double>) = apply { this.skipped = skipped }

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
         * Returns an immutable instance of [ContactImportResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .failed()
         * .imported()
         * .skipped()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ContactImportResponse =
            ContactImportResponse(
                checkRequired("failed", failed),
                checkRequired("imported", imported),
                checkRequired("skipped", skipped),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ContactImportResponse = apply {
        if (validated) {
            return@apply
        }

        failed()
        imported()
        skipped()
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
        (if (failed.asKnown().isPresent) 1 else 0) +
            (if (imported.asKnown().isPresent) 1 else 0) +
            (if (skipped.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContactImportResponse &&
            failed == other.failed &&
            imported == other.imported &&
            skipped == other.skipped &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(failed, imported, skipped, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ContactImportResponse{failed=$failed, imported=$imported, skipped=$skipped, additionalProperties=$additionalProperties}"
}
