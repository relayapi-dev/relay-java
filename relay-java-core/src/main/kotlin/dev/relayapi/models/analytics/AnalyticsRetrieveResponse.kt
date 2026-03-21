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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AnalyticsRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val overview: JsonField<Overview>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of(),
        @JsonProperty("overview") @ExcludeMissing overview: JsonField<Overview> = JsonMissing.of(),
    ) : this(data, overview, mutableMapOf())

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): List<Data> = data.getRequired("data")

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun overview(): Optional<Overview> = overview.getOptional("overview")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

    /**
     * Returns the raw JSON value of [overview].
     *
     * Unlike [overview], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("overview") @ExcludeMissing fun _overview(): JsonField<Overview> = overview

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
         * Returns a mutable builder for constructing an instance of [AnalyticsRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AnalyticsRetrieveResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var overview: JsonField<Overview> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(analyticsRetrieveResponse: AnalyticsRetrieveResponse) = apply {
            data = analyticsRetrieveResponse.data.map { it.toMutableList() }
            overview = analyticsRetrieveResponse.overview
            additionalProperties = analyticsRetrieveResponse.additionalProperties.toMutableMap()
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

        fun overview(overview: Overview) = overview(JsonField.of(overview))

        /**
         * Sets [Builder.overview] to an arbitrary JSON value.
         *
         * You should usually call [Builder.overview] with a well-typed [Overview] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun overview(overview: JsonField<Overview>) = apply { this.overview = overview }

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
         * Returns an immutable instance of [AnalyticsRetrieveResponse].
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
        fun build(): AnalyticsRetrieveResponse =
            AnalyticsRetrieveResponse(
                checkRequired("data", data).map { it.toImmutable() },
                overview,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AnalyticsRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
        overview().ifPresent { it.validate() }
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
            (overview.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val platform: JsonField<Platform>,
        private val postId: JsonField<String>,
        private val publishedAt: JsonField<OffsetDateTime>,
        private val clicks: JsonField<Double>,
        private val comments: JsonField<Double>,
        private val impressions: JsonField<Double>,
        private val likes: JsonField<Double>,
        private val reach: JsonField<Double>,
        private val saves: JsonField<Double>,
        private val shares: JsonField<Double>,
        private val views: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("platform")
            @ExcludeMissing
            platform: JsonField<Platform> = JsonMissing.of(),
            @JsonProperty("post_id") @ExcludeMissing postId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("published_at")
            @ExcludeMissing
            publishedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("clicks") @ExcludeMissing clicks: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("comments")
            @ExcludeMissing
            comments: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("impressions")
            @ExcludeMissing
            impressions: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("likes") @ExcludeMissing likes: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("reach") @ExcludeMissing reach: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("saves") @ExcludeMissing saves: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("shares") @ExcludeMissing shares: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("views") @ExcludeMissing views: JsonField<Double> = JsonMissing.of(),
        ) : this(
            platform,
            postId,
            publishedAt,
            clicks,
            comments,
            impressions,
            likes,
            reach,
            saves,
            shares,
            views,
            mutableMapOf(),
        )

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun platform(): Platform = platform.getRequired("platform")

        /**
         * Post ID
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun postId(): String = postId.getRequired("post_id")

        /**
         * Published timestamp
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun publishedAt(): OffsetDateTime = publishedAt.getRequired("published_at")

        /**
         * Total clicks
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun clicks(): Optional<Double> = clicks.getOptional("clicks")

        /**
         * Total comments
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun comments(): Optional<Double> = comments.getOptional("comments")

        /**
         * Total impressions
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun impressions(): Optional<Double> = impressions.getOptional("impressions")

        /**
         * Total likes
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun likes(): Optional<Double> = likes.getOptional("likes")

        /**
         * Total reach
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun reach(): Optional<Double> = reach.getOptional("reach")

        /**
         * Total saves
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun saves(): Optional<Double> = saves.getOptional("saves")

        /**
         * Total shares
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun shares(): Optional<Double> = shares.getOptional("shares")

        /**
         * Total views
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun views(): Optional<Double> = views.getOptional("views")

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

        /**
         * Returns the raw JSON value of [publishedAt].
         *
         * Unlike [publishedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("published_at")
        @ExcludeMissing
        fun _publishedAt(): JsonField<OffsetDateTime> = publishedAt

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
         * Returns the raw JSON value of [reach].
         *
         * Unlike [reach], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reach") @ExcludeMissing fun _reach(): JsonField<Double> = reach

        /**
         * Returns the raw JSON value of [saves].
         *
         * Unlike [saves], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("saves") @ExcludeMissing fun _saves(): JsonField<Double> = saves

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
             * .platform()
             * .postId()
             * .publishedAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var platform: JsonField<Platform>? = null
            private var postId: JsonField<String>? = null
            private var publishedAt: JsonField<OffsetDateTime>? = null
            private var clicks: JsonField<Double> = JsonMissing.of()
            private var comments: JsonField<Double> = JsonMissing.of()
            private var impressions: JsonField<Double> = JsonMissing.of()
            private var likes: JsonField<Double> = JsonMissing.of()
            private var reach: JsonField<Double> = JsonMissing.of()
            private var saves: JsonField<Double> = JsonMissing.of()
            private var shares: JsonField<Double> = JsonMissing.of()
            private var views: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                platform = data.platform
                postId = data.postId
                publishedAt = data.publishedAt
                clicks = data.clicks
                comments = data.comments
                impressions = data.impressions
                likes = data.likes
                reach = data.reach
                saves = data.saves
                shares = data.shares
                views = data.views
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun platform(platform: Platform) = platform(JsonField.of(platform))

            /**
             * Sets [Builder.platform] to an arbitrary JSON value.
             *
             * You should usually call [Builder.platform] with a well-typed [Platform] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun platform(platform: JsonField<Platform>) = apply { this.platform = platform }

            /** Post ID */
            fun postId(postId: String) = postId(JsonField.of(postId))

            /**
             * Sets [Builder.postId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postId(postId: JsonField<String>) = apply { this.postId = postId }

            /** Published timestamp */
            fun publishedAt(publishedAt: OffsetDateTime) = publishedAt(JsonField.of(publishedAt))

            /**
             * Sets [Builder.publishedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.publishedAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun publishedAt(publishedAt: JsonField<OffsetDateTime>) = apply {
                this.publishedAt = publishedAt
            }

            /** Total clicks */
            fun clicks(clicks: Double?) = clicks(JsonField.ofNullable(clicks))

            /**
             * Alias for [Builder.clicks].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun clicks(clicks: Double) = clicks(clicks as Double?)

            /** Alias for calling [Builder.clicks] with `clicks.orElse(null)`. */
            fun clicks(clicks: Optional<Double>) = clicks(clicks.getOrNull())

            /**
             * Sets [Builder.clicks] to an arbitrary JSON value.
             *
             * You should usually call [Builder.clicks] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun clicks(clicks: JsonField<Double>) = apply { this.clicks = clicks }

            /** Total comments */
            fun comments(comments: Double?) = comments(JsonField.ofNullable(comments))

            /**
             * Alias for [Builder.comments].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun comments(comments: Double) = comments(comments as Double?)

            /** Alias for calling [Builder.comments] with `comments.orElse(null)`. */
            fun comments(comments: Optional<Double>) = comments(comments.getOrNull())

            /**
             * Sets [Builder.comments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.comments] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun comments(comments: JsonField<Double>) = apply { this.comments = comments }

            /** Total impressions */
            fun impressions(impressions: Double?) = impressions(JsonField.ofNullable(impressions))

            /**
             * Alias for [Builder.impressions].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun impressions(impressions: Double) = impressions(impressions as Double?)

            /** Alias for calling [Builder.impressions] with `impressions.orElse(null)`. */
            fun impressions(impressions: Optional<Double>) = impressions(impressions.getOrNull())

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
            fun likes(likes: Double?) = likes(JsonField.ofNullable(likes))

            /**
             * Alias for [Builder.likes].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun likes(likes: Double) = likes(likes as Double?)

            /** Alias for calling [Builder.likes] with `likes.orElse(null)`. */
            fun likes(likes: Optional<Double>) = likes(likes.getOrNull())

            /**
             * Sets [Builder.likes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.likes] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun likes(likes: JsonField<Double>) = apply { this.likes = likes }

            /** Total reach */
            fun reach(reach: Double?) = reach(JsonField.ofNullable(reach))

            /**
             * Alias for [Builder.reach].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun reach(reach: Double) = reach(reach as Double?)

            /** Alias for calling [Builder.reach] with `reach.orElse(null)`. */
            fun reach(reach: Optional<Double>) = reach(reach.getOrNull())

            /**
             * Sets [Builder.reach] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reach] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reach(reach: JsonField<Double>) = apply { this.reach = reach }

            /** Total saves */
            fun saves(saves: Double?) = saves(JsonField.ofNullable(saves))

            /**
             * Alias for [Builder.saves].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun saves(saves: Double) = saves(saves as Double?)

            /** Alias for calling [Builder.saves] with `saves.orElse(null)`. */
            fun saves(saves: Optional<Double>) = saves(saves.getOrNull())

            /**
             * Sets [Builder.saves] to an arbitrary JSON value.
             *
             * You should usually call [Builder.saves] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun saves(saves: JsonField<Double>) = apply { this.saves = saves }

            /** Total shares */
            fun shares(shares: Double?) = shares(JsonField.ofNullable(shares))

            /**
             * Alias for [Builder.shares].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun shares(shares: Double) = shares(shares as Double?)

            /** Alias for calling [Builder.shares] with `shares.orElse(null)`. */
            fun shares(shares: Optional<Double>) = shares(shares.getOrNull())

            /**
             * Sets [Builder.shares] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shares] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun shares(shares: JsonField<Double>) = apply { this.shares = shares }

            /** Total views */
            fun views(views: Double?) = views(JsonField.ofNullable(views))

            /**
             * Alias for [Builder.views].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun views(views: Double) = views(views as Double?)

            /** Alias for calling [Builder.views] with `views.orElse(null)`. */
            fun views(views: Optional<Double>) = views(views.getOrNull())

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
             * .platform()
             * .postId()
             * .publishedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("platform", platform),
                    checkRequired("postId", postId),
                    checkRequired("publishedAt", publishedAt),
                    clicks,
                    comments,
                    impressions,
                    likes,
                    reach,
                    saves,
                    shares,
                    views,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            platform().validate()
            postId()
            publishedAt()
            clicks()
            comments()
            impressions()
            likes()
            reach()
            saves()
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
            (platform.asKnown().getOrNull()?.validity() ?: 0) +
                (if (postId.asKnown().isPresent) 1 else 0) +
                (if (publishedAt.asKnown().isPresent) 1 else 0) +
                (if (clicks.asKnown().isPresent) 1 else 0) +
                (if (comments.asKnown().isPresent) 1 else 0) +
                (if (impressions.asKnown().isPresent) 1 else 0) +
                (if (likes.asKnown().isPresent) 1 else 0) +
                (if (reach.asKnown().isPresent) 1 else 0) +
                (if (saves.asKnown().isPresent) 1 else 0) +
                (if (shares.asKnown().isPresent) 1 else 0) +
                (if (views.asKnown().isPresent) 1 else 0)

        class Platform @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
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
                /**
                 * An enum member indicating that [Platform] was instantiated with an unknown value.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws RelayInvalidDataException if this class instance's value is a not a known
             *   member.
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

            return other is Data &&
                platform == other.platform &&
                postId == other.postId &&
                publishedAt == other.publishedAt &&
                clicks == other.clicks &&
                comments == other.comments &&
                impressions == other.impressions &&
                likes == other.likes &&
                reach == other.reach &&
                saves == other.saves &&
                shares == other.shares &&
                views == other.views &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                platform,
                postId,
                publishedAt,
                clicks,
                comments,
                impressions,
                likes,
                reach,
                saves,
                shares,
                views,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{platform=$platform, postId=$postId, publishedAt=$publishedAt, clicks=$clicks, comments=$comments, impressions=$impressions, likes=$likes, reach=$reach, saves=$saves, shares=$shares, views=$views, additionalProperties=$additionalProperties}"
    }

    class Overview
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val totalClicks: JsonField<Double>,
        private val totalComments: JsonField<Double>,
        private val totalImpressions: JsonField<Double>,
        private val totalLikes: JsonField<Double>,
        private val totalPosts: JsonField<Double>,
        private val totalShares: JsonField<Double>,
        private val totalViews: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("total_clicks")
            @ExcludeMissing
            totalClicks: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("total_comments")
            @ExcludeMissing
            totalComments: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("total_impressions")
            @ExcludeMissing
            totalImpressions: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("total_likes")
            @ExcludeMissing
            totalLikes: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("total_posts")
            @ExcludeMissing
            totalPosts: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("total_shares")
            @ExcludeMissing
            totalShares: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("total_views")
            @ExcludeMissing
            totalViews: JsonField<Double> = JsonMissing.of(),
        ) : this(
            totalClicks,
            totalComments,
            totalImpressions,
            totalLikes,
            totalPosts,
            totalShares,
            totalViews,
            mutableMapOf(),
        )

        /**
         * Total clicks across posts
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun totalClicks(): Double = totalClicks.getRequired("total_clicks")

        /**
         * Total comments across posts
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun totalComments(): Double = totalComments.getRequired("total_comments")

        /**
         * Total impressions across posts
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun totalImpressions(): Double = totalImpressions.getRequired("total_impressions")

        /**
         * Total likes across posts
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun totalLikes(): Double = totalLikes.getRequired("total_likes")

        /**
         * Total number of posts
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun totalPosts(): Double = totalPosts.getRequired("total_posts")

        /**
         * Total shares across posts
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun totalShares(): Double = totalShares.getRequired("total_shares")

        /**
         * Total views across posts
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun totalViews(): Double = totalViews.getRequired("total_views")

        /**
         * Returns the raw JSON value of [totalClicks].
         *
         * Unlike [totalClicks], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total_clicks")
        @ExcludeMissing
        fun _totalClicks(): JsonField<Double> = totalClicks

        /**
         * Returns the raw JSON value of [totalComments].
         *
         * Unlike [totalComments], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("total_comments")
        @ExcludeMissing
        fun _totalComments(): JsonField<Double> = totalComments

        /**
         * Returns the raw JSON value of [totalImpressions].
         *
         * Unlike [totalImpressions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("total_impressions")
        @ExcludeMissing
        fun _totalImpressions(): JsonField<Double> = totalImpressions

        /**
         * Returns the raw JSON value of [totalLikes].
         *
         * Unlike [totalLikes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total_likes")
        @ExcludeMissing
        fun _totalLikes(): JsonField<Double> = totalLikes

        /**
         * Returns the raw JSON value of [totalPosts].
         *
         * Unlike [totalPosts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total_posts")
        @ExcludeMissing
        fun _totalPosts(): JsonField<Double> = totalPosts

        /**
         * Returns the raw JSON value of [totalShares].
         *
         * Unlike [totalShares], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total_shares")
        @ExcludeMissing
        fun _totalShares(): JsonField<Double> = totalShares

        /**
         * Returns the raw JSON value of [totalViews].
         *
         * Unlike [totalViews], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total_views")
        @ExcludeMissing
        fun _totalViews(): JsonField<Double> = totalViews

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
             * Returns a mutable builder for constructing an instance of [Overview].
             *
             * The following fields are required:
             * ```java
             * .totalClicks()
             * .totalComments()
             * .totalImpressions()
             * .totalLikes()
             * .totalPosts()
             * .totalShares()
             * .totalViews()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Overview]. */
        class Builder internal constructor() {

            private var totalClicks: JsonField<Double>? = null
            private var totalComments: JsonField<Double>? = null
            private var totalImpressions: JsonField<Double>? = null
            private var totalLikes: JsonField<Double>? = null
            private var totalPosts: JsonField<Double>? = null
            private var totalShares: JsonField<Double>? = null
            private var totalViews: JsonField<Double>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(overview: Overview) = apply {
                totalClicks = overview.totalClicks
                totalComments = overview.totalComments
                totalImpressions = overview.totalImpressions
                totalLikes = overview.totalLikes
                totalPosts = overview.totalPosts
                totalShares = overview.totalShares
                totalViews = overview.totalViews
                additionalProperties = overview.additionalProperties.toMutableMap()
            }

            /** Total clicks across posts */
            fun totalClicks(totalClicks: Double) = totalClicks(JsonField.of(totalClicks))

            /**
             * Sets [Builder.totalClicks] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalClicks] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalClicks(totalClicks: JsonField<Double>) = apply {
                this.totalClicks = totalClicks
            }

            /** Total comments across posts */
            fun totalComments(totalComments: Double) = totalComments(JsonField.of(totalComments))

            /**
             * Sets [Builder.totalComments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalComments] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalComments(totalComments: JsonField<Double>) = apply {
                this.totalComments = totalComments
            }

            /** Total impressions across posts */
            fun totalImpressions(totalImpressions: Double) =
                totalImpressions(JsonField.of(totalImpressions))

            /**
             * Sets [Builder.totalImpressions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalImpressions] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalImpressions(totalImpressions: JsonField<Double>) = apply {
                this.totalImpressions = totalImpressions
            }

            /** Total likes across posts */
            fun totalLikes(totalLikes: Double) = totalLikes(JsonField.of(totalLikes))

            /**
             * Sets [Builder.totalLikes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalLikes] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalLikes(totalLikes: JsonField<Double>) = apply { this.totalLikes = totalLikes }

            /** Total number of posts */
            fun totalPosts(totalPosts: Double) = totalPosts(JsonField.of(totalPosts))

            /**
             * Sets [Builder.totalPosts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalPosts] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalPosts(totalPosts: JsonField<Double>) = apply { this.totalPosts = totalPosts }

            /** Total shares across posts */
            fun totalShares(totalShares: Double) = totalShares(JsonField.of(totalShares))

            /**
             * Sets [Builder.totalShares] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalShares] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalShares(totalShares: JsonField<Double>) = apply {
                this.totalShares = totalShares
            }

            /** Total views across posts */
            fun totalViews(totalViews: Double) = totalViews(JsonField.of(totalViews))

            /**
             * Sets [Builder.totalViews] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalViews] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalViews(totalViews: JsonField<Double>) = apply { this.totalViews = totalViews }

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
             * Returns an immutable instance of [Overview].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .totalClicks()
             * .totalComments()
             * .totalImpressions()
             * .totalLikes()
             * .totalPosts()
             * .totalShares()
             * .totalViews()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Overview =
                Overview(
                    checkRequired("totalClicks", totalClicks),
                    checkRequired("totalComments", totalComments),
                    checkRequired("totalImpressions", totalImpressions),
                    checkRequired("totalLikes", totalLikes),
                    checkRequired("totalPosts", totalPosts),
                    checkRequired("totalShares", totalShares),
                    checkRequired("totalViews", totalViews),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Overview = apply {
            if (validated) {
                return@apply
            }

            totalClicks()
            totalComments()
            totalImpressions()
            totalLikes()
            totalPosts()
            totalShares()
            totalViews()
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
            (if (totalClicks.asKnown().isPresent) 1 else 0) +
                (if (totalComments.asKnown().isPresent) 1 else 0) +
                (if (totalImpressions.asKnown().isPresent) 1 else 0) +
                (if (totalLikes.asKnown().isPresent) 1 else 0) +
                (if (totalPosts.asKnown().isPresent) 1 else 0) +
                (if (totalShares.asKnown().isPresent) 1 else 0) +
                (if (totalViews.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Overview &&
                totalClicks == other.totalClicks &&
                totalComments == other.totalComments &&
                totalImpressions == other.totalImpressions &&
                totalLikes == other.totalLikes &&
                totalPosts == other.totalPosts &&
                totalShares == other.totalShares &&
                totalViews == other.totalViews &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                totalClicks,
                totalComments,
                totalImpressions,
                totalLikes,
                totalPosts,
                totalShares,
                totalViews,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Overview{totalClicks=$totalClicks, totalComments=$totalComments, totalImpressions=$totalImpressions, totalLikes=$totalLikes, totalPosts=$totalPosts, totalShares=$totalShares, totalViews=$totalViews, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AnalyticsRetrieveResponse &&
            data == other.data &&
            overview == other.overview &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, overview, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AnalyticsRetrieveResponse{data=$data, overview=$overview, additionalProperties=$additionalProperties}"
}
