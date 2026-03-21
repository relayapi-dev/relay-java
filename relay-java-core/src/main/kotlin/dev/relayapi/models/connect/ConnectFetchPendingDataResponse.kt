// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.connect

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ConnectFetchPendingDataResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val platform: JsonField<Platform>,
    private val tempToken: JsonField<String>,
    private val userProfile: JsonField<UserProfile>,
    private val boards: JsonField<List<Board>>,
    private val locations: JsonField<List<Location>>,
    private val organizations: JsonField<List<Organization>>,
    private val pages: JsonField<List<Page>>,
    private val profiles: JsonField<List<Profile>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("platform") @ExcludeMissing platform: JsonField<Platform> = JsonMissing.of(),
        @JsonProperty("temp_token") @ExcludeMissing tempToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user_profile")
        @ExcludeMissing
        userProfile: JsonField<UserProfile> = JsonMissing.of(),
        @JsonProperty("boards") @ExcludeMissing boards: JsonField<List<Board>> = JsonMissing.of(),
        @JsonProperty("locations")
        @ExcludeMissing
        locations: JsonField<List<Location>> = JsonMissing.of(),
        @JsonProperty("organizations")
        @ExcludeMissing
        organizations: JsonField<List<Organization>> = JsonMissing.of(),
        @JsonProperty("pages") @ExcludeMissing pages: JsonField<List<Page>> = JsonMissing.of(),
        @JsonProperty("profiles")
        @ExcludeMissing
        profiles: JsonField<List<Profile>> = JsonMissing.of(),
    ) : this(
        platform,
        tempToken,
        userProfile,
        boards,
        locations,
        organizations,
        pages,
        profiles,
        mutableMapOf(),
    )

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun platform(): Platform = platform.getRequired("platform")

    /**
     * Token to use for secondary selection
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tempToken(): String = tempToken.getRequired("temp_token")

    /**
     * Basic user profile from the platform
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userProfile(): UserProfile = userProfile.getRequired("user_profile")

    /**
     * Pinterest boards available
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun boards(): Optional<List<Board>> = boards.getOptional("boards")

    /**
     * Google Business locations available
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun locations(): Optional<List<Location>> = locations.getOptional("locations")

    /**
     * LinkedIn organizations available
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun organizations(): Optional<List<Organization>> = organizations.getOptional("organizations")

    /**
     * Facebook pages available
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pages(): Optional<List<Page>> = pages.getOptional("pages")

    /**
     * Snapchat profiles available
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun profiles(): Optional<List<Profile>> = profiles.getOptional("profiles")

    /**
     * Returns the raw JSON value of [platform].
     *
     * Unlike [platform], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("platform") @ExcludeMissing fun _platform(): JsonField<Platform> = platform

    /**
     * Returns the raw JSON value of [tempToken].
     *
     * Unlike [tempToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("temp_token") @ExcludeMissing fun _tempToken(): JsonField<String> = tempToken

    /**
     * Returns the raw JSON value of [userProfile].
     *
     * Unlike [userProfile], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_profile")
    @ExcludeMissing
    fun _userProfile(): JsonField<UserProfile> = userProfile

    /**
     * Returns the raw JSON value of [boards].
     *
     * Unlike [boards], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("boards") @ExcludeMissing fun _boards(): JsonField<List<Board>> = boards

    /**
     * Returns the raw JSON value of [locations].
     *
     * Unlike [locations], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("locations")
    @ExcludeMissing
    fun _locations(): JsonField<List<Location>> = locations

    /**
     * Returns the raw JSON value of [organizations].
     *
     * Unlike [organizations], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("organizations")
    @ExcludeMissing
    fun _organizations(): JsonField<List<Organization>> = organizations

    /**
     * Returns the raw JSON value of [pages].
     *
     * Unlike [pages], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pages") @ExcludeMissing fun _pages(): JsonField<List<Page>> = pages

    /**
     * Returns the raw JSON value of [profiles].
     *
     * Unlike [profiles], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("profiles") @ExcludeMissing fun _profiles(): JsonField<List<Profile>> = profiles

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
         * [ConnectFetchPendingDataResponse].
         *
         * The following fields are required:
         * ```java
         * .platform()
         * .tempToken()
         * .userProfile()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConnectFetchPendingDataResponse]. */
    class Builder internal constructor() {

        private var platform: JsonField<Platform>? = null
        private var tempToken: JsonField<String>? = null
        private var userProfile: JsonField<UserProfile>? = null
        private var boards: JsonField<MutableList<Board>>? = null
        private var locations: JsonField<MutableList<Location>>? = null
        private var organizations: JsonField<MutableList<Organization>>? = null
        private var pages: JsonField<MutableList<Page>>? = null
        private var profiles: JsonField<MutableList<Profile>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(connectFetchPendingDataResponse: ConnectFetchPendingDataResponse) =
            apply {
                platform = connectFetchPendingDataResponse.platform
                tempToken = connectFetchPendingDataResponse.tempToken
                userProfile = connectFetchPendingDataResponse.userProfile
                boards = connectFetchPendingDataResponse.boards.map { it.toMutableList() }
                locations = connectFetchPendingDataResponse.locations.map { it.toMutableList() }
                organizations =
                    connectFetchPendingDataResponse.organizations.map { it.toMutableList() }
                pages = connectFetchPendingDataResponse.pages.map { it.toMutableList() }
                profiles = connectFetchPendingDataResponse.profiles.map { it.toMutableList() }
                additionalProperties =
                    connectFetchPendingDataResponse.additionalProperties.toMutableMap()
            }

        fun platform(platform: Platform) = platform(JsonField.of(platform))

        /**
         * Sets [Builder.platform] to an arbitrary JSON value.
         *
         * You should usually call [Builder.platform] with a well-typed [Platform] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun platform(platform: JsonField<Platform>) = apply { this.platform = platform }

        /** Token to use for secondary selection */
        fun tempToken(tempToken: String) = tempToken(JsonField.of(tempToken))

        /**
         * Sets [Builder.tempToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tempToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tempToken(tempToken: JsonField<String>) = apply { this.tempToken = tempToken }

        /** Basic user profile from the platform */
        fun userProfile(userProfile: UserProfile) = userProfile(JsonField.of(userProfile))

        /**
         * Sets [Builder.userProfile] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userProfile] with a well-typed [UserProfile] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun userProfile(userProfile: JsonField<UserProfile>) = apply {
            this.userProfile = userProfile
        }

        /** Pinterest boards available */
        fun boards(boards: List<Board>) = boards(JsonField.of(boards))

        /**
         * Sets [Builder.boards] to an arbitrary JSON value.
         *
         * You should usually call [Builder.boards] with a well-typed `List<Board>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun boards(boards: JsonField<List<Board>>) = apply {
            this.boards = boards.map { it.toMutableList() }
        }

        /**
         * Adds a single [Board] to [boards].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBoard(board: Board) = apply {
            boards =
                (boards ?: JsonField.of(mutableListOf())).also {
                    checkKnown("boards", it).add(board)
                }
        }

        /** Google Business locations available */
        fun locations(locations: List<Location>) = locations(JsonField.of(locations))

        /**
         * Sets [Builder.locations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locations] with a well-typed `List<Location>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun locations(locations: JsonField<List<Location>>) = apply {
            this.locations = locations.map { it.toMutableList() }
        }

        /**
         * Adds a single [Location] to [locations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLocation(location: Location) = apply {
            locations =
                (locations ?: JsonField.of(mutableListOf())).also {
                    checkKnown("locations", it).add(location)
                }
        }

        /** LinkedIn organizations available */
        fun organizations(organizations: List<Organization>) =
            organizations(JsonField.of(organizations))

        /**
         * Sets [Builder.organizations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.organizations] with a well-typed `List<Organization>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun organizations(organizations: JsonField<List<Organization>>) = apply {
            this.organizations = organizations.map { it.toMutableList() }
        }

        /**
         * Adds a single [Organization] to [organizations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOrganization(organization: Organization) = apply {
            organizations =
                (organizations ?: JsonField.of(mutableListOf())).also {
                    checkKnown("organizations", it).add(organization)
                }
        }

        /** Facebook pages available */
        fun pages(pages: List<Page>) = pages(JsonField.of(pages))

        /**
         * Sets [Builder.pages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pages] with a well-typed `List<Page>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pages(pages: JsonField<List<Page>>) = apply {
            this.pages = pages.map { it.toMutableList() }
        }

        /**
         * Adds a single [Page] to [pages].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPage(page: Page) = apply {
            pages =
                (pages ?: JsonField.of(mutableListOf())).also { checkKnown("pages", it).add(page) }
        }

        /** Snapchat profiles available */
        fun profiles(profiles: List<Profile>) = profiles(JsonField.of(profiles))

        /**
         * Sets [Builder.profiles] to an arbitrary JSON value.
         *
         * You should usually call [Builder.profiles] with a well-typed `List<Profile>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun profiles(profiles: JsonField<List<Profile>>) = apply {
            this.profiles = profiles.map { it.toMutableList() }
        }

        /**
         * Adds a single [Profile] to [profiles].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProfile(profile: Profile) = apply {
            profiles =
                (profiles ?: JsonField.of(mutableListOf())).also {
                    checkKnown("profiles", it).add(profile)
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
         * Returns an immutable instance of [ConnectFetchPendingDataResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .platform()
         * .tempToken()
         * .userProfile()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ConnectFetchPendingDataResponse =
            ConnectFetchPendingDataResponse(
                checkRequired("platform", platform),
                checkRequired("tempToken", tempToken),
                checkRequired("userProfile", userProfile),
                (boards ?: JsonMissing.of()).map { it.toImmutable() },
                (locations ?: JsonMissing.of()).map { it.toImmutable() },
                (organizations ?: JsonMissing.of()).map { it.toImmutable() },
                (pages ?: JsonMissing.of()).map { it.toImmutable() },
                (profiles ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ConnectFetchPendingDataResponse = apply {
        if (validated) {
            return@apply
        }

        platform().validate()
        tempToken()
        userProfile().validate()
        boards().ifPresent { it.forEach { it.validate() } }
        locations().ifPresent { it.forEach { it.validate() } }
        organizations().ifPresent { it.forEach { it.validate() } }
        pages().ifPresent { it.forEach { it.validate() } }
        profiles().ifPresent { it.forEach { it.validate() } }
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
        (platform.asKnown().getOrNull()?.validity() ?: 0) +
            (if (tempToken.asKnown().isPresent) 1 else 0) +
            (userProfile.asKnown().getOrNull()?.validity() ?: 0) +
            (boards.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (locations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (organizations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (pages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (profiles.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Platform @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
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
            /** An enum member indicating that [Platform] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws RelayInvalidDataException if this class instance's value is a not a known member.
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
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws RelayInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { RelayInvalidDataException("Value is not a String") }

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

    /** Basic user profile from the platform */
    class UserProfile
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val avatarUrl: JsonField<String>,
        private val name: JsonField<String>,
        private val username: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("avatar_url")
            @ExcludeMissing
            avatarUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("username") @ExcludeMissing username: JsonField<String> = JsonMissing.of(),
        ) : this(id, avatarUrl, name, username, mutableMapOf())

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
        fun name(): Optional<String> = name.getOptional("name")

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
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
             * Returns a mutable builder for constructing an instance of [UserProfile].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .avatarUrl()
             * .name()
             * .username()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UserProfile]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var avatarUrl: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var username: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(userProfile: UserProfile) = apply {
                id = userProfile.id
                avatarUrl = userProfile.avatarUrl
                name = userProfile.name
                username = userProfile.username
                additionalProperties = userProfile.additionalProperties.toMutableMap()
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

            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Alias for calling [Builder.name] with `name.orElse(null)`. */
            fun name(name: Optional<String>) = name(name.getOrNull())

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [UserProfile].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .avatarUrl()
             * .name()
             * .username()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): UserProfile =
                UserProfile(
                    checkRequired("id", id),
                    checkRequired("avatarUrl", avatarUrl),
                    checkRequired("name", name),
                    checkRequired("username", username),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): UserProfile = apply {
            if (validated) {
                return@apply
            }

            id()
            avatarUrl()
            name()
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
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (username.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UserProfile &&
                id == other.id &&
                avatarUrl == other.avatarUrl &&
                name == other.name &&
                username == other.username &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, avatarUrl, name, username, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UserProfile{id=$id, avatarUrl=$avatarUrl, name=$name, username=$username, additionalProperties=$additionalProperties}"
    }

    class Board
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

            /** Returns a mutable builder for constructing an instance of [Board]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Board]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(board: Board) = apply {
                additionalProperties = board.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Board].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Board = Board(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Board = apply {
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

            return other is Board && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Board{additionalProperties=$additionalProperties}"
    }

    class Location
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

            /** Returns a mutable builder for constructing an instance of [Location]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Location]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(location: Location) = apply {
                additionalProperties = location.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Location].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Location = Location(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Location = apply {
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

            return other is Location && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Location{additionalProperties=$additionalProperties}"
    }

    class Organization
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

            /** Returns a mutable builder for constructing an instance of [Organization]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Organization]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(organization: Organization) = apply {
                additionalProperties = organization.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Organization].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Organization = Organization(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Organization = apply {
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

            return other is Organization && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Organization{additionalProperties=$additionalProperties}"
    }

    class Page
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

            /** Returns a mutable builder for constructing an instance of [Page]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Page]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Page) = apply {
                additionalProperties = page.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Page].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Page = Page(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Page = apply {
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

            return other is Page && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Page{additionalProperties=$additionalProperties}"
    }

    class Profile
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

            /** Returns a mutable builder for constructing an instance of [Profile]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Profile]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(profile: Profile) = apply {
                additionalProperties = profile.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Profile].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Profile = Profile(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Profile = apply {
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

            return other is Profile && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Profile{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConnectFetchPendingDataResponse &&
            platform == other.platform &&
            tempToken == other.tempToken &&
            userProfile == other.userProfile &&
            boards == other.boards &&
            locations == other.locations &&
            organizations == other.organizations &&
            pages == other.pages &&
            profiles == other.profiles &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            platform,
            tempToken,
            userProfile,
            boards,
            locations,
            organizations,
            pages,
            profiles,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConnectFetchPendingDataResponse{platform=$platform, tempToken=$tempToken, userProfile=$userProfile, boards=$boards, locations=$locations, organizations=$organizations, pages=$pages, profiles=$profiles, additionalProperties=$additionalProperties}"
}
