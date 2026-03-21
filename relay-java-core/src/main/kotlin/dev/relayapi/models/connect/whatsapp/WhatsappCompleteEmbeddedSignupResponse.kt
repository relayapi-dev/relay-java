// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.connect.whatsapp

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.relayapi.core.Enum
import dev.relayapi.core.ExcludeMissing
import dev.relayapi.core.JsonField
import dev.relayapi.core.JsonMissing
import dev.relayapi.core.JsonValue
import dev.relayapi.core.checkRequired
import dev.relayapi.core.toImmutable
import dev.relayapi.errors.RelayInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class WhatsappCompleteEmbeddedSignupResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val account: JsonField<Account>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("account") @ExcludeMissing account: JsonField<Account> = JsonMissing.of()
    ) : this(account, mutableMapOf())

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun account(): Account = account.getRequired("account")

    /**
     * Returns the raw JSON value of [account].
     *
     * Unlike [account], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account") @ExcludeMissing fun _account(): JsonField<Account> = account

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
         * [WhatsappCompleteEmbeddedSignupResponse].
         *
         * The following fields are required:
         * ```java
         * .account()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WhatsappCompleteEmbeddedSignupResponse]. */
    class Builder internal constructor() {

        private var account: JsonField<Account>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            whatsappCompleteEmbeddedSignupResponse: WhatsappCompleteEmbeddedSignupResponse
        ) = apply {
            account = whatsappCompleteEmbeddedSignupResponse.account
            additionalProperties =
                whatsappCompleteEmbeddedSignupResponse.additionalProperties.toMutableMap()
        }

        fun account(account: Account) = account(JsonField.of(account))

        /**
         * Sets [Builder.account] to an arbitrary JSON value.
         *
         * You should usually call [Builder.account] with a well-typed [Account] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun account(account: JsonField<Account>) = apply { this.account = account }

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
         * Returns an immutable instance of [WhatsappCompleteEmbeddedSignupResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .account()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WhatsappCompleteEmbeddedSignupResponse =
            WhatsappCompleteEmbeddedSignupResponse(
                checkRequired("account", account),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): WhatsappCompleteEmbeddedSignupResponse = apply {
        if (validated) {
            return@apply
        }

        account().validate()
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
    @JvmSynthetic internal fun validity(): Int = (account.asKnown().getOrNull()?.validity() ?: 0)

    class Account
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val avatarUrl: JsonField<String>,
        private val connectedAt: JsonField<OffsetDateTime>,
        private val displayName: JsonField<String>,
        private val metadata: JsonField<Metadata>,
        private val platform: JsonField<Platform>,
        private val platformAccountId: JsonField<String>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val username: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("avatar_url")
            @ExcludeMissing
            avatarUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("connected_at")
            @ExcludeMissing
            connectedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("display_name")
            @ExcludeMissing
            displayName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("platform")
            @ExcludeMissing
            platform: JsonField<Platform> = JsonMissing.of(),
            @JsonProperty("platform_account_id")
            @ExcludeMissing
            platformAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("username") @ExcludeMissing username: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            avatarUrl,
            connectedAt,
            displayName,
            metadata,
            platform,
            platformAccountId,
            updatedAt,
            username,
            mutableMapOf(),
        )

        /**
         * Account ID
         *
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
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun connectedAt(): OffsetDateTime = connectedAt.getRequired("connected_at")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun displayName(): Optional<String> = displayName.getOptional("display_name")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun platform(): Platform = platform.getRequired("platform")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun platformAccountId(): String = platformAccountId.getRequired("platform_account_id")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun username(): Optional<String> = username.getOptional("username")

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
         * Returns the raw JSON value of [connectedAt].
         *
         * Unlike [connectedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("connected_at")
        @ExcludeMissing
        fun _connectedAt(): JsonField<OffsetDateTime> = connectedAt

        /**
         * Returns the raw JSON value of [displayName].
         *
         * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("display_name")
        @ExcludeMissing
        fun _displayName(): JsonField<String> = displayName

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [platform].
         *
         * Unlike [platform], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("platform") @ExcludeMissing fun _platform(): JsonField<Platform> = platform

        /**
         * Returns the raw JSON value of [platformAccountId].
         *
         * Unlike [platformAccountId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("platform_account_id")
        @ExcludeMissing
        fun _platformAccountId(): JsonField<String> = platformAccountId

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        /**
         * Returns the raw JSON value of [username].
         *
         * Unlike [username], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("username") @ExcludeMissing fun _username(): JsonField<String> = username

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
             * Returns a mutable builder for constructing an instance of [Account].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .avatarUrl()
             * .connectedAt()
             * .displayName()
             * .metadata()
             * .platform()
             * .platformAccountId()
             * .updatedAt()
             * .username()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Account]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var avatarUrl: JsonField<String>? = null
            private var connectedAt: JsonField<OffsetDateTime>? = null
            private var displayName: JsonField<String>? = null
            private var metadata: JsonField<Metadata>? = null
            private var platform: JsonField<Platform>? = null
            private var platformAccountId: JsonField<String>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var username: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(account: Account) = apply {
                id = account.id
                avatarUrl = account.avatarUrl
                connectedAt = account.connectedAt
                displayName = account.displayName
                metadata = account.metadata
                platform = account.platform
                platformAccountId = account.platformAccountId
                updatedAt = account.updatedAt
                username = account.username
                additionalProperties = account.additionalProperties.toMutableMap()
            }

            /** Account ID */
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

            fun connectedAt(connectedAt: OffsetDateTime) = connectedAt(JsonField.of(connectedAt))

            /**
             * Sets [Builder.connectedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.connectedAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun connectedAt(connectedAt: JsonField<OffsetDateTime>) = apply {
                this.connectedAt = connectedAt
            }

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

            fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

            /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
            fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            fun platform(platform: Platform) = platform(JsonField.of(platform))

            /**
             * Sets [Builder.platform] to an arbitrary JSON value.
             *
             * You should usually call [Builder.platform] with a well-typed [Platform] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun platform(platform: JsonField<Platform>) = apply { this.platform = platform }

            fun platformAccountId(platformAccountId: String) =
                platformAccountId(JsonField.of(platformAccountId))

            /**
             * Sets [Builder.platformAccountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.platformAccountId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun platformAccountId(platformAccountId: JsonField<String>) = apply {
                this.platformAccountId = platformAccountId
            }

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
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
             * Returns an immutable instance of [Account].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .avatarUrl()
             * .connectedAt()
             * .displayName()
             * .metadata()
             * .platform()
             * .platformAccountId()
             * .updatedAt()
             * .username()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Account =
                Account(
                    checkRequired("id", id),
                    checkRequired("avatarUrl", avatarUrl),
                    checkRequired("connectedAt", connectedAt),
                    checkRequired("displayName", displayName),
                    checkRequired("metadata", metadata),
                    checkRequired("platform", platform),
                    checkRequired("platformAccountId", platformAccountId),
                    checkRequired("updatedAt", updatedAt),
                    checkRequired("username", username),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Account = apply {
            if (validated) {
                return@apply
            }

            id()
            avatarUrl()
            connectedAt()
            displayName()
            metadata().ifPresent { it.validate() }
            platform().validate()
            platformAccountId()
            updatedAt()
            username()
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
                (if (connectedAt.asKnown().isPresent) 1 else 0) +
                (if (displayName.asKnown().isPresent) 1 else 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (platform.asKnown().getOrNull()?.validity() ?: 0) +
                (if (platformAccountId.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (username.asKnown().isPresent) 1 else 0)

        class Metadata
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Metadata]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Metadata]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(metadata: Metadata) = apply {
                    additionalProperties = metadata.additionalProperties.toMutableMap()
                }

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
                 * Returns an immutable instance of [Metadata].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Metadata = apply {
                if (validated) {
                    return@apply
                }

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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Metadata && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Account &&
                id == other.id &&
                avatarUrl == other.avatarUrl &&
                connectedAt == other.connectedAt &&
                displayName == other.displayName &&
                metadata == other.metadata &&
                platform == other.platform &&
                platformAccountId == other.platformAccountId &&
                updatedAt == other.updatedAt &&
                username == other.username &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                avatarUrl,
                connectedAt,
                displayName,
                metadata,
                platform,
                platformAccountId,
                updatedAt,
                username,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Account{id=$id, avatarUrl=$avatarUrl, connectedAt=$connectedAt, displayName=$displayName, metadata=$metadata, platform=$platform, platformAccountId=$platformAccountId, updatedAt=$updatedAt, username=$username, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WhatsappCompleteEmbeddedSignupResponse &&
            account == other.account &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(account, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WhatsappCompleteEmbeddedSignupResponse{account=$account, additionalProperties=$additionalProperties}"
}
