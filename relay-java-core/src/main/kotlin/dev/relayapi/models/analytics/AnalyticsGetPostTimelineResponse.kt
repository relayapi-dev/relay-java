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

class AnalyticsGetPostTimelineResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val postId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of(),
        @JsonProperty("post_id") @ExcludeMissing postId: JsonField<String> = JsonMissing.of(),
    ) : this(data, postId, mutableMapOf())

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): List<Data> = data.getRequired("data")

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
         * [AnalyticsGetPostTimelineResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * .postId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AnalyticsGetPostTimelineResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var postId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(analyticsGetPostTimelineResponse: AnalyticsGetPostTimelineResponse) =
            apply {
                data = analyticsGetPostTimelineResponse.data.map { it.toMutableList() }
                postId = analyticsGetPostTimelineResponse.postId
                additionalProperties =
                    analyticsGetPostTimelineResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [AnalyticsGetPostTimelineResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .data()
         * .postId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AnalyticsGetPostTimelineResponse =
            AnalyticsGetPostTimelineResponse(
                checkRequired("data", data).map { it.toImmutable() },
                checkRequired("postId", postId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AnalyticsGetPostTimelineResponse = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
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
            (if (postId.asKnown().isPresent) 1 else 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val clicks: JsonField<Double>,
        private val comments: JsonField<Double>,
        private val date: JsonField<String>,
        private val impressions: JsonField<Double>,
        private val likes: JsonField<Double>,
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
            @JsonProperty("shares") @ExcludeMissing shares: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("views") @ExcludeMissing views: JsonField<Double> = JsonMissing.of(),
        ) : this(clicks, comments, date, impressions, likes, shares, views, mutableMapOf())

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun clicks(): Double = clicks.getRequired("clicks")

        /**
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
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun impressions(): Double = impressions.getRequired("impressions")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun likes(): Double = likes.getRequired("likes")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun shares(): Double = shares.getRequired("shares")

        /**
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
                shares = data.shares
                views = data.views
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun clicks(clicks: Double) = clicks(JsonField.of(clicks))

            /**
             * Sets [Builder.clicks] to an arbitrary JSON value.
             *
             * You should usually call [Builder.clicks] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun clicks(clicks: JsonField<Double>) = apply { this.clicks = clicks }

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

            fun likes(likes: Double) = likes(JsonField.of(likes))

            /**
             * Sets [Builder.likes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.likes] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun likes(likes: JsonField<Double>) = apply { this.likes = likes }

            fun shares(shares: Double) = shares(JsonField.of(shares))

            /**
             * Sets [Builder.shares] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shares] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun shares(shares: JsonField<Double>) = apply { this.shares = shares }

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
                (if (shares.asKnown().isPresent) 1 else 0) +
                (if (views.asKnown().isPresent) 1 else 0)

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
                shares,
                views,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{clicks=$clicks, comments=$comments, date=$date, impressions=$impressions, likes=$likes, shares=$shares, views=$views, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AnalyticsGetPostTimelineResponse &&
            data == other.data &&
            postId == other.postId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, postId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AnalyticsGetPostTimelineResponse{data=$data, postId=$postId, additionalProperties=$additionalProperties}"
}
