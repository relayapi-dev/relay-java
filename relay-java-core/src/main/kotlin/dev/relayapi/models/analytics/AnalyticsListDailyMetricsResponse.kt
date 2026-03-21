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

class AnalyticsListDailyMetricsResponse
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
         * [AnalyticsListDailyMetricsResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AnalyticsListDailyMetricsResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(analyticsListDailyMetricsResponse: AnalyticsListDailyMetricsResponse) =
            apply {
                data = analyticsListDailyMetricsResponse.data.map { it.toMutableList() }
                additionalProperties =
                    analyticsListDailyMetricsResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [AnalyticsListDailyMetricsResponse].
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
        fun build(): AnalyticsListDailyMetricsResponse =
            AnalyticsListDailyMetricsResponse(
                checkRequired("data", data).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AnalyticsListDailyMetricsResponse = apply {
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
        private val clicks: JsonField<Double>,
        private val comments: JsonField<Double>,
        private val date: JsonField<String>,
        private val impressions: JsonField<Double>,
        private val likes: JsonField<Double>,
        private val platforms: JsonField<Platforms>,
        private val postCount: JsonField<Double>,
        private val shares: JsonField<Double>,
        private val views: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("clicks") @ExcludeMissing clicks: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("comments")
            @ExcludeMissing
            comments: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("date") @ExcludeMissing date: JsonField<String> = JsonMissing.of(),
            @JsonProperty("impressions")
            @ExcludeMissing
            impressions: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("likes") @ExcludeMissing likes: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("platforms")
            @ExcludeMissing
            platforms: JsonField<Platforms> = JsonMissing.of(),
            @JsonProperty("post_count")
            @ExcludeMissing
            postCount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("shares") @ExcludeMissing shares: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("views") @ExcludeMissing views: JsonField<Double> = JsonMissing.of(),
        ) : this(
            clicks,
            comments,
            date,
            impressions,
            likes,
            platforms,
            postCount,
            shares,
            views,
            mutableMapOf(),
        )

        /**
         * Total clicks
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun clicks(): Double = clicks.getRequired("clicks")

        /**
         * Total comments
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun comments(): Double = comments.getRequired("comments")

        /**
         * Date (YYYY-MM-DD)
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun date(): String = date.getRequired("date")

        /**
         * Total impressions
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun impressions(): Double = impressions.getRequired("impressions")

        /**
         * Total likes
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun likes(): Double = likes.getRequired("likes")

        /**
         * Post count per platform
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun platforms(): Platforms = platforms.getRequired("platforms")

        /**
         * Posts published on this date
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun postCount(): Double = postCount.getRequired("post_count")

        /**
         * Total shares
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun shares(): Double = shares.getRequired("shares")

        /**
         * Total views
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun views(): Double = views.getRequired("views")

        /**
         * Returns the raw JSON value of [clicks].
         *
         * Unlike [clicks], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("clicks") @ExcludeMissing fun _clicks(): JsonField<Double> = clicks

        /**
         * Returns the raw JSON value of [comments].
         *
         * Unlike [comments], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("comments") @ExcludeMissing fun _comments(): JsonField<Double> = comments

        /**
         * Returns the raw JSON value of [date].
         *
         * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<String> = date

        /**
         * Returns the raw JSON value of [impressions].
         *
         * Unlike [impressions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("impressions")
        @ExcludeMissing
        fun _impressions(): JsonField<Double> = impressions

        /**
         * Returns the raw JSON value of [likes].
         *
         * Unlike [likes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("likes") @ExcludeMissing fun _likes(): JsonField<Double> = likes

        /**
         * Returns the raw JSON value of [platforms].
         *
         * Unlike [platforms], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("platforms")
        @ExcludeMissing
        fun _platforms(): JsonField<Platforms> = platforms

        /**
         * Returns the raw JSON value of [postCount].
         *
         * Unlike [postCount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("post_count") @ExcludeMissing fun _postCount(): JsonField<Double> = postCount

        /**
         * Returns the raw JSON value of [shares].
         *
         * Unlike [shares], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("shares") @ExcludeMissing fun _shares(): JsonField<Double> = shares

        /**
         * Returns the raw JSON value of [views].
         *
         * Unlike [views], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("views") @ExcludeMissing fun _views(): JsonField<Double> = views

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
             * .clicks()
             * .comments()
             * .date()
             * .impressions()
             * .likes()
             * .platforms()
             * .postCount()
             * .shares()
             * .views()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var clicks: JsonField<Double>? = null
            private var comments: JsonField<Double>? = null
            private var date: JsonField<String>? = null
            private var impressions: JsonField<Double>? = null
            private var likes: JsonField<Double>? = null
            private var platforms: JsonField<Platforms>? = null
            private var postCount: JsonField<Double>? = null
            private var shares: JsonField<Double>? = null
            private var views: JsonField<Double>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                clicks = data.clicks
                comments = data.comments
                date = data.date
                impressions = data.impressions
                likes = data.likes
                platforms = data.platforms
                postCount = data.postCount
                shares = data.shares
                views = data.views
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Total clicks */
            fun clicks(clicks: Double) = clicks(JsonField.of(clicks))

            /**
             * Sets [Builder.clicks] to an arbitrary JSON value.
             *
             * You should usually call [Builder.clicks] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun clicks(clicks: JsonField<Double>) = apply { this.clicks = clicks }

            /** Total comments */
            fun comments(comments: Double) = comments(JsonField.of(comments))

            /**
             * Sets [Builder.comments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.comments] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun comments(comments: JsonField<Double>) = apply { this.comments = comments }

            /** Date (YYYY-MM-DD) */
            fun date(date: String) = date(JsonField.of(date))

            /**
             * Sets [Builder.date] to an arbitrary JSON value.
             *
             * You should usually call [Builder.date] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun date(date: JsonField<String>) = apply { this.date = date }

            /** Total impressions */
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

            /** Total likes */
            fun likes(likes: Double) = likes(JsonField.of(likes))

            /**
             * Sets [Builder.likes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.likes] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun likes(likes: JsonField<Double>) = apply { this.likes = likes }

            /** Post count per platform */
            fun platforms(platforms: Platforms) = platforms(JsonField.of(platforms))

            /**
             * Sets [Builder.platforms] to an arbitrary JSON value.
             *
             * You should usually call [Builder.platforms] with a well-typed [Platforms] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun platforms(platforms: JsonField<Platforms>) = apply { this.platforms = platforms }

            /** Posts published on this date */
            fun postCount(postCount: Double) = postCount(JsonField.of(postCount))

            /**
             * Sets [Builder.postCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postCount] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postCount(postCount: JsonField<Double>) = apply { this.postCount = postCount }

            /** Total shares */
            fun shares(shares: Double) = shares(JsonField.of(shares))

            /**
             * Sets [Builder.shares] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shares] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun shares(shares: JsonField<Double>) = apply { this.shares = shares }

            /** Total views */
            fun views(views: Double) = views(JsonField.of(views))

            /**
             * Sets [Builder.views] to an arbitrary JSON value.
             *
             * You should usually call [Builder.views] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun views(views: JsonField<Double>) = apply { this.views = views }

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
             * .clicks()
             * .comments()
             * .date()
             * .impressions()
             * .likes()
             * .platforms()
             * .postCount()
             * .shares()
             * .views()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("clicks", clicks),
                    checkRequired("comments", comments),
                    checkRequired("date", date),
                    checkRequired("impressions", impressions),
                    checkRequired("likes", likes),
                    checkRequired("platforms", platforms),
                    checkRequired("postCount", postCount),
                    checkRequired("shares", shares),
                    checkRequired("views", views),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            clicks()
            comments()
            date()
            impressions()
            likes()
            platforms().validate()
            postCount()
            shares()
            views()
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
            (if (clicks.asKnown().isPresent) 1 else 0) +
                (if (comments.asKnown().isPresent) 1 else 0) +
                (if (date.asKnown().isPresent) 1 else 0) +
                (if (impressions.asKnown().isPresent) 1 else 0) +
                (if (likes.asKnown().isPresent) 1 else 0) +
                (platforms.asKnown().getOrNull()?.validity() ?: 0) +
                (if (postCount.asKnown().isPresent) 1 else 0) +
                (if (shares.asKnown().isPresent) 1 else 0) +
                (if (views.asKnown().isPresent) 1 else 0)

        /** Post count per platform */
        class Platforms
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

                /** Returns a mutable builder for constructing an instance of [Platforms]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Platforms]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(platforms: Platforms) = apply {
                    additionalProperties = platforms.additionalProperties.toMutableMap()
                }

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
                 * Returns an immutable instance of [Platforms].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Platforms = Platforms(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Platforms = apply {
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

                return other is Platforms && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Platforms{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                clicks == other.clicks &&
                comments == other.comments &&
                date == other.date &&
                impressions == other.impressions &&
                likes == other.likes &&
                platforms == other.platforms &&
                postCount == other.postCount &&
                shares == other.shares &&
                views == other.views &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                clicks,
                comments,
                date,
                impressions,
                likes,
                platforms,
                postCount,
                shares,
                views,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{clicks=$clicks, comments=$comments, date=$date, impressions=$impressions, likes=$likes, platforms=$platforms, postCount=$postCount, shares=$shares, views=$views, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AnalyticsListDailyMetricsResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AnalyticsListDailyMetricsResponse{data=$data, additionalProperties=$additionalProperties}"
}
