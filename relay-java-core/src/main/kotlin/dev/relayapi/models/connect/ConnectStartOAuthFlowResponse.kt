// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.connect

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

class ConnectStartOAuthFlowResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val authUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("auth_url") @ExcludeMissing authUrl: JsonField<String> = JsonMissing.of()
    ) : this(authUrl, mutableMapOf())

    /**
     * URL to redirect the user for OAuth authorization
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun authUrl(): String = authUrl.getRequired("auth_url")

    /**
     * Returns the raw JSON value of [authUrl].
     *
     * Unlike [authUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("auth_url") @ExcludeMissing fun _authUrl(): JsonField<String> = authUrl

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
         * [ConnectStartOAuthFlowResponse].
         *
         * The following fields are required:
         * ```java
         * .authUrl()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConnectStartOAuthFlowResponse]. */
    class Builder internal constructor() {

        private var authUrl: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(connectStartOAuthFlowResponse: ConnectStartOAuthFlowResponse) = apply {
            authUrl = connectStartOAuthFlowResponse.authUrl
            additionalProperties = connectStartOAuthFlowResponse.additionalProperties.toMutableMap()
        }

        /** URL to redirect the user for OAuth authorization */
        fun authUrl(authUrl: String) = authUrl(JsonField.of(authUrl))

        /**
         * Sets [Builder.authUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun authUrl(authUrl: JsonField<String>) = apply { this.authUrl = authUrl }

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
         * Returns an immutable instance of [ConnectStartOAuthFlowResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .authUrl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ConnectStartOAuthFlowResponse =
            ConnectStartOAuthFlowResponse(
                checkRequired("authUrl", authUrl),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ConnectStartOAuthFlowResponse = apply {
        if (validated) {
            return@apply
        }

        authUrl()
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
    @JvmSynthetic internal fun validity(): Int = (if (authUrl.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConnectStartOAuthFlowResponse &&
            authUrl == other.authUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(authUrl, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConnectStartOAuthFlowResponse{authUrl=$authUrl, additionalProperties=$additionalProperties}"
}
