// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.twitter.retweet

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

class RetweetCreateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val success: JsonField<Boolean>,
    private val data: JsonField<Data>,
    private val error: JsonField<Error>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("success") @ExcludeMissing success: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
        @JsonProperty("error") @ExcludeMissing error: JsonField<Error> = JsonMissing.of(),
    ) : this(success, data, error, mutableMapOf())

    /**
     * Whether the action succeeded
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun success(): Boolean = success.getRequired("success")

    /**
     * Action result data from Twitter API
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<Data> = data.getOptional("data")

    /**
     * Error details when success is false
     *
     * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun error(): Optional<Error> = error.getOptional("error")

    /**
     * Returns the raw JSON value of [success].
     *
     * Unlike [success], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("success") @ExcludeMissing fun _success(): JsonField<Boolean> = success

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

    /**
     * Returns the raw JSON value of [error].
     *
     * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<Error> = error

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
         * Returns a mutable builder for constructing an instance of [RetweetCreateResponse].
         *
         * The following fields are required:
         * ```java
         * .success()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RetweetCreateResponse]. */
    class Builder internal constructor() {

        private var success: JsonField<Boolean>? = null
        private var data: JsonField<Data> = JsonMissing.of()
        private var error: JsonField<Error> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(retweetCreateResponse: RetweetCreateResponse) = apply {
            success = retweetCreateResponse.success
            data = retweetCreateResponse.data
            error = retweetCreateResponse.error
            additionalProperties = retweetCreateResponse.additionalProperties.toMutableMap()
        }

        /** Whether the action succeeded */
        fun success(success: Boolean) = success(JsonField.of(success))

        /**
         * Sets [Builder.success] to an arbitrary JSON value.
         *
         * You should usually call [Builder.success] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun success(success: JsonField<Boolean>) = apply { this.success = success }

        /** Action result data from Twitter API */
        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

        /** Error details when success is false */
        fun error(error: Error) = error(JsonField.of(error))

        /**
         * Sets [Builder.error] to an arbitrary JSON value.
         *
         * You should usually call [Builder.error] with a well-typed [Error] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun error(error: JsonField<Error>) = apply { this.error = error }

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
         * Returns an immutable instance of [RetweetCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .success()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RetweetCreateResponse =
            RetweetCreateResponse(
                checkRequired("success", success),
                data,
                error,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RetweetCreateResponse = apply {
        if (validated) {
            return@apply
        }

        success()
        data().ifPresent { it.validate() }
        error().ifPresent { it.validate() }
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
        (if (success.asKnown().isPresent) 1 else 0) +
            (data.asKnown().getOrNull()?.validity() ?: 0) +
            (error.asKnown().getOrNull()?.validity() ?: 0)

    /** Action result data from Twitter API */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val bookmarked: JsonField<Boolean>,
        private val following: JsonField<Boolean>,
        private val pendingFollow: JsonField<Boolean>,
        private val retweeted: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("bookmarked")
            @ExcludeMissing
            bookmarked: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("following")
            @ExcludeMissing
            following: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("pending_follow")
            @ExcludeMissing
            pendingFollow: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("retweeted")
            @ExcludeMissing
            retweeted: JsonField<Boolean> = JsonMissing.of(),
        ) : this(bookmarked, following, pendingFollow, retweeted, mutableMapOf())

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun bookmarked(): Optional<Boolean> = bookmarked.getOptional("bookmarked")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun following(): Optional<Boolean> = following.getOptional("following")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pendingFollow(): Optional<Boolean> = pendingFollow.getOptional("pending_follow")

        /**
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun retweeted(): Optional<Boolean> = retweeted.getOptional("retweeted")

        /**
         * Returns the raw JSON value of [bookmarked].
         *
         * Unlike [bookmarked], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bookmarked")
        @ExcludeMissing
        fun _bookmarked(): JsonField<Boolean> = bookmarked

        /**
         * Returns the raw JSON value of [following].
         *
         * Unlike [following], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("following") @ExcludeMissing fun _following(): JsonField<Boolean> = following

        /**
         * Returns the raw JSON value of [pendingFollow].
         *
         * Unlike [pendingFollow], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("pending_follow")
        @ExcludeMissing
        fun _pendingFollow(): JsonField<Boolean> = pendingFollow

        /**
         * Returns the raw JSON value of [retweeted].
         *
         * Unlike [retweeted], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("retweeted") @ExcludeMissing fun _retweeted(): JsonField<Boolean> = retweeted

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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var bookmarked: JsonField<Boolean> = JsonMissing.of()
            private var following: JsonField<Boolean> = JsonMissing.of()
            private var pendingFollow: JsonField<Boolean> = JsonMissing.of()
            private var retweeted: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                bookmarked = data.bookmarked
                following = data.following
                pendingFollow = data.pendingFollow
                retweeted = data.retweeted
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun bookmarked(bookmarked: Boolean) = bookmarked(JsonField.of(bookmarked))

            /**
             * Sets [Builder.bookmarked] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bookmarked] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bookmarked(bookmarked: JsonField<Boolean>) = apply { this.bookmarked = bookmarked }

            fun following(following: Boolean) = following(JsonField.of(following))

            /**
             * Sets [Builder.following] to an arbitrary JSON value.
             *
             * You should usually call [Builder.following] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun following(following: JsonField<Boolean>) = apply { this.following = following }

            fun pendingFollow(pendingFollow: Boolean) = pendingFollow(JsonField.of(pendingFollow))

            /**
             * Sets [Builder.pendingFollow] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pendingFollow] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pendingFollow(pendingFollow: JsonField<Boolean>) = apply {
                this.pendingFollow = pendingFollow
            }

            fun retweeted(retweeted: Boolean) = retweeted(JsonField.of(retweeted))

            /**
             * Sets [Builder.retweeted] to an arbitrary JSON value.
             *
             * You should usually call [Builder.retweeted] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun retweeted(retweeted: JsonField<Boolean>) = apply { this.retweeted = retweeted }

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
             */
            fun build(): Data =
                Data(
                    bookmarked,
                    following,
                    pendingFollow,
                    retweeted,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            bookmarked()
            following()
            pendingFollow()
            retweeted()
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
            (if (bookmarked.asKnown().isPresent) 1 else 0) +
                (if (following.asKnown().isPresent) 1 else 0) +
                (if (pendingFollow.asKnown().isPresent) 1 else 0) +
                (if (retweeted.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                bookmarked == other.bookmarked &&
                following == other.following &&
                pendingFollow == other.pendingFollow &&
                retweeted == other.retweeted &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(bookmarked, following, pendingFollow, retweeted, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{bookmarked=$bookmarked, following=$following, pendingFollow=$pendingFollow, retweeted=$retweeted, additionalProperties=$additionalProperties}"
    }

    /** Error details when success is false */
    class Error
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val code: JsonField<String>,
        private val message: JsonField<String>,
        private val twitterErrorCode: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
            @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
            @JsonProperty("twitter_error_code")
            @ExcludeMissing
            twitterErrorCode: JsonField<Double> = JsonMissing.of(),
        ) : this(code, message, twitterErrorCode, mutableMapOf())

        /**
         * Error code (e.g. ACCOUNT_NOT_FOUND, TOKEN_MISSING, TWITTER_API_ERROR)
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun code(): String = code.getRequired("code")

        /**
         * Human-readable error message
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun message(): String = message.getRequired("message")

        /**
         * Twitter API error code if available
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun twitterErrorCode(): Optional<Double> =
            twitterErrorCode.getOptional("twitter_error_code")

        /**
         * Returns the raw JSON value of [code].
         *
         * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

        /**
         * Returns the raw JSON value of [message].
         *
         * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

        /**
         * Returns the raw JSON value of [twitterErrorCode].
         *
         * Unlike [twitterErrorCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("twitter_error_code")
        @ExcludeMissing
        fun _twitterErrorCode(): JsonField<Double> = twitterErrorCode

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
             * Returns a mutable builder for constructing an instance of [Error].
             *
             * The following fields are required:
             * ```java
             * .code()
             * .message()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Error]. */
        class Builder internal constructor() {

            private var code: JsonField<String>? = null
            private var message: JsonField<String>? = null
            private var twitterErrorCode: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(error: Error) = apply {
                code = error.code
                message = error.message
                twitterErrorCode = error.twitterErrorCode
                additionalProperties = error.additionalProperties.toMutableMap()
            }

            /** Error code (e.g. ACCOUNT_NOT_FOUND, TOKEN_MISSING, TWITTER_API_ERROR) */
            fun code(code: String) = code(JsonField.of(code))

            /**
             * Sets [Builder.code] to an arbitrary JSON value.
             *
             * You should usually call [Builder.code] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun code(code: JsonField<String>) = apply { this.code = code }

            /** Human-readable error message */
            fun message(message: String) = message(JsonField.of(message))

            /**
             * Sets [Builder.message] to an arbitrary JSON value.
             *
             * You should usually call [Builder.message] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun message(message: JsonField<String>) = apply { this.message = message }

            /** Twitter API error code if available */
            fun twitterErrorCode(twitterErrorCode: Double) =
                twitterErrorCode(JsonField.of(twitterErrorCode))

            /**
             * Sets [Builder.twitterErrorCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.twitterErrorCode] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun twitterErrorCode(twitterErrorCode: JsonField<Double>) = apply {
                this.twitterErrorCode = twitterErrorCode
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
             * Returns an immutable instance of [Error].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .code()
             * .message()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Error =
                Error(
                    checkRequired("code", code),
                    checkRequired("message", message),
                    twitterErrorCode,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Error = apply {
            if (validated) {
                return@apply
            }

            code()
            message()
            twitterErrorCode()
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
            (if (code.asKnown().isPresent) 1 else 0) +
                (if (message.asKnown().isPresent) 1 else 0) +
                (if (twitterErrorCode.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Error &&
                code == other.code &&
                message == other.message &&
                twitterErrorCode == other.twitterErrorCode &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(code, message, twitterErrorCode, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Error{code=$code, message=$message, twitterErrorCode=$twitterErrorCode, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RetweetCreateResponse &&
            success == other.success &&
            data == other.data &&
            error == other.error &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(success, data, error, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RetweetCreateResponse{success=$success, data=$data, error=$error, additionalProperties=$additionalProperties}"
}
