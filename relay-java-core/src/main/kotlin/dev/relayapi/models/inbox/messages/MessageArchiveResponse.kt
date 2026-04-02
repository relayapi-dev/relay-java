// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.inbox.messages

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
import java.util.Optional

class MessageArchiveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val success: JsonField<Boolean>,
    private val error: JsonField<String>,
    private val messageId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("success") @ExcludeMissing success: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
        @JsonProperty("message_id") @ExcludeMissing messageId: JsonField<String> = JsonMissing.of(),
    ) : this(success, error, messageId, mutableMapOf())

    /**
     * Whether the action succeeded
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun success(): Boolean = success.getRequired("success")

    /**
     * Error message if failed
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun error(): Optional<String> = error.getOptional("error")

    /**
     * Message ID
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messageId(): Optional<String> = messageId.getOptional("message_id")

    /**
     * Returns the raw JSON value of [success].
     *
     * Unlike [success], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("success") @ExcludeMissing fun _success(): JsonField<Boolean> = success

    /**
     * Returns the raw JSON value of [error].
     *
     * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

    /**
     * Returns the raw JSON value of [messageId].
     *
     * Unlike [messageId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message_id") @ExcludeMissing fun _messageId(): JsonField<String> = messageId

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
         * Returns a mutable builder for constructing an instance of [MessageArchiveResponse].
         *
         * The following fields are required:
         * ```java
         * .success()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MessageArchiveResponse]. */
    class Builder internal constructor() {

        private var success: JsonField<Boolean>? = null
        private var error: JsonField<String> = JsonMissing.of()
        private var messageId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(messageArchiveResponse: MessageArchiveResponse) = apply {
            success = messageArchiveResponse.success
            error = messageArchiveResponse.error
            messageId = messageArchiveResponse.messageId
            additionalProperties = messageArchiveResponse.additionalProperties.toMutableMap()
        }

        /** Whether the action succeeded */
        fun success(success: Boolean) = success(JsonField.of(success))

        /**
         * Sets [Builder.success] to an arbitrary JSON value.
         *
         * You should usually call [Builder.success] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun success(success: JsonField<Boolean>) = apply { this.success = success }

        /** Error message if failed */
        fun error(error: String) = error(JsonField.of(error))

        /**
         * Sets [Builder.error] to an arbitrary JSON value.
         *
         * You should usually call [Builder.error] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun error(error: JsonField<String>) = apply { this.error = error }

        /** Message ID */
        fun messageId(messageId: String) = messageId(JsonField.of(messageId))

        /**
         * Sets [Builder.messageId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messageId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun messageId(messageId: JsonField<String>) = apply { this.messageId = messageId }

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
         * Returns an immutable instance of [MessageArchiveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .success()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MessageArchiveResponse =
            MessageArchiveResponse(
                checkRequired("success", success),
                error,
                messageId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MessageArchiveResponse = apply {
        if (validated) {
            return@apply
        }

        success()
        error()
        messageId()
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
        (if (success.asKnown().isPresent) 1 else 0) +
            (if (error.asKnown().isPresent) 1 else 0) +
            (if (messageId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessageArchiveResponse &&
            success == other.success &&
            error == other.error &&
            messageId == other.messageId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(success, error, messageId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MessageArchiveResponse{success=$success, error=$error, messageId=$messageId, additionalProperties=$additionalProperties}"
}
