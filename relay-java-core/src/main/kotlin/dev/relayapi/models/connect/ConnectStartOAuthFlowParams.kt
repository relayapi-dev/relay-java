// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.connect

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

/** Returns an auth_url to redirect the user for OAuth authorization. */
class ConnectStartOAuthFlowParams
private constructor(
    private val platform: Platform?,
    private val headless: String?,
    private val method: String?,
    private val redirectUrl: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** OAuth platform to connect */
    fun platform(): Optional<Platform> = Optional.ofNullable(platform)

    /** Set to "true" for headless mode (returns data instead of redirecting) */
    fun headless(): Optional<String> = Optional.ofNullable(headless)

    /** Auth method variant (e.g. "direct" for Instagram Login instead of Facebook Login) */
    fun method(): Optional<String> = Optional.ofNullable(method)

    /** URL to redirect after OAuth completes */
    fun redirectUrl(): Optional<String> = Optional.ofNullable(redirectUrl)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ConnectStartOAuthFlowParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [ConnectStartOAuthFlowParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConnectStartOAuthFlowParams]. */
    class Builder internal constructor() {

        private var platform: Platform? = null
        private var headless: String? = null
        private var method: String? = null
        private var redirectUrl: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(connectStartOAuthFlowParams: ConnectStartOAuthFlowParams) = apply {
            platform = connectStartOAuthFlowParams.platform
            headless = connectStartOAuthFlowParams.headless
            method = connectStartOAuthFlowParams.method
            redirectUrl = connectStartOAuthFlowParams.redirectUrl
            additionalHeaders = connectStartOAuthFlowParams.additionalHeaders.toBuilder()
            additionalQueryParams = connectStartOAuthFlowParams.additionalQueryParams.toBuilder()
        }

        /** OAuth platform to connect */
        fun platform(platform: Platform?) = apply { this.platform = platform }

        /** Alias for calling [Builder.platform] with `platform.orElse(null)`. */
        fun platform(platform: Optional<Platform>) = platform(platform.getOrNull())

        /** Set to "true" for headless mode (returns data instead of redirecting) */
        fun headless(headless: String?) = apply { this.headless = headless }

        /** Alias for calling [Builder.headless] with `headless.orElse(null)`. */
        fun headless(headless: Optional<String>) = headless(headless.getOrNull())

        /** Auth method variant (e.g. "direct" for Instagram Login instead of Facebook Login) */
        fun method(method: String?) = apply { this.method = method }

        /** Alias for calling [Builder.method] with `method.orElse(null)`. */
        fun method(method: Optional<String>) = method(method.getOrNull())

        /** URL to redirect after OAuth completes */
        fun redirectUrl(redirectUrl: String?) = apply { this.redirectUrl = redirectUrl }

        /** Alias for calling [Builder.redirectUrl] with `redirectUrl.orElse(null)`. */
        fun redirectUrl(redirectUrl: Optional<String>) = redirectUrl(redirectUrl.getOrNull())

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
         * Returns an immutable instance of [ConnectStartOAuthFlowParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ConnectStartOAuthFlowParams =
            ConnectStartOAuthFlowParams(
                platform,
                headless,
                method,
                redirectUrl,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> platform?.toString() ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                headless?.let { put("headless", it) }
                method?.let { put("method", it) }
                redirectUrl?.let { put("redirect_url", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /** OAuth platform to connect */
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

            @JvmField val THREADS = of("threads")

            @JvmField val SNAPCHAT = of("snapchat")

            @JvmField val GOOGLEBUSINESS = of("googlebusiness")

            @JvmField val MASTODON = of("mastodon")

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
            THREADS,
            SNAPCHAT,
            GOOGLEBUSINESS,
            MASTODON,
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
            THREADS,
            SNAPCHAT,
            GOOGLEBUSINESS,
            MASTODON,
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
                THREADS -> Value.THREADS
                SNAPCHAT -> Value.SNAPCHAT
                GOOGLEBUSINESS -> Value.GOOGLEBUSINESS
                MASTODON -> Value.MASTODON
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
                THREADS -> Known.THREADS
                SNAPCHAT -> Known.SNAPCHAT
                GOOGLEBUSINESS -> Known.GOOGLEBUSINESS
                MASTODON -> Known.MASTODON
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

        return other is ConnectStartOAuthFlowParams &&
            platform == other.platform &&
            headless == other.headless &&
            method == other.method &&
            redirectUrl == other.redirectUrl &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            platform,
            headless,
            method,
            redirectUrl,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ConnectStartOAuthFlowParams{platform=$platform, headless=$headless, method=$method, redirectUrl=$redirectUrl, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
