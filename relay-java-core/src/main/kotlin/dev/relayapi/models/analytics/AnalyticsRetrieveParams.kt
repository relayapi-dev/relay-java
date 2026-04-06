// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.analytics

import com.fasterxml.jackson.annotation.JsonCreator
import dev.relayapi.core.Enum
import dev.relayapi.core.JsonField
import dev.relayapi.core.Params
import dev.relayapi.core.http.Headers
import dev.relayapi.core.http.QueryParams
import dev.relayapi.errors.RelayInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get post analytics */
class AnalyticsRetrieveParams
private constructor(
    private val accountId: String?,
    private val fromDate: String?,
    private val limit: Long?,
    private val offset: Long?,
    private val platform: Platform?,
    private val postId: String?,
    private val toDate: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter by account ID */
    fun accountId(): Optional<String> = Optional.ofNullable(accountId)

    /** Start date (ISO 8601 date string) */
    fun fromDate(): Optional<String> = Optional.ofNullable(fromDate)

    /** Number of items */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Offset */
    fun offset(): Optional<Long> = Optional.ofNullable(offset)

    /** Filter by platform */
    fun platform(): Optional<Platform> = Optional.ofNullable(platform)

    /** Filter by post ID */
    fun postId(): Optional<String> = Optional.ofNullable(postId)

    /** End date (ISO 8601 date string) */
    fun toDate(): Optional<String> = Optional.ofNullable(toDate)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): AnalyticsRetrieveParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [AnalyticsRetrieveParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AnalyticsRetrieveParams]. */
    class Builder internal constructor() {

        private var accountId: String? = null
        private var fromDate: String? = null
        private var limit: Long? = null
        private var offset: Long? = null
        private var platform: Platform? = null
        private var postId: String? = null
        private var toDate: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(analyticsRetrieveParams: AnalyticsRetrieveParams) = apply {
            accountId = analyticsRetrieveParams.accountId
            fromDate = analyticsRetrieveParams.fromDate
            limit = analyticsRetrieveParams.limit
            offset = analyticsRetrieveParams.offset
            platform = analyticsRetrieveParams.platform
            postId = analyticsRetrieveParams.postId
            toDate = analyticsRetrieveParams.toDate
            additionalHeaders = analyticsRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = analyticsRetrieveParams.additionalQueryParams.toBuilder()
        }

        /** Filter by account ID */
        fun accountId(accountId: String?) = apply { this.accountId = accountId }

        /** Alias for calling [Builder.accountId] with `accountId.orElse(null)`. */
        fun accountId(accountId: Optional<String>) = accountId(accountId.getOrNull())

        /** Start date (ISO 8601 date string) */
        fun fromDate(fromDate: String?) = apply { this.fromDate = fromDate }

        /** Alias for calling [Builder.fromDate] with `fromDate.orElse(null)`. */
        fun fromDate(fromDate: Optional<String>) = fromDate(fromDate.getOrNull())

        /** Number of items */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /** Offset */
        fun offset(offset: Long?) = apply { this.offset = offset }

        /**
         * Alias for [Builder.offset].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun offset(offset: Long) = offset(offset as Long?)

        /** Alias for calling [Builder.offset] with `offset.orElse(null)`. */
        fun offset(offset: Optional<Long>) = offset(offset.getOrNull())

        /** Filter by platform */
        fun platform(platform: Platform?) = apply { this.platform = platform }

        /** Alias for calling [Builder.platform] with `platform.orElse(null)`. */
        fun platform(platform: Optional<Platform>) = platform(platform.getOrNull())

        /** Filter by post ID */
        fun postId(postId: String?) = apply { this.postId = postId }

        /** Alias for calling [Builder.postId] with `postId.orElse(null)`. */
        fun postId(postId: Optional<String>) = postId(postId.getOrNull())

        /** End date (ISO 8601 date string) */
        fun toDate(toDate: String?) = apply { this.toDate = toDate }

        /** Alias for calling [Builder.toDate] with `toDate.orElse(null)`. */
        fun toDate(toDate: Optional<String>) = toDate(toDate.getOrNull())

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
         * Returns an immutable instance of [AnalyticsRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AnalyticsRetrieveParams =
            AnalyticsRetrieveParams(
                accountId,
                fromDate,
                limit,
                offset,
                platform,
                postId,
                toDate,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                accountId?.let { put("account_id", it) }
                fromDate?.let { put("from_date", it) }
                limit?.let { put("limit", it.toString()) }
                offset?.let { put("offset", it.toString()) }
                platform?.let { put("platform", it.toString()) }
                postId?.let { put("post_id", it) }
                toDate?.let { put("to_date", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Filter by platform */
    class Platform @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
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
            /** An enum member indicating that [Platform] was instantiated with an unknown value. */
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws RelayInvalidDataException if this class instance's value is a not a known member.
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
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws RelayInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { RelayInvalidDataException("Value is not a String") }

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

        return other is AnalyticsRetrieveParams &&
            accountId == other.accountId &&
            fromDate == other.fromDate &&
            limit == other.limit &&
            offset == other.offset &&
            platform == other.platform &&
            postId == other.postId &&
            toDate == other.toDate &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            accountId,
            fromDate,
            limit,
            offset,
            platform,
            postId,
            toDate,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "AnalyticsRetrieveParams{accountId=$accountId, fromDate=$fromDate, limit=$limit, offset=$offset, platform=$platform, postId=$postId, toDate=$toDate, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
