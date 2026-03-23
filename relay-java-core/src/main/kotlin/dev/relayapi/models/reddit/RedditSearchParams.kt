// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.reddit

import com.fasterxml.jackson.annotation.JsonCreator
import dev.relayapi.core.Enum
import dev.relayapi.core.JsonField
import dev.relayapi.core.Params
import dev.relayapi.core.checkRequired
import dev.relayapi.core.http.Headers
import dev.relayapi.core.http.QueryParams
import dev.relayapi.errors.RelayInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Search Reddit posts */
class RedditSearchParams
private constructor(
    private val accountId: String,
    private val query: String,
    private val cursor: String?,
    private val from: OffsetDateTime?,
    private val limit: Long?,
    private val sort: Sort?,
    private val subreddit: String?,
    private val time: Time?,
    private val to: OffsetDateTime?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Reddit account ID */
    fun accountId(): String = accountId

    /** Search query */
    fun query(): String = query

    /** Pagination cursor */
    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    /** Filter: start date (ISO 8601) */
    fun from(): Optional<OffsetDateTime> = Optional.ofNullable(from)

    /** Number of items per page */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Sort order */
    fun sort(): Optional<Sort> = Optional.ofNullable(sort)

    /** Limit to subreddit */
    fun subreddit(): Optional<String> = Optional.ofNullable(subreddit)

    /** Time filter */
    fun time(): Optional<Time> = Optional.ofNullable(time)

    /** Filter: end date (ISO 8601) */
    fun to(): Optional<OffsetDateTime> = Optional.ofNullable(to)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RedditSearchParams].
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .query()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RedditSearchParams]. */
    class Builder internal constructor() {

        private var accountId: String? = null
        private var query: String? = null
        private var cursor: String? = null
        private var from: OffsetDateTime? = null
        private var limit: Long? = null
        private var sort: Sort? = null
        private var subreddit: String? = null
        private var time: Time? = null
        private var to: OffsetDateTime? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(redditSearchParams: RedditSearchParams) = apply {
            accountId = redditSearchParams.accountId
            query = redditSearchParams.query
            cursor = redditSearchParams.cursor
            from = redditSearchParams.from
            limit = redditSearchParams.limit
            sort = redditSearchParams.sort
            subreddit = redditSearchParams.subreddit
            time = redditSearchParams.time
            to = redditSearchParams.to
            additionalHeaders = redditSearchParams.additionalHeaders.toBuilder()
            additionalQueryParams = redditSearchParams.additionalQueryParams.toBuilder()
        }

        /** Reddit account ID */
        fun accountId(accountId: String) = apply { this.accountId = accountId }

        /** Search query */
        fun query(query: String) = apply { this.query = query }

        /** Pagination cursor */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /** Alias for calling [Builder.cursor] with `cursor.orElse(null)`. */
        fun cursor(cursor: Optional<String>) = cursor(cursor.getOrNull())

        /** Filter: start date (ISO 8601) */
        fun from(from: OffsetDateTime?) = apply { this.from = from }

        /** Alias for calling [Builder.from] with `from.orElse(null)`. */
        fun from(from: Optional<OffsetDateTime>) = from(from.getOrNull())

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

        /** Sort order */
        fun sort(sort: Sort?) = apply { this.sort = sort }

        /** Alias for calling [Builder.sort] with `sort.orElse(null)`. */
        fun sort(sort: Optional<Sort>) = sort(sort.getOrNull())

        /** Limit to subreddit */
        fun subreddit(subreddit: String?) = apply { this.subreddit = subreddit }

        /** Alias for calling [Builder.subreddit] with `subreddit.orElse(null)`. */
        fun subreddit(subreddit: Optional<String>) = subreddit(subreddit.getOrNull())

        /** Time filter */
        fun time(time: Time?) = apply { this.time = time }

        /** Alias for calling [Builder.time] with `time.orElse(null)`. */
        fun time(time: Optional<Time>) = time(time.getOrNull())

        /** Filter: end date (ISO 8601) */
        fun to(to: OffsetDateTime?) = apply { this.to = to }

        /** Alias for calling [Builder.to] with `to.orElse(null)`. */
        fun to(to: Optional<OffsetDateTime>) = to(to.getOrNull())

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
         * Returns an immutable instance of [RedditSearchParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .query()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RedditSearchParams =
            RedditSearchParams(
                checkRequired("accountId", accountId),
                checkRequired("query", query),
                cursor,
                from,
                limit,
                sort,
                subreddit,
                time,
                to,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("account_id", accountId)
                put("query", query)
                cursor?.let { put("cursor", it) }
                from?.let { put("from", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                limit?.let { put("limit", it.toString()) }
                sort?.let { put("sort", it.toString()) }
                subreddit?.let { put("subreddit", it) }
                time?.let { put("time", it.toString()) }
                to?.let { put("to", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Sort order */
    class Sort @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val RELEVANCE = of("relevance")

            @JvmField val HOT = of("hot")

            @JvmField val TOP = of("top")

            @JvmField val NEW = of("new")

            @JvmField val COMMENTS = of("comments")

            @JvmStatic fun of(value: String) = Sort(JsonField.of(value))
        }

        /** An enum containing [Sort]'s known values. */
        enum class Known {
            RELEVANCE,
            HOT,
            TOP,
            NEW,
            COMMENTS,
        }

        /**
         * An enum containing [Sort]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Sort] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            RELEVANCE,
            HOT,
            TOP,
            NEW,
            COMMENTS,
            /** An enum member indicating that [Sort] was instantiated with an unknown value. */
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
                RELEVANCE -> Value.RELEVANCE
                HOT -> Value.HOT
                TOP -> Value.TOP
                NEW -> Value.NEW
                COMMENTS -> Value.COMMENTS
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
                RELEVANCE -> Known.RELEVANCE
                HOT -> Known.HOT
                TOP -> Known.TOP
                NEW -> Known.NEW
                COMMENTS -> Known.COMMENTS
                else -> throw RelayInvalidDataException("Unknown Sort: $value")
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

        fun validate(): Sort = apply {
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

            return other is Sort && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Time filter */
    class Time @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val HOUR = of("hour")

            @JvmField val DAY = of("day")

            @JvmField val WEEK = of("week")

            @JvmField val MONTH = of("month")

            @JvmField val YEAR = of("year")

            @JvmField val ALL = of("all")

            @JvmStatic fun of(value: String) = Time(JsonField.of(value))
        }

        /** An enum containing [Time]'s known values. */
        enum class Known {
            HOUR,
            DAY,
            WEEK,
            MONTH,
            YEAR,
            ALL,
        }

        /**
         * An enum containing [Time]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Time] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            HOUR,
            DAY,
            WEEK,
            MONTH,
            YEAR,
            ALL,
            /** An enum member indicating that [Time] was instantiated with an unknown value. */
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
                HOUR -> Value.HOUR
                DAY -> Value.DAY
                WEEK -> Value.WEEK
                MONTH -> Value.MONTH
                YEAR -> Value.YEAR
                ALL -> Value.ALL
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
                HOUR -> Known.HOUR
                DAY -> Known.DAY
                WEEK -> Known.WEEK
                MONTH -> Known.MONTH
                YEAR -> Known.YEAR
                ALL -> Known.ALL
                else -> throw RelayInvalidDataException("Unknown Time: $value")
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

        fun validate(): Time = apply {
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

            return other is Time && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RedditSearchParams &&
            accountId == other.accountId &&
            query == other.query &&
            cursor == other.cursor &&
            from == other.from &&
            limit == other.limit &&
            sort == other.sort &&
            subreddit == other.subreddit &&
            time == other.time &&
            to == other.to &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            accountId,
            query,
            cursor,
            from,
            limit,
            sort,
            subreddit,
            time,
            to,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "RedditSearchParams{accountId=$accountId, query=$query, cursor=$cursor, from=$from, limit=$limit, sort=$sort, subreddit=$subreddit, time=$time, to=$to, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
