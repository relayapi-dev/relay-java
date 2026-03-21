// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.webhooks

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
import kotlin.jvm.optionals.getOrNull

class WebhookSendTestResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val responseTimeMs: JsonField<Long>,
    private val statusCode: JsonField<Long>,
    private val success: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("response_time_ms")
        @ExcludeMissing
        responseTimeMs: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("status_code") @ExcludeMissing statusCode: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("success") @ExcludeMissing success: JsonField<Boolean> = JsonMissing.of(),
    ) : this(responseTimeMs, statusCode, success, mutableMapOf())

    /**
     * Response time in milliseconds
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun responseTimeMs(): Optional<Long> = responseTimeMs.getOptional("response_time_ms")

    /**
     * HTTP status code from the test delivery
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun statusCode(): Optional<Long> = statusCode.getOptional("status_code")

    /**
     * Whether the test delivery succeeded
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun success(): Boolean = success.getRequired("success")

    /**
     * Returns the raw JSON value of [responseTimeMs].
     *
     * Unlike [responseTimeMs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("response_time_ms")
    @ExcludeMissing
    fun _responseTimeMs(): JsonField<Long> = responseTimeMs

    /**
     * Returns the raw JSON value of [statusCode].
     *
     * Unlike [statusCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status_code") @ExcludeMissing fun _statusCode(): JsonField<Long> = statusCode

    /**
     * Returns the raw JSON value of [success].
     *
     * Unlike [success], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("success") @ExcludeMissing fun _success(): JsonField<Boolean> = success

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
         * Returns a mutable builder for constructing an instance of [WebhookSendTestResponse].
         *
         * The following fields are required:
         * ```java
         * .responseTimeMs()
         * .statusCode()
         * .success()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WebhookSendTestResponse]. */
    class Builder internal constructor() {

        private var responseTimeMs: JsonField<Long>? = null
        private var statusCode: JsonField<Long>? = null
        private var success: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(webhookSendTestResponse: WebhookSendTestResponse) = apply {
            responseTimeMs = webhookSendTestResponse.responseTimeMs
            statusCode = webhookSendTestResponse.statusCode
            success = webhookSendTestResponse.success
            additionalProperties = webhookSendTestResponse.additionalProperties.toMutableMap()
        }

        /** Response time in milliseconds */
        fun responseTimeMs(responseTimeMs: Long?) =
            responseTimeMs(JsonField.ofNullable(responseTimeMs))

        /**
         * Alias for [Builder.responseTimeMs].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun responseTimeMs(responseTimeMs: Long) = responseTimeMs(responseTimeMs as Long?)

        /** Alias for calling [Builder.responseTimeMs] with `responseTimeMs.orElse(null)`. */
        fun responseTimeMs(responseTimeMs: Optional<Long>) =
            responseTimeMs(responseTimeMs.getOrNull())

        /**
         * Sets [Builder.responseTimeMs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.responseTimeMs] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun responseTimeMs(responseTimeMs: JsonField<Long>) = apply {
            this.responseTimeMs = responseTimeMs
        }

        /** HTTP status code from the test delivery */
        fun statusCode(statusCode: Long?) = statusCode(JsonField.ofNullable(statusCode))

        /**
         * Alias for [Builder.statusCode].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun statusCode(statusCode: Long) = statusCode(statusCode as Long?)

        /** Alias for calling [Builder.statusCode] with `statusCode.orElse(null)`. */
        fun statusCode(statusCode: Optional<Long>) = statusCode(statusCode.getOrNull())

        /**
         * Sets [Builder.statusCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statusCode] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun statusCode(statusCode: JsonField<Long>) = apply { this.statusCode = statusCode }

        /** Whether the test delivery succeeded */
        fun success(success: Boolean) = success(JsonField.of(success))

        /**
         * Sets [Builder.success] to an arbitrary JSON value.
         *
         * You should usually call [Builder.success] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun success(success: JsonField<Boolean>) = apply { this.success = success }

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
         * Returns an immutable instance of [WebhookSendTestResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .responseTimeMs()
         * .statusCode()
         * .success()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WebhookSendTestResponse =
            WebhookSendTestResponse(
                checkRequired("responseTimeMs", responseTimeMs),
                checkRequired("statusCode", statusCode),
                checkRequired("success", success),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): WebhookSendTestResponse = apply {
        if (validated) {
            return@apply
        }

        responseTimeMs()
        statusCode()
        success()
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
        (if (responseTimeMs.asKnown().isPresent) 1 else 0) +
            (if (statusCode.asKnown().isPresent) 1 else 0) +
            (if (success.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WebhookSendTestResponse &&
            responseTimeMs == other.responseTimeMs &&
            statusCode == other.statusCode &&
            success == other.success &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(responseTimeMs, statusCode, success, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WebhookSendTestResponse{responseTimeMs=$responseTimeMs, statusCode=$statusCode, success=$success, additionalProperties=$additionalProperties}"
}
