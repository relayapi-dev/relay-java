// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.posts

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

class PostListResponse
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
         * Returns a mutable builder for constructing an instance of [PostListResponse].
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

    /** A builder for [PostListResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var hasMore: JsonField<Boolean>? = null
        private var nextCursor: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(postListResponse: PostListResponse) = apply {
            data = postListResponse.data.map { it.toMutableList() }
            hasMore = postListResponse.hasMore
            nextCursor = postListResponse.nextCursor
            additionalProperties = postListResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [PostListResponse].
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
        fun build(): PostListResponse =
            PostListResponse(
                checkRequired("data", data).map { it.toImmutable() },
                checkRequired("hasMore", hasMore),
                checkRequired("nextCursor", nextCursor),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PostListResponse = apply {
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
        private val content: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val media: JsonField<List<Media>>,
        private val publishedAt: JsonField<String>,
        private val recycledFromId: JsonField<String>,
        private val recycling: JsonField<Recycling>,
        private val scheduledAt: JsonField<String>,
        private val status: JsonField<Status>,
        private val targets: JsonField<Targets>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val metrics: JsonField<Metrics>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("content") @ExcludeMissing content: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("media") @ExcludeMissing media: JsonField<List<Media>> = JsonMissing.of(),
            @JsonProperty("published_at")
            @ExcludeMissing
            publishedAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("recycled_from_id")
            @ExcludeMissing
            recycledFromId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("recycling")
            @ExcludeMissing
            recycling: JsonField<Recycling> = JsonMissing.of(),
            @JsonProperty("scheduled_at")
            @ExcludeMissing
            scheduledAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("targets") @ExcludeMissing targets: JsonField<Targets> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("metrics") @ExcludeMissing metrics: JsonField<Metrics> = JsonMissing.of(),
        ) : this(
            id,
            content,
            createdAt,
            media,
            publishedAt,
            recycledFromId,
            recycling,
            scheduledAt,
            status,
            targets,
            updatedAt,
            metrics,
            mutableMapOf(),
        )

        /**
         * Post ID
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun content(): Optional<String> = content.getOptional("content")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun media(): Optional<List<Media>> = media.getOptional("media")

        /**
         * When the post was published
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun publishedAt(): Optional<String> = publishedAt.getOptional("published_at")

        /**
         * Source post ID if this is a recycled copy
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recycledFromId(): Optional<String> = recycledFromId.getOptional("recycled_from_id")

        /**
         * Recycling configuration, if any
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recycling(): Optional<Recycling> = recycling.getOptional("recycling")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun scheduledAt(): Optional<String> = scheduledAt.getOptional("scheduled_at")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * Per-target results
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun targets(): Targets = targets.getRequired("targets")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

        /**
         * Engagement metrics (reactions, comments, views, etc.)
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metrics(): Optional<Metrics> = metrics.getOptional("metrics")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [content].
         *
         * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [media].
         *
         * Unlike [media], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("media") @ExcludeMissing fun _media(): JsonField<List<Media>> = media

        /**
         * Returns the raw JSON value of [publishedAt].
         *
         * Unlike [publishedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("published_at")
        @ExcludeMissing
        fun _publishedAt(): JsonField<String> = publishedAt

        /**
         * Returns the raw JSON value of [recycledFromId].
         *
         * Unlike [recycledFromId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("recycled_from_id")
        @ExcludeMissing
        fun _recycledFromId(): JsonField<String> = recycledFromId

        /**
         * Returns the raw JSON value of [recycling].
         *
         * Unlike [recycling], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("recycling")
        @ExcludeMissing
        fun _recycling(): JsonField<Recycling> = recycling

        /**
         * Returns the raw JSON value of [scheduledAt].
         *
         * Unlike [scheduledAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("scheduled_at")
        @ExcludeMissing
        fun _scheduledAt(): JsonField<String> = scheduledAt

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [targets].
         *
         * Unlike [targets], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("targets") @ExcludeMissing fun _targets(): JsonField<Targets> = targets

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        /**
         * Returns the raw JSON value of [metrics].
         *
         * Unlike [metrics], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metrics") @ExcludeMissing fun _metrics(): JsonField<Metrics> = metrics

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
             * .content()
             * .createdAt()
             * .media()
             * .publishedAt()
             * .recycledFromId()
             * .recycling()
             * .scheduledAt()
             * .status()
             * .targets()
             * .updatedAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var content: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var media: JsonField<MutableList<Media>>? = null
            private var publishedAt: JsonField<String>? = null
            private var recycledFromId: JsonField<String>? = null
            private var recycling: JsonField<Recycling>? = null
            private var scheduledAt: JsonField<String>? = null
            private var status: JsonField<Status>? = null
            private var targets: JsonField<Targets>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var metrics: JsonField<Metrics> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                content = data.content
                createdAt = data.createdAt
                media = data.media.map { it.toMutableList() }
                publishedAt = data.publishedAt
                recycledFromId = data.recycledFromId
                recycling = data.recycling
                scheduledAt = data.scheduledAt
                status = data.status
                targets = data.targets
                updatedAt = data.updatedAt
                metrics = data.metrics
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Post ID */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun content(content: String?) = content(JsonField.ofNullable(content))

            /** Alias for calling [Builder.content] with `content.orElse(null)`. */
            fun content(content: Optional<String>) = content(content.getOrNull())

            /**
             * Sets [Builder.content] to an arbitrary JSON value.
             *
             * You should usually call [Builder.content] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun content(content: JsonField<String>) = apply { this.content = content }

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

            fun media(media: List<Media>?) = media(JsonField.ofNullable(media))

            /** Alias for calling [Builder.media] with `media.orElse(null)`. */
            fun media(media: Optional<List<Media>>) = media(media.getOrNull())

            /**
             * Sets [Builder.media] to an arbitrary JSON value.
             *
             * You should usually call [Builder.media] with a well-typed `List<Media>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun media(media: JsonField<List<Media>>) = apply {
                this.media = media.map { it.toMutableList() }
            }

            /**
             * Adds a single [Media] to [Builder.media].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMedia(media: Media) = apply {
                this.media =
                    (this.media ?: JsonField.of(mutableListOf())).also {
                        checkKnown("media", it).add(media)
                    }
            }

            /** When the post was published */
            fun publishedAt(publishedAt: String?) = publishedAt(JsonField.ofNullable(publishedAt))

            /** Alias for calling [Builder.publishedAt] with `publishedAt.orElse(null)`. */
            fun publishedAt(publishedAt: Optional<String>) = publishedAt(publishedAt.getOrNull())

            /**
             * Sets [Builder.publishedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.publishedAt] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun publishedAt(publishedAt: JsonField<String>) = apply {
                this.publishedAt = publishedAt
            }

            /** Source post ID if this is a recycled copy */
            fun recycledFromId(recycledFromId: String?) =
                recycledFromId(JsonField.ofNullable(recycledFromId))

            /** Alias for calling [Builder.recycledFromId] with `recycledFromId.orElse(null)`. */
            fun recycledFromId(recycledFromId: Optional<String>) =
                recycledFromId(recycledFromId.getOrNull())

            /**
             * Sets [Builder.recycledFromId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recycledFromId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recycledFromId(recycledFromId: JsonField<String>) = apply {
                this.recycledFromId = recycledFromId
            }

            /** Recycling configuration, if any */
            fun recycling(recycling: Recycling?) = recycling(JsonField.ofNullable(recycling))

            /** Alias for calling [Builder.recycling] with `recycling.orElse(null)`. */
            fun recycling(recycling: Optional<Recycling>) = recycling(recycling.getOrNull())

            /**
             * Sets [Builder.recycling] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recycling] with a well-typed [Recycling] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recycling(recycling: JsonField<Recycling>) = apply { this.recycling = recycling }

            fun scheduledAt(scheduledAt: String?) = scheduledAt(JsonField.ofNullable(scheduledAt))

            /** Alias for calling [Builder.scheduledAt] with `scheduledAt.orElse(null)`. */
            fun scheduledAt(scheduledAt: Optional<String>) = scheduledAt(scheduledAt.getOrNull())

            /**
             * Sets [Builder.scheduledAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scheduledAt] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun scheduledAt(scheduledAt: JsonField<String>) = apply {
                this.scheduledAt = scheduledAt
            }

            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** Per-target results */
            fun targets(targets: Targets) = targets(JsonField.of(targets))

            /**
             * Sets [Builder.targets] to an arbitrary JSON value.
             *
             * You should usually call [Builder.targets] with a well-typed [Targets] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun targets(targets: JsonField<Targets>) = apply { this.targets = targets }

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            /** Engagement metrics (reactions, comments, views, etc.) */
            fun metrics(metrics: Metrics) = metrics(JsonField.of(metrics))

            /**
             * Sets [Builder.metrics] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metrics] with a well-typed [Metrics] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metrics(metrics: JsonField<Metrics>) = apply { this.metrics = metrics }

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
             * .content()
             * .createdAt()
             * .media()
             * .publishedAt()
             * .recycledFromId()
             * .recycling()
             * .scheduledAt()
             * .status()
             * .targets()
             * .updatedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("id", id),
                    checkRequired("content", content),
                    checkRequired("createdAt", createdAt),
                    checkRequired("media", media).map { it.toImmutable() },
                    checkRequired("publishedAt", publishedAt),
                    checkRequired("recycledFromId", recycledFromId),
                    checkRequired("recycling", recycling),
                    checkRequired("scheduledAt", scheduledAt),
                    checkRequired("status", status),
                    checkRequired("targets", targets),
                    checkRequired("updatedAt", updatedAt),
                    metrics,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            content()
            createdAt()
            media().ifPresent { it.forEach { it.validate() } }
            publishedAt()
            recycledFromId()
            recycling().ifPresent { it.validate() }
            scheduledAt()
            status().validate()
            targets().validate()
            updatedAt()
            metrics().ifPresent { it.validate() }
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
                (if (content.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (media.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (publishedAt.asKnown().isPresent) 1 else 0) +
                (if (recycledFromId.asKnown().isPresent) 1 else 0) +
                (recycling.asKnown().getOrNull()?.validity() ?: 0) +
                (if (scheduledAt.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (targets.asKnown().getOrNull()?.validity() ?: 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (metrics.asKnown().getOrNull()?.validity() ?: 0)

        class Media
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val url: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(url, type, mutableMapOf())

            /**
             * Public URL of the media file
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun url(): String = url.getRequired("url")

            /**
             * Media type. Inferred from URL extension if omitted.
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun type(): Optional<Type> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [url].
             *
             * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                 * Returns a mutable builder for constructing an instance of [Media].
                 *
                 * The following fields are required:
                 * ```java
                 * .url()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Media]. */
            class Builder internal constructor() {

                private var url: JsonField<String>? = null
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(media: Media) = apply {
                    url = media.url
                    type = media.type
                    additionalProperties = media.additionalProperties.toMutableMap()
                }

                /** Public URL of the media file */
                fun url(url: String) = url(JsonField.of(url))

                /**
                 * Sets [Builder.url] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.url] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun url(url: JsonField<String>) = apply { this.url = url }

                /** Media type. Inferred from URL extension if omitted. */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

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
                 * Returns an immutable instance of [Media].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .url()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Media =
                    Media(checkRequired("url", url), type, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Media = apply {
                if (validated) {
                    return@apply
                }

                url()
                type().ifPresent { it.validate() }
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
                (if (url.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            /** Media type. Inferred from URL extension if omitted. */
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val IMAGE = of("image")

                    @JvmField val VIDEO = of("video")

                    @JvmField val GIF = of("gif")

                    @JvmField val DOCUMENT = of("document")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    IMAGE,
                    VIDEO,
                    GIF,
                    DOCUMENT,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    IMAGE,
                    VIDEO,
                    GIF,
                    DOCUMENT,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        IMAGE -> Value.IMAGE
                        VIDEO -> Value.VIDEO
                        GIF -> Value.GIF
                        DOCUMENT -> Value.DOCUMENT
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
                        IMAGE -> Known.IMAGE
                        VIDEO -> Known.VIDEO
                        GIF -> Known.GIF
                        DOCUMENT -> Known.DOCUMENT
                        else -> throw RelayInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws RelayInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        RelayInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Type = apply {
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

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Media &&
                    url == other.url &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(url, type, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Media{url=$url, type=$type, additionalProperties=$additionalProperties}"
        }

        /** Recycling configuration, if any */
        class Recycling
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val contentVariationIndex: JsonField<Double>,
            private val contentVariations: JsonField<List<String>>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val enabled: JsonField<Boolean>,
            private val expireCount: JsonField<Double>,
            private val expireDate: JsonField<OffsetDateTime>,
            private val gap: JsonField<Double>,
            private val gapFreq: JsonField<GapFreq>,
            private val lastRecycledAt: JsonField<OffsetDateTime>,
            private val nextRecycleAt: JsonField<OffsetDateTime>,
            private val recycleCount: JsonField<Double>,
            private val startDate: JsonField<OffsetDateTime>,
            private val updatedAt: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("content_variation_index")
                @ExcludeMissing
                contentVariationIndex: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("content_variations")
                @ExcludeMissing
                contentVariations: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("created_at")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("enabled")
                @ExcludeMissing
                enabled: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("expire_count")
                @ExcludeMissing
                expireCount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("expire_date")
                @ExcludeMissing
                expireDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("gap") @ExcludeMissing gap: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("gap_freq")
                @ExcludeMissing
                gapFreq: JsonField<GapFreq> = JsonMissing.of(),
                @JsonProperty("last_recycled_at")
                @ExcludeMissing
                lastRecycledAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("next_recycle_at")
                @ExcludeMissing
                nextRecycleAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("recycle_count")
                @ExcludeMissing
                recycleCount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("start_date")
                @ExcludeMissing
                startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("updated_at")
                @ExcludeMissing
                updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(
                id,
                contentVariationIndex,
                contentVariations,
                createdAt,
                enabled,
                expireCount,
                expireDate,
                gap,
                gapFreq,
                lastRecycledAt,
                nextRecycleAt,
                recycleCount,
                startDate,
                updatedAt,
                mutableMapOf(),
            )

            /**
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun contentVariationIndex(): Double =
                contentVariationIndex.getRequired("content_variation_index")

            /**
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun contentVariations(): List<String> =
                contentVariations.getRequired("content_variations")

            /**
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

            /**
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun enabled(): Boolean = enabled.getRequired("enabled")

            /**
             * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun expireCount(): Optional<Double> = expireCount.getOptional("expire_count")

            /**
             * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun expireDate(): Optional<OffsetDateTime> = expireDate.getOptional("expire_date")

            /**
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun gap(): Double = gap.getRequired("gap")

            /**
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun gapFreq(): GapFreq = gapFreq.getRequired("gap_freq")

            /**
             * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun lastRecycledAt(): Optional<OffsetDateTime> =
                lastRecycledAt.getOptional("last_recycled_at")

            /**
             * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun nextRecycleAt(): Optional<OffsetDateTime> =
                nextRecycleAt.getOptional("next_recycle_at")

            /**
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun recycleCount(): Double = recycleCount.getRequired("recycle_count")

            /**
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

            /**
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [contentVariationIndex].
             *
             * Unlike [contentVariationIndex], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("content_variation_index")
            @ExcludeMissing
            fun _contentVariationIndex(): JsonField<Double> = contentVariationIndex

            /**
             * Returns the raw JSON value of [contentVariations].
             *
             * Unlike [contentVariations], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("content_variations")
            @ExcludeMissing
            fun _contentVariations(): JsonField<List<String>> = contentVariations

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [enabled].
             *
             * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

            /**
             * Returns the raw JSON value of [expireCount].
             *
             * Unlike [expireCount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("expire_count")
            @ExcludeMissing
            fun _expireCount(): JsonField<Double> = expireCount

            /**
             * Returns the raw JSON value of [expireDate].
             *
             * Unlike [expireDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("expire_date")
            @ExcludeMissing
            fun _expireDate(): JsonField<OffsetDateTime> = expireDate

            /**
             * Returns the raw JSON value of [gap].
             *
             * Unlike [gap], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("gap") @ExcludeMissing fun _gap(): JsonField<Double> = gap

            /**
             * Returns the raw JSON value of [gapFreq].
             *
             * Unlike [gapFreq], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("gap_freq") @ExcludeMissing fun _gapFreq(): JsonField<GapFreq> = gapFreq

            /**
             * Returns the raw JSON value of [lastRecycledAt].
             *
             * Unlike [lastRecycledAt], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("last_recycled_at")
            @ExcludeMissing
            fun _lastRecycledAt(): JsonField<OffsetDateTime> = lastRecycledAt

            /**
             * Returns the raw JSON value of [nextRecycleAt].
             *
             * Unlike [nextRecycleAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("next_recycle_at")
            @ExcludeMissing
            fun _nextRecycleAt(): JsonField<OffsetDateTime> = nextRecycleAt

            /**
             * Returns the raw JSON value of [recycleCount].
             *
             * Unlike [recycleCount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("recycle_count")
            @ExcludeMissing
            fun _recycleCount(): JsonField<Double> = recycleCount

            /**
             * Returns the raw JSON value of [startDate].
             *
             * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("start_date")
            @ExcludeMissing
            fun _startDate(): JsonField<OffsetDateTime> = startDate

            /**
             * Returns the raw JSON value of [updatedAt].
             *
             * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("updated_at")
            @ExcludeMissing
            fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
                 * Returns a mutable builder for constructing an instance of [Recycling].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .contentVariationIndex()
                 * .contentVariations()
                 * .createdAt()
                 * .enabled()
                 * .expireCount()
                 * .expireDate()
                 * .gap()
                 * .gapFreq()
                 * .lastRecycledAt()
                 * .nextRecycleAt()
                 * .recycleCount()
                 * .startDate()
                 * .updatedAt()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Recycling]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var contentVariationIndex: JsonField<Double>? = null
                private var contentVariations: JsonField<MutableList<String>>? = null
                private var createdAt: JsonField<OffsetDateTime>? = null
                private var enabled: JsonField<Boolean>? = null
                private var expireCount: JsonField<Double>? = null
                private var expireDate: JsonField<OffsetDateTime>? = null
                private var gap: JsonField<Double>? = null
                private var gapFreq: JsonField<GapFreq>? = null
                private var lastRecycledAt: JsonField<OffsetDateTime>? = null
                private var nextRecycleAt: JsonField<OffsetDateTime>? = null
                private var recycleCount: JsonField<Double>? = null
                private var startDate: JsonField<OffsetDateTime>? = null
                private var updatedAt: JsonField<OffsetDateTime>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(recycling: Recycling) = apply {
                    id = recycling.id
                    contentVariationIndex = recycling.contentVariationIndex
                    contentVariations = recycling.contentVariations.map { it.toMutableList() }
                    createdAt = recycling.createdAt
                    enabled = recycling.enabled
                    expireCount = recycling.expireCount
                    expireDate = recycling.expireDate
                    gap = recycling.gap
                    gapFreq = recycling.gapFreq
                    lastRecycledAt = recycling.lastRecycledAt
                    nextRecycleAt = recycling.nextRecycleAt
                    recycleCount = recycling.recycleCount
                    startDate = recycling.startDate
                    updatedAt = recycling.updatedAt
                    additionalProperties = recycling.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun contentVariationIndex(contentVariationIndex: Double) =
                    contentVariationIndex(JsonField.of(contentVariationIndex))

                /**
                 * Sets [Builder.contentVariationIndex] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.contentVariationIndex] with a well-typed
                 * [Double] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun contentVariationIndex(contentVariationIndex: JsonField<Double>) = apply {
                    this.contentVariationIndex = contentVariationIndex
                }

                fun contentVariations(contentVariations: List<String>) =
                    contentVariations(JsonField.of(contentVariations))

                /**
                 * Sets [Builder.contentVariations] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.contentVariations] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun contentVariations(contentVariations: JsonField<List<String>>) = apply {
                    this.contentVariations = contentVariations.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [contentVariations].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addContentVariation(contentVariation: String) = apply {
                    contentVariations =
                        (contentVariations ?: JsonField.of(mutableListOf())).also {
                            checkKnown("contentVariations", it).add(contentVariation)
                        }
                }

                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

                /**
                 * Sets [Builder.enabled] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.enabled] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

                fun expireCount(expireCount: Double?) =
                    expireCount(JsonField.ofNullable(expireCount))

                /**
                 * Alias for [Builder.expireCount].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun expireCount(expireCount: Double) = expireCount(expireCount as Double?)

                /** Alias for calling [Builder.expireCount] with `expireCount.orElse(null)`. */
                fun expireCount(expireCount: Optional<Double>) =
                    expireCount(expireCount.getOrNull())

                /**
                 * Sets [Builder.expireCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.expireCount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun expireCount(expireCount: JsonField<Double>) = apply {
                    this.expireCount = expireCount
                }

                fun expireDate(expireDate: OffsetDateTime?) =
                    expireDate(JsonField.ofNullable(expireDate))

                /** Alias for calling [Builder.expireDate] with `expireDate.orElse(null)`. */
                fun expireDate(expireDate: Optional<OffsetDateTime>) =
                    expireDate(expireDate.getOrNull())

                /**
                 * Sets [Builder.expireDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.expireDate] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun expireDate(expireDate: JsonField<OffsetDateTime>) = apply {
                    this.expireDate = expireDate
                }

                fun gap(gap: Double) = gap(JsonField.of(gap))

                /**
                 * Sets [Builder.gap] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.gap] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun gap(gap: JsonField<Double>) = apply { this.gap = gap }

                fun gapFreq(gapFreq: GapFreq) = gapFreq(JsonField.of(gapFreq))

                /**
                 * Sets [Builder.gapFreq] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.gapFreq] with a well-typed [GapFreq] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun gapFreq(gapFreq: JsonField<GapFreq>) = apply { this.gapFreq = gapFreq }

                fun lastRecycledAt(lastRecycledAt: OffsetDateTime?) =
                    lastRecycledAt(JsonField.ofNullable(lastRecycledAt))

                /**
                 * Alias for calling [Builder.lastRecycledAt] with `lastRecycledAt.orElse(null)`.
                 */
                fun lastRecycledAt(lastRecycledAt: Optional<OffsetDateTime>) =
                    lastRecycledAt(lastRecycledAt.getOrNull())

                /**
                 * Sets [Builder.lastRecycledAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lastRecycledAt] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun lastRecycledAt(lastRecycledAt: JsonField<OffsetDateTime>) = apply {
                    this.lastRecycledAt = lastRecycledAt
                }

                fun nextRecycleAt(nextRecycleAt: OffsetDateTime?) =
                    nextRecycleAt(JsonField.ofNullable(nextRecycleAt))

                /** Alias for calling [Builder.nextRecycleAt] with `nextRecycleAt.orElse(null)`. */
                fun nextRecycleAt(nextRecycleAt: Optional<OffsetDateTime>) =
                    nextRecycleAt(nextRecycleAt.getOrNull())

                /**
                 * Sets [Builder.nextRecycleAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.nextRecycleAt] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun nextRecycleAt(nextRecycleAt: JsonField<OffsetDateTime>) = apply {
                    this.nextRecycleAt = nextRecycleAt
                }

                fun recycleCount(recycleCount: Double) = recycleCount(JsonField.of(recycleCount))

                /**
                 * Sets [Builder.recycleCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recycleCount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun recycleCount(recycleCount: JsonField<Double>) = apply {
                    this.recycleCount = recycleCount
                }

                fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

                /**
                 * Sets [Builder.startDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                    this.startDate = startDate
                }

                fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

                /**
                 * Sets [Builder.updatedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                    this.updatedAt = updatedAt
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
                 * Returns an immutable instance of [Recycling].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .contentVariationIndex()
                 * .contentVariations()
                 * .createdAt()
                 * .enabled()
                 * .expireCount()
                 * .expireDate()
                 * .gap()
                 * .gapFreq()
                 * .lastRecycledAt()
                 * .nextRecycleAt()
                 * .recycleCount()
                 * .startDate()
                 * .updatedAt()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Recycling =
                    Recycling(
                        checkRequired("id", id),
                        checkRequired("contentVariationIndex", contentVariationIndex),
                        checkRequired("contentVariations", contentVariations).map {
                            it.toImmutable()
                        },
                        checkRequired("createdAt", createdAt),
                        checkRequired("enabled", enabled),
                        checkRequired("expireCount", expireCount),
                        checkRequired("expireDate", expireDate),
                        checkRequired("gap", gap),
                        checkRequired("gapFreq", gapFreq),
                        checkRequired("lastRecycledAt", lastRecycledAt),
                        checkRequired("nextRecycleAt", nextRecycleAt),
                        checkRequired("recycleCount", recycleCount),
                        checkRequired("startDate", startDate),
                        checkRequired("updatedAt", updatedAt),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Recycling = apply {
                if (validated) {
                    return@apply
                }

                id()
                contentVariationIndex()
                contentVariations()
                createdAt()
                enabled()
                expireCount()
                expireDate()
                gap()
                gapFreq().validate()
                lastRecycledAt()
                nextRecycleAt()
                recycleCount()
                startDate()
                updatedAt()
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
                    (if (contentVariationIndex.asKnown().isPresent) 1 else 0) +
                    (contentVariations.asKnown().getOrNull()?.size ?: 0) +
                    (if (createdAt.asKnown().isPresent) 1 else 0) +
                    (if (enabled.asKnown().isPresent) 1 else 0) +
                    (if (expireCount.asKnown().isPresent) 1 else 0) +
                    (if (expireDate.asKnown().isPresent) 1 else 0) +
                    (if (gap.asKnown().isPresent) 1 else 0) +
                    (gapFreq.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (lastRecycledAt.asKnown().isPresent) 1 else 0) +
                    (if (nextRecycleAt.asKnown().isPresent) 1 else 0) +
                    (if (recycleCount.asKnown().isPresent) 1 else 0) +
                    (if (startDate.asKnown().isPresent) 1 else 0) +
                    (if (updatedAt.asKnown().isPresent) 1 else 0)

            class GapFreq @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val DAY = of("day")

                    @JvmField val WEEK = of("week")

                    @JvmField val MONTH = of("month")

                    @JvmStatic fun of(value: String) = GapFreq(JsonField.of(value))
                }

                /** An enum containing [GapFreq]'s known values. */
                enum class Known {
                    DAY,
                    WEEK,
                    MONTH,
                }

                /**
                 * An enum containing [GapFreq]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [GapFreq] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    DAY,
                    WEEK,
                    MONTH,
                    /**
                     * An enum member indicating that [GapFreq] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        WEEK -> Value.WEEK
                        MONTH -> Value.MONTH
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
                        DAY -> Known.DAY
                        WEEK -> Known.WEEK
                        MONTH -> Known.MONTH
                        else -> throw RelayInvalidDataException("Unknown GapFreq: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws RelayInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        RelayInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): GapFreq = apply {
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

                    return other is GapFreq && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Recycling &&
                    id == other.id &&
                    contentVariationIndex == other.contentVariationIndex &&
                    contentVariations == other.contentVariations &&
                    createdAt == other.createdAt &&
                    enabled == other.enabled &&
                    expireCount == other.expireCount &&
                    expireDate == other.expireDate &&
                    gap == other.gap &&
                    gapFreq == other.gapFreq &&
                    lastRecycledAt == other.lastRecycledAt &&
                    nextRecycleAt == other.nextRecycleAt &&
                    recycleCount == other.recycleCount &&
                    startDate == other.startDate &&
                    updatedAt == other.updatedAt &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    contentVariationIndex,
                    contentVariations,
                    createdAt,
                    enabled,
                    expireCount,
                    expireDate,
                    gap,
                    gapFreq,
                    lastRecycledAt,
                    nextRecycleAt,
                    recycleCount,
                    startDate,
                    updatedAt,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Recycling{id=$id, contentVariationIndex=$contentVariationIndex, contentVariations=$contentVariations, createdAt=$createdAt, enabled=$enabled, expireCount=$expireCount, expireDate=$expireDate, gap=$gap, gapFreq=$gapFreq, lastRecycledAt=$lastRecycledAt, nextRecycleAt=$nextRecycleAt, recycleCount=$recycleCount, startDate=$startDate, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
        }

        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val DRAFT = of("draft")

                @JvmField val SCHEDULED = of("scheduled")

                @JvmField val PUBLISHING = of("publishing")

                @JvmField val PUBLISHED = of("published")

                @JvmField val FAILED = of("failed")

                @JvmField val PARTIAL = of("partial")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                DRAFT,
                SCHEDULED,
                PUBLISHING,
                PUBLISHED,
                FAILED,
                PARTIAL,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DRAFT,
                SCHEDULED,
                PUBLISHING,
                PUBLISHED,
                FAILED,
                PARTIAL,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
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
                    DRAFT -> Value.DRAFT
                    SCHEDULED -> Value.SCHEDULED
                    PUBLISHING -> Value.PUBLISHING
                    PUBLISHED -> Value.PUBLISHED
                    FAILED -> Value.FAILED
                    PARTIAL -> Value.PARTIAL
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
                    DRAFT -> Known.DRAFT
                    SCHEDULED -> Known.SCHEDULED
                    PUBLISHING -> Known.PUBLISHING
                    PUBLISHED -> Known.PUBLISHED
                    FAILED -> Known.FAILED
                    PARTIAL -> Known.PARTIAL
                    else -> throw RelayInvalidDataException("Unknown Status: $value")
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

            fun validate(): Status = apply {
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

                return other is Status && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Per-target results */
        class Targets
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

                /** Returns a mutable builder for constructing an instance of [Targets]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Targets]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(targets: Targets) = apply {
                    additionalProperties = targets.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [Targets].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Targets = Targets(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Targets = apply {
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

                return other is Targets && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Targets{additionalProperties=$additionalProperties}"
        }

        /** Engagement metrics (reactions, comments, views, etc.) */
        class Metrics
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val clicks: JsonField<Double>,
            private val comments: JsonField<Double>,
            private val engagementRate: JsonField<Double>,
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
                @JsonProperty("clicks")
                @ExcludeMissing
                clicks: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("comments")
                @ExcludeMissing
                comments: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("engagement_rate")
                @ExcludeMissing
                engagementRate: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("impressions")
                @ExcludeMissing
                impressions: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("likes") @ExcludeMissing likes: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("reach") @ExcludeMissing reach: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("saves") @ExcludeMissing saves: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("shares")
                @ExcludeMissing
                shares: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("views") @ExcludeMissing views: JsonField<Double> = JsonMissing.of(),
            ) : this(
                clicks,
                comments,
                engagementRate,
                impressions,
                likes,
                reach,
                saves,
                shares,
                views,
                mutableMapOf(),
            )

            /**
             * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun clicks(): Optional<Double> = clicks.getOptional("clicks")

            /**
             * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun comments(): Optional<Double> = comments.getOptional("comments")

            /**
             * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun engagementRate(): Optional<Double> = engagementRate.getOptional("engagement_rate")

            /**
             * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun impressions(): Optional<Double> = impressions.getOptional("impressions")

            /**
             * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun likes(): Optional<Double> = likes.getOptional("likes")

            /**
             * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun reach(): Optional<Double> = reach.getOptional("reach")

            /**
             * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun saves(): Optional<Double> = saves.getOptional("saves")

            /**
             * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun shares(): Optional<Double> = shares.getOptional("shares")

            /**
             * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun views(): Optional<Double> = views.getOptional("views")

            /**
             * Returns the raw JSON value of [clicks].
             *
             * Unlike [clicks], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("clicks") @ExcludeMissing fun _clicks(): JsonField<Double> = clicks

            /**
             * Returns the raw JSON value of [comments].
             *
             * Unlike [comments], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("comments") @ExcludeMissing fun _comments(): JsonField<Double> = comments

            /**
             * Returns the raw JSON value of [engagementRate].
             *
             * Unlike [engagementRate], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("engagement_rate")
            @ExcludeMissing
            fun _engagementRate(): JsonField<Double> = engagementRate

            /**
             * Returns the raw JSON value of [impressions].
             *
             * Unlike [impressions], this method doesn't throw if the JSON field has an unexpected
             * type.
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

                /** Returns a mutable builder for constructing an instance of [Metrics]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Metrics]. */
            class Builder internal constructor() {

                private var clicks: JsonField<Double> = JsonMissing.of()
                private var comments: JsonField<Double> = JsonMissing.of()
                private var engagementRate: JsonField<Double> = JsonMissing.of()
                private var impressions: JsonField<Double> = JsonMissing.of()
                private var likes: JsonField<Double> = JsonMissing.of()
                private var reach: JsonField<Double> = JsonMissing.of()
                private var saves: JsonField<Double> = JsonMissing.of()
                private var shares: JsonField<Double> = JsonMissing.of()
                private var views: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(metrics: Metrics) = apply {
                    clicks = metrics.clicks
                    comments = metrics.comments
                    engagementRate = metrics.engagementRate
                    impressions = metrics.impressions
                    likes = metrics.likes
                    reach = metrics.reach
                    saves = metrics.saves
                    shares = metrics.shares
                    views = metrics.views
                    additionalProperties = metrics.additionalProperties.toMutableMap()
                }

                fun clicks(clicks: Double) = clicks(JsonField.of(clicks))

                /**
                 * Sets [Builder.clicks] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.clicks] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun clicks(clicks: JsonField<Double>) = apply { this.clicks = clicks }

                fun comments(comments: Double) = comments(JsonField.of(comments))

                /**
                 * Sets [Builder.comments] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.comments] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun comments(comments: JsonField<Double>) = apply { this.comments = comments }

                fun engagementRate(engagementRate: Double) =
                    engagementRate(JsonField.of(engagementRate))

                /**
                 * Sets [Builder.engagementRate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.engagementRate] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun engagementRate(engagementRate: JsonField<Double>) = apply {
                    this.engagementRate = engagementRate
                }

                fun impressions(impressions: Double) = impressions(JsonField.of(impressions))

                /**
                 * Sets [Builder.impressions] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.impressions] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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

                fun reach(reach: Double) = reach(JsonField.of(reach))

                /**
                 * Sets [Builder.reach] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reach] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun reach(reach: JsonField<Double>) = apply { this.reach = reach }

                fun saves(saves: Double) = saves(JsonField.of(saves))

                /**
                 * Sets [Builder.saves] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.saves] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun saves(saves: JsonField<Double>) = apply { this.saves = saves }

                fun shares(shares: Double) = shares(JsonField.of(shares))

                /**
                 * Sets [Builder.shares] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.shares] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * Returns an immutable instance of [Metrics].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Metrics =
                    Metrics(
                        clicks,
                        comments,
                        engagementRate,
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

            fun validate(): Metrics = apply {
                if (validated) {
                    return@apply
                }

                clicks()
                comments()
                engagementRate()
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
                (if (clicks.asKnown().isPresent) 1 else 0) +
                    (if (comments.asKnown().isPresent) 1 else 0) +
                    (if (engagementRate.asKnown().isPresent) 1 else 0) +
                    (if (impressions.asKnown().isPresent) 1 else 0) +
                    (if (likes.asKnown().isPresent) 1 else 0) +
                    (if (reach.asKnown().isPresent) 1 else 0) +
                    (if (saves.asKnown().isPresent) 1 else 0) +
                    (if (shares.asKnown().isPresent) 1 else 0) +
                    (if (views.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Metrics &&
                    clicks == other.clicks &&
                    comments == other.comments &&
                    engagementRate == other.engagementRate &&
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
                    clicks,
                    comments,
                    engagementRate,
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
                "Metrics{clicks=$clicks, comments=$comments, engagementRate=$engagementRate, impressions=$impressions, likes=$likes, reach=$reach, saves=$saves, shares=$shares, views=$views, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                content == other.content &&
                createdAt == other.createdAt &&
                media == other.media &&
                publishedAt == other.publishedAt &&
                recycledFromId == other.recycledFromId &&
                recycling == other.recycling &&
                scheduledAt == other.scheduledAt &&
                status == other.status &&
                targets == other.targets &&
                updatedAt == other.updatedAt &&
                metrics == other.metrics &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                content,
                createdAt,
                media,
                publishedAt,
                recycledFromId,
                recycling,
                scheduledAt,
                status,
                targets,
                updatedAt,
                metrics,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, content=$content, createdAt=$createdAt, media=$media, publishedAt=$publishedAt, recycledFromId=$recycledFromId, recycling=$recycling, scheduledAt=$scheduledAt, status=$status, targets=$targets, updatedAt=$updatedAt, metrics=$metrics, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PostListResponse &&
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
        "PostListResponse{data=$data, hasMore=$hasMore, nextCursor=$nextCursor, additionalProperties=$additionalProperties}"
}
