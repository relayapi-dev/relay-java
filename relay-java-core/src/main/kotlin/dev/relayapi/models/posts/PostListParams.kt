// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.posts

import com.fasterxml.jackson.annotation.JsonCreator
import dev.relayapi.core.Enum
import dev.relayapi.core.JsonField
import dev.relayapi.core.Params
import dev.relayapi.core.http.Headers
import dev.relayapi.core.http.QueryParams
import dev.relayapi.errors.RelayInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List posts */
class PostListParams
private constructor(
    private val accountId: String?,
    private val cursor: String?,
    private val from: OffsetDateTime?,
    private val include: String?,
    private val includeExternal: IncludeExternal?,
    private val limit: Long?,
    private val status: Status?,
    private val to: OffsetDateTime?,
    private val workspaceId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter by specific account ID */
    fun accountId(): Optional<String> = Optional.ofNullable(accountId)

    /** Pagination cursor */
    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    /** Filter: start date (ISO 8601) */
    fun from(): Optional<OffsetDateTime> = Optional.ofNullable(from)

    /** Comma-separated list of fields to include in the response (e.g. 'targets,media') */
    fun include(): Optional<String> = Optional.ofNullable(include)

    /** When true and status=published, also return external posts merged by published_at */
    fun includeExternal(): Optional<IncludeExternal> = Optional.ofNullable(includeExternal)

    /** Number of items per page */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Filter by post status */
    fun status(): Optional<Status> = Optional.ofNullable(status)

    /** Filter: end date (ISO 8601) */
    fun to(): Optional<OffsetDateTime> = Optional.ofNullable(to)

    /** Filter by workspace ID */
    fun workspaceId(): Optional<String> = Optional.ofNullable(workspaceId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): PostListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [PostListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PostListParams]. */
    class Builder internal constructor() {

        private var accountId: String? = null
        private var cursor: String? = null
        private var from: OffsetDateTime? = null
        private var include: String? = null
        private var includeExternal: IncludeExternal? = null
        private var limit: Long? = null
        private var status: Status? = null
        private var to: OffsetDateTime? = null
        private var workspaceId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(postListParams: PostListParams) = apply {
            accountId = postListParams.accountId
            cursor = postListParams.cursor
            from = postListParams.from
            include = postListParams.include
            includeExternal = postListParams.includeExternal
            limit = postListParams.limit
            status = postListParams.status
            to = postListParams.to
            workspaceId = postListParams.workspaceId
            additionalHeaders = postListParams.additionalHeaders.toBuilder()
            additionalQueryParams = postListParams.additionalQueryParams.toBuilder()
        }

        /** Filter by specific account ID */
        fun accountId(accountId: String?) = apply { this.accountId = accountId }

        /** Alias for calling [Builder.accountId] with `accountId.orElse(null)`. */
        fun accountId(accountId: Optional<String>) = accountId(accountId.getOrNull())

        /** Pagination cursor */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /** Alias for calling [Builder.cursor] with `cursor.orElse(null)`. */
        fun cursor(cursor: Optional<String>) = cursor(cursor.getOrNull())

        /** Filter: start date (ISO 8601) */
        fun from(from: OffsetDateTime?) = apply { this.from = from }

        /** Alias for calling [Builder.from] with `from.orElse(null)`. */
        fun from(from: Optional<OffsetDateTime>) = from(from.getOrNull())

        /** Comma-separated list of fields to include in the response (e.g. 'targets,media') */
        fun include(include: String?) = apply { this.include = include }

        /** Alias for calling [Builder.include] with `include.orElse(null)`. */
        fun include(include: Optional<String>) = include(include.getOrNull())

        /** When true and status=published, also return external posts merged by published_at */
        fun includeExternal(includeExternal: IncludeExternal?) = apply {
            this.includeExternal = includeExternal
        }

        /** Alias for calling [Builder.includeExternal] with `includeExternal.orElse(null)`. */
        fun includeExternal(includeExternal: Optional<IncludeExternal>) =
            includeExternal(includeExternal.getOrNull())

        /** Number of items per page */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /** Filter by post status */
        fun status(status: Status?) = apply { this.status = status }

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<Status>) = status(status.getOrNull())

        /** Filter: end date (ISO 8601) */
        fun to(to: OffsetDateTime?) = apply { this.to = to }

        /** Alias for calling [Builder.to] with `to.orElse(null)`. */
        fun to(to: Optional<OffsetDateTime>) = to(to.getOrNull())

        /** Filter by workspace ID */
        fun workspaceId(workspaceId: String?) = apply { this.workspaceId = workspaceId }

        /** Alias for calling [Builder.workspaceId] with `workspaceId.orElse(null)`. */
        fun workspaceId(workspaceId: Optional<String>) = workspaceId(workspaceId.getOrNull())

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
         * Returns an immutable instance of [PostListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PostListParams =
            PostListParams(
                accountId,
                cursor,
                from,
                include,
                includeExternal,
                limit,
                status,
                to,
                workspaceId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                accountId?.let { put("account_id", it) }
                cursor?.let { put("cursor", it) }
                from?.let { put("from", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                include?.let { put("include", it) }
                includeExternal?.let { put("include_external", it.toString()) }
                limit?.let { put("limit", it.toString()) }
                status?.let { put("status", it.toString()) }
                to?.let { put("to", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                workspaceId?.let { put("workspace_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /** When true and status=published, also return external posts merged by published_at */
    class IncludeExternal @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val TRUE = of("true")

            @JvmField val FALSE = of("false")

            @JvmStatic fun of(value: String) = IncludeExternal(JsonField.of(value))
        }

        /** An enum containing [IncludeExternal]'s known values. */
        enum class Known {
            TRUE,
            FALSE,
        }

        /**
         * An enum containing [IncludeExternal]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [IncludeExternal] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRUE,
            FALSE,
            /**
             * An enum member indicating that [IncludeExternal] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                TRUE -> Value.TRUE
                FALSE -> Value.FALSE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws RelayInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                TRUE -> Known.TRUE
                FALSE -> Known.FALSE
                else -> throw RelayInvalidDataException("Unknown IncludeExternal: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws RelayInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { RelayInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): IncludeExternal = apply {
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

            return other is IncludeExternal && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Filter by post status */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val DRAFT = of("draft")

            @JvmField val SCHEDULED = of("scheduled")

            @JvmField val PUBLISHING = of("publishing")

            @JvmField val PUBLISHED = of("published")

            @JvmField val FAILED = of("failed")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            DRAFT,
            SCHEDULED,
            PUBLISHING,
            PUBLISHED,
            FAILED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DRAFT,
            SCHEDULED,
            PUBLISHING,
            PUBLISHED,
            FAILED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                DRAFT -> Value.DRAFT
                SCHEDULED -> Value.SCHEDULED
                PUBLISHING -> Value.PUBLISHING
                PUBLISHED -> Value.PUBLISHED
                FAILED -> Value.FAILED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws RelayInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                DRAFT -> Known.DRAFT
                SCHEDULED -> Known.SCHEDULED
                PUBLISHING -> Known.PUBLISHING
                PUBLISHED -> Known.PUBLISHED
                FAILED -> Known.FAILED
                else -> throw RelayInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws RelayInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { RelayInvalidDataException("Value is not a String") }

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PostListParams &&
            accountId == other.accountId &&
            cursor == other.cursor &&
            from == other.from &&
            include == other.include &&
            includeExternal == other.includeExternal &&
            limit == other.limit &&
            status == other.status &&
            to == other.to &&
            workspaceId == other.workspaceId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            accountId,
            cursor,
            from,
            include,
            includeExternal,
            limit,
            status,
            to,
            workspaceId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "PostListParams{accountId=$accountId, cursor=$cursor, from=$from, include=$include, includeExternal=$includeExternal, limit=$limit, status=$status, to=$to, workspaceId=$workspaceId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
