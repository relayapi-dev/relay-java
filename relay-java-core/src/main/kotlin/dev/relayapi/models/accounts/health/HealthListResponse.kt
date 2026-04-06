// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.accounts.health

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.relayapi.core.Enum
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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class HealthListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val hasMore: JsonField<Boolean>,
    private val nextCursor: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of(),
        @JsonProperty("has_more") @ExcludeMissing hasMore: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("next_cursor")
        @ExcludeMissing
        nextCursor: JsonField<String> = JsonMissing.of(),
    ) : this(data, hasMore, nextCursor, mutableMapOf())

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): List<Data> = data.getRequired("data")

    /**
     * Whether more items exist
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hasMore(): Boolean = hasMore.getRequired("has_more")

    /**
     * Cursor for next page
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nextCursor(): Optional<String> = nextCursor.getOptional("next_cursor")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

    /**
     * Returns the raw JSON value of [hasMore].
     *
     * Unlike [hasMore], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("has_more") @ExcludeMissing fun _hasMore(): JsonField<Boolean> = hasMore

    /**
     * Returns the raw JSON value of [nextCursor].
     *
     * Unlike [nextCursor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("next_cursor") @ExcludeMissing fun _nextCursor(): JsonField<String> = nextCursor

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
         * Returns a mutable builder for constructing an instance of [HealthListResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * .hasMore()
         * .nextCursor()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [HealthListResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var hasMore: JsonField<Boolean>? = null
        private var nextCursor: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(healthListResponse: HealthListResponse) = apply {
            data = healthListResponse.data.map { it.toMutableList() }
            hasMore = healthListResponse.hasMore
            nextCursor = healthListResponse.nextCursor
            additionalProperties = healthListResponse.additionalProperties.toMutableMap()
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<Data>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<List<Data>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [Data] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: Data) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        /** Whether more items exist */
        fun hasMore(hasMore: Boolean) = hasMore(JsonField.of(hasMore))

        /**
         * Sets [Builder.hasMore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasMore] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hasMore(hasMore: JsonField<Boolean>) = apply { this.hasMore = hasMore }

        /** Cursor for next page */
        fun nextCursor(nextCursor: String?) = nextCursor(JsonField.ofNullable(nextCursor))

        /** Alias for calling [Builder.nextCursor] with `nextCursor.orElse(null)`. */
        fun nextCursor(nextCursor: Optional<String>) = nextCursor(nextCursor.getOrNull())

        /**
         * Sets [Builder.nextCursor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextCursor] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun nextCursor(nextCursor: JsonField<String>) = apply { this.nextCursor = nextCursor }

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
         * Returns an immutable instance of [HealthListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .data()
         * .hasMore()
         * .nextCursor()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): HealthListResponse =
            HealthListResponse(
                checkRequired("data", data).map { it.toImmutable() },
                checkRequired("hasMore", hasMore),
                checkRequired("nextCursor", nextCursor),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): HealthListResponse = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
        hasMore()
        nextCursor()
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
        (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (hasMore.asKnown().isPresent) 1 else 0) +
            (if (nextCursor.asKnown().isPresent) 1 else 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val avatarUrl: JsonField<String>,
        private val displayName: JsonField<String>,
        private val healthy: JsonField<Boolean>,
        private val platform: JsonField<Platform>,
        private val scopes: JsonField<List<String>>,
        private val tokenExpiresAt: JsonField<OffsetDateTime>,
        private val username: JsonField<String>,
        private val workspace: JsonField<Workspace>,
        private val error: JsonField<Error>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("avatar_url")
            @ExcludeMissing
            avatarUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("display_name")
            @ExcludeMissing
            displayName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("healthy") @ExcludeMissing healthy: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("platform")
            @ExcludeMissing
            platform: JsonField<Platform> = JsonMissing.of(),
            @JsonProperty("scopes")
            @ExcludeMissing
            scopes: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("token_expires_at")
            @ExcludeMissing
            tokenExpiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("username")
            @ExcludeMissing
            username: JsonField<String> = JsonMissing.of(),
            @JsonProperty("workspace")
            @ExcludeMissing
            workspace: JsonField<Workspace> = JsonMissing.of(),
            @JsonProperty("error") @ExcludeMissing error: JsonField<Error> = JsonMissing.of(),
        ) : this(
            id,
            avatarUrl,
            displayName,
            healthy,
            platform,
            scopes,
            tokenExpiresAt,
            username,
            workspace,
            error,
            mutableMapOf(),
        )

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
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
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun healthy(): Boolean = healthy.getRequired("healthy")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun platform(): Platform = platform.getRequired("platform")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun scopes(): List<String> = scopes.getRequired("scopes")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tokenExpiresAt(): Optional<OffsetDateTime> =
            tokenExpiresAt.getOptional("token_expires_at")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun username(): Optional<String> = username.getOptional("username")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun workspace(): Optional<Workspace> = workspace.getOptional("workspace")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun error(): Optional<Error> = error.getOptional("error")

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
        @JsonProperty("platform") @ExcludeMissing fun _platform(): JsonField<Platform> = platform

        /**
         * Returns the raw JSON value of [scopes].
         *
         * Unlike [scopes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("scopes") @ExcludeMissing fun _scopes(): JsonField<List<String>> = scopes

        /**
         * Returns the raw JSON value of [tokenExpiresAt].
         *
         * Unlike [tokenExpiresAt], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("token_expires_at")
        @ExcludeMissing
        fun _tokenExpiresAt(): JsonField<OffsetDateTime> = tokenExpiresAt

        /**
         * Returns the raw JSON value of [username].
         *
         * Unlike [username], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("username") @ExcludeMissing fun _username(): JsonField<String> = username

        /**
         * Returns the raw JSON value of [workspace].
         *
         * Unlike [workspace], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("workspace")
        @ExcludeMissing
        fun _workspace(): JsonField<Workspace> = workspace

        /**
         * Returns the raw JSON value of [error].
         *
         * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<Error> = error

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
             * Returns a mutable builder for constructing an instance of [Data].
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
             * .workspace()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var avatarUrl: JsonField<String>? = null
            private var displayName: JsonField<String>? = null
            private var healthy: JsonField<Boolean>? = null
            private var platform: JsonField<Platform>? = null
            private var scopes: JsonField<MutableList<String>>? = null
            private var tokenExpiresAt: JsonField<OffsetDateTime>? = null
            private var username: JsonField<String>? = null
            private var workspace: JsonField<Workspace>? = null
            private var error: JsonField<Error> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                avatarUrl = data.avatarUrl
                displayName = data.displayName
                healthy = data.healthy
                platform = data.platform
                scopes = data.scopes.map { it.toMutableList() }
                tokenExpiresAt = data.tokenExpiresAt
                username = data.username
                workspace = data.workspace
                error = data.error
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun avatarUrl(avatarUrl: String?) = avatarUrl(JsonField.ofNullable(avatarUrl))

            /** Alias for calling [Builder.avatarUrl] with `avatarUrl.orElse(null)`. */
            fun avatarUrl(avatarUrl: Optional<String>) = avatarUrl(avatarUrl.getOrNull())

            /**
             * Sets [Builder.avatarUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.avatarUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun avatarUrl(avatarUrl: JsonField<String>) = apply { this.avatarUrl = avatarUrl }

            fun displayName(displayName: String?) = displayName(JsonField.ofNullable(displayName))

            /** Alias for calling [Builder.displayName] with `displayName.orElse(null)`. */
            fun displayName(displayName: Optional<String>) = displayName(displayName.getOrNull())

            /**
             * Sets [Builder.displayName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.displayName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun displayName(displayName: JsonField<String>) = apply {
                this.displayName = displayName
            }

            fun healthy(healthy: Boolean) = healthy(JsonField.of(healthy))

            /**
             * Sets [Builder.healthy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.healthy] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun healthy(healthy: JsonField<Boolean>) = apply { this.healthy = healthy }

            fun platform(platform: Platform) = platform(JsonField.of(platform))

            /**
             * Sets [Builder.platform] to an arbitrary JSON value.
             *
             * You should usually call [Builder.platform] with a well-typed [Platform] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun platform(platform: JsonField<Platform>) = apply { this.platform = platform }

            fun scopes(scopes: List<String>) = scopes(JsonField.of(scopes))

            /**
             * Sets [Builder.scopes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scopes] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            fun tokenExpiresAt(tokenExpiresAt: OffsetDateTime?) =
                tokenExpiresAt(JsonField.ofNullable(tokenExpiresAt))

            /** Alias for calling [Builder.tokenExpiresAt] with `tokenExpiresAt.orElse(null)`. */
            fun tokenExpiresAt(tokenExpiresAt: Optional<OffsetDateTime>) =
                tokenExpiresAt(tokenExpiresAt.getOrNull())

            /**
             * Sets [Builder.tokenExpiresAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tokenExpiresAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun tokenExpiresAt(tokenExpiresAt: JsonField<OffsetDateTime>) = apply {
                this.tokenExpiresAt = tokenExpiresAt
            }

            fun username(username: String?) = username(JsonField.ofNullable(username))

            /** Alias for calling [Builder.username] with `username.orElse(null)`. */
            fun username(username: Optional<String>) = username(username.getOrNull())

            /**
             * Sets [Builder.username] to an arbitrary JSON value.
             *
             * You should usually call [Builder.username] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun username(username: JsonField<String>) = apply { this.username = username }

            fun workspace(workspace: Workspace?) = workspace(JsonField.ofNullable(workspace))

            /** Alias for calling [Builder.workspace] with `workspace.orElse(null)`. */
            fun workspace(workspace: Optional<Workspace>) = workspace(workspace.getOrNull())

            /**
             * Sets [Builder.workspace] to an arbitrary JSON value.
             *
             * You should usually call [Builder.workspace] with a well-typed [Workspace] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun workspace(workspace: JsonField<Workspace>) = apply { this.workspace = workspace }

            fun error(error: Error) = error(JsonField.of(error))

            /**
             * Sets [Builder.error] to an arbitrary JSON value.
             *
             * You should usually call [Builder.error] with a well-typed [Error] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun error(error: JsonField<Error>) = apply { this.error = error }

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
             * Returns an immutable instance of [Data].
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
             * .workspace()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("id", id),
                    checkRequired("avatarUrl", avatarUrl),
                    checkRequired("displayName", displayName),
                    checkRequired("healthy", healthy),
                    checkRequired("platform", platform),
                    checkRequired("scopes", scopes).map { it.toImmutable() },
                    checkRequired("tokenExpiresAt", tokenExpiresAt),
                    checkRequired("username", username),
                    checkRequired("workspace", workspace),
                    error,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            avatarUrl()
            displayName()
            healthy()
            platform().validate()
            scopes()
            tokenExpiresAt()
            username()
            workspace().ifPresent { it.validate() }
            error().ifPresent { it.validate() }
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (avatarUrl.asKnown().isPresent) 1 else 0) +
                (if (displayName.asKnown().isPresent) 1 else 0) +
                (if (healthy.asKnown().isPresent) 1 else 0) +
                (platform.asKnown().getOrNull()?.validity() ?: 0) +
                (scopes.asKnown().getOrNull()?.size ?: 0) +
                (if (tokenExpiresAt.asKnown().isPresent) 1 else 0) +
                (if (username.asKnown().isPresent) 1 else 0) +
                (workspace.asKnown().getOrNull()?.validity() ?: 0) +
                (error.asKnown().getOrNull()?.validity() ?: 0)

        class Platform @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val TWITTER = of("twitter")

                @JvmField val INSTAGRAM = of("instagram")

                @JvmField val FACEBOOK = of("facebook")

                @JvmField val LINKEDIN = of("linkedin")

                @JvmField val TIKTOK = of("tiktok")

                @JvmField val YOUTUBE = of("youtube")

                @JvmField val PINTEREST = of("pinterest")

                @JvmField val REDDIT = of("reddit")

                @JvmField val BLUESKY = of("bluesky")

                @JvmField val THREADS = of("threads")

                @JvmField val TELEGRAM = of("telegram")

                @JvmField val SNAPCHAT = of("snapchat")

                @JvmField val GOOGLEBUSINESS = of("googlebusiness")

                @JvmField val WHATSAPP = of("whatsapp")

                @JvmField val MASTODON = of("mastodon")

                @JvmField val DISCORD = of("discord")

                @JvmField val SMS = of("sms")

                @JvmField val BEEHIIV = of("beehiiv")

                @JvmField val CONVERTKIT = of("convertkit")

                @JvmField val MAILCHIMP = of("mailchimp")

                @JvmField val LISTMONK = of("listmonk")

                @JvmStatic fun of(value: String) = Platform(JsonField.of(value))
            }

            /** An enum containing [Platform]'s known values. */
            enum class Known {
                TWITTER,
                INSTAGRAM,
                FACEBOOK,
                LINKEDIN,
                TIKTOK,
                YOUTUBE,
                PINTEREST,
                REDDIT,
                BLUESKY,
                THREADS,
                TELEGRAM,
                SNAPCHAT,
                GOOGLEBUSINESS,
                WHATSAPP,
                MASTODON,
                DISCORD,
                SMS,
                BEEHIIV,
                CONVERTKIT,
                MAILCHIMP,
                LISTMONK,
            }

            /**
             * An enum containing [Platform]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Platform] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                TWITTER,
                INSTAGRAM,
                FACEBOOK,
                LINKEDIN,
                TIKTOK,
                YOUTUBE,
                PINTEREST,
                REDDIT,
                BLUESKY,
                THREADS,
                TELEGRAM,
                SNAPCHAT,
                GOOGLEBUSINESS,
                WHATSAPP,
                MASTODON,
                DISCORD,
                SMS,
                BEEHIIV,
                CONVERTKIT,
                MAILCHIMP,
                LISTMONK,
                /**
                 * An enum member indicating that [Platform] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    TWITTER -> Value.TWITTER
                    INSTAGRAM -> Value.INSTAGRAM
                    FACEBOOK -> Value.FACEBOOK
                    LINKEDIN -> Value.LINKEDIN
                    TIKTOK -> Value.TIKTOK
                    YOUTUBE -> Value.YOUTUBE
                    PINTEREST -> Value.PINTEREST
                    REDDIT -> Value.REDDIT
                    BLUESKY -> Value.BLUESKY
                    THREADS -> Value.THREADS
                    TELEGRAM -> Value.TELEGRAM
                    SNAPCHAT -> Value.SNAPCHAT
                    GOOGLEBUSINESS -> Value.GOOGLEBUSINESS
                    WHATSAPP -> Value.WHATSAPP
                    MASTODON -> Value.MASTODON
                    DISCORD -> Value.DISCORD
                    SMS -> Value.SMS
                    BEEHIIV -> Value.BEEHIIV
                    CONVERTKIT -> Value.CONVERTKIT
                    MAILCHIMP -> Value.MAILCHIMP
                    LISTMONK -> Value.LISTMONK
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws RelayInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    TWITTER -> Known.TWITTER
                    INSTAGRAM -> Known.INSTAGRAM
                    FACEBOOK -> Known.FACEBOOK
                    LINKEDIN -> Known.LINKEDIN
                    TIKTOK -> Known.TIKTOK
                    YOUTUBE -> Known.YOUTUBE
                    PINTEREST -> Known.PINTEREST
                    REDDIT -> Known.REDDIT
                    BLUESKY -> Known.BLUESKY
                    THREADS -> Known.THREADS
                    TELEGRAM -> Known.TELEGRAM
                    SNAPCHAT -> Known.SNAPCHAT
                    GOOGLEBUSINESS -> Known.GOOGLEBUSINESS
                    WHATSAPP -> Known.WHATSAPP
                    MASTODON -> Known.MASTODON
                    DISCORD -> Known.DISCORD
                    SMS -> Known.SMS
                    BEEHIIV -> Known.BEEHIIV
                    CONVERTKIT -> Known.CONVERTKIT
                    MAILCHIMP -> Known.MAILCHIMP
                    LISTMONK -> Known.LISTMONK
                    else -> throw RelayInvalidDataException("Unknown Platform: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws RelayInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    RelayInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Platform = apply {
                if (validated) {
                    return@apply
                }

                known()
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
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Platform && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Workspace
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val name: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            ) : this(id, name, mutableMapOf())

            /**
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
                 * Returns a mutable builder for constructing an instance of [Workspace].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .name()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Workspace]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var name: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(workspace: Workspace) = apply {
                    id = workspace.id
                    name = workspace.name
                    additionalProperties = workspace.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Workspace].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .name()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Workspace =
                    Workspace(
                        checkRequired("id", id),
                        checkRequired("name", name),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Workspace = apply {
                if (validated) {
                    return@apply
                }

                id()
                name()
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
                (if (id.asKnown().isPresent) 1 else 0) + (if (name.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Workspace &&
                    id == other.id &&
                    name == other.name &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(id, name, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Workspace{id=$id, name=$name, additionalProperties=$additionalProperties}"
        }

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
                @JsonProperty("message")
                @ExcludeMissing
                message: JsonField<String> = JsonMissing.of(),
            ) : this(code, message, mutableMapOf())

            /**
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun code(): String = code.getRequired("code")

            /**
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
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
                 * You should usually call [Builder.code] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun code(code: JsonField<String>) = apply { this.code = code }

                fun message(message: String) = message(JsonField.of(message))

                /**
                 * Sets [Builder.message] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.message] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun message(message: JsonField<String>) = apply { this.message = message }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

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
                (if (code.asKnown().isPresent) 1 else 0) +
                    (if (message.asKnown().isPresent) 1 else 0)

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                avatarUrl == other.avatarUrl &&
                displayName == other.displayName &&
                healthy == other.healthy &&
                platform == other.platform &&
                scopes == other.scopes &&
                tokenExpiresAt == other.tokenExpiresAt &&
                username == other.username &&
                workspace == other.workspace &&
                error == other.error &&
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
                workspace,
                error,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, avatarUrl=$avatarUrl, displayName=$displayName, healthy=$healthy, platform=$platform, scopes=$scopes, tokenExpiresAt=$tokenExpiresAt, username=$username, workspace=$workspace, error=$error, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HealthListResponse &&
            data == other.data &&
            hasMore == other.hasMore &&
            nextCursor == other.nextCursor &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(data, hasMore, nextCursor, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "HealthListResponse{data=$data, hasMore=$hasMore, nextCursor=$nextCursor, additionalProperties=$additionalProperties}"
}
