// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.analytics.youtube

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

class YoutubeGetDailyViewsResponse
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
         * Returns a mutable builder for constructing an instance of [YoutubeGetDailyViewsResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [YoutubeGetDailyViewsResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(youtubeGetDailyViewsResponse: YoutubeGetDailyViewsResponse) = apply {
            data = youtubeGetDailyViewsResponse.data.map { it.toMutableList() }
            additionalProperties = youtubeGetDailyViewsResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [YoutubeGetDailyViewsResponse].
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
        fun build(): YoutubeGetDailyViewsResponse =
            YoutubeGetDailyViewsResponse(
                checkRequired("data", data).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): YoutubeGetDailyViewsResponse = apply {
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
        private val date: JsonField<String>,
        private val subscribersGained: JsonField<Double>,
        private val views: JsonField<Double>,
        private val watchTimeMinutes: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("date") @ExcludeMissing date: JsonField<String> = JsonMissing.of(),
            @JsonProperty("subscribers_gained")
            @ExcludeMissing
            subscribersGained: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("views") @ExcludeMissing views: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("watch_time_minutes")
            @ExcludeMissing
            watchTimeMinutes: JsonField<Double> = JsonMissing.of(),
        ) : this(date, subscribersGained, views, watchTimeMinutes, mutableMapOf())

        /**
         * Date (YYYY-MM-DD)
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun date(): String = date.getRequired("date")

        /**
         * Net subscribers gained
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun subscribersGained(): Double = subscribersGained.getRequired("subscribers_gained")

        /**
         * Total views
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun views(): Double = views.getRequired("views")

        /**
         * Watch time in minutes
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun watchTimeMinutes(): Double = watchTimeMinutes.getRequired("watch_time_minutes")

        /**
         * Returns the raw JSON value of [date].
         *
         * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<String> = date

        /**
         * Returns the raw JSON value of [subscribersGained].
         *
         * Unlike [subscribersGained], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("subscribers_gained")
        @ExcludeMissing
        fun _subscribersGained(): JsonField<Double> = subscribersGained

        /**
         * Returns the raw JSON value of [views].
         *
         * Unlike [views], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("views") @ExcludeMissing fun _views(): JsonField<Double> = views

        /**
         * Returns the raw JSON value of [watchTimeMinutes].
         *
         * Unlike [watchTimeMinutes], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("watch_time_minutes")
        @ExcludeMissing
        fun _watchTimeMinutes(): JsonField<Double> = watchTimeMinutes

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
             * .date()
             * .subscribersGained()
             * .views()
             * .watchTimeMinutes()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var date: JsonField<String>? = null
            private var subscribersGained: JsonField<Double>? = null
            private var views: JsonField<Double>? = null
            private var watchTimeMinutes: JsonField<Double>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                date = data.date
                subscribersGained = data.subscribersGained
                views = data.views
                watchTimeMinutes = data.watchTimeMinutes
                additionalProperties = data.additionalProperties.toMutableMap()
            }

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

            /** Net subscribers gained */
            fun subscribersGained(subscribersGained: Double) =
                subscribersGained(JsonField.of(subscribersGained))

            /**
             * Sets [Builder.subscribersGained] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscribersGained] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subscribersGained(subscribersGained: JsonField<Double>) = apply {
                this.subscribersGained = subscribersGained
            }

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

            /** Watch time in minutes */
            fun watchTimeMinutes(watchTimeMinutes: Double) =
                watchTimeMinutes(JsonField.of(watchTimeMinutes))

            /**
             * Sets [Builder.watchTimeMinutes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.watchTimeMinutes] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun watchTimeMinutes(watchTimeMinutes: JsonField<Double>) = apply {
                this.watchTimeMinutes = watchTimeMinutes
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
             * .date()
             * .subscribersGained()
             * .views()
             * .watchTimeMinutes()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("date", date),
                    checkRequired("subscribersGained", subscribersGained),
                    checkRequired("views", views),
                    checkRequired("watchTimeMinutes", watchTimeMinutes),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            date()
            subscribersGained()
            views()
            watchTimeMinutes()
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
            (if (date.asKnown().isPresent) 1 else 0) +
                (if (subscribersGained.asKnown().isPresent) 1 else 0) +
                (if (views.asKnown().isPresent) 1 else 0) +
                (if (watchTimeMinutes.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                date == other.date &&
                subscribersGained == other.subscribersGained &&
                views == other.views &&
                watchTimeMinutes == other.watchTimeMinutes &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(date, subscribersGained, views, watchTimeMinutes, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{date=$date, subscribersGained=$subscribersGained, views=$views, watchTimeMinutes=$watchTimeMinutes, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is YoutubeGetDailyViewsResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "YoutubeGetDailyViewsResponse{data=$data, additionalProperties=$additionalProperties}"
}
