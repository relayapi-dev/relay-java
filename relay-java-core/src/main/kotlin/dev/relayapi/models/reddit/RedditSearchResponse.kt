// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.reddit

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

class RedditSearchResponse
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
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hasMore(): Boolean = hasMore.getRequired("has_more")

    /**
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
         * Returns a mutable builder for constructing an instance of [RedditSearchResponse].
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

    /** A builder for [RedditSearchResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var hasMore: JsonField<Boolean>? = null
        private var nextCursor: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(redditSearchResponse: RedditSearchResponse) = apply {
            data = redditSearchResponse.data.map { it.toMutableList() }
            hasMore = redditSearchResponse.hasMore
            nextCursor = redditSearchResponse.nextCursor
            additionalProperties = redditSearchResponse.additionalProperties.toMutableMap()
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

        fun hasMore(hasMore: Boolean) = hasMore(JsonField.of(hasMore))

        /**
         * Sets [Builder.hasMore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasMore] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hasMore(hasMore: JsonField<Boolean>) = apply { this.hasMore = hasMore }

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
         * Returns an immutable instance of [RedditSearchResponse].
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
        fun build(): RedditSearchResponse =
            RedditSearchResponse(
                checkRequired("data", data).map { it.toImmutable() },
                checkRequired("hasMore", hasMore),
                checkRequired("nextCursor", nextCursor),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RedditSearchResponse = apply {
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
        private val author: JsonField<String>,
        private val createdUtc: JsonField<Double>,
        private val isSelf: JsonField<Boolean>,
        private val nsfw: JsonField<Boolean>,
        private val numComments: JsonField<Double>,
        private val score: JsonField<Double>,
        private val subreddit: JsonField<String>,
        private val title: JsonField<String>,
        private val url: JsonField<String>,
        private val selftext: JsonField<String>,
        private val thumbnail: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("author") @ExcludeMissing author: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_utc")
            @ExcludeMissing
            createdUtc: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("is_self") @ExcludeMissing isSelf: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("nsfw") @ExcludeMissing nsfw: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("num_comments")
            @ExcludeMissing
            numComments: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("score") @ExcludeMissing score: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("subreddit")
            @ExcludeMissing
            subreddit: JsonField<String> = JsonMissing.of(),
            @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
            @JsonProperty("selftext")
            @ExcludeMissing
            selftext: JsonField<String> = JsonMissing.of(),
            @JsonProperty("thumbnail")
            @ExcludeMissing
            thumbnail: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            author,
            createdUtc,
            isSelf,
            nsfw,
            numComments,
            score,
            subreddit,
            title,
            url,
            selftext,
            thumbnail,
            mutableMapOf(),
        )

        /**
         * Reddit post ID
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Post author
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun author(): String = author.getRequired("author")

        /**
         * Created timestamp (Unix)
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdUtc(): Double = createdUtc.getRequired("created_utc")

        /**
         * Whether it's a self post
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun isSelf(): Boolean = isSelf.getRequired("is_self")

        /**
         * Whether NSFW
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun nsfw(): Boolean = nsfw.getRequired("nsfw")

        /**
         * Comment count
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun numComments(): Double = numComments.getRequired("num_comments")

        /**
         * Post score
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun score(): Double = score.getRequired("score")

        /**
         * Subreddit name
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun subreddit(): String = subreddit.getRequired("subreddit")

        /**
         * Post title
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun title(): String = title.getRequired("title")

        /**
         * Post URL
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun url(): String = url.getRequired("url")

        /**
         * Self text
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun selftext(): Optional<String> = selftext.getOptional("selftext")

        /**
         * Thumbnail URL
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun thumbnail(): Optional<String> = thumbnail.getOptional("thumbnail")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [author].
         *
         * Unlike [author], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("author") @ExcludeMissing fun _author(): JsonField<String> = author

        /**
         * Returns the raw JSON value of [createdUtc].
         *
         * Unlike [createdUtc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_utc")
        @ExcludeMissing
        fun _createdUtc(): JsonField<Double> = createdUtc

        /**
         * Returns the raw JSON value of [isSelf].
         *
         * Unlike [isSelf], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("is_self") @ExcludeMissing fun _isSelf(): JsonField<Boolean> = isSelf

        /**
         * Returns the raw JSON value of [nsfw].
         *
         * Unlike [nsfw], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("nsfw") @ExcludeMissing fun _nsfw(): JsonField<Boolean> = nsfw

        /**
         * Returns the raw JSON value of [numComments].
         *
         * Unlike [numComments], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("num_comments")
        @ExcludeMissing
        fun _numComments(): JsonField<Double> = numComments

        /**
         * Returns the raw JSON value of [score].
         *
         * Unlike [score], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("score") @ExcludeMissing fun _score(): JsonField<Double> = score

        /**
         * Returns the raw JSON value of [subreddit].
         *
         * Unlike [subreddit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("subreddit") @ExcludeMissing fun _subreddit(): JsonField<String> = subreddit

        /**
         * Returns the raw JSON value of [title].
         *
         * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

        /**
         * Returns the raw JSON value of [selftext].
         *
         * Unlike [selftext], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("selftext") @ExcludeMissing fun _selftext(): JsonField<String> = selftext

        /**
         * Returns the raw JSON value of [thumbnail].
         *
         * Unlike [thumbnail], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("thumbnail") @ExcludeMissing fun _thumbnail(): JsonField<String> = thumbnail

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
             * .author()
             * .createdUtc()
             * .isSelf()
             * .nsfw()
             * .numComments()
             * .score()
             * .subreddit()
             * .title()
             * .url()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var author: JsonField<String>? = null
            private var createdUtc: JsonField<Double>? = null
            private var isSelf: JsonField<Boolean>? = null
            private var nsfw: JsonField<Boolean>? = null
            private var numComments: JsonField<Double>? = null
            private var score: JsonField<Double>? = null
            private var subreddit: JsonField<String>? = null
            private var title: JsonField<String>? = null
            private var url: JsonField<String>? = null
            private var selftext: JsonField<String> = JsonMissing.of()
            private var thumbnail: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                author = data.author
                createdUtc = data.createdUtc
                isSelf = data.isSelf
                nsfw = data.nsfw
                numComments = data.numComments
                score = data.score
                subreddit = data.subreddit
                title = data.title
                url = data.url
                selftext = data.selftext
                thumbnail = data.thumbnail
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Reddit post ID */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Post author */
            fun author(author: String) = author(JsonField.of(author))

            /**
             * Sets [Builder.author] to an arbitrary JSON value.
             *
             * You should usually call [Builder.author] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun author(author: JsonField<String>) = apply { this.author = author }

            /** Created timestamp (Unix) */
            fun createdUtc(createdUtc: Double) = createdUtc(JsonField.of(createdUtc))

            /**
             * Sets [Builder.createdUtc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdUtc] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdUtc(createdUtc: JsonField<Double>) = apply { this.createdUtc = createdUtc }

            /** Whether it's a self post */
            fun isSelf(isSelf: Boolean) = isSelf(JsonField.of(isSelf))

            /**
             * Sets [Builder.isSelf] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isSelf] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isSelf(isSelf: JsonField<Boolean>) = apply { this.isSelf = isSelf }

            /** Whether NSFW */
            fun nsfw(nsfw: Boolean) = nsfw(JsonField.of(nsfw))

            /**
             * Sets [Builder.nsfw] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nsfw] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun nsfw(nsfw: JsonField<Boolean>) = apply { this.nsfw = nsfw }

            /** Comment count */
            fun numComments(numComments: Double) = numComments(JsonField.of(numComments))

            /**
             * Sets [Builder.numComments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numComments] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numComments(numComments: JsonField<Double>) = apply {
                this.numComments = numComments
            }

            /** Post score */
            fun score(score: Double) = score(JsonField.of(score))

            /**
             * Sets [Builder.score] to an arbitrary JSON value.
             *
             * You should usually call [Builder.score] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun score(score: JsonField<Double>) = apply { this.score = score }

            /** Subreddit name */
            fun subreddit(subreddit: String) = subreddit(JsonField.of(subreddit))

            /**
             * Sets [Builder.subreddit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subreddit] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subreddit(subreddit: JsonField<String>) = apply { this.subreddit = subreddit }

            /** Post title */
            fun title(title: String) = title(JsonField.of(title))

            /**
             * Sets [Builder.title] to an arbitrary JSON value.
             *
             * You should usually call [Builder.title] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun title(title: JsonField<String>) = apply { this.title = title }

            /** Post URL */
            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

            /** Self text */
            fun selftext(selftext: String?) = selftext(JsonField.ofNullable(selftext))

            /** Alias for calling [Builder.selftext] with `selftext.orElse(null)`. */
            fun selftext(selftext: Optional<String>) = selftext(selftext.getOrNull())

            /**
             * Sets [Builder.selftext] to an arbitrary JSON value.
             *
             * You should usually call [Builder.selftext] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun selftext(selftext: JsonField<String>) = apply { this.selftext = selftext }

            /** Thumbnail URL */
            fun thumbnail(thumbnail: String?) = thumbnail(JsonField.ofNullable(thumbnail))

            /** Alias for calling [Builder.thumbnail] with `thumbnail.orElse(null)`. */
            fun thumbnail(thumbnail: Optional<String>) = thumbnail(thumbnail.getOrNull())

            /**
             * Sets [Builder.thumbnail] to an arbitrary JSON value.
             *
             * You should usually call [Builder.thumbnail] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun thumbnail(thumbnail: JsonField<String>) = apply { this.thumbnail = thumbnail }

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
             * .author()
             * .createdUtc()
             * .isSelf()
             * .nsfw()
             * .numComments()
             * .score()
             * .subreddit()
             * .title()
             * .url()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("id", id),
                    checkRequired("author", author),
                    checkRequired("createdUtc", createdUtc),
                    checkRequired("isSelf", isSelf),
                    checkRequired("nsfw", nsfw),
                    checkRequired("numComments", numComments),
                    checkRequired("score", score),
                    checkRequired("subreddit", subreddit),
                    checkRequired("title", title),
                    checkRequired("url", url),
                    selftext,
                    thumbnail,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            author()
            createdUtc()
            isSelf()
            nsfw()
            numComments()
            score()
            subreddit()
            title()
            url()
            selftext()
            thumbnail()
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
                (if (author.asKnown().isPresent) 1 else 0) +
                (if (createdUtc.asKnown().isPresent) 1 else 0) +
                (if (isSelf.asKnown().isPresent) 1 else 0) +
                (if (nsfw.asKnown().isPresent) 1 else 0) +
                (if (numComments.asKnown().isPresent) 1 else 0) +
                (if (score.asKnown().isPresent) 1 else 0) +
                (if (subreddit.asKnown().isPresent) 1 else 0) +
                (if (title.asKnown().isPresent) 1 else 0) +
                (if (url.asKnown().isPresent) 1 else 0) +
                (if (selftext.asKnown().isPresent) 1 else 0) +
                (if (thumbnail.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                author == other.author &&
                createdUtc == other.createdUtc &&
                isSelf == other.isSelf &&
                nsfw == other.nsfw &&
                numComments == other.numComments &&
                score == other.score &&
                subreddit == other.subreddit &&
                title == other.title &&
                url == other.url &&
                selftext == other.selftext &&
                thumbnail == other.thumbnail &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                author,
                createdUtc,
                isSelf,
                nsfw,
                numComments,
                score,
                subreddit,
                title,
                url,
                selftext,
                thumbnail,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, author=$author, createdUtc=$createdUtc, isSelf=$isSelf, nsfw=$nsfw, numComments=$numComments, score=$score, subreddit=$subreddit, title=$title, url=$url, selftext=$selftext, thumbnail=$thumbnail, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RedditSearchResponse &&
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
        "RedditSearchResponse{data=$data, hasMore=$hasMore, nextCursor=$nextCursor, additionalProperties=$additionalProperties}"
}
