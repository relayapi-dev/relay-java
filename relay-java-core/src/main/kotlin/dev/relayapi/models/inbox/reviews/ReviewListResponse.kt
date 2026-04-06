// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.inbox.reviews

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

class ReviewListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val hasMore: JsonField<Boolean>,
    private val nextCursor: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of(),
        @JsonProperty("has_more") @ExcludeMissing hasMore: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("next_cursor")
        @ExcludeMissing
        nextCursor: JsonField<String> = JsonMissing.of(),
    ) : this(data, hasMore, nextCursor, mutableMapOf())

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): List<Data> = data.getRequired("data")

    /**
     * Whether more items exist
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hasMore(): Boolean = hasMore.getRequired("has_more")

    /**
     * Cursor for next page
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nextCursor(): Optional<String> = nextCursor.getOptional("next_cursor")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

    /**
     * Returns the raw JSON value of [hasMore].
     *
     * Unlike [hasMore], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("has_more") @ExcludeMissing fun _hasMore(): JsonField<Boolean> = hasMore

    /**
     * Returns the raw JSON value of [nextCursor].
     *
     * Unlike [nextCursor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("next_cursor") @ExcludeMissing fun _nextCursor(): JsonField<String> = nextCursor

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
         * Returns a mutable builder for constructing an instance of [ReviewListResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * .hasMore()
         * .nextCursor()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReviewListResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var hasMore: JsonField<Boolean>? = null
        private var nextCursor: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(reviewListResponse: ReviewListResponse) = apply {
            data = reviewListResponse.data.map { it.toMutableList() }
            hasMore = reviewListResponse.hasMore
            nextCursor = reviewListResponse.nextCursor
            additionalProperties = reviewListResponse.additionalProperties.toMutableMap()
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

        /** Whether more items exist */
        fun hasMore(hasMore: Boolean) = hasMore(JsonField.of(hasMore))

        /**
         * Sets [Builder.hasMore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasMore] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hasMore(hasMore: JsonField<Boolean>) = apply { this.hasMore = hasMore }

        /** Cursor for next page */
        fun nextCursor(nextCursor: String?) = nextCursor(JsonField.ofNullable(nextCursor))

        /** Alias for calling [Builder.nextCursor] with `nextCursor.orElse(null)`. */
        fun nextCursor(nextCursor: Optional<String>) = nextCursor(nextCursor.getOrNull())

        /**
         * Sets [Builder.nextCursor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextCursor] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun nextCursor(nextCursor: JsonField<String>) = apply { this.nextCursor = nextCursor }

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
         * Returns an immutable instance of [ReviewListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .data()
         * .hasMore()
         * .nextCursor()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ReviewListResponse =
            ReviewListResponse(
                checkRequired("data", data).map { it.toImmutable() },
                checkRequired("hasMore", hasMore),
                checkRequired("nextCursor", nextCursor),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ReviewListResponse = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
        hasMore()
        nextCursor()
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
            (if (hasMore.asKnown().isPresent) 1 else 0) +
            (if (nextCursor.asKnown().isPresent) 1 else 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val authorName: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val platform: JsonField<Platform>,
        private val rating: JsonField<Double>,
        private val reply: JsonField<String>,
        private val text: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("author_name")
            @ExcludeMissing
            authorName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("platform")
            @ExcludeMissing
            platform: JsonField<Platform> = JsonMissing.of(),
            @JsonProperty("rating") @ExcludeMissing rating: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("reply") @ExcludeMissing reply: JsonField<String> = JsonMissing.of(),
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
        ) : this(id, authorName, createdAt, platform, rating, reply, text, mutableMapOf())

        /**
         * Review ID
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Review author name
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun authorName(): String = authorName.getRequired("author_name")

        /**
         * Review timestamp
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun platform(): Platform = platform.getRequired("platform")

        /**
         * Rating (1-5)
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun rating(): Double = rating.getRequired("rating")

        /**
         * Business reply text
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun reply(): Optional<String> = reply.getOptional("reply")

        /**
         * Review text
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun text(): Optional<String> = text.getOptional("text")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [authorName].
         *
         * Unlike [authorName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("author_name")
        @ExcludeMissing
        fun _authorName(): JsonField<String> = authorName

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [platform].
         *
         * Unlike [platform], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("platform") @ExcludeMissing fun _platform(): JsonField<Platform> = platform

        /**
         * Returns the raw JSON value of [rating].
         *
         * Unlike [rating], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rating") @ExcludeMissing fun _rating(): JsonField<Double> = rating

        /**
         * Returns the raw JSON value of [reply].
         *
         * Unlike [reply], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reply") @ExcludeMissing fun _reply(): JsonField<String> = reply

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

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
             * .authorName()
             * .createdAt()
             * .platform()
             * .rating()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var authorName: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var platform: JsonField<Platform>? = null
            private var rating: JsonField<Double>? = null
            private var reply: JsonField<String> = JsonMissing.of()
            private var text: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                authorName = data.authorName
                createdAt = data.createdAt
                platform = data.platform
                rating = data.rating
                reply = data.reply
                text = data.text
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Review ID */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Review author name */
            fun authorName(authorName: String) = authorName(JsonField.of(authorName))

            /**
             * Sets [Builder.authorName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.authorName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun authorName(authorName: JsonField<String>) = apply { this.authorName = authorName }

            /** Review timestamp */
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

            fun platform(platform: Platform) = platform(JsonField.of(platform))

            /**
             * Sets [Builder.platform] to an arbitrary JSON value.
             *
             * You should usually call [Builder.platform] with a well-typed [Platform] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun platform(platform: JsonField<Platform>) = apply { this.platform = platform }

            /** Rating (1-5) */
            fun rating(rating: Double) = rating(JsonField.of(rating))

            /**
             * Sets [Builder.rating] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rating] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rating(rating: JsonField<Double>) = apply { this.rating = rating }

            /** Business reply text */
            fun reply(reply: String?) = reply(JsonField.ofNullable(reply))

            /** Alias for calling [Builder.reply] with `reply.orElse(null)`. */
            fun reply(reply: Optional<String>) = reply(reply.getOrNull())

            /**
             * Sets [Builder.reply] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reply] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reply(reply: JsonField<String>) = apply { this.reply = reply }

            /** Review text */
            fun text(text: String?) = text(JsonField.ofNullable(text))

            /** Alias for calling [Builder.text] with `text.orElse(null)`. */
            fun text(text: Optional<String>) = text(text.getOrNull())

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

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
             * .authorName()
             * .createdAt()
             * .platform()
             * .rating()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("id", id),
                    checkRequired("authorName", authorName),
                    checkRequired("createdAt", createdAt),
                    checkRequired("platform", platform),
                    checkRequired("rating", rating),
                    reply,
                    text,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            authorName()
            createdAt()
            platform().validate()
            rating()
            reply()
            text()
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
                (if (authorName.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (platform.asKnown().getOrNull()?.validity() ?: 0) +
                (if (rating.asKnown().isPresent) 1 else 0) +
                (if (reply.asKnown().isPresent) 1 else 0) +
                (if (text.asKnown().isPresent) 1 else 0)

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

                @JvmField val BEEHIIV = of("beehiiv")

                @JvmField val CONVERTKIT = of("convertkit")

                @JvmField val MAILCHIMP = of("mailchimp")

                @JvmField val LISTMONK = of("listmonk")

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
                BEEHIIV,
                CONVERTKIT,
                MAILCHIMP,
                LISTMONK,
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
                BEEHIIV,
                CONVERTKIT,
                MAILCHIMP,
                LISTMONK,
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
                    BEEHIIV -> Value.BEEHIIV
                    CONVERTKIT -> Value.CONVERTKIT
                    MAILCHIMP -> Value.MAILCHIMP
                    LISTMONK -> Value.LISTMONK
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
                    BEEHIIV -> Known.BEEHIIV
                    CONVERTKIT -> Known.CONVERTKIT
                    MAILCHIMP -> Known.MAILCHIMP
                    LISTMONK -> Known.LISTMONK
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
                id == other.id &&
                authorName == other.authorName &&
                createdAt == other.createdAt &&
                platform == other.platform &&
                rating == other.rating &&
                reply == other.reply &&
                text == other.text &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                authorName,
                createdAt,
                platform,
                rating,
                reply,
                text,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, authorName=$authorName, createdAt=$createdAt, platform=$platform, rating=$rating, reply=$reply, text=$text, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReviewListResponse &&
            data == other.data &&
            hasMore == other.hasMore &&
            nextCursor == other.nextCursor &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(data, hasMore, nextCursor, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ReviewListResponse{data=$data, hasMore=$hasMore, nextCursor=$nextCursor, additionalProperties=$additionalProperties}"
}
