// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.usage

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
import dev.relayapi.errors.RelayInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class UsageRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val plan: JsonField<Plan>,
    private val rateLimit: JsonField<RateLimit>,
    private val subscription: JsonField<Subscription>,
    private val usage: JsonField<Usage>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("plan") @ExcludeMissing plan: JsonField<Plan> = JsonMissing.of(),
        @JsonProperty("rate_limit")
        @ExcludeMissing
        rateLimit: JsonField<RateLimit> = JsonMissing.of(),
        @JsonProperty("subscription")
        @ExcludeMissing
        subscription: JsonField<Subscription> = JsonMissing.of(),
        @JsonProperty("usage") @ExcludeMissing usage: JsonField<Usage> = JsonMissing.of(),
    ) : this(plan, rateLimit, subscription, usage, mutableMapOf())

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun plan(): Plan = plan.getRequired("plan")

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rateLimit(): RateLimit = rateLimit.getRequired("rate_limit")

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscription(): Subscription = subscription.getRequired("subscription")

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun usage(): Usage = usage.getRequired("usage")

    /**
     * Returns the raw JSON value of [plan].
     *
     * Unlike [plan], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("plan") @ExcludeMissing fun _plan(): JsonField<Plan> = plan

    /**
     * Returns the raw JSON value of [rateLimit].
     *
     * Unlike [rateLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rate_limit") @ExcludeMissing fun _rateLimit(): JsonField<RateLimit> = rateLimit

    /**
     * Returns the raw JSON value of [subscription].
     *
     * Unlike [subscription], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subscription")
    @ExcludeMissing
    fun _subscription(): JsonField<Subscription> = subscription

    /**
     * Returns the raw JSON value of [usage].
     *
     * Unlike [usage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("usage") @ExcludeMissing fun _usage(): JsonField<Usage> = usage

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
         * Returns a mutable builder for constructing an instance of [UsageRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .plan()
         * .rateLimit()
         * .subscription()
         * .usage()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UsageRetrieveResponse]. */
    class Builder internal constructor() {

        private var plan: JsonField<Plan>? = null
        private var rateLimit: JsonField<RateLimit>? = null
        private var subscription: JsonField<Subscription>? = null
        private var usage: JsonField<Usage>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(usageRetrieveResponse: UsageRetrieveResponse) = apply {
            plan = usageRetrieveResponse.plan
            rateLimit = usageRetrieveResponse.rateLimit
            subscription = usageRetrieveResponse.subscription
            usage = usageRetrieveResponse.usage
            additionalProperties = usageRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun plan(plan: Plan) = plan(JsonField.of(plan))

        /**
         * Sets [Builder.plan] to an arbitrary JSON value.
         *
         * You should usually call [Builder.plan] with a well-typed [Plan] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun plan(plan: JsonField<Plan>) = apply { this.plan = plan }

        fun rateLimit(rateLimit: RateLimit) = rateLimit(JsonField.of(rateLimit))

        /**
         * Sets [Builder.rateLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rateLimit] with a well-typed [RateLimit] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rateLimit(rateLimit: JsonField<RateLimit>) = apply { this.rateLimit = rateLimit }

        fun subscription(subscription: Subscription) = subscription(JsonField.of(subscription))

        /**
         * Sets [Builder.subscription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscription] with a well-typed [Subscription] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subscription(subscription: JsonField<Subscription>) = apply {
            this.subscription = subscription
        }

        fun usage(usage: Usage) = usage(JsonField.of(usage))

        /**
         * Sets [Builder.usage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usage] with a well-typed [Usage] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun usage(usage: JsonField<Usage>) = apply { this.usage = usage }

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
         * Returns an immutable instance of [UsageRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .plan()
         * .rateLimit()
         * .subscription()
         * .usage()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UsageRetrieveResponse =
            UsageRetrieveResponse(
                checkRequired("plan", plan),
                checkRequired("rateLimit", rateLimit),
                checkRequired("subscription", subscription),
                checkRequired("usage", usage),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UsageRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        plan().validate()
        rateLimit().validate()
        subscription().validate()
        usage().validate()
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
        (plan.asKnown().getOrNull()?.validity() ?: 0) +
            (rateLimit.asKnown().getOrNull()?.validity() ?: 0) +
            (subscription.asKnown().getOrNull()?.validity() ?: 0) +
            (usage.asKnown().getOrNull()?.validity() ?: 0)

    class Plan
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val apiCallsLimit: JsonField<Double>,
        private val apiCallsPerMin: JsonField<Double>,
        private val features: JsonField<Features>,
        private val name: JsonField<Name>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("api_calls_limit")
            @ExcludeMissing
            apiCallsLimit: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("api_calls_per_min")
            @ExcludeMissing
            apiCallsPerMin: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("features")
            @ExcludeMissing
            features: JsonField<Features> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<Name> = JsonMissing.of(),
        ) : this(apiCallsLimit, apiCallsPerMin, features, name, mutableMapOf())

        /**
         * API calls included per billing cycle
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun apiCallsLimit(): Double = apiCallsLimit.getRequired("api_calls_limit")

        /**
         * API calls allowed per minute
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun apiCallsPerMin(): Double = apiCallsPerMin.getRequired("api_calls_per_min")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun features(): Features = features.getRequired("features")

        /**
         * Current plan
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): Name = name.getRequired("name")

        /**
         * Returns the raw JSON value of [apiCallsLimit].
         *
         * Unlike [apiCallsLimit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("api_calls_limit")
        @ExcludeMissing
        fun _apiCallsLimit(): JsonField<Double> = apiCallsLimit

        /**
         * Returns the raw JSON value of [apiCallsPerMin].
         *
         * Unlike [apiCallsPerMin], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("api_calls_per_min")
        @ExcludeMissing
        fun _apiCallsPerMin(): JsonField<Double> = apiCallsPerMin

        /**
         * Returns the raw JSON value of [features].
         *
         * Unlike [features], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("features") @ExcludeMissing fun _features(): JsonField<Features> = features

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<Name> = name

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
             * Returns a mutable builder for constructing an instance of [Plan].
             *
             * The following fields are required:
             * ```java
             * .apiCallsLimit()
             * .apiCallsPerMin()
             * .features()
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Plan]. */
        class Builder internal constructor() {

            private var apiCallsLimit: JsonField<Double>? = null
            private var apiCallsPerMin: JsonField<Double>? = null
            private var features: JsonField<Features>? = null
            private var name: JsonField<Name>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(plan: Plan) = apply {
                apiCallsLimit = plan.apiCallsLimit
                apiCallsPerMin = plan.apiCallsPerMin
                features = plan.features
                name = plan.name
                additionalProperties = plan.additionalProperties.toMutableMap()
            }

            /** API calls included per billing cycle */
            fun apiCallsLimit(apiCallsLimit: Double) = apiCallsLimit(JsonField.of(apiCallsLimit))

            /**
             * Sets [Builder.apiCallsLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.apiCallsLimit] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun apiCallsLimit(apiCallsLimit: JsonField<Double>) = apply {
                this.apiCallsLimit = apiCallsLimit
            }

            /** API calls allowed per minute */
            fun apiCallsPerMin(apiCallsPerMin: Double) =
                apiCallsPerMin(JsonField.of(apiCallsPerMin))

            /**
             * Sets [Builder.apiCallsPerMin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.apiCallsPerMin] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun apiCallsPerMin(apiCallsPerMin: JsonField<Double>) = apply {
                this.apiCallsPerMin = apiCallsPerMin
            }

            fun features(features: Features) = features(JsonField.of(features))

            /**
             * Sets [Builder.features] to an arbitrary JSON value.
             *
             * You should usually call [Builder.features] with a well-typed [Features] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun features(features: JsonField<Features>) = apply { this.features = features }

            /** Current plan */
            fun name(name: Name) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [Name] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<Name>) = apply { this.name = name }

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
             * Returns an immutable instance of [Plan].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .apiCallsLimit()
             * .apiCallsPerMin()
             * .features()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Plan =
                Plan(
                    checkRequired("apiCallsLimit", apiCallsLimit),
                    checkRequired("apiCallsPerMin", apiCallsPerMin),
                    checkRequired("features", features),
                    checkRequired("name", name),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Plan = apply {
            if (validated) {
                return@apply
            }

            apiCallsLimit()
            apiCallsPerMin()
            features().validate()
            name().validate()
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
            (if (apiCallsLimit.asKnown().isPresent) 1 else 0) +
                (if (apiCallsPerMin.asKnown().isPresent) 1 else 0) +
                (features.asKnown().getOrNull()?.validity() ?: 0) +
                (name.asKnown().getOrNull()?.validity() ?: 0)

        class Features
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val analytics: JsonField<Boolean>,
            private val inbox: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("analytics")
                @ExcludeMissing
                analytics: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("inbox") @ExcludeMissing inbox: JsonField<Boolean> = JsonMissing.of(),
            ) : this(analytics, inbox, mutableMapOf())

            /**
             * Access to /v1/analytics
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun analytics(): Boolean = analytics.getRequired("analytics")

            /**
             * Access to /v1/inbox
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun inbox(): Boolean = inbox.getRequired("inbox")

            /**
             * Returns the raw JSON value of [analytics].
             *
             * Unlike [analytics], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("analytics")
            @ExcludeMissing
            fun _analytics(): JsonField<Boolean> = analytics

            /**
             * Returns the raw JSON value of [inbox].
             *
             * Unlike [inbox], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("inbox") @ExcludeMissing fun _inbox(): JsonField<Boolean> = inbox

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
                 * Returns a mutable builder for constructing an instance of [Features].
                 *
                 * The following fields are required:
                 * ```java
                 * .analytics()
                 * .inbox()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Features]. */
            class Builder internal constructor() {

                private var analytics: JsonField<Boolean>? = null
                private var inbox: JsonField<Boolean>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(features: Features) = apply {
                    analytics = features.analytics
                    inbox = features.inbox
                    additionalProperties = features.additionalProperties.toMutableMap()
                }

                /** Access to /v1/analytics */
                fun analytics(analytics: Boolean) = analytics(JsonField.of(analytics))

                /**
                 * Sets [Builder.analytics] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.analytics] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun analytics(analytics: JsonField<Boolean>) = apply { this.analytics = analytics }

                /** Access to /v1/inbox */
                fun inbox(inbox: Boolean) = inbox(JsonField.of(inbox))

                /**
                 * Sets [Builder.inbox] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.inbox] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun inbox(inbox: JsonField<Boolean>) = apply { this.inbox = inbox }

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
                 * Returns an immutable instance of [Features].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .analytics()
                 * .inbox()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Features =
                    Features(
                        checkRequired("analytics", analytics),
                        checkRequired("inbox", inbox),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Features = apply {
                if (validated) {
                    return@apply
                }

                analytics()
                inbox()
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
                (if (analytics.asKnown().isPresent) 1 else 0) +
                    (if (inbox.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Features &&
                    analytics == other.analytics &&
                    inbox == other.inbox &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(analytics, inbox, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Features{analytics=$analytics, inbox=$inbox, additionalProperties=$additionalProperties}"
        }

        /** Current plan */
        class Name @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val FREE = of("free")

                @JvmField val PRO = of("pro")

                @JvmStatic fun of(value: String) = Name(JsonField.of(value))
            }

            /** An enum containing [Name]'s known values. */
            enum class Known {
                FREE,
                PRO,
            }

            /**
             * An enum containing [Name]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Name] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                FREE,
                PRO,
                /** An enum member indicating that [Name] was instantiated with an unknown value. */
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
                    FREE -> Value.FREE
                    PRO -> Value.PRO
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
                    FREE -> Known.FREE
                    PRO -> Known.PRO
                    else -> throw RelayInvalidDataException("Unknown Name: $value")
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

            fun validate(): Name = apply {
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

                return other is Name && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Plan &&
                apiCallsLimit == other.apiCallsLimit &&
                apiCallsPerMin == other.apiCallsPerMin &&
                features == other.features &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(apiCallsLimit, apiCallsPerMin, features, name, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Plan{apiCallsLimit=$apiCallsLimit, apiCallsPerMin=$apiCallsPerMin, features=$features, name=$name, additionalProperties=$additionalProperties}"
    }

    class RateLimit
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val limitPerMinute: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("limit_per_minute")
            @ExcludeMissing
            limitPerMinute: JsonField<Double> = JsonMissing.of()
        ) : this(limitPerMinute, mutableMapOf())

        /**
         * Max API calls per rate-limit window
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun limitPerMinute(): Double = limitPerMinute.getRequired("limit_per_minute")

        /**
         * Returns the raw JSON value of [limitPerMinute].
         *
         * Unlike [limitPerMinute], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("limit_per_minute")
        @ExcludeMissing
        fun _limitPerMinute(): JsonField<Double> = limitPerMinute

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
             * Returns a mutable builder for constructing an instance of [RateLimit].
             *
             * The following fields are required:
             * ```java
             * .limitPerMinute()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RateLimit]. */
        class Builder internal constructor() {

            private var limitPerMinute: JsonField<Double>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(rateLimit: RateLimit) = apply {
                limitPerMinute = rateLimit.limitPerMinute
                additionalProperties = rateLimit.additionalProperties.toMutableMap()
            }

            /** Max API calls per rate-limit window */
            fun limitPerMinute(limitPerMinute: Double) =
                limitPerMinute(JsonField.of(limitPerMinute))

            /**
             * Sets [Builder.limitPerMinute] to an arbitrary JSON value.
             *
             * You should usually call [Builder.limitPerMinute] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun limitPerMinute(limitPerMinute: JsonField<Double>) = apply {
                this.limitPerMinute = limitPerMinute
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
             * Returns an immutable instance of [RateLimit].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .limitPerMinute()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): RateLimit =
                RateLimit(
                    checkRequired("limitPerMinute", limitPerMinute),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): RateLimit = apply {
            if (validated) {
                return@apply
            }

            limitPerMinute()
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
        internal fun validity(): Int = (if (limitPerMinute.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RateLimit &&
                limitPerMinute == other.limitPerMinute &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(limitPerMinute, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RateLimit{limitPerMinute=$limitPerMinute, additionalProperties=$additionalProperties}"
    }

    class Subscription
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val monthlyPriceCents: JsonField<Double>,
        private val pricePerThousandCallsCents: JsonField<Double>,
        private val status: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("monthly_price_cents")
            @ExcludeMissing
            monthlyPriceCents: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("price_per_thousand_calls_cents")
            @ExcludeMissing
            pricePerThousandCallsCents: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        ) : this(monthlyPriceCents, pricePerThousandCallsCents, status, mutableMapOf())

        /**
         * Base monthly price in cents
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun monthlyPriceCents(): Double = monthlyPriceCents.getRequired("monthly_price_cents")

        /**
         * Overage price per 1K API calls in cents
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun pricePerThousandCallsCents(): Double =
            pricePerThousandCallsCents.getRequired("price_per_thousand_calls_cents")

        /**
         * Subscription status
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): String = status.getRequired("status")

        /**
         * Returns the raw JSON value of [monthlyPriceCents].
         *
         * Unlike [monthlyPriceCents], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("monthly_price_cents")
        @ExcludeMissing
        fun _monthlyPriceCents(): JsonField<Double> = monthlyPriceCents

        /**
         * Returns the raw JSON value of [pricePerThousandCallsCents].
         *
         * Unlike [pricePerThousandCallsCents], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("price_per_thousand_calls_cents")
        @ExcludeMissing
        fun _pricePerThousandCallsCents(): JsonField<Double> = pricePerThousandCallsCents

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

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
             * Returns a mutable builder for constructing an instance of [Subscription].
             *
             * The following fields are required:
             * ```java
             * .monthlyPriceCents()
             * .pricePerThousandCallsCents()
             * .status()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Subscription]. */
        class Builder internal constructor() {

            private var monthlyPriceCents: JsonField<Double>? = null
            private var pricePerThousandCallsCents: JsonField<Double>? = null
            private var status: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(subscription: Subscription) = apply {
                monthlyPriceCents = subscription.monthlyPriceCents
                pricePerThousandCallsCents = subscription.pricePerThousandCallsCents
                status = subscription.status
                additionalProperties = subscription.additionalProperties.toMutableMap()
            }

            /** Base monthly price in cents */
            fun monthlyPriceCents(monthlyPriceCents: Double) =
                monthlyPriceCents(JsonField.of(monthlyPriceCents))

            /**
             * Sets [Builder.monthlyPriceCents] to an arbitrary JSON value.
             *
             * You should usually call [Builder.monthlyPriceCents] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun monthlyPriceCents(monthlyPriceCents: JsonField<Double>) = apply {
                this.monthlyPriceCents = monthlyPriceCents
            }

            /** Overage price per 1K API calls in cents */
            fun pricePerThousandCallsCents(pricePerThousandCallsCents: Double) =
                pricePerThousandCallsCents(JsonField.of(pricePerThousandCallsCents))

            /**
             * Sets [Builder.pricePerThousandCallsCents] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pricePerThousandCallsCents] with a well-typed
             * [Double] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun pricePerThousandCallsCents(pricePerThousandCallsCents: JsonField<Double>) = apply {
                this.pricePerThousandCallsCents = pricePerThousandCallsCents
            }

            /** Subscription status */
            fun status(status: String) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<String>) = apply { this.status = status }

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
             * Returns an immutable instance of [Subscription].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .monthlyPriceCents()
             * .pricePerThousandCallsCents()
             * .status()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Subscription =
                Subscription(
                    checkRequired("monthlyPriceCents", monthlyPriceCents),
                    checkRequired("pricePerThousandCallsCents", pricePerThousandCallsCents),
                    checkRequired("status", status),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Subscription = apply {
            if (validated) {
                return@apply
            }

            monthlyPriceCents()
            pricePerThousandCallsCents()
            status()
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
            (if (monthlyPriceCents.asKnown().isPresent) 1 else 0) +
                (if (pricePerThousandCallsCents.asKnown().isPresent) 1 else 0) +
                (if (status.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Subscription &&
                monthlyPriceCents == other.monthlyPriceCents &&
                pricePerThousandCallsCents == other.pricePerThousandCallsCents &&
                status == other.status &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                monthlyPriceCents,
                pricePerThousandCallsCents,
                status,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Subscription{monthlyPriceCents=$monthlyPriceCents, pricePerThousandCallsCents=$pricePerThousandCallsCents, status=$status, additionalProperties=$additionalProperties}"
    }

    class Usage
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val apiCallsRemaining: JsonField<Double>,
        private val apiCallsUsed: JsonField<Double>,
        private val cycleEnd: JsonField<OffsetDateTime>,
        private val cycleStart: JsonField<OffsetDateTime>,
        private val overageCalls: JsonField<Double>,
        private val overageCostCents: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("api_calls_remaining")
            @ExcludeMissing
            apiCallsRemaining: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("api_calls_used")
            @ExcludeMissing
            apiCallsUsed: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("cycle_end")
            @ExcludeMissing
            cycleEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("cycle_start")
            @ExcludeMissing
            cycleStart: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("overage_calls")
            @ExcludeMissing
            overageCalls: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("overage_cost_cents")
            @ExcludeMissing
            overageCostCents: JsonField<Double> = JsonMissing.of(),
        ) : this(
            apiCallsRemaining,
            apiCallsUsed,
            cycleEnd,
            cycleStart,
            overageCalls,
            overageCostCents,
            mutableMapOf(),
        )

        /**
         * API calls remaining this cycle (Infinity for pro overage)
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun apiCallsRemaining(): Double = apiCallsRemaining.getRequired("api_calls_remaining")

        /**
         * API calls used this cycle
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun apiCallsUsed(): Double = apiCallsUsed.getRequired("api_calls_used")

        /**
         * Current billing cycle end
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun cycleEnd(): OffsetDateTime = cycleEnd.getRequired("cycle_end")

        /**
         * Current billing cycle start
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun cycleStart(): OffsetDateTime = cycleStart.getRequired("cycle_start")

        /**
         * API calls exceeding included amount
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun overageCalls(): Double = overageCalls.getRequired("overage_calls")

        /**
         * Overage cost in cents
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun overageCostCents(): Double = overageCostCents.getRequired("overage_cost_cents")

        /**
         * Returns the raw JSON value of [apiCallsRemaining].
         *
         * Unlike [apiCallsRemaining], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("api_calls_remaining")
        @ExcludeMissing
        fun _apiCallsRemaining(): JsonField<Double> = apiCallsRemaining

        /**
         * Returns the raw JSON value of [apiCallsUsed].
         *
         * Unlike [apiCallsUsed], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("api_calls_used")
        @ExcludeMissing
        fun _apiCallsUsed(): JsonField<Double> = apiCallsUsed

        /**
         * Returns the raw JSON value of [cycleEnd].
         *
         * Unlike [cycleEnd], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cycle_end")
        @ExcludeMissing
        fun _cycleEnd(): JsonField<OffsetDateTime> = cycleEnd

        /**
         * Returns the raw JSON value of [cycleStart].
         *
         * Unlike [cycleStart], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cycle_start")
        @ExcludeMissing
        fun _cycleStart(): JsonField<OffsetDateTime> = cycleStart

        /**
         * Returns the raw JSON value of [overageCalls].
         *
         * Unlike [overageCalls], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("overage_calls")
        @ExcludeMissing
        fun _overageCalls(): JsonField<Double> = overageCalls

        /**
         * Returns the raw JSON value of [overageCostCents].
         *
         * Unlike [overageCostCents], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("overage_cost_cents")
        @ExcludeMissing
        fun _overageCostCents(): JsonField<Double> = overageCostCents

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
             * Returns a mutable builder for constructing an instance of [Usage].
             *
             * The following fields are required:
             * ```java
             * .apiCallsRemaining()
             * .apiCallsUsed()
             * .cycleEnd()
             * .cycleStart()
             * .overageCalls()
             * .overageCostCents()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Usage]. */
        class Builder internal constructor() {

            private var apiCallsRemaining: JsonField<Double>? = null
            private var apiCallsUsed: JsonField<Double>? = null
            private var cycleEnd: JsonField<OffsetDateTime>? = null
            private var cycleStart: JsonField<OffsetDateTime>? = null
            private var overageCalls: JsonField<Double>? = null
            private var overageCostCents: JsonField<Double>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(usage: Usage) = apply {
                apiCallsRemaining = usage.apiCallsRemaining
                apiCallsUsed = usage.apiCallsUsed
                cycleEnd = usage.cycleEnd
                cycleStart = usage.cycleStart
                overageCalls = usage.overageCalls
                overageCostCents = usage.overageCostCents
                additionalProperties = usage.additionalProperties.toMutableMap()
            }

            /** API calls remaining this cycle (Infinity for pro overage) */
            fun apiCallsRemaining(apiCallsRemaining: Double) =
                apiCallsRemaining(JsonField.of(apiCallsRemaining))

            /**
             * Sets [Builder.apiCallsRemaining] to an arbitrary JSON value.
             *
             * You should usually call [Builder.apiCallsRemaining] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun apiCallsRemaining(apiCallsRemaining: JsonField<Double>) = apply {
                this.apiCallsRemaining = apiCallsRemaining
            }

            /** API calls used this cycle */
            fun apiCallsUsed(apiCallsUsed: Double) = apiCallsUsed(JsonField.of(apiCallsUsed))

            /**
             * Sets [Builder.apiCallsUsed] to an arbitrary JSON value.
             *
             * You should usually call [Builder.apiCallsUsed] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun apiCallsUsed(apiCallsUsed: JsonField<Double>) = apply {
                this.apiCallsUsed = apiCallsUsed
            }

            /** Current billing cycle end */
            fun cycleEnd(cycleEnd: OffsetDateTime) = cycleEnd(JsonField.of(cycleEnd))

            /**
             * Sets [Builder.cycleEnd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cycleEnd] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cycleEnd(cycleEnd: JsonField<OffsetDateTime>) = apply { this.cycleEnd = cycleEnd }

            /** Current billing cycle start */
            fun cycleStart(cycleStart: OffsetDateTime) = cycleStart(JsonField.of(cycleStart))

            /**
             * Sets [Builder.cycleStart] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cycleStart] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cycleStart(cycleStart: JsonField<OffsetDateTime>) = apply {
                this.cycleStart = cycleStart
            }

            /** API calls exceeding included amount */
            fun overageCalls(overageCalls: Double) = overageCalls(JsonField.of(overageCalls))

            /**
             * Sets [Builder.overageCalls] to an arbitrary JSON value.
             *
             * You should usually call [Builder.overageCalls] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun overageCalls(overageCalls: JsonField<Double>) = apply {
                this.overageCalls = overageCalls
            }

            /** Overage cost in cents */
            fun overageCostCents(overageCostCents: Double) =
                overageCostCents(JsonField.of(overageCostCents))

            /**
             * Sets [Builder.overageCostCents] to an arbitrary JSON value.
             *
             * You should usually call [Builder.overageCostCents] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun overageCostCents(overageCostCents: JsonField<Double>) = apply {
                this.overageCostCents = overageCostCents
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
             * Returns an immutable instance of [Usage].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .apiCallsRemaining()
             * .apiCallsUsed()
             * .cycleEnd()
             * .cycleStart()
             * .overageCalls()
             * .overageCostCents()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Usage =
                Usage(
                    checkRequired("apiCallsRemaining", apiCallsRemaining),
                    checkRequired("apiCallsUsed", apiCallsUsed),
                    checkRequired("cycleEnd", cycleEnd),
                    checkRequired("cycleStart", cycleStart),
                    checkRequired("overageCalls", overageCalls),
                    checkRequired("overageCostCents", overageCostCents),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Usage = apply {
            if (validated) {
                return@apply
            }

            apiCallsRemaining()
            apiCallsUsed()
            cycleEnd()
            cycleStart()
            overageCalls()
            overageCostCents()
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
            (if (apiCallsRemaining.asKnown().isPresent) 1 else 0) +
                (if (apiCallsUsed.asKnown().isPresent) 1 else 0) +
                (if (cycleEnd.asKnown().isPresent) 1 else 0) +
                (if (cycleStart.asKnown().isPresent) 1 else 0) +
                (if (overageCalls.asKnown().isPresent) 1 else 0) +
                (if (overageCostCents.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Usage &&
                apiCallsRemaining == other.apiCallsRemaining &&
                apiCallsUsed == other.apiCallsUsed &&
                cycleEnd == other.cycleEnd &&
                cycleStart == other.cycleStart &&
                overageCalls == other.overageCalls &&
                overageCostCents == other.overageCostCents &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                apiCallsRemaining,
                apiCallsUsed,
                cycleEnd,
                cycleStart,
                overageCalls,
                overageCostCents,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Usage{apiCallsRemaining=$apiCallsRemaining, apiCallsUsed=$apiCallsUsed, cycleEnd=$cycleEnd, cycleStart=$cycleStart, overageCalls=$overageCalls, overageCostCents=$overageCostCents, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UsageRetrieveResponse &&
            plan == other.plan &&
            rateLimit == other.rateLimit &&
            subscription == other.subscription &&
            usage == other.usage &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(plan, rateLimit, subscription, usage, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UsageRetrieveResponse{plan=$plan, rateLimit=$rateLimit, subscription=$subscription, usage=$usage, additionalProperties=$additionalProperties}"
}
