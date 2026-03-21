// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.posts.logs

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class LogRetrieveResponse
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
         * Returns a mutable builder for constructing an instance of [LogRetrieveResponse].
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

    /** A builder for [LogRetrieveResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var hasMore: JsonField<Boolean>? = null
        private var nextCursor: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(logRetrieveResponse: LogRetrieveResponse) = apply {
            data = logRetrieveResponse.data.map { it.toMutableList() }
            hasMore = logRetrieveResponse.hasMore
            nextCursor = logRetrieveResponse.nextCursor
            additionalProperties = logRetrieveResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [LogRetrieveResponse].
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
        fun build(): LogRetrieveResponse =
            LogRetrieveResponse(
                checkRequired("data", data).map { it.toImmutable() },
                checkRequired("hasMore", hasMore),
                checkRequired("nextCursor", nextCursor),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LogRetrieveResponse = apply {
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
        private val error: JsonField<String>,
        private val platform: JsonField<String>,
        private val platformPostId: JsonField<String>,
        private val platformUrl: JsonField<String>,
        private val postId: JsonField<String>,
        private val publishedAt: JsonField<OffsetDateTime>,
        private val socialAccountId: JsonField<String>,
        private val status: JsonField<String>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
            @JsonProperty("platform")
            @ExcludeMissing
            platform: JsonField<String> = JsonMissing.of(),
            @JsonProperty("platform_post_id")
            @ExcludeMissing
            platformPostId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("platform_url")
            @ExcludeMissing
            platformUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("post_id") @ExcludeMissing postId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("published_at")
            @ExcludeMissing
            publishedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("social_account_id")
            @ExcludeMissing
            socialAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            id,
            error,
            platform,
            platformPostId,
            platformUrl,
            postId,
            publishedAt,
            socialAccountId,
            status,
            updatedAt,
            mutableMapOf(),
        )

        /**
         * Log entry ID (post target ID)
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Error message if failed
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun error(): Optional<String> = error.getOptional("error")

        /**
         * Platform name
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun platform(): String = platform.getRequired("platform")

        /**
         * Platform post ID
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun platformPostId(): Optional<String> = platformPostId.getOptional("platform_post_id")

        /**
         * Published URL
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun platformUrl(): Optional<String> = platformUrl.getOptional("platform_url")

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
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun publishedAt(): Optional<OffsetDateTime> = publishedAt.getOptional("published_at")

        /**
         * Social account ID
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun socialAccountId(): String = socialAccountId.getRequired("social_account_id")

        /**
         * Target status
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): String = status.getRequired("status")

        /**
         * Last updated
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [error].
         *
         * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

        /**
         * Returns the raw JSON value of [platform].
         *
         * Unlike [platform], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("platform") @ExcludeMissing fun _platform(): JsonField<String> = platform

        /**
         * Returns the raw JSON value of [platformPostId].
         *
         * Unlike [platformPostId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("platform_post_id")
        @ExcludeMissing
        fun _platformPostId(): JsonField<String> = platformPostId

        /**
         * Returns the raw JSON value of [platformUrl].
         *
         * Unlike [platformUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("platform_url")
        @ExcludeMissing
        fun _platformUrl(): JsonField<String> = platformUrl

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
         * Returns the raw JSON value of [socialAccountId].
         *
         * Unlike [socialAccountId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("social_account_id")
        @ExcludeMissing
        fun _socialAccountId(): JsonField<String> = socialAccountId

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
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
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .error()
             * .platform()
             * .platformPostId()
             * .platformUrl()
             * .postId()
             * .publishedAt()
             * .socialAccountId()
             * .status()
             * .updatedAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var error: JsonField<String>? = null
            private var platform: JsonField<String>? = null
            private var platformPostId: JsonField<String>? = null
            private var platformUrl: JsonField<String>? = null
            private var postId: JsonField<String>? = null
            private var publishedAt: JsonField<OffsetDateTime>? = null
            private var socialAccountId: JsonField<String>? = null
            private var status: JsonField<String>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                error = data.error
                platform = data.platform
                platformPostId = data.platformPostId
                platformUrl = data.platformUrl
                postId = data.postId
                publishedAt = data.publishedAt
                socialAccountId = data.socialAccountId
                status = data.status
                updatedAt = data.updatedAt
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Log entry ID (post target ID) */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Error message if failed */
            fun error(error: String?) = error(JsonField.ofNullable(error))

            /** Alias for calling [Builder.error] with `error.orElse(null)`. */
            fun error(error: Optional<String>) = error(error.getOrNull())

            /**
             * Sets [Builder.error] to an arbitrary JSON value.
             *
             * You should usually call [Builder.error] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun error(error: JsonField<String>) = apply { this.error = error }

            /** Platform name */
            fun platform(platform: String) = platform(JsonField.of(platform))

            /**
             * Sets [Builder.platform] to an arbitrary JSON value.
             *
             * You should usually call [Builder.platform] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun platform(platform: JsonField<String>) = apply { this.platform = platform }

            /** Platform post ID */
            fun platformPostId(platformPostId: String?) =
                platformPostId(JsonField.ofNullable(platformPostId))

            /** Alias for calling [Builder.platformPostId] with `platformPostId.orElse(null)`. */
            fun platformPostId(platformPostId: Optional<String>) =
                platformPostId(platformPostId.getOrNull())

            /**
             * Sets [Builder.platformPostId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.platformPostId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun platformPostId(platformPostId: JsonField<String>) = apply {
                this.platformPostId = platformPostId
            }

            /** Published URL */
            fun platformUrl(platformUrl: String?) = platformUrl(JsonField.ofNullable(platformUrl))

            /** Alias for calling [Builder.platformUrl] with `platformUrl.orElse(null)`. */
            fun platformUrl(platformUrl: Optional<String>) = platformUrl(platformUrl.getOrNull())

            /**
             * Sets [Builder.platformUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.platformUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun platformUrl(platformUrl: JsonField<String>) = apply {
                this.platformUrl = platformUrl
            }

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
            fun publishedAt(publishedAt: OffsetDateTime?) =
                publishedAt(JsonField.ofNullable(publishedAt))

            /** Alias for calling [Builder.publishedAt] with `publishedAt.orElse(null)`. */
            fun publishedAt(publishedAt: Optional<OffsetDateTime>) =
                publishedAt(publishedAt.getOrNull())

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

            /** Social account ID */
            fun socialAccountId(socialAccountId: String) =
                socialAccountId(JsonField.of(socialAccountId))

            /**
             * Sets [Builder.socialAccountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.socialAccountId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun socialAccountId(socialAccountId: JsonField<String>) = apply {
                this.socialAccountId = socialAccountId
            }

            /** Target status */
            fun status(status: String) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<String>) = apply { this.status = status }

            /** Last updated */
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
             * .error()
             * .platform()
             * .platformPostId()
             * .platformUrl()
             * .postId()
             * .publishedAt()
             * .socialAccountId()
             * .status()
             * .updatedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("id", id),
                    checkRequired("error", error),
                    checkRequired("platform", platform),
                    checkRequired("platformPostId", platformPostId),
                    checkRequired("platformUrl", platformUrl),
                    checkRequired("postId", postId),
                    checkRequired("publishedAt", publishedAt),
                    checkRequired("socialAccountId", socialAccountId),
                    checkRequired("status", status),
                    checkRequired("updatedAt", updatedAt),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            error()
            platform()
            platformPostId()
            platformUrl()
            postId()
            publishedAt()
            socialAccountId()
            status()
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
                (if (error.asKnown().isPresent) 1 else 0) +
                (if (platform.asKnown().isPresent) 1 else 0) +
                (if (platformPostId.asKnown().isPresent) 1 else 0) +
                (if (platformUrl.asKnown().isPresent) 1 else 0) +
                (if (postId.asKnown().isPresent) 1 else 0) +
                (if (publishedAt.asKnown().isPresent) 1 else 0) +
                (if (socialAccountId.asKnown().isPresent) 1 else 0) +
                (if (status.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                error == other.error &&
                platform == other.platform &&
                platformPostId == other.platformPostId &&
                platformUrl == other.platformUrl &&
                postId == other.postId &&
                publishedAt == other.publishedAt &&
                socialAccountId == other.socialAccountId &&
                status == other.status &&
                updatedAt == other.updatedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                error,
                platform,
                platformPostId,
                platformUrl,
                postId,
                publishedAt,
                socialAccountId,
                status,
                updatedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, error=$error, platform=$platform, platformPostId=$platformPostId, platformUrl=$platformUrl, postId=$postId, publishedAt=$publishedAt, socialAccountId=$socialAccountId, status=$status, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LogRetrieveResponse &&
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
        "LogRetrieveResponse{data=$data, hasMore=$hasMore, nextCursor=$nextCursor, additionalProperties=$additionalProperties}"
}
