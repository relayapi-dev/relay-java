// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.connect.snapchat.profiles

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

class ProfileListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val profiles: JsonField<List<Profile>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("profiles")
        @ExcludeMissing
        profiles: JsonField<List<Profile>> = JsonMissing.of()
    ) : this(profiles, mutableMapOf())

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun profiles(): List<Profile> = profiles.getRequired("profiles")

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
         * Returns a mutable builder for constructing an instance of [ProfileListResponse].
         *
         * The following fields are required:
         * ```java
         * .profiles()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProfileListResponse]. */
    class Builder internal constructor() {

        private var profiles: JsonField<MutableList<Profile>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(profileListResponse: ProfileListResponse) = apply {
            profiles = profileListResponse.profiles.map { it.toMutableList() }
            additionalProperties = profileListResponse.additionalProperties.toMutableMap()
        }

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
         * Returns an immutable instance of [ProfileListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .profiles()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ProfileListResponse =
            ProfileListResponse(
                checkRequired("profiles", profiles).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ProfileListResponse = apply {
        if (validated) {
            return@apply
        }

        profiles().forEach { it.validate() }
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
        (profiles.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Profile
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val displayName: JsonField<String>,
        private val username: JsonField<String>,
        private val profileImageUrl: JsonField<String>,
        private val subscriberCount: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("display_name")
            @ExcludeMissing
            displayName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("username")
            @ExcludeMissing
            username: JsonField<String> = JsonMissing.of(),
            @JsonProperty("profile_image_url")
            @ExcludeMissing
            profileImageUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("subscriber_count")
            @ExcludeMissing
            subscriberCount: JsonField<Long> = JsonMissing.of(),
        ) : this(id, displayName, username, profileImageUrl, subscriberCount, mutableMapOf())

        /**
         * Snapchat profile ID
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Display name
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun displayName(): String = displayName.getRequired("display_name")

        /**
         * Snapchat username
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun username(): String = username.getRequired("username")

        /**
         * Profile image URL
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun profileImageUrl(): Optional<String> = profileImageUrl.getOptional("profile_image_url")

        /**
         * Number of subscribers
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun subscriberCount(): Optional<Long> = subscriberCount.getOptional("subscriber_count")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [displayName].
         *
         * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("display_name")
        @ExcludeMissing
        fun _displayName(): JsonField<String> = displayName

        /**
         * Returns the raw JSON value of [username].
         *
         * Unlike [username], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("username") @ExcludeMissing fun _username(): JsonField<String> = username

        /**
         * Returns the raw JSON value of [profileImageUrl].
         *
         * Unlike [profileImageUrl], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("profile_image_url")
        @ExcludeMissing
        fun _profileImageUrl(): JsonField<String> = profileImageUrl

        /**
         * Returns the raw JSON value of [subscriberCount].
         *
         * Unlike [subscriberCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("subscriber_count")
        @ExcludeMissing
        fun _subscriberCount(): JsonField<Long> = subscriberCount

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
             * Returns a mutable builder for constructing an instance of [Profile].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .displayName()
             * .username()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Profile]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var displayName: JsonField<String>? = null
            private var username: JsonField<String>? = null
            private var profileImageUrl: JsonField<String> = JsonMissing.of()
            private var subscriberCount: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(profile: Profile) = apply {
                id = profile.id
                displayName = profile.displayName
                username = profile.username
                profileImageUrl = profile.profileImageUrl
                subscriberCount = profile.subscriberCount
                additionalProperties = profile.additionalProperties.toMutableMap()
            }

            /** Snapchat profile ID */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Display name */
            fun displayName(displayName: String) = displayName(JsonField.of(displayName))

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

            /** Snapchat username */
            fun username(username: String) = username(JsonField.of(username))

            /**
             * Sets [Builder.username] to an arbitrary JSON value.
             *
             * You should usually call [Builder.username] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun username(username: JsonField<String>) = apply { this.username = username }

            /** Profile image URL */
            fun profileImageUrl(profileImageUrl: String?) =
                profileImageUrl(JsonField.ofNullable(profileImageUrl))

            /** Alias for calling [Builder.profileImageUrl] with `profileImageUrl.orElse(null)`. */
            fun profileImageUrl(profileImageUrl: Optional<String>) =
                profileImageUrl(profileImageUrl.getOrNull())

            /**
             * Sets [Builder.profileImageUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.profileImageUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun profileImageUrl(profileImageUrl: JsonField<String>) = apply {
                this.profileImageUrl = profileImageUrl
            }

            /** Number of subscribers */
            fun subscriberCount(subscriberCount: Long) =
                subscriberCount(JsonField.of(subscriberCount))

            /**
             * Sets [Builder.subscriberCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscriberCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subscriberCount(subscriberCount: JsonField<Long>) = apply {
                this.subscriberCount = subscriberCount
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
             *
             * The following fields are required:
             * ```java
             * .id()
             * .displayName()
             * .username()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Profile =
                Profile(
                    checkRequired("id", id),
                    checkRequired("displayName", displayName),
                    checkRequired("username", username),
                    profileImageUrl,
                    subscriberCount,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Profile = apply {
            if (validated) {
                return@apply
            }

            id()
            displayName()
            username()
            profileImageUrl()
            subscriberCount()
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
                (if (displayName.asKnown().isPresent) 1 else 0) +
                (if (username.asKnown().isPresent) 1 else 0) +
                (if (profileImageUrl.asKnown().isPresent) 1 else 0) +
                (if (subscriberCount.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Profile &&
                id == other.id &&
                displayName == other.displayName &&
                username == other.username &&
                profileImageUrl == other.profileImageUrl &&
                subscriberCount == other.subscriberCount &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                displayName,
                username,
                profileImageUrl,
                subscriberCount,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Profile{id=$id, displayName=$displayName, username=$username, profileImageUrl=$profileImageUrl, subscriberCount=$subscriberCount, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProfileListResponse &&
            profiles == other.profiles &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(profiles, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProfileListResponse{profiles=$profiles, additionalProperties=$additionalProperties}"
}
