// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.connect.telegram

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

class TelegramInitiateConnectionResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val botUsername: JsonField<String>,
    private val code: JsonField<String>,
    private val expiresAt: JsonField<OffsetDateTime>,
    private val expiresIn: JsonField<Long>,
    private val instructions: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("bot_username")
        @ExcludeMissing
        botUsername: JsonField<String> = JsonMissing.of(),
        @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expires_at")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("expires_in") @ExcludeMissing expiresIn: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("instructions")
        @ExcludeMissing
        instructions: JsonField<List<String>> = JsonMissing.of(),
    ) : this(botUsername, code, expiresAt, expiresIn, instructions, mutableMapOf())

    /**
     * Telegram bot username to message
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun botUsername(): String = botUsername.getRequired("bot_username")

    /**
     * 6-character access code
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun code(): String = code.getRequired("code")

    /**
     * ISO 8601 expiry timestamp
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expiresAt(): OffsetDateTime = expiresAt.getRequired("expires_at")

    /**
     * Seconds until code expires
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expiresIn(): Long = expiresIn.getRequired("expires_in")

    /**
     * Step-by-step instructions for the user
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun instructions(): List<String> = instructions.getRequired("instructions")

    /**
     * Returns the raw JSON value of [botUsername].
     *
     * Unlike [botUsername], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bot_username")
    @ExcludeMissing
    fun _botUsername(): JsonField<String> = botUsername

    /**
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires_at")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

    /**
     * Returns the raw JSON value of [expiresIn].
     *
     * Unlike [expiresIn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires_in") @ExcludeMissing fun _expiresIn(): JsonField<Long> = expiresIn

    /**
     * Returns the raw JSON value of [instructions].
     *
     * Unlike [instructions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instructions")
    @ExcludeMissing
    fun _instructions(): JsonField<List<String>> = instructions

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
         * [TelegramInitiateConnectionResponse].
         *
         * The following fields are required:
         * ```java
         * .botUsername()
         * .code()
         * .expiresAt()
         * .expiresIn()
         * .instructions()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TelegramInitiateConnectionResponse]. */
    class Builder internal constructor() {

        private var botUsername: JsonField<String>? = null
        private var code: JsonField<String>? = null
        private var expiresAt: JsonField<OffsetDateTime>? = null
        private var expiresIn: JsonField<Long>? = null
        private var instructions: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(telegramInitiateConnectionResponse: TelegramInitiateConnectionResponse) =
            apply {
                botUsername = telegramInitiateConnectionResponse.botUsername
                code = telegramInitiateConnectionResponse.code
                expiresAt = telegramInitiateConnectionResponse.expiresAt
                expiresIn = telegramInitiateConnectionResponse.expiresIn
                instructions =
                    telegramInitiateConnectionResponse.instructions.map { it.toMutableList() }
                additionalProperties =
                    telegramInitiateConnectionResponse.additionalProperties.toMutableMap()
            }

        /** Telegram bot username to message */
        fun botUsername(botUsername: String) = botUsername(JsonField.of(botUsername))

        /**
         * Sets [Builder.botUsername] to an arbitrary JSON value.
         *
         * You should usually call [Builder.botUsername] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun botUsername(botUsername: JsonField<String>) = apply { this.botUsername = botUsername }

        /** 6-character access code */
        fun code(code: String) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<String>) = apply { this.code = code }

        /** ISO 8601 expiry timestamp */
        fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        /** Seconds until code expires */
        fun expiresIn(expiresIn: Long) = expiresIn(JsonField.of(expiresIn))

        /**
         * Sets [Builder.expiresIn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresIn] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun expiresIn(expiresIn: JsonField<Long>) = apply { this.expiresIn = expiresIn }

        /** Step-by-step instructions for the user */
        fun instructions(instructions: List<String>) = instructions(JsonField.of(instructions))

        /**
         * Sets [Builder.instructions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instructions] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun instructions(instructions: JsonField<List<String>>) = apply {
            this.instructions = instructions.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [instructions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInstruction(instruction: String) = apply {
            instructions =
                (instructions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("instructions", it).add(instruction)
                }
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
         * Returns an immutable instance of [TelegramInitiateConnectionResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .botUsername()
         * .code()
         * .expiresAt()
         * .expiresIn()
         * .instructions()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TelegramInitiateConnectionResponse =
            TelegramInitiateConnectionResponse(
                checkRequired("botUsername", botUsername),
                checkRequired("code", code),
                checkRequired("expiresAt", expiresAt),
                checkRequired("expiresIn", expiresIn),
                checkRequired("instructions", instructions).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TelegramInitiateConnectionResponse = apply {
        if (validated) {
            return@apply
        }

        botUsername()
        code()
        expiresAt()
        expiresIn()
        instructions()
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
        (if (botUsername.asKnown().isPresent) 1 else 0) +
            (if (code.asKnown().isPresent) 1 else 0) +
            (if (expiresAt.asKnown().isPresent) 1 else 0) +
            (if (expiresIn.asKnown().isPresent) 1 else 0) +
            (instructions.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TelegramInitiateConnectionResponse &&
            botUsername == other.botUsername &&
            code == other.code &&
            expiresAt == other.expiresAt &&
            expiresIn == other.expiresIn &&
            instructions == other.instructions &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(botUsername, code, expiresAt, expiresIn, instructions, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TelegramInitiateConnectionResponse{botUsername=$botUsername, code=$code, expiresAt=$expiresAt, expiresIn=$expiresIn, instructions=$instructions, additionalProperties=$additionalProperties}"
}
