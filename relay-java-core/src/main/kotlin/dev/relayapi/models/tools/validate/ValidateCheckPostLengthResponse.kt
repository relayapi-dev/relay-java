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

class ValidateCheckPostLengthResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val platforms: JsonField<Platforms>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("platforms")
        @ExcludeMissing
        platforms: JsonField<Platforms> = JsonMissing.of()
    ) : this(platforms, mutableMapOf())

    /**
     * Character count per platform
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun platforms(): Platforms = platforms.getRequired("platforms")

    /**
     * Returns the raw JSON value of [platforms].
     *
     * Unlike [platforms], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("platforms") @ExcludeMissing fun _platforms(): JsonField<Platforms> = platforms

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
         * [ValidateCheckPostLengthResponse].
         *
         * The following fields are required:
         * ```java
         * .platforms()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ValidateCheckPostLengthResponse]. */
    class Builder internal constructor() {

        private var platforms: JsonField<Platforms>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(validateCheckPostLengthResponse: ValidateCheckPostLengthResponse) =
            apply {
                platforms = validateCheckPostLengthResponse.platforms
                additionalProperties =
                    validateCheckPostLengthResponse.additionalProperties.toMutableMap()
            }

        /** Character count per platform */
        fun platforms(platforms: Platforms) = platforms(JsonField.of(platforms))

        /**
         * Sets [Builder.platforms] to an arbitrary JSON value.
         *
         * You should usually call [Builder.platforms] with a well-typed [Platforms] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun platforms(platforms: JsonField<Platforms>) = apply { this.platforms = platforms }

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
         * Returns an immutable instance of [ValidateCheckPostLengthResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .platforms()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ValidateCheckPostLengthResponse =
            ValidateCheckPostLengthResponse(
                checkRequired("platforms", platforms),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ValidateCheckPostLengthResponse = apply {
        if (validated) {
            return@apply
        }

        platforms().validate()
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
    @JvmSynthetic internal fun validity(): Int = (platforms.asKnown().getOrNull()?.validity() ?: 0)

    /** Character count per platform */
    class Platforms
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val beehiiv: JsonField<Beehiiv>,
        private val bluesky: JsonField<Bluesky>,
        private val convertkit: JsonField<Convertkit>,
        private val discord: JsonField<Discord>,
        private val facebook: JsonField<Facebook>,
        private val googlebusiness: JsonField<Googlebusiness>,
        private val instagram: JsonField<Instagram>,
        private val linkedin: JsonField<Linkedin>,
        private val listmonk: JsonField<Listmonk>,
        private val mailchimp: JsonField<Mailchimp>,
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
            @JsonProperty("beehiiv") @ExcludeMissing beehiiv: JsonField<Beehiiv> = JsonMissing.of(),
            @JsonProperty("bluesky") @ExcludeMissing bluesky: JsonField<Bluesky> = JsonMissing.of(),
            @JsonProperty("convertkit")
            @ExcludeMissing
            convertkit: JsonField<Convertkit> = JsonMissing.of(),
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
            @JsonProperty("listmonk")
            @ExcludeMissing
            listmonk: JsonField<Listmonk> = JsonMissing.of(),
            @JsonProperty("mailchimp")
            @ExcludeMissing
            mailchimp: JsonField<Mailchimp> = JsonMissing.of(),
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
            beehiiv,
            bluesky,
            convertkit,
            discord,
            facebook,
            googlebusiness,
            instagram,
            linkedin,
            listmonk,
            mailchimp,
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
        fun beehiiv(): Optional<Beehiiv> = beehiiv.getOptional("beehiiv")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun bluesky(): Optional<Bluesky> = bluesky.getOptional("bluesky")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun convertkit(): Optional<Convertkit> = convertkit.getOptional("convertkit")

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
        fun listmonk(): Optional<Listmonk> = listmonk.getOptional("listmonk")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mailchimp(): Optional<Mailchimp> = mailchimp.getOptional("mailchimp")

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
         * Returns the raw JSON value of [beehiiv].
         *
         * Unlike [beehiiv], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("beehiiv") @ExcludeMissing fun _beehiiv(): JsonField<Beehiiv> = beehiiv

        /**
         * Returns the raw JSON value of [bluesky].
         *
         * Unlike [bluesky], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bluesky") @ExcludeMissing fun _bluesky(): JsonField<Bluesky> = bluesky

        /**
         * Returns the raw JSON value of [convertkit].
         *
         * Unlike [convertkit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("convertkit")
        @ExcludeMissing
        fun _convertkit(): JsonField<Convertkit> = convertkit

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
         * Returns the raw JSON value of [listmonk].
         *
         * Unlike [listmonk], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("listmonk") @ExcludeMissing fun _listmonk(): JsonField<Listmonk> = listmonk

        /**
         * Returns the raw JSON value of [mailchimp].
         *
         * Unlike [mailchimp], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mailchimp")
        @ExcludeMissing
        fun _mailchimp(): JsonField<Mailchimp> = mailchimp

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

            /** Returns a mutable builder for constructing an instance of [Platforms]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Platforms]. */
        class Builder internal constructor() {

            private var beehiiv: JsonField<Beehiiv> = JsonMissing.of()
            private var bluesky: JsonField<Bluesky> = JsonMissing.of()
            private var convertkit: JsonField<Convertkit> = JsonMissing.of()
            private var discord: JsonField<Discord> = JsonMissing.of()
            private var facebook: JsonField<Facebook> = JsonMissing.of()
            private var googlebusiness: JsonField<Googlebusiness> = JsonMissing.of()
            private var instagram: JsonField<Instagram> = JsonMissing.of()
            private var linkedin: JsonField<Linkedin> = JsonMissing.of()
            private var listmonk: JsonField<Listmonk> = JsonMissing.of()
            private var mailchimp: JsonField<Mailchimp> = JsonMissing.of()
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
            internal fun from(platforms: Platforms) = apply {
                beehiiv = platforms.beehiiv
                bluesky = platforms.bluesky
                convertkit = platforms.convertkit
                discord = platforms.discord
                facebook = platforms.facebook
                googlebusiness = platforms.googlebusiness
                instagram = platforms.instagram
                linkedin = platforms.linkedin
                listmonk = platforms.listmonk
                mailchimp = platforms.mailchimp
                mastodon = platforms.mastodon
                pinterest = platforms.pinterest
                reddit = platforms.reddit
                sms = platforms.sms
                snapchat = platforms.snapchat
                telegram = platforms.telegram
                threads = platforms.threads
                tiktok = platforms.tiktok
                twitter = platforms.twitter
                whatsapp = platforms.whatsapp
                youtube = platforms.youtube
                additionalProperties = platforms.additionalProperties.toMutableMap()
            }

            fun beehiiv(beehiiv: Beehiiv) = beehiiv(JsonField.of(beehiiv))

            /**
             * Sets [Builder.beehiiv] to an arbitrary JSON value.
             *
             * You should usually call [Builder.beehiiv] with a well-typed [Beehiiv] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun beehiiv(beehiiv: JsonField<Beehiiv>) = apply { this.beehiiv = beehiiv }

            fun bluesky(bluesky: Bluesky) = bluesky(JsonField.of(bluesky))

            /**
             * Sets [Builder.bluesky] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bluesky] with a well-typed [Bluesky] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bluesky(bluesky: JsonField<Bluesky>) = apply { this.bluesky = bluesky }

            fun convertkit(convertkit: Convertkit) = convertkit(JsonField.of(convertkit))

            /**
             * Sets [Builder.convertkit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.convertkit] with a well-typed [Convertkit] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun convertkit(convertkit: JsonField<Convertkit>) = apply {
                this.convertkit = convertkit
            }

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

            fun listmonk(listmonk: Listmonk) = listmonk(JsonField.of(listmonk))

            /**
             * Sets [Builder.listmonk] to an arbitrary JSON value.
             *
             * You should usually call [Builder.listmonk] with a well-typed [Listmonk] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun listmonk(listmonk: JsonField<Listmonk>) = apply { this.listmonk = listmonk }

            fun mailchimp(mailchimp: Mailchimp) = mailchimp(JsonField.of(mailchimp))

            /**
             * Sets [Builder.mailchimp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mailchimp] with a well-typed [Mailchimp] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mailchimp(mailchimp: JsonField<Mailchimp>) = apply { this.mailchimp = mailchimp }

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
             * Returns an immutable instance of [Platforms].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Platforms =
                Platforms(
                    beehiiv,
                    bluesky,
                    convertkit,
                    discord,
                    facebook,
                    googlebusiness,
                    instagram,
                    linkedin,
                    listmonk,
                    mailchimp,
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

        fun validate(): Platforms = apply {
            if (validated) {
                return@apply
            }

            beehiiv().ifPresent { it.validate() }
            bluesky().ifPresent { it.validate() }
            convertkit().ifPresent { it.validate() }
            discord().ifPresent { it.validate() }
            facebook().ifPresent { it.validate() }
            googlebusiness().ifPresent { it.validate() }
            instagram().ifPresent { it.validate() }
            linkedin().ifPresent { it.validate() }
            listmonk().ifPresent { it.validate() }
            mailchimp().ifPresent { it.validate() }
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
            (beehiiv.asKnown().getOrNull()?.validity() ?: 0) +
                (bluesky.asKnown().getOrNull()?.validity() ?: 0) +
                (convertkit.asKnown().getOrNull()?.validity() ?: 0) +
                (discord.asKnown().getOrNull()?.validity() ?: 0) +
                (facebook.asKnown().getOrNull()?.validity() ?: 0) +
                (googlebusiness.asKnown().getOrNull()?.validity() ?: 0) +
                (instagram.asKnown().getOrNull()?.validity() ?: 0) +
                (linkedin.asKnown().getOrNull()?.validity() ?: 0) +
                (listmonk.asKnown().getOrNull()?.validity() ?: 0) +
                (mailchimp.asKnown().getOrNull()?.validity() ?: 0) +
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

        class Beehiiv
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val count: JsonField<Double>,
            private val limit: JsonField<Double>,
            private val withinLimit: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("count") @ExcludeMissing count: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("limit") @ExcludeMissing limit: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("within_limit")
                @ExcludeMissing
                withinLimit: JsonField<Boolean> = JsonMissing.of(),
            ) : this(count, limit, withinLimit, mutableMapOf())

            /**
             * Character count for this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun count(): Double = count.getRequired("count")

            /**
             * Character limit for this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun limit(): Double = limit.getRequired("limit")

            /**
             * Whether content is within limit
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun withinLimit(): Boolean = withinLimit.getRequired("within_limit")

            /**
             * Returns the raw JSON value of [count].
             *
             * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Double> = count

            /**
             * Returns the raw JSON value of [limit].
             *
             * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Double> = limit

            /**
             * Returns the raw JSON value of [withinLimit].
             *
             * Unlike [withinLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("within_limit")
            @ExcludeMissing
            fun _withinLimit(): JsonField<Boolean> = withinLimit

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
                 * Returns a mutable builder for constructing an instance of [Beehiiv].
                 *
                 * The following fields are required:
                 * ```java
                 * .count()
                 * .limit()
                 * .withinLimit()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Beehiiv]. */
            class Builder internal constructor() {

                private var count: JsonField<Double>? = null
                private var limit: JsonField<Double>? = null
                private var withinLimit: JsonField<Boolean>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(beehiiv: Beehiiv) = apply {
                    count = beehiiv.count
                    limit = beehiiv.limit
                    withinLimit = beehiiv.withinLimit
                    additionalProperties = beehiiv.additionalProperties.toMutableMap()
                }

                /** Character count for this platform */
                fun count(count: Double) = count(JsonField.of(count))

                /**
                 * Sets [Builder.count] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.count] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun count(count: JsonField<Double>) = apply { this.count = count }

                /** Character limit for this platform */
                fun limit(limit: Double) = limit(JsonField.of(limit))

                /**
                 * Sets [Builder.limit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.limit] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun limit(limit: JsonField<Double>) = apply { this.limit = limit }

                /** Whether content is within limit */
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
                 * Returns an immutable instance of [Beehiiv].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .count()
                 * .limit()
                 * .withinLimit()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Beehiiv =
                    Beehiiv(
                        checkRequired("count", count),
                        checkRequired("limit", limit),
                        checkRequired("withinLimit", withinLimit),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Beehiiv = apply {
                if (validated) {
                    return@apply
                }

                count()
                limit()
                withinLimit()
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
                (if (count.asKnown().isPresent) 1 else 0) +
                    (if (limit.asKnown().isPresent) 1 else 0) +
                    (if (withinLimit.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Beehiiv &&
                    count == other.count &&
                    limit == other.limit &&
                    withinLimit == other.withinLimit &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(count, limit, withinLimit, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Beehiiv{count=$count, limit=$limit, withinLimit=$withinLimit, additionalProperties=$additionalProperties}"
        }

        class Bluesky
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val count: JsonField<Double>,
            private val limit: JsonField<Double>,
            private val withinLimit: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("count") @ExcludeMissing count: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("limit") @ExcludeMissing limit: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("within_limit")
                @ExcludeMissing
                withinLimit: JsonField<Boolean> = JsonMissing.of(),
            ) : this(count, limit, withinLimit, mutableMapOf())

            /**
             * Character count for this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun count(): Double = count.getRequired("count")

            /**
             * Character limit for this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun limit(): Double = limit.getRequired("limit")

            /**
             * Whether content is within limit
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun withinLimit(): Boolean = withinLimit.getRequired("within_limit")

            /**
             * Returns the raw JSON value of [count].
             *
             * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Double> = count

            /**
             * Returns the raw JSON value of [limit].
             *
             * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Double> = limit

            /**
             * Returns the raw JSON value of [withinLimit].
             *
             * Unlike [withinLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("within_limit")
            @ExcludeMissing
            fun _withinLimit(): JsonField<Boolean> = withinLimit

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
                 * .count()
                 * .limit()
                 * .withinLimit()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Bluesky]. */
            class Builder internal constructor() {

                private var count: JsonField<Double>? = null
                private var limit: JsonField<Double>? = null
                private var withinLimit: JsonField<Boolean>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(bluesky: Bluesky) = apply {
                    count = bluesky.count
                    limit = bluesky.limit
                    withinLimit = bluesky.withinLimit
                    additionalProperties = bluesky.additionalProperties.toMutableMap()
                }

                /** Character count for this platform */
                fun count(count: Double) = count(JsonField.of(count))

                /**
                 * Sets [Builder.count] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.count] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun count(count: JsonField<Double>) = apply { this.count = count }

                /** Character limit for this platform */
                fun limit(limit: Double) = limit(JsonField.of(limit))

                /**
                 * Sets [Builder.limit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.limit] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun limit(limit: JsonField<Double>) = apply { this.limit = limit }

                /** Whether content is within limit */
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
                 * .count()
                 * .limit()
                 * .withinLimit()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Bluesky =
                    Bluesky(
                        checkRequired("count", count),
                        checkRequired("limit", limit),
                        checkRequired("withinLimit", withinLimit),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Bluesky = apply {
                if (validated) {
                    return@apply
                }

                count()
                limit()
                withinLimit()
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
                (if (count.asKnown().isPresent) 1 else 0) +
                    (if (limit.asKnown().isPresent) 1 else 0) +
                    (if (withinLimit.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Bluesky &&
                    count == other.count &&
                    limit == other.limit &&
                    withinLimit == other.withinLimit &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(count, limit, withinLimit, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Bluesky{count=$count, limit=$limit, withinLimit=$withinLimit, additionalProperties=$additionalProperties}"
        }

        class Convertkit
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val count: JsonField<Double>,
            private val limit: JsonField<Double>,
            private val withinLimit: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("count") @ExcludeMissing count: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("limit") @ExcludeMissing limit: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("within_limit")
                @ExcludeMissing
                withinLimit: JsonField<Boolean> = JsonMissing.of(),
            ) : this(count, limit, withinLimit, mutableMapOf())

            /**
             * Character count for this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun count(): Double = count.getRequired("count")

            /**
             * Character limit for this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun limit(): Double = limit.getRequired("limit")

            /**
             * Whether content is within limit
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun withinLimit(): Boolean = withinLimit.getRequired("within_limit")

            /**
             * Returns the raw JSON value of [count].
             *
             * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Double> = count

            /**
             * Returns the raw JSON value of [limit].
             *
             * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Double> = limit

            /**
             * Returns the raw JSON value of [withinLimit].
             *
             * Unlike [withinLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("within_limit")
            @ExcludeMissing
            fun _withinLimit(): JsonField<Boolean> = withinLimit

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
                 * Returns a mutable builder for constructing an instance of [Convertkit].
                 *
                 * The following fields are required:
                 * ```java
                 * .count()
                 * .limit()
                 * .withinLimit()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Convertkit]. */
            class Builder internal constructor() {

                private var count: JsonField<Double>? = null
                private var limit: JsonField<Double>? = null
                private var withinLimit: JsonField<Boolean>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(convertkit: Convertkit) = apply {
                    count = convertkit.count
                    limit = convertkit.limit
                    withinLimit = convertkit.withinLimit
                    additionalProperties = convertkit.additionalProperties.toMutableMap()
                }

                /** Character count for this platform */
                fun count(count: Double) = count(JsonField.of(count))

                /**
                 * Sets [Builder.count] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.count] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun count(count: JsonField<Double>) = apply { this.count = count }

                /** Character limit for this platform */
                fun limit(limit: Double) = limit(JsonField.of(limit))

                /**
                 * Sets [Builder.limit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.limit] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun limit(limit: JsonField<Double>) = apply { this.limit = limit }

                /** Whether content is within limit */
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
                 * Returns an immutable instance of [Convertkit].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .count()
                 * .limit()
                 * .withinLimit()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Convertkit =
                    Convertkit(
                        checkRequired("count", count),
                        checkRequired("limit", limit),
                        checkRequired("withinLimit", withinLimit),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Convertkit = apply {
                if (validated) {
                    return@apply
                }

                count()
                limit()
                withinLimit()
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
                (if (count.asKnown().isPresent) 1 else 0) +
                    (if (limit.asKnown().isPresent) 1 else 0) +
                    (if (withinLimit.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Convertkit &&
                    count == other.count &&
                    limit == other.limit &&
                    withinLimit == other.withinLimit &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(count, limit, withinLimit, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Convertkit{count=$count, limit=$limit, withinLimit=$withinLimit, additionalProperties=$additionalProperties}"
        }

        class Discord
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val count: JsonField<Double>,
            private val limit: JsonField<Double>,
            private val withinLimit: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("count") @ExcludeMissing count: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("limit") @ExcludeMissing limit: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("within_limit")
                @ExcludeMissing
                withinLimit: JsonField<Boolean> = JsonMissing.of(),
            ) : this(count, limit, withinLimit, mutableMapOf())

            /**
             * Character count for this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun count(): Double = count.getRequired("count")

            /**
             * Character limit for this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun limit(): Double = limit.getRequired("limit")

            /**
             * Whether content is within limit
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun withinLimit(): Boolean = withinLimit.getRequired("within_limit")

            /**
             * Returns the raw JSON value of [count].
             *
             * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Double> = count

            /**
             * Returns the raw JSON value of [limit].
             *
             * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Double> = limit

            /**
             * Returns the raw JSON value of [withinLimit].
             *
             * Unlike [withinLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("within_limit")
            @ExcludeMissing
            fun _withinLimit(): JsonField<Boolean> = withinLimit

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
                 * .count()
                 * .limit()
                 * .withinLimit()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Discord]. */
            class Builder internal constructor() {

                private var count: JsonField<Double>? = null
                private var limit: JsonField<Double>? = null
                private var withinLimit: JsonField<Boolean>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(discord: Discord) = apply {
                    count = discord.count
                    limit = discord.limit
                    withinLimit = discord.withinLimit
                    additionalProperties = discord.additionalProperties.toMutableMap()
                }

                /** Character count for this platform */
                fun count(count: Double) = count(JsonField.of(count))

                /**
                 * Sets [Builder.count] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.count] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun count(count: JsonField<Double>) = apply { this.count = count }

                /** Character limit for this platform */
                fun limit(limit: Double) = limit(JsonField.of(limit))

                /**
                 * Sets [Builder.limit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.limit] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun limit(limit: JsonField<Double>) = apply { this.limit = limit }

                /** Whether content is within limit */
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
                 * .count()
                 * .limit()
                 * .withinLimit()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Discord =
                    Discord(
                        checkRequired("count", count),
                        checkRequired("limit", limit),
                        checkRequired("withinLimit", withinLimit),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Discord = apply {
                if (validated) {
                    return@apply
                }

                count()
                limit()
                withinLimit()
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
                (if (count.asKnown().isPresent) 1 else 0) +
                    (if (limit.asKnown().isPresent) 1 else 0) +
                    (if (withinLimit.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Discord &&
                    count == other.count &&
                    limit == other.limit &&
                    withinLimit == other.withinLimit &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(count, limit, withinLimit, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Discord{count=$count, limit=$limit, withinLimit=$withinLimit, additionalProperties=$additionalProperties}"
        }

        class Facebook
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val count: JsonField<Double>,
            private val limit: JsonField<Double>,
            private val withinLimit: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("count") @ExcludeMissing count: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("limit") @ExcludeMissing limit: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("within_limit")
                @ExcludeMissing
                withinLimit: JsonField<Boolean> = JsonMissing.of(),
            ) : this(count, limit, withinLimit, mutableMapOf())

            /**
             * Character count for this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun count(): Double = count.getRequired("count")

            /**
             * Character limit for this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun limit(): Double = limit.getRequired("limit")

            /**
             * Whether content is within limit
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun withinLimit(): Boolean = withinLimit.getRequired("within_limit")

            /**
             * Returns the raw JSON value of [count].
             *
             * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Double> = count

            /**
             * Returns the raw JSON value of [limit].
             *
             * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Double> = limit

            /**
             * Returns the raw JSON value of [withinLimit].
             *
             * Unlike [withinLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("within_limit")
            @ExcludeMissing
            fun _withinLimit(): JsonField<Boolean> = withinLimit

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
                 * .count()
                 * .limit()
                 * .withinLimit()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Facebook]. */
            class Builder internal constructor() {

                private var count: JsonField<Double>? = null
                private var limit: JsonField<Double>? = null
                private var withinLimit: JsonField<Boolean>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(facebook: Facebook) = apply {
                    count = facebook.count
                    limit = facebook.limit
                    withinLimit = facebook.withinLimit
                    additionalProperties = facebook.additionalProperties.toMutableMap()
                }

                /** Character count for this platform */
                fun count(count: Double) = count(JsonField.of(count))

                /**
                 * Sets [Builder.count] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.count] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun count(count: JsonField<Double>) = apply { this.count = count }

                /** Character limit for this platform */
                fun limit(limit: Double) = limit(JsonField.of(limit))

                /**
                 * Sets [Builder.limit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.limit] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun limit(limit: JsonField<Double>) = apply { this.limit = limit }

                /** Whether content is within limit */
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
                 * .count()
                 * .limit()
                 * .withinLimit()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Facebook =
                    Facebook(
                        checkRequired("count", count),
                        checkRequired("limit", limit),
                        checkRequired("withinLimit", withinLimit),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Facebook = apply {
                if (validated) {
                    return@apply
                }

                count()
                limit()
                withinLimit()
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
                (if (count.asKnown().isPresent) 1 else 0) +
                    (if (limit.asKnown().isPresent) 1 else 0) +
                    (if (withinLimit.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Facebook &&
                    count == other.count &&
                    limit == other.limit &&
                    withinLimit == other.withinLimit &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(count, limit, withinLimit, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Facebook{count=$count, limit=$limit, withinLimit=$withinLimit, additionalProperties=$additionalProperties}"
        }

        class Googlebusiness
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val count: JsonField<Double>,
            private val limit: JsonField<Double>,
            private val withinLimit: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("count") @ExcludeMissing count: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("limit") @ExcludeMissing limit: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("within_limit")
                @ExcludeMissing
                withinLimit: JsonField<Boolean> = JsonMissing.of(),
            ) : this(count, limit, withinLimit, mutableMapOf())

            /**
             * Character count for this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun count(): Double = count.getRequired("count")

            /**
             * Character limit for this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun limit(): Double = limit.getRequired("limit")

            /**
             * Whether content is within limit
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun withinLimit(): Boolean = withinLimit.getRequired("within_limit")

            /**
             * Returns the raw JSON value of [count].
             *
             * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Double> = count

            /**
             * Returns the raw JSON value of [limit].
             *
             * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Double> = limit

            /**
             * Returns the raw JSON value of [withinLimit].
             *
             * Unlike [withinLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("within_limit")
            @ExcludeMissing
            fun _withinLimit(): JsonField<Boolean> = withinLimit

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
                 * .count()
                 * .limit()
                 * .withinLimit()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Googlebusiness]. */
            class Builder internal constructor() {

                private var count: JsonField<Double>? = null
                private var limit: JsonField<Double>? = null
                private var withinLimit: JsonField<Boolean>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(googlebusiness: Googlebusiness) = apply {
                    count = googlebusiness.count
                    limit = googlebusiness.limit
                    withinLimit = googlebusiness.withinLimit
                    additionalProperties = googlebusiness.additionalProperties.toMutableMap()
                }

                /** Character count for this platform */
                fun count(count: Double) = count(JsonField.of(count))

                /**
                 * Sets [Builder.count] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.count] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun count(count: JsonField<Double>) = apply { this.count = count }

                /** Character limit for this platform */
                fun limit(limit: Double) = limit(JsonField.of(limit))

                /**
                 * Sets [Builder.limit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.limit] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun limit(limit: JsonField<Double>) = apply { this.limit = limit }

                /** Whether content is within limit */
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
                 * .count()
                 * .limit()
                 * .withinLimit()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Googlebusiness =
                    Googlebusiness(
                        checkRequired("count", count),
                        checkRequired("limit", limit),
                        checkRequired("withinLimit", withinLimit),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Googlebusiness = apply {
                if (validated) {
                    return@apply
                }

                count()
                limit()
                withinLimit()
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
                (if (count.asKnown().isPresent) 1 else 0) +
                    (if (limit.asKnown().isPresent) 1 else 0) +
                    (if (withinLimit.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Googlebusiness &&
                    count == other.count &&
                    limit == other.limit &&
                    withinLimit == other.withinLimit &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(count, limit, withinLimit, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Googlebusiness{count=$count, limit=$limit, withinLimit=$withinLimit, additionalProperties=$additionalProperties}"
        }

        class Instagram
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val count: JsonField<Double>,
            private val limit: JsonField<Double>,
            private val withinLimit: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("count") @ExcludeMissing count: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("limit") @ExcludeMissing limit: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("within_limit")
                @ExcludeMissing
                withinLimit: JsonField<Boolean> = JsonMissing.of(),
            ) : this(count, limit, withinLimit, mutableMapOf())

            /**
             * Character count for this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun count(): Double = count.getRequired("count")

            /**
             * Character limit for this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun limit(): Double = limit.getRequired("limit")

            /**
             * Whether content is within limit
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun withinLimit(): Boolean = withinLimit.getRequired("within_limit")

            /**
             * Returns the raw JSON value of [count].
             *
             * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Double> = count

            /**
             * Returns the raw JSON value of [limit].
             *
             * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Double> = limit

            /**
             * Returns the raw JSON value of [withinLimit].
             *
             * Unlike [withinLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("within_limit")
            @ExcludeMissing
            fun _withinLimit(): JsonField<Boolean> = withinLimit

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
                 * .count()
                 * .limit()
                 * .withinLimit()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Instagram]. */
            class Builder internal constructor() {

                private var count: JsonField<Double>? = null
                private var limit: JsonField<Double>? = null
                private var withinLimit: JsonField<Boolean>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(instagram: Instagram) = apply {
                    count = instagram.count
                    limit = instagram.limit
                    withinLimit = instagram.withinLimit
                    additionalProperties = instagram.additionalProperties.toMutableMap()
                }

                /** Character count for this platform */
                fun count(count: Double) = count(JsonField.of(count))

                /**
                 * Sets [Builder.count] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.count] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun count(count: JsonField<Double>) = apply { this.count = count }

                /** Character limit for this platform */
                fun limit(limit: Double) = limit(JsonField.of(limit))

                /**
                 * Sets [Builder.limit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.limit] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun limit(limit: JsonField<Double>) = apply { this.limit = limit }

                /** Whether content is within limit */
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
                 * .count()
                 * .limit()
                 * .withinLimit()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Instagram =
                    Instagram(
                        checkRequired("count", count),
                        checkRequired("limit", limit),
                        checkRequired("withinLimit", withinLimit),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Instagram = apply {
                if (validated) {
                    return@apply
                }

                count()
                limit()
                withinLimit()
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
                (if (count.asKnown().isPresent) 1 else 0) +
                    (if (limit.asKnown().isPresent) 1 else 0) +
                    (if (withinLimit.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Instagram &&
                    count == other.count &&
                    limit == other.limit &&
                    withinLimit == other.withinLimit &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(count, limit, withinLimit, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Instagram{count=$count, limit=$limit, withinLimit=$withinLimit, additionalProperties=$additionalProperties}"
        }

        class Linkedin
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val count: JsonField<Double>,
            private val limit: JsonField<Double>,
            private val withinLimit: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("count") @ExcludeMissing count: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("limit") @ExcludeMissing limit: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("within_limit")
                @ExcludeMissing
                withinLimit: JsonField<Boolean> = JsonMissing.of(),
            ) : this(count, limit, withinLimit, mutableMapOf())

            /**
             * Character count for this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun count(): Double = count.getRequired("count")

            /**
             * Character limit for this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun limit(): Double = limit.getRequired("limit")

            /**
             * Whether content is within limit
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun withinLimit(): Boolean = withinLimit.getRequired("within_limit")

            /**
             * Returns the raw JSON value of [count].
             *
             * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Double> = count

            /**
             * Returns the raw JSON value of [limit].
             *
             * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Double> = limit

            /**
             * Returns the raw JSON value of [withinLimit].
             *
             * Unlike [withinLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("within_limit")
            @ExcludeMissing
            fun _withinLimit(): JsonField<Boolean> = withinLimit

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
                 * .count()
                 * .limit()
                 * .withinLimit()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Linkedin]. */
            class Builder internal constructor() {

                private var count: JsonField<Double>? = null
                private var limit: JsonField<Double>? = null
                private var withinLimit: JsonField<Boolean>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(linkedin: Linkedin) = apply {
                    count = linkedin.count
                    limit = linkedin.limit
                    withinLimit = linkedin.withinLimit
                    additionalProperties = linkedin.additionalProperties.toMutableMap()
                }

                /** Character count for this platform */
                fun count(count: Double) = count(JsonField.of(count))

                /**
                 * Sets [Builder.count] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.count] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun count(count: JsonField<Double>) = apply { this.count = count }

                /** Character limit for this platform */
                fun limit(limit: Double) = limit(JsonField.of(limit))

                /**
                 * Sets [Builder.limit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.limit] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun limit(limit: JsonField<Double>) = apply { this.limit = limit }

                /** Whether content is within limit */
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
                 * .count()
                 * .limit()
                 * .withinLimit()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Linkedin =
                    Linkedin(
                        checkRequired("count", count),
                        checkRequired("limit", limit),
                        checkRequired("withinLimit", withinLimit),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Linkedin = apply {
                if (validated) {
                    return@apply
                }

                count()
                limit()
                withinLimit()
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
                (if (count.asKnown().isPresent) 1 else 0) +
                    (if (limit.asKnown().isPresent) 1 else 0) +
                    (if (withinLimit.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Linkedin &&
                    count == other.count &&
                    limit == other.limit &&
                    withinLimit == other.withinLimit &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(count, limit, withinLimit, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Linkedin{count=$count, limit=$limit, withinLimit=$withinLimit, additionalProperties=$additionalProperties}"
        }

        class Listmonk
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val count: JsonField<Double>,
            private val limit: JsonField<Double>,
            private val withinLimit: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("count") @ExcludeMissing count: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("limit") @ExcludeMissing limit: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("within_limit")
                @ExcludeMissing
                withinLimit: JsonField<Boolean> = JsonMissing.of(),
            ) : this(count, limit, withinLimit, mutableMapOf())

            /**
             * Character count for this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun count(): Double = count.getRequired("count")

            /**
             * Character limit for this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun limit(): Double = limit.getRequired("limit")

            /**
             * Whether content is within limit
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun withinLimit(): Boolean = withinLimit.getRequired("within_limit")

            /**
             * Returns the raw JSON value of [count].
             *
             * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Double> = count

            /**
             * Returns the raw JSON value of [limit].
             *
             * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Double> = limit

            /**
             * Returns the raw JSON value of [withinLimit].
             *
             * Unlike [withinLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("within_limit")
            @ExcludeMissing
            fun _withinLimit(): JsonField<Boolean> = withinLimit

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
                 * Returns a mutable builder for constructing an instance of [Listmonk].
                 *
                 * The following fields are required:
                 * ```java
                 * .count()
                 * .limit()
                 * .withinLimit()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Listmonk]. */
            class Builder internal constructor() {

                private var count: JsonField<Double>? = null
                private var limit: JsonField<Double>? = null
                private var withinLimit: JsonField<Boolean>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(listmonk: Listmonk) = apply {
                    count = listmonk.count
                    limit = listmonk.limit
                    withinLimit = listmonk.withinLimit
                    additionalProperties = listmonk.additionalProperties.toMutableMap()
                }

                /** Character count for this platform */
                fun count(count: Double) = count(JsonField.of(count))

                /**
                 * Sets [Builder.count] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.count] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun count(count: JsonField<Double>) = apply { this.count = count }

                /** Character limit for this platform */
                fun limit(limit: Double) = limit(JsonField.of(limit))

                /**
                 * Sets [Builder.limit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.limit] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun limit(limit: JsonField<Double>) = apply { this.limit = limit }

                /** Whether content is within limit */
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
                 * Returns an immutable instance of [Listmonk].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .count()
                 * .limit()
                 * .withinLimit()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Listmonk =
                    Listmonk(
                        checkRequired("count", count),
                        checkRequired("limit", limit),
                        checkRequired("withinLimit", withinLimit),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Listmonk = apply {
                if (validated) {
                    return@apply
                }

                count()
                limit()
                withinLimit()
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
                (if (count.asKnown().isPresent) 1 else 0) +
                    (if (limit.asKnown().isPresent) 1 else 0) +
                    (if (withinLimit.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Listmonk &&
                    count == other.count &&
                    limit == other.limit &&
                    withinLimit == other.withinLimit &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(count, limit, withinLimit, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Listmonk{count=$count, limit=$limit, withinLimit=$withinLimit, additionalProperties=$additionalProperties}"
        }

        class Mailchimp
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val count: JsonField<Double>,
            private val limit: JsonField<Double>,
            private val withinLimit: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("count") @ExcludeMissing count: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("limit") @ExcludeMissing limit: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("within_limit")
                @ExcludeMissing
                withinLimit: JsonField<Boolean> = JsonMissing.of(),
            ) : this(count, limit, withinLimit, mutableMapOf())

            /**
             * Character count for this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun count(): Double = count.getRequired("count")

            /**
             * Character limit for this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun limit(): Double = limit.getRequired("limit")

            /**
             * Whether content is within limit
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun withinLimit(): Boolean = withinLimit.getRequired("within_limit")

            /**
             * Returns the raw JSON value of [count].
             *
             * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Double> = count

            /**
             * Returns the raw JSON value of [limit].
             *
             * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Double> = limit

            /**
             * Returns the raw JSON value of [withinLimit].
             *
             * Unlike [withinLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("within_limit")
            @ExcludeMissing
            fun _withinLimit(): JsonField<Boolean> = withinLimit

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
                 * Returns a mutable builder for constructing an instance of [Mailchimp].
                 *
                 * The following fields are required:
                 * ```java
                 * .count()
                 * .limit()
                 * .withinLimit()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Mailchimp]. */
            class Builder internal constructor() {

                private var count: JsonField<Double>? = null
                private var limit: JsonField<Double>? = null
                private var withinLimit: JsonField<Boolean>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(mailchimp: Mailchimp) = apply {
                    count = mailchimp.count
                    limit = mailchimp.limit
                    withinLimit = mailchimp.withinLimit
                    additionalProperties = mailchimp.additionalProperties.toMutableMap()
                }

                /** Character count for this platform */
                fun count(count: Double) = count(JsonField.of(count))

                /**
                 * Sets [Builder.count] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.count] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun count(count: JsonField<Double>) = apply { this.count = count }

                /** Character limit for this platform */
                fun limit(limit: Double) = limit(JsonField.of(limit))

                /**
                 * Sets [Builder.limit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.limit] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun limit(limit: JsonField<Double>) = apply { this.limit = limit }

                /** Whether content is within limit */
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
                 * Returns an immutable instance of [Mailchimp].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .count()
                 * .limit()
                 * .withinLimit()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Mailchimp =
                    Mailchimp(
                        checkRequired("count", count),
                        checkRequired("limit", limit),
                        checkRequired("withinLimit", withinLimit),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Mailchimp = apply {
                if (validated) {
                    return@apply
                }

                count()
                limit()
                withinLimit()
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
                (if (count.asKnown().isPresent) 1 else 0) +
                    (if (limit.asKnown().isPresent) 1 else 0) +
                    (if (withinLimit.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Mailchimp &&
                    count == other.count &&
                    limit == other.limit &&
                    withinLimit == other.withinLimit &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(count, limit, withinLimit, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Mailchimp{count=$count, limit=$limit, withinLimit=$withinLimit, additionalProperties=$additionalProperties}"
        }

        class Mastodon
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val count: JsonField<Double>,
            private val limit: JsonField<Double>,
            private val withinLimit: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("count") @ExcludeMissing count: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("limit") @ExcludeMissing limit: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("within_limit")
                @ExcludeMissing
                withinLimit: JsonField<Boolean> = JsonMissing.of(),
            ) : this(count, limit, withinLimit, mutableMapOf())

            /**
             * Character count for this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun count(): Double = count.getRequired("count")

            /**
             * Character limit for this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun limit(): Double = limit.getRequired("limit")

            /**
             * Whether content is within limit
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun withinLimit(): Boolean = withinLimit.getRequired("within_limit")

            /**
             * Returns the raw JSON value of [count].
             *
             * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Double> = count

            /**
             * Returns the raw JSON value of [limit].
             *
             * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Double> = limit

            /**
             * Returns the raw JSON value of [withinLimit].
             *
             * Unlike [withinLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("within_limit")
            @ExcludeMissing
            fun _withinLimit(): JsonField<Boolean> = withinLimit

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
                 * .count()
                 * .limit()
                 * .withinLimit()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Mastodon]. */
            class Builder internal constructor() {

                private var count: JsonField<Double>? = null
                private var limit: JsonField<Double>? = null
                private var withinLimit: JsonField<Boolean>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(mastodon: Mastodon) = apply {
                    count = mastodon.count
                    limit = mastodon.limit
                    withinLimit = mastodon.withinLimit
                    additionalProperties = mastodon.additionalProperties.toMutableMap()
                }

                /** Character count for this platform */
                fun count(count: Double) = count(JsonField.of(count))

                /**
                 * Sets [Builder.count] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.count] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun count(count: JsonField<Double>) = apply { this.count = count }

                /** Character limit for this platform */
                fun limit(limit: Double) = limit(JsonField.of(limit))

                /**
                 * Sets [Builder.limit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.limit] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun limit(limit: JsonField<Double>) = apply { this.limit = limit }

                /** Whether content is within limit */
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
                 * .count()
                 * .limit()
                 * .withinLimit()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Mastodon =
                    Mastodon(
                        checkRequired("count", count),
                        checkRequired("limit", limit),
                        checkRequired("withinLimit", withinLimit),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Mastodon = apply {
                if (validated) {
                    return@apply
                }

                count()
                limit()
                withinLimit()
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
                (if (count.asKnown().isPresent) 1 else 0) +
                    (if (limit.asKnown().isPresent) 1 else 0) +
                    (if (withinLimit.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Mastodon &&
                    count == other.count &&
                    limit == other.limit &&
                    withinLimit == other.withinLimit &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(count, limit, withinLimit, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Mastodon{count=$count, limit=$limit, withinLimit=$withinLimit, additionalProperties=$additionalProperties}"
        }

        class Pinterest
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val count: JsonField<Double>,
            private val limit: JsonField<Double>,
            private val withinLimit: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("count") @ExcludeMissing count: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("limit") @ExcludeMissing limit: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("within_limit")
                @ExcludeMissing
                withinLimit: JsonField<Boolean> = JsonMissing.of(),
            ) : this(count, limit, withinLimit, mutableMapOf())

            /**
             * Character count for this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun count(): Double = count.getRequired("count")

            /**
             * Character limit for this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun limit(): Double = limit.getRequired("limit")

            /**
             * Whether content is within limit
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun withinLimit(): Boolean = withinLimit.getRequired("within_limit")

            /**
             * Returns the raw JSON value of [count].
             *
             * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Double> = count

            /**
             * Returns the raw JSON value of [limit].
             *
             * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Double> = limit

            /**
             * Returns the raw JSON value of [withinLimit].
             *
             * Unlike [withinLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("within_limit")
            @ExcludeMissing
            fun _withinLimit(): JsonField<Boolean> = withinLimit

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
                 * .count()
                 * .limit()
                 * .withinLimit()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Pinterest]. */
            class Builder internal constructor() {

                private var count: JsonField<Double>? = null
                private var limit: JsonField<Double>? = null
                private var withinLimit: JsonField<Boolean>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(pinterest: Pinterest) = apply {
                    count = pinterest.count
                    limit = pinterest.limit
                    withinLimit = pinterest.withinLimit
                    additionalProperties = pinterest.additionalProperties.toMutableMap()
                }

                /** Character count for this platform */
                fun count(count: Double) = count(JsonField.of(count))

                /**
                 * Sets [Builder.count] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.count] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun count(count: JsonField<Double>) = apply { this.count = count }

                /** Character limit for this platform */
                fun limit(limit: Double) = limit(JsonField.of(limit))

                /**
                 * Sets [Builder.limit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.limit] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun limit(limit: JsonField<Double>) = apply { this.limit = limit }

                /** Whether content is within limit */
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
                 * .count()
                 * .limit()
                 * .withinLimit()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Pinterest =
                    Pinterest(
                        checkRequired("count", count),
                        checkRequired("limit", limit),
                        checkRequired("withinLimit", withinLimit),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Pinterest = apply {
                if (validated) {
                    return@apply
                }

                count()
                limit()
                withinLimit()
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
                (if (count.asKnown().isPresent) 1 else 0) +
                    (if (limit.asKnown().isPresent) 1 else 0) +
                    (if (withinLimit.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Pinterest &&
                    count == other.count &&
                    limit == other.limit &&
                    withinLimit == other.withinLimit &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(count, limit, withinLimit, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Pinterest{count=$count, limit=$limit, withinLimit=$withinLimit, additionalProperties=$additionalProperties}"
        }

        class Reddit
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val count: JsonField<Double>,
            private val limit: JsonField<Double>,
            private val withinLimit: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("count") @ExcludeMissing count: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("limit") @ExcludeMissing limit: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("within_limit")
                @ExcludeMissing
                withinLimit: JsonField<Boolean> = JsonMissing.of(),
            ) : this(count, limit, withinLimit, mutableMapOf())

            /**
             * Character count for this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun count(): Double = count.getRequired("count")

            /**
             * Character limit for this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun limit(): Double = limit.getRequired("limit")

            /**
             * Whether content is within limit
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun withinLimit(): Boolean = withinLimit.getRequired("within_limit")

            /**
             * Returns the raw JSON value of [count].
             *
             * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Double> = count

            /**
             * Returns the raw JSON value of [limit].
             *
             * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Double> = limit

            /**
             * Returns the raw JSON value of [withinLimit].
             *
             * Unlike [withinLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("within_limit")
            @ExcludeMissing
            fun _withinLimit(): JsonField<Boolean> = withinLimit

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
                 * .count()
                 * .limit()
                 * .withinLimit()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Reddit]. */
            class Builder internal constructor() {

                private var count: JsonField<Double>? = null
                private var limit: JsonField<Double>? = null
                private var withinLimit: JsonField<Boolean>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(reddit: Reddit) = apply {
                    count = reddit.count
                    limit = reddit.limit
                    withinLimit = reddit.withinLimit
                    additionalProperties = reddit.additionalProperties.toMutableMap()
                }

                /** Character count for this platform */
                fun count(count: Double) = count(JsonField.of(count))

                /**
                 * Sets [Builder.count] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.count] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun count(count: JsonField<Double>) = apply { this.count = count }

                /** Character limit for this platform */
                fun limit(limit: Double) = limit(JsonField.of(limit))

                /**
                 * Sets [Builder.limit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.limit] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun limit(limit: JsonField<Double>) = apply { this.limit = limit }

                /** Whether content is within limit */
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
                 * .count()
                 * .limit()
                 * .withinLimit()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Reddit =
                    Reddit(
                        checkRequired("count", count),
                        checkRequired("limit", limit),
                        checkRequired("withinLimit", withinLimit),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Reddit = apply {
                if (validated) {
                    return@apply
                }

                count()
                limit()
                withinLimit()
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
                (if (count.asKnown().isPresent) 1 else 0) +
                    (if (limit.asKnown().isPresent) 1 else 0) +
                    (if (withinLimit.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Reddit &&
                    count == other.count &&
                    limit == other.limit &&
                    withinLimit == other.withinLimit &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(count, limit, withinLimit, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Reddit{count=$count, limit=$limit, withinLimit=$withinLimit, additionalProperties=$additionalProperties}"
        }

        class Sms
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val count: JsonField<Double>,
            private val limit: JsonField<Double>,
            private val withinLimit: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("count") @ExcludeMissing count: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("limit") @ExcludeMissing limit: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("within_limit")
                @ExcludeMissing
                withinLimit: JsonField<Boolean> = JsonMissing.of(),
            ) : this(count, limit, withinLimit, mutableMapOf())

            /**
             * Character count for this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun count(): Double = count.getRequired("count")

            /**
             * Character limit for this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun limit(): Double = limit.getRequired("limit")

            /**
             * Whether content is within limit
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun withinLimit(): Boolean = withinLimit.getRequired("within_limit")

            /**
             * Returns the raw JSON value of [count].
             *
             * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Double> = count

            /**
             * Returns the raw JSON value of [limit].
             *
             * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Double> = limit

            /**
             * Returns the raw JSON value of [withinLimit].
             *
             * Unlike [withinLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("within_limit")
            @ExcludeMissing
            fun _withinLimit(): JsonField<Boolean> = withinLimit

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
                 * .count()
                 * .limit()
                 * .withinLimit()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Sms]. */
            class Builder internal constructor() {

                private var count: JsonField<Double>? = null
                private var limit: JsonField<Double>? = null
                private var withinLimit: JsonField<Boolean>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(sms: Sms) = apply {
                    count = sms.count
                    limit = sms.limit
                    withinLimit = sms.withinLimit
                    additionalProperties = sms.additionalProperties.toMutableMap()
                }

                /** Character count for this platform */
                fun count(count: Double) = count(JsonField.of(count))

                /**
                 * Sets [Builder.count] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.count] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun count(count: JsonField<Double>) = apply { this.count = count }

                /** Character limit for this platform */
                fun limit(limit: Double) = limit(JsonField.of(limit))

                /**
                 * Sets [Builder.limit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.limit] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun limit(limit: JsonField<Double>) = apply { this.limit = limit }

                /** Whether content is within limit */
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
                 * .count()
                 * .limit()
                 * .withinLimit()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Sms =
                    Sms(
                        checkRequired("count", count),
                        checkRequired("limit", limit),
                        checkRequired("withinLimit", withinLimit),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Sms = apply {
                if (validated) {
                    return@apply
                }

                count()
                limit()
                withinLimit()
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
                (if (count.asKnown().isPresent) 1 else 0) +
                    (if (limit.asKnown().isPresent) 1 else 0) +
                    (if (withinLimit.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Sms &&
                    count == other.count &&
                    limit == other.limit &&
                    withinLimit == other.withinLimit &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(count, limit, withinLimit, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Sms{count=$count, limit=$limit, withinLimit=$withinLimit, additionalProperties=$additionalProperties}"
        }

        class Snapchat
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val count: JsonField<Double>,
            private val limit: JsonField<Double>,
            private val withinLimit: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("count") @ExcludeMissing count: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("limit") @ExcludeMissing limit: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("within_limit")
                @ExcludeMissing
                withinLimit: JsonField<Boolean> = JsonMissing.of(),
            ) : this(count, limit, withinLimit, mutableMapOf())

            /**
             * Character count for this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun count(): Double = count.getRequired("count")

            /**
             * Character limit for this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun limit(): Double = limit.getRequired("limit")

            /**
             * Whether content is within limit
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun withinLimit(): Boolean = withinLimit.getRequired("within_limit")

            /**
             * Returns the raw JSON value of [count].
             *
             * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Double> = count

            /**
             * Returns the raw JSON value of [limit].
             *
             * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Double> = limit

            /**
             * Returns the raw JSON value of [withinLimit].
             *
             * Unlike [withinLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("within_limit")
            @ExcludeMissing
            fun _withinLimit(): JsonField<Boolean> = withinLimit

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
                 * .count()
                 * .limit()
                 * .withinLimit()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Snapchat]. */
            class Builder internal constructor() {

                private var count: JsonField<Double>? = null
                private var limit: JsonField<Double>? = null
                private var withinLimit: JsonField<Boolean>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(snapchat: Snapchat) = apply {
                    count = snapchat.count
                    limit = snapchat.limit
                    withinLimit = snapchat.withinLimit
                    additionalProperties = snapchat.additionalProperties.toMutableMap()
                }

                /** Character count for this platform */
                fun count(count: Double) = count(JsonField.of(count))

                /**
                 * Sets [Builder.count] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.count] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun count(count: JsonField<Double>) = apply { this.count = count }

                /** Character limit for this platform */
                fun limit(limit: Double) = limit(JsonField.of(limit))

                /**
                 * Sets [Builder.limit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.limit] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun limit(limit: JsonField<Double>) = apply { this.limit = limit }

                /** Whether content is within limit */
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
                 * .count()
                 * .limit()
                 * .withinLimit()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Snapchat =
                    Snapchat(
                        checkRequired("count", count),
                        checkRequired("limit", limit),
                        checkRequired("withinLimit", withinLimit),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Snapchat = apply {
                if (validated) {
                    return@apply
                }

                count()
                limit()
                withinLimit()
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
                (if (count.asKnown().isPresent) 1 else 0) +
                    (if (limit.asKnown().isPresent) 1 else 0) +
                    (if (withinLimit.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Snapchat &&
                    count == other.count &&
                    limit == other.limit &&
                    withinLimit == other.withinLimit &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(count, limit, withinLimit, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Snapchat{count=$count, limit=$limit, withinLimit=$withinLimit, additionalProperties=$additionalProperties}"
        }

        class Telegram
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val count: JsonField<Double>,
            private val limit: JsonField<Double>,
            private val withinLimit: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("count") @ExcludeMissing count: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("limit") @ExcludeMissing limit: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("within_limit")
                @ExcludeMissing
                withinLimit: JsonField<Boolean> = JsonMissing.of(),
            ) : this(count, limit, withinLimit, mutableMapOf())

            /**
             * Character count for this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun count(): Double = count.getRequired("count")

            /**
             * Character limit for this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun limit(): Double = limit.getRequired("limit")

            /**
             * Whether content is within limit
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun withinLimit(): Boolean = withinLimit.getRequired("within_limit")

            /**
             * Returns the raw JSON value of [count].
             *
             * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Double> = count

            /**
             * Returns the raw JSON value of [limit].
             *
             * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Double> = limit

            /**
             * Returns the raw JSON value of [withinLimit].
             *
             * Unlike [withinLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("within_limit")
            @ExcludeMissing
            fun _withinLimit(): JsonField<Boolean> = withinLimit

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
                 * .count()
                 * .limit()
                 * .withinLimit()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Telegram]. */
            class Builder internal constructor() {

                private var count: JsonField<Double>? = null
                private var limit: JsonField<Double>? = null
                private var withinLimit: JsonField<Boolean>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(telegram: Telegram) = apply {
                    count = telegram.count
                    limit = telegram.limit
                    withinLimit = telegram.withinLimit
                    additionalProperties = telegram.additionalProperties.toMutableMap()
                }

                /** Character count for this platform */
                fun count(count: Double) = count(JsonField.of(count))

                /**
                 * Sets [Builder.count] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.count] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun count(count: JsonField<Double>) = apply { this.count = count }

                /** Character limit for this platform */
                fun limit(limit: Double) = limit(JsonField.of(limit))

                /**
                 * Sets [Builder.limit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.limit] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun limit(limit: JsonField<Double>) = apply { this.limit = limit }

                /** Whether content is within limit */
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
                 * .count()
                 * .limit()
                 * .withinLimit()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Telegram =
                    Telegram(
                        checkRequired("count", count),
                        checkRequired("limit", limit),
                        checkRequired("withinLimit", withinLimit),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Telegram = apply {
                if (validated) {
                    return@apply
                }

                count()
                limit()
                withinLimit()
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
                (if (count.asKnown().isPresent) 1 else 0) +
                    (if (limit.asKnown().isPresent) 1 else 0) +
                    (if (withinLimit.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Telegram &&
                    count == other.count &&
                    limit == other.limit &&
                    withinLimit == other.withinLimit &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(count, limit, withinLimit, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Telegram{count=$count, limit=$limit, withinLimit=$withinLimit, additionalProperties=$additionalProperties}"
        }

        class Threads
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val count: JsonField<Double>,
            private val limit: JsonField<Double>,
            private val withinLimit: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("count") @ExcludeMissing count: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("limit") @ExcludeMissing limit: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("within_limit")
                @ExcludeMissing
                withinLimit: JsonField<Boolean> = JsonMissing.of(),
            ) : this(count, limit, withinLimit, mutableMapOf())

            /**
             * Character count for this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun count(): Double = count.getRequired("count")

            /**
             * Character limit for this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun limit(): Double = limit.getRequired("limit")

            /**
             * Whether content is within limit
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun withinLimit(): Boolean = withinLimit.getRequired("within_limit")

            /**
             * Returns the raw JSON value of [count].
             *
             * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Double> = count

            /**
             * Returns the raw JSON value of [limit].
             *
             * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Double> = limit

            /**
             * Returns the raw JSON value of [withinLimit].
             *
             * Unlike [withinLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("within_limit")
            @ExcludeMissing
            fun _withinLimit(): JsonField<Boolean> = withinLimit

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
                 * .count()
                 * .limit()
                 * .withinLimit()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Threads]. */
            class Builder internal constructor() {

                private var count: JsonField<Double>? = null
                private var limit: JsonField<Double>? = null
                private var withinLimit: JsonField<Boolean>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(threads: Threads) = apply {
                    count = threads.count
                    limit = threads.limit
                    withinLimit = threads.withinLimit
                    additionalProperties = threads.additionalProperties.toMutableMap()
                }

                /** Character count for this platform */
                fun count(count: Double) = count(JsonField.of(count))

                /**
                 * Sets [Builder.count] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.count] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun count(count: JsonField<Double>) = apply { this.count = count }

                /** Character limit for this platform */
                fun limit(limit: Double) = limit(JsonField.of(limit))

                /**
                 * Sets [Builder.limit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.limit] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun limit(limit: JsonField<Double>) = apply { this.limit = limit }

                /** Whether content is within limit */
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
                 * .count()
                 * .limit()
                 * .withinLimit()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Threads =
                    Threads(
                        checkRequired("count", count),
                        checkRequired("limit", limit),
                        checkRequired("withinLimit", withinLimit),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Threads = apply {
                if (validated) {
                    return@apply
                }

                count()
                limit()
                withinLimit()
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
                (if (count.asKnown().isPresent) 1 else 0) +
                    (if (limit.asKnown().isPresent) 1 else 0) +
                    (if (withinLimit.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Threads &&
                    count == other.count &&
                    limit == other.limit &&
                    withinLimit == other.withinLimit &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(count, limit, withinLimit, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Threads{count=$count, limit=$limit, withinLimit=$withinLimit, additionalProperties=$additionalProperties}"
        }

        class Tiktok
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val count: JsonField<Double>,
            private val limit: JsonField<Double>,
            private val withinLimit: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("count") @ExcludeMissing count: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("limit") @ExcludeMissing limit: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("within_limit")
                @ExcludeMissing
                withinLimit: JsonField<Boolean> = JsonMissing.of(),
            ) : this(count, limit, withinLimit, mutableMapOf())

            /**
             * Character count for this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun count(): Double = count.getRequired("count")

            /**
             * Character limit for this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun limit(): Double = limit.getRequired("limit")

            /**
             * Whether content is within limit
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun withinLimit(): Boolean = withinLimit.getRequired("within_limit")

            /**
             * Returns the raw JSON value of [count].
             *
             * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Double> = count

            /**
             * Returns the raw JSON value of [limit].
             *
             * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Double> = limit

            /**
             * Returns the raw JSON value of [withinLimit].
             *
             * Unlike [withinLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("within_limit")
            @ExcludeMissing
            fun _withinLimit(): JsonField<Boolean> = withinLimit

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
                 * .count()
                 * .limit()
                 * .withinLimit()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Tiktok]. */
            class Builder internal constructor() {

                private var count: JsonField<Double>? = null
                private var limit: JsonField<Double>? = null
                private var withinLimit: JsonField<Boolean>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(tiktok: Tiktok) = apply {
                    count = tiktok.count
                    limit = tiktok.limit
                    withinLimit = tiktok.withinLimit
                    additionalProperties = tiktok.additionalProperties.toMutableMap()
                }

                /** Character count for this platform */
                fun count(count: Double) = count(JsonField.of(count))

                /**
                 * Sets [Builder.count] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.count] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun count(count: JsonField<Double>) = apply { this.count = count }

                /** Character limit for this platform */
                fun limit(limit: Double) = limit(JsonField.of(limit))

                /**
                 * Sets [Builder.limit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.limit] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun limit(limit: JsonField<Double>) = apply { this.limit = limit }

                /** Whether content is within limit */
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
                 * .count()
                 * .limit()
                 * .withinLimit()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Tiktok =
                    Tiktok(
                        checkRequired("count", count),
                        checkRequired("limit", limit),
                        checkRequired("withinLimit", withinLimit),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Tiktok = apply {
                if (validated) {
                    return@apply
                }

                count()
                limit()
                withinLimit()
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
                (if (count.asKnown().isPresent) 1 else 0) +
                    (if (limit.asKnown().isPresent) 1 else 0) +
                    (if (withinLimit.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Tiktok &&
                    count == other.count &&
                    limit == other.limit &&
                    withinLimit == other.withinLimit &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(count, limit, withinLimit, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Tiktok{count=$count, limit=$limit, withinLimit=$withinLimit, additionalProperties=$additionalProperties}"
        }

        class Twitter
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val count: JsonField<Double>,
            private val limit: JsonField<Double>,
            private val withinLimit: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("count") @ExcludeMissing count: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("limit") @ExcludeMissing limit: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("within_limit")
                @ExcludeMissing
                withinLimit: JsonField<Boolean> = JsonMissing.of(),
            ) : this(count, limit, withinLimit, mutableMapOf())

            /**
             * Character count for this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun count(): Double = count.getRequired("count")

            /**
             * Character limit for this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun limit(): Double = limit.getRequired("limit")

            /**
             * Whether content is within limit
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun withinLimit(): Boolean = withinLimit.getRequired("within_limit")

            /**
             * Returns the raw JSON value of [count].
             *
             * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Double> = count

            /**
             * Returns the raw JSON value of [limit].
             *
             * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Double> = limit

            /**
             * Returns the raw JSON value of [withinLimit].
             *
             * Unlike [withinLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("within_limit")
            @ExcludeMissing
            fun _withinLimit(): JsonField<Boolean> = withinLimit

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
                 * .count()
                 * .limit()
                 * .withinLimit()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Twitter]. */
            class Builder internal constructor() {

                private var count: JsonField<Double>? = null
                private var limit: JsonField<Double>? = null
                private var withinLimit: JsonField<Boolean>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(twitter: Twitter) = apply {
                    count = twitter.count
                    limit = twitter.limit
                    withinLimit = twitter.withinLimit
                    additionalProperties = twitter.additionalProperties.toMutableMap()
                }

                /** Character count for this platform */
                fun count(count: Double) = count(JsonField.of(count))

                /**
                 * Sets [Builder.count] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.count] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun count(count: JsonField<Double>) = apply { this.count = count }

                /** Character limit for this platform */
                fun limit(limit: Double) = limit(JsonField.of(limit))

                /**
                 * Sets [Builder.limit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.limit] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun limit(limit: JsonField<Double>) = apply { this.limit = limit }

                /** Whether content is within limit */
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
                 * .count()
                 * .limit()
                 * .withinLimit()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Twitter =
                    Twitter(
                        checkRequired("count", count),
                        checkRequired("limit", limit),
                        checkRequired("withinLimit", withinLimit),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Twitter = apply {
                if (validated) {
                    return@apply
                }

                count()
                limit()
                withinLimit()
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
                (if (count.asKnown().isPresent) 1 else 0) +
                    (if (limit.asKnown().isPresent) 1 else 0) +
                    (if (withinLimit.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Twitter &&
                    count == other.count &&
                    limit == other.limit &&
                    withinLimit == other.withinLimit &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(count, limit, withinLimit, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Twitter{count=$count, limit=$limit, withinLimit=$withinLimit, additionalProperties=$additionalProperties}"
        }

        class Whatsapp
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val count: JsonField<Double>,
            private val limit: JsonField<Double>,
            private val withinLimit: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("count") @ExcludeMissing count: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("limit") @ExcludeMissing limit: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("within_limit")
                @ExcludeMissing
                withinLimit: JsonField<Boolean> = JsonMissing.of(),
            ) : this(count, limit, withinLimit, mutableMapOf())

            /**
             * Character count for this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun count(): Double = count.getRequired("count")

            /**
             * Character limit for this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun limit(): Double = limit.getRequired("limit")

            /**
             * Whether content is within limit
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun withinLimit(): Boolean = withinLimit.getRequired("within_limit")

            /**
             * Returns the raw JSON value of [count].
             *
             * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Double> = count

            /**
             * Returns the raw JSON value of [limit].
             *
             * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Double> = limit

            /**
             * Returns the raw JSON value of [withinLimit].
             *
             * Unlike [withinLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("within_limit")
            @ExcludeMissing
            fun _withinLimit(): JsonField<Boolean> = withinLimit

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
                 * .count()
                 * .limit()
                 * .withinLimit()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Whatsapp]. */
            class Builder internal constructor() {

                private var count: JsonField<Double>? = null
                private var limit: JsonField<Double>? = null
                private var withinLimit: JsonField<Boolean>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(whatsapp: Whatsapp) = apply {
                    count = whatsapp.count
                    limit = whatsapp.limit
                    withinLimit = whatsapp.withinLimit
                    additionalProperties = whatsapp.additionalProperties.toMutableMap()
                }

                /** Character count for this platform */
                fun count(count: Double) = count(JsonField.of(count))

                /**
                 * Sets [Builder.count] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.count] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun count(count: JsonField<Double>) = apply { this.count = count }

                /** Character limit for this platform */
                fun limit(limit: Double) = limit(JsonField.of(limit))

                /**
                 * Sets [Builder.limit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.limit] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun limit(limit: JsonField<Double>) = apply { this.limit = limit }

                /** Whether content is within limit */
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
                 * .count()
                 * .limit()
                 * .withinLimit()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Whatsapp =
                    Whatsapp(
                        checkRequired("count", count),
                        checkRequired("limit", limit),
                        checkRequired("withinLimit", withinLimit),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Whatsapp = apply {
                if (validated) {
                    return@apply
                }

                count()
                limit()
                withinLimit()
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
                (if (count.asKnown().isPresent) 1 else 0) +
                    (if (limit.asKnown().isPresent) 1 else 0) +
                    (if (withinLimit.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Whatsapp &&
                    count == other.count &&
                    limit == other.limit &&
                    withinLimit == other.withinLimit &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(count, limit, withinLimit, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Whatsapp{count=$count, limit=$limit, withinLimit=$withinLimit, additionalProperties=$additionalProperties}"
        }

        class Youtube
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val count: JsonField<Double>,
            private val limit: JsonField<Double>,
            private val withinLimit: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("count") @ExcludeMissing count: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("limit") @ExcludeMissing limit: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("within_limit")
                @ExcludeMissing
                withinLimit: JsonField<Boolean> = JsonMissing.of(),
            ) : this(count, limit, withinLimit, mutableMapOf())

            /**
             * Character count for this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun count(): Double = count.getRequired("count")

            /**
             * Character limit for this platform
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun limit(): Double = limit.getRequired("limit")

            /**
             * Whether content is within limit
             *
             * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun withinLimit(): Boolean = withinLimit.getRequired("within_limit")

            /**
             * Returns the raw JSON value of [count].
             *
             * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Double> = count

            /**
             * Returns the raw JSON value of [limit].
             *
             * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Double> = limit

            /**
             * Returns the raw JSON value of [withinLimit].
             *
             * Unlike [withinLimit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("within_limit")
            @ExcludeMissing
            fun _withinLimit(): JsonField<Boolean> = withinLimit

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
                 * .count()
                 * .limit()
                 * .withinLimit()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Youtube]. */
            class Builder internal constructor() {

                private var count: JsonField<Double>? = null
                private var limit: JsonField<Double>? = null
                private var withinLimit: JsonField<Boolean>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(youtube: Youtube) = apply {
                    count = youtube.count
                    limit = youtube.limit
                    withinLimit = youtube.withinLimit
                    additionalProperties = youtube.additionalProperties.toMutableMap()
                }

                /** Character count for this platform */
                fun count(count: Double) = count(JsonField.of(count))

                /**
                 * Sets [Builder.count] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.count] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun count(count: JsonField<Double>) = apply { this.count = count }

                /** Character limit for this platform */
                fun limit(limit: Double) = limit(JsonField.of(limit))

                /**
                 * Sets [Builder.limit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.limit] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun limit(limit: JsonField<Double>) = apply { this.limit = limit }

                /** Whether content is within limit */
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
                 * .count()
                 * .limit()
                 * .withinLimit()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Youtube =
                    Youtube(
                        checkRequired("count", count),
                        checkRequired("limit", limit),
                        checkRequired("withinLimit", withinLimit),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Youtube = apply {
                if (validated) {
                    return@apply
                }

                count()
                limit()
                withinLimit()
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
                (if (count.asKnown().isPresent) 1 else 0) +
                    (if (limit.asKnown().isPresent) 1 else 0) +
                    (if (withinLimit.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Youtube &&
                    count == other.count &&
                    limit == other.limit &&
                    withinLimit == other.withinLimit &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(count, limit, withinLimit, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Youtube{count=$count, limit=$limit, withinLimit=$withinLimit, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Platforms &&
                beehiiv == other.beehiiv &&
                bluesky == other.bluesky &&
                convertkit == other.convertkit &&
                discord == other.discord &&
                facebook == other.facebook &&
                googlebusiness == other.googlebusiness &&
                instagram == other.instagram &&
                linkedin == other.linkedin &&
                listmonk == other.listmonk &&
                mailchimp == other.mailchimp &&
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
                beehiiv,
                bluesky,
                convertkit,
                discord,
                facebook,
                googlebusiness,
                instagram,
                linkedin,
                listmonk,
                mailchimp,
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
            "Platforms{beehiiv=$beehiiv, bluesky=$bluesky, convertkit=$convertkit, discord=$discord, facebook=$facebook, googlebusiness=$googlebusiness, instagram=$instagram, linkedin=$linkedin, listmonk=$listmonk, mailchimp=$mailchimp, mastodon=$mastodon, pinterest=$pinterest, reddit=$reddit, sms=$sms, snapchat=$snapchat, telegram=$telegram, threads=$threads, tiktok=$tiktok, twitter=$twitter, whatsapp=$whatsapp, youtube=$youtube, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ValidateCheckPostLengthResponse &&
            platforms == other.platforms &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(platforms, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ValidateCheckPostLengthResponse{platforms=$platforms, additionalProperties=$additionalProperties}"
}
