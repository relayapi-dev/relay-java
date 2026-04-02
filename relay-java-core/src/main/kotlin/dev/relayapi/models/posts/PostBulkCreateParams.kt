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
import dev.relayapi.core.Params
import dev.relayapi.core.checkKnown
import dev.relayapi.core.checkRequired
import dev.relayapi.core.http.Headers
import dev.relayapi.core.http.QueryParams
import dev.relayapi.core.toImmutable
import dev.relayapi.errors.RelayInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Create multiple posts in a single request. Each item follows the same schema as single post
 * creation.
 */
class PostBulkCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Array of posts to create (max 50)
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun posts(): List<Post> = body.posts()

    /**
     * Returns the raw JSON value of [posts].
     *
     * Unlike [posts], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _posts(): JsonField<List<Post>> = body._posts()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PostBulkCreateParams].
         *
         * The following fields are required:
         * ```java
         * .posts()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PostBulkCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(postBulkCreateParams: PostBulkCreateParams) = apply {
            body = postBulkCreateParams.body.toBuilder()
            additionalHeaders = postBulkCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = postBulkCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [posts]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Array of posts to create (max 50) */
        fun posts(posts: List<Post>) = apply { body.posts(posts) }

        /**
         * Sets [Builder.posts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.posts] with a well-typed `List<Post>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun posts(posts: JsonField<List<Post>>) = apply { body.posts(posts) }

        /**
         * Adds a single [Post] to [posts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPost(post: Post) = apply { body.addPost(post) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [PostBulkCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .posts()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PostBulkCreateParams =
            PostBulkCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val posts: JsonField<List<Post>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("posts") @ExcludeMissing posts: JsonField<List<Post>> = JsonMissing.of()
        ) : this(posts, mutableMapOf())

        /**
         * Array of posts to create (max 50)
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun posts(): List<Post> = posts.getRequired("posts")

        /**
         * Returns the raw JSON value of [posts].
         *
         * Unlike [posts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("posts") @ExcludeMissing fun _posts(): JsonField<List<Post>> = posts

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .posts()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var posts: JsonField<MutableList<Post>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                posts = body.posts.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Array of posts to create (max 50) */
            fun posts(posts: List<Post>) = posts(JsonField.of(posts))

            /**
             * Sets [Builder.posts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.posts] with a well-typed `List<Post>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun posts(posts: JsonField<List<Post>>) = apply {
                this.posts = posts.map { it.toMutableList() }
            }

            /**
             * Adds a single [Post] to [posts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPost(post: Post) = apply {
                posts =
                    (posts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("posts", it).add(post)
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .posts()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("posts", posts).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            posts().forEach { it.validate() }
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
            (posts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                posts == other.posts &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(posts, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Body{posts=$posts, additionalProperties=$additionalProperties}"
    }

    class Post
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val scheduledAt: JsonField<String>,
        private val targets: JsonField<List<String>>,
        private val content: JsonField<String>,
        private val media: JsonField<List<Media>>,
        private val recycling: JsonField<Recycling>,
        private val targetOptions: JsonField<TargetOptions>,
        private val timezone: JsonField<String>,
        private val workspaceId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("scheduled_at")
            @ExcludeMissing
            scheduledAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("targets")
            @ExcludeMissing
            targets: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("content") @ExcludeMissing content: JsonField<String> = JsonMissing.of(),
            @JsonProperty("media") @ExcludeMissing media: JsonField<List<Media>> = JsonMissing.of(),
            @JsonProperty("recycling")
            @ExcludeMissing
            recycling: JsonField<Recycling> = JsonMissing.of(),
            @JsonProperty("target_options")
            @ExcludeMissing
            targetOptions: JsonField<TargetOptions> = JsonMissing.of(),
            @JsonProperty("timezone")
            @ExcludeMissing
            timezone: JsonField<String> = JsonMissing.of(),
            @JsonProperty("workspace_id")
            @ExcludeMissing
            workspaceId: JsonField<String> = JsonMissing.of(),
        ) : this(
            scheduledAt,
            targets,
            content,
            media,
            recycling,
            targetOptions,
            timezone,
            workspaceId,
            mutableMapOf(),
        )

        /**
         * Publish intent. Use "now" to publish immediately, "draft" to save as draft, or an ISO
         * 8601 timestamp to schedule.
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun scheduledAt(): String = scheduledAt.getRequired("scheduled_at")

        /**
         * Account IDs, platform names, or workspace IDs to publish to
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun targets(): List<String> = targets.getRequired("targets")

        /**
         * Post text. Optional if target_options provide per-target content.
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun content(): Optional<String> = content.getOptional("content")

        /**
         * Media attachments
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun media(): Optional<List<Media>> = media.getOptional("media")

        /**
         * Recycling configuration for evergreen content (Pro plan only)
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recycling(): Optional<Recycling> = recycling.getOptional("recycling")

        /**
         * Per-target customizations keyed by target value (account ID or platform name). Supports
         * platform-specific features such as Twitter polls (poll.options, poll.duration_minutes),
         * threads, reply_to, and reply_settings.
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun targetOptions(): Optional<TargetOptions> = targetOptions.getOptional("target_options")

        /**
         * IANA timezone for scheduling
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timezone(): Optional<String> = timezone.getOptional("timezone")

        /**
         * Workspace ID to scope this post to
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun workspaceId(): Optional<String> = workspaceId.getOptional("workspace_id")

        /**
         * Returns the raw JSON value of [scheduledAt].
         *
         * Unlike [scheduledAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("scheduled_at")
        @ExcludeMissing
        fun _scheduledAt(): JsonField<String> = scheduledAt

        /**
         * Returns the raw JSON value of [targets].
         *
         * Unlike [targets], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("targets") @ExcludeMissing fun _targets(): JsonField<List<String>> = targets

        /**
         * Returns the raw JSON value of [content].
         *
         * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

        /**
         * Returns the raw JSON value of [media].
         *
         * Unlike [media], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("media") @ExcludeMissing fun _media(): JsonField<List<Media>> = media

        /**
         * Returns the raw JSON value of [recycling].
         *
         * Unlike [recycling], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("recycling")
        @ExcludeMissing
        fun _recycling(): JsonField<Recycling> = recycling

        /**
         * Returns the raw JSON value of [targetOptions].
         *
         * Unlike [targetOptions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("target_options")
        @ExcludeMissing
        fun _targetOptions(): JsonField<TargetOptions> = targetOptions

        /**
         * Returns the raw JSON value of [timezone].
         *
         * Unlike [timezone], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timezone") @ExcludeMissing fun _timezone(): JsonField<String> = timezone

        /**
         * Returns the raw JSON value of [workspaceId].
         *
         * Unlike [workspaceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("workspace_id")
        @ExcludeMissing
        fun _workspaceId(): JsonField<String> = workspaceId

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
             * Returns a mutable builder for constructing an instance of [Post].
             *
             * The following fields are required:
             * ```java
             * .scheduledAt()
             * .targets()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Post]. */
        class Builder internal constructor() {

            private var scheduledAt: JsonField<String>? = null
            private var targets: JsonField<MutableList<String>>? = null
            private var content: JsonField<String> = JsonMissing.of()
            private var media: JsonField<MutableList<Media>>? = null
            private var recycling: JsonField<Recycling> = JsonMissing.of()
            private var targetOptions: JsonField<TargetOptions> = JsonMissing.of()
            private var timezone: JsonField<String> = JsonMissing.of()
            private var workspaceId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(post: Post) = apply {
                scheduledAt = post.scheduledAt
                targets = post.targets.map { it.toMutableList() }
                content = post.content
                media = post.media.map { it.toMutableList() }
                recycling = post.recycling
                targetOptions = post.targetOptions
                timezone = post.timezone
                workspaceId = post.workspaceId
                additionalProperties = post.additionalProperties.toMutableMap()
            }

            /**
             * Publish intent. Use "now" to publish immediately, "draft" to save as draft, or an ISO
             * 8601 timestamp to schedule.
             */
            fun scheduledAt(scheduledAt: String) = scheduledAt(JsonField.of(scheduledAt))

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

            /** Account IDs, platform names, or workspace IDs to publish to */
            fun targets(targets: List<String>) = targets(JsonField.of(targets))

            /**
             * Sets [Builder.targets] to an arbitrary JSON value.
             *
             * You should usually call [Builder.targets] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun targets(targets: JsonField<List<String>>) = apply {
                this.targets = targets.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [targets].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTarget(target: String) = apply {
                targets =
                    (targets ?: JsonField.of(mutableListOf())).also {
                        checkKnown("targets", it).add(target)
                    }
            }

            /** Post text. Optional if target_options provide per-target content. */
            fun content(content: String) = content(JsonField.of(content))

            /**
             * Sets [Builder.content] to an arbitrary JSON value.
             *
             * You should usually call [Builder.content] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun content(content: JsonField<String>) = apply { this.content = content }

            /** Media attachments */
            fun media(media: List<Media>) = media(JsonField.of(media))

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

            /** Recycling configuration for evergreen content (Pro plan only) */
            fun recycling(recycling: Recycling) = recycling(JsonField.of(recycling))

            /**
             * Sets [Builder.recycling] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recycling] with a well-typed [Recycling] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recycling(recycling: JsonField<Recycling>) = apply { this.recycling = recycling }

            /**
             * Per-target customizations keyed by target value (account ID or platform name).
             * Supports platform-specific features such as Twitter polls (poll.options,
             * poll.duration_minutes), threads, reply_to, and reply_settings.
             */
            fun targetOptions(targetOptions: TargetOptions) =
                targetOptions(JsonField.of(targetOptions))

            /**
             * Sets [Builder.targetOptions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.targetOptions] with a well-typed [TargetOptions]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun targetOptions(targetOptions: JsonField<TargetOptions>) = apply {
                this.targetOptions = targetOptions
            }

            /** IANA timezone for scheduling */
            fun timezone(timezone: String) = timezone(JsonField.of(timezone))

            /**
             * Sets [Builder.timezone] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timezone] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timezone(timezone: JsonField<String>) = apply { this.timezone = timezone }

            /** Workspace ID to scope this post to */
            fun workspaceId(workspaceId: String) = workspaceId(JsonField.of(workspaceId))

            /**
             * Sets [Builder.workspaceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.workspaceId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun workspaceId(workspaceId: JsonField<String>) = apply {
                this.workspaceId = workspaceId
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
             * Returns an immutable instance of [Post].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .scheduledAt()
             * .targets()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Post =
                Post(
                    checkRequired("scheduledAt", scheduledAt),
                    checkRequired("targets", targets).map { it.toImmutable() },
                    content,
                    (media ?: JsonMissing.of()).map { it.toImmutable() },
                    recycling,
                    targetOptions,
                    timezone,
                    workspaceId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Post = apply {
            if (validated) {
                return@apply
            }

            scheduledAt()
            targets()
            content()
            media().ifPresent { it.forEach { it.validate() } }
            recycling().ifPresent { it.validate() }
            targetOptions().ifPresent { it.validate() }
            timezone()
            workspaceId()
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
            (if (scheduledAt.asKnown().isPresent) 1 else 0) +
                (targets.asKnown().getOrNull()?.size ?: 0) +
                (if (content.asKnown().isPresent) 1 else 0) +
                (media.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (recycling.asKnown().getOrNull()?.validity() ?: 0) +
                (targetOptions.asKnown().getOrNull()?.validity() ?: 0) +
                (if (timezone.asKnown().isPresent) 1 else 0) +
                (if (workspaceId.asKnown().isPresent) 1 else 0)

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

        /** Recycling configuration for evergreen content (Pro plan only) */
        class Recycling
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val gap: JsonField<Long>,
            private val gapFreq: JsonField<GapFreq>,
            private val startDate: JsonField<OffsetDateTime>,
            private val contentVariations: JsonField<List<String>>,
            private val enabled: JsonField<Boolean>,
            private val expireCount: JsonField<Long>,
            private val expireDate: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("gap") @ExcludeMissing gap: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("gap_freq")
                @ExcludeMissing
                gapFreq: JsonField<GapFreq> = JsonMissing.of(),
                @JsonProperty("start_date")
                @ExcludeMissing
                startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("content_variations")
                @ExcludeMissing
                contentVariations: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("enabled")
                @ExcludeMissing
                enabled: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("expire_count")
                @ExcludeMissing
                expireCount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("expire_date")
                @ExcludeMissing
                expireDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(
                gap,
                gapFreq,
                startDate,
                contentVariations,
                enabled,
                expireCount,
                expireDate,
                mutableMapOf(),
            )

            /**
             * Interval value
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun gap(): Long = gap.getRequired("gap")

            /**
             * Interval unit
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun gapFreq(): GapFreq = gapFreq.getRequired("gap_freq")

            /**
             * When to start recycling
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

            /**
             * Alternate content texts (round-robin)
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun contentVariations(): Optional<List<String>> =
                contentVariations.getOptional("content_variations")

            /**
             * Whether recycling is active
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun enabled(): Optional<Boolean> = enabled.getOptional("enabled")

            /**
             * Stop after this many recycles
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun expireCount(): Optional<Long> = expireCount.getOptional("expire_count")

            /**
             * Stop after this date
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun expireDate(): Optional<OffsetDateTime> = expireDate.getOptional("expire_date")

            /**
             * Returns the raw JSON value of [gap].
             *
             * Unlike [gap], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("gap") @ExcludeMissing fun _gap(): JsonField<Long> = gap

            /**
             * Returns the raw JSON value of [gapFreq].
             *
             * Unlike [gapFreq], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("gap_freq") @ExcludeMissing fun _gapFreq(): JsonField<GapFreq> = gapFreq

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
             * Returns the raw JSON value of [contentVariations].
             *
             * Unlike [contentVariations], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("content_variations")
            @ExcludeMissing
            fun _contentVariations(): JsonField<List<String>> = contentVariations

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
            fun _expireCount(): JsonField<Long> = expireCount

            /**
             * Returns the raw JSON value of [expireDate].
             *
             * Unlike [expireDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("expire_date")
            @ExcludeMissing
            fun _expireDate(): JsonField<OffsetDateTime> = expireDate

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
                 * .gap()
                 * .gapFreq()
                 * .startDate()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Recycling]. */
            class Builder internal constructor() {

                private var gap: JsonField<Long>? = null
                private var gapFreq: JsonField<GapFreq>? = null
                private var startDate: JsonField<OffsetDateTime>? = null
                private var contentVariations: JsonField<MutableList<String>>? = null
                private var enabled: JsonField<Boolean> = JsonMissing.of()
                private var expireCount: JsonField<Long> = JsonMissing.of()
                private var expireDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(recycling: Recycling) = apply {
                    gap = recycling.gap
                    gapFreq = recycling.gapFreq
                    startDate = recycling.startDate
                    contentVariations = recycling.contentVariations.map { it.toMutableList() }
                    enabled = recycling.enabled
                    expireCount = recycling.expireCount
                    expireDate = recycling.expireDate
                    additionalProperties = recycling.additionalProperties.toMutableMap()
                }

                /** Interval value */
                fun gap(gap: Long) = gap(JsonField.of(gap))

                /**
                 * Sets [Builder.gap] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.gap] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun gap(gap: JsonField<Long>) = apply { this.gap = gap }

                /** Interval unit */
                fun gapFreq(gapFreq: GapFreq) = gapFreq(JsonField.of(gapFreq))

                /**
                 * Sets [Builder.gapFreq] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.gapFreq] with a well-typed [GapFreq] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun gapFreq(gapFreq: JsonField<GapFreq>) = apply { this.gapFreq = gapFreq }

                /** When to start recycling */
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

                /** Alternate content texts (round-robin) */
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

                /** Whether recycling is active */
                fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

                /**
                 * Sets [Builder.enabled] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.enabled] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

                /** Stop after this many recycles */
                fun expireCount(expireCount: Long) = expireCount(JsonField.of(expireCount))

                /**
                 * Sets [Builder.expireCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.expireCount] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun expireCount(expireCount: JsonField<Long>) = apply {
                    this.expireCount = expireCount
                }

                /** Stop after this date */
                fun expireDate(expireDate: OffsetDateTime) = expireDate(JsonField.of(expireDate))

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
                 * .gap()
                 * .gapFreq()
                 * .startDate()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Recycling =
                    Recycling(
                        checkRequired("gap", gap),
                        checkRequired("gapFreq", gapFreq),
                        checkRequired("startDate", startDate),
                        (contentVariations ?: JsonMissing.of()).map { it.toImmutable() },
                        enabled,
                        expireCount,
                        expireDate,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Recycling = apply {
                if (validated) {
                    return@apply
                }

                gap()
                gapFreq().validate()
                startDate()
                contentVariations()
                enabled()
                expireCount()
                expireDate()
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
                (if (gap.asKnown().isPresent) 1 else 0) +
                    (gapFreq.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (startDate.asKnown().isPresent) 1 else 0) +
                    (contentVariations.asKnown().getOrNull()?.size ?: 0) +
                    (if (enabled.asKnown().isPresent) 1 else 0) +
                    (if (expireCount.asKnown().isPresent) 1 else 0) +
                    (if (expireDate.asKnown().isPresent) 1 else 0)

            /** Interval unit */
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
                    gap == other.gap &&
                    gapFreq == other.gapFreq &&
                    startDate == other.startDate &&
                    contentVariations == other.contentVariations &&
                    enabled == other.enabled &&
                    expireCount == other.expireCount &&
                    expireDate == other.expireDate &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    gap,
                    gapFreq,
                    startDate,
                    contentVariations,
                    enabled,
                    expireCount,
                    expireDate,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Recycling{gap=$gap, gapFreq=$gapFreq, startDate=$startDate, contentVariations=$contentVariations, enabled=$enabled, expireCount=$expireCount, expireDate=$expireDate, additionalProperties=$additionalProperties}"
        }

        /**
         * Per-target customizations keyed by target value (account ID or platform name). Supports
         * platform-specific features such as Twitter polls (poll.options, poll.duration_minutes),
         * threads, reply_to, and reply_settings.
         */
        class TargetOptions
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

                /** Returns a mutable builder for constructing an instance of [TargetOptions]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [TargetOptions]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(targetOptions: TargetOptions) = apply {
                    additionalProperties = targetOptions.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [TargetOptions].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): TargetOptions = TargetOptions(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): TargetOptions = apply {
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

                return other is TargetOptions && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "TargetOptions{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Post &&
                scheduledAt == other.scheduledAt &&
                targets == other.targets &&
                content == other.content &&
                media == other.media &&
                recycling == other.recycling &&
                targetOptions == other.targetOptions &&
                timezone == other.timezone &&
                workspaceId == other.workspaceId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                scheduledAt,
                targets,
                content,
                media,
                recycling,
                targetOptions,
                timezone,
                workspaceId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Post{scheduledAt=$scheduledAt, targets=$targets, content=$content, media=$media, recycling=$recycling, targetOptions=$targetOptions, timezone=$timezone, workspaceId=$workspaceId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PostBulkCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PostBulkCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
