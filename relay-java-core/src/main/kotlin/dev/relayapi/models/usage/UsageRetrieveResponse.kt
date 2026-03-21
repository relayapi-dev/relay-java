// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.usage

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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
    private val apiCalls: JsonField<ApiCalls>,
    private val plan: JsonField<Plan>,
    private val usage: JsonField<Usage>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("api_calls") @ExcludeMissing apiCalls: JsonField<ApiCalls> = JsonMissing.of(),
        @JsonProperty("plan") @ExcludeMissing plan: JsonField<Plan> = JsonMissing.of(),
        @JsonProperty("usage") @ExcludeMissing usage: JsonField<Usage> = JsonMissing.of(),
    ) : this(apiCalls, plan, usage, mutableMapOf())

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun apiCalls(): ApiCalls = apiCalls.getRequired("api_calls")

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun plan(): Plan = plan.getRequired("plan")

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun usage(): Usage = usage.getRequired("usage")

    /**
     * Returns the raw JSON value of [apiCalls].
     *
     * Unlike [apiCalls], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("api_calls") @ExcludeMissing fun _apiCalls(): JsonField<ApiCalls> = apiCalls

    /**
     * Returns the raw JSON value of [plan].
     *
     * Unlike [plan], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("plan") @ExcludeMissing fun _plan(): JsonField<Plan> = plan

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
         * .apiCalls()
         * .plan()
         * .usage()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UsageRetrieveResponse]. */
    class Builder internal constructor() {

        private var apiCalls: JsonField<ApiCalls>? = null
        private var plan: JsonField<Plan>? = null
        private var usage: JsonField<Usage>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(usageRetrieveResponse: UsageRetrieveResponse) = apply {
            apiCalls = usageRetrieveResponse.apiCalls
            plan = usageRetrieveResponse.plan
            usage = usageRetrieveResponse.usage
            additionalProperties = usageRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun apiCalls(apiCalls: ApiCalls) = apiCalls(JsonField.of(apiCalls))

        /**
         * Sets [Builder.apiCalls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apiCalls] with a well-typed [ApiCalls] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun apiCalls(apiCalls: JsonField<ApiCalls>) = apply { this.apiCalls = apiCalls }

        fun plan(plan: Plan) = plan(JsonField.of(plan))

        /**
         * Sets [Builder.plan] to an arbitrary JSON value.
         *
         * You should usually call [Builder.plan] with a well-typed [Plan] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun plan(plan: JsonField<Plan>) = apply { this.plan = plan }

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
         * .apiCalls()
         * .plan()
         * .usage()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UsageRetrieveResponse =
            UsageRetrieveResponse(
                checkRequired("apiCalls", apiCalls),
                checkRequired("plan", plan),
                checkRequired("usage", usage),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UsageRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        apiCalls().validate()
        plan().validate()
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
        (apiCalls.asKnown().getOrNull()?.validity() ?: 0) +
            (plan.asKnown().getOrNull()?.validity() ?: 0) +
            (usage.asKnown().getOrNull()?.validity() ?: 0)

    class ApiCalls
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val currentMinute: JsonField<Double>,
        private val limitPerMinute: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("current_minute")
            @ExcludeMissing
            currentMinute: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("limit_per_minute")
            @ExcludeMissing
            limitPerMinute: JsonField<Double> = JsonMissing.of(),
        ) : this(currentMinute, limitPerMinute, mutableMapOf())

        /**
         * API calls in the current minute
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currentMinute(): Double = currentMinute.getRequired("current_minute")

        /**
         * Max API calls per minute
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun limitPerMinute(): Double = limitPerMinute.getRequired("limit_per_minute")

        /**
         * Returns the raw JSON value of [currentMinute].
         *
         * Unlike [currentMinute], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("current_minute")
        @ExcludeMissing
        fun _currentMinute(): JsonField<Double> = currentMinute

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
             * Returns a mutable builder for constructing an instance of [ApiCalls].
             *
             * The following fields are required:
             * ```java
             * .currentMinute()
             * .limitPerMinute()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ApiCalls]. */
        class Builder internal constructor() {

            private var currentMinute: JsonField<Double>? = null
            private var limitPerMinute: JsonField<Double>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(apiCalls: ApiCalls) = apply {
                currentMinute = apiCalls.currentMinute
                limitPerMinute = apiCalls.limitPerMinute
                additionalProperties = apiCalls.additionalProperties.toMutableMap()
            }

            /** API calls in the current minute */
            fun currentMinute(currentMinute: Double) = currentMinute(JsonField.of(currentMinute))

            /**
             * Sets [Builder.currentMinute] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currentMinute] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currentMinute(currentMinute: JsonField<Double>) = apply {
                this.currentMinute = currentMinute
            }

            /** Max API calls per minute */
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
             * Returns an immutable instance of [ApiCalls].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .currentMinute()
             * .limitPerMinute()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ApiCalls =
                ApiCalls(
                    checkRequired("currentMinute", currentMinute),
                    checkRequired("limitPerMinute", limitPerMinute),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ApiCalls = apply {
            if (validated) {
                return@apply
            }

            currentMinute()
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
        internal fun validity(): Int =
            (if (currentMinute.asKnown().isPresent) 1 else 0) +
                (if (limitPerMinute.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ApiCalls &&
                currentMinute == other.currentMinute &&
                limitPerMinute == other.limitPerMinute &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(currentMinute, limitPerMinute, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ApiCalls{currentMinute=$currentMinute, limitPerMinute=$limitPerMinute, additionalProperties=$additionalProperties}"
    }

    class Plan
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val apiCallsPerMin: JsonField<Double>,
        private val name: JsonField<String>,
        private val postsLimit: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("api_calls_per_min")
            @ExcludeMissing
            apiCallsPerMin: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("posts_limit")
            @ExcludeMissing
            postsLimit: JsonField<Double> = JsonMissing.of(),
        ) : this(apiCallsPerMin, name, postsLimit, mutableMapOf())

        /**
         * API calls allowed per minute
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun apiCallsPerMin(): Double = apiCallsPerMin.getRequired("api_calls_per_min")

        /**
         * Plan name
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Max posts per billing cycle
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun postsLimit(): Double = postsLimit.getRequired("posts_limit")

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
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [postsLimit].
         *
         * Unlike [postsLimit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("posts_limit")
        @ExcludeMissing
        fun _postsLimit(): JsonField<Double> = postsLimit

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
             * .apiCallsPerMin()
             * .name()
             * .postsLimit()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Plan]. */
        class Builder internal constructor() {

            private var apiCallsPerMin: JsonField<Double>? = null
            private var name: JsonField<String>? = null
            private var postsLimit: JsonField<Double>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(plan: Plan) = apply {
                apiCallsPerMin = plan.apiCallsPerMin
                name = plan.name
                postsLimit = plan.postsLimit
                additionalProperties = plan.additionalProperties.toMutableMap()
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

            /** Plan name */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Max posts per billing cycle */
            fun postsLimit(postsLimit: Double) = postsLimit(JsonField.of(postsLimit))

            /**
             * Sets [Builder.postsLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postsLimit] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postsLimit(postsLimit: JsonField<Double>) = apply { this.postsLimit = postsLimit }

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
             * .apiCallsPerMin()
             * .name()
             * .postsLimit()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Plan =
                Plan(
                    checkRequired("apiCallsPerMin", apiCallsPerMin),
                    checkRequired("name", name),
                    checkRequired("postsLimit", postsLimit),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Plan = apply {
            if (validated) {
                return@apply
            }

            apiCallsPerMin()
            name()
            postsLimit()
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
            (if (apiCallsPerMin.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (postsLimit.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Plan &&
                apiCallsPerMin == other.apiCallsPerMin &&
                name == other.name &&
                postsLimit == other.postsLimit &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(apiCallsPerMin, name, postsLimit, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Plan{apiCallsPerMin=$apiCallsPerMin, name=$name, postsLimit=$postsLimit, additionalProperties=$additionalProperties}"
    }

    class Usage
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val cycleEnd: JsonField<OffsetDateTime>,
        private val cycleResetsAt: JsonField<OffsetDateTime>,
        private val cycleStart: JsonField<OffsetDateTime>,
        private val postsLimit: JsonField<Double>,
        private val postsUsed: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("cycle_end")
            @ExcludeMissing
            cycleEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("cycle_resets_at")
            @ExcludeMissing
            cycleResetsAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("cycle_start")
            @ExcludeMissing
            cycleStart: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("posts_limit")
            @ExcludeMissing
            postsLimit: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("posts_used")
            @ExcludeMissing
            postsUsed: JsonField<Double> = JsonMissing.of(),
        ) : this(cycleEnd, cycleResetsAt, cycleStart, postsLimit, postsUsed, mutableMapOf())

        /**
         * Current billing cycle end
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun cycleEnd(): OffsetDateTime = cycleEnd.getRequired("cycle_end")

        /**
         * When the cycle resets
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun cycleResetsAt(): OffsetDateTime = cycleResetsAt.getRequired("cycle_resets_at")

        /**
         * Current billing cycle start
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun cycleStart(): OffsetDateTime = cycleStart.getRequired("cycle_start")

        /**
         * Max posts per billing cycle
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun postsLimit(): Double = postsLimit.getRequired("posts_limit")

        /**
         * Posts used this cycle
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun postsUsed(): Double = postsUsed.getRequired("posts_used")

        /**
         * Returns the raw JSON value of [cycleEnd].
         *
         * Unlike [cycleEnd], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cycle_end")
        @ExcludeMissing
        fun _cycleEnd(): JsonField<OffsetDateTime> = cycleEnd

        /**
         * Returns the raw JSON value of [cycleResetsAt].
         *
         * Unlike [cycleResetsAt], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("cycle_resets_at")
        @ExcludeMissing
        fun _cycleResetsAt(): JsonField<OffsetDateTime> = cycleResetsAt

        /**
         * Returns the raw JSON value of [cycleStart].
         *
         * Unlike [cycleStart], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cycle_start")
        @ExcludeMissing
        fun _cycleStart(): JsonField<OffsetDateTime> = cycleStart

        /**
         * Returns the raw JSON value of [postsLimit].
         *
         * Unlike [postsLimit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("posts_limit")
        @ExcludeMissing
        fun _postsLimit(): JsonField<Double> = postsLimit

        /**
         * Returns the raw JSON value of [postsUsed].
         *
         * Unlike [postsUsed], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("posts_used") @ExcludeMissing fun _postsUsed(): JsonField<Double> = postsUsed

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
             * .cycleEnd()
             * .cycleResetsAt()
             * .cycleStart()
             * .postsLimit()
             * .postsUsed()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Usage]. */
        class Builder internal constructor() {

            private var cycleEnd: JsonField<OffsetDateTime>? = null
            private var cycleResetsAt: JsonField<OffsetDateTime>? = null
            private var cycleStart: JsonField<OffsetDateTime>? = null
            private var postsLimit: JsonField<Double>? = null
            private var postsUsed: JsonField<Double>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(usage: Usage) = apply {
                cycleEnd = usage.cycleEnd
                cycleResetsAt = usage.cycleResetsAt
                cycleStart = usage.cycleStart
                postsLimit = usage.postsLimit
                postsUsed = usage.postsUsed
                additionalProperties = usage.additionalProperties.toMutableMap()
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

            /** When the cycle resets */
            fun cycleResetsAt(cycleResetsAt: OffsetDateTime) =
                cycleResetsAt(JsonField.of(cycleResetsAt))

            /**
             * Sets [Builder.cycleResetsAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cycleResetsAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun cycleResetsAt(cycleResetsAt: JsonField<OffsetDateTime>) = apply {
                this.cycleResetsAt = cycleResetsAt
            }

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

            /** Max posts per billing cycle */
            fun postsLimit(postsLimit: Double) = postsLimit(JsonField.of(postsLimit))

            /**
             * Sets [Builder.postsLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postsLimit] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postsLimit(postsLimit: JsonField<Double>) = apply { this.postsLimit = postsLimit }

            /** Posts used this cycle */
            fun postsUsed(postsUsed: Double) = postsUsed(JsonField.of(postsUsed))

            /**
             * Sets [Builder.postsUsed] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postsUsed] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postsUsed(postsUsed: JsonField<Double>) = apply { this.postsUsed = postsUsed }

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
             * .cycleEnd()
             * .cycleResetsAt()
             * .cycleStart()
             * .postsLimit()
             * .postsUsed()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Usage =
                Usage(
                    checkRequired("cycleEnd", cycleEnd),
                    checkRequired("cycleResetsAt", cycleResetsAt),
                    checkRequired("cycleStart", cycleStart),
                    checkRequired("postsLimit", postsLimit),
                    checkRequired("postsUsed", postsUsed),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Usage = apply {
            if (validated) {
                return@apply
            }

            cycleEnd()
            cycleResetsAt()
            cycleStart()
            postsLimit()
            postsUsed()
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
            (if (cycleEnd.asKnown().isPresent) 1 else 0) +
                (if (cycleResetsAt.asKnown().isPresent) 1 else 0) +
                (if (cycleStart.asKnown().isPresent) 1 else 0) +
                (if (postsLimit.asKnown().isPresent) 1 else 0) +
                (if (postsUsed.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Usage &&
                cycleEnd == other.cycleEnd &&
                cycleResetsAt == other.cycleResetsAt &&
                cycleStart == other.cycleStart &&
                postsLimit == other.postsLimit &&
                postsUsed == other.postsUsed &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                cycleEnd,
                cycleResetsAt,
                cycleStart,
                postsLimit,
                postsUsed,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Usage{cycleEnd=$cycleEnd, cycleResetsAt=$cycleResetsAt, cycleStart=$cycleStart, postsLimit=$postsLimit, postsUsed=$postsUsed, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UsageRetrieveResponse &&
            apiCalls == other.apiCalls &&
            plan == other.plan &&
            usage == other.usage &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(apiCalls, plan, usage, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UsageRetrieveResponse{apiCalls=$apiCalls, plan=$plan, usage=$usage, additionalProperties=$additionalProperties}"
}
