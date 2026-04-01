// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.tools.validate

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.relayapi.core.ExcludeMissing
import dev.relayapi.core.JsonField
import dev.relayapi.core.JsonMissing
import dev.relayapi.core.JsonValue
import dev.relayapi.core.checkRequired
import dev.relayapi.errors.RelayInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ValidateValidateMediaResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accessible: JsonField<Boolean>,
    private val platformLimits: JsonField<PlatformLimits>,
    private val contentType: JsonField<String>,
    private val size: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("accessible")
        @ExcludeMissing
        accessible: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("platform_limits")
        @ExcludeMissing
        platformLimits: JsonField<PlatformLimits> = JsonMissing.of(),
        @JsonProperty("content_type")
        @ExcludeMissing
        contentType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("size") @ExcludeMissing size: JsonField<Double> = JsonMissing.of(),
    ) : this(accessible, platformLimits, contentType, size, mutableMapOf())

    /**
     * Whether the URL is accessible
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accessible(): Boolean = accessible.getRequired("accessible")

    /**
     * Per-platform size limits
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun platformLimits(): PlatformLimits = platformLimits.getRequired("platform_limits")

    /**
     * MIME type
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contentType(): Optional<String> = contentType.getOptional("content_type")

    /**
     * File size in bytes
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun size(): Optional<Double> = size.getOptional("size")

    /**
     * Returns the raw JSON value of [accessible].
     *
     * Unlike [accessible], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accessible") @ExcludeMissing fun _accessible(): JsonField<Boolean> = accessible

    /**
     * Returns the raw JSON value of [platformLimits].
     *
     * Unlike [platformLimits], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("platform_limits")
    @ExcludeMissing
    fun _platformLimits(): JsonField<PlatformLimits> = platformLimits

    /**
     * Returns the raw JSON value of [contentType].
     *
     * Unlike [contentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("content_type")
    @ExcludeMissing
    fun _contentType(): JsonField<String> = contentType

    /**
     * Returns the raw JSON value of [size].
     *
     * Unlike [size], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("size") @ExcludeMissing fun _size(): JsonField<Double> = size

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
         * Returns a mutable builder for constructing an instance of
         * [ValidateValidateMediaResponse].
         *
         * The following fields are required:
         * ```java
         * .accessible()
         * .platformLimits()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ValidateValidateMediaResponse]. */
    class Builder internal constructor() {

        private var accessible: JsonField<Boolean>? = null
        private var platformLimits: JsonField<PlatformLimits>? = null
        private var contentType: JsonField<String> = JsonMissing.of()
        private var size: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(validateValidateMediaResponse: ValidateValidateMediaResponse) = apply {
            accessible = validateValidateMediaResponse.accessible
            platformLimits = validateValidateMediaResponse.platformLimits
            contentType = validateValidateMediaResponse.contentType
            size = validateValidateMediaResponse.size
            additionalProperties = validateValidateMediaResponse.additionalProperties.toMutableMap()
        }

        /** Whether the URL is accessible */
        fun accessible(accessible: Boolean) = accessible(JsonField.of(accessible))

        /**
         * Sets [Builder.accessible] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accessible] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accessible(accessible: JsonField<Boolean>) = apply { this.accessible = accessible }

        /** Per-platform size limits */
        fun platformLimits(platformLimits: PlatformLimits) =
            platformLimits(JsonField.of(platformLimits))

        /**
         * Sets [Builder.platformLimits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.platformLimits] with a well-typed [PlatformLimits] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun platformLimits(platformLimits: JsonField<PlatformLimits>) = apply {
            this.platformLimits = platformLimits
        }

        /** MIME type */
        fun contentType(contentType: String?) = contentType(JsonField.ofNullable(contentType))

        /** Alias for calling [Builder.contentType] with `contentType.orElse(null)`. */
        fun contentType(contentType: Optional<String>) = contentType(contentType.getOrNull())

        /**
         * Sets [Builder.contentType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contentType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contentType(contentType: JsonField<String>) = apply { this.contentType = contentType }

        /** File size in bytes */
        fun size(size: Double?) = size(JsonField.ofNullable(size))

        /**
         * Alias for [Builder.size].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun size(size: Double) = size(size as Double?)

        /** Alias for calling [Builder.size] with `size.orElse(null)`. */
        fun size(size: Optional<Double>) = size(size.getOrNull())

        /**
         * Sets [Builder.size] to an arbitrary JSON value.
         *
         * You should usually call [Builder.size] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun size(size: JsonField<Double>) = apply { this.size = size }

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
         * Returns an immutable instance of [ValidateValidateMediaResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accessible()
         * .platformLimits()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ValidateValidateMediaResponse =
            ValidateValidateMediaResponse(
                checkRequired("accessible", accessible),
                checkRequired("platformLimits", platformLimits),
                contentType,
                size,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ValidateValidateMediaResponse = apply {
        if (validated) {
            return@apply
        }

        accessible()
        platformLimits().validate()
        contentType()
        size()
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
        (if (accessible.asKnown().isPresent) 1 else 0) +
            (platformLimits.asKnown().getOrNull()?.validity() ?: 0) +
            (if (contentType.asKnown().isPresent) 1 else 0) +
            (if (size.asKnown().isPresent) 1 else 0)

    /** Per-platform size limits */
    class PlatformLimits
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val bluesky: JsonField<Bluesky>,
        private val discord: JsonField<Discord>,
        private val facebook: JsonField<Facebook>,
        private val googlebusiness: JsonField<Googlebusiness>,
        private val instagram: JsonField<Instagram>,
        private val linkedin: JsonField<Linkedin>,
        private val mastodon: JsonField<Mastodon>,
        private val pinterest: JsonField<Pinterest>,
        private val reddit: JsonField<Reddit>,
        private val sms: JsonField<Sms>,
        private val snapchat: JsonField<Snapchat>,
        private val telegram: JsonField<Telegram>,
        private val threads: JsonField<Threads>,
        private val tiktok: JsonField<Tiktok>,
        private val twitter: JsonField<Twitter>,
        private val whatsapp: JsonField<Whatsapp>,
        private val youtube: JsonField<Youtube>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("bluesky") @ExcludeMissing bluesky: JsonField<Bluesky> = JsonMissing.of(),
            @JsonProperty("discord") @ExcludeMissing discord: JsonField<Discord> = JsonMissing.of(),
            @JsonProperty("facebook")
            @ExcludeMissing
            facebook: JsonField<Facebook> = JsonMissing.of(),
            @JsonProperty("googlebusiness")
            @ExcludeMissing
            googlebusiness: JsonField<Googlebusiness> = JsonMissing.of(),
            @JsonProperty("instagram")
            @ExcludeMissing
            instagram: JsonField<Instagram> = JsonMissing.of(),
            @JsonProperty("linkedin")
            @ExcludeMissing
            linkedin: JsonField<Linkedin> = JsonMissing.of(),
            @JsonProperty("mastodon")
            @ExcludeMissing
            mastodon: JsonField<Mastodon> = JsonMissing.of(),
            @JsonProperty("pinterest")
            @ExcludeMissing
            pinterest: JsonField<Pinterest> = JsonMissing.of(),
            @JsonProperty("reddit") @ExcludeMissing reddit: JsonField<Reddit> = JsonMissing.of(),
            @JsonProperty("sms") @ExcludeMissing sms: JsonField<Sms> = JsonMissing.of(),
            @JsonProperty("snapchat")
            @ExcludeMissing
            snapchat: JsonField<Snapchat> = JsonMissing.of(),
            @JsonProperty("telegram")
            @ExcludeMissing
            telegram: JsonField<Telegram> = JsonMissing.of(),
            @JsonProperty("threads") @ExcludeMissing threads: JsonField<Threads> = JsonMissing.of(),
            @JsonProperty("tiktok") @ExcludeMissing tiktok: JsonField<Tiktok> = JsonMissing.of(),
            @JsonProperty("twitter") @ExcludeMissing twitter: JsonField<Twitter> = JsonMissing.of(),
            @JsonProperty("whatsapp")
            @ExcludeMissing
            whatsapp: JsonField<Whatsapp> = JsonMissing.of(),
            @JsonProperty("youtube") @ExcludeMissing youtube: JsonField<Youtube> = JsonMissing.of(),
        ) : this(
            bluesky,
            discord,
            facebook,
            googlebusiness,
            instagram,
            linkedin,
            mastodon,
            pinterest,
            reddit,
            sms,
            snapchat,
            telegram,
            threads,
            tiktok,
            twitter,
            whatsapp,
            youtube,
            mutableMapOf(),
        )

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun bluesky(): Optional<Bluesky> = bluesky.getOptional("bluesky")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun discord(): Optional<Discord> = discord.getOptional("discord")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun facebook(): Optional<Facebook> = facebook.getOptional("facebook")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun googlebusiness(): Optional<Googlebusiness> =
            googlebusiness.getOptional("googlebusiness")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun instagram(): Optional<Instagram> = instagram.getOptional("instagram")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun linkedin(): Optional<Linkedin> = linkedin.getOptional("linkedin")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mastodon(): Optional<Mastodon> = mastodon.getOptional("mastodon")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pinterest(): Optional<Pinterest> = pinterest.getOptional("pinterest")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun reddit(): Optional<Reddit> = reddit.getOptional("reddit")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sms(): Optional<Sms> = sms.getOptional("sms")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun snapchat(): Optional<Snapchat> = snapchat.getOptional("snapchat")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun telegram(): Optional<Telegram> = telegram.getOptional("telegram")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun threads(): Optional<Threads> = threads.getOptional("threads")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tiktok(): Optional<Tiktok> = tiktok.getOptional("tiktok")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun twitter(): Optional<Twitter> = twitter.getOptional("twitter")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun whatsapp(): Optional<Whatsapp> = whatsapp.getOptional("whatsapp")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun youtube(): Optional<Youtube> = youtube.getOptional("youtube")

        /**
         * Returns the raw JSON value of [bluesky].
         *
         * Unlike [bluesky], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bluesky") @ExcludeMissing fun _bluesky(): JsonField<Bluesky> = bluesky

        /**
         * Returns the raw JSON value of [discord].
         *
         * Unlike [discord], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("discord") @ExcludeMissing fun _discord(): JsonField<Discord> = discord

        /**
         * Returns the raw JSON value of [facebook].
         *
         * Unlike [facebook], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("facebook") @ExcludeMissing fun _facebook(): JsonField<Facebook> = facebook

        /**
         * Returns the raw JSON value of [googlebusiness].
         *
         * Unlike [googlebusiness], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("googlebusiness")
        @ExcludeMissing
        fun _googlebusiness(): JsonField<Googlebusiness> = googlebusiness

        /**
         * Returns the raw JSON value of [instagram].
         *
         * Unlike [instagram], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("instagram")
        @ExcludeMissing
        fun _instagram(): JsonField<Instagram> = instagram

        /**
         * Returns the raw JSON value of [linkedin].
         *
         * Unlike [linkedin], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("linkedin") @ExcludeMissing fun _linkedin(): JsonField<Linkedin> = linkedin

        /**
         * Returns the raw JSON value of [mastodon].
         *
         * Unlike [mastodon], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mastodon") @ExcludeMissing fun _mastodon(): JsonField<Mastodon> = mastodon

        /**
         * Returns the raw JSON value of [pinterest].
         *
         * Unlike [pinterest], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pinterest")
        @ExcludeMissing
        fun _pinterest(): JsonField<Pinterest> = pinterest

        /**
         * Returns the raw JSON value of [reddit].
         *
         * Unlike [reddit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reddit") @ExcludeMissing fun _reddit(): JsonField<Reddit> = reddit

        /**
         * Returns the raw JSON value of [sms].
         *
         * Unlike [sms], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sms") @ExcludeMissing fun _sms(): JsonField<Sms> = sms

        /**
         * Returns the raw JSON value of [snapchat].
         *
         * Unlike [snapchat], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("snapchat") @ExcludeMissing fun _snapchat(): JsonField<Snapchat> = snapchat

        /**
         * Returns the raw JSON value of [telegram].
         *
         * Unlike [telegram], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("telegram") @ExcludeMissing fun _telegram(): JsonField<Telegram> = telegram

        /**
         * Returns the raw JSON value of [threads].
         *
         * Unlike [threads], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("threads") @ExcludeMissing fun _threads(): JsonField<Threads> = threads

        /**
         * Returns the raw JSON value of [tiktok].
         *
         * Unlike [tiktok], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tiktok") @ExcludeMissing fun _tiktok(): JsonField<Tiktok> = tiktok

        /**
         * Returns the raw JSON value of [twitter].
         *
         * Unlike [twitter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("twitter") @ExcludeMissing fun _twitter(): JsonField<Twitter> = twitter

        /**
         * Returns the raw JSON value of [whatsapp].
         *
         * Unlike [whatsapp], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("whatsapp") @ExcludeMissing fun _whatsapp(): JsonField<Whatsapp> = whatsapp

        /**
         * Returns the raw JSON value of [youtube].
         *
         * Unlike [youtube], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("youtube") @ExcludeMissing fun _youtube(): JsonField<Youtube> = youtube

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

            /** Returns a mutable builder for constructing an instance of [PlatformLimits]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PlatformLimits]. */
        class Builder internal constructor() {

            private var bluesky: JsonField<Bluesky> = JsonMissing.of()
            private var discord: JsonField<Discord> = JsonMissing.of()
            private var facebook: JsonField<Facebook> = JsonMissing.of()
            private var googlebusiness: JsonField<Googlebusiness> = JsonMissing.of()
            private var instagram: JsonField<Instagram> = JsonMissing.of()
            private var linkedin: JsonField<Linkedin> = JsonMissing.of()
            private var mastodon: JsonField<Mastodon> = JsonMissing.of()
            private var pinterest: JsonField<Pinterest> = JsonMissing.of()
            private var reddit: JsonField<Reddit> = JsonMissing.of()
            private var sms: JsonField<Sms> = JsonMissing.of()
            private var snapchat: JsonField<Snapchat> = JsonMissing.of()
            private var telegram: JsonField<Telegram> = JsonMissing.of()
            private var threads: JsonField<Threads> = JsonMissing.of()
            private var tiktok: JsonField<Tiktok> = JsonMissing.of()
            private var twitter: JsonField<Twitter> = JsonMissing.of()
            private var whatsapp: JsonField<Whatsapp> = JsonMissing.of()
            private var youtube: JsonField<Youtube> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(platformLimits: PlatformLimits) = apply {
                bluesky = platformLimits.bluesky
                discord = platformLimits.discord
                facebook = platformLimits.facebook
                googlebusiness = platformLimits.googlebusiness
                instagram = platformLimits.instagram
                linkedin = platformLimits.linkedin
                mastodon = platformLimits.mastodon
                pinterest = platformLimits.pinterest
                reddit = platformLimits.reddit
                sms = platformLimits.sms
                snapchat = platformLimits.snapchat
                telegram = platformLimits.telegram
                threads = platformLimits.threads
                tiktok = platformLimits.tiktok
                twitter = platformLimits.twitter
                whatsapp = platformLimits.whatsapp
                youtube = platformLimits.youtube
                additionalProperties = platformLimits.additionalProperties.toMutableMap()
            }

            fun bluesky(bluesky: Bluesky) = bluesky(JsonField.of(bluesky))

            /**
             * Sets [Builder.bluesky] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bluesky] with a well-typed [Bluesky] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bluesky(bluesky: JsonField<Bluesky>) = apply { this.bluesky = bluesky }

            fun discord(discord: Discord) = discord(JsonField.of(discord))

            /**
             * Sets [Builder.discord] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discord] with a well-typed [Discord] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun discord(discord: JsonField<Discord>) = apply { this.discord = discord }

            fun facebook(facebook: Facebook) = facebook(JsonField.of(facebook))

            /**
             * Sets [Builder.facebook] to an arbitrary JSON value.
             *
             * You should usually call [Builder.facebook] with a well-typed [Facebook] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun facebook(facebook: JsonField<Facebook>) = apply { this.facebook = facebook }

            fun googlebusiness(googlebusiness: Googlebusiness) =
                googlebusiness(JsonField.of(googlebusiness))

            /**
             * Sets [Builder.googlebusiness] to an arbitrary JSON value.
             *
             * You should usually call [Builder.googlebusiness] with a well-typed [Googlebusiness]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun googlebusiness(googlebusiness: JsonField<Googlebusiness>) = apply {
                this.googlebusiness = googlebusiness
            }

            fun instagram(instagram: Instagram) = instagram(JsonField.of(instagram))

            /**
             * Sets [Builder.instagram] to an arbitrary JSON value.
             *
             * You should usually call [Builder.instagram] with a well-typed [Instagram] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun instagram(instagram: JsonField<Instagram>) = apply { this.instagram = instagram }

            fun linkedin(linkedin: Linkedin) = linkedin(JsonField.of(linkedin))

            /**
             * Sets [Builder.linkedin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.linkedin] with a well-typed [Linkedin] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun linkedin(linkedin: JsonField<Linkedin>) = apply { this.linkedin = linkedin }

            fun mastodon(mastodon: Mastodon) = mastodon(JsonField.of(mastodon))

            /**
             * Sets [Builder.mastodon] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mastodon] with a well-typed [Mastodon] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mastodon(mastodon: JsonField<Mastodon>) = apply { this.mastodon = mastodon }

            fun pinterest(pinterest: Pinterest) = pinterest(JsonField.of(pinterest))

            /**
             * Sets [Builder.pinterest] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pinterest] with a well-typed [Pinterest] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pinterest(pinterest: JsonField<Pinterest>) = apply { this.pinterest = pinterest }

            fun reddit(reddit: Reddit) = reddit(JsonField.of(reddit))

            /**
             * Sets [Builder.reddit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reddit] with a well-typed [Reddit] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reddit(reddit: JsonField<Reddit>) = apply { this.reddit = reddit }

            fun sms(sms: Sms) = sms(JsonField.of(sms))

            /**
             * Sets [Builder.sms] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sms] with a well-typed [Sms] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun sms(sms: JsonField<Sms>) = apply { this.sms = sms }

            fun snapchat(snapchat: Snapchat) = snapchat(JsonField.of(snapchat))

            /**
             * Sets [Builder.snapchat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.snapchat] with a well-typed [Snapchat] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun snapchat(snapchat: JsonField<Snapchat>) = apply { this.snapchat = snapchat }

            fun telegram(telegram: Telegram) = telegram(JsonField.of(telegram))

            /**
             * Sets [Builder.telegram] to an arbitrary JSON value.
             *
             * You should usually call [Builder.telegram] with a well-typed [Telegram] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun telegram(telegram: JsonField<Telegram>) = apply { this.telegram = telegram }

            fun threads(threads: Threads) = threads(JsonField.of(threads))

            /**
             * Sets [Builder.threads] to an arbitrary JSON value.
             *
             * You should usually call [Builder.threads] with a well-typed [Threads] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun threads(threads: JsonField<Threads>) = apply { this.threads = threads }

            fun tiktok(tiktok: Tiktok) = tiktok(JsonField.of(tiktok))

            /**
             * Sets [Builder.tiktok] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tiktok] with a well-typed [Tiktok] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tiktok(tiktok: JsonField<Tiktok>) = apply { this.tiktok = tiktok }

            fun twitter(twitter: Twitter) = twitter(JsonField.of(twitter))

            /**
             * Sets [Builder.twitter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.twitter] with a well-typed [Twitter] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun twitter(twitter: JsonField<Twitter>) = apply { this.twitter = twitter }

            fun whatsapp(whatsapp: Whatsapp) = whatsapp(JsonField.of(whatsapp))

            /**
             * Sets [Builder.whatsapp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.whatsapp] with a well-typed [Whatsapp] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun whatsapp(whatsapp: JsonField<Whatsapp>) = apply { this.whatsapp = whatsapp }

            fun youtube(youtube: Youtube) = youtube(JsonField.of(youtube))

            /**
             * Sets [Builder.youtube] to an arbitrary JSON value.
             *
             * You should usually call [Builder.youtube] with a well-typed [Youtube] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun youtube(youtube: JsonField<Youtube>) = apply { this.youtube = youtube }

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
             * Returns an immutable instance of [PlatformLimits].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PlatformLimits =
                PlatformLimits(
                    bluesky,
                    discord,
                    facebook,
                    googlebusiness,
                    instagram,
                    linkedin,
                    mastodon,
                    pinterest,
                    reddit,
                    sms,
                    snapchat,
                    telegram,
                    threads,
                    tiktok,
                    twitter,
                    whatsapp,
                    youtube,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PlatformLimits = apply {
            if (validated) {
                return@apply
            }

            bluesky().ifPresent { it.validate() }
            discord().ifPresent { it.validate() }
            facebook().ifPresent { it.validate() }
            googlebusiness().ifPresent { it.validate() }
            instagram().ifPresent { it.validate() }
            linkedin().ifPresent { it.validate() }
            mastodon().ifPresent { it.validate() }
            pinterest().ifPresent { it.validate() }
            reddit().ifPresent { it.validate() }
            sms().ifPresent { it.validate() }
            snapchat().ifPresent { it.validate() }
            telegram().ifPresent { it.validate() }
            threads().ifPresent { it.validate() }
            tiktok().ifPresent { it.validate() }
            twitter().ifPresent { it.validate() }
            whatsapp().ifPresent { it.validate() }
            youtube().ifPresent { it.validate() }
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
            (bluesky.asKnown().getOrNull()?.validity() ?: 0) +
                (discord.asKnown().getOrNull()?.validity() ?: 0) +
                (facebook.asKnown().getOrNull()?.validity() ?: 0) +
                (googlebusiness.asKnown().getOrNull()?.validity() ?: 0) +
                (instagram.asKnown().getOrNull()?.validity() ?: 0) +
                (linkedin.asKnown().getOrNull()?.validity() ?: 0) +
                (mastodon.asKnown().getOrNull()?.validity() ?: 0) +
                (pinterest.asKnown().getOrNull()?.validity() ?: 0) +
                (reddit.asKnown().getOrNull()?.validity() ?: 0) +
                (sms.asKnown().getOrNull()?.validity() ?: 0) +
                (snapchat.asKnown().getOrNull()?.validity() ?: 0) +
                (telegram.asKnown().getOrNull()?.validity() ?: 0) +
                (threads.asKnown().getOrNull()?.validity() ?: 0) +
                (tiktok.asKnown().getOrNull()?.validity() ?: 0) +
                (twitter.asKnown().getOrNull()?.validity() ?: 0) +
                (whatsapp.asKnown().getOrNull()?.validity() ?: 0) +
                (youtube.asKnown().getOrNull()?.validity() ?: 0)

        class Bluesky
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val maxSize: JsonField<Double>,
            private val withinLimit: JsonField<Boolean>,
            private val mimeTypeSupported: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("max_size")
                @ExcludeMissing
                maxSize: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("within_limit")
                @ExcludeMissing
                withinLimit: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("mime_type_supported")
                @ExcludeMissing
                mimeTypeSupported: JsonField<Boolean> = JsonMissing.of(),
            ) : this(maxSize, withinLimit, mimeTypeSupported, mutableMapOf())

            /**
             * Maximum file size in bytes
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun maxSize(): Double = maxSize.getRequired("max_size")

            /**
             * Whether file size is within limit
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun withinLimit(): Boolean = withinLimit.getRequired("within_limit")

            /**
             * Whether the MIME type is supported by this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun mimeTypeSupported(): Optional<Boolean> =
                mimeTypeSupported.getOptional("mime_type_supported")

            /**
             * Returns the raw JSON value of [maxSize].
             *
             * Unlike [maxSize], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("max_size") @ExcludeMissing fun _maxSize(): JsonField<Double> = maxSize

            /**
             * Returns the raw JSON value of [withinLimit].
             *
             * Unlike [withinLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("within_limit")
            @ExcludeMissing
            fun _withinLimit(): JsonField<Boolean> = withinLimit

            /**
             * Returns the raw JSON value of [mimeTypeSupported].
             *
             * Unlike [mimeTypeSupported], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("mime_type_supported")
            @ExcludeMissing
            fun _mimeTypeSupported(): JsonField<Boolean> = mimeTypeSupported

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
                 * Returns a mutable builder for constructing an instance of [Bluesky].
                 *
                 * The following fields are required:
                 * ```java
                 * .maxSize()
                 * .withinLimit()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Bluesky]. */
            class Builder internal constructor() {

                private var maxSize: JsonField<Double>? = null
                private var withinLimit: JsonField<Boolean>? = null
                private var mimeTypeSupported: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(bluesky: Bluesky) = apply {
                    maxSize = bluesky.maxSize
                    withinLimit = bluesky.withinLimit
                    mimeTypeSupported = bluesky.mimeTypeSupported
                    additionalProperties = bluesky.additionalProperties.toMutableMap()
                }

                /** Maximum file size in bytes */
                fun maxSize(maxSize: Double) = maxSize(JsonField.of(maxSize))

                /**
                 * Sets [Builder.maxSize] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxSize] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun maxSize(maxSize: JsonField<Double>) = apply { this.maxSize = maxSize }

                /** Whether file size is within limit */
                fun withinLimit(withinLimit: Boolean) = withinLimit(JsonField.of(withinLimit))

                /**
                 * Sets [Builder.withinLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.withinLimit] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun withinLimit(withinLimit: JsonField<Boolean>) = apply {
                    this.withinLimit = withinLimit
                }

                /** Whether the MIME type is supported by this platform */
                fun mimeTypeSupported(mimeTypeSupported: Boolean) =
                    mimeTypeSupported(JsonField.of(mimeTypeSupported))

                /**
                 * Sets [Builder.mimeTypeSupported] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mimeTypeSupported] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun mimeTypeSupported(mimeTypeSupported: JsonField<Boolean>) = apply {
                    this.mimeTypeSupported = mimeTypeSupported
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
                 * Returns an immutable instance of [Bluesky].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .maxSize()
                 * .withinLimit()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Bluesky =
                    Bluesky(
                        checkRequired("maxSize", maxSize),
                        checkRequired("withinLimit", withinLimit),
                        mimeTypeSupported,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Bluesky = apply {
                if (validated) {
                    return@apply
                }

                maxSize()
                withinLimit()
                mimeTypeSupported()
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
                (if (maxSize.asKnown().isPresent) 1 else 0) +
                    (if (withinLimit.asKnown().isPresent) 1 else 0) +
                    (if (mimeTypeSupported.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Bluesky &&
                    maxSize == other.maxSize &&
                    withinLimit == other.withinLimit &&
                    mimeTypeSupported == other.mimeTypeSupported &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(maxSize, withinLimit, mimeTypeSupported, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Bluesky{maxSize=$maxSize, withinLimit=$withinLimit, mimeTypeSupported=$mimeTypeSupported, additionalProperties=$additionalProperties}"
        }

        class Discord
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val maxSize: JsonField<Double>,
            private val withinLimit: JsonField<Boolean>,
            private val mimeTypeSupported: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("max_size")
                @ExcludeMissing
                maxSize: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("within_limit")
                @ExcludeMissing
                withinLimit: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("mime_type_supported")
                @ExcludeMissing
                mimeTypeSupported: JsonField<Boolean> = JsonMissing.of(),
            ) : this(maxSize, withinLimit, mimeTypeSupported, mutableMapOf())

            /**
             * Maximum file size in bytes
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun maxSize(): Double = maxSize.getRequired("max_size")

            /**
             * Whether file size is within limit
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun withinLimit(): Boolean = withinLimit.getRequired("within_limit")

            /**
             * Whether the MIME type is supported by this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun mimeTypeSupported(): Optional<Boolean> =
                mimeTypeSupported.getOptional("mime_type_supported")

            /**
             * Returns the raw JSON value of [maxSize].
             *
             * Unlike [maxSize], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("max_size") @ExcludeMissing fun _maxSize(): JsonField<Double> = maxSize

            /**
             * Returns the raw JSON value of [withinLimit].
             *
             * Unlike [withinLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("within_limit")
            @ExcludeMissing
            fun _withinLimit(): JsonField<Boolean> = withinLimit

            /**
             * Returns the raw JSON value of [mimeTypeSupported].
             *
             * Unlike [mimeTypeSupported], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("mime_type_supported")
            @ExcludeMissing
            fun _mimeTypeSupported(): JsonField<Boolean> = mimeTypeSupported

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
                 * Returns a mutable builder for constructing an instance of [Discord].
                 *
                 * The following fields are required:
                 * ```java
                 * .maxSize()
                 * .withinLimit()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Discord]. */
            class Builder internal constructor() {

                private var maxSize: JsonField<Double>? = null
                private var withinLimit: JsonField<Boolean>? = null
                private var mimeTypeSupported: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(discord: Discord) = apply {
                    maxSize = discord.maxSize
                    withinLimit = discord.withinLimit
                    mimeTypeSupported = discord.mimeTypeSupported
                    additionalProperties = discord.additionalProperties.toMutableMap()
                }

                /** Maximum file size in bytes */
                fun maxSize(maxSize: Double) = maxSize(JsonField.of(maxSize))

                /**
                 * Sets [Builder.maxSize] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxSize] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun maxSize(maxSize: JsonField<Double>) = apply { this.maxSize = maxSize }

                /** Whether file size is within limit */
                fun withinLimit(withinLimit: Boolean) = withinLimit(JsonField.of(withinLimit))

                /**
                 * Sets [Builder.withinLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.withinLimit] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun withinLimit(withinLimit: JsonField<Boolean>) = apply {
                    this.withinLimit = withinLimit
                }

                /** Whether the MIME type is supported by this platform */
                fun mimeTypeSupported(mimeTypeSupported: Boolean) =
                    mimeTypeSupported(JsonField.of(mimeTypeSupported))

                /**
                 * Sets [Builder.mimeTypeSupported] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mimeTypeSupported] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun mimeTypeSupported(mimeTypeSupported: JsonField<Boolean>) = apply {
                    this.mimeTypeSupported = mimeTypeSupported
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
                 * Returns an immutable instance of [Discord].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .maxSize()
                 * .withinLimit()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Discord =
                    Discord(
                        checkRequired("maxSize", maxSize),
                        checkRequired("withinLimit", withinLimit),
                        mimeTypeSupported,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Discord = apply {
                if (validated) {
                    return@apply
                }

                maxSize()
                withinLimit()
                mimeTypeSupported()
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
                (if (maxSize.asKnown().isPresent) 1 else 0) +
                    (if (withinLimit.asKnown().isPresent) 1 else 0) +
                    (if (mimeTypeSupported.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Discord &&
                    maxSize == other.maxSize &&
                    withinLimit == other.withinLimit &&
                    mimeTypeSupported == other.mimeTypeSupported &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(maxSize, withinLimit, mimeTypeSupported, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Discord{maxSize=$maxSize, withinLimit=$withinLimit, mimeTypeSupported=$mimeTypeSupported, additionalProperties=$additionalProperties}"
        }

        class Facebook
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val maxSize: JsonField<Double>,
            private val withinLimit: JsonField<Boolean>,
            private val mimeTypeSupported: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("max_size")
                @ExcludeMissing
                maxSize: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("within_limit")
                @ExcludeMissing
                withinLimit: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("mime_type_supported")
                @ExcludeMissing
                mimeTypeSupported: JsonField<Boolean> = JsonMissing.of(),
            ) : this(maxSize, withinLimit, mimeTypeSupported, mutableMapOf())

            /**
             * Maximum file size in bytes
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun maxSize(): Double = maxSize.getRequired("max_size")

            /**
             * Whether file size is within limit
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun withinLimit(): Boolean = withinLimit.getRequired("within_limit")

            /**
             * Whether the MIME type is supported by this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun mimeTypeSupported(): Optional<Boolean> =
                mimeTypeSupported.getOptional("mime_type_supported")

            /**
             * Returns the raw JSON value of [maxSize].
             *
             * Unlike [maxSize], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("max_size") @ExcludeMissing fun _maxSize(): JsonField<Double> = maxSize

            /**
             * Returns the raw JSON value of [withinLimit].
             *
             * Unlike [withinLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("within_limit")
            @ExcludeMissing
            fun _withinLimit(): JsonField<Boolean> = withinLimit

            /**
             * Returns the raw JSON value of [mimeTypeSupported].
             *
             * Unlike [mimeTypeSupported], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("mime_type_supported")
            @ExcludeMissing
            fun _mimeTypeSupported(): JsonField<Boolean> = mimeTypeSupported

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
                 * Returns a mutable builder for constructing an instance of [Facebook].
                 *
                 * The following fields are required:
                 * ```java
                 * .maxSize()
                 * .withinLimit()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Facebook]. */
            class Builder internal constructor() {

                private var maxSize: JsonField<Double>? = null
                private var withinLimit: JsonField<Boolean>? = null
                private var mimeTypeSupported: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(facebook: Facebook) = apply {
                    maxSize = facebook.maxSize
                    withinLimit = facebook.withinLimit
                    mimeTypeSupported = facebook.mimeTypeSupported
                    additionalProperties = facebook.additionalProperties.toMutableMap()
                }

                /** Maximum file size in bytes */
                fun maxSize(maxSize: Double) = maxSize(JsonField.of(maxSize))

                /**
                 * Sets [Builder.maxSize] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxSize] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun maxSize(maxSize: JsonField<Double>) = apply { this.maxSize = maxSize }

                /** Whether file size is within limit */
                fun withinLimit(withinLimit: Boolean) = withinLimit(JsonField.of(withinLimit))

                /**
                 * Sets [Builder.withinLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.withinLimit] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun withinLimit(withinLimit: JsonField<Boolean>) = apply {
                    this.withinLimit = withinLimit
                }

                /** Whether the MIME type is supported by this platform */
                fun mimeTypeSupported(mimeTypeSupported: Boolean) =
                    mimeTypeSupported(JsonField.of(mimeTypeSupported))

                /**
                 * Sets [Builder.mimeTypeSupported] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mimeTypeSupported] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun mimeTypeSupported(mimeTypeSupported: JsonField<Boolean>) = apply {
                    this.mimeTypeSupported = mimeTypeSupported
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
                 * Returns an immutable instance of [Facebook].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .maxSize()
                 * .withinLimit()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Facebook =
                    Facebook(
                        checkRequired("maxSize", maxSize),
                        checkRequired("withinLimit", withinLimit),
                        mimeTypeSupported,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Facebook = apply {
                if (validated) {
                    return@apply
                }

                maxSize()
                withinLimit()
                mimeTypeSupported()
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
                (if (maxSize.asKnown().isPresent) 1 else 0) +
                    (if (withinLimit.asKnown().isPresent) 1 else 0) +
                    (if (mimeTypeSupported.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Facebook &&
                    maxSize == other.maxSize &&
                    withinLimit == other.withinLimit &&
                    mimeTypeSupported == other.mimeTypeSupported &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(maxSize, withinLimit, mimeTypeSupported, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Facebook{maxSize=$maxSize, withinLimit=$withinLimit, mimeTypeSupported=$mimeTypeSupported, additionalProperties=$additionalProperties}"
        }

        class Googlebusiness
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val maxSize: JsonField<Double>,
            private val withinLimit: JsonField<Boolean>,
            private val mimeTypeSupported: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("max_size")
                @ExcludeMissing
                maxSize: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("within_limit")
                @ExcludeMissing
                withinLimit: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("mime_type_supported")
                @ExcludeMissing
                mimeTypeSupported: JsonField<Boolean> = JsonMissing.of(),
            ) : this(maxSize, withinLimit, mimeTypeSupported, mutableMapOf())

            /**
             * Maximum file size in bytes
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun maxSize(): Double = maxSize.getRequired("max_size")

            /**
             * Whether file size is within limit
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun withinLimit(): Boolean = withinLimit.getRequired("within_limit")

            /**
             * Whether the MIME type is supported by this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun mimeTypeSupported(): Optional<Boolean> =
                mimeTypeSupported.getOptional("mime_type_supported")

            /**
             * Returns the raw JSON value of [maxSize].
             *
             * Unlike [maxSize], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("max_size") @ExcludeMissing fun _maxSize(): JsonField<Double> = maxSize

            /**
             * Returns the raw JSON value of [withinLimit].
             *
             * Unlike [withinLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("within_limit")
            @ExcludeMissing
            fun _withinLimit(): JsonField<Boolean> = withinLimit

            /**
             * Returns the raw JSON value of [mimeTypeSupported].
             *
             * Unlike [mimeTypeSupported], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("mime_type_supported")
            @ExcludeMissing
            fun _mimeTypeSupported(): JsonField<Boolean> = mimeTypeSupported

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
                 * Returns a mutable builder for constructing an instance of [Googlebusiness].
                 *
                 * The following fields are required:
                 * ```java
                 * .maxSize()
                 * .withinLimit()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Googlebusiness]. */
            class Builder internal constructor() {

                private var maxSize: JsonField<Double>? = null
                private var withinLimit: JsonField<Boolean>? = null
                private var mimeTypeSupported: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(googlebusiness: Googlebusiness) = apply {
                    maxSize = googlebusiness.maxSize
                    withinLimit = googlebusiness.withinLimit
                    mimeTypeSupported = googlebusiness.mimeTypeSupported
                    additionalProperties = googlebusiness.additionalProperties.toMutableMap()
                }

                /** Maximum file size in bytes */
                fun maxSize(maxSize: Double) = maxSize(JsonField.of(maxSize))

                /**
                 * Sets [Builder.maxSize] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxSize] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun maxSize(maxSize: JsonField<Double>) = apply { this.maxSize = maxSize }

                /** Whether file size is within limit */
                fun withinLimit(withinLimit: Boolean) = withinLimit(JsonField.of(withinLimit))

                /**
                 * Sets [Builder.withinLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.withinLimit] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun withinLimit(withinLimit: JsonField<Boolean>) = apply {
                    this.withinLimit = withinLimit
                }

                /** Whether the MIME type is supported by this platform */
                fun mimeTypeSupported(mimeTypeSupported: Boolean) =
                    mimeTypeSupported(JsonField.of(mimeTypeSupported))

                /**
                 * Sets [Builder.mimeTypeSupported] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mimeTypeSupported] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun mimeTypeSupported(mimeTypeSupported: JsonField<Boolean>) = apply {
                    this.mimeTypeSupported = mimeTypeSupported
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
                 * Returns an immutable instance of [Googlebusiness].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .maxSize()
                 * .withinLimit()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Googlebusiness =
                    Googlebusiness(
                        checkRequired("maxSize", maxSize),
                        checkRequired("withinLimit", withinLimit),
                        mimeTypeSupported,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Googlebusiness = apply {
                if (validated) {
                    return@apply
                }

                maxSize()
                withinLimit()
                mimeTypeSupported()
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
                (if (maxSize.asKnown().isPresent) 1 else 0) +
                    (if (withinLimit.asKnown().isPresent) 1 else 0) +
                    (if (mimeTypeSupported.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Googlebusiness &&
                    maxSize == other.maxSize &&
                    withinLimit == other.withinLimit &&
                    mimeTypeSupported == other.mimeTypeSupported &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(maxSize, withinLimit, mimeTypeSupported, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Googlebusiness{maxSize=$maxSize, withinLimit=$withinLimit, mimeTypeSupported=$mimeTypeSupported, additionalProperties=$additionalProperties}"
        }

        class Instagram
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val maxSize: JsonField<Double>,
            private val withinLimit: JsonField<Boolean>,
            private val mimeTypeSupported: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("max_size")
                @ExcludeMissing
                maxSize: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("within_limit")
                @ExcludeMissing
                withinLimit: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("mime_type_supported")
                @ExcludeMissing
                mimeTypeSupported: JsonField<Boolean> = JsonMissing.of(),
            ) : this(maxSize, withinLimit, mimeTypeSupported, mutableMapOf())

            /**
             * Maximum file size in bytes
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun maxSize(): Double = maxSize.getRequired("max_size")

            /**
             * Whether file size is within limit
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun withinLimit(): Boolean = withinLimit.getRequired("within_limit")

            /**
             * Whether the MIME type is supported by this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun mimeTypeSupported(): Optional<Boolean> =
                mimeTypeSupported.getOptional("mime_type_supported")

            /**
             * Returns the raw JSON value of [maxSize].
             *
             * Unlike [maxSize], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("max_size") @ExcludeMissing fun _maxSize(): JsonField<Double> = maxSize

            /**
             * Returns the raw JSON value of [withinLimit].
             *
             * Unlike [withinLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("within_limit")
            @ExcludeMissing
            fun _withinLimit(): JsonField<Boolean> = withinLimit

            /**
             * Returns the raw JSON value of [mimeTypeSupported].
             *
             * Unlike [mimeTypeSupported], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("mime_type_supported")
            @ExcludeMissing
            fun _mimeTypeSupported(): JsonField<Boolean> = mimeTypeSupported

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
                 * Returns a mutable builder for constructing an instance of [Instagram].
                 *
                 * The following fields are required:
                 * ```java
                 * .maxSize()
                 * .withinLimit()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Instagram]. */
            class Builder internal constructor() {

                private var maxSize: JsonField<Double>? = null
                private var withinLimit: JsonField<Boolean>? = null
                private var mimeTypeSupported: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(instagram: Instagram) = apply {
                    maxSize = instagram.maxSize
                    withinLimit = instagram.withinLimit
                    mimeTypeSupported = instagram.mimeTypeSupported
                    additionalProperties = instagram.additionalProperties.toMutableMap()
                }

                /** Maximum file size in bytes */
                fun maxSize(maxSize: Double) = maxSize(JsonField.of(maxSize))

                /**
                 * Sets [Builder.maxSize] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxSize] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun maxSize(maxSize: JsonField<Double>) = apply { this.maxSize = maxSize }

                /** Whether file size is within limit */
                fun withinLimit(withinLimit: Boolean) = withinLimit(JsonField.of(withinLimit))

                /**
                 * Sets [Builder.withinLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.withinLimit] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun withinLimit(withinLimit: JsonField<Boolean>) = apply {
                    this.withinLimit = withinLimit
                }

                /** Whether the MIME type is supported by this platform */
                fun mimeTypeSupported(mimeTypeSupported: Boolean) =
                    mimeTypeSupported(JsonField.of(mimeTypeSupported))

                /**
                 * Sets [Builder.mimeTypeSupported] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mimeTypeSupported] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun mimeTypeSupported(mimeTypeSupported: JsonField<Boolean>) = apply {
                    this.mimeTypeSupported = mimeTypeSupported
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
                 * Returns an immutable instance of [Instagram].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .maxSize()
                 * .withinLimit()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Instagram =
                    Instagram(
                        checkRequired("maxSize", maxSize),
                        checkRequired("withinLimit", withinLimit),
                        mimeTypeSupported,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Instagram = apply {
                if (validated) {
                    return@apply
                }

                maxSize()
                withinLimit()
                mimeTypeSupported()
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
                (if (maxSize.asKnown().isPresent) 1 else 0) +
                    (if (withinLimit.asKnown().isPresent) 1 else 0) +
                    (if (mimeTypeSupported.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Instagram &&
                    maxSize == other.maxSize &&
                    withinLimit == other.withinLimit &&
                    mimeTypeSupported == other.mimeTypeSupported &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(maxSize, withinLimit, mimeTypeSupported, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Instagram{maxSize=$maxSize, withinLimit=$withinLimit, mimeTypeSupported=$mimeTypeSupported, additionalProperties=$additionalProperties}"
        }

        class Linkedin
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val maxSize: JsonField<Double>,
            private val withinLimit: JsonField<Boolean>,
            private val mimeTypeSupported: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("max_size")
                @ExcludeMissing
                maxSize: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("within_limit")
                @ExcludeMissing
                withinLimit: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("mime_type_supported")
                @ExcludeMissing
                mimeTypeSupported: JsonField<Boolean> = JsonMissing.of(),
            ) : this(maxSize, withinLimit, mimeTypeSupported, mutableMapOf())

            /**
             * Maximum file size in bytes
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun maxSize(): Double = maxSize.getRequired("max_size")

            /**
             * Whether file size is within limit
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun withinLimit(): Boolean = withinLimit.getRequired("within_limit")

            /**
             * Whether the MIME type is supported by this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun mimeTypeSupported(): Optional<Boolean> =
                mimeTypeSupported.getOptional("mime_type_supported")

            /**
             * Returns the raw JSON value of [maxSize].
             *
             * Unlike [maxSize], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("max_size") @ExcludeMissing fun _maxSize(): JsonField<Double> = maxSize

            /**
             * Returns the raw JSON value of [withinLimit].
             *
             * Unlike [withinLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("within_limit")
            @ExcludeMissing
            fun _withinLimit(): JsonField<Boolean> = withinLimit

            /**
             * Returns the raw JSON value of [mimeTypeSupported].
             *
             * Unlike [mimeTypeSupported], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("mime_type_supported")
            @ExcludeMissing
            fun _mimeTypeSupported(): JsonField<Boolean> = mimeTypeSupported

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
                 * Returns a mutable builder for constructing an instance of [Linkedin].
                 *
                 * The following fields are required:
                 * ```java
                 * .maxSize()
                 * .withinLimit()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Linkedin]. */
            class Builder internal constructor() {

                private var maxSize: JsonField<Double>? = null
                private var withinLimit: JsonField<Boolean>? = null
                private var mimeTypeSupported: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(linkedin: Linkedin) = apply {
                    maxSize = linkedin.maxSize
                    withinLimit = linkedin.withinLimit
                    mimeTypeSupported = linkedin.mimeTypeSupported
                    additionalProperties = linkedin.additionalProperties.toMutableMap()
                }

                /** Maximum file size in bytes */
                fun maxSize(maxSize: Double) = maxSize(JsonField.of(maxSize))

                /**
                 * Sets [Builder.maxSize] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxSize] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun maxSize(maxSize: JsonField<Double>) = apply { this.maxSize = maxSize }

                /** Whether file size is within limit */
                fun withinLimit(withinLimit: Boolean) = withinLimit(JsonField.of(withinLimit))

                /**
                 * Sets [Builder.withinLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.withinLimit] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun withinLimit(withinLimit: JsonField<Boolean>) = apply {
                    this.withinLimit = withinLimit
                }

                /** Whether the MIME type is supported by this platform */
                fun mimeTypeSupported(mimeTypeSupported: Boolean) =
                    mimeTypeSupported(JsonField.of(mimeTypeSupported))

                /**
                 * Sets [Builder.mimeTypeSupported] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mimeTypeSupported] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun mimeTypeSupported(mimeTypeSupported: JsonField<Boolean>) = apply {
                    this.mimeTypeSupported = mimeTypeSupported
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
                 * Returns an immutable instance of [Linkedin].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .maxSize()
                 * .withinLimit()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Linkedin =
                    Linkedin(
                        checkRequired("maxSize", maxSize),
                        checkRequired("withinLimit", withinLimit),
                        mimeTypeSupported,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Linkedin = apply {
                if (validated) {
                    return@apply
                }

                maxSize()
                withinLimit()
                mimeTypeSupported()
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
                (if (maxSize.asKnown().isPresent) 1 else 0) +
                    (if (withinLimit.asKnown().isPresent) 1 else 0) +
                    (if (mimeTypeSupported.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Linkedin &&
                    maxSize == other.maxSize &&
                    withinLimit == other.withinLimit &&
                    mimeTypeSupported == other.mimeTypeSupported &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(maxSize, withinLimit, mimeTypeSupported, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Linkedin{maxSize=$maxSize, withinLimit=$withinLimit, mimeTypeSupported=$mimeTypeSupported, additionalProperties=$additionalProperties}"
        }

        class Mastodon
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val maxSize: JsonField<Double>,
            private val withinLimit: JsonField<Boolean>,
            private val mimeTypeSupported: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("max_size")
                @ExcludeMissing
                maxSize: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("within_limit")
                @ExcludeMissing
                withinLimit: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("mime_type_supported")
                @ExcludeMissing
                mimeTypeSupported: JsonField<Boolean> = JsonMissing.of(),
            ) : this(maxSize, withinLimit, mimeTypeSupported, mutableMapOf())

            /**
             * Maximum file size in bytes
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun maxSize(): Double = maxSize.getRequired("max_size")

            /**
             * Whether file size is within limit
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun withinLimit(): Boolean = withinLimit.getRequired("within_limit")

            /**
             * Whether the MIME type is supported by this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun mimeTypeSupported(): Optional<Boolean> =
                mimeTypeSupported.getOptional("mime_type_supported")

            /**
             * Returns the raw JSON value of [maxSize].
             *
             * Unlike [maxSize], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("max_size") @ExcludeMissing fun _maxSize(): JsonField<Double> = maxSize

            /**
             * Returns the raw JSON value of [withinLimit].
             *
             * Unlike [withinLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("within_limit")
            @ExcludeMissing
            fun _withinLimit(): JsonField<Boolean> = withinLimit

            /**
             * Returns the raw JSON value of [mimeTypeSupported].
             *
             * Unlike [mimeTypeSupported], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("mime_type_supported")
            @ExcludeMissing
            fun _mimeTypeSupported(): JsonField<Boolean> = mimeTypeSupported

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
                 * Returns a mutable builder for constructing an instance of [Mastodon].
                 *
                 * The following fields are required:
                 * ```java
                 * .maxSize()
                 * .withinLimit()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Mastodon]. */
            class Builder internal constructor() {

                private var maxSize: JsonField<Double>? = null
                private var withinLimit: JsonField<Boolean>? = null
                private var mimeTypeSupported: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(mastodon: Mastodon) = apply {
                    maxSize = mastodon.maxSize
                    withinLimit = mastodon.withinLimit
                    mimeTypeSupported = mastodon.mimeTypeSupported
                    additionalProperties = mastodon.additionalProperties.toMutableMap()
                }

                /** Maximum file size in bytes */
                fun maxSize(maxSize: Double) = maxSize(JsonField.of(maxSize))

                /**
                 * Sets [Builder.maxSize] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxSize] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun maxSize(maxSize: JsonField<Double>) = apply { this.maxSize = maxSize }

                /** Whether file size is within limit */
                fun withinLimit(withinLimit: Boolean) = withinLimit(JsonField.of(withinLimit))

                /**
                 * Sets [Builder.withinLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.withinLimit] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun withinLimit(withinLimit: JsonField<Boolean>) = apply {
                    this.withinLimit = withinLimit
                }

                /** Whether the MIME type is supported by this platform */
                fun mimeTypeSupported(mimeTypeSupported: Boolean) =
                    mimeTypeSupported(JsonField.of(mimeTypeSupported))

                /**
                 * Sets [Builder.mimeTypeSupported] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mimeTypeSupported] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun mimeTypeSupported(mimeTypeSupported: JsonField<Boolean>) = apply {
                    this.mimeTypeSupported = mimeTypeSupported
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
                 * Returns an immutable instance of [Mastodon].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .maxSize()
                 * .withinLimit()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Mastodon =
                    Mastodon(
                        checkRequired("maxSize", maxSize),
                        checkRequired("withinLimit", withinLimit),
                        mimeTypeSupported,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Mastodon = apply {
                if (validated) {
                    return@apply
                }

                maxSize()
                withinLimit()
                mimeTypeSupported()
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
                (if (maxSize.asKnown().isPresent) 1 else 0) +
                    (if (withinLimit.asKnown().isPresent) 1 else 0) +
                    (if (mimeTypeSupported.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Mastodon &&
                    maxSize == other.maxSize &&
                    withinLimit == other.withinLimit &&
                    mimeTypeSupported == other.mimeTypeSupported &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(maxSize, withinLimit, mimeTypeSupported, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Mastodon{maxSize=$maxSize, withinLimit=$withinLimit, mimeTypeSupported=$mimeTypeSupported, additionalProperties=$additionalProperties}"
        }

        class Pinterest
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val maxSize: JsonField<Double>,
            private val withinLimit: JsonField<Boolean>,
            private val mimeTypeSupported: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("max_size")
                @ExcludeMissing
                maxSize: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("within_limit")
                @ExcludeMissing
                withinLimit: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("mime_type_supported")
                @ExcludeMissing
                mimeTypeSupported: JsonField<Boolean> = JsonMissing.of(),
            ) : this(maxSize, withinLimit, mimeTypeSupported, mutableMapOf())

            /**
             * Maximum file size in bytes
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun maxSize(): Double = maxSize.getRequired("max_size")

            /**
             * Whether file size is within limit
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun withinLimit(): Boolean = withinLimit.getRequired("within_limit")

            /**
             * Whether the MIME type is supported by this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun mimeTypeSupported(): Optional<Boolean> =
                mimeTypeSupported.getOptional("mime_type_supported")

            /**
             * Returns the raw JSON value of [maxSize].
             *
             * Unlike [maxSize], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("max_size") @ExcludeMissing fun _maxSize(): JsonField<Double> = maxSize

            /**
             * Returns the raw JSON value of [withinLimit].
             *
             * Unlike [withinLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("within_limit")
            @ExcludeMissing
            fun _withinLimit(): JsonField<Boolean> = withinLimit

            /**
             * Returns the raw JSON value of [mimeTypeSupported].
             *
             * Unlike [mimeTypeSupported], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("mime_type_supported")
            @ExcludeMissing
            fun _mimeTypeSupported(): JsonField<Boolean> = mimeTypeSupported

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
                 * Returns a mutable builder for constructing an instance of [Pinterest].
                 *
                 * The following fields are required:
                 * ```java
                 * .maxSize()
                 * .withinLimit()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Pinterest]. */
            class Builder internal constructor() {

                private var maxSize: JsonField<Double>? = null
                private var withinLimit: JsonField<Boolean>? = null
                private var mimeTypeSupported: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(pinterest: Pinterest) = apply {
                    maxSize = pinterest.maxSize
                    withinLimit = pinterest.withinLimit
                    mimeTypeSupported = pinterest.mimeTypeSupported
                    additionalProperties = pinterest.additionalProperties.toMutableMap()
                }

                /** Maximum file size in bytes */
                fun maxSize(maxSize: Double) = maxSize(JsonField.of(maxSize))

                /**
                 * Sets [Builder.maxSize] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxSize] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun maxSize(maxSize: JsonField<Double>) = apply { this.maxSize = maxSize }

                /** Whether file size is within limit */
                fun withinLimit(withinLimit: Boolean) = withinLimit(JsonField.of(withinLimit))

                /**
                 * Sets [Builder.withinLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.withinLimit] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun withinLimit(withinLimit: JsonField<Boolean>) = apply {
                    this.withinLimit = withinLimit
                }

                /** Whether the MIME type is supported by this platform */
                fun mimeTypeSupported(mimeTypeSupported: Boolean) =
                    mimeTypeSupported(JsonField.of(mimeTypeSupported))

                /**
                 * Sets [Builder.mimeTypeSupported] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mimeTypeSupported] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun mimeTypeSupported(mimeTypeSupported: JsonField<Boolean>) = apply {
                    this.mimeTypeSupported = mimeTypeSupported
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
                 * Returns an immutable instance of [Pinterest].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .maxSize()
                 * .withinLimit()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Pinterest =
                    Pinterest(
                        checkRequired("maxSize", maxSize),
                        checkRequired("withinLimit", withinLimit),
                        mimeTypeSupported,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Pinterest = apply {
                if (validated) {
                    return@apply
                }

                maxSize()
                withinLimit()
                mimeTypeSupported()
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
                (if (maxSize.asKnown().isPresent) 1 else 0) +
                    (if (withinLimit.asKnown().isPresent) 1 else 0) +
                    (if (mimeTypeSupported.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Pinterest &&
                    maxSize == other.maxSize &&
                    withinLimit == other.withinLimit &&
                    mimeTypeSupported == other.mimeTypeSupported &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(maxSize, withinLimit, mimeTypeSupported, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Pinterest{maxSize=$maxSize, withinLimit=$withinLimit, mimeTypeSupported=$mimeTypeSupported, additionalProperties=$additionalProperties}"
        }

        class Reddit
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val maxSize: JsonField<Double>,
            private val withinLimit: JsonField<Boolean>,
            private val mimeTypeSupported: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("max_size")
                @ExcludeMissing
                maxSize: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("within_limit")
                @ExcludeMissing
                withinLimit: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("mime_type_supported")
                @ExcludeMissing
                mimeTypeSupported: JsonField<Boolean> = JsonMissing.of(),
            ) : this(maxSize, withinLimit, mimeTypeSupported, mutableMapOf())

            /**
             * Maximum file size in bytes
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun maxSize(): Double = maxSize.getRequired("max_size")

            /**
             * Whether file size is within limit
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun withinLimit(): Boolean = withinLimit.getRequired("within_limit")

            /**
             * Whether the MIME type is supported by this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun mimeTypeSupported(): Optional<Boolean> =
                mimeTypeSupported.getOptional("mime_type_supported")

            /**
             * Returns the raw JSON value of [maxSize].
             *
             * Unlike [maxSize], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("max_size") @ExcludeMissing fun _maxSize(): JsonField<Double> = maxSize

            /**
             * Returns the raw JSON value of [withinLimit].
             *
             * Unlike [withinLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("within_limit")
            @ExcludeMissing
            fun _withinLimit(): JsonField<Boolean> = withinLimit

            /**
             * Returns the raw JSON value of [mimeTypeSupported].
             *
             * Unlike [mimeTypeSupported], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("mime_type_supported")
            @ExcludeMissing
            fun _mimeTypeSupported(): JsonField<Boolean> = mimeTypeSupported

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
                 * Returns a mutable builder for constructing an instance of [Reddit].
                 *
                 * The following fields are required:
                 * ```java
                 * .maxSize()
                 * .withinLimit()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Reddit]. */
            class Builder internal constructor() {

                private var maxSize: JsonField<Double>? = null
                private var withinLimit: JsonField<Boolean>? = null
                private var mimeTypeSupported: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(reddit: Reddit) = apply {
                    maxSize = reddit.maxSize
                    withinLimit = reddit.withinLimit
                    mimeTypeSupported = reddit.mimeTypeSupported
                    additionalProperties = reddit.additionalProperties.toMutableMap()
                }

                /** Maximum file size in bytes */
                fun maxSize(maxSize: Double) = maxSize(JsonField.of(maxSize))

                /**
                 * Sets [Builder.maxSize] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxSize] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun maxSize(maxSize: JsonField<Double>) = apply { this.maxSize = maxSize }

                /** Whether file size is within limit */
                fun withinLimit(withinLimit: Boolean) = withinLimit(JsonField.of(withinLimit))

                /**
                 * Sets [Builder.withinLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.withinLimit] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun withinLimit(withinLimit: JsonField<Boolean>) = apply {
                    this.withinLimit = withinLimit
                }

                /** Whether the MIME type is supported by this platform */
                fun mimeTypeSupported(mimeTypeSupported: Boolean) =
                    mimeTypeSupported(JsonField.of(mimeTypeSupported))

                /**
                 * Sets [Builder.mimeTypeSupported] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mimeTypeSupported] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun mimeTypeSupported(mimeTypeSupported: JsonField<Boolean>) = apply {
                    this.mimeTypeSupported = mimeTypeSupported
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
                 * Returns an immutable instance of [Reddit].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .maxSize()
                 * .withinLimit()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Reddit =
                    Reddit(
                        checkRequired("maxSize", maxSize),
                        checkRequired("withinLimit", withinLimit),
                        mimeTypeSupported,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Reddit = apply {
                if (validated) {
                    return@apply
                }

                maxSize()
                withinLimit()
                mimeTypeSupported()
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
                (if (maxSize.asKnown().isPresent) 1 else 0) +
                    (if (withinLimit.asKnown().isPresent) 1 else 0) +
                    (if (mimeTypeSupported.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Reddit &&
                    maxSize == other.maxSize &&
                    withinLimit == other.withinLimit &&
                    mimeTypeSupported == other.mimeTypeSupported &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(maxSize, withinLimit, mimeTypeSupported, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Reddit{maxSize=$maxSize, withinLimit=$withinLimit, mimeTypeSupported=$mimeTypeSupported, additionalProperties=$additionalProperties}"
        }

        class Sms
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val maxSize: JsonField<Double>,
            private val withinLimit: JsonField<Boolean>,
            private val mimeTypeSupported: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("max_size")
                @ExcludeMissing
                maxSize: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("within_limit")
                @ExcludeMissing
                withinLimit: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("mime_type_supported")
                @ExcludeMissing
                mimeTypeSupported: JsonField<Boolean> = JsonMissing.of(),
            ) : this(maxSize, withinLimit, mimeTypeSupported, mutableMapOf())

            /**
             * Maximum file size in bytes
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun maxSize(): Double = maxSize.getRequired("max_size")

            /**
             * Whether file size is within limit
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun withinLimit(): Boolean = withinLimit.getRequired("within_limit")

            /**
             * Whether the MIME type is supported by this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun mimeTypeSupported(): Optional<Boolean> =
                mimeTypeSupported.getOptional("mime_type_supported")

            /**
             * Returns the raw JSON value of [maxSize].
             *
             * Unlike [maxSize], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("max_size") @ExcludeMissing fun _maxSize(): JsonField<Double> = maxSize

            /**
             * Returns the raw JSON value of [withinLimit].
             *
             * Unlike [withinLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("within_limit")
            @ExcludeMissing
            fun _withinLimit(): JsonField<Boolean> = withinLimit

            /**
             * Returns the raw JSON value of [mimeTypeSupported].
             *
             * Unlike [mimeTypeSupported], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("mime_type_supported")
            @ExcludeMissing
            fun _mimeTypeSupported(): JsonField<Boolean> = mimeTypeSupported

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
                 * Returns a mutable builder for constructing an instance of [Sms].
                 *
                 * The following fields are required:
                 * ```java
                 * .maxSize()
                 * .withinLimit()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Sms]. */
            class Builder internal constructor() {

                private var maxSize: JsonField<Double>? = null
                private var withinLimit: JsonField<Boolean>? = null
                private var mimeTypeSupported: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(sms: Sms) = apply {
                    maxSize = sms.maxSize
                    withinLimit = sms.withinLimit
                    mimeTypeSupported = sms.mimeTypeSupported
                    additionalProperties = sms.additionalProperties.toMutableMap()
                }

                /** Maximum file size in bytes */
                fun maxSize(maxSize: Double) = maxSize(JsonField.of(maxSize))

                /**
                 * Sets [Builder.maxSize] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxSize] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun maxSize(maxSize: JsonField<Double>) = apply { this.maxSize = maxSize }

                /** Whether file size is within limit */
                fun withinLimit(withinLimit: Boolean) = withinLimit(JsonField.of(withinLimit))

                /**
                 * Sets [Builder.withinLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.withinLimit] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun withinLimit(withinLimit: JsonField<Boolean>) = apply {
                    this.withinLimit = withinLimit
                }

                /** Whether the MIME type is supported by this platform */
                fun mimeTypeSupported(mimeTypeSupported: Boolean) =
                    mimeTypeSupported(JsonField.of(mimeTypeSupported))

                /**
                 * Sets [Builder.mimeTypeSupported] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mimeTypeSupported] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun mimeTypeSupported(mimeTypeSupported: JsonField<Boolean>) = apply {
                    this.mimeTypeSupported = mimeTypeSupported
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
                 * Returns an immutable instance of [Sms].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .maxSize()
                 * .withinLimit()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Sms =
                    Sms(
                        checkRequired("maxSize", maxSize),
                        checkRequired("withinLimit", withinLimit),
                        mimeTypeSupported,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Sms = apply {
                if (validated) {
                    return@apply
                }

                maxSize()
                withinLimit()
                mimeTypeSupported()
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
                (if (maxSize.asKnown().isPresent) 1 else 0) +
                    (if (withinLimit.asKnown().isPresent) 1 else 0) +
                    (if (mimeTypeSupported.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Sms &&
                    maxSize == other.maxSize &&
                    withinLimit == other.withinLimit &&
                    mimeTypeSupported == other.mimeTypeSupported &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(maxSize, withinLimit, mimeTypeSupported, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Sms{maxSize=$maxSize, withinLimit=$withinLimit, mimeTypeSupported=$mimeTypeSupported, additionalProperties=$additionalProperties}"
        }

        class Snapchat
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val maxSize: JsonField<Double>,
            private val withinLimit: JsonField<Boolean>,
            private val mimeTypeSupported: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("max_size")
                @ExcludeMissing
                maxSize: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("within_limit")
                @ExcludeMissing
                withinLimit: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("mime_type_supported")
                @ExcludeMissing
                mimeTypeSupported: JsonField<Boolean> = JsonMissing.of(),
            ) : this(maxSize, withinLimit, mimeTypeSupported, mutableMapOf())

            /**
             * Maximum file size in bytes
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun maxSize(): Double = maxSize.getRequired("max_size")

            /**
             * Whether file size is within limit
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun withinLimit(): Boolean = withinLimit.getRequired("within_limit")

            /**
             * Whether the MIME type is supported by this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun mimeTypeSupported(): Optional<Boolean> =
                mimeTypeSupported.getOptional("mime_type_supported")

            /**
             * Returns the raw JSON value of [maxSize].
             *
             * Unlike [maxSize], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("max_size") @ExcludeMissing fun _maxSize(): JsonField<Double> = maxSize

            /**
             * Returns the raw JSON value of [withinLimit].
             *
             * Unlike [withinLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("within_limit")
            @ExcludeMissing
            fun _withinLimit(): JsonField<Boolean> = withinLimit

            /**
             * Returns the raw JSON value of [mimeTypeSupported].
             *
             * Unlike [mimeTypeSupported], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("mime_type_supported")
            @ExcludeMissing
            fun _mimeTypeSupported(): JsonField<Boolean> = mimeTypeSupported

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
                 * Returns a mutable builder for constructing an instance of [Snapchat].
                 *
                 * The following fields are required:
                 * ```java
                 * .maxSize()
                 * .withinLimit()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Snapchat]. */
            class Builder internal constructor() {

                private var maxSize: JsonField<Double>? = null
                private var withinLimit: JsonField<Boolean>? = null
                private var mimeTypeSupported: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(snapchat: Snapchat) = apply {
                    maxSize = snapchat.maxSize
                    withinLimit = snapchat.withinLimit
                    mimeTypeSupported = snapchat.mimeTypeSupported
                    additionalProperties = snapchat.additionalProperties.toMutableMap()
                }

                /** Maximum file size in bytes */
                fun maxSize(maxSize: Double) = maxSize(JsonField.of(maxSize))

                /**
                 * Sets [Builder.maxSize] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxSize] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun maxSize(maxSize: JsonField<Double>) = apply { this.maxSize = maxSize }

                /** Whether file size is within limit */
                fun withinLimit(withinLimit: Boolean) = withinLimit(JsonField.of(withinLimit))

                /**
                 * Sets [Builder.withinLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.withinLimit] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun withinLimit(withinLimit: JsonField<Boolean>) = apply {
                    this.withinLimit = withinLimit
                }

                /** Whether the MIME type is supported by this platform */
                fun mimeTypeSupported(mimeTypeSupported: Boolean) =
                    mimeTypeSupported(JsonField.of(mimeTypeSupported))

                /**
                 * Sets [Builder.mimeTypeSupported] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mimeTypeSupported] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun mimeTypeSupported(mimeTypeSupported: JsonField<Boolean>) = apply {
                    this.mimeTypeSupported = mimeTypeSupported
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
                 * Returns an immutable instance of [Snapchat].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .maxSize()
                 * .withinLimit()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Snapchat =
                    Snapchat(
                        checkRequired("maxSize", maxSize),
                        checkRequired("withinLimit", withinLimit),
                        mimeTypeSupported,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Snapchat = apply {
                if (validated) {
                    return@apply
                }

                maxSize()
                withinLimit()
                mimeTypeSupported()
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
                (if (maxSize.asKnown().isPresent) 1 else 0) +
                    (if (withinLimit.asKnown().isPresent) 1 else 0) +
                    (if (mimeTypeSupported.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Snapchat &&
                    maxSize == other.maxSize &&
                    withinLimit == other.withinLimit &&
                    mimeTypeSupported == other.mimeTypeSupported &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(maxSize, withinLimit, mimeTypeSupported, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Snapchat{maxSize=$maxSize, withinLimit=$withinLimit, mimeTypeSupported=$mimeTypeSupported, additionalProperties=$additionalProperties}"
        }

        class Telegram
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val maxSize: JsonField<Double>,
            private val withinLimit: JsonField<Boolean>,
            private val mimeTypeSupported: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("max_size")
                @ExcludeMissing
                maxSize: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("within_limit")
                @ExcludeMissing
                withinLimit: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("mime_type_supported")
                @ExcludeMissing
                mimeTypeSupported: JsonField<Boolean> = JsonMissing.of(),
            ) : this(maxSize, withinLimit, mimeTypeSupported, mutableMapOf())

            /**
             * Maximum file size in bytes
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun maxSize(): Double = maxSize.getRequired("max_size")

            /**
             * Whether file size is within limit
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun withinLimit(): Boolean = withinLimit.getRequired("within_limit")

            /**
             * Whether the MIME type is supported by this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun mimeTypeSupported(): Optional<Boolean> =
                mimeTypeSupported.getOptional("mime_type_supported")

            /**
             * Returns the raw JSON value of [maxSize].
             *
             * Unlike [maxSize], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("max_size") @ExcludeMissing fun _maxSize(): JsonField<Double> = maxSize

            /**
             * Returns the raw JSON value of [withinLimit].
             *
             * Unlike [withinLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("within_limit")
            @ExcludeMissing
            fun _withinLimit(): JsonField<Boolean> = withinLimit

            /**
             * Returns the raw JSON value of [mimeTypeSupported].
             *
             * Unlike [mimeTypeSupported], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("mime_type_supported")
            @ExcludeMissing
            fun _mimeTypeSupported(): JsonField<Boolean> = mimeTypeSupported

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
                 * Returns a mutable builder for constructing an instance of [Telegram].
                 *
                 * The following fields are required:
                 * ```java
                 * .maxSize()
                 * .withinLimit()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Telegram]. */
            class Builder internal constructor() {

                private var maxSize: JsonField<Double>? = null
                private var withinLimit: JsonField<Boolean>? = null
                private var mimeTypeSupported: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(telegram: Telegram) = apply {
                    maxSize = telegram.maxSize
                    withinLimit = telegram.withinLimit
                    mimeTypeSupported = telegram.mimeTypeSupported
                    additionalProperties = telegram.additionalProperties.toMutableMap()
                }

                /** Maximum file size in bytes */
                fun maxSize(maxSize: Double) = maxSize(JsonField.of(maxSize))

                /**
                 * Sets [Builder.maxSize] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxSize] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun maxSize(maxSize: JsonField<Double>) = apply { this.maxSize = maxSize }

                /** Whether file size is within limit */
                fun withinLimit(withinLimit: Boolean) = withinLimit(JsonField.of(withinLimit))

                /**
                 * Sets [Builder.withinLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.withinLimit] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun withinLimit(withinLimit: JsonField<Boolean>) = apply {
                    this.withinLimit = withinLimit
                }

                /** Whether the MIME type is supported by this platform */
                fun mimeTypeSupported(mimeTypeSupported: Boolean) =
                    mimeTypeSupported(JsonField.of(mimeTypeSupported))

                /**
                 * Sets [Builder.mimeTypeSupported] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mimeTypeSupported] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun mimeTypeSupported(mimeTypeSupported: JsonField<Boolean>) = apply {
                    this.mimeTypeSupported = mimeTypeSupported
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
                 * Returns an immutable instance of [Telegram].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .maxSize()
                 * .withinLimit()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Telegram =
                    Telegram(
                        checkRequired("maxSize", maxSize),
                        checkRequired("withinLimit", withinLimit),
                        mimeTypeSupported,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Telegram = apply {
                if (validated) {
                    return@apply
                }

                maxSize()
                withinLimit()
                mimeTypeSupported()
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
                (if (maxSize.asKnown().isPresent) 1 else 0) +
                    (if (withinLimit.asKnown().isPresent) 1 else 0) +
                    (if (mimeTypeSupported.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Telegram &&
                    maxSize == other.maxSize &&
                    withinLimit == other.withinLimit &&
                    mimeTypeSupported == other.mimeTypeSupported &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(maxSize, withinLimit, mimeTypeSupported, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Telegram{maxSize=$maxSize, withinLimit=$withinLimit, mimeTypeSupported=$mimeTypeSupported, additionalProperties=$additionalProperties}"
        }

        class Threads
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val maxSize: JsonField<Double>,
            private val withinLimit: JsonField<Boolean>,
            private val mimeTypeSupported: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("max_size")
                @ExcludeMissing
                maxSize: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("within_limit")
                @ExcludeMissing
                withinLimit: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("mime_type_supported")
                @ExcludeMissing
                mimeTypeSupported: JsonField<Boolean> = JsonMissing.of(),
            ) : this(maxSize, withinLimit, mimeTypeSupported, mutableMapOf())

            /**
             * Maximum file size in bytes
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun maxSize(): Double = maxSize.getRequired("max_size")

            /**
             * Whether file size is within limit
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun withinLimit(): Boolean = withinLimit.getRequired("within_limit")

            /**
             * Whether the MIME type is supported by this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun mimeTypeSupported(): Optional<Boolean> =
                mimeTypeSupported.getOptional("mime_type_supported")

            /**
             * Returns the raw JSON value of [maxSize].
             *
             * Unlike [maxSize], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("max_size") @ExcludeMissing fun _maxSize(): JsonField<Double> = maxSize

            /**
             * Returns the raw JSON value of [withinLimit].
             *
             * Unlike [withinLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("within_limit")
            @ExcludeMissing
            fun _withinLimit(): JsonField<Boolean> = withinLimit

            /**
             * Returns the raw JSON value of [mimeTypeSupported].
             *
             * Unlike [mimeTypeSupported], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("mime_type_supported")
            @ExcludeMissing
            fun _mimeTypeSupported(): JsonField<Boolean> = mimeTypeSupported

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
                 * Returns a mutable builder for constructing an instance of [Threads].
                 *
                 * The following fields are required:
                 * ```java
                 * .maxSize()
                 * .withinLimit()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Threads]. */
            class Builder internal constructor() {

                private var maxSize: JsonField<Double>? = null
                private var withinLimit: JsonField<Boolean>? = null
                private var mimeTypeSupported: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(threads: Threads) = apply {
                    maxSize = threads.maxSize
                    withinLimit = threads.withinLimit
                    mimeTypeSupported = threads.mimeTypeSupported
                    additionalProperties = threads.additionalProperties.toMutableMap()
                }

                /** Maximum file size in bytes */
                fun maxSize(maxSize: Double) = maxSize(JsonField.of(maxSize))

                /**
                 * Sets [Builder.maxSize] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxSize] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun maxSize(maxSize: JsonField<Double>) = apply { this.maxSize = maxSize }

                /** Whether file size is within limit */
                fun withinLimit(withinLimit: Boolean) = withinLimit(JsonField.of(withinLimit))

                /**
                 * Sets [Builder.withinLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.withinLimit] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun withinLimit(withinLimit: JsonField<Boolean>) = apply {
                    this.withinLimit = withinLimit
                }

                /** Whether the MIME type is supported by this platform */
                fun mimeTypeSupported(mimeTypeSupported: Boolean) =
                    mimeTypeSupported(JsonField.of(mimeTypeSupported))

                /**
                 * Sets [Builder.mimeTypeSupported] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mimeTypeSupported] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun mimeTypeSupported(mimeTypeSupported: JsonField<Boolean>) = apply {
                    this.mimeTypeSupported = mimeTypeSupported
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
                 * Returns an immutable instance of [Threads].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .maxSize()
                 * .withinLimit()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Threads =
                    Threads(
                        checkRequired("maxSize", maxSize),
                        checkRequired("withinLimit", withinLimit),
                        mimeTypeSupported,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Threads = apply {
                if (validated) {
                    return@apply
                }

                maxSize()
                withinLimit()
                mimeTypeSupported()
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
                (if (maxSize.asKnown().isPresent) 1 else 0) +
                    (if (withinLimit.asKnown().isPresent) 1 else 0) +
                    (if (mimeTypeSupported.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Threads &&
                    maxSize == other.maxSize &&
                    withinLimit == other.withinLimit &&
                    mimeTypeSupported == other.mimeTypeSupported &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(maxSize, withinLimit, mimeTypeSupported, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Threads{maxSize=$maxSize, withinLimit=$withinLimit, mimeTypeSupported=$mimeTypeSupported, additionalProperties=$additionalProperties}"
        }

        class Tiktok
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val maxSize: JsonField<Double>,
            private val withinLimit: JsonField<Boolean>,
            private val mimeTypeSupported: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("max_size")
                @ExcludeMissing
                maxSize: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("within_limit")
                @ExcludeMissing
                withinLimit: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("mime_type_supported")
                @ExcludeMissing
                mimeTypeSupported: JsonField<Boolean> = JsonMissing.of(),
            ) : this(maxSize, withinLimit, mimeTypeSupported, mutableMapOf())

            /**
             * Maximum file size in bytes
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun maxSize(): Double = maxSize.getRequired("max_size")

            /**
             * Whether file size is within limit
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun withinLimit(): Boolean = withinLimit.getRequired("within_limit")

            /**
             * Whether the MIME type is supported by this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun mimeTypeSupported(): Optional<Boolean> =
                mimeTypeSupported.getOptional("mime_type_supported")

            /**
             * Returns the raw JSON value of [maxSize].
             *
             * Unlike [maxSize], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("max_size") @ExcludeMissing fun _maxSize(): JsonField<Double> = maxSize

            /**
             * Returns the raw JSON value of [withinLimit].
             *
             * Unlike [withinLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("within_limit")
            @ExcludeMissing
            fun _withinLimit(): JsonField<Boolean> = withinLimit

            /**
             * Returns the raw JSON value of [mimeTypeSupported].
             *
             * Unlike [mimeTypeSupported], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("mime_type_supported")
            @ExcludeMissing
            fun _mimeTypeSupported(): JsonField<Boolean> = mimeTypeSupported

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
                 * Returns a mutable builder for constructing an instance of [Tiktok].
                 *
                 * The following fields are required:
                 * ```java
                 * .maxSize()
                 * .withinLimit()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Tiktok]. */
            class Builder internal constructor() {

                private var maxSize: JsonField<Double>? = null
                private var withinLimit: JsonField<Boolean>? = null
                private var mimeTypeSupported: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(tiktok: Tiktok) = apply {
                    maxSize = tiktok.maxSize
                    withinLimit = tiktok.withinLimit
                    mimeTypeSupported = tiktok.mimeTypeSupported
                    additionalProperties = tiktok.additionalProperties.toMutableMap()
                }

                /** Maximum file size in bytes */
                fun maxSize(maxSize: Double) = maxSize(JsonField.of(maxSize))

                /**
                 * Sets [Builder.maxSize] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxSize] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun maxSize(maxSize: JsonField<Double>) = apply { this.maxSize = maxSize }

                /** Whether file size is within limit */
                fun withinLimit(withinLimit: Boolean) = withinLimit(JsonField.of(withinLimit))

                /**
                 * Sets [Builder.withinLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.withinLimit] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun withinLimit(withinLimit: JsonField<Boolean>) = apply {
                    this.withinLimit = withinLimit
                }

                /** Whether the MIME type is supported by this platform */
                fun mimeTypeSupported(mimeTypeSupported: Boolean) =
                    mimeTypeSupported(JsonField.of(mimeTypeSupported))

                /**
                 * Sets [Builder.mimeTypeSupported] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mimeTypeSupported] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun mimeTypeSupported(mimeTypeSupported: JsonField<Boolean>) = apply {
                    this.mimeTypeSupported = mimeTypeSupported
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
                 * Returns an immutable instance of [Tiktok].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .maxSize()
                 * .withinLimit()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Tiktok =
                    Tiktok(
                        checkRequired("maxSize", maxSize),
                        checkRequired("withinLimit", withinLimit),
                        mimeTypeSupported,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Tiktok = apply {
                if (validated) {
                    return@apply
                }

                maxSize()
                withinLimit()
                mimeTypeSupported()
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
                (if (maxSize.asKnown().isPresent) 1 else 0) +
                    (if (withinLimit.asKnown().isPresent) 1 else 0) +
                    (if (mimeTypeSupported.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Tiktok &&
                    maxSize == other.maxSize &&
                    withinLimit == other.withinLimit &&
                    mimeTypeSupported == other.mimeTypeSupported &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(maxSize, withinLimit, mimeTypeSupported, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Tiktok{maxSize=$maxSize, withinLimit=$withinLimit, mimeTypeSupported=$mimeTypeSupported, additionalProperties=$additionalProperties}"
        }

        class Twitter
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val maxSize: JsonField<Double>,
            private val withinLimit: JsonField<Boolean>,
            private val mimeTypeSupported: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("max_size")
                @ExcludeMissing
                maxSize: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("within_limit")
                @ExcludeMissing
                withinLimit: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("mime_type_supported")
                @ExcludeMissing
                mimeTypeSupported: JsonField<Boolean> = JsonMissing.of(),
            ) : this(maxSize, withinLimit, mimeTypeSupported, mutableMapOf())

            /**
             * Maximum file size in bytes
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun maxSize(): Double = maxSize.getRequired("max_size")

            /**
             * Whether file size is within limit
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun withinLimit(): Boolean = withinLimit.getRequired("within_limit")

            /**
             * Whether the MIME type is supported by this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun mimeTypeSupported(): Optional<Boolean> =
                mimeTypeSupported.getOptional("mime_type_supported")

            /**
             * Returns the raw JSON value of [maxSize].
             *
             * Unlike [maxSize], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("max_size") @ExcludeMissing fun _maxSize(): JsonField<Double> = maxSize

            /**
             * Returns the raw JSON value of [withinLimit].
             *
             * Unlike [withinLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("within_limit")
            @ExcludeMissing
            fun _withinLimit(): JsonField<Boolean> = withinLimit

            /**
             * Returns the raw JSON value of [mimeTypeSupported].
             *
             * Unlike [mimeTypeSupported], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("mime_type_supported")
            @ExcludeMissing
            fun _mimeTypeSupported(): JsonField<Boolean> = mimeTypeSupported

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
                 * Returns a mutable builder for constructing an instance of [Twitter].
                 *
                 * The following fields are required:
                 * ```java
                 * .maxSize()
                 * .withinLimit()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Twitter]. */
            class Builder internal constructor() {

                private var maxSize: JsonField<Double>? = null
                private var withinLimit: JsonField<Boolean>? = null
                private var mimeTypeSupported: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(twitter: Twitter) = apply {
                    maxSize = twitter.maxSize
                    withinLimit = twitter.withinLimit
                    mimeTypeSupported = twitter.mimeTypeSupported
                    additionalProperties = twitter.additionalProperties.toMutableMap()
                }

                /** Maximum file size in bytes */
                fun maxSize(maxSize: Double) = maxSize(JsonField.of(maxSize))

                /**
                 * Sets [Builder.maxSize] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxSize] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun maxSize(maxSize: JsonField<Double>) = apply { this.maxSize = maxSize }

                /** Whether file size is within limit */
                fun withinLimit(withinLimit: Boolean) = withinLimit(JsonField.of(withinLimit))

                /**
                 * Sets [Builder.withinLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.withinLimit] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun withinLimit(withinLimit: JsonField<Boolean>) = apply {
                    this.withinLimit = withinLimit
                }

                /** Whether the MIME type is supported by this platform */
                fun mimeTypeSupported(mimeTypeSupported: Boolean) =
                    mimeTypeSupported(JsonField.of(mimeTypeSupported))

                /**
                 * Sets [Builder.mimeTypeSupported] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mimeTypeSupported] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun mimeTypeSupported(mimeTypeSupported: JsonField<Boolean>) = apply {
                    this.mimeTypeSupported = mimeTypeSupported
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
                 * Returns an immutable instance of [Twitter].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .maxSize()
                 * .withinLimit()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Twitter =
                    Twitter(
                        checkRequired("maxSize", maxSize),
                        checkRequired("withinLimit", withinLimit),
                        mimeTypeSupported,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Twitter = apply {
                if (validated) {
                    return@apply
                }

                maxSize()
                withinLimit()
                mimeTypeSupported()
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
                (if (maxSize.asKnown().isPresent) 1 else 0) +
                    (if (withinLimit.asKnown().isPresent) 1 else 0) +
                    (if (mimeTypeSupported.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Twitter &&
                    maxSize == other.maxSize &&
                    withinLimit == other.withinLimit &&
                    mimeTypeSupported == other.mimeTypeSupported &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(maxSize, withinLimit, mimeTypeSupported, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Twitter{maxSize=$maxSize, withinLimit=$withinLimit, mimeTypeSupported=$mimeTypeSupported, additionalProperties=$additionalProperties}"
        }

        class Whatsapp
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val maxSize: JsonField<Double>,
            private val withinLimit: JsonField<Boolean>,
            private val mimeTypeSupported: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("max_size")
                @ExcludeMissing
                maxSize: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("within_limit")
                @ExcludeMissing
                withinLimit: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("mime_type_supported")
                @ExcludeMissing
                mimeTypeSupported: JsonField<Boolean> = JsonMissing.of(),
            ) : this(maxSize, withinLimit, mimeTypeSupported, mutableMapOf())

            /**
             * Maximum file size in bytes
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun maxSize(): Double = maxSize.getRequired("max_size")

            /**
             * Whether file size is within limit
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun withinLimit(): Boolean = withinLimit.getRequired("within_limit")

            /**
             * Whether the MIME type is supported by this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun mimeTypeSupported(): Optional<Boolean> =
                mimeTypeSupported.getOptional("mime_type_supported")

            /**
             * Returns the raw JSON value of [maxSize].
             *
             * Unlike [maxSize], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("max_size") @ExcludeMissing fun _maxSize(): JsonField<Double> = maxSize

            /**
             * Returns the raw JSON value of [withinLimit].
             *
             * Unlike [withinLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("within_limit")
            @ExcludeMissing
            fun _withinLimit(): JsonField<Boolean> = withinLimit

            /**
             * Returns the raw JSON value of [mimeTypeSupported].
             *
             * Unlike [mimeTypeSupported], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("mime_type_supported")
            @ExcludeMissing
            fun _mimeTypeSupported(): JsonField<Boolean> = mimeTypeSupported

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
                 * Returns a mutable builder for constructing an instance of [Whatsapp].
                 *
                 * The following fields are required:
                 * ```java
                 * .maxSize()
                 * .withinLimit()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Whatsapp]. */
            class Builder internal constructor() {

                private var maxSize: JsonField<Double>? = null
                private var withinLimit: JsonField<Boolean>? = null
                private var mimeTypeSupported: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(whatsapp: Whatsapp) = apply {
                    maxSize = whatsapp.maxSize
                    withinLimit = whatsapp.withinLimit
                    mimeTypeSupported = whatsapp.mimeTypeSupported
                    additionalProperties = whatsapp.additionalProperties.toMutableMap()
                }

                /** Maximum file size in bytes */
                fun maxSize(maxSize: Double) = maxSize(JsonField.of(maxSize))

                /**
                 * Sets [Builder.maxSize] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxSize] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun maxSize(maxSize: JsonField<Double>) = apply { this.maxSize = maxSize }

                /** Whether file size is within limit */
                fun withinLimit(withinLimit: Boolean) = withinLimit(JsonField.of(withinLimit))

                /**
                 * Sets [Builder.withinLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.withinLimit] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun withinLimit(withinLimit: JsonField<Boolean>) = apply {
                    this.withinLimit = withinLimit
                }

                /** Whether the MIME type is supported by this platform */
                fun mimeTypeSupported(mimeTypeSupported: Boolean) =
                    mimeTypeSupported(JsonField.of(mimeTypeSupported))

                /**
                 * Sets [Builder.mimeTypeSupported] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mimeTypeSupported] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun mimeTypeSupported(mimeTypeSupported: JsonField<Boolean>) = apply {
                    this.mimeTypeSupported = mimeTypeSupported
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
                 * Returns an immutable instance of [Whatsapp].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .maxSize()
                 * .withinLimit()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Whatsapp =
                    Whatsapp(
                        checkRequired("maxSize", maxSize),
                        checkRequired("withinLimit", withinLimit),
                        mimeTypeSupported,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Whatsapp = apply {
                if (validated) {
                    return@apply
                }

                maxSize()
                withinLimit()
                mimeTypeSupported()
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
                (if (maxSize.asKnown().isPresent) 1 else 0) +
                    (if (withinLimit.asKnown().isPresent) 1 else 0) +
                    (if (mimeTypeSupported.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Whatsapp &&
                    maxSize == other.maxSize &&
                    withinLimit == other.withinLimit &&
                    mimeTypeSupported == other.mimeTypeSupported &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(maxSize, withinLimit, mimeTypeSupported, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Whatsapp{maxSize=$maxSize, withinLimit=$withinLimit, mimeTypeSupported=$mimeTypeSupported, additionalProperties=$additionalProperties}"
        }

        class Youtube
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val maxSize: JsonField<Double>,
            private val withinLimit: JsonField<Boolean>,
            private val mimeTypeSupported: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("max_size")
                @ExcludeMissing
                maxSize: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("within_limit")
                @ExcludeMissing
                withinLimit: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("mime_type_supported")
                @ExcludeMissing
                mimeTypeSupported: JsonField<Boolean> = JsonMissing.of(),
            ) : this(maxSize, withinLimit, mimeTypeSupported, mutableMapOf())

            /**
             * Maximum file size in bytes
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun maxSize(): Double = maxSize.getRequired("max_size")

            /**
             * Whether file size is within limit
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun withinLimit(): Boolean = withinLimit.getRequired("within_limit")

            /**
             * Whether the MIME type is supported by this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun mimeTypeSupported(): Optional<Boolean> =
                mimeTypeSupported.getOptional("mime_type_supported")

            /**
             * Returns the raw JSON value of [maxSize].
             *
             * Unlike [maxSize], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("max_size") @ExcludeMissing fun _maxSize(): JsonField<Double> = maxSize

            /**
             * Returns the raw JSON value of [withinLimit].
             *
             * Unlike [withinLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("within_limit")
            @ExcludeMissing
            fun _withinLimit(): JsonField<Boolean> = withinLimit

            /**
             * Returns the raw JSON value of [mimeTypeSupported].
             *
             * Unlike [mimeTypeSupported], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("mime_type_supported")
            @ExcludeMissing
            fun _mimeTypeSupported(): JsonField<Boolean> = mimeTypeSupported

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
                 * Returns a mutable builder for constructing an instance of [Youtube].
                 *
                 * The following fields are required:
                 * ```java
                 * .maxSize()
                 * .withinLimit()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Youtube]. */
            class Builder internal constructor() {

                private var maxSize: JsonField<Double>? = null
                private var withinLimit: JsonField<Boolean>? = null
                private var mimeTypeSupported: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(youtube: Youtube) = apply {
                    maxSize = youtube.maxSize
                    withinLimit = youtube.withinLimit
                    mimeTypeSupported = youtube.mimeTypeSupported
                    additionalProperties = youtube.additionalProperties.toMutableMap()
                }

                /** Maximum file size in bytes */
                fun maxSize(maxSize: Double) = maxSize(JsonField.of(maxSize))

                /**
                 * Sets [Builder.maxSize] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxSize] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun maxSize(maxSize: JsonField<Double>) = apply { this.maxSize = maxSize }

                /** Whether file size is within limit */
                fun withinLimit(withinLimit: Boolean) = withinLimit(JsonField.of(withinLimit))

                /**
                 * Sets [Builder.withinLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.withinLimit] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun withinLimit(withinLimit: JsonField<Boolean>) = apply {
                    this.withinLimit = withinLimit
                }

                /** Whether the MIME type is supported by this platform */
                fun mimeTypeSupported(mimeTypeSupported: Boolean) =
                    mimeTypeSupported(JsonField.of(mimeTypeSupported))

                /**
                 * Sets [Builder.mimeTypeSupported] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mimeTypeSupported] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun mimeTypeSupported(mimeTypeSupported: JsonField<Boolean>) = apply {
                    this.mimeTypeSupported = mimeTypeSupported
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
                 * Returns an immutable instance of [Youtube].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .maxSize()
                 * .withinLimit()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Youtube =
                    Youtube(
                        checkRequired("maxSize", maxSize),
                        checkRequired("withinLimit", withinLimit),
                        mimeTypeSupported,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Youtube = apply {
                if (validated) {
                    return@apply
                }

                maxSize()
                withinLimit()
                mimeTypeSupported()
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
                (if (maxSize.asKnown().isPresent) 1 else 0) +
                    (if (withinLimit.asKnown().isPresent) 1 else 0) +
                    (if (mimeTypeSupported.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Youtube &&
                    maxSize == other.maxSize &&
                    withinLimit == other.withinLimit &&
                    mimeTypeSupported == other.mimeTypeSupported &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(maxSize, withinLimit, mimeTypeSupported, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Youtube{maxSize=$maxSize, withinLimit=$withinLimit, mimeTypeSupported=$mimeTypeSupported, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PlatformLimits &&
                bluesky == other.bluesky &&
                discord == other.discord &&
                facebook == other.facebook &&
                googlebusiness == other.googlebusiness &&
                instagram == other.instagram &&
                linkedin == other.linkedin &&
                mastodon == other.mastodon &&
                pinterest == other.pinterest &&
                reddit == other.reddit &&
                sms == other.sms &&
                snapchat == other.snapchat &&
                telegram == other.telegram &&
                threads == other.threads &&
                tiktok == other.tiktok &&
                twitter == other.twitter &&
                whatsapp == other.whatsapp &&
                youtube == other.youtube &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                bluesky,
                discord,
                facebook,
                googlebusiness,
                instagram,
                linkedin,
                mastodon,
                pinterest,
                reddit,
                sms,
                snapchat,
                telegram,
                threads,
                tiktok,
                twitter,
                whatsapp,
                youtube,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PlatformLimits{bluesky=$bluesky, discord=$discord, facebook=$facebook, googlebusiness=$googlebusiness, instagram=$instagram, linkedin=$linkedin, mastodon=$mastodon, pinterest=$pinterest, reddit=$reddit, sms=$sms, snapchat=$snapchat, telegram=$telegram, threads=$threads, tiktok=$tiktok, twitter=$twitter, whatsapp=$whatsapp, youtube=$youtube, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ValidateValidateMediaResponse &&
            accessible == other.accessible &&
            platformLimits == other.platformLimits &&
            contentType == other.contentType &&
            size == other.size &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(accessible, platformLimits, contentType, size, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ValidateValidateMediaResponse{accessible=$accessible, platformLimits=$platformLimits, contentType=$contentType, size=$size, additionalProperties=$additionalProperties}"
}
