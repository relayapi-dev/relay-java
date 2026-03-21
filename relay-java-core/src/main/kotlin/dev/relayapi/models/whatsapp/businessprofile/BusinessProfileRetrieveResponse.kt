// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.whatsapp.businessprofile

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.relayapi.core.ExcludeMissing
import dev.relayapi.core.JsonField
import dev.relayapi.core.JsonMissing
import dev.relayapi.core.JsonValue
import dev.relayapi.core.checkKnown
import dev.relayapi.core.toImmutable
import dev.relayapi.errors.RelayInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class BusinessProfileRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val about: JsonField<String>,
    private val address: JsonField<String>,
    private val description: JsonField<String>,
    private val email: JsonField<String>,
    private val profilePictureUrl: JsonField<String>,
    private val websites: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("about") @ExcludeMissing about: JsonField<String> = JsonMissing.of(),
        @JsonProperty("address") @ExcludeMissing address: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("profile_picture_url")
        @ExcludeMissing
        profilePictureUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("websites")
        @ExcludeMissing
        websites: JsonField<List<String>> = JsonMissing.of(),
    ) : this(about, address, description, email, profilePictureUrl, websites, mutableMapOf())

    /**
     * About text
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun about(): Optional<String> = about.getOptional("about")

    /**
     * Business address
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun address(): Optional<String> = address.getOptional("address")

    /**
     * Description
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * Business email
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun email(): Optional<String> = email.getOptional("email")

    /**
     * Profile picture URL
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun profilePictureUrl(): Optional<String> = profilePictureUrl.getOptional("profile_picture_url")

    /**
     * Website URLs
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun websites(): Optional<List<String>> = websites.getOptional("websites")

    /**
     * Returns the raw JSON value of [about].
     *
     * Unlike [about], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("about") @ExcludeMissing fun _about(): JsonField<String> = about

    /**
     * Returns the raw JSON value of [address].
     *
     * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<String> = address

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [profilePictureUrl].
     *
     * Unlike [profilePictureUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("profile_picture_url")
    @ExcludeMissing
    fun _profilePictureUrl(): JsonField<String> = profilePictureUrl

    /**
     * Returns the raw JSON value of [websites].
     *
     * Unlike [websites], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("websites") @ExcludeMissing fun _websites(): JsonField<List<String>> = websites

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
         * [BusinessProfileRetrieveResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BusinessProfileRetrieveResponse]. */
    class Builder internal constructor() {

        private var about: JsonField<String> = JsonMissing.of()
        private var address: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var profilePictureUrl: JsonField<String> = JsonMissing.of()
        private var websites: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(businessProfileRetrieveResponse: BusinessProfileRetrieveResponse) =
            apply {
                about = businessProfileRetrieveResponse.about
                address = businessProfileRetrieveResponse.address
                description = businessProfileRetrieveResponse.description
                email = businessProfileRetrieveResponse.email
                profilePictureUrl = businessProfileRetrieveResponse.profilePictureUrl
                websites = businessProfileRetrieveResponse.websites.map { it.toMutableList() }
                additionalProperties =
                    businessProfileRetrieveResponse.additionalProperties.toMutableMap()
            }

        /** About text */
        fun about(about: String?) = about(JsonField.ofNullable(about))

        /** Alias for calling [Builder.about] with `about.orElse(null)`. */
        fun about(about: Optional<String>) = about(about.getOrNull())

        /**
         * Sets [Builder.about] to an arbitrary JSON value.
         *
         * You should usually call [Builder.about] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun about(about: JsonField<String>) = apply { this.about = about }

        /** Business address */
        fun address(address: String?) = address(JsonField.ofNullable(address))

        /** Alias for calling [Builder.address] with `address.orElse(null)`. */
        fun address(address: Optional<String>) = address(address.getOrNull())

        /**
         * Sets [Builder.address] to an arbitrary JSON value.
         *
         * You should usually call [Builder.address] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun address(address: JsonField<String>) = apply { this.address = address }

        /** Description */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** Business email */
        fun email(email: String?) = email(JsonField.ofNullable(email))

        /** Alias for calling [Builder.email] with `email.orElse(null)`. */
        fun email(email: Optional<String>) = email(email.getOrNull())

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** Profile picture URL */
        fun profilePictureUrl(profilePictureUrl: String?) =
            profilePictureUrl(JsonField.ofNullable(profilePictureUrl))

        /** Alias for calling [Builder.profilePictureUrl] with `profilePictureUrl.orElse(null)`. */
        fun profilePictureUrl(profilePictureUrl: Optional<String>) =
            profilePictureUrl(profilePictureUrl.getOrNull())

        /**
         * Sets [Builder.profilePictureUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.profilePictureUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun profilePictureUrl(profilePictureUrl: JsonField<String>) = apply {
            this.profilePictureUrl = profilePictureUrl
        }

        /** Website URLs */
        fun websites(websites: List<String>) = websites(JsonField.of(websites))

        /**
         * Sets [Builder.websites] to an arbitrary JSON value.
         *
         * You should usually call [Builder.websites] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun websites(websites: JsonField<List<String>>) = apply {
            this.websites = websites.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [websites].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addWebsite(website: String) = apply {
            websites =
                (websites ?: JsonField.of(mutableListOf())).also {
                    checkKnown("websites", it).add(website)
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
         * Returns an immutable instance of [BusinessProfileRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BusinessProfileRetrieveResponse =
            BusinessProfileRetrieveResponse(
                about,
                address,
                description,
                email,
                profilePictureUrl,
                (websites ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BusinessProfileRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        about()
        address()
        description()
        email()
        profilePictureUrl()
        websites()
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
        (if (about.asKnown().isPresent) 1 else 0) +
            (if (address.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (email.asKnown().isPresent) 1 else 0) +
            (if (profilePictureUrl.asKnown().isPresent) 1 else 0) +
            (websites.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BusinessProfileRetrieveResponse &&
            about == other.about &&
            address == other.address &&
            description == other.description &&
            email == other.email &&
            profilePictureUrl == other.profilePictureUrl &&
            websites == other.websites &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            about,
            address,
            description,
            email,
            profilePictureUrl,
            websites,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BusinessProfileRetrieveResponse{about=$about, address=$address, description=$description, email=$email, profilePictureUrl=$profilePictureUrl, websites=$websites, additionalProperties=$additionalProperties}"
}
