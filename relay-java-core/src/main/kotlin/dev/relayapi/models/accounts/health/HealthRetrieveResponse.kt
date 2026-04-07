// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.accounts.health

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class HealthRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val avatarUrl: JsonField<String>,
    private val displayName: JsonField<String>,
    private val healthy: JsonField<Boolean>,
    private val platform: JsonField<String>,
    private val scopes: JsonField<List<String>>,
    private val tokenExpiresAt: JsonField<String>,
    private val username: JsonField<String>,
    private val error: JsonField<Error>,
    private val sync: JsonField<Sync>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("avatar_url") @ExcludeMissing avatarUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("display_name")
        @ExcludeMissing
        displayName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("healthy") @ExcludeMissing healthy: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("platform") @ExcludeMissing platform: JsonField<String> = JsonMissing.of(),
        @JsonProperty("scopes") @ExcludeMissing scopes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("token_expires_at")
        @ExcludeMissing
        tokenExpiresAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("username") @ExcludeMissing username: JsonField<String> = JsonMissing.of(),
        @JsonProperty("error") @ExcludeMissing error: JsonField<Error> = JsonMissing.of(),
        @JsonProperty("sync") @ExcludeMissing sync: JsonField<Sync> = JsonMissing.of(),
    ) : this(
        id,
        avatarUrl,
        displayName,
        healthy,
        platform,
        scopes,
        tokenExpiresAt,
        username,
        error,
        sync,
        mutableMapOf(),
    )

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun avatarUrl(): Optional<String> = avatarUrl.getOptional("avatar_url")

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun displayName(): Optional<String> = displayName.getOptional("display_name")

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun healthy(): Boolean = healthy.getRequired("healthy")

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun platform(): String = platform.getRequired("platform")

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scopes(): List<String> = scopes.getRequired("scopes")

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tokenExpiresAt(): Optional<String> = tokenExpiresAt.getOptional("token_expires_at")

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun username(): Optional<String> = username.getOptional("username")

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun error(): Optional<Error> = error.getOptional("error")

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sync(): Optional<Sync> = sync.getOptional("sync")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [avatarUrl].
     *
     * Unlike [avatarUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("avatar_url") @ExcludeMissing fun _avatarUrl(): JsonField<String> = avatarUrl

    /**
     * Returns the raw JSON value of [displayName].
     *
     * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("display_name")
    @ExcludeMissing
    fun _displayName(): JsonField<String> = displayName

    /**
     * Returns the raw JSON value of [healthy].
     *
     * Unlike [healthy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("healthy") @ExcludeMissing fun _healthy(): JsonField<Boolean> = healthy

    /**
     * Returns the raw JSON value of [platform].
     *
     * Unlike [platform], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("platform") @ExcludeMissing fun _platform(): JsonField<String> = platform

    /**
     * Returns the raw JSON value of [scopes].
     *
     * Unlike [scopes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scopes") @ExcludeMissing fun _scopes(): JsonField<List<String>> = scopes

    /**
     * Returns the raw JSON value of [tokenExpiresAt].
     *
     * Unlike [tokenExpiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token_expires_at")
    @ExcludeMissing
    fun _tokenExpiresAt(): JsonField<String> = tokenExpiresAt

    /**
     * Returns the raw JSON value of [username].
     *
     * Unlike [username], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("username") @ExcludeMissing fun _username(): JsonField<String> = username

    /**
     * Returns the raw JSON value of [error].
     *
     * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<Error> = error

    /**
     * Returns the raw JSON value of [sync].
     *
     * Unlike [sync], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sync") @ExcludeMissing fun _sync(): JsonField<Sync> = sync

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
         * Returns a mutable builder for constructing an instance of [HealthRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .avatarUrl()
         * .displayName()
         * .healthy()
         * .platform()
         * .scopes()
         * .tokenExpiresAt()
         * .username()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [HealthRetrieveResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var avatarUrl: JsonField<String>? = null
        private var displayName: JsonField<String>? = null
        private var healthy: JsonField<Boolean>? = null
        private var platform: JsonField<String>? = null
        private var scopes: JsonField<MutableList<String>>? = null
        private var tokenExpiresAt: JsonField<String>? = null
        private var username: JsonField<String>? = null
        private var error: JsonField<Error> = JsonMissing.of()
        private var sync: JsonField<Sync> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(healthRetrieveResponse: HealthRetrieveResponse) = apply {
            id = healthRetrieveResponse.id
            avatarUrl = healthRetrieveResponse.avatarUrl
            displayName = healthRetrieveResponse.displayName
            healthy = healthRetrieveResponse.healthy
            platform = healthRetrieveResponse.platform
            scopes = healthRetrieveResponse.scopes.map { it.toMutableList() }
            tokenExpiresAt = healthRetrieveResponse.tokenExpiresAt
            username = healthRetrieveResponse.username
            error = healthRetrieveResponse.error
            sync = healthRetrieveResponse.sync
            additionalProperties = healthRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun avatarUrl(avatarUrl: String?) = avatarUrl(JsonField.ofNullable(avatarUrl))

        /** Alias for calling [Builder.avatarUrl] with `avatarUrl.orElse(null)`. */
        fun avatarUrl(avatarUrl: Optional<String>) = avatarUrl(avatarUrl.getOrNull())

        /**
         * Sets [Builder.avatarUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avatarUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun avatarUrl(avatarUrl: JsonField<String>) = apply { this.avatarUrl = avatarUrl }

        fun displayName(displayName: String?) = displayName(JsonField.ofNullable(displayName))

        /** Alias for calling [Builder.displayName] with `displayName.orElse(null)`. */
        fun displayName(displayName: Optional<String>) = displayName(displayName.getOrNull())

        /**
         * Sets [Builder.displayName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayName(displayName: JsonField<String>) = apply { this.displayName = displayName }

        fun healthy(healthy: Boolean) = healthy(JsonField.of(healthy))

        /**
         * Sets [Builder.healthy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.healthy] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun healthy(healthy: JsonField<Boolean>) = apply { this.healthy = healthy }

        fun platform(platform: String) = platform(JsonField.of(platform))

        /**
         * Sets [Builder.platform] to an arbitrary JSON value.
         *
         * You should usually call [Builder.platform] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun platform(platform: JsonField<String>) = apply { this.platform = platform }

        fun scopes(scopes: List<String>) = scopes(JsonField.of(scopes))

        /**
         * Sets [Builder.scopes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scopes] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun scopes(scopes: JsonField<List<String>>) = apply {
            this.scopes = scopes.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [scopes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addScope(scope: String) = apply {
            scopes =
                (scopes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("scopes", it).add(scope)
                }
        }

        fun tokenExpiresAt(tokenExpiresAt: String?) =
            tokenExpiresAt(JsonField.ofNullable(tokenExpiresAt))

        /** Alias for calling [Builder.tokenExpiresAt] with `tokenExpiresAt.orElse(null)`. */
        fun tokenExpiresAt(tokenExpiresAt: Optional<String>) =
            tokenExpiresAt(tokenExpiresAt.getOrNull())

        /**
         * Sets [Builder.tokenExpiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokenExpiresAt] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tokenExpiresAt(tokenExpiresAt: JsonField<String>) = apply {
            this.tokenExpiresAt = tokenExpiresAt
        }

        fun username(username: String?) = username(JsonField.ofNullable(username))

        /** Alias for calling [Builder.username] with `username.orElse(null)`. */
        fun username(username: Optional<String>) = username(username.getOrNull())

        /**
         * Sets [Builder.username] to an arbitrary JSON value.
         *
         * You should usually call [Builder.username] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun username(username: JsonField<String>) = apply { this.username = username }

        fun error(error: Error) = error(JsonField.of(error))

        /**
         * Sets [Builder.error] to an arbitrary JSON value.
         *
         * You should usually call [Builder.error] with a well-typed [Error] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun error(error: JsonField<Error>) = apply { this.error = error }

        fun sync(sync: Sync?) = sync(JsonField.ofNullable(sync))

        /** Alias for calling [Builder.sync] with `sync.orElse(null)`. */
        fun sync(sync: Optional<Sync>) = sync(sync.getOrNull())

        /**
         * Sets [Builder.sync] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sync] with a well-typed [Sync] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sync(sync: JsonField<Sync>) = apply { this.sync = sync }

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
         * Returns an immutable instance of [HealthRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .avatarUrl()
         * .displayName()
         * .healthy()
         * .platform()
         * .scopes()
         * .tokenExpiresAt()
         * .username()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): HealthRetrieveResponse =
            HealthRetrieveResponse(
                checkRequired("id", id),
                checkRequired("avatarUrl", avatarUrl),
                checkRequired("displayName", displayName),
                checkRequired("healthy", healthy),
                checkRequired("platform", platform),
                checkRequired("scopes", scopes).map { it.toImmutable() },
                checkRequired("tokenExpiresAt", tokenExpiresAt),
                checkRequired("username", username),
                error,
                sync,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): HealthRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        avatarUrl()
        displayName()
        healthy()
        platform()
        scopes()
        tokenExpiresAt()
        username()
        error().ifPresent { it.validate() }
        sync().ifPresent { it.validate() }
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
            (if (avatarUrl.asKnown().isPresent) 1 else 0) +
            (if (displayName.asKnown().isPresent) 1 else 0) +
            (if (healthy.asKnown().isPresent) 1 else 0) +
            (if (platform.asKnown().isPresent) 1 else 0) +
            (scopes.asKnown().getOrNull()?.size ?: 0) +
            (if (tokenExpiresAt.asKnown().isPresent) 1 else 0) +
            (if (username.asKnown().isPresent) 1 else 0) +
            (error.asKnown().getOrNull()?.validity() ?: 0) +
            (sync.asKnown().getOrNull()?.validity() ?: 0)

    class Error
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val code: JsonField<String>,
        private val message: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
            @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        ) : this(code, message, mutableMapOf())

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun code(): String = code.getRequired("code")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun message(): String = message.getRequired("message")

        /**
         * Returns the raw JSON value of [code].
         *
         * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

        /**
         * Returns the raw JSON value of [message].
         *
         * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

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
             * Returns a mutable builder for constructing an instance of [Error].
             *
             * The following fields are required:
             * ```java
             * .code()
             * .message()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Error]. */
        class Builder internal constructor() {

            private var code: JsonField<String>? = null
            private var message: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(error: Error) = apply {
                code = error.code
                message = error.message
                additionalProperties = error.additionalProperties.toMutableMap()
            }

            fun code(code: String) = code(JsonField.of(code))

            /**
             * Sets [Builder.code] to an arbitrary JSON value.
             *
             * You should usually call [Builder.code] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun code(code: JsonField<String>) = apply { this.code = code }

            fun message(message: String) = message(JsonField.of(message))

            /**
             * Sets [Builder.message] to an arbitrary JSON value.
             *
             * You should usually call [Builder.message] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun message(message: JsonField<String>) = apply { this.message = message }

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
             * Returns an immutable instance of [Error].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .code()
             * .message()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Error =
                Error(
                    checkRequired("code", code),
                    checkRequired("message", message),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Error = apply {
            if (validated) {
                return@apply
            }

            code()
            message()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (code.asKnown().isPresent) 1 else 0) + (if (message.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Error &&
                code == other.code &&
                message == other.message &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(code, message, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Error{code=$code, message=$message, additionalProperties=$additionalProperties}"
    }

    class Sync
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val consecutiveErrors: JsonField<Double>,
        private val enabled: JsonField<Boolean>,
        private val lastError: JsonField<String>,
        private val lastErrorAt: JsonField<String>,
        private val lastSyncAt: JsonField<String>,
        private val nextSyncAt: JsonField<String>,
        private val rateLimitResetAt: JsonField<String>,
        private val totalPostsSynced: JsonField<Double>,
        private val totalSyncRuns: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("consecutive_errors")
            @ExcludeMissing
            consecutiveErrors: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("enabled") @ExcludeMissing enabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("last_error")
            @ExcludeMissing
            lastError: JsonField<String> = JsonMissing.of(),
            @JsonProperty("last_error_at")
            @ExcludeMissing
            lastErrorAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("last_sync_at")
            @ExcludeMissing
            lastSyncAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("next_sync_at")
            @ExcludeMissing
            nextSyncAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rate_limit_reset_at")
            @ExcludeMissing
            rateLimitResetAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("total_posts_synced")
            @ExcludeMissing
            totalPostsSynced: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("total_sync_runs")
            @ExcludeMissing
            totalSyncRuns: JsonField<Double> = JsonMissing.of(),
        ) : this(
            consecutiveErrors,
            enabled,
            lastError,
            lastErrorAt,
            lastSyncAt,
            nextSyncAt,
            rateLimitResetAt,
            totalPostsSynced,
            totalSyncRuns,
            mutableMapOf(),
        )

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun consecutiveErrors(): Double = consecutiveErrors.getRequired("consecutive_errors")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun enabled(): Boolean = enabled.getRequired("enabled")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastError(): Optional<String> = lastError.getOptional("last_error")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastErrorAt(): Optional<String> = lastErrorAt.getOptional("last_error_at")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastSyncAt(): Optional<String> = lastSyncAt.getOptional("last_sync_at")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun nextSyncAt(): Optional<String> = nextSyncAt.getOptional("next_sync_at")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rateLimitResetAt(): Optional<String> =
            rateLimitResetAt.getOptional("rate_limit_reset_at")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun totalPostsSynced(): Double = totalPostsSynced.getRequired("total_posts_synced")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun totalSyncRuns(): Double = totalSyncRuns.getRequired("total_sync_runs")

        /**
         * Returns the raw JSON value of [consecutiveErrors].
         *
         * Unlike [consecutiveErrors], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("consecutive_errors")
        @ExcludeMissing
        fun _consecutiveErrors(): JsonField<Double> = consecutiveErrors

        /**
         * Returns the raw JSON value of [enabled].
         *
         * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

        /**
         * Returns the raw JSON value of [lastError].
         *
         * Unlike [lastError], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("last_error") @ExcludeMissing fun _lastError(): JsonField<String> = lastError

        /**
         * Returns the raw JSON value of [lastErrorAt].
         *
         * Unlike [lastErrorAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("last_error_at")
        @ExcludeMissing
        fun _lastErrorAt(): JsonField<String> = lastErrorAt

        /**
         * Returns the raw JSON value of [lastSyncAt].
         *
         * Unlike [lastSyncAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("last_sync_at")
        @ExcludeMissing
        fun _lastSyncAt(): JsonField<String> = lastSyncAt

        /**
         * Returns the raw JSON value of [nextSyncAt].
         *
         * Unlike [nextSyncAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("next_sync_at")
        @ExcludeMissing
        fun _nextSyncAt(): JsonField<String> = nextSyncAt

        /**
         * Returns the raw JSON value of [rateLimitResetAt].
         *
         * Unlike [rateLimitResetAt], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("rate_limit_reset_at")
        @ExcludeMissing
        fun _rateLimitResetAt(): JsonField<String> = rateLimitResetAt

        /**
         * Returns the raw JSON value of [totalPostsSynced].
         *
         * Unlike [totalPostsSynced], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("total_posts_synced")
        @ExcludeMissing
        fun _totalPostsSynced(): JsonField<Double> = totalPostsSynced

        /**
         * Returns the raw JSON value of [totalSyncRuns].
         *
         * Unlike [totalSyncRuns], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("total_sync_runs")
        @ExcludeMissing
        fun _totalSyncRuns(): JsonField<Double> = totalSyncRuns

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
             * Returns a mutable builder for constructing an instance of [Sync].
             *
             * The following fields are required:
             * ```java
             * .consecutiveErrors()
             * .enabled()
             * .lastError()
             * .lastErrorAt()
             * .lastSyncAt()
             * .nextSyncAt()
             * .rateLimitResetAt()
             * .totalPostsSynced()
             * .totalSyncRuns()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Sync]. */
        class Builder internal constructor() {

            private var consecutiveErrors: JsonField<Double>? = null
            private var enabled: JsonField<Boolean>? = null
            private var lastError: JsonField<String>? = null
            private var lastErrorAt: JsonField<String>? = null
            private var lastSyncAt: JsonField<String>? = null
            private var nextSyncAt: JsonField<String>? = null
            private var rateLimitResetAt: JsonField<String>? = null
            private var totalPostsSynced: JsonField<Double>? = null
            private var totalSyncRuns: JsonField<Double>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(sync: Sync) = apply {
                consecutiveErrors = sync.consecutiveErrors
                enabled = sync.enabled
                lastError = sync.lastError
                lastErrorAt = sync.lastErrorAt
                lastSyncAt = sync.lastSyncAt
                nextSyncAt = sync.nextSyncAt
                rateLimitResetAt = sync.rateLimitResetAt
                totalPostsSynced = sync.totalPostsSynced
                totalSyncRuns = sync.totalSyncRuns
                additionalProperties = sync.additionalProperties.toMutableMap()
            }

            fun consecutiveErrors(consecutiveErrors: Double) =
                consecutiveErrors(JsonField.of(consecutiveErrors))

            /**
             * Sets [Builder.consecutiveErrors] to an arbitrary JSON value.
             *
             * You should usually call [Builder.consecutiveErrors] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun consecutiveErrors(consecutiveErrors: JsonField<Double>) = apply {
                this.consecutiveErrors = consecutiveErrors
            }

            fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

            /**
             * Sets [Builder.enabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

            fun lastError(lastError: String?) = lastError(JsonField.ofNullable(lastError))

            /** Alias for calling [Builder.lastError] with `lastError.orElse(null)`. */
            fun lastError(lastError: Optional<String>) = lastError(lastError.getOrNull())

            /**
             * Sets [Builder.lastError] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastError] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastError(lastError: JsonField<String>) = apply { this.lastError = lastError }

            fun lastErrorAt(lastErrorAt: String?) = lastErrorAt(JsonField.ofNullable(lastErrorAt))

            /** Alias for calling [Builder.lastErrorAt] with `lastErrorAt.orElse(null)`. */
            fun lastErrorAt(lastErrorAt: Optional<String>) = lastErrorAt(lastErrorAt.getOrNull())

            /**
             * Sets [Builder.lastErrorAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastErrorAt] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastErrorAt(lastErrorAt: JsonField<String>) = apply {
                this.lastErrorAt = lastErrorAt
            }

            fun lastSyncAt(lastSyncAt: String?) = lastSyncAt(JsonField.ofNullable(lastSyncAt))

            /** Alias for calling [Builder.lastSyncAt] with `lastSyncAt.orElse(null)`. */
            fun lastSyncAt(lastSyncAt: Optional<String>) = lastSyncAt(lastSyncAt.getOrNull())

            /**
             * Sets [Builder.lastSyncAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastSyncAt] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastSyncAt(lastSyncAt: JsonField<String>) = apply { this.lastSyncAt = lastSyncAt }

            fun nextSyncAt(nextSyncAt: String?) = nextSyncAt(JsonField.ofNullable(nextSyncAt))

            /** Alias for calling [Builder.nextSyncAt] with `nextSyncAt.orElse(null)`. */
            fun nextSyncAt(nextSyncAt: Optional<String>) = nextSyncAt(nextSyncAt.getOrNull())

            /**
             * Sets [Builder.nextSyncAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nextSyncAt] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun nextSyncAt(nextSyncAt: JsonField<String>) = apply { this.nextSyncAt = nextSyncAt }

            fun rateLimitResetAt(rateLimitResetAt: String?) =
                rateLimitResetAt(JsonField.ofNullable(rateLimitResetAt))

            /**
             * Alias for calling [Builder.rateLimitResetAt] with `rateLimitResetAt.orElse(null)`.
             */
            fun rateLimitResetAt(rateLimitResetAt: Optional<String>) =
                rateLimitResetAt(rateLimitResetAt.getOrNull())

            /**
             * Sets [Builder.rateLimitResetAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rateLimitResetAt] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rateLimitResetAt(rateLimitResetAt: JsonField<String>) = apply {
                this.rateLimitResetAt = rateLimitResetAt
            }

            fun totalPostsSynced(totalPostsSynced: Double) =
                totalPostsSynced(JsonField.of(totalPostsSynced))

            /**
             * Sets [Builder.totalPostsSynced] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalPostsSynced] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalPostsSynced(totalPostsSynced: JsonField<Double>) = apply {
                this.totalPostsSynced = totalPostsSynced
            }

            fun totalSyncRuns(totalSyncRuns: Double) = totalSyncRuns(JsonField.of(totalSyncRuns))

            /**
             * Sets [Builder.totalSyncRuns] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalSyncRuns] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalSyncRuns(totalSyncRuns: JsonField<Double>) = apply {
                this.totalSyncRuns = totalSyncRuns
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
             * Returns an immutable instance of [Sync].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .consecutiveErrors()
             * .enabled()
             * .lastError()
             * .lastErrorAt()
             * .lastSyncAt()
             * .nextSyncAt()
             * .rateLimitResetAt()
             * .totalPostsSynced()
             * .totalSyncRuns()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Sync =
                Sync(
                    checkRequired("consecutiveErrors", consecutiveErrors),
                    checkRequired("enabled", enabled),
                    checkRequired("lastError", lastError),
                    checkRequired("lastErrorAt", lastErrorAt),
                    checkRequired("lastSyncAt", lastSyncAt),
                    checkRequired("nextSyncAt", nextSyncAt),
                    checkRequired("rateLimitResetAt", rateLimitResetAt),
                    checkRequired("totalPostsSynced", totalPostsSynced),
                    checkRequired("totalSyncRuns", totalSyncRuns),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Sync = apply {
            if (validated) {
                return@apply
            }

            consecutiveErrors()
            enabled()
            lastError()
            lastErrorAt()
            lastSyncAt()
            nextSyncAt()
            rateLimitResetAt()
            totalPostsSynced()
            totalSyncRuns()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (consecutiveErrors.asKnown().isPresent) 1 else 0) +
                (if (enabled.asKnown().isPresent) 1 else 0) +
                (if (lastError.asKnown().isPresent) 1 else 0) +
                (if (lastErrorAt.asKnown().isPresent) 1 else 0) +
                (if (lastSyncAt.asKnown().isPresent) 1 else 0) +
                (if (nextSyncAt.asKnown().isPresent) 1 else 0) +
                (if (rateLimitResetAt.asKnown().isPresent) 1 else 0) +
                (if (totalPostsSynced.asKnown().isPresent) 1 else 0) +
                (if (totalSyncRuns.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Sync &&
                consecutiveErrors == other.consecutiveErrors &&
                enabled == other.enabled &&
                lastError == other.lastError &&
                lastErrorAt == other.lastErrorAt &&
                lastSyncAt == other.lastSyncAt &&
                nextSyncAt == other.nextSyncAt &&
                rateLimitResetAt == other.rateLimitResetAt &&
                totalPostsSynced == other.totalPostsSynced &&
                totalSyncRuns == other.totalSyncRuns &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                consecutiveErrors,
                enabled,
                lastError,
                lastErrorAt,
                lastSyncAt,
                nextSyncAt,
                rateLimitResetAt,
                totalPostsSynced,
                totalSyncRuns,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Sync{consecutiveErrors=$consecutiveErrors, enabled=$enabled, lastError=$lastError, lastErrorAt=$lastErrorAt, lastSyncAt=$lastSyncAt, nextSyncAt=$nextSyncAt, rateLimitResetAt=$rateLimitResetAt, totalPostsSynced=$totalPostsSynced, totalSyncRuns=$totalSyncRuns, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HealthRetrieveResponse &&
            id == other.id &&
            avatarUrl == other.avatarUrl &&
            displayName == other.displayName &&
            healthy == other.healthy &&
            platform == other.platform &&
            scopes == other.scopes &&
            tokenExpiresAt == other.tokenExpiresAt &&
            username == other.username &&
            error == other.error &&
            sync == other.sync &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            avatarUrl,
            displayName,
            healthy,
            platform,
            scopes,
            tokenExpiresAt,
            username,
            error,
            sync,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "HealthRetrieveResponse{id=$id, avatarUrl=$avatarUrl, displayName=$displayName, healthy=$healthy, platform=$platform, scopes=$scopes, tokenExpiresAt=$tokenExpiresAt, username=$username, error=$error, sync=$sync, additionalProperties=$additionalProperties}"
}
