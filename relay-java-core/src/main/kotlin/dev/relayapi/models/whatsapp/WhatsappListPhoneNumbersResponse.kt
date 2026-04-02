// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.whatsapp

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

class WhatsappListPhoneNumbersResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): List<Data> = data.getRequired("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

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
         * [WhatsappListPhoneNumbersResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WhatsappListPhoneNumbersResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(whatsappListPhoneNumbersResponse: WhatsappListPhoneNumbersResponse) =
            apply {
                data = whatsappListPhoneNumbersResponse.data.map { it.toMutableList() }
                additionalProperties =
                    whatsappListPhoneNumbersResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [WhatsappListPhoneNumbersResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WhatsappListPhoneNumbersResponse =
            WhatsappListPhoneNumbersResponse(
                checkRequired("data", data).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): WhatsappListPhoneNumbersResponse = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
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
        (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val country: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val monthlyCostCents: JsonField<Double>,
        private val phoneNumber: JsonField<String>,
        private val provider: JsonField<String>,
        private val status: JsonField<Status>,
        private val socialAccountId: JsonField<String>,
        private val waPhoneNumberId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("monthly_cost_cents")
            @ExcludeMissing
            monthlyCostCents: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("provider")
            @ExcludeMissing
            provider: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("social_account_id")
            @ExcludeMissing
            socialAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("wa_phone_number_id")
            @ExcludeMissing
            waPhoneNumberId: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            country,
            createdAt,
            monthlyCostCents,
            phoneNumber,
            provider,
            status,
            socialAccountId,
            waPhoneNumberId,
            mutableMapOf(),
        )

        /**
         * Phone number resource ID
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * ISO country code
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun country(): String = country.getRequired("country")

        /**
         * Created timestamp
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * Monthly cost in cents
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun monthlyCostCents(): Double = monthlyCostCents.getRequired("monthly_cost_cents")

        /**
         * E.164 phone number
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun phoneNumber(): String = phoneNumber.getRequired("phone_number")

        /**
         * Carrier provider
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun provider(): String = provider.getRequired("provider")

        /**
         * Provisioning status
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * Linked RelayAPI social account ID
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun socialAccountId(): Optional<String> = socialAccountId.getOptional("social_account_id")

        /**
         * Meta WhatsApp phone number ID
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun waPhoneNumberId(): Optional<String> = waPhoneNumberId.getOptional("wa_phone_number_id")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [country].
         *
         * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [monthlyCostCents].
         *
         * Unlike [monthlyCostCents], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("monthly_cost_cents")
        @ExcludeMissing
        fun _monthlyCostCents(): JsonField<Double> = monthlyCostCents

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

        /**
         * Returns the raw JSON value of [provider].
         *
         * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<String> = provider

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [socialAccountId].
         *
         * Unlike [socialAccountId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("social_account_id")
        @ExcludeMissing
        fun _socialAccountId(): JsonField<String> = socialAccountId

        /**
         * Returns the raw JSON value of [waPhoneNumberId].
         *
         * Unlike [waPhoneNumberId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("wa_phone_number_id")
        @ExcludeMissing
        fun _waPhoneNumberId(): JsonField<String> = waPhoneNumberId

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
             * .country()
             * .createdAt()
             * .monthlyCostCents()
             * .phoneNumber()
             * .provider()
             * .status()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var country: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var monthlyCostCents: JsonField<Double>? = null
            private var phoneNumber: JsonField<String>? = null
            private var provider: JsonField<String>? = null
            private var status: JsonField<Status>? = null
            private var socialAccountId: JsonField<String> = JsonMissing.of()
            private var waPhoneNumberId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                country = data.country
                createdAt = data.createdAt
                monthlyCostCents = data.monthlyCostCents
                phoneNumber = data.phoneNumber
                provider = data.provider
                status = data.status
                socialAccountId = data.socialAccountId
                waPhoneNumberId = data.waPhoneNumberId
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Phone number resource ID */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** ISO country code */
            fun country(country: String) = country(JsonField.of(country))

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

            /** Created timestamp */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** Monthly cost in cents */
            fun monthlyCostCents(monthlyCostCents: Double) =
                monthlyCostCents(JsonField.of(monthlyCostCents))

            /**
             * Sets [Builder.monthlyCostCents] to an arbitrary JSON value.
             *
             * You should usually call [Builder.monthlyCostCents] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun monthlyCostCents(monthlyCostCents: JsonField<Double>) = apply {
                this.monthlyCostCents = monthlyCostCents
            }

            /** E.164 phone number */
            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

            /**
             * Sets [Builder.phoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
            }

            /** Carrier provider */
            fun provider(provider: String) = provider(JsonField.of(provider))

            /**
             * Sets [Builder.provider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provider] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonField<String>) = apply { this.provider = provider }

            /** Provisioning status */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** Linked RelayAPI social account ID */
            fun socialAccountId(socialAccountId: String?) =
                socialAccountId(JsonField.ofNullable(socialAccountId))

            /** Alias for calling [Builder.socialAccountId] with `socialAccountId.orElse(null)`. */
            fun socialAccountId(socialAccountId: Optional<String>) =
                socialAccountId(socialAccountId.getOrNull())

            /**
             * Sets [Builder.socialAccountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.socialAccountId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun socialAccountId(socialAccountId: JsonField<String>) = apply {
                this.socialAccountId = socialAccountId
            }

            /** Meta WhatsApp phone number ID */
            fun waPhoneNumberId(waPhoneNumberId: String?) =
                waPhoneNumberId(JsonField.ofNullable(waPhoneNumberId))

            /** Alias for calling [Builder.waPhoneNumberId] with `waPhoneNumberId.orElse(null)`. */
            fun waPhoneNumberId(waPhoneNumberId: Optional<String>) =
                waPhoneNumberId(waPhoneNumberId.getOrNull())

            /**
             * Sets [Builder.waPhoneNumberId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.waPhoneNumberId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun waPhoneNumberId(waPhoneNumberId: JsonField<String>) = apply {
                this.waPhoneNumberId = waPhoneNumberId
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .country()
             * .createdAt()
             * .monthlyCostCents()
             * .phoneNumber()
             * .provider()
             * .status()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("id", id),
                    checkRequired("country", country),
                    checkRequired("createdAt", createdAt),
                    checkRequired("monthlyCostCents", monthlyCostCents),
                    checkRequired("phoneNumber", phoneNumber),
                    checkRequired("provider", provider),
                    checkRequired("status", status),
                    socialAccountId,
                    waPhoneNumberId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            country()
            createdAt()
            monthlyCostCents()
            phoneNumber()
            provider()
            status().validate()
            socialAccountId()
            waPhoneNumberId()
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
                (if (country.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (monthlyCostCents.asKnown().isPresent) 1 else 0) +
                (if (phoneNumber.asKnown().isPresent) 1 else 0) +
                (if (provider.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (socialAccountId.asKnown().isPresent) 1 else 0) +
                (if (waPhoneNumberId.asKnown().isPresent) 1 else 0)

        /** Provisioning status */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val PURCHASING = of("purchasing")

                @JvmField val PENDING_VERIFICATION = of("pending_verification")

                @JvmField val VERIFIED = of("verified")

                @JvmField val ACTIVE = of("active")

                @JvmField val RELEASING = of("releasing")

                @JvmField val RELEASED = of("released")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                PURCHASING,
                PENDING_VERIFICATION,
                VERIFIED,
                ACTIVE,
                RELEASING,
                RELEASED,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PURCHASING,
                PENDING_VERIFICATION,
                VERIFIED,
                ACTIVE,
                RELEASING,
                RELEASED,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
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
                    PURCHASING -> Value.PURCHASING
                    PENDING_VERIFICATION -> Value.PENDING_VERIFICATION
                    VERIFIED -> Value.VERIFIED
                    ACTIVE -> Value.ACTIVE
                    RELEASING -> Value.RELEASING
                    RELEASED -> Value.RELEASED
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
                    PURCHASING -> Known.PURCHASING
                    PENDING_VERIFICATION -> Known.PENDING_VERIFICATION
                    VERIFIED -> Known.VERIFIED
                    ACTIVE -> Known.ACTIVE
                    RELEASING -> Known.RELEASING
                    RELEASED -> Known.RELEASED
                    else -> throw RelayInvalidDataException("Unknown Status: $value")
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

            fun validate(): Status = apply {
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

                return other is Status && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                country == other.country &&
                createdAt == other.createdAt &&
                monthlyCostCents == other.monthlyCostCents &&
                phoneNumber == other.phoneNumber &&
                provider == other.provider &&
                status == other.status &&
                socialAccountId == other.socialAccountId &&
                waPhoneNumberId == other.waPhoneNumberId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                country,
                createdAt,
                monthlyCostCents,
                phoneNumber,
                provider,
                status,
                socialAccountId,
                waPhoneNumberId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, country=$country, createdAt=$createdAt, monthlyCostCents=$monthlyCostCents, phoneNumber=$phoneNumber, provider=$provider, status=$status, socialAccountId=$socialAccountId, waPhoneNumberId=$waPhoneNumberId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WhatsappListPhoneNumbersResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WhatsappListPhoneNumbersResponse{data=$data, additionalProperties=$additionalProperties}"
}
