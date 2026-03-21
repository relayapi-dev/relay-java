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
import kotlin.jvm.optionals.getOrNull

class AnalyticsGetBestTimeResponse
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
         * Returns a mutable builder for constructing an instance of [AnalyticsGetBestTimeResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AnalyticsGetBestTimeResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(analyticsGetBestTimeResponse: AnalyticsGetBestTimeResponse) = apply {
            data = analyticsGetBestTimeResponse.data.map { it.toMutableList() }
            additionalProperties = analyticsGetBestTimeResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [AnalyticsGetBestTimeResponse].
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
        fun build(): AnalyticsGetBestTimeResponse =
            AnalyticsGetBestTimeResponse(
                checkRequired("data", data).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AnalyticsGetBestTimeResponse = apply {
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
        private val avgEngagement: JsonField<Double>,
        private val dayOfWeek: JsonField<Long>,
        private val hourUtc: JsonField<Long>,
        private val postCount: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("avg_engagement")
            @ExcludeMissing
            avgEngagement: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("day_of_week")
            @ExcludeMissing
            dayOfWeek: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("hour_utc") @ExcludeMissing hourUtc: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("post_count")
            @ExcludeMissing
            postCount: JsonField<Double> = JsonMissing.of(),
        ) : this(avgEngagement, dayOfWeek, hourUtc, postCount, mutableMapOf())

        /**
         * Average engagement score
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun avgEngagement(): Double = avgEngagement.getRequired("avg_engagement")

        /**
         * Day of week (0=Sunday)
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dayOfWeek(): Long = dayOfWeek.getRequired("day_of_week")

        /**
         * Hour in UTC
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun hourUtc(): Long = hourUtc.getRequired("hour_utc")

        /**
         * Number of posts analyzed
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun postCount(): Double = postCount.getRequired("post_count")

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
         * Returns the raw JSON value of [dayOfWeek].
         *
         * Unlike [dayOfWeek], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("day_of_week") @ExcludeMissing fun _dayOfWeek(): JsonField<Long> = dayOfWeek

        /**
         * Returns the raw JSON value of [hourUtc].
         *
         * Unlike [hourUtc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("hour_utc") @ExcludeMissing fun _hourUtc(): JsonField<Long> = hourUtc

        /**
         * Returns the raw JSON value of [postCount].
         *
         * Unlike [postCount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("post_count") @ExcludeMissing fun _postCount(): JsonField<Double> = postCount

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
             * .dayOfWeek()
             * .hourUtc()
             * .postCount()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var avgEngagement: JsonField<Double>? = null
            private var dayOfWeek: JsonField<Long>? = null
            private var hourUtc: JsonField<Long>? = null
            private var postCount: JsonField<Double>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                avgEngagement = data.avgEngagement
                dayOfWeek = data.dayOfWeek
                hourUtc = data.hourUtc
                postCount = data.postCount
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Average engagement score */
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

            /** Day of week (0=Sunday) */
            fun dayOfWeek(dayOfWeek: Long) = dayOfWeek(JsonField.of(dayOfWeek))

            /**
             * Sets [Builder.dayOfWeek] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dayOfWeek] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dayOfWeek(dayOfWeek: JsonField<Long>) = apply { this.dayOfWeek = dayOfWeek }

            /** Hour in UTC */
            fun hourUtc(hourUtc: Long) = hourUtc(JsonField.of(hourUtc))

            /**
             * Sets [Builder.hourUtc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hourUtc] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hourUtc(hourUtc: JsonField<Long>) = apply { this.hourUtc = hourUtc }

            /** Number of posts analyzed */
            fun postCount(postCount: Double) = postCount(JsonField.of(postCount))

            /**
             * Sets [Builder.postCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postCount] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postCount(postCount: JsonField<Double>) = apply { this.postCount = postCount }

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
             * .dayOfWeek()
             * .hourUtc()
             * .postCount()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("avgEngagement", avgEngagement),
                    checkRequired("dayOfWeek", dayOfWeek),
                    checkRequired("hourUtc", hourUtc),
                    checkRequired("postCount", postCount),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            avgEngagement()
            dayOfWeek()
            hourUtc()
            postCount()
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
                (if (dayOfWeek.asKnown().isPresent) 1 else 0) +
                (if (hourUtc.asKnown().isPresent) 1 else 0) +
                (if (postCount.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                avgEngagement == other.avgEngagement &&
                dayOfWeek == other.dayOfWeek &&
                hourUtc == other.hourUtc &&
                postCount == other.postCount &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(avgEngagement, dayOfWeek, hourUtc, postCount, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{avgEngagement=$avgEngagement, dayOfWeek=$dayOfWeek, hourUtc=$hourUtc, postCount=$postCount, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AnalyticsGetBestTimeResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AnalyticsGetBestTimeResponse{data=$data, additionalProperties=$additionalProperties}"
}
