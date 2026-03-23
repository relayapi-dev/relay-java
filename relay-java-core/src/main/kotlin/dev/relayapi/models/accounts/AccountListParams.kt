// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.accounts

import dev.relayapi.core.Params
import dev.relayapi.core.http.Headers
import dev.relayapi.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List connected accounts */
class AccountListParams
private constructor(
    private val cursor: String?,
    private val from: OffsetDateTime?,
    private val groupId: String?,
    private val limit: Long?,
    private val search: String?,
    private val to: OffsetDateTime?,
    private val ungrouped: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Pagination cursor */
    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    /** Filter: start date (ISO 8601) */
    fun from(): Optional<OffsetDateTime> = Optional.ofNullable(from)

    /** Filter by group ID */
    fun groupId(): Optional<String> = Optional.ofNullable(groupId)

    /** Number of items per page */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Search by name or username */
    fun search(): Optional<String> = Optional.ofNullable(search)

    /** Filter: end date (ISO 8601) */
    fun to(): Optional<OffsetDateTime> = Optional.ofNullable(to)

    /** Only show ungrouped accounts */
    fun ungrouped(): Optional<Boolean> = Optional.ofNullable(ungrouped)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): AccountListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [AccountListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountListParams]. */
    class Builder internal constructor() {

        private var cursor: String? = null
        private var from: OffsetDateTime? = null
        private var groupId: String? = null
        private var limit: Long? = null
        private var search: String? = null
        private var to: OffsetDateTime? = null
        private var ungrouped: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(accountListParams: AccountListParams) = apply {
            cursor = accountListParams.cursor
            from = accountListParams.from
            groupId = accountListParams.groupId
            limit = accountListParams.limit
            search = accountListParams.search
            to = accountListParams.to
            ungrouped = accountListParams.ungrouped
            additionalHeaders = accountListParams.additionalHeaders.toBuilder()
            additionalQueryParams = accountListParams.additionalQueryParams.toBuilder()
        }

        /** Pagination cursor */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /** Alias for calling [Builder.cursor] with `cursor.orElse(null)`. */
        fun cursor(cursor: Optional<String>) = cursor(cursor.getOrNull())

        /** Filter: start date (ISO 8601) */
        fun from(from: OffsetDateTime?) = apply { this.from = from }

        /** Alias for calling [Builder.from] with `from.orElse(null)`. */
        fun from(from: Optional<OffsetDateTime>) = from(from.getOrNull())

        /** Filter by group ID */
        fun groupId(groupId: String?) = apply { this.groupId = groupId }

        /** Alias for calling [Builder.groupId] with `groupId.orElse(null)`. */
        fun groupId(groupId: Optional<String>) = groupId(groupId.getOrNull())

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

        /** Search by name or username */
        fun search(search: String?) = apply { this.search = search }

        /** Alias for calling [Builder.search] with `search.orElse(null)`. */
        fun search(search: Optional<String>) = search(search.getOrNull())

        /** Filter: end date (ISO 8601) */
        fun to(to: OffsetDateTime?) = apply { this.to = to }

        /** Alias for calling [Builder.to] with `to.orElse(null)`. */
        fun to(to: Optional<OffsetDateTime>) = to(to.getOrNull())

        /** Only show ungrouped accounts */
        fun ungrouped(ungrouped: Boolean?) = apply { this.ungrouped = ungrouped }

        /**
         * Alias for [Builder.ungrouped].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun ungrouped(ungrouped: Boolean) = ungrouped(ungrouped as Boolean?)

        /** Alias for calling [Builder.ungrouped] with `ungrouped.orElse(null)`. */
        fun ungrouped(ungrouped: Optional<Boolean>) = ungrouped(ungrouped.getOrNull())

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
         * Returns an immutable instance of [AccountListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AccountListParams =
            AccountListParams(
                cursor,
                from,
                groupId,
                limit,
                search,
                to,
                ungrouped,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                cursor?.let { put("cursor", it) }
                from?.let { put("from", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                groupId?.let { put("group_id", it) }
                limit?.let { put("limit", it.toString()) }
                search?.let { put("search", it) }
                to?.let { put("to", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                ungrouped?.let { put("ungrouped", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountListParams &&
            cursor == other.cursor &&
            from == other.from &&
            groupId == other.groupId &&
            limit == other.limit &&
            search == other.search &&
            to == other.to &&
            ungrouped == other.ungrouped &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            cursor,
            from,
            groupId,
            limit,
            search,
            to,
            ungrouped,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "AccountListParams{cursor=$cursor, from=$from, groupId=$groupId, limit=$limit, search=$search, to=$to, ungrouped=$ungrouped, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
