// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.connect.linkedin.organizations

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

class OrganizationListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val organizations: JsonField<List<Organization>>,
    private val personalProfile: JsonField<PersonalProfile>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("organizations")
        @ExcludeMissing
        organizations: JsonField<List<Organization>> = JsonMissing.of(),
        @JsonProperty("personal_profile")
        @ExcludeMissing
        personalProfile: JsonField<PersonalProfile> = JsonMissing.of(),
    ) : this(organizations, personalProfile, mutableMapOf())

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun organizations(): List<Organization> = organizations.getRequired("organizations")

    /**
     * User's personal LinkedIn profile
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun personalProfile(): Optional<PersonalProfile> =
        personalProfile.getOptional("personal_profile")

    /**
     * Returns the raw JSON value of [organizations].
     *
     * Unlike [organizations], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("organizations")
    @ExcludeMissing
    fun _organizations(): JsonField<List<Organization>> = organizations

    /**
     * Returns the raw JSON value of [personalProfile].
     *
     * Unlike [personalProfile], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("personal_profile")
    @ExcludeMissing
    fun _personalProfile(): JsonField<PersonalProfile> = personalProfile

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
         * Returns a mutable builder for constructing an instance of [OrganizationListResponse].
         *
         * The following fields are required:
         * ```java
         * .organizations()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OrganizationListResponse]. */
    class Builder internal constructor() {

        private var organizations: JsonField<MutableList<Organization>>? = null
        private var personalProfile: JsonField<PersonalProfile> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(organizationListResponse: OrganizationListResponse) = apply {
            organizations = organizationListResponse.organizations.map { it.toMutableList() }
            personalProfile = organizationListResponse.personalProfile
            additionalProperties = organizationListResponse.additionalProperties.toMutableMap()
        }

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

        /** User's personal LinkedIn profile */
        fun personalProfile(personalProfile: PersonalProfile) =
            personalProfile(JsonField.of(personalProfile))

        /**
         * Sets [Builder.personalProfile] to an arbitrary JSON value.
         *
         * You should usually call [Builder.personalProfile] with a well-typed [PersonalProfile]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun personalProfile(personalProfile: JsonField<PersonalProfile>) = apply {
            this.personalProfile = personalProfile
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
         * Returns an immutable instance of [OrganizationListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .organizations()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OrganizationListResponse =
            OrganizationListResponse(
                checkRequired("organizations", organizations).map { it.toImmutable() },
                personalProfile,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): OrganizationListResponse = apply {
        if (validated) {
            return@apply
        }

        organizations().forEach { it.validate() }
        personalProfile().ifPresent { it.validate() }
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
        (organizations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (personalProfile.asKnown().getOrNull()?.validity() ?: 0)

    class Organization
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val urn: JsonField<String>,
        private val logoUrl: JsonField<String>,
        private val vanityName: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("urn") @ExcludeMissing urn: JsonField<String> = JsonMissing.of(),
            @JsonProperty("logo_url") @ExcludeMissing logoUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("vanity_name")
            @ExcludeMissing
            vanityName: JsonField<String> = JsonMissing.of(),
        ) : this(name, urn, logoUrl, vanityName, mutableMapOf())

        /**
         * Organization name
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * LinkedIn organization URN
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun urn(): String = urn.getRequired("urn")

        /**
         * Organization logo URL
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun logoUrl(): Optional<String> = logoUrl.getOptional("logo_url")

        /**
         * Organization vanity name
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun vanityName(): Optional<String> = vanityName.getOptional("vanity_name")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [urn].
         *
         * Unlike [urn], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("urn") @ExcludeMissing fun _urn(): JsonField<String> = urn

        /**
         * Returns the raw JSON value of [logoUrl].
         *
         * Unlike [logoUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("logo_url") @ExcludeMissing fun _logoUrl(): JsonField<String> = logoUrl

        /**
         * Returns the raw JSON value of [vanityName].
         *
         * Unlike [vanityName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("vanity_name")
        @ExcludeMissing
        fun _vanityName(): JsonField<String> = vanityName

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
             * Returns a mutable builder for constructing an instance of [Organization].
             *
             * The following fields are required:
             * ```java
             * .name()
             * .urn()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Organization]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var urn: JsonField<String>? = null
            private var logoUrl: JsonField<String> = JsonMissing.of()
            private var vanityName: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(organization: Organization) = apply {
                name = organization.name
                urn = organization.urn
                logoUrl = organization.logoUrl
                vanityName = organization.vanityName
                additionalProperties = organization.additionalProperties.toMutableMap()
            }

            /** Organization name */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** LinkedIn organization URN */
            fun urn(urn: String) = urn(JsonField.of(urn))

            /**
             * Sets [Builder.urn] to an arbitrary JSON value.
             *
             * You should usually call [Builder.urn] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun urn(urn: JsonField<String>) = apply { this.urn = urn }

            /** Organization logo URL */
            fun logoUrl(logoUrl: String?) = logoUrl(JsonField.ofNullable(logoUrl))

            /** Alias for calling [Builder.logoUrl] with `logoUrl.orElse(null)`. */
            fun logoUrl(logoUrl: Optional<String>) = logoUrl(logoUrl.getOrNull())

            /**
             * Sets [Builder.logoUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.logoUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun logoUrl(logoUrl: JsonField<String>) = apply { this.logoUrl = logoUrl }

            /** Organization vanity name */
            fun vanityName(vanityName: String?) = vanityName(JsonField.ofNullable(vanityName))

            /** Alias for calling [Builder.vanityName] with `vanityName.orElse(null)`. */
            fun vanityName(vanityName: Optional<String>) = vanityName(vanityName.getOrNull())

            /**
             * Sets [Builder.vanityName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vanityName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vanityName(vanityName: JsonField<String>) = apply { this.vanityName = vanityName }

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
             *
             * The following fields are required:
             * ```java
             * .name()
             * .urn()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Organization =
                Organization(
                    checkRequired("name", name),
                    checkRequired("urn", urn),
                    logoUrl,
                    vanityName,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Organization = apply {
            if (validated) {
                return@apply
            }

            name()
            urn()
            logoUrl()
            vanityName()
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
            (if (name.asKnown().isPresent) 1 else 0) +
                (if (urn.asKnown().isPresent) 1 else 0) +
                (if (logoUrl.asKnown().isPresent) 1 else 0) +
                (if (vanityName.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Organization &&
                name == other.name &&
                urn == other.urn &&
                logoUrl == other.logoUrl &&
                vanityName == other.vanityName &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(name, urn, logoUrl, vanityName, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Organization{name=$name, urn=$urn, logoUrl=$logoUrl, vanityName=$vanityName, additionalProperties=$additionalProperties}"
    }

    /** User's personal LinkedIn profile */
    class PersonalProfile
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val urn: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("urn") @ExcludeMissing urn: JsonField<String> = JsonMissing.of(),
        ) : this(name, urn, mutableMapOf())

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun urn(): String = urn.getRequired("urn")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [urn].
         *
         * Unlike [urn], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("urn") @ExcludeMissing fun _urn(): JsonField<String> = urn

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
             * Returns a mutable builder for constructing an instance of [PersonalProfile].
             *
             * The following fields are required:
             * ```java
             * .name()
             * .urn()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PersonalProfile]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var urn: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(personalProfile: PersonalProfile) = apply {
                name = personalProfile.name
                urn = personalProfile.urn
                additionalProperties = personalProfile.additionalProperties.toMutableMap()
            }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun urn(urn: String) = urn(JsonField.of(urn))

            /**
             * Sets [Builder.urn] to an arbitrary JSON value.
             *
             * You should usually call [Builder.urn] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun urn(urn: JsonField<String>) = apply { this.urn = urn }

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
             * Returns an immutable instance of [PersonalProfile].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .name()
             * .urn()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PersonalProfile =
                PersonalProfile(
                    checkRequired("name", name),
                    checkRequired("urn", urn),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PersonalProfile = apply {
            if (validated) {
                return@apply
            }

            name()
            urn()
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
            (if (name.asKnown().isPresent) 1 else 0) + (if (urn.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PersonalProfile &&
                name == other.name &&
                urn == other.urn &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(name, urn, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PersonalProfile{name=$name, urn=$urn, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OrganizationListResponse &&
            organizations == other.organizations &&
            personalProfile == other.personalProfile &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(organizations, personalProfile, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OrganizationListResponse{organizations=$organizations, personalProfile=$personalProfile, additionalProperties=$additionalProperties}"
}
