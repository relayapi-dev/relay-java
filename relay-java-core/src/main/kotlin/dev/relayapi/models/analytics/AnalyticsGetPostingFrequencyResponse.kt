// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.analytics

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

class AnalyticsGetPostingFrequencyResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val optimalFrequency: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of(),
        @JsonProperty("optimal_frequency")
        @ExcludeMissing
        optimalFrequency: JsonField<Double> = JsonMissing.of(),
    ) : this(data, optimalFrequency, mutableMapOf())

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): List<Data> = data.getRequired("data")

    /**
     * Recommended posts per week
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun optimalFrequency(): Optional<Double> = optimalFrequency.getOptional("optimal_frequency")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

    /**
     * Returns the raw JSON value of [optimalFrequency].
     *
     * Unlike [optimalFrequency], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("optimal_frequency")
    @ExcludeMissing
    fun _optimalFrequency(): JsonField<Double> = optimalFrequency

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
         * [AnalyticsGetPostingFrequencyResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * .optimalFrequency()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AnalyticsGetPostingFrequencyResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var optimalFrequency: JsonField<Double>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            analyticsGetPostingFrequencyResponse: AnalyticsGetPostingFrequencyResponse
        ) = apply {
            data = analyticsGetPostingFrequencyResponse.data.map { it.toMutableList() }
            optimalFrequency = analyticsGetPostingFrequencyResponse.optimalFrequency
            additionalProperties =
                analyticsGetPostingFrequencyResponse.additionalProperties.toMutableMap()
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

        /** Recommended posts per week */
        fun optimalFrequency(optimalFrequency: Double?) =
            optimalFrequency(JsonField.ofNullable(optimalFrequency))

        /**
         * Alias for [Builder.optimalFrequency].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun optimalFrequency(optimalFrequency: Double) =
            optimalFrequency(optimalFrequency as Double?)

        /** Alias for calling [Builder.optimalFrequency] with `optimalFrequency.orElse(null)`. */
        fun optimalFrequency(optimalFrequency: Optional<Double>) =
            optimalFrequency(optimalFrequency.getOrNull())

        /**
         * Sets [Builder.optimalFrequency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.optimalFrequency] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun optimalFrequency(optimalFrequency: JsonField<Double>) = apply {
            this.optimalFrequency = optimalFrequency
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
         * Returns an immutable instance of [AnalyticsGetPostingFrequencyResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .data()
         * .optimalFrequency()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AnalyticsGetPostingFrequencyResponse =
            AnalyticsGetPostingFrequencyResponse(
                checkRequired("data", data).map { it.toImmutable() },
                checkRequired("optimalFrequency", optimalFrequency),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AnalyticsGetPostingFrequencyResponse = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
        optimalFrequency()
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
            (if (optimalFrequency.asKnown().isPresent) 1 else 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val avgEngagement: JsonField<Double>,
        private val avgImpressions: JsonField<Double>,
        private val postsPerWeek: JsonField<Double>,
        private val sampleWeeks: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("avg_engagement")
            @ExcludeMissing
            avgEngagement: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("avg_impressions")
            @ExcludeMissing
            avgImpressions: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("posts_per_week")
            @ExcludeMissing
            postsPerWeek: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("sample_weeks")
            @ExcludeMissing
            sampleWeeks: JsonField<Double> = JsonMissing.of(),
        ) : this(avgEngagement, avgImpressions, postsPerWeek, sampleWeeks, mutableMapOf())

        /**
         * Average engagement
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun avgEngagement(): Double = avgEngagement.getRequired("avg_engagement")

        /**
         * Average impressions
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun avgImpressions(): Double = avgImpressions.getRequired("avg_impressions")

        /**
         * Average posts per week in bucket
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun postsPerWeek(): Double = postsPerWeek.getRequired("posts_per_week")

        /**
         * Number of weeks in sample
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun sampleWeeks(): Double = sampleWeeks.getRequired("sample_weeks")

        /**
         * Returns the raw JSON value of [avgEngagement].
         *
         * Unlike [avgEngagement], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("avg_engagement")
        @ExcludeMissing
        fun _avgEngagement(): JsonField<Double> = avgEngagement

        /**
         * Returns the raw JSON value of [avgImpressions].
         *
         * Unlike [avgImpressions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("avg_impressions")
        @ExcludeMissing
        fun _avgImpressions(): JsonField<Double> = avgImpressions

        /**
         * Returns the raw JSON value of [postsPerWeek].
         *
         * Unlike [postsPerWeek], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("posts_per_week")
        @ExcludeMissing
        fun _postsPerWeek(): JsonField<Double> = postsPerWeek

        /**
         * Returns the raw JSON value of [sampleWeeks].
         *
         * Unlike [sampleWeeks], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sample_weeks")
        @ExcludeMissing
        fun _sampleWeeks(): JsonField<Double> = sampleWeeks

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
             * .avgEngagement()
             * .avgImpressions()
             * .postsPerWeek()
             * .sampleWeeks()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var avgEngagement: JsonField<Double>? = null
            private var avgImpressions: JsonField<Double>? = null
            private var postsPerWeek: JsonField<Double>? = null
            private var sampleWeeks: JsonField<Double>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                avgEngagement = data.avgEngagement
                avgImpressions = data.avgImpressions
                postsPerWeek = data.postsPerWeek
                sampleWeeks = data.sampleWeeks
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Average engagement */
            fun avgEngagement(avgEngagement: Double) = avgEngagement(JsonField.of(avgEngagement))

            /**
             * Sets [Builder.avgEngagement] to an arbitrary JSON value.
             *
             * You should usually call [Builder.avgEngagement] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun avgEngagement(avgEngagement: JsonField<Double>) = apply {
                this.avgEngagement = avgEngagement
            }

            /** Average impressions */
            fun avgImpressions(avgImpressions: Double) =
                avgImpressions(JsonField.of(avgImpressions))

            /**
             * Sets [Builder.avgImpressions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.avgImpressions] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun avgImpressions(avgImpressions: JsonField<Double>) = apply {
                this.avgImpressions = avgImpressions
            }

            /** Average posts per week in bucket */
            fun postsPerWeek(postsPerWeek: Double) = postsPerWeek(JsonField.of(postsPerWeek))

            /**
             * Sets [Builder.postsPerWeek] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postsPerWeek] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postsPerWeek(postsPerWeek: JsonField<Double>) = apply {
                this.postsPerWeek = postsPerWeek
            }

            /** Number of weeks in sample */
            fun sampleWeeks(sampleWeeks: Double) = sampleWeeks(JsonField.of(sampleWeeks))

            /**
             * Sets [Builder.sampleWeeks] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sampleWeeks] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sampleWeeks(sampleWeeks: JsonField<Double>) = apply {
                this.sampleWeeks = sampleWeeks
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
             * .avgEngagement()
             * .avgImpressions()
             * .postsPerWeek()
             * .sampleWeeks()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("avgEngagement", avgEngagement),
                    checkRequired("avgImpressions", avgImpressions),
                    checkRequired("postsPerWeek", postsPerWeek),
                    checkRequired("sampleWeeks", sampleWeeks),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            avgEngagement()
            avgImpressions()
            postsPerWeek()
            sampleWeeks()
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
            (if (avgEngagement.asKnown().isPresent) 1 else 0) +
                (if (avgImpressions.asKnown().isPresent) 1 else 0) +
                (if (postsPerWeek.asKnown().isPresent) 1 else 0) +
                (if (sampleWeeks.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                avgEngagement == other.avgEngagement &&
                avgImpressions == other.avgImpressions &&
                postsPerWeek == other.postsPerWeek &&
                sampleWeeks == other.sampleWeeks &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                avgEngagement,
                avgImpressions,
                postsPerWeek,
                sampleWeeks,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{avgEngagement=$avgEngagement, avgImpressions=$avgImpressions, postsPerWeek=$postsPerWeek, sampleWeeks=$sampleWeeks, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AnalyticsGetPostingFrequencyResponse &&
            data == other.data &&
            optimalFrequency == other.optimalFrequency &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, optimalFrequency, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AnalyticsGetPostingFrequencyResponse{data=$data, optimalFrequency=$optimalFrequency, additionalProperties=$additionalProperties}"
}
