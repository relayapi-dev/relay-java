// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.analytics

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

class AnalyticsGetContentDecayResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val halfLifeDays: JsonField<Double>,
    private val platform: JsonField<Platform>,
    private val postId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of(),
        @JsonProperty("half_life_days")
        @ExcludeMissing
        halfLifeDays: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("platform") @ExcludeMissing platform: JsonField<Platform> = JsonMissing.of(),
        @JsonProperty("post_id") @ExcludeMissing postId: JsonField<String> = JsonMissing.of(),
    ) : this(data, halfLifeDays, platform, postId, mutableMapOf())

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): List<Data> = data.getRequired("data")

    /**
     * Days until engagement halved
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun halfLifeDays(): Optional<Double> = halfLifeDays.getOptional("half_life_days")

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun platform(): Platform = platform.getRequired("platform")

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun postId(): String = postId.getRequired("post_id")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

    /**
     * Returns the raw JSON value of [halfLifeDays].
     *
     * Unlike [halfLifeDays], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("half_life_days")
    @ExcludeMissing
    fun _halfLifeDays(): JsonField<Double> = halfLifeDays

    /**
     * Returns the raw JSON value of [platform].
     *
     * Unlike [platform], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("platform") @ExcludeMissing fun _platform(): JsonField<Platform> = platform

    /**
     * Returns the raw JSON value of [postId].
     *
     * Unlike [postId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("post_id") @ExcludeMissing fun _postId(): JsonField<String> = postId

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
         * [AnalyticsGetContentDecayResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * .halfLifeDays()
         * .platform()
         * .postId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AnalyticsGetContentDecayResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var halfLifeDays: JsonField<Double>? = null
        private var platform: JsonField<Platform>? = null
        private var postId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(analyticsGetContentDecayResponse: AnalyticsGetContentDecayResponse) =
            apply {
                data = analyticsGetContentDecayResponse.data.map { it.toMutableList() }
                halfLifeDays = analyticsGetContentDecayResponse.halfLifeDays
                platform = analyticsGetContentDecayResponse.platform
                postId = analyticsGetContentDecayResponse.postId
                additionalProperties =
                    analyticsGetContentDecayResponse.additionalProperties.toMutableMap()
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

        /** Days until engagement halved */
        fun halfLifeDays(halfLifeDays: Double?) = halfLifeDays(JsonField.ofNullable(halfLifeDays))

        /**
         * Alias for [Builder.halfLifeDays].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun halfLifeDays(halfLifeDays: Double) = halfLifeDays(halfLifeDays as Double?)

        /** Alias for calling [Builder.halfLifeDays] with `halfLifeDays.orElse(null)`. */
        fun halfLifeDays(halfLifeDays: Optional<Double>) = halfLifeDays(halfLifeDays.getOrNull())

        /**
         * Sets [Builder.halfLifeDays] to an arbitrary JSON value.
         *
         * You should usually call [Builder.halfLifeDays] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun halfLifeDays(halfLifeDays: JsonField<Double>) = apply {
            this.halfLifeDays = halfLifeDays
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

        fun postId(postId: String) = postId(JsonField.of(postId))

        /**
         * Sets [Builder.postId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.postId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun postId(postId: JsonField<String>) = apply { this.postId = postId }

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
         * Returns an immutable instance of [AnalyticsGetContentDecayResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .data()
         * .halfLifeDays()
         * .platform()
         * .postId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AnalyticsGetContentDecayResponse =
            AnalyticsGetContentDecayResponse(
                checkRequired("data", data).map { it.toImmutable() },
                checkRequired("halfLifeDays", halfLifeDays),
                checkRequired("platform", platform),
                checkRequired("postId", postId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AnalyticsGetContentDecayResponse = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
        halfLifeDays()
        platform().validate()
        postId()
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
            (if (halfLifeDays.asKnown().isPresent) 1 else 0) +
            (platform.asKnown().getOrNull()?.validity() ?: 0) +
            (if (postId.asKnown().isPresent) 1 else 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val cumulativeEngagement: JsonField<Double>,
        private val cumulativeImpressions: JsonField<Double>,
        private val day: JsonField<Double>,
        private val engagement: JsonField<Double>,
        private val impressions: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("cumulative_engagement")
            @ExcludeMissing
            cumulativeEngagement: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("cumulative_impressions")
            @ExcludeMissing
            cumulativeImpressions: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("day") @ExcludeMissing day: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("engagement")
            @ExcludeMissing
            engagement: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("impressions")
            @ExcludeMissing
            impressions: JsonField<Double> = JsonMissing.of(),
        ) : this(
            cumulativeEngagement,
            cumulativeImpressions,
            day,
            engagement,
            impressions,
            mutableMapOf(),
        )

        /**
         * Cumulative engagement
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun cumulativeEngagement(): Double =
            cumulativeEngagement.getRequired("cumulative_engagement")

        /**
         * Cumulative impressions
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun cumulativeImpressions(): Double =
            cumulativeImpressions.getRequired("cumulative_impressions")

        /**
         * Days since publication
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun day(): Double = day.getRequired("day")

        /**
         * Engagement on this day
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun engagement(): Double = engagement.getRequired("engagement")

        /**
         * Impressions on this day
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun impressions(): Double = impressions.getRequired("impressions")

        /**
         * Returns the raw JSON value of [cumulativeEngagement].
         *
         * Unlike [cumulativeEngagement], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("cumulative_engagement")
        @ExcludeMissing
        fun _cumulativeEngagement(): JsonField<Double> = cumulativeEngagement

        /**
         * Returns the raw JSON value of [cumulativeImpressions].
         *
         * Unlike [cumulativeImpressions], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("cumulative_impressions")
        @ExcludeMissing
        fun _cumulativeImpressions(): JsonField<Double> = cumulativeImpressions

        /**
         * Returns the raw JSON value of [day].
         *
         * Unlike [day], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("day") @ExcludeMissing fun _day(): JsonField<Double> = day

        /**
         * Returns the raw JSON value of [engagement].
         *
         * Unlike [engagement], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("engagement")
        @ExcludeMissing
        fun _engagement(): JsonField<Double> = engagement

        /**
         * Returns the raw JSON value of [impressions].
         *
         * Unlike [impressions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("impressions")
        @ExcludeMissing
        fun _impressions(): JsonField<Double> = impressions

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
             * .cumulativeEngagement()
             * .cumulativeImpressions()
             * .day()
             * .engagement()
             * .impressions()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var cumulativeEngagement: JsonField<Double>? = null
            private var cumulativeImpressions: JsonField<Double>? = null
            private var day: JsonField<Double>? = null
            private var engagement: JsonField<Double>? = null
            private var impressions: JsonField<Double>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                cumulativeEngagement = data.cumulativeEngagement
                cumulativeImpressions = data.cumulativeImpressions
                day = data.day
                engagement = data.engagement
                impressions = data.impressions
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Cumulative engagement */
            fun cumulativeEngagement(cumulativeEngagement: Double) =
                cumulativeEngagement(JsonField.of(cumulativeEngagement))

            /**
             * Sets [Builder.cumulativeEngagement] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cumulativeEngagement] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun cumulativeEngagement(cumulativeEngagement: JsonField<Double>) = apply {
                this.cumulativeEngagement = cumulativeEngagement
            }

            /** Cumulative impressions */
            fun cumulativeImpressions(cumulativeImpressions: Double) =
                cumulativeImpressions(JsonField.of(cumulativeImpressions))

            /**
             * Sets [Builder.cumulativeImpressions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cumulativeImpressions] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun cumulativeImpressions(cumulativeImpressions: JsonField<Double>) = apply {
                this.cumulativeImpressions = cumulativeImpressions
            }

            /** Days since publication */
            fun day(day: Double) = day(JsonField.of(day))

            /**
             * Sets [Builder.day] to an arbitrary JSON value.
             *
             * You should usually call [Builder.day] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun day(day: JsonField<Double>) = apply { this.day = day }

            /** Engagement on this day */
            fun engagement(engagement: Double) = engagement(JsonField.of(engagement))

            /**
             * Sets [Builder.engagement] to an arbitrary JSON value.
             *
             * You should usually call [Builder.engagement] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun engagement(engagement: JsonField<Double>) = apply { this.engagement = engagement }

            /** Impressions on this day */
            fun impressions(impressions: Double) = impressions(JsonField.of(impressions))

            /**
             * Sets [Builder.impressions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.impressions] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun impressions(impressions: JsonField<Double>) = apply {
                this.impressions = impressions
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
             * .cumulativeEngagement()
             * .cumulativeImpressions()
             * .day()
             * .engagement()
             * .impressions()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("cumulativeEngagement", cumulativeEngagement),
                    checkRequired("cumulativeImpressions", cumulativeImpressions),
                    checkRequired("day", day),
                    checkRequired("engagement", engagement),
                    checkRequired("impressions", impressions),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            cumulativeEngagement()
            cumulativeImpressions()
            day()
            engagement()
            impressions()
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
            (if (cumulativeEngagement.asKnown().isPresent) 1 else 0) +
                (if (cumulativeImpressions.asKnown().isPresent) 1 else 0) +
                (if (day.asKnown().isPresent) 1 else 0) +
                (if (engagement.asKnown().isPresent) 1 else 0) +
                (if (impressions.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                cumulativeEngagement == other.cumulativeEngagement &&
                cumulativeImpressions == other.cumulativeImpressions &&
                day == other.day &&
                engagement == other.engagement &&
                impressions == other.impressions &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                cumulativeEngagement,
                cumulativeImpressions,
                day,
                engagement,
                impressions,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{cumulativeEngagement=$cumulativeEngagement, cumulativeImpressions=$cumulativeImpressions, day=$day, engagement=$engagement, impressions=$impressions, additionalProperties=$additionalProperties}"
    }

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AnalyticsGetContentDecayResponse &&
            data == other.data &&
            halfLifeDays == other.halfLifeDays &&
            platform == other.platform &&
            postId == other.postId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(data, halfLifeDays, platform, postId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AnalyticsGetContentDecayResponse{data=$data, halfLifeDays=$halfLifeDays, platform=$platform, postId=$postId, additionalProperties=$additionalProperties}"
}
