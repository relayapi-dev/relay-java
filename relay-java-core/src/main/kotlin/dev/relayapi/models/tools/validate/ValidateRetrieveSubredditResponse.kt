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

class ValidateRetrieveSubredditResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val exists: JsonField<Boolean>,
    private val name: JsonField<String>,
    private val nsfw: JsonField<Boolean>,
    private val postTypes: JsonField<PostTypes>,
    private val subscribers: JsonField<Double>,
    private val title: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("exists") @ExcludeMissing exists: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("nsfw") @ExcludeMissing nsfw: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("post_types")
        @ExcludeMissing
        postTypes: JsonField<PostTypes> = JsonMissing.of(),
        @JsonProperty("subscribers")
        @ExcludeMissing
        subscribers: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
    ) : this(exists, name, nsfw, postTypes, subscribers, title, mutableMapOf())

    /**
     * Whether the subreddit exists
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun exists(): Boolean = exists.getRequired("exists")

    /**
     * Canonical subreddit name
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Whether NSFW
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nsfw(): Optional<Boolean> = nsfw.getOptional("nsfw")

    /**
     * Allowed post types
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun postTypes(): Optional<PostTypes> = postTypes.getOptional("post_types")

    /**
     * Subscriber count
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subscribers(): Optional<Double> = subscribers.getOptional("subscribers")

    /**
     * Subreddit title
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun title(): Optional<String> = title.getOptional("title")

    /**
     * Returns the raw JSON value of [exists].
     *
     * Unlike [exists], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("exists") @ExcludeMissing fun _exists(): JsonField<Boolean> = exists

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [nsfw].
     *
     * Unlike [nsfw], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("nsfw") @ExcludeMissing fun _nsfw(): JsonField<Boolean> = nsfw

    /**
     * Returns the raw JSON value of [postTypes].
     *
     * Unlike [postTypes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("post_types") @ExcludeMissing fun _postTypes(): JsonField<PostTypes> = postTypes

    /**
     * Returns the raw JSON value of [subscribers].
     *
     * Unlike [subscribers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subscribers") @ExcludeMissing fun _subscribers(): JsonField<Double> = subscribers

    /**
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

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
         * [ValidateRetrieveSubredditResponse].
         *
         * The following fields are required:
         * ```java
         * .exists()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ValidateRetrieveSubredditResponse]. */
    class Builder internal constructor() {

        private var exists: JsonField<Boolean>? = null
        private var name: JsonField<String> = JsonMissing.of()
        private var nsfw: JsonField<Boolean> = JsonMissing.of()
        private var postTypes: JsonField<PostTypes> = JsonMissing.of()
        private var subscribers: JsonField<Double> = JsonMissing.of()
        private var title: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(validateRetrieveSubredditResponse: ValidateRetrieveSubredditResponse) =
            apply {
                exists = validateRetrieveSubredditResponse.exists
                name = validateRetrieveSubredditResponse.name
                nsfw = validateRetrieveSubredditResponse.nsfw
                postTypes = validateRetrieveSubredditResponse.postTypes
                subscribers = validateRetrieveSubredditResponse.subscribers
                title = validateRetrieveSubredditResponse.title
                additionalProperties =
                    validateRetrieveSubredditResponse.additionalProperties.toMutableMap()
            }

        /** Whether the subreddit exists */
        fun exists(exists: Boolean) = exists(JsonField.of(exists))

        /**
         * Sets [Builder.exists] to an arbitrary JSON value.
         *
         * You should usually call [Builder.exists] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun exists(exists: JsonField<Boolean>) = apply { this.exists = exists }

        /** Canonical subreddit name */
        fun name(name: String?) = name(JsonField.ofNullable(name))

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Whether NSFW */
        fun nsfw(nsfw: Boolean?) = nsfw(JsonField.ofNullable(nsfw))

        /**
         * Alias for [Builder.nsfw].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun nsfw(nsfw: Boolean) = nsfw(nsfw as Boolean?)

        /** Alias for calling [Builder.nsfw] with `nsfw.orElse(null)`. */
        fun nsfw(nsfw: Optional<Boolean>) = nsfw(nsfw.getOrNull())

        /**
         * Sets [Builder.nsfw] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nsfw] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun nsfw(nsfw: JsonField<Boolean>) = apply { this.nsfw = nsfw }

        /** Allowed post types */
        fun postTypes(postTypes: PostTypes) = postTypes(JsonField.of(postTypes))

        /**
         * Sets [Builder.postTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.postTypes] with a well-typed [PostTypes] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun postTypes(postTypes: JsonField<PostTypes>) = apply { this.postTypes = postTypes }

        /** Subscriber count */
        fun subscribers(subscribers: Double?) = subscribers(JsonField.ofNullable(subscribers))

        /**
         * Alias for [Builder.subscribers].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun subscribers(subscribers: Double) = subscribers(subscribers as Double?)

        /** Alias for calling [Builder.subscribers] with `subscribers.orElse(null)`. */
        fun subscribers(subscribers: Optional<Double>) = subscribers(subscribers.getOrNull())

        /**
         * Sets [Builder.subscribers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscribers] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun subscribers(subscribers: JsonField<Double>) = apply { this.subscribers = subscribers }

        /** Subreddit title */
        fun title(title: String?) = title(JsonField.ofNullable(title))

        /** Alias for calling [Builder.title] with `title.orElse(null)`. */
        fun title(title: Optional<String>) = title(title.getOrNull())

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<String>) = apply { this.title = title }

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
         * Returns an immutable instance of [ValidateRetrieveSubredditResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .exists()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ValidateRetrieveSubredditResponse =
            ValidateRetrieveSubredditResponse(
                checkRequired("exists", exists),
                name,
                nsfw,
                postTypes,
                subscribers,
                title,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ValidateRetrieveSubredditResponse = apply {
        if (validated) {
            return@apply
        }

        exists()
        name()
        nsfw()
        postTypes().ifPresent { it.validate() }
        subscribers()
        title()
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
        (if (exists.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (nsfw.asKnown().isPresent) 1 else 0) +
            (postTypes.asKnown().getOrNull()?.validity() ?: 0) +
            (if (subscribers.asKnown().isPresent) 1 else 0) +
            (if (title.asKnown().isPresent) 1 else 0)

    /** Allowed post types */
    class PostTypes
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val image: JsonField<Boolean>,
        private val link: JsonField<Boolean>,
        private val self: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("image") @ExcludeMissing image: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("link") @ExcludeMissing link: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("self") @ExcludeMissing self: JsonField<Boolean> = JsonMissing.of(),
        ) : this(image, link, self, mutableMapOf())

        /**
         * Allows image posts
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun image(): Boolean = image.getRequired("image")

        /**
         * Allows link posts
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun link(): Boolean = link.getRequired("link")

        /**
         * Allows text posts
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun self(): Boolean = self.getRequired("self")

        /**
         * Returns the raw JSON value of [image].
         *
         * Unlike [image], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("image") @ExcludeMissing fun _image(): JsonField<Boolean> = image

        /**
         * Returns the raw JSON value of [link].
         *
         * Unlike [link], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("link") @ExcludeMissing fun _link(): JsonField<Boolean> = link

        /**
         * Returns the raw JSON value of [self].
         *
         * Unlike [self], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("self") @ExcludeMissing fun _self(): JsonField<Boolean> = self

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
             * Returns a mutable builder for constructing an instance of [PostTypes].
             *
             * The following fields are required:
             * ```java
             * .image()
             * .link()
             * .self()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PostTypes]. */
        class Builder internal constructor() {

            private var image: JsonField<Boolean>? = null
            private var link: JsonField<Boolean>? = null
            private var self: JsonField<Boolean>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(postTypes: PostTypes) = apply {
                image = postTypes.image
                link = postTypes.link
                self = postTypes.self
                additionalProperties = postTypes.additionalProperties.toMutableMap()
            }

            /** Allows image posts */
            fun image(image: Boolean) = image(JsonField.of(image))

            /**
             * Sets [Builder.image] to an arbitrary JSON value.
             *
             * You should usually call [Builder.image] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun image(image: JsonField<Boolean>) = apply { this.image = image }

            /** Allows link posts */
            fun link(link: Boolean) = link(JsonField.of(link))

            /**
             * Sets [Builder.link] to an arbitrary JSON value.
             *
             * You should usually call [Builder.link] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun link(link: JsonField<Boolean>) = apply { this.link = link }

            /** Allows text posts */
            fun self(self: Boolean) = self(JsonField.of(self))

            /**
             * Sets [Builder.self] to an arbitrary JSON value.
             *
             * You should usually call [Builder.self] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun self(self: JsonField<Boolean>) = apply { this.self = self }

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
             * Returns an immutable instance of [PostTypes].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .image()
             * .link()
             * .self()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PostTypes =
                PostTypes(
                    checkRequired("image", image),
                    checkRequired("link", link),
                    checkRequired("self", self),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PostTypes = apply {
            if (validated) {
                return@apply
            }

            image()
            link()
            self()
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
            (if (image.asKnown().isPresent) 1 else 0) +
                (if (link.asKnown().isPresent) 1 else 0) +
                (if (self.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PostTypes &&
                image == other.image &&
                link == other.link &&
                self == other.self &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(image, link, self, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PostTypes{image=$image, link=$link, self=$self, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ValidateRetrieveSubredditResponse &&
            exists == other.exists &&
            name == other.name &&
            nsfw == other.nsfw &&
            postTypes == other.postTypes &&
            subscribers == other.subscribers &&
            title == other.title &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(exists, name, nsfw, postTypes, subscribers, title, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ValidateRetrieveSubredditResponse{exists=$exists, name=$name, nsfw=$nsfw, postTypes=$postTypes, subscribers=$subscribers, title=$title, additionalProperties=$additionalProperties}"
}
