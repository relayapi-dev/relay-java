// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.connect.whatsapp

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

class WhatsappGetSdkConfigResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val appId: JsonField<String>,
    private val configId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("app_id") @ExcludeMissing appId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("config_id") @ExcludeMissing configId: JsonField<String> = JsonMissing.of(),
    ) : this(appId, configId, mutableMapOf())

    /**
     * Facebook App ID for WhatsApp embedded signup
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun appId(): String = appId.getRequired("app_id")

    /**
     * WhatsApp configuration ID
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun configId(): String = configId.getRequired("config_id")

    /**
     * Returns the raw JSON value of [appId].
     *
     * Unlike [appId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("app_id") @ExcludeMissing fun _appId(): JsonField<String> = appId

    /**
     * Returns the raw JSON value of [configId].
     *
     * Unlike [configId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("config_id") @ExcludeMissing fun _configId(): JsonField<String> = configId

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
         * Returns a mutable builder for constructing an instance of [WhatsappGetSdkConfigResponse].
         *
         * The following fields are required:
         * ```java
         * .appId()
         * .configId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WhatsappGetSdkConfigResponse]. */
    class Builder internal constructor() {

        private var appId: JsonField<String>? = null
        private var configId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(whatsappGetSdkConfigResponse: WhatsappGetSdkConfigResponse) = apply {
            appId = whatsappGetSdkConfigResponse.appId
            configId = whatsappGetSdkConfigResponse.configId
            additionalProperties = whatsappGetSdkConfigResponse.additionalProperties.toMutableMap()
        }

        /** Facebook App ID for WhatsApp embedded signup */
        fun appId(appId: String) = appId(JsonField.of(appId))

        /**
         * Sets [Builder.appId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.appId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun appId(appId: JsonField<String>) = apply { this.appId = appId }

        /** WhatsApp configuration ID */
        fun configId(configId: String) = configId(JsonField.of(configId))

        /**
         * Sets [Builder.configId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.configId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun configId(configId: JsonField<String>) = apply { this.configId = configId }

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
         * Returns an immutable instance of [WhatsappGetSdkConfigResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .appId()
         * .configId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WhatsappGetSdkConfigResponse =
            WhatsappGetSdkConfigResponse(
                checkRequired("appId", appId),
                checkRequired("configId", configId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): WhatsappGetSdkConfigResponse = apply {
        if (validated) {
            return@apply
        }

        appId()
        configId()
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
        (if (appId.asKnown().isPresent) 1 else 0) + (if (configId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WhatsappGetSdkConfigResponse &&
            appId == other.appId &&
            configId == other.configId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(appId, configId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WhatsappGetSdkConfigResponse{appId=$appId, configId=$configId, additionalProperties=$additionalProperties}"
}
