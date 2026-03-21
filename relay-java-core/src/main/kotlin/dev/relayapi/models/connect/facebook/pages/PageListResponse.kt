// File generated from our OpenAPI spec by Stainless.

package dev.relayapi.models.connect.facebook.pages

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.relayapi.core.ExcludeMissing
import dev.relayapi.core.JsonField
import dev.relayapi.core.JsonMissing
import dev.relayapi.core.JsonValue
import dev.relayapi.core.checkKnown
import dev.relayapi.core.checkRequired
import dev.relayapi.core.toImmutable
import dev.relayapi.errors.RelayInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PageListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val pages: JsonField<List<Page>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("pages") @ExcludeMissing pages: JsonField<List<Page>> = JsonMissing.of()
    ) : this(pages, mutableMapOf())

    /**
     * @throws RelayInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pages(): List<Page> = pages.getRequired("pages")

    /**
     * Returns the raw JSON value of [pages].
     *
     * Unlike [pages], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pages") @ExcludeMissing fun _pages(): JsonField<List<Page>> = pages

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
         * Returns a mutable builder for constructing an instance of [PageListResponse].
         *
         * The following fields are required:
         * ```java
         * .pages()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PageListResponse]. */
    class Builder internal constructor() {

        private var pages: JsonField<MutableList<Page>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(pageListResponse: PageListResponse) = apply {
            pages = pageListResponse.pages.map { it.toMutableList() }
            additionalProperties = pageListResponse.additionalProperties.toMutableMap()
        }

        fun pages(pages: List<Page>) = pages(JsonField.of(pages))

        /**
         * Sets [Builder.pages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pages] with a well-typed `List<Page>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pages(pages: JsonField<List<Page>>) = apply {
            this.pages = pages.map { it.toMutableList() }
        }

        /**
         * Adds a single [Page] to [pages].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPage(page: Page) = apply {
            pages =
                (pages ?: JsonField.of(mutableListOf())).also { checkKnown("pages", it).add(page) }
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
         * Returns an immutable instance of [PageListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .pages()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PageListResponse =
            PageListResponse(
                checkRequired("pages", pages).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PageListResponse = apply {
        if (validated) {
            return@apply
        }

        pages().forEach { it.validate() }
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
        (pages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Page
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val name: JsonField<String>,
        private val category: JsonField<String>,
        private val pictureUrl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("category")
            @ExcludeMissing
            category: JsonField<String> = JsonMissing.of(),
            @JsonProperty("picture_url")
            @ExcludeMissing
            pictureUrl: JsonField<String> = JsonMissing.of(),
        ) : this(id, name, category, pictureUrl, mutableMapOf())

        /**
         * Facebook page ID
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Page name
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Page category
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun category(): Optional<String> = category.getOptional("category")

        /**
         * Page profile picture URL
         *
         * @throws RelayInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pictureUrl(): Optional<String> = pictureUrl.getOptional("picture_url")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [category].
         *
         * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<String> = category

        /**
         * Returns the raw JSON value of [pictureUrl].
         *
         * Unlike [pictureUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("picture_url")
        @ExcludeMissing
        fun _pictureUrl(): JsonField<String> = pictureUrl

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
             * Returns a mutable builder for constructing an instance of [Page].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Page]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var category: JsonField<String> = JsonMissing.of()
            private var pictureUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Page) = apply {
                id = page.id
                name = page.name
                category = page.category
                pictureUrl = page.pictureUrl
                additionalProperties = page.additionalProperties.toMutableMap()
            }

            /** Facebook page ID */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Page name */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Page category */
            fun category(category: String?) = category(JsonField.ofNullable(category))

            /** Alias for calling [Builder.category] with `category.orElse(null)`. */
            fun category(category: Optional<String>) = category(category.getOrNull())

            /**
             * Sets [Builder.category] to an arbitrary JSON value.
             *
             * You should usually call [Builder.category] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun category(category: JsonField<String>) = apply { this.category = category }

            /** Page profile picture URL */
            fun pictureUrl(pictureUrl: String?) = pictureUrl(JsonField.ofNullable(pictureUrl))

            /** Alias for calling [Builder.pictureUrl] with `pictureUrl.orElse(null)`. */
            fun pictureUrl(pictureUrl: Optional<String>) = pictureUrl(pictureUrl.getOrNull())

            /**
             * Sets [Builder.pictureUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pictureUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pictureUrl(pictureUrl: JsonField<String>) = apply { this.pictureUrl = pictureUrl }

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
             * Returns an immutable instance of [Page].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Page =
                Page(
                    checkRequired("id", id),
                    checkRequired("name", name),
                    category,
                    pictureUrl,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Page = apply {
            if (validated) {
                return@apply
            }

            id()
            name()
            category()
            pictureUrl()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (category.asKnown().isPresent) 1 else 0) +
                (if (pictureUrl.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Page &&
                id == other.id &&
                name == other.name &&
                category == other.category &&
                pictureUrl == other.pictureUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, name, category, pictureUrl, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Page{id=$id, name=$name, category=$category, pictureUrl=$pictureUrl, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PageListResponse &&
            pages == other.pages &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(pages, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PageListResponse{pages=$pages, additionalProperties=$additionalProperties}"
}
